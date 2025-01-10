//Create a split pane with the two scroll panes in it.
splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
listScrollPane, pictureScrollPane);
splitPane.setOneTouchExpandable(true);
splitPane.setDividerLocation(150);

//Provide minimum sizes for the two components in the split pane
Dimension minimumSize = new Dimension(100, 50);
listScrollPane.setMinimumSize(minimumSize);
pictureScrollPane.setMinimumSize(minimumSize);

//If you want the user to be able to drag the divider all the way to both sides:
Dimension minimumSize = new Dimension(0, 0);
leftComponent.setMinimumSize(minimumSize);
rightComponent.setMinimumSize(minimumSize);

/*If you want the bottom or right component to stay the same size and the top or left component to
be flexible when the split pane gets bigger, set the resize weight to 1.0. You can do this by invoking
setResizeWeight:*/
splitPane.setResizeWeight(1.0);

/*If you want both halves of the split pane to share in the split pane's extra or removed space, set the
resize weight to 0.5:*/
splitPane.setResizeWeight(0.5);

/*If you want to set the size of contained components to something other than their preferred sizes,
use the setDividerLocation method. For example, to make the left component 150 pixels wide:*/
splitPane.setDividerLocation(150 + splitPane.getInsets().left);
To make the right component 150 pixels wide:
splitPane.setDividerLocation(splitPane.getSize().width
- splitPane.getInsets().right
- splitPane.getDividerSize()
- 150);

/*If the split pane is already visible, you can set the divider location as a percentage of the split pane.
For example, to make 25% of the space go to left/top:*/
splitPane.setDividerLocation(0.25);

//Here is the code that creates the GUI for SplitPaneDividerDemo:
public class SplitPaneDividerDemo extends JPanel ... {
  private JSplitPane splitPane;
public SplitPaneDividerDemo() {
    super(new BorderLayout());
  Font font = new Font("Serif", Font.ITALIC, 24);
  ImageIcon icon = createImageIcon("images/Cat.gif");
SizeDisplayer sd1 = new SizeDisplayer("left", icon);
    sd1.setMinimumSize(new Dimension(30,30));
    sd1.setFont(font);
  icon = createImageIcon("images/Dog.gif");
SizeDisplayer sd2 = new SizeDisplayer("right", icon);
  sd2.setMinimumSize(new Dimension(60,60));
  sd2.setFont(font);
    splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
    sd1, sd2);
  splitPane.setResizeWeight(0.5);
  splitPane.setOneTouchExpandable(true);
  splitPane.setContinuousLayout(true);
    add(splitPane, BorderLayout.CENTER);
    add(createControlPanel(), BorderLayout.PAGE_END);
  }
}
