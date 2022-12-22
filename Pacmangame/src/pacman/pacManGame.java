package pacman;

import java.util.Scanner;

public class pacManGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
String arr[][] = new String[15][15];
		
		Integer x,y;
		Integer n=2, m=2;
		char move;
		Integer score = 0;
		
		//STORAGE OF THE MAP
		
				for(x=0;x<15;x++) {
					for(y=0;y<15;y++) {
						System.out.print(arr[x][y]="");
					}
				}
				

				//DESINGING THE MAP
				for(x=0;x<15;x++) {
					for(y=0;y<15;y++) {
						//border top and buttom
						if(x==0 || x==14)
						{
							arr[x][y]="#";
						}
						//bordeer left and right
						else if(y==0 || y==14)
						{
							arr[x][y]="#";
						}
						
						else if(x==5 && y>4 && y<10)
						{
							arr[x][y]="#";
						}
						
						else if(x==10 && y>1 && y<10)
						{
							arr[x][y]="#";
						}
						
						else if(x==8 && y>6 && y<14)
						{
							arr[x][y]="#";
						}
						
						else if(y==5 && x>8 && x<14)
						{
							arr[x][y]="#";
						}
						
						else if(y==3 && x>4 && x<9)
						{
							arr[x][y]="#";
						}
						
						
						else{
							arr[12][12]="0";
							arr[x][y]=".";
						}
						}
					
	}
	
	//PRINTING THE MAP
			arr[n][m]="@";
			System.out.println("\tSCORE:" +score);
			for(x=0;x<15;x++) {
				for(y=0;y<15;y++) {
					System.out.print(arr[x][y]+" ");
				}
				System.out.println();
			}
			while(true) {
				System.out.print("\nEnter a move: ");
				move=sc.next().charAt(0);
				
				if (move=='s')
				{
					n++;
					if(n>0) {
						arr[n-1][m]=" ";
					}
				}
				
				if (move=='w')
				{
					n--;
					if(n>0) {
						arr[n+1][m]=" ";
					}
				}
				
				if (move=='a')
				{
					m--;
					if(n>0) {
						arr[n][m+1]=" ";
					}
				}
				
				if (move=='d')
				{
					m++;
					if(n>0) {
						arr[n][m-1]=" ";
					}
				}
				if(arr[n][m]=="0") {
					
					for(int i=0; i<20; i++) {
						System.out.println();
					}
					System.out.println("\nFINISH! ");
					System.out.println("\tSCORE:" +score);
					break;
				}
				if(arr[n][m]=="#") {
					
					for(int i=0; i<20; i++) {
						System.out.println();
					}
					System.out.println("\nGAME OVER! ");
					System.out.println("\tSCORE:" +score);
					
					break;
				}
	}
	}
}
