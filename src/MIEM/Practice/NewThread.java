package MIEM.Practice;

// ����� NewThread ��������� ����� Thread:
class NewThread extends Thread {
    // ����������� ������:
    NewThread() {
        // ����� ������������ ������ Thread:
        super("����� �����");
        // ����� �������� � ������:
        System.out.println("��������������� �����: " + this);
        // ������ ������ �� ����������:
        start();
    }

    // ��������������� ������ run():
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("��������������� �����: " + i);
                // ������������ ������:
                Thread.sleep(500);
            }
        }
        // ��������� ���������� ���������� ������:
        catch (InterruptedException e) {
            System.out.println("���������� ���������������� ������!");
        }
        System.out.println("���������� ���������������� ������!");
    }
}

class ExtendsThreadDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new NewThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("������� �����: " + i * 100);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("���������� �������� ������!");
        }
        System.out.println("���������� �������� ������!");
    }

}
