import java.util.Random;


public class TicTacToe {
    public static void main(String[] args) {
        int[] ran_pos = {0,0,0,0,0,0,0,0,0};
        Random r = new Random();
        String[][] grid = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = " ";
            }
        }
        
        for (int i = 0; i < 9; i++) {
            System.out.println("-------");
            int n = r.nextInt(9);
            while(ran_pos[n]!=0){
                n = r.nextInt(9);
            }
            if(i%2==0){
                Double dn = (double)n;
                grid[(int)Math.floor(dn/3.0)][(int)(dn%3.0)] = "X";
                ran_pos[n] = 1;
            }else{
                Double dn = (double)n;
                grid[(int)Math.floor(dn/3.0)][(int)(dn%3.0)] = "O";
                ran_pos[n] = 2;
            }
            for (int j2 = 0; j2 < 3; j2++) {
                System.out.print("|");
                for (int j3 = 0; j3 < 3; j3++) {
                    System.out.print(grid[j2][j3]+"|");
                }
                System.out.print("\n");
            }
            for (int j = 0; j < 7; j+=3) {
                if(ran_pos[j]!=0 && ran_pos[j]==ran_pos[j+1] && ran_pos[j+1]==ran_pos[j+2]){
                    System.exit(0);
                }
            }
            for (int j = 0; j < 3; j++) {
                if(ran_pos[j]!=0 && ran_pos[j]==ran_pos[j+3] && ran_pos[j+3]==ran_pos[j+6]){
                    System.exit(0);
                }
            }
            if(ran_pos[0]!=0&&ran_pos[4]==ran_pos[0]&&ran_pos[8]==ran_pos[4]){
                System.exit(0);
            }
            if(ran_pos[2]!=0&&ran_pos[4]==ran_pos[2]&&ran_pos[6]==ran_pos[4]){
                System.exit(0);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e){}
        }
    }
}
