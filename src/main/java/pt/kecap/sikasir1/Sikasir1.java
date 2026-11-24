/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pt.kecap.sikasir1;

/**
 *
 * @author marya
 */
import javax.swing.JFrame;

public class Sikasir1 extends JFrame {
    public Sikasir1() {
        setTitle("Aplikasi Kasir Toko - SiKasir");
        setSize(420, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Sikasir1().setVisible(true);
    }
}
