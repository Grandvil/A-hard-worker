public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listenerTwo = System.out::println;

        Worker worker = new Worker(listener, listenerTwo);
        worker.start();
    }
}
