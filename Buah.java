public class Buah {
    public void info() {
        System.out.println("Ini adalah sebuah buah.");
    }
    
    // Overloading method info untuk menampilkan nama buah
    public void info(String namaBuah) {
        System.out.println("Buah ini adalah " + namaBuah);
    }
}
