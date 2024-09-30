package U2T3_ModifyingObjectState;

public class Monopoly {
    public static void main(String[] args) {
        Game monopoly = new Game("Monopoly", 3);
        System.out.println("This was my Saturday");
        System.out.println("Game name: " + monopoly.getGameName());
        System.out.println("Players: " + monopoly.getPlayers());
        System.out.println("Score: " + monopoly.getScore());

        System.out.println("After 3 hours");
        monopoly.increaseScore(12);
        System.out.println("Score: " + monopoly.getScore());
        System.out.println("Avg score per player: " + monopoly.averageScorePerPlayer());

        System.out.println("After 3 more hours");
        monopoly.increaseScore(6);
        System.out.println("Score: " + monopoly.getScore());
        System.out.println("Avg score per player: " + monopoly.averageScorePerPlayer());
        monopoly.addPlayer();
        System.out.println("Players: " + monopoly.getPlayers());
        System.out.println("I guess someone joined?");

        System.out.println("After another 3 hours");
        monopoly.increaseScore(-2);
        System.out.println("Score: " + monopoly.getScore());
        System.out.println("Avg score per player: " + monopoly.averageScorePerPlayer());
        System.out.println("How did we lose points?");

        System.out.println("Is game over?");
        System.out.println("Of course not, it's monopoly");
    }
}
