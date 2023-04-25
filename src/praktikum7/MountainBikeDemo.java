package praktikum7;

import praktikum3.Bicycle;

class MountainBike extends Bicycle {
    int seatHeight;

    public void setHeight(int newValue) {
        seatHeight = newValue;
        System.out.println("Seat Height:" + seatHeight);
    }
}

class MountainBikeDemo {
    public static void main(String[] args) {
// Membuat object
        MountainBike mbike = new MountainBike();
// Memanggil method di object
        mbike.speedUp(10);
        mbike.changeGear(2);
        mbike.setHeight(20);
    }
}