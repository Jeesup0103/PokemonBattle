import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class EnemyAttackThread implements Runnable {
    private MyPokemon myPokemon;
    private EnemyPokemon enemyPokemon;
    private JProgressBar myHealthBar;
    private JProgressBar enemyHealthBar;
    private JFrame fightFrame;

    public EnemyAttackThread(MyPokemon myPokemon, EnemyPokemon enemyPokemon, JProgressBar myHealthBar, JProgressBar enemyHealthBar, JFrame fightFrame) {
        this.myPokemon = myPokemon;
        this.enemyPokemon = enemyPokemon;
        this.myHealthBar = myHealthBar;
        this.enemyHealthBar = enemyHealthBar;
        this.fightFrame = fightFrame;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted() && enemyPokemon.getHealth() > 0 && myPokemon.getHealth() > 0) {

            // Generate a random delay between 3 and 6 seconds
            int delaySeconds = 3 + (int) (Math.random() * 3);
            try {
                Thread.sleep(delaySeconds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Check if the battle is over
            if (myPokemon.getHealth() <= 0) {
                Gui.endGameLostGui();
                fightFrame.dispose();
                break;
            }
            else if(enemyPokemon.getHealth() <= 0) {
            	break;
            }
            else {
            	// Perform enemy attack logic
                Skill skill = selectBestSkill();
                enemyPokemon.attack(myPokemon, skill.getPower());

                // Update health bars after the attack
                myHealthBar.setValue(myPokemon.getHealth());
                enemyHealthBar.setValue(enemyPokemon.getHealth());
                
                // Check if the battle is over
                if (myPokemon.getHealth() <= 0) {
                    Gui.endGameLostGui();
                    fightFrame.dispose();
                    break;
                }
                else if(enemyPokemon.getHealth() <= 0) {
                	break;
                }
            }
        }
    }

    private Skill selectBestSkill() {
        Skill[] skills = enemyPokemon.getSkills();
        Skill bestSkill = null;
        int highestPower = Integer.MIN_VALUE;

        for (Skill skill : skills) {
            if (!skill.isOnCooldown()) {
                // Update the best skill if the current skill has higher power
                if (skill.getPower() > highestPower) {
                    bestSkill = skill;
                    highestPower = skill.getPower();
                }
            }
        }
        
        return bestSkill;
    }
}
