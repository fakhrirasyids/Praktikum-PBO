package praktikum3;

public class Bicycle {
    int speed = 0;
    int gear = 0;

    public void changeGear(int newValue) {
        gear += newValue;
        System.out.println(" \nGear:" + gear);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println(" \nSpeed:" + speed);
    }
}

