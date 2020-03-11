package game;

public class Game {

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 6;
    private Player playerOne;
    private Player playerTwo;
    private String label;
    private int[][] scores;
    private int nbTours;

    public Game(Player playerOne, Player playerTwo, String label, int nbTours) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.label = label;
        this.nbTours = nbTours;
        scores = new int[nbTours][2];
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public static int random(){
        return (int) (MIN_VALUE + (Math.random() * MAX_VALUE));
    }

    public void start() {

        System.out.println("Démarrage de la partie ...");
        System.out.println("Elle se jouera en " + nbTours + " tours.");

        for (int i = 1; i < nbTours; ++i){

            scores[i][0] += scores[i][0] = Game.random();
            scores[i][1] += scores[i][1] = Game.random();
            System.out.printf("Génération pour le tour %d : %s = %d & %s = %d",i,playerOne.getName(),scores[i][0],
                    playerTwo.getName(),scores[i][1]);

        }
    }

    public Player getWinner(){

        if (scores[0][0] > scores[0][1]){
            return playerOne;
        }else{
            return playerTwo;
        }
    }
}
