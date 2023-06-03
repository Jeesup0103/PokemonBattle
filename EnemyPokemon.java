public abstract class EnemyPokemon extends Pokemon {
    private int level;

    public EnemyPokemon(String name) {
        this.name = name;
    }
    
    @Override
    public int getInitialHealth() {
        return 60; 
    }
    
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        updateHealth();
        updateSkills();
    }

    public void levelUp() {
        level++;
        updateHealth();
        updateSkills();
        updateName();
    }

    public void updateHealth() {
        int health = getInitialHealth() + (level * 10);
        setHealth(health);
    }

    public void updateSkills() {
        Skill[] tempSkills = getSkills();

        for (int i = 0; i < tempSkills.length; i++) {
            Skill skill = tempSkills[i];
            skill.setPower(skill.getPower() + (level * 3));
            skill.setCooldown(skill.getCooldown() - level);
        }

        setSkills(tempSkills);
    }
    
    public void resetSkills() {
        for (int i = 0; i < skills.length; i++) {
            Skill skill = skills[i];
            Skill initialSkill = initialSkills[i];
            skill.setPower(initialSkill.getPower());
            skill.setCooldown(initialSkill.getCooldown());
        }
    }
    public abstract void updateName();

}