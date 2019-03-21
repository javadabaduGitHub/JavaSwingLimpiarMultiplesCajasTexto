package util;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author https://java365.co - Curso práctico Java Swing MySQL
 * https://java365.co/blog Java Swing MySQL
 */
public class SwingUtil {

    public static void limpiar(String texto, JTextField... jTextFields) {
        for (JTextField jTextField : jTextFields) {
            jTextField.setText(texto);
        }
    }

    public static void limpiar(String text, JPanel jPanel) {
        for (int i = 0; jPanel.getComponents().length > i; i++) {
            if (jPanel.getComponents()[i] instanceof JTextField) {
                ((JTextField) jPanel.getComponents()[i]).setText(text);
            }
        }
    }
}
