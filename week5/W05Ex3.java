import java.util.Scanner;
import java.io.IOException;
public class W05Ex3 {
	public static void main(String[] args) throws IOException {
		
		
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter the number of rows:");
		int rows = Integer.parseInt(keyboard.nextLine());
		
		System.out.print("Enter the number of columns:");
		int columns = Integer.parseInt(keyboard.nextLine());
		
		
		String[][] board = new String[rows][columns];

		boolean gameend = false;
		// put O and X into board, print the board status
		for(int i=0; i<board.length ;i++){
				for (int j=0; j<board[i].length; j++){
					System.out.print("|");
					board[i][j]= "O";
					board[rows-1][columns-1]= "X";
					if (board[i][j] !="X" )
						System.out.print(board[i][j]);
					else
						System.out.print(board[rows-1][columns-1]);
				}
				System.out.print("|");
				System.out.println();
		}
		
			boolean Player1 = false;
			int turn = 1;
			int playernum;
			int other_player;
			
		do{
			
			if (turn%2 ==0){
				System.out.println("Player 2's turn:");
				Player1 = false;
				playernum = 2;
				other_player = 1;
				
			}else{
				System.out.println("Player 1's turn:");
				Player1 = true;
				playernum = 1;
				other_player = 2;
			}

			System.out.print("Enter the number of rows:");
			int rows1 = Integer.parseInt(keyboard.nextLine());
			System.out.print("Enter the number of columns:");
			int columns1 = Integer.parseInt(keyboard.nextLine());
			
			// 设置1和2
			for(int r=0; r<rows1 ;r++){
				for (int c=0; c<columns1; c++){					
					if (Player1){
						if (board[r][c] !="2" ){
							board[r][c]="1";
						}
					}else{
						if (board[r][c] !="1" ){
							board[r][c]="2";
						}
					}
				}
			}
			
			// 打印列表
			for(int i=0; i<board.length ;i++){
				for (int j=0; j<board[i].length; j++){
					System.out.print("|");
					System.out.print(board[i][j]);
				}
				System.out.print("|");
				System.out.println();
			}
			//判断谁赢
			if (board[rows-1][columns-1] != "X"){
				System.out.printf("Game ended! Player %d ate the poison cake! Player %d wins!",playernum,other_player);
				gameend = true;
			}
			
			turn++;
		
		}while(!gameend);	
					
		
	}
}