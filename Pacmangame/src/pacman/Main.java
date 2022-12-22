package pacman;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pacManGame m1 = new pacManGame();
		m1.designMap();
		m1.printMap();
		Move m = new Move();
		m.move();
	}
}
