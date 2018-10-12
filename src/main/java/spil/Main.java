package spil;


public class Main {
    public static void main(String[] args) {
        Game game = new Game(2);
        GUI gui = new GUI();
        //The game loop. is active as long as no player has won
        do{
            for (Player player : game.players) {
                player.main();

                if (player.GetWon()) {
                    System.out.println(player.NAME + " Won!");
                    return;
                }
            }
        } while (!game.CheckForWin(game.players));
    }

}
