import shapes.*;
import geometry.*;

public class App {
    public static void main(String[] args) {
        // Membuat objek Circle dari package shapes
        Circle lingkaran = new Circle(5.0);
        System.out.println("Luas lingkaran: " + lingkaran.getArea());
        System.out.println("perimeter lingkaran: " + lingkaran.getPerimeter());
        System.out.println("==============================================");

        // Membuat objek Rectangle dari package shapes
        Rectangle persegiPanjang = new Rectangle(4.0, 6.0);
        System.out.println("Luas persegi panjang: " + persegiPanjang.getArea());
        System.out.println("perimeter persegi panjang: " + persegiPanjang.getPerimeter());
        System.out.println("==============================================");

        // Membuat objek Right Triangle dari package shapes
        RightTriangle segitigaSiku = new RightTriangle(4.0, 6.0);
        System.out.println("Luas segitigaSiku: " + segitigaSiku.getArea());
        System.out.println("perimeter segitigaSiku: " + segitigaSiku.getPerimeter());
        System.out.println("==============================================");

        // Membuat Block  dari package geometry
        Block balok = new Block(3.0, 4.0, 6.0);
        System.out.println("Volume balok: " + balok.getVolume());
        System.out.println("==============================================");

        // Membuat Cube  dari package geometry
        Cube kubus = new Cube(6.0);
        System.out.println("Volume kubus: " + kubus.getVolume());
        System.out.println("==============================================");

        // Membuat Prism  dari package geometry
        Prism prisma = new Prism(4.0, 5.0, 7.0);
        System.out.println("Volume prisma: " + prisma.getVolume());
    }
}
