public class Enemy1 extends EnemyPokemon {
    private int level;

    public Enemy1(String name, int level) {
        super(name);    
        this.level = level;
        int health = 60;
        setHealth(health);

        Skill skill1 = new Skill("Skill 1", 3, 6);
        Skill skill2 = new Skill("Skill 2", 4 ,7);
        Skill skill3 = new Skill("Skill 3", 5, 8);
        Skill skill4 = new Skill("Skill 4", 6, 9);
        Skill[] skills = { skill1, skill2, skill3, skill4 };

        setSkills(skills);
        setInitialSkills(skills);
    }
    

	public static String getPokePic(EnemyPokemon poke) {
        String pokePic = "";
        String[][] pokePicture = new String[3][2];

        pokePicture[0][0] = "pichu.png";
        pokePicture[1][0] = "pikachu.png";
        pokePicture[2][0] = "raichu.png";

        for (int i = 0; i < 3; i++) {
            pokePicture[i][1] = String.valueOf(i); // Assuming levels start from 1
        }

        if (poke instanceof Enemy1) {
            int level = ((Enemy1) poke).getLevel();
            for (int i = 0; i < pokePicture.length; i++) {
                if (pokePicture[i][1].equals(String.valueOf(level))) {
                    pokePic = pokePicture[i][0];
                    break;
                }
            }
        }
        return pokePic;
    }

    @Override
    public void updateName() {
    	int tempLevel = getLevel();
        if (tempLevel == 0) {
            setName("Pichu");
        } else if (tempLevel == 1) {
            setName("Pikachu");
        } else if (tempLevel == 2) {
            setName("Raichu");
        }
    }
}