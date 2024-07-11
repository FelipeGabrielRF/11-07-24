
// Fig. 13.11: FontJPanel.java
// Display strings in different fonts and colors.
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class FontJPanel extends JPanel {
   // display Strings in different fonts and colors
   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      // set font to Serif (Times), bold/italic, 18pt and draw a string
      g.setColor(Color.blue);
      g.setFont(new Font("Arial, ITALIC", Font.BOLD + Font.ITALIC, 22));
      g.drawString(g.getFont().getName() + " " + g.getFont().getSize() +
            " Senac", 20, 90);
   }
} // end class FontJPanel

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and *
 * Pearson Education, Inc. All Rights Reserved. *
 * *
 * DISCLAIMER: The authors and publisher of this book have used their *
 * best efforts in preparing the book. These efforts include the *
 * development, research, and testing of the theories and programs *
 * to determine their effectiveness. The authors and publisher make *
 * no warranty of any kind, expressed or implied, with regard to these *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or *
 * consequential damages in connection with, or arising out of, the *
 * furnishing, performance, or use of these programs. *
 *************************************************************************/
