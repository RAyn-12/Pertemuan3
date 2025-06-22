interface Hewan {
    void bersuara(); // Method abstrak
}

class Kucing implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Kucing mengeong: Meow Meow!");
    }
}

class Anjing implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Anjing menggonggong: Woof Woof!");
    }
}

// Main class
public class Contoh2 {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        kucing.bersuara();
        anjing.bersuara();
    }
}