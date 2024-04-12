import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class P3TresEnRayaFrame extends JFrame {
    private int contador;
    public P3TresEnRayaFrame() throws HeadlessException {

        contador = 0;
        JFrame ventana = new JFrame("Tres en Raya");

        JLabel etiqueta = new JLabel("Turno del jugador X", JLabel.CENTER);

        JLabel uno = new JLabel("1", JLabel.CENTER);
        JLabel dos = new JLabel("2", JLabel.CENTER);
        JLabel tres = new JLabel("3",JLabel.CENTER);
        JLabel cuatro = new JLabel("4", JLabel.CENTER);
        JLabel cinco = new JLabel("5", JLabel.CENTER);
        JLabel seis = new JLabel("6", JLabel.CENTER);
        JLabel siete = new JLabel("7", JLabel.CENTER);
        JLabel ocho = new JLabel("8",JLabel.CENTER );
        JLabel nueve = new JLabel("9",JLabel.CENTER );

        JPanel pn1 = new JPanel(new GridLayout(3, 3));

        ventana.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                contador++;
                if (contador%2==0){
                    etiqueta.setText("Turno del jugador X");
                }else {
                    etiqueta.setText("Turno del jugador O");
                }
            }
        });

        pn1.add(uno);
        pn1.add(dos);
        pn1.add(tres);
        pn1.add(cuatro);
        pn1.add(cinco);
        pn1.add(seis);
        pn1.add(siete);
        pn1.add(ocho);
        pn1.add(nueve);

        ventana.add(pn1);
        ventana.add(etiqueta, BorderLayout.PAGE_END);
        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }
}


