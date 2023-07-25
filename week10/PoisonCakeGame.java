import java.util.Scanner;
public class PoisonCakeGame {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        //set the grid, default value is O.
        System.out.print("Enter the number of side: ");
        int side =  kb.nextInt();
        kb.nextLine();
        String[][] cake = new String[side][side];
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                cake[i][j] = "O";
            }
        }
        //put a poison cake at right-bottom
        int X_cake = side*side-1;
        int X_row = (int)Math.floor((double)(X_cake)/(double)side);
        int X_col = (int)Math.floor((double)(X_cake)%(double)side);
        cake[X_row][X_col] = "X";
        print(cake);
        //GameStatus to control loop; player to identify which turn
        boolean GameStatus = true;
        boolean player = true;
        //player1 first
        int playerNum = 1;
        //player2 action
        int row = side-2;
        int col = side-2;
        //AI action
        int AI_row, AI_col;
        while(GameStatus){
            playerNum = 1;
            if(player){
                System.out.println("Computer's turn:");
                playerNum = 1;
                //AI player chooses a "smart" choice.
                if(side == 1){
                    //AI bug
                    AI_row = 0;
                    AI_col = 0;
                }else{
                    //AI imitates player
                    AI_row = col;
                    AI_col = row;
                }
                //time for AI hesitation
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {}
                //eat cake or get poison one
                for (int k = 0; k <= AI_row; k++) {
                    for (int k2 = 0; k2 <= AI_col; k2++) {
                        if(cake[k][k2].equals("X")){
                            GameStatus = false;
                        }
                        if(!cake[k][k2].equals("1")&&!cake[k][k2].equals("2")){
                            cake[k][k2] = String.valueOf(playerNum);
                        }
                    }
                }
                //print what was just happened
                System.out.printf("Enter the row number: %d\n",AI_row+1);
                System.out.printf("Enter the column number: %d\n",AI_col+1);    
            }else{
                playerNum = 2;
                System.out.println("Player's turn:");
                boolean firstInputInTurn = true;
                while(!(cake[row][col].equals("O")||cake[row][col].equals("X"))){
                    if(!firstInputInTurn){
                        System.out.println("Invalid step, please enter again");
                    }
                    System.out.print("Enter the row number: ");
                    row = kb.nextInt()-1;
                    kb.nextLine();
                    while(row>side-1||row<0){
                        System.out.print("Invalid row number, enter again: ");
                        row = kb.nextInt()-1;
                        kb.nextLine();
                    }
                    System.out.print("Enter the column number: ");
                    col = kb.nextInt()-1;
                    kb.nextLine();
                    while(col>side-1||col<0){
                        System.out.print("Invalid column number, enter again: ");
                        col = kb.nextInt()-1;
                        kb.nextLine();
                    }
                    firstInputInTurn = false;
                }
                firstInputInTurn = true;
                for (int k = 0; k <= row; k++) {
                    for (int k2 = 0; k2 <= col; k2++) {
                        if(cake[k][k2].equals("X")){
                            GameStatus = false;
                        }
                        if(!cake[k][k2].equals("1")&&!cake[k][k2].equals("2")){
                            cake[k][k2] = String.valueOf(playerNum);
                        }
                    }
                }
            }
            
            //and how the cake grid is like now
            print(cake);

            //change turn after a normal step
            player = !player; 
        }
        //if someone loses, print congratulation
        if(!GameStatus){
            if(playerNum == 1){
                //AI bug
                System.out.println("Game ended! Computer ate the poison cake, you defeat AI!");
            }else{
                System.out.println("Game ended! Player ate the poison cake, computer wins!");
            }
        }
        kb.close();
    }

    public static void print(String[][] cake){
        for (int m = 0; m < cake.length; m++) {
            for (int n = 0; n < cake[0].length; n++) {
                System.out.print("|");
                System.out.print(cake[m][n]);
            }
            System.out.println("|");
        }
    }
}
