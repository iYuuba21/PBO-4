public class Main {
    public static void main(String[] args) {
        Buah buah = new Buah();
        buah.info(); // Memanggil method info dari superclass
        buah.info("Jeruk"); // Memanggil method info dari superclass dengan parameter
        
        Apel apel = new Apel();
        apel.info(); // Memanggil method info dari subclass Apel
        
        Jeruk jeruk = new Jeruk();
        jeruk.info(); // Memanggil method info dari subclass Jeruk
        
        Mangga mangga = new Mangga();
        mangga.info(); // Memanggil method info dari subclass Mangga
    }
}
