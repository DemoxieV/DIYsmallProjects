package MIEM.Practice;

class FuncDemo2 {

    public static void main(String[] args) {
        System.out.println("��������� z=(sin(alpha)+cos(2*beta-alpha))/(sin(alpha)-cos(2*beta-alpha))");
        for (double alpha = 10, beta = 22; alpha < 120; alpha += 10, beta += 10) {
            double chisl;
            chisl = Math.sin(alpha) + Math.cos(2 * beta - alpha);
            double znam;
            znam = Math.cos(alpha) - Math.sin(2 * beta - alpha);
            double z;
            z = chisl / znam;
            // ���������� ���������� - �������� ������� ������� ���������:
            boolean state;
            state = (znam != 0);
            System.out.println("���������:");
            System.out.println("alpha=" + alpha);
            System.out.println("beta=" + beta);
            System.out.print("������� ��� z: ");
            System.out.println(state ? z : "������� ���!");
        }
    }
}
