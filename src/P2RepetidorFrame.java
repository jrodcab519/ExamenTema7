import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class P2RepetidorFrame extends JFrame {

    private int repeticiones;
    public P2RepetidorFrame() throws HeadlessException {
        repeticiones = 2;
        setTitle("2 repeticiones");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel pnlBotones = new JPanel(new FlowLayout());
        JButton btnMenos = new JButton("-1");
        JButton btnMas = new JButton("+1");
        pnlBotones.add(btnMenos);
        pnlBotones.add(btnMas);
        add(pnlBotones, BorderLayout.PAGE_START);

        btnMas.addActionListener(e -> {
           repeticiones++;
           setTitle(repeticiones + " repeticiones");
            if(repeticiones == 5){
                btnMas.setEnabled(false);
            }
        });

        btnMenos.addActionListener(e -> {
            repeticiones--;
            setTitle(repeticiones + " repeticiones");
            if(repeticiones == 2){
                btnMenos.setEnabled(false);
            }
        });







        JPanel pnlCentral = new JPanel(new GridLayout(2, 2));
        pnlCentral.setBorder(new EmptyBorder(10, 10, 10, 10));
        pnlCentral.add(new JLabel("Entrada:", SwingConstants.RIGHT));
        JTextField txtEntrada = new JTextField(20);
        pnlCentral.add(txtEntrada);
        pnlCentral.add(new JLabel("Salida:", SwingConstants.RIGHT));
        JTextField txtSalida = new JTextField(20);
        pnlCentral.add(txtSalida);
        add(pnlCentral, BorderLayout.CENTER);


                txtEntrada.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        super.keyPressed(e);
                        txtSalida.setText(txtEntrada.getText());
                    }
                });

        setVisible(true);
    }

}