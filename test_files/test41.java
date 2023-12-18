import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ColorThread extends Thread{
       JPanel inputPanel;
       Color inputCol;
       Thread wTh;
       public ColorThread(JPanel ip, Color col, Thread th) {
             inputPanel = ip;
             inputCol = col;
             wTh = th;
       }
       public void run() {
            try {
                  if(wTh != null)
                         wTh.join();
                  inputPanel.setBackground(inputCol);
                  sleep(1000);
            }catch(InterruptedException e) {}
      }
}
public class test41 implements ActionListener{
      JFrame frm;
      JPanel inputPanel;
      JButton btnStart;
      test41(){
            frm = new JFrame("Traffic Light");
            frm.setSize(200, 200);
            btnStart = new JButton("Start");
            btnStart.addActionListener(this);
            inputPanel = new JPanel();
            inputPanel.add(btnStart);
            frm.add(inputPanel);
            frm.setVisible(true);
      }
      public void actionPerformed(ActionEvent e) {
            Thread th1 = new ColorThread(inputPanel, Color.red, null);
            Thread th2 = new ColorThread(inputPanel, Color.yellow, th1);
            Thread th3 = new ColorThread(inputPanel, Color.green, th2);
            th1.start();
            th2.start();
            th3.start();
     }
     public static void main(String[] args){
           new test41();
     }
}