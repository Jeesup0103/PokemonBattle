

public class pokemon3 extends MyPokemon {

	public pokemon3(String name) {
        super(name);
    	int health = 50;
        setHealth(health);
        
        Skill skill1 = new Skill("Scratch", 10, 3);
        Skill skill2 = new Skill("Ember", 12, 4);
        Skill skill3 = new Skill("Fire Spin", 14, 5);
        Skill skill4 = new Skill("Flamethrower", 14, 5);
        Skill[] skills = { skill1, skill2, skill3, skill4 };

        setSkills(skills);
        pokedexID="2";
    }
}