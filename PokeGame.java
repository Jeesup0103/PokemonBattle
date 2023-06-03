import java.util.Random;

public class PokeGame {
    public static MyPokemon[] team = new MyPokemon[3];
    public static MyPokemon myPokemon = null;
    public static EnemyPokemon enemyPokemon; // Change the type to EnemyPokemon

    public static void main(String[] args) {
        team[0] = new pokemon1("Bulbasaur");
        team[1] = new pokemon2("Squirtle");
        team[2] = new pokemon3("Charmander");

        enemyPokemon = new Enemy1("Pichu", 0);

        new Thread(new Gui()).run();
    }
}