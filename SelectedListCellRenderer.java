import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
//import javax.swing.Component;

public class SelectedListCellRenderer extends DefaultListCellRenderer {
     @Override
     public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
         Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
         if (isSelected) {
             c.setBackground(Color.RED);
         }
         return c;
     }
}
