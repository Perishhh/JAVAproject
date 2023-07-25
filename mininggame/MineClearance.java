import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;



public class MineClearance {
    static private int midtime = 0, mineNum = 0;
    private static ImageIcon face = new ImageIcon(".\\face.jpg");
    private static ImageIcon win = new ImageIcon(".\\win.jpg");
    private static ImageIcon lose = new ImageIcon(".\\lose.jpg");
    static private JButton bt;
    static private JLabel label1, label2;
    static private GamePanel gp;

    MineClearance(){
        JFrame f = new JFrame();
        f.setBounds(600,200,500,600);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        label1 = new JLabel("Time:"+ midtime);
        label1.setBounds(10,20,120,20);
        f.add(label1);
        label2 = new JLabel("Remaining:"+mineNum);
        label2.setBounds(400,20,120,20);
        f.add(label2);
        JButton bt = new JButton();
        bt.setIcon(face);
        bt.setBounds(230,15,30,30);
        bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.dispose();
                midtime = 0;
                new MineClearance();
            }
        });
        f.add(bt);
        gp = new GamePanel(16,23);
        gp.setBounds(40,100,800,400);
        f.add(gp);
        f.setVisible(true);
    }

    //countdown
    static class Countdown extends Thread{
        public void run(){
            while(midtime <= 999){
                try{
                    ++midtime;
                    label1.setText("Time:"+midtime);
                    this.sleep(1000);
                }catch(Exception e){
                    System.out.println("Errors:"+e.toString());
                }
            }
            if(midtime >= 999){
                bt.setIcon(lose);
                this.interrupt();
            }

        }
    }

    public static void main(String[] args) {
        new MineClearance();
        Countdown cd = new Countdown();
        cd.start();
    }
    public static void setMineNum(int i){
        mineNum = i;
        label2.setText("Remaining"+mineNum);
    }
    public static void win(){
        bt.setIcon(win);
        JOptionPane.showMessageDialog(null, "Congratulation! Your record is: "+midtime);
    }
    public static void lose(){
        bt.setIcon(lose);
        JOptionPane.showMessageDialog(null, "sad XD");
    }
}


class GamePanel extends JPanel {
    private int rows, cols, bombCount, flagNum;
    private final int BLOCKWIDTH = 20;
    private final int BLOCKHEIGHT = 20;
    private JLabel[][] labels;
    private boolean[][] state;
    private Btn[][] btns;
    private int[][] answers;
    private byte[][] click;
    private static ImageIcon flag = new ImageIcon(".\\flag.jpg");
    private static ImageIcon bomb = new ImageIcon(".\\bomb.jpg");
    private static ImageIcon none = new ImageIcon(".\\none.jpg");


    public GamePanel(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.bombCount = rows*cols /5 + 3;
        this.flagNum = bombCount;
        this.labels = new JLabel[rows][cols];
        this.answers = new int[rows+2][cols+2];
        this.state = new boolean[rows][cols];
        this.btns = new Btn[rows][cols];
        click = new byte[rows][cols];
        MineClearance.setMineNum(flagNum);
        setLayout(null);
        initLabels();
        randomBomb();
        writeNumber();
        randomBtn();
        test();
    }
    private void test(){
        System.out.print("answers:");
        System.out.print("\t\tclick:");
        System.out.println("\t\t");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(answers[i+1][j+1]);
            }
            System.out.print("\t\t");
            for (int j = 0; j < cols; j++) {
                System.out.print(click[i][j]);
            }
            System.out.print("\t\t");
            for (int j = 0; j < cols; j++) {
                if(state[i][j]){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.print("\n");
            System.out.println("state sum");
        }
    }

    private void initLabels(){
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                JLabel l = new JLabel("", JLabel.CENTER);
                l.setBounds(j * BLOCKWIDTH, i * BLOCKHEIGHT, BLOCKWIDTH, BLOCKHEIGHT);
                l.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                l.setOpaque(true);
                l.setBackground(new Color(255,228,181));
                this.add(l);
                labels[i][j] = l;
                labels[i][j].setVisible(false);
            }
        }
    }

    public int[] returnSize(){
        int[] a = {this.cols * BLOCKWIDTH + 20, this.rows * BLOCKHEIGHT +40};
        return a;
    }

    private void randomBomb(){
        for (int i = 0; i < this.bombCount; i++) {
            int position = (int)(Math.random() * this.rows * this.cols);
            int row = position/this.cols;
            int col = position%this.cols;
            if(state[row][col] == true) --i;
            labels[row][col].setIcon(bomb);
            state[row][col] = true;
        }
    }

    private void writeNumber(){
        for (int i = 0; i < rows+2; i++) {
            for (int j = 0; j < cols+2; j++) {
                answers[i][j] = 0;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(state[i][j]){
                    answers[i][j] += 1;
                    answers[i][j+1] += 1;
                    answers[i][j+2] += 1;
                    answers[i+1][j] += 1;
                    answers[i+1][j+2] += 1;
                    answers[i+2][j] += 1;
                    answers[i+2][j+1] += 1;
                    answers[i+2][j+2] += 1;
                }
            }
        } 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {  
                if(!state[i][j]){
                    if(answers[i+1][j+1]>0){
                        click[i][j] = 2;//have number
                        labels[i][j].setText(String.valueOf(answers[i+1][j+1]));
                    }else if (answers[i+1][j+1]==0){
                        click[i][j] = 0;
                        labels[i][j].setIcon(none);
                    }
                }
            }
        }   
    }

    //panel paint
    private void randomBtn(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Btn btn = new Btn();
                btn.i = i;
                btn.j = j;
                btn.setBounds(j*BLOCKWIDTH, i*BLOCKHEIGHT, BLOCKWIDTH,BLOCKHEIGHT);
                this.add(btn);
                btns[i][j] = btn;
                btn.addMouseListener(new MouseInputAdapter() {
                    public void mouseClicked(MouseEvent e){
                        int i = btn.i; int j = btn.j;
                        if(e.getButton() == MouseEvent.BUTTON1) open(btn);
                        if(e.getButton() == MouseEvent.BUTTON3){
                            if(click[i][j]==1){
                                openaround(btn);
                            }else{
                                placeFlag(btn);
                            }
                        };
                    }                  
                }
                );
            }
        }
    }

    //open (can trigger a mine)
    private void open(Btn b){
        //lose
        if(state[b.i][b.j]){
            MineClearance.lose();
        }else{
            subopen(b);
        }
        int Dullgrid = 0;
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                if(click[x][y]==2) Dullgrid+=1;//Unknowns equal to the rest of flag
            }
        }
        if(Dullgrid==flagNum){
            MineClearance.win();
        }
    }
    //subopen (open a series and won't trigger a mine)
    private void subopen(Btn b){
        if(state[b.i][b.j]) return;
        if(click[b.i][b.j] == 1 || click[b.i][b.j] == 3) return;
        if(click[b.i][b.j] == 2){
            b.setOpaque(true);
            labels[b.i][b.j].setVisible(true);
            click[b.i][b.j] = 1;//have opened
            return;
        }
        // find 0 and open more
        b.setOpaque(true);
        labels[b.i][b.j].setVisible(true);
        for(int r = -1;(r+b.i<rows)&&(r<2);r++){
            if(r+b.i<0) continue;
            for (int c = -1;(c+b.j<cols)&&(c<2);c++){
                if(c+b.j<0) continue;
                if(r==0 && c==0) continue;
                Btn newbtn = btns[r+b.i][c+b.j];
                subopen(newbtn);
            }
        }
    }
    //openaround (right button tap to open the button around, a subfunction from subopen)
    private void openaround(Btn b){
        for(int r = -1;(r+b.i<rows)&&(r<2);r++){
            if(r+b.i<0) continue;
            for (int c = -1;(c+b.j<cols)&&(c<2);c++){
                if(c+b.j<0) continue;
                if(r==0 && c==0) continue;
                Btn newbtn = btns[r+b.i][c+b.j];
                subopen(newbtn);
            }
        }
    }
    private void placeFlag(Btn b){
        if(click[b.i][b.j] == 3){
            if(answers[b.i+1][b.j+1]>0) click[b.i][b.j] = 2;
            else click[b.i][b.j] = 0;
            b.setIcon(none);
            ++ flagNum;
            MineClearance.setMineNum(flagNum);
        }else {
            b.setIcon(flag);
            click[b.i][b.j] = 3;
            -- flagNum;
            MineClearance.setMineNum(flagNum);
        }
    }

    public void showBomb(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                btns[i][j].setVisible(false);
                labels[i][j].setVisible(true);
            }
        }
    }
}

class Btn extends JButton{
    public int i,j;
}