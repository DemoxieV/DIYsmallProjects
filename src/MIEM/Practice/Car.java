package MIEM.Practice;

public class Car {
    String model;
    int maxSpeed;
    double engineVolume;
    long price;
    String colour;

    //Конструктор для класса 1:
    public Car(String model, int maxSpeed, double engineVolume, long price, String colour) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
        this.price = price;
        this.colour = colour;
    }

    //Конструктор для класса 2 (overloading):
    public Car(String model, long price, String colour) {
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    // Создаём объекты:
    public static void main(String[] args) {
        Car bugatti = new Car("Bugatti Veyron", 407, 6.3, 2000000, "синий");
        Car audi = new Car("Audi TT Coupe", 2710000, "красный");
        System.out.println("Модель автомобиля 1: " + bugatti.model);
        System.out.println("Максимальная скорость: " + bugatti.maxSpeed);
        System.out.println("Объем двигателя: " + bugatti.engineVolume);
        System.out.println("Стоимость: " + bugatti.price);
        System.out.println("Цвет: " + bugatti.colour);
        System.out.println("Модель автомобиля 2: " + audi.model);
        System.out.println("Стоимость: " + audi.price);
        System.out.println("Цвет: " + audi.colour);
    }
}
