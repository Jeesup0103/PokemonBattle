import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Gui extends JComponent implements Runnable{
	
	final static int width = 1100;
	final static int height = 700;
	final static int fontsize = (int)(height/30);
	static Boolean checkRadioBtnInput = null;
	static int gameControl = 0; 

	@Override
	public void run() {
		startMainMenuGui();
	}
	
	public void startMainMenuGui() {	
		
		JFrame fightFrame = new JFrame("Pokemon");
		fightFrame.setBounds(1000, 800, width, height);
		fightFrame.setLocationRelativeTo(null);
		fightFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fightFrame.getContentPane().setLayout(null);
		
		
		JButton btnstart = new JButton("New Fight");
		btnstart.setBounds(700,200, width/4, height/10);
		btnstart.setFont(new Font("inhalt", Font.PLAIN, fontsize+5));
		
		JButton btnend = new JButton("Exit Game");
		btnend.setBounds(700,400, width/4, height/10);
		btnend.setFont(new Font("inhalt", Font.PLAIN, fontsize+5));


		fightFrame.getContentPane().add(btnstart);
		fightFrame.getContentPane().add(btnend);
		
		ImageIcon index = new ImageIcon(getClass().getResource("index.png"));
		JLabel lblIndex = new JLabel(index);
		lblIndex.setBounds(100 , 250, 500, 158);
		fightFrame.getContentPane().add(lblIndex);
		
		fightFrame.setVisible(true);
		
		btnstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				fightFrame.dispose();
				choosePokemonGui();
			}
		});
		
		btnend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				System.exit(0);
			}
		});
	}
	
	
	private void choosePokemonGui() {
		//title
		JFrame fightFrame = new JFrame("Choose Pokemon");
		fightFrame.setBounds(1000, 800, width, height);
		fightFrame.setLocationRelativeTo(null); //override bound settings with relative location
		fightFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fightFrame.getContentPane().setLayout(null);
		fightFrame.setFont(new Font("inhalt", Font.PLAIN, fontsize));
		
		//header
		JLabel header = new JLabel("Choose your Pokemon");
		header.setBounds(360, 0, 360, 50);
		header.setFont(new Font("inhalt", Font.PLAIN, fontsize+ 10));
		fightFrame.getContentPane().add(header);
		
		// Panel for Pokemon 1
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1, 3));
		panel1.setBounds(10, 100, width - 50, height/4);
		fightFrame.getContentPane().add(panel1);

		// Panel for Pokemon 1 button
		JPanel btnPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		btnPanel1.setPreferredSize(new Dimension(panel1.getWidth() / 3, panel1.getHeight()));
		panel1.add(btnPanel1);

		// Pokémon 1 button
		JButton btn1 = new JButton(PokeGame.team[0].getName());
		btn1.setFont(new Font("inhalt", Font.PLAIN, fontsize));
		btn1.setPreferredSize(new Dimension(180, 100)); // Set the preferred size of the button
		btnPanel1.add(btn1);

		// Pokémon 1 picture
		JLabel lblPic1 = new JLabel(new ImageIcon(getClass().getResource(MyPokemon.getPokePic(PokeGame.team[0]))));
		panel1.add(lblPic1);
		lblPic1.setVisible(true);

		// Pokémon 1 skill explanation
		JLabel textArea1 = new JLabel("<html>" + PokeGame.team[0].getSkillInfo().replaceAll("\n", "<br>") + "</html>");
		textArea1.setFont(new Font("inhalt", Font.PLAIN, 16));
		panel1.add(textArea1);

		// Panel for Pokemon 2
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 3));
		panel2.setBounds(10, 300, width - 50, height/4);
		fightFrame.getContentPane().add(panel2);
		
		// Panel for Pokemon 2 button
		JPanel btnPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		btnPanel2.setPreferredSize(new Dimension(panel2.getWidth() / 3, panel2.getHeight()));
		panel2.add(btnPanel2);
		
		// Pokemon 2 button
		JButton btn2 = new JButton(PokeGame.team[1].getName());
		btn2.setFont(new Font("inhalt", Font.PLAIN, fontsize));
		btn2.setPreferredSize(new Dimension(180, 100)); // Set the preferred size of the button
		btnPanel2.add(btn2);

		// Pokemon 2 picture
		JLabel lblPic2 = new JLabel(new ImageIcon(getClass().getResource(MyPokemon.getPokePic(PokeGame.team[1]))));
		panel2.add(lblPic2);
		lblPic2.setVisible(true);

		// Pokemon 2 skill explanation
		JLabel textArea2 = new JLabel("<html>" + PokeGame.team[1].getSkillInfo().replaceAll("\n", "<br>") + "</html>");
		textArea2.setFont(new Font("inhalt", Font.PLAIN, 16));
		panel2.add(textArea2);

		// Panel for Pokemon 3
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1, 3));
		panel3.setBounds(10, 500, width - 50, height/4);
		fightFrame.getContentPane().add(panel3);
		
		// Panel for Pokemon 3 button
		JPanel btnPanel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		btnPanel3.setPreferredSize(new Dimension(panel3.getWidth() / 3, panel2.getHeight()));
		panel3.add(btnPanel3);

		// Pokemon 3 button
		JButton btn3 = new JButton(PokeGame.team[2].getName());
		btn3.setFont(new Font("inhalt", Font.PLAIN, fontsize));
		btn3.setPreferredSize(new Dimension(180, 100)); // Set the preferred size of the button
		btnPanel3.add(btn3);

		// Pokemon 3 picture
		JLabel lblPic3 = new JLabel(new ImageIcon(getClass().getResource(MyPokemon.getPokePic(PokeGame.team[2]))));
		panel3.add(lblPic3);
		lblPic3.setVisible(true);

		// Pokemon 3 skill explanation
		JLabel textArea3 = new JLabel("<html>" + PokeGame.team[2].getSkillInfo().replaceAll("\n", "<br>") + "</html>");
		textArea3.setFont(new Font("inhalt", Font.PLAIN, 16));
		panel3.add(textArea3);


		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent click) {
		        String pokemonName;
		        do {
		            pokemonName = JOptionPane.showInputDialog(fightFrame, "Enter a name for your Pokemon:");
		            if (pokemonName != null && !pokemonName.isEmpty()) {
		                if (pokemonName.length() > 12) {
		                    JOptionPane.showMessageDialog(fightFrame, "Please enter a name with a maximum of 12 letters.", "Invalid Name", JOptionPane.ERROR_MESSAGE);
		                } else {
		                    MyPokemon.getPokePic(PokeGame.myPokemon = PokeGame.team[0]);
		                    PokeGame.myPokemon.setName(pokemonName);
		                    gameControl = 1;
		                    if (gameControl == 1) {
		                        fightFrame.dispose();
		                        startGameGui();
		                    }
		                }
		            }
		        } while (pokemonName != null && (pokemonName.isEmpty() || pokemonName.length() > 12));
		    }
		});
		btn2.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent click) {
		        String pokemonName = JOptionPane.showInputDialog(fightFrame, "Enter a name for your Pokemon:");
		        if (pokemonName != null && !pokemonName.isEmpty()) {
		            if (pokemonName.length() > 12) {
		                JOptionPane.showMessageDialog(fightFrame, "The Pokémon name must be 12 characters or less. Please try again.");
		            } else {
		                MyPokemon.getPokePic(PokeGame.myPokemon = PokeGame.team[1]);
		                PokeGame.myPokemon.setName(pokemonName);
		                gameControl = 1;
		                if (gameControl == 1) {
		                    fightFrame.dispose();
		                    startGameGui();
		                }
		            }
		        }
		    }
		});

		btn3.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent click) {
		        String pokemonName = JOptionPane.showInputDialog(fightFrame, "Enter a name for your Pokemon:");
		        if (pokemonName != null && !pokemonName.isEmpty()) {
		            if (pokemonName.length() > 12) {
		                JOptionPane.showMessageDialog(fightFrame, "The Pokémon name must be 12 characters or less. Please try again.");
		            } else {
		                MyPokemon.getPokePic(PokeGame.myPokemon = PokeGame.team[2]);
		                PokeGame.myPokemon.setName(pokemonName);
		                gameControl = 1;
		                if (gameControl == 1) {
		                    fightFrame.dispose();
		                    startGameGui();
		                }
		            }
		        }
		    }
		});


		fightFrame.setVisible(true);
	}
	

	
	void startGameGui() {

	    JFrame fightFrame = new JFrame("Pokemon Battle");
	    fightFrame.setBounds(1000, 800, width, height);
	    fightFrame.setLocationRelativeTo(null);
	    fightFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    fightFrame.getContentPane().setLayout(null);
	    fightFrame.setFont(new Font("inhalt", Font.PLAIN, fontsize));

	    // My pokemon healthbar, name, image
	    JProgressBar myHealthBar = new JProgressBar();
	    myHealthBar.setForeground(Color.GREEN);
	    myHealthBar.setBounds(550, 350, 199, 20);
	    fightFrame.getContentPane().add(myHealthBar);
	    
	    JLabel myPokemonLabel = new JLabel();
	    myPokemonLabel.setText(PokeGame.myPokemon.getName());
	    myPokemonLabel.setFont(new Font("inhalt", Font.PLAIN, fontsize-2));
	    myPokemonLabel.setBounds(550, 300, 300, 40);
	    fightFrame.getContentPane().add(myPokemonLabel);
	    
	    JLabel myPokemonPicLabel = new JLabel();
	    myPokemonPicLabel.setIcon(new ImageIcon(getClass().getResource(MyPokemon.getPokePic(PokeGame.myPokemon))));
	    myPokemonPicLabel.setBounds(250, 250, 200, 200);
	    fightFrame.getContentPane().add(myPokemonPicLabel);

	    // Enemy pokemon healthbar, name, image
	    JProgressBar enemyHealthBar = new JProgressBar();
	    enemyHealthBar.setForeground(Color.GREEN);
	    enemyHealthBar.setBounds(400, 100, 206, 20);
	    fightFrame.getContentPane().add(enemyHealthBar);

	    JLabel enemyPokemonLabel = new JLabel();
	    enemyPokemonLabel.setText(PokeGame.enemyPokemon.getName());
	    enemyPokemonLabel.setBounds(400, 50, 206, 40);
	    enemyPokemonLabel.setFont(new Font("inhalt", Font.PLAIN, fontsize-2));
	    fightFrame.getContentPane().add(enemyPokemonLabel);
	    
	    JLabel enemyPokemonPicLabel = new JLabel();
	    enemyPokemonPicLabel.setIcon(new ImageIcon(getClass().getResource(((Enemy1)PokeGame.enemyPokemon).getPokePic(PokeGame.enemyPokemon))));
	    enemyPokemonPicLabel.setBounds(800, 20, 200, 200);
	    fightFrame.getContentPane().add(enemyPokemonPicLabel);

	    // Update health bars with initial values
	    myHealthBar.setMaximum(PokeGame.myPokemon.getHealth());
	    myHealthBar.setValue(PokeGame.myPokemon.getHealth());

	    enemyHealthBar.setMaximum(PokeGame.enemyPokemon.getHealth());
	    enemyHealthBar.setValue(PokeGame.enemyPokemon.getHealth());
	    
	    JPanel skillContainerPanel = new JPanel();
	    skillContainerPanel.setLayout(new BoxLayout(skillContainerPanel, BoxLayout.Y_AXIS));
	    skillContainerPanel.setBounds(550, 400, 300, 220);
	    fightFrame.getContentPane().add(skillContainerPanel);

	    // Create a message label
	    JLabel messageLabel = new JLabel("Choose your skill");
	    messageLabel.setFont(new Font("inhalt", Font.PLAIN, fontsize));
	    messageLabel.setBounds(300, 400, 200, 200);
	    fightFrame.add(messageLabel);

	    // Create a skill panel with a grid layout
	    JPanel skillPanel = new JPanel(new GridLayout(2, 2));
	    skillPanel.setPreferredSize(new Dimension(500, 400));
	    
	    EnemyAttackThread controller = new EnemyAttackThread(
	            PokeGame.myPokemon,
	            PokeGame.enemyPokemon,
	            myHealthBar,
	            enemyHealthBar,
	            fightFrame
	            );

        // Start the battle in a separate thread
	    Thread battleThread = new Thread(controller);
        battleThread.start();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Skill skill = PokeGame.myPokemon.getSkills()[i * 2 + j];

                JButton skillButton = new JButton(skill.getName());
                Font buttonFont = new Font(skillButton.getName(), Font.PLAIN, 20);
                skillButton.setFont(buttonFont);
                skillButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	if (skill.isOnCooldown()) {
                            // Skill is on cooldown, display a popup message to the user
                            String message = skill.getName() + " is on cooldown. Please wait " + skill.getLeftCooldown() + " seconds.";
                            JOptionPane.showMessageDialog(null, message, "Cooldown", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }

                        // Access the selected skill
                        Skill selectedSkill = skill;

                        // Perform the action related to the selected skill
                        int power = selectedSkill.getPower();
                        PokeGame.myPokemon.attack(PokeGame.enemyPokemon, power);

                        // Update health bars after the attack
                        myHealthBar.setValue(PokeGame.myPokemon.getHealth());
                        enemyHealthBar.setValue(PokeGame.enemyPokemon.getHealth());

                        // Set the skill on cooldown
                        skill.use();

                        String message = "Attacked enemy with " + skill.getName();
                        JOptionPane.showMessageDialog(null, message, "Attacked!", JOptionPane.INFORMATION_MESSAGE);
                        
                        if(PokeGame.enemyPokemon.getHealth() <= 0) {
                	        // Game is finished, end battle
                            battleThread.interrupt();
                            endGameWinGui();
                		    fightFrame.dispose();
                	    }
                    }
                });
                skillButton.setPreferredSize(new Dimension(140, 50));
                skillPanel.add(skillButton);
            }
        }
	    // Add the skill panel to the skill container panel
	    skillContainerPanel.add(skillPanel);
	    fightFrame.setVisible(true);
	}

	static void endGameLostGui() {
		String message = "You lost the battle!";
	    String[] options = {"Play Again", "Exit"};
	    
	    int choice = JOptionPane.showOptionDialog(
	        null,
	        message,
	        "Lose",
	        JOptionPane.NO_OPTION,
	        JOptionPane.INFORMATION_MESSAGE,
	        null,
	        options,
	        options[0]
	    );
	    
	    if (choice == 0) {
	        GameStateManager.resetGame(); 
	    } else {
	        // Exit option selected
	        System.exit(0); 
	    }
	}
	
	private void endGameWinGui() {
	    String message;
	    String[] options;

	    if (PokeGame.enemyPokemon instanceof Enemy1 && ((Enemy1) PokeGame.enemyPokemon).getLevel() == 2) {
	        message = "<html><span style='font-size:20pt;'>Congratulations! <br/>You have completed the game!</span></html>";
	        options = new String[]{"Play Again", "Exit"};
	    } else {
	        message = "You won the battle!";
	        options = new String[]{"Play Again", "Next Stage", "Exit"};
	    }

	    int choice = JOptionPane.showOptionDialog(
	        null,
	        message,
	        "Win",
	        JOptionPane.NO_OPTION,
	        JOptionPane.INFORMATION_MESSAGE,
	        null,
	        options,
	        options[0]
	    );

	    if (choice == 0) {
	        GameStateManager.resetGame(); // Play again option selected, reset the game
	    } else if (choice == 1 && PokeGame.enemyPokemon instanceof Enemy1 && ((Enemy1) PokeGame.enemyPokemon).getLevel() != 2) {
	        GameStateManager.continueGame(); 
	    } else {
	        // Exit option selected
	        System.exit(0); 
	    }
	}
}
