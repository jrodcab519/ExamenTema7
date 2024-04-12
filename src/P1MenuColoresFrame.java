import javax.swing.*;
import java.awt.*;


public class P1MenuColoresFrame extends JFrame {

    public P1MenuColoresFrame() throws HeadlessException {
        JFrame ventana = new JFrame("Menu Colores");

        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Colores");

        JMenuItem menuItemRojo = new JMenuItem("Rojo");
        JMenuItem menuItemVerde = new JMenuItem("Verde");
        JMenuItem menuItemAzul = new JMenuItem("Azul");
        JMenuItem menuItemSalir = new JMenuItem("Salir");

        JPanel pn1 = new JPanel();

        menuItemAzul.addActionListener(e -> pn1.setBackground(Color.blue));

        menuItemRojo.addActionListener(e -> pn1.setBackground(Color.red));

        menuItemVerde.addActionListener(e -> pn1.setBackground(Color.green));

        menuItemSalir.addActionListener(e -> System.exit(0));


        menuArchivo.add(menuItemRojo);
        menuArchivo.add(menuItemVerde);
        menuArchivo.add(menuItemAzul);
        menuArchivo.addSeparator();
        menuArchivo.add(menuItemSalir);

        menuBar.add(menuArchivo);

        ventana.setJMenuBar(menuBar);
        ventana.add(pn1);

        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
