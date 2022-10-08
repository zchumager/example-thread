package net.me.dev;

public class Main {
    public static void main(String[] args) {

        Process processA = new Process();
        Process processB = new Process();

        Task task = new Task();
        Thread threadTask = new Thread(task);

        //el metodo start ejecuta el metodo run del thread correspondiente
        processA.start();
        processB.start();

        threadTask.start();
    }
}
