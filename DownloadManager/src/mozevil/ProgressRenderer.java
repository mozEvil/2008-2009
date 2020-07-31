package mozevil;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author MozEvil
 */

public class ProgressRenderer extends JProgressBar implements TableCellRenderer {

    public ProgressRenderer(int min, int max) {
        super(min, max);
    }

    //возвращает объяект JProgressBar как исходный для данной ячейки таблицы
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        //установить процент завершонности для JProgressBar
        setValue((int) ((Float) value).floatValue());
        return this;
    }

}
