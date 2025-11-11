package pertemuan6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author wdgus
 */
public class Latihan2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Konverter Suhu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Komponen-komponen GUI
        JLabel labelCelcius = new JLabel("Celcius:");
        JTextField inputCelcius = new JTextField(10);
        JButton buttonKonversi = new JButton("Konversi");
        JLabel labelFahrenheit = new JLabel("Fahrenheit:");
        JLabel labelHasil = new JLabel("");

        // ActionListener untuk tombol Konversi
        buttonKonversi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Ambil teks dari JTextField
                    String textCelcius = inputCelcius.getText();
                    
                    // Ubah teks ke double
                    double celcius = Double.parseDouble(textCelcius);
                    
                    // Hitung Fahrenheit dengan rumus: (celcius * 9/5) + 32
                    double fahrenheit = (celcius * 9/5) + 32;
                    
                    // Atur teks JLabel hasil
                    labelHasil.setText(String.format("%.2f", fahrenheit));
                    
                } catch (NumberFormatException ex) {
                    // Penanganan jika input bukan angka
                    labelHasil.setText("Input tidak valid!");
                }
            }
        });

        // Tambahkan komponen ke frame
        frame.add(labelCelcius);
        frame.add(inputCelcius);
        frame.add(buttonKonversi);
        frame.add(labelFahrenheit);
        frame.add(labelHasil);

        frame.setVisible(true);
    }
}