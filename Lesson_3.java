class Lesson_3 {

    public static void main(String[] args) {
        falseTrue(10, 2);
        numberSing(-10);
        positiveFalseTrue(-10);
        stringS();
        leapУear(1780);
        arrayNumber();
        arrayNull();
        arrayTwo();
        twoArray();
        argument(10, 1);

    }


    private static void falseTrue(int x, int y) {
        {
        }
    }

    private static void numberSing(int i) {
        if (i < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    private static void positiveFalseTrue(int a) {
        {
        }
    }

    private static void stringS() {
        String S = "Test string lesson";
        int i = 3;
        while (i > 0) {
            System.out.println(S);
            i--;
        }
    }

    private static void leapУear(int year) {
        {
        }
    }

    private static void arrayNumber() {
        int[] numbers = {0, 1, 1, 0, 0, 1, 1, 0, 0};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 1;
                {
                    System.out.println(numbers[i]);
                }
            } else if (numbers[i] == 1) {
                numbers[i] = 0;
                {
                    System.out.println(numbers[i]);
                }
            }
        }
    }

    private static void arrayNull() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }


    private static void arrayTwo() {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                System.out.println(numbers[i] * 2);
            } else {
                System.out.println(numbers[i]);
            }
        }
    }

    private static void twoArray() {
        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (table[i] == table[j])
                    System.out.println("1");
                else
                    System.out.println("0");
            }
        }
    }

    private static void argument(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }
}
