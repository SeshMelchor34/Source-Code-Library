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

