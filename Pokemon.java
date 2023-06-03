public class Pokemon {
    protected String name;
    protected Skill[] skills;
    protected Skill[] initialSkills;

    protected int hp;

    public void attack(Pokemon target, int attackPower) {
        int targetHp = target.getHealth();
        int power = (int) (Math.random() * 3) + 1 + attackPower;
        target.setHealth(targetHp - power);
    }

    public int getHealth() {
        return hp;
    }

    public void setHealth(int hp) {
        this.hp = hp;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public void setSkills(Skill[] skills) {
        this.skills = skills;
    }
    
    public Skill[] getInitialSkills() {
		return initialSkills;
	}
    
    public void setInitialSkills(Skill[] skills) {
        this.initialSkills = new Skill[skills.length];
    	for (int i = 0; i < skills.length; i++) {
            initialSkills[i] = new Skill(skills[i].getName(), skills[i].getPower(), skills[i].getCooldown());
        }
    }
    
	
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInitialHealth() {
        return 50;
    }
    
    

    public void resetSkillCooldown() {
        for (Skill skill : skills) {
            skill.resetCooldown();
        }
    }


}