public class test {
    public static int n=0;
    public static void main(String[] args) throws InterruptedException{
        int solution = 2;
        int yeal = 1;
        String[] rollingbar = new String[9];
        rollingbar[4] = "|1-2-3-4[5]6-7-8-9|";
        rollingbar[5] = "|2-3-4-5[6]7-8-9-1|";
        rollingbar[6] = "|3-4-5-6[7]8-9-1-2|";
        rollingbar[7] = "|4-5-6-7[8]9-1-2-3|";
        rollingbar[8] = "|5-6-7-8[9]1-2-3-4|";
        rollingbar[0] = "|6-7-8-9[1]2-3-4-5|";
        rollingbar[1] = "|7-8-9-1[2]3-4-5-6|";
        rollingbar[2] = "|8-9-1-2[3]4-5-6-7|";
        rollingbar[3] = "|9-1-2-3[4]5-6-7-8|";
        boolean status = true;
        int i = 0;
        int run = 0;
        String yealword = "     "+ yeal +"!";
        for (int j = 0; j < 449; j++) {
            run = j%9;
            System.out.print(rollingbar[run]);
            Thread.sleep(1);
            System.out.print("\r");
        }
        while(status){
            run = i%9;
            System.out.print(run);
            System.out.print(rollingbar[run]);
            if(i>solution+22){
                System.out.print(yealword);
                yealword += "     "+ yeal +"!";
            }
            Thread.sleep(Math.min(i*i*2,600));
            if(i>solution+21 && run==solution-1){
                status = false;
                System.out.println("\r"+rollingbar[run]+yealword);
            }
            System.out.print("\r");
            i++;
        }
    }
}
