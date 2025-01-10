//The JTabbedPane object takes care of mouse and keyboard events for you.
  JTabbedPane tabbedPane = new JTabbedPane();
  ImageIcon icon = createImageIcon("images/middle.gif");
  JComponent panel1 = makeTextPanel("Panel #1");
  tabbedPane.addTab("Tab 1", icon, panel1,
    "Does nothing");
tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
JComponent panel2 = makeTextPanel("Panel #2");
    tabbedPane.addTab("Tab 2", icon, panel2,
      "Does twice as much nothing");
tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
JComponent panel3 = makeTextPanel("Panel #3");
    tabbedPane.addTab("Tab 3", icon, panel3,
        "Still does nothing");
tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
JComponent panel4 = makeTextPanel(
"Panel #4 (has a preferred size of 410 x 50).");
    panel4.setPreferredSize(new Dimension(410, 50));
tabbedPane.addTab("Tab 4", icon, panel4,
      "Does nothing at all");
tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
//As the user clicks the button, the actionPerformed method determines the index of the tab it belongs to and removes the corresponding tab.
  public void actionPerformed(ActionEvent e) {
int i = pane.indexOfTabComponent(ButtonTabComponent.this);
if (i != -1) {
pane.remove(i);
  }
}

//The code below, taken from ButtonTabComponent.java, shows how a customized tab component gets a title from an original tabbed pane tab.
JLabel label = new JLabel(title) {
public String getText() {
int i = pane.indexOfTabComponent(ButtonTabComponent.this);
if (i != -1) {
return pane.getTitleAt(i);
  }
return null;
  }
};
