
//Here is the code from LayeredPaneDemo.java that creates the layered pane:
  layeredPane = new JLayeredPane();
  layeredPane.setPreferredSize(new Dimension(300, 310));
layeredPane.setBorder(BorderFactory.createTitledBorder(
"Move the Mouse to Move Duke"));
layeredPane.addMouseMotionListener(new MouseMotionAdapter() {
});

//Here is the code from the sample program that adds the colored labels to the layered pane:
for (int i = 0; i < ...number of labels...; i++) {
JLabel label = createColoredLabel(...);
layeredPane.add(label, new Integer(i));
}

//Here is the actionPerformed method of the action listener registered on the combo box:
public void actionPerformed(ActionEvent e) {
int position = onTop.isSelected() ? 0 : 1;
layeredPane.setLayer(dukeLabel,
layerList.getSelectedIndex(),
position);
}

//The following code creates the label that displays Duke's image, and then adds the label to the layered pane.
final ImageIcon icon = createImageIcon("images/dukeWaveRed.gif");
  dukeLabel = new JLabel(icon);
  dukeLabel.setBounds(15, 225,
    icon.getIconWidth(),
    icon.getIconHeight());
  layeredPane.add(dukeLabel, new Integer(2), 0);

//Here's the actionPerformed method for the action listener registered on the check box:
public void actionPerformed(ActionEvent e) {
if (onTop.isSelected())
  layeredPane.moveToFront(dukeLabel);
else
layeredPane.moveToBack(dukeLabel);
  }

//The example uses the setBounds method to set the size and position of each of the labels:
dukeLabel.setBounds(15, 225,
icon.getIconWidth(),
icon.getIconHeight());
label.setBounds(origin.x, origin.y, 140, 140);

//When the user moves the mouse around, the program calls setPosition to change Duke's position:
dukeLabel.setLocation(e.getX()-XFUDGE, e.getY()-YFUDGE);
