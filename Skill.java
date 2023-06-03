public class Skill {
    private String name;
    private String description;
    private int power;
    private int cooldown; // Cooldown in seconds
    private long lastUsedTime; // Time when the skill was last used

    public Skill(String name, int power, int cooldown) {
        this.name = name;
        this.power = power;
        this.cooldown = cooldown;
        this.lastUsedTime = 0; // Initialize lastUsedTime to 0
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getCooldown() {
        return cooldown;
    }

    public boolean isOnCooldown() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = (currentTime - lastUsedTime) / 1000; // Convert to seconds
        return elapsedTime < cooldown;
    }
    
    public int getLeftCooldown() {
    	 long currentTime = System.currentTimeMillis();
         long elapsedTime = (currentTime - lastUsedTime) / 1000; // Convert to seconds
         return (int) (cooldown - elapsedTime);
    }

    public void use() {
        lastUsedTime = System.currentTimeMillis();
    }

    public void resetCooldown() {
        lastUsedTime = 0; // Reset the lastUsedTime to 0
    }

	public void setPower(int i) {
		power = i;
	}

	public void setCooldown(int i) {
		cooldown = i;
	}
}
