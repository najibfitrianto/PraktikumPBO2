/* Nama File    : MGaris.java
 * Deskripsi     : Main class untuk menguji class Garis
 * Pembuat       : Mohammad Najib Fitrianto
 */

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(-2, 0);
        Titik T2 = new Titik(0, 4);
        Garis G1 = new Garis(T1, T2);

        G1.tampilkanGaris();
        System.out.println("Panjang Garis: " + G1.getPanjang());
        System.out.println("Gradien Garis: " + G1.getGradien());
        System.out.println("Persamaan Garis: " + G1.getPersamaanGaris());

        Garis G2 = new Garis();
        System.out.println("Garis G1 Sejajar G2: " + G1.isSejajar(G2));
        System.out.println("Jumlah Objek Garis: " + Garis.getCounterGaris());
    }
}