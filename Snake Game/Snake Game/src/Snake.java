 // package snake.game;

import javax.swing.JFrame;

public class Snake extends JFrame {
	
	Snake(){
		super("Snake Game");
		Board b = new Board();
		add(b);
		pack();
		
		setLocationRelativeTo(null);
	//	setTitle("Snake Game");
		setResizable(false);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Snake();
    }
}
