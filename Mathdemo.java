class MathDemo {

    int min(int a, int b) {
        return (a < b) ? a : b;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int sum(int[] args) {
        int total = 0;
        for (int n : args) {
            total += n;
        }
        return total;
    }
}