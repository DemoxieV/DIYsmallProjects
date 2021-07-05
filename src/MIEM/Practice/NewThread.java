package MIEM.Practice;

// Класс NewThread расширяет класс Thread:
class NewThread extends Thread {
    // Конструктор класса:
    NewThread() {
        // Вызов конструктора класса Thread:
        super("Новый поток");
        // Вывод сведений о потоке:
        System.out.println("Вспомогательный поток: " + this);
        // Запуск потока на выполнение:
        start();
    }

    // Переопределение метода run():
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Вспомогательный поток: " + i);
                // Приостановка потока:
                Thread.sleep(500);
            }
        }
        // Обработка исключения прерывания потока:
        catch (InterruptedException e) {
            System.out.println("Прерывание вспомогательного потока!");
        }
        System.out.println("Завершение вспомогательного потока!");
    }
}

class ExtendsThreadDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new NewThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i * 100);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание главного потока!");
        }
        System.out.println("Завершение главного потока!");
    }

}
