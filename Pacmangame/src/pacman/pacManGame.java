package pacman;

import java.util.Scanner;

//import pacpac.Helper;

public class pacManGame {
	 private String[][] map;
	  private int x;
	  private int y;
	  private Scanner sc;

	  public pacManGame() {
	    map = new String[h.getMAX()][h.getMAX()];
	    sc = new Scanner(System.in);
	    x = 2;
	    y = 2;
	  }
	  
	  Helper h = new Helper();
	  public void designMap() {
	    for (int i = 0; i < h.getMAX(); i++) {
	      for (int j = 0; j < h.getMAX(); j++) {
	        // border top and bottom
	        if (i == 0 || i == h.getMAX() - 1) {
	          map[i][j] = "#";
	        }
	        // border left and right
	        else if (j == 0 || j == h.getMAX() - 1) {
	          map[i][j] = "#";
	        } else if (i == 5 && j > 4 && j < 10) {
	          map[i][j] = "#";
	        } else if (i == 10 && j > 1 && j < 10) {
	          map[i][j] = "#";
	        } else if (i == 8 && j > 6 && j < h.getMAX() - 1) {
	          map[i][j] = "#";
	        } else if (j == 5 && i > 8 && i < h.getMAX() - 1) {
	          map[i][j] = "#";
	        } else if (j == 3 && i > 4 && i < 9) {
	          map[i][j] = "#";
	        } else if(i == 18 && j >2 && j < 6){
	        	map[i][j] = "#";
	        }else if(j == 18 && i> 2 && i < 7) {
	        	map[i][j] = "#";
	        }else if( i == 14 && j>7 && j<13) {
	        	map[i][j] = "#";
	        }else if(j == 15 && i > 10 && i < 16) {
	        	map[i][j]= "#";
	        }else if(i ==2 && j > 8 && j<16) {
	        	map[i][j] = "#";
	        }else if(i==17 && j > 13 && j <20) {
	        	map[i][j] = "#";
	        }else if(i==21 && j>7 && j<14) {
	        	map[i][j] = "#";
	        }else if(j == 16 && i>18 && i<22) {
	        	map[i][j] = "#";
	        }else if(j==16 && i>16 && i<23) {
	        	map[i][j] = "#";
	        }else if(i == 12 && j >16 && j <22) {
	        	map[i][j] = "#";
	        }else if( j == 9 && i>15 && i<21) {
	        	map[i][j] = "#";
	        }else {
	          map[20][20] = "0";
	          map[i][j] = ".";
	        }
	      }
	    }
	  }

	  public void printMap() {
	    map[x][y] = "@";
	    System.out.println("\tSCORE:" + h.getScore());
	    for (int i = 0; i < h.getMAX(); i++) {
	      for (int j = 0; j < h.getMAX(); j++) {
	        System.out.print(map[i][j] + " ");
	      }
	      System.out.println();
	    }
	  }
}
