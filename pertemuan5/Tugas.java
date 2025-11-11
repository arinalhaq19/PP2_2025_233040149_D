package pertemuan5;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Tugas {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Contoh BorderLayout dengan Aksi");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Atur Layout Manager ke BorderLayout (default, tapi ditulis untuk kejelasan)
                frame.setLayout(new BorderLayout());

                // Buat komponen
                JLabel label = new JLabel("Label ada di Atas (NORTH)");
                JButton buttonSouth = new JButton("Tombol ada di Bawah (SOUTH)");
                JButton buttonWest = new JButton("WEST");
                JButton buttonEast = new JButton("EAST");
                JButton buttonCenter = new JButton("CENTER");

                // Tambahkan aksi untuk tombol SOUTH (seperti sebelumnya)
                buttonSouth.addActionListener(e -> {
                    label.setText("Tombol di SOUTH diklik!");
                });

                // Tambahkan aksi untuk tombol WEST
                buttonWest.addActionListener(e -> {
                    label.setText("Tombol di WEST diklik!");
                });

                // Tambahkan aksi untuk tombol EAST
                buttonEast.addActionListener(e -> {
                    label.setText("Tombol di EAST diklik!");
                });

                // Tambahkan aksi untuk tombol CENTER
                buttonCenter.addActionListener(e -> {
                    label.setText("Tombol di CENTER diklik!");
                });

                // Tambahkan komponen ke frame dengan posisi
                frame.add(label, BorderLayout.NORTH);
                frame.add(buttonSouth, BorderLayout.SOUTH);
                frame.add(buttonWest, BorderLayout.WEST);
                frame.add(buttonEast, BorderLayout.EAST);
                frame.add(buttonCenter, BorderLayout.CENTER);

                frame.setVisible(true);
            }
        });
    }
}