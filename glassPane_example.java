myGlassPane = new MyGlassPane(...);
changeButton.addItemListener(myGlassPane);
frame.setGlassPane(myGlassPane);
class MyGlassPane extends JComponent
implements ItemListener {
...
//React to change button clicks.
public void itemStateChanged(ItemEvent e) {
setVisible(e.getStateChange() == ItemEvent.SELECTED);
  }
}

//In the implementation of the glass pane's mouse listener:
public void mouseMoved(MouseEvent e) {
redispatchMouseEvent(e, false);
}
.../* The mouseDragged, mouseClicked, mouseEntered,
* mouseExited, and mousePressed methods have the same
* implementation as mouseMoved. */...

public void mouseReleased(MouseEvent e) {
redispatchMouseEvent(e, true);
}
private void redispatchMouseEvent(MouseEvent e,
boolean repaint) {

 Point glassPanePoint = e.getPoint();
  Container container = contentPane;
Point containerPoint = SwingUtilities.convertPoint(
    glassPane,
    glassPanePoint,
    contentPane);
if (containerPoint.y < 0) { //we're not in the content pane
  //Could have special code to handle mouse events over
  //the menu bar or non-system window decorations, such as
  //the ones provided by the Java look and feel.
} else {
  //The mouse event is probably over the content pane.
  //Find out exactly which component it's over.
  Component component =
    SwingUtilities.getDeepestComponentAt(
    container,
    containerPoint.x,
    containerPoint.y);
  if ((component != null)
    && (component.equals(liveButton))) {
  //Forward events over the check box.
Point componentPoint = SwingUtilities.convertPoint(
    glassPane,
    glassPanePoint,
    component);
    component.dispatchEvent(new MouseEvent(component,
  e.getID(),
  e.getWhen(),
  e.getModifiers(),
    componentPoint.x,
    componentPoint.y,
  e.getClickCount(),
  e.isPopupTrigger()));
  }
}
  
//Update the glass pane if requested.
    if (repaint) {
  glassPane.setPoint(glassPanePoint);
  glassPane.repaint();
  }
}

//Here is the code in MyGlassPane that implements the painting.
protected void paintComponent(Graphics g) {
  if (point != null) {
    g.setColor(Color.red);
    g.fillOval(point.x - 10, point.y - 10, 20, 20);
  }
}
