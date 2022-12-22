package pacman;

import java.util.Scanner;

public class Move {
	Helper h = new Helper();
	 Scanner sc = new Scanner(System.in);
	 map m = new map();
	 Integer x = 2;
	 Integer y = 2;
	 
	 String[][] map = new String[h.getMAX()][h.getMAX()];
	  public void move() {
		while(true) {
	    System.out.print("\nEnter a move: ");
	    char move = sc.next().charAt(0);

	    if (move == 's') {
	      x++;
	      if (x > 0) {
	        map[x - 1][y] = " ";
	      }
	    }

	    if (move == 'w') {
	      x--;
	      if (x > 0) {
	        map[x + 1][y] = " ";
	      }
	    }

	    if (move == 'a') {
	      y--;
	      if (y > 0) {
	        map[x][y + 1] = " ";
	      }
	    }

	    if (move == 'd') {
	      y++;
	      if (y > 0) {
	        map[x][y - 1] = " ";
	      }
	    }
	    m.printMap();
	    if (map[x][y] == "0") {
	      for (int i = 0; i < 20; i++) {
	        System.out.println();
	      }
	      System.out.println("\nFINISH! ");
	      System.out.println("\tSCORE:" + h.getScore());
	      return;
	    }
	    if (map[x][y] == "#") {
	      for (int i = 0; i < 20; i++) {
	        System.out.println();
	      }
	      System.out.println("\nGAME OVER! ");
	      System.out.println("\tSCORE:" + h.getScore());

	      return;
	    }
	    if (map[x][y] == ".") {
	      h.setScore(h.getScore()+1);
	    }
	  }
	  }

}