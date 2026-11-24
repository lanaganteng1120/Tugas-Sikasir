/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.kecap.sikasir1;

/**
 *
 * @author marya
 */
class Barang {
    private String nama;   // atribut 
    private double harga;  // atribut 
    
    public Barang(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
}

    public double hitungSubtotal(int jumlah) {  // method 
        return harga * jumlah; 
    } 
    
//    Barang b1 = new Barang("Buku Tulis", 5000);
    public String getNama() { 
        return nama; 
    } 
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga) { 
        if (harga > 0) { 
            this.harga = harga;
        }
    } 
}
