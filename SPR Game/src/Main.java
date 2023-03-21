import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    public static String choice;
    public static void main(String[] args) {
        JFrame frame=new JFrame("S-P-R");
        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Combobox
        String[] Spr={"Scissor","Paper","Rock"};
        JComboBox comboBox=new JComboBox(Spr);
        comboBox.setBounds(110,100,200,30);
        JButton button=new JButton("USE!!");
        button.setBounds(150,160,100,20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choice=(String) comboBox.getSelectedItem();
                String myMove=choice;
                String comMove=check();
                check(myMove,comMove);
            }
        });

        //adding some Designs
        JLabel imgLabel = new JLabel(new ImageIcon("C:\\Java Programming\\Button response\\src\\SPR.jpg"));
        imgLabel.setBounds(0,0,400,400);
        JLabel label=new JLabel("S-P-R");
        label.setBounds(160,0,100,100);
        label.setFont(new Font("Sherif",Font.BOLD,30));
        JLabel label1=new JLabel("Choose Your Input");
        label1.setBounds(110,35,150,100);

        //adding into frames
        frame.add(comboBox);
        frame.add(button);
        frame.add(label);
        frame.add(label1);
        frame.add(imgLabel);
        frame.setVisible(true);
    }
    public static String check()
    {
        String[] maxMove = {"Scissor", "Paper", "Rock"};
        Random random = new Random();
        int number = random.nextInt(3);
        String ComMove = maxMove[number];
        return ComMove;
    }
    public static void check(String move,String ComMove) {
        if (move.equals(ComMove)) {
            JOptionPane.showMessageDialog(null,"Draw\n Computer Move:"+ComMove);
        } else if (move.equals("Scissor") && ComMove.equals("Paper")) {
            JOptionPane.showMessageDialog(null,"You Win\n Computer Move:"+ComMove);
        } else if (move.equals("Scissor")  && ComMove.equals("Rock")) {
            JOptionPane.showMessageDialog(null,"Computer Win\n Computer Move:"+ComMove);
        } else if (move.equals("Paper")  && ComMove.equals("Rock")) {
            JOptionPane.showMessageDialog(null,"You Win\n Computer Move:"+ComMove);
        } else if (move.equals("Paper") && ComMove.equals("Scissor")) {
            JOptionPane.showMessageDialog(null,"Computer Win\n Computer Move:"+ComMove);
        } else if (move.equals("Rock") && ComMove.equals("Scissor")) {
            JOptionPane.showMessageDialog(null,"You Win\n Computer Move:"+ComMove);
        } else if (move.equals("Rock") && ComMove.equals("Paper")) {
            JOptionPane.showMessageDialog(null,"Computer Win\n Computer Move:"+ComMove);
        }
        else{
            JOptionPane.showMessageDialog(null,"Hello World");
        }
    }
}