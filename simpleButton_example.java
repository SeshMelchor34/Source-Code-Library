package button;//required imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class greeting2 {
/**
* Declare objects
*/
static JLabel label;
static JButton btnClick;
static JButton btnItalian;
//method to create GUI
private static void guiApp() {
//Create and set up the window.
JFrame frame = new JFrame("Simple GUI");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//create and st up components
JPanel panel = new JPanel();
label = new JLabel("Text me!");
btnClick = new JButton("Send text!");
btnClick.setActionCommand("english");
btnItalian = new JButton("Diff text!");
btnItalian.setActionCommand("italian");
//create a new ButtonHandler instance
ButtonHandler onClick = new ButtonHandler();
btnClick.addActionListener(onClick);
btnItalian.addActionListener(onClick);
panel.add(btnClick);
panel.add(btnItalian);
panel.add(label);
frame.add(panel);
frame.setSize(250,100);
frame.setVisible(true);
}
//create custom event handler
private static class ButtonHandler implements ActionListener {
public void actionPerformed(ActionEvent e){
//which button?
String command = e.getActionCommand();
//give message
if(command.equals("english")){label.setText("Hello world!");
} else {
label.setText("Ciao!");
   }
  }
}
//main method to run the GUI
public static void main(String[] args) {
javax.swing.SwingUtilities.invokeLater(new Runnable() {
public void run() {
guiApp();
}
});
}
}
