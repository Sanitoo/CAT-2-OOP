abstract class Appliance {
    abstract void turnOn();
}

class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Fan is spinning...");
    }
}

class TV extends Appliance {
    @Override
    void turnOn() {
        System.out.println("TV is displaying...");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Appliance myFan = new Fan();
        Appliance myTV = new TV();

        myFan.turnOn();  // Outputs: Fan is spinning...
        myTV.turnOn();   // Outputs: TV is displaying...
    }
}
