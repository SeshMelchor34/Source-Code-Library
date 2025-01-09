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
