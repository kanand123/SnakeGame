import javax.swing.*;

public class SnakeGame extends JFrame {
    Board board;
    SnakeGame() {
        board = new Board();
        add(board);
        pack();  // packs the parent components
        setResizable(false); //when we use pack function we should use this
        setVisible(true);  // get visible to Jframe
    }
    public static void main(String[] args)
    {
        SnakeGame snakeGame = new SnakeGame();

    }

}
