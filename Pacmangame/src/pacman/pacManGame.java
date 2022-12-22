package pacman;

public class pacManGame {
	public static void main(String[] args) {
		
String arr[][] = new String[15][15];
		
		Integer x,y;
		
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
	}
}
