class FibonacciThread extends Thread {
    @Override
    public void run() {
        int n = 20;
        int first = 0, second = 1;

        System.out.println("Fibonacci Series (first " + n + " terms):");
        System.out.print(first + ", " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }

        System.out.println();
    }
}
