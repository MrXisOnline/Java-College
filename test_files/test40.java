import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonPanel extends JPanel{
      private JButton redButton;
      public ButtonPanel(){
           redButton = new JButton("Red");
           redButton.addActionListener(
                ea -> {setBackground(Color.red);
                repaint();}
           );
           add(redButton);
      }
}
class ButtonFrame extends JFrame implements WindowListener{
      private Container contentPane;
      public ButtonFrame(){
           setTitle("Button Demo");
           setSize(300, 200);
           addWindowListener(this);
           contentPane = this.getContentPane();
           contentPane.add(new ButtonPanel());
      }
      // define seven methods for implementing WindowListener
    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
    }
    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        System.exit(0);
    }
    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowClosed'");
    }
    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
    }
    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowActivated'");
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowDeactivated'");
    }
}
public class test40{
      public static void main(String[] args) {
            EventQueue.invokeLater(
                    () -> {
                        JFrame frame = new ButtonFrame();
                        frame.setVisible(true);
                    }
                    );

       }
}