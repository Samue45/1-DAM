package Snake;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class SnakeCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if ("🟩".equals(value)) { // Comprobamos si la celda contiene la manzana
            cell.setForeground(Color.GREEN); // Color del texto (emoji)
        } else {
            cell.setForeground(Color.BLACK); // Color para otras celdas
        }
        return cell;
    }
}