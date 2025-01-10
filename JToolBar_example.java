//The following code creates the tool bar and adds it to a container:
public class ToolBarDemo extends JPanel
implements ActionListener {
    public ToolBarDemo() {
  super(new BorderLayout());
JToolBar toolBar = new JToolBar("Still draggable");
  addButtons(toolBar);
setPreferredSize(new Dimension(450, 130));
    add(toolBar, BorderLayout.PAGE_START);
  add(scrollPane, BorderLayout.CENTER);
}

//Here is the code that creates the buttons and adds them to the tool bar:
protected void addButtons(JToolBar toolBar) {
JButton button = null;
  
//first button
button = makeNavigationButton("Back24", PREVIOUS,
"Back to previous something-or-other",
"Previous");
toolBar.add(button);
//second button
  
button = makeNavigationButton("Up24", UP,
"Up to something-or-other","Up");
toolBar.add(button);
...//similar code for creating and adding the third button...
}
  
protected JButton makeNavigationButton(String imageName,
String actionCommand,
String toolTipText,
String altText) {
//Look for the image.
String imgLocation = "images/"
+ imageName
+ ".gif";
URL imageURL = ToolBarDemo.class.getResource(imgLocation);
  
//Create and initialize the button.
JButton button = new JButton();
button.setActionCommand(actionCommand);
button.setToolTipText(toolTipText);
button.addActionListener(this);
if (imageURL != null) { //image found
button.setIcon(new ImageIcon(imageURL, altText));
} else { //no image found
button.setText(altText);
System.err.println("Resource not found: " + imgLocation);
}
return button;
}

//Because the tool bar can no longer be dragged, it no longer has bumps at its left edge. Here is the code that turns off dragging:
toolBar.setFloatable(false);

//Here is the code that sets rollover mode:
toolBar.setRollover(true);

//Here is the code that adds the new components:
//fourth button
button = new JButton("Another button");
toolBar.add(button);
//fifth component is NOT a button!
JTextField textField = new JTextField("A text field");
toolBar.add(textField);
