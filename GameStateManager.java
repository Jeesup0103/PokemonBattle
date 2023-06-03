public class GameStateManager {

    public static void resetGame() {
        // Reset game state variables
        MyPokemon.resetName();
        PokeGame.myPokemon.setHealth(PokeGame.myPokemon.getInitialHealth());
        PokeGame.myPokemon.resetSkillCooldown();
        PokeGame.enemyPokemon.setLevel(0);
        PokeGame.enemyPokemon.updateName();
        PokeGame.enemyPokemon.resetSkills();
        PokeGame.enemyPokemon.setHealth(PokeGame.enemyPokemon.getInitialHealth());
        PokeGame.enemyPokemon.resetSkillCooldown();
        PokeGame.myPokemon = null;
        Gui gui = new Gui();
        gui.startMainMenuGui();
    }

    public static void continueGame() {
        // Reset game state variables
        PokeGame.myPokemon.setHealth(PokeGame.myPokemon.getInitialHealth());
        PokeGame.myPokemon.resetSkillCooldown();
        PokeGame.enemyPokemon.levelUp();
        PokeGame.enemyPokemon.resetSkillCooldown();
        // Start the battle again with the updated enemy Pokemon level
        Gui gui = new Gui();
        gui.startGameGui();
    }
}
