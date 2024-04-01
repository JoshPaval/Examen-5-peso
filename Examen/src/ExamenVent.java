import javax.swing.*;
import java.awt.*;

public class ExamenVent {

	private JFrame frame;
	private JPanel panel;

	public void FacturaApp() {
		frame = new JFrame("Factura");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));

		JLabel lblCliente = new JLabel("Cliente:");
		JTextField txtCliente = new JTextField();

		JLabel lblFecha = new JLabel("Fecha:");
		JTextField txtFecha = new JTextField();

		JLabel lblProducto = new JLabel("Producto:");
		JTextField txtProducto = new JTextField();

		JLabel lblPrecio = new JLabel("Precio:");
		JTextField txtPrecio = new JTextField();

		JButton btnGenerarFactura = new JButton("Generar Factura");

		panel.add(lblCliente);
		panel.add(txtCliente);
		panel.add(lblFecha);
		panel.add(txtFecha);
		panel.add(lblProducto);
		panel.add(txtProducto);
		panel.add(lblPrecio);
		panel.add(txtPrecio);
		panel.add(new JLabel());
		panel.add(btnGenerarFactura);

		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FacturaApp();
			}
		});
	}

}
