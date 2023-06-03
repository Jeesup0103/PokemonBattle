

public class pokemon2 extends MyPokemon {

	public pokemon2(String name) {
        super(name);
    	int health = 50;
        setHealth(health);
        
        Skill skill1 = new Skill("Tackle", 8, 2); 
        Skill skill2 = new Skill("Quick Attack", 10, 3);
        Skill skill3 = new Skill("Bite", 12, 4); 
        Skill skill4 = new Skill("Water Pump", 14, 5);
        Skill[] skills = { skill1, skill2, skill3, skill4 };

        setSkills(skills);
        pokedexID="1";
   	}
}
