

public class pokemon1 extends MyPokemon {
	public pokemon1(String name) {
        super(name);
    	int health = 50;
        setHealth(health);

        Skill skill1 = new Skill("Vine Whip", 8, 2); 
        Skill skill2 = new Skill("Razor Leaf", 10, 3); 
        Skill skill3 = new Skill("Bullet Seed", 12, 4);
        Skill skill4 = new Skill("Solar Beam", 14, 5); 
        Skill[] skills = { skill1, skill2, skill3, skill4 };

        setSkills(skills);
        pokedexID="0";
    }
}
