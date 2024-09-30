package U2T3_ModifyingObjectState;

public class Game {
    private String gameName;
    private int players;
    private int score = 0;

    public Game(String gameName, int players) {
        this.gameName = gameName;
        this.players = players;
    }

    public String getGameName() {
        return gameName;
    }

    public int getPlayers() {
        return players;
    }

    public int getScore() {
        return score;
    }

    public void addPlayer() {
        players ++;
    }

    public void increaseScore(int increase) {
        score += increase;
    }

    public double averageScorePerPlayer() {
        return (double) score / players;
    }

    public boolean isGameOver() {
        if (score > 9) {
            return true;
        } else return false;
    }
}
