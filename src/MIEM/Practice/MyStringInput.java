package MIEM.Practice;

import java.io.*;

class MyStringInput {

    public static void main(String[] args) throws IOException {
        String str = "��� �����: ";
        String s;
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("���-�� �������?");
        s = br.readLine();
        while (!s.equalsIgnoreCase("���")) {
            count++;
            str = str + "\n" + count + ": " + s.toLowerCase();
            System.out.println(str + "\n ��� ���-��?");
            s = br.readLine();
        }
        System.out.println("�������! ��� ����� ������!");
    }

}
