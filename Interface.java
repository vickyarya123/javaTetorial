interface Bicycle {
    void applyBreak();

    void speedup(){
        System.out.println("hello sppeedup");
    }
}

class Avon implements Bicycle {

    public void applyBreak() {
        System.out.println("applying break");
    }

    public void speedup() {
        System.err.println("increase speed");
    }
}

public class Interface {
    public static void main(String[] args) {
        Avon a1 = new Avon();
        a1.applyBreak();
        a1.speedup();
        
    }

}
