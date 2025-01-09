//In a container that uses a BorderLayout:
 textArea = new JTextArea(5, 30);
   JScrollPane scrollPane = new JScrollPane(textArea);
  setPreferredSize(new Dimension(450, 110));
add(scrollPane, BorderLayout.CENTER);


/*Used for Scroll pane's row and columm headers */
//Where the member variables are defined:
  private Rule columnView;
  private Rule rowView;

  //Where the GUI is initialized:
ImageIcon david = createImageIcon("images/youngdad.jpeg");
  //Create the row and column headers.
    columnView = new Rule(Rule.HORIZONTAL, true);
    rowView = new Rule(Rule.VERTICAL, true);
  pictureScrollPane.setColumnHeaderView(columnView);
  pictureScrollPane.setRowHeaderView(rowView);

//The ScrollDemo program establishes the scroll pane's client when creating the scroll pane:
//Where the member variables are declared:
  private ScrollablePicture picture;
//Where the GUI is created:
  picture = new ScrollablePicture( ... );
  JScrollPane pictureScrollPane = new JScrollPane(picture);

//Constructors to set the policies for the scroll pane
JScrollPane(Component, int, int)
JScrollPane(int, int)

 //Create the corners.
JPanel buttonCorner = new JPanel(); //use FlowLayout
isMetric = new JToggleButton("cm", true);
isMetric.setFont(new Font("SansSerif", Font.PLAIN, 11));
isMetric.setMargin(new Insets(2,2,2,2));
isMetric.addItemListener(this);
buttonCorner.add(isMetric);
...
//Set the corners.
pictureScrollPane.setCorner(JScrollPane.UPPER_LEFT_CORNER,buttonCorner);
pictureScrollPane.setCorner(JScrollPane.LOWER_LEFT_CORNER,new Corner());
pictureScrollPane.setCorner(JScrollPane.UPPER_RIGHT_CORNER,new Corner());

if (changed) {
//Update client's preferred size because
//the area taken up by the graphics has
//gotten larger or smaller (if cleared).
drawingArea.setPreferredSize(/* the new size */);
//Let the scroll pane know to update itself
//and its scroll bars.
drawingArea.revalidate();
