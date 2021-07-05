package MIEM.Practice;

interface SuperVehicle {
}

// Наследование + Интерфейс (отношение IS-A)
class Vehicle implements SuperVehicle {
}

class Van extends Vehicle {
}

class Bike extends Vehicle {

    public static void main(String[] args) {
        Van v = new Van();
        Bike b = new Bike();

        System.out.println(v instanceof Vehicle);
        System.out.println(b instanceof SuperVehicle);
    }
}
