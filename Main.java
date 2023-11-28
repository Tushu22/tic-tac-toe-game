import java.util.*;
public class Main{
    public static void main(String[] args){
        TicTacToe game = new TicTacToe();
        game.initializeGame();
        System.out.println("Game Winner is: " + game.startGame());
    }
}