package MIEM.Practice;

public class Motorbike {
}

class Speed {
}

//��������� HAS-A
class Bicycle extends Motorbike {
    private Speed sp;

    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        System.out.println(b instanceof Motorbike);
    }
}
