public class Pbo {
    public String warna = "Merah";
    String merk = "BMW";
    public int a;

    void  maju () {
        System.out.println(" Mobil "+ merk + " Warna "+ " bergerak maju");
    }
    void mundur (){
        System.out.println(" Mobil "+ merk + " Warna "+ " bergerak mundur");}
    void belokkiri (String warna){
        System.out.println(" Mobil "+ merk + " Warna "+ "bergerak belok kiri");
    }
    int harga(int number)
    {
        number = 1000;
        return  number;
    }

    public static void  main (String [] args){
        Pbo mobilSaya = new Pbo();
        Pbo mobilSaya2 = new Pbo();

        mobilSaya.maju();
        mobilSaya2.mundur();
        mobilSaya.belokkiri("Hijau");
        mobilSaya.belokkiri("Kuning");
        int c = mobilSaya.harga(1000);
        System.out.println("harga"+ c);

    }

}
