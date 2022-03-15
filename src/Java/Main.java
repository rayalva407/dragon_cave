public class Main {

    public static void main(String[] args) {
        Game game = new Game();

        game.title();

        while (game.playing) {

            game.gameScenario();
            game.getUserChoice();

            if (game.playerChoice == 1) {
                game.failure();
            }
            if (game.playerChoice == 2) {
                game.success();
            }
        }
    }
}
