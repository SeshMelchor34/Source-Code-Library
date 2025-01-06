 class library {   


/*Example for how to create a button and set an action command for it
   btnClick=newJButton("Send text!");
   btnClick.setActionCommand("english");
   btnItalian=newJButton("Diff text!");
   btnItalian.setActionCommand("italian");
  
   instanceButtonHandler onClick =newButtonHandler();
    btnClick.addActionListener(onClick);
    end of simple buton example 
*/
    
/* Fig. 12.10: ButtonTest.java

Creating JButtons.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonTest extends JFrame {
   private JButton plainButton, fancyButton;

   public ButtonTest()
   {
      super( "Testing Buttons" );

      Container c = getContentPane();
      c.setLayout( new FlowLayout() );

      // create buttons
      plainButton = new JButton( "Plain Button" );
      c.add( plainButton );

      Icon bug1 = new ImageIcon( "bug1.gif" );
      Icon bug2 = new ImageIcon( "bug2.gif" );
      fancyButton = new JButton( "Fancy Button", bug1 );
      fancyButton.setRolloverIcon( bug2 );
      c.add( fancyButton );

      // create an instance of inner class ButtonHandler
      // to use for button event handling 
      ButtonHandler handler = new ButtonHandler();
      fancyButton.addActionListener( handler );
      plainButton.addActionListener( handler );

      setSize( 275, 100 );
      show();
   }

   public static void main( String args[] )
   { 
      ButtonTest app = new ButtonTest();

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            }
         }
      );
   }

   // inner class for button event handling
   private class ButtonHandler implements ActionListener {
      public void actionPerformed( ActionEvent e )
      {
         JOptionPane.showMessageDialog( null,
            "You pressed: " + e.getActionCommand() );
      }
   }
}
 end of button test
*/

/* RadioButtonTest.java
Creating radio buttons using ButtonGroup and JRadioButton.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonTest extends JFrame {
   private JTextField t;
   private Font plainFont, boldFont,
                italicFont, boldItalicFont;
   private JRadioButton plain, bold, italic, boldItalic;
   private ButtonGroup radioGroup;

   public RadioButtonTest()
   {
      super( "RadioButton Test" );

      Container c = getContentPane();
      c.setLayout( new FlowLayout() );

      t = new JTextField( "Watch the font style change", 25 );
      c.add( t ); 

      // Create radio buttons
      plain = new JRadioButton( "Plain", true );
      c.add( plain );
      bold = new JRadioButton( "Bold", false);
      c.add( bold );
      italic = new JRadioButton( "Italic", false );
      c.add( italic );
      boldItalic = new JRadioButton( "Bold/Italic", false );
      c.add( boldItalic );

      // register events
      RadioButtonHandler handler = new RadioButtonHandler();
      plain.addItemListener( handler );
      bold.addItemListener( handler );
      italic.addItemListener( handler );
      boldItalic.addItemListener( handler );

      // create logical relationship between JRadioButtons
      radioGroup = new ButtonGroup();
      radioGroup.add( plain );
      radioGroup.add( bold );
      radioGroup.add( italic );
      radioGroup.add( boldItalic );

      plainFont = new Font( "TimesRoman", Font.PLAIN, 14 );
      boldFont = new Font( "TimesRoman", Font.BOLD, 14 );
      italicFont = new Font( "TimesRoman", Font.ITALIC, 14 );
      boldItalicFont =
         new Font( "TimesRoman", Font.BOLD + Font.ITALIC, 14 );
      t.setFont( plainFont );

      setSize( 300, 100 );
      show();
   }

   public static void main( String args[] )
   {
      RadioButtonTest app = new RadioButtonTest();

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            }
         }
      );
   }

   private class RadioButtonHandler implements ItemListener {
      public void itemStateChanged( ItemEvent e )
      {
         if ( e.getSource() == plain ) 
            t.setFont( plainFont );
         else if ( e.getSource() == bold ) 
            t.setFont( boldFont );
         else if ( e.getSource() == italic ) 
            t.setFont( italicFont );
         else if ( e.getSource() == boldItalic ) 
            t.setFont( boldItalicFont );

         t.repaint();
      }
   }
}
end of radio button test
*/

    
}
