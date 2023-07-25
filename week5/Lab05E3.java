import java.util.Scanner;
import java.util.Random;
public class Lab05E3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        //set the grid, default value is O.
        System.out.print("Enter the number of rows: ");
        int rows =  kb.nextInt();
        kb.nextLine();
        System.out.print("Enter the number of cols: ");
        int cols =  kb.nextInt();
        String[][] cake = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cake[i][j] = "O";
            }
        }
        //put a poison cake at right-bottom
        int X_cake = rows*cols-1;
        int X_row = (int)Math.floor((double)(X_cake)/(double)cols);
        int X_col = (int)Math.floor((double)(X_cake)%(double)cols);
        cake[X_row][X_col] = "X";
        print(cake);
        //status to control loop; player to identify which turn
        boolean status = true;
        boolean player = true;
        //player1 first
        int playerNum = 1;
        while(status){
            playerNum = 1;
            if(player){
                playerNum = 1;
            }else{
                playerNum = 2;
            }
            //AI player chooses a choice avaiable.
            int choose_cake = r.nextInt(rows*cols);
            int i = (int)Math.floor((double)(choose_cake)/(double)cols);
            int j = (int)Math.floor((double)(choose_cake)%(double)cols);
            int eatenCake = 0;
            for (int m = 0; m < rows; m++) {
                for (int n = 0; n < cols; n++) {
                    if(cake[m][n].equals("1")||cake[m][n].equals("2")){eatenCake++;}
                }
            }
            if(eatenCake >= (rows*cols-(rows-X_row)*(cols-X_col))){
                i = X_row; j = X_col;
            }else{
                while((cake[i][j].equals("1")||cake[i][j].equals("2"))||((i>=X_row)&&(j>=X_col))){ 
                    choose_cake = r.nextInt(rows*cols);
                    i = (int)Math.floor((double)(choose_cake)/(double)cols);
                    j = (int)Math.floor((double)(choose_cake)%(double)cols);
                }
            }

            //time for AI hesitation
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            //eat cake or get poison one
            for (int k = 0; k <= i; k++) {
                for (int k2 = 0; k2 <= j; k2++) {
                    if(cake[k][k2].equals("X")){
                        status = false;
                    }
                    if(!cake[k][k2].equals("1")&&!cake[k][k2].equals("2")){
                        cake[k][k2] = String.valueOf(playerNum);
                    }
                }
            }
            //print what was just happened
            System.out.printf("Player %d's turn:\n",playerNum);
            System.out.printf("Enter the row number: %d\n",i+1);
            System.out.printf("Enter the column number: %d\n",j+1);
            //and how the cake grid is like now
            print(cake);

            //change turn after a normal step
            player = !player; 
        }
        //if someone loses, print congratulation
        if(!status){
            int otherplayer;
            if(playerNum == 1){
                otherplayer = 2;
            }else{
                otherplayer = 1;
            }
            System.out.printf("Game ended! Player %d ate the poison cake! Player %d wins!",playerNum,otherplayer);
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
