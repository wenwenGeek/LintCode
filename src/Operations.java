class Operations {

    public Operations() {

    }

    public int minus(int a, int b) {

        int c = 0;
        if (a > b) {
            while (true) {
                if (b + c == a) {
                    return c;
                }
                c = c + 1;
            }
        } else {
            while (true) {
                if (b + c == a) {
                    return c;
                }
                c = c + (-1);
            }
        }
    }

    public int multiply(int a, int b) {
        int min = a;
        int max = b;
        if (a > b) {
            min = b;
            max = a;
        }

        if (min == 0) {
            return 0;
        }
        if (min == 1) {
            return max;
        }

        int sum = max;

        for (int i = 1; i < min; i++) {
            sum = sum + max;
        }
        return max;
    }

    public int divide(int a, int b) {
        return a/b;

    }
}