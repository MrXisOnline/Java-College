import javax.swing.*;
import java.awt.event.*;
public class test42 implements ActionListener{
       JFrame frm;
       JLabel lblCel;
       JTextField txtCel;
       JCheckBox chbFahr, chbKelv;
       JLabel lblMsg;
       test42(){
            frm = new JFrame("Temperature conversion");
            frm.setSize(300, 200);
            lblCel = new JLabel("Celsius");
            txtCel = new JTextField(10);
            chbFahr = new JCheckBox("Fahrenheit");
            chbKelv = new JCheckBox("Kelvin");
            chbFahr.addActionListener(this);
            chbKelv.addActionListener(this);
            lblMsg = new JLabel();

            //add inputPanel, outputPanel and btnPanel to
            //the "North", "Bottom" and "Center" of the JFrame
            //add lblCel and txtCel to inputPanel
            //add lblMsg to outputPanel
            //add chbFahr and chbKelv to btnPanel
             frm.setVisible(true);
     }
     public static void main(String[] args){
          new test42();
     }
    public void actionPerformed(ActionEvent e){
         if(chbFahr.isSelected()){
              double valCels = Double.parseDouble(txtCel.getText());
              int valFahr = (int)(((valCels * 9) / 5) + 32);
              lblMsg.setText(valCels + " Celsius = "+ valFahr + " Fahrenheit");
         }
         if(chbKelv.isSelected()){
             double valCels = Double.parseDouble(txtCel.getText());
             int valKelv = (int)(valCels + 273);
             lblMsg.setText(valCels + " Celsius = "+ valKelv + " Kelvin");
        }
       if(chbFahr.isSelected() && chbKelv.isSelected()){
              lblMsg.setText("Invalid option");
        }
    }
}