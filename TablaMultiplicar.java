import javax.swing.JOptionPane;

public class TablaMultiplicar {
    public static void main(String[] args) {
        // Solicita un número al usuario usando JOptionPane
        String input = JOptionPane.showInputDialog("Ingresa un número:");
        
        try {
            int numero = Integer.parseInt(input);
            StringBuilder resultado = new StringBuilder("Tabla de multiplicar del " + numero + ":\n");

            for (int i = 1; i <= 10; i++) {
                resultado.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
            }

            JOptionPane.showMessageDialog(null, resultado.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido.");
        }
    }
}
