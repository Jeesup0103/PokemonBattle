
public class MyPokemon extends Pokemon {
	String pokedexID;
    public MyPokemon(String name) {
        this.name = name;
    }

    public MyPokemon() {
    }

    public static String getPokePic(MyPokemon poke) {
        String pokePic = "";
        String[][] pokePicture = new String[3][2];

        pokePicture[0][0] = "poke1.png";
        pokePicture[1][0] = "poke2.png";
        pokePicture[2][0] = "poke3.png";

        for (int i = 0; i < 3; i++) {
            pokePicture[i][1] = i + "";
        }
        for (int i = 0; i < pokePicture.length; i++) {
            if (poke.pokedexID.equals(pokePicture[i][1])) {
                pokePic = pokePicture[i][0];
                break;
            }
        }
        return pokePic;
    }
    
    public static void resetName() {
		PokeGame.team[0].setName("Bulbasaur");
		PokeGame.team[1].setName("Squirtle");
		PokeGame.team[2].setName("Charmander");
	}
    
    public String getSkillInfo() {
	    Skill[] tempSkills = skills;  // Access the instance-specific skills array
	    StringBuilder sb = new StringBuilder();

	    for (Skill skill : tempSkills) {
	        sb.append("Skill: ").append(skill.getName())
	          .append(", Power: ").append(skill.getPower())
	          .append(", Cooldown: ").append(skill.getCooldown()).append("\n");
	    }
	    return sb.toString();
	}

}