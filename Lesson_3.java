class Lesson_3 {

    public static void main(String[] args) {
        falseTrue();
        numberSing();
        singFalseTrue();
        stringS();
        leapУear();
        arrayNumber();
        arrayNull();
        arrayTwo();
        twoArray();
        argument();

    }



    private static boolean falseTrue() {
        int x = 10;
        int y = 6;
        boolean symm = 10 <= (x + y) && (x + y) <= 20;
        if (symm) {
            return true;
        } else {
            return false;
        }
    }

    private static void numberSing() {
        int i = -10;
        if (i < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    private static boolean singFalseTrue() {
        int x = 10;
        if (x < 0 || x > 0) {
            return true;
        } else {
            return false;
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

    private static boolean leapУear() {
        int year = 1600;
        boolean leap = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        if (leap) {
            return true;
        } else {
            return false;
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

    private static void argument() {
        int len = 10;
        int initialValue = 1;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }
}
