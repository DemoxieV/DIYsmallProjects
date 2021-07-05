package MIEM.Practice;

public class Car {
    String model;
    int maxSpeed;
    double engineVolume;
    long price;
    String colour;

    //����������� ��� ������ 1:
    public Car(String model, int maxSpeed, double engineVolume, long price, String colour) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
        this.price = price;
        this.colour = colour;
    }

    //����������� ��� ������ 2 (overloading):
    public Car(String model, long price, String colour) {
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    // ������ �������:
    public static void main(String[] args) {
        Car bugatti = new Car("Bugatti Veyron", 407, 6.3, 2000000, "�����");
        Car audi = new Car("Audi TT Coupe", 2710000, "�������");
        System.out.println("������ ���������� 1: " + bugatti.model);
        System.out.println("������������ ��������: " + bugatti.maxSpeed);
        System.out.println("����� ���������: " + bugatti.engineVolume);
        System.out.println("���������: " + bugatti.price);
        System.out.println("����: " + bugatti.colour);
        System.out.println("������ ���������� 2: " + audi.model);
        System.out.println("���������: " + audi.price);
        System.out.println("����: " + audi.colour);
    }
}
