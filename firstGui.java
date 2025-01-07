package firstGuiPackage;
/* Plain and Pine Image Buttons
* 0.1
* Seshat Melchor
* Mr.Mark Di Tommasso
* This progam defines two buttons,one called plain and one called pine image button,these buttons are both interactable*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class firstGuiPgm {
    /**
     * Declare objects
     */
    static JLabel txtFieldlabel;
    static JTextField editabletext1, uneditabletext2;
    static JButton btnPlain;
    static JButton btnImgPine;

    //method to create GUI
    private static void guiApp() {

        //Create and set up the window.
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create and set up components
        JPanel panel = new JPanel();
        txtFieldlabel = new JLabel("Selection Text");
        btnPlain = new JButton("Send text!");
        btnPlain.setActionCommand("Plain");

        Icon pineTreeImage = new ImageIcon ("C:\\\\Users\\\\melchos730\\\\IdeaProjects\\\\firstGui\\\\images\\\\DrawingPineTree.jpg");
        Image pineTreeImg = ((ImageIcon) pineTreeImage).getImage().getScaledInstance(100,130, java.awt.Image.SCALE_SMOOTH);
        pineTreeImage=new ImageIcon(pineTreeImg);
        btnImgPine = new JButton(pineTreeImage);
        //btnImgPine = new JButton("Diff text!");
        btnImgPine.setActionCommand("Fancy");



        //create a new ButtonHandler instance
        ButtonHandler onClick = new ButtonHandler();
        btnPlain.addActionListener(onClick);
        btnImgPine.addActionListener(onClick);

        editabletext1 = new JTextField( "Programmers rock!", 20);
        uneditabletext2 = new JTextField( "Uneditable text field", 15 );
        uneditabletext2.setEditable( false );

        panel.add(btnPlain);
        panel.add(btnImgPine);
        panel.add(txtFieldlabel);
        panel.add(editabletext1);
        panel.add(uneditabletext2);

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
            if(command.equals("Plain")){
                txtFieldlabel.setText("You picked the plain button");
            } else {
                txtFieldlabel.setText("You picked the Fancy Button!");
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
