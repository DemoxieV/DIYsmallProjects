package MIEM.Practice;

class FindRoot {

    public static void main(String[] args) {
        // ��������� ���������:
        double a = 5;
        double b = 3;
        double c = 1;
        // ��������������� ����������:
        double alpha;
        // ���������� ���������� - �������� ������� �������:
        boolean state;
        // �������� ��������������� ����������:
        alpha = Math.asin(a / Math.sqrt(a * a + b * b));
        // ���������� ��������:
        state = a * a + b * b >= c * c;
        // ����� �� ����� �������� �������� ����������:
        System.out.println("��������� a*cos(x)+b*sin(x)=c");
        System.out.println("���������:");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.print("������� ��� x: ");
        // ���������� ������� ��������� � ����� �� �����:
        System.out.println(state ? Math.asin(c / Math.sqrt(a * a + b * b)) - alpha : "������� ���!");
    }
}
