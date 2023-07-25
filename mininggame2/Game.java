import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game{
    static private int midtime = 0, mineNum = 0;
    private static ImageIcon face = new ImageIcon(".\\face.jpg");
    private static ImageIcon win = new ImageIcon(".\\win.jpg");
    private static ImageIcon lose = new ImageIcon(".\\lose.jpg");
    static private JButton bt;
    static private JLabel label1,label2;
    static private GamePanel gp;

    Game(){
        JFrame f = new JFrame();
        f.setBounds(500,200,30*30+10,16*30+120);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        label1 = new JLabel("Time:"+midtime);
        label1.setBounds(300,20,120,20);
        f.add(label1);
        label2 = new JLabel("Mine:"+mineNum);
        label2.setBounds(570,20,120,20);
        f.add(label2);
        JButton bt = new JButton();
        bt.setIcon(face);
        bt.setBounds(440,15,30,30);
        bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.dispose();
                midtime = 0;
                new Game();
            }
        });
        f.add(bt);
        /*
        gp = new GamePanel(16,23);
        gp.setBounds(5,60,900,480);
        f.add(gp);
        */
        f.setVisible(true);
        Countdown cd = new Countdown();
        cd.start();
    }

    //countdown
    static class Countdown extends Thread{
        public void run(){
            while(midtime <= 5){
                try{
                    ++midtime;
                    label1.setText("Time:" + midtime);
                    this.sleep(1000);
                }catch(Exception e){
                    System.out.println("Woops, There is a Time Error..");
                    System.out.println(e.toString());
                }
            }
            if(midtime > 5){
                lose();
                this.interrupt();
            }
        }
    }

    public static void main(String[] args) {
        new Game();
    }

    public static void setMineNum(int i){
        mineNum = i;
        label2.setText("Mine:" + mineNum);
    }
    public static void win(){
        bt.setIcon(win);
        int userOption = JOptionPane.showConfirmDialog(null, "Your record is: "+midtime+". Wanna another game?",
        "Congratulation!",JOptionPane.OK_OPTION);
        if(userOption==1){
            new Game();
        }else{
            System.exit(0);
        }
    }
    public static void lose(){
        bt.setIcon(lose);
        int userOption = JOptionPane.showConfirmDialog(null, "You lose. Wanna another game?",
        "Woops",JOptionPane.OK_OPTION);
        if(userOption==1){
            new Game();
            
        }else{
            System.exit(0);
        }
    }
}
