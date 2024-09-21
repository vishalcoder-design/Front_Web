import javax.swing.*;
import java.io.*;
public class swing
{
public static void main(String [] args)
{
JFrame f=new JFrame("Swing");
JRadioButton cb=new JRadioButton("java", true);
cb.setBounds(50,40,100,200);
JRadioButton cb1=new JRadioButton("java", true);
cb1.setBounds(10,40,100,200);
f.add(cb1);
f.add(cb);
f.setSize(400,400);
f.setVisible(true);
f.setLayout(null);
}
}
