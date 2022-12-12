import java.util.Arrays;

public class Main {
    //"Задача 1"
    static int[] one = new int[]{1,2,3};
    static double[] two = {1.57, 7.654, 9.986};
    static int[] three = {0,1,2,3,4,5,6,7,8,9};

    public static void main(String[] args) {
        task2();
        task3();
        task4();
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i]);
            if (!(i == one.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i]);
            if (!(i == two.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int i = 0; i < three.length; i++) {
            System.out.print(three[i]);
            if (!(i == three.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = one.length - 1; i >= 0; i--) {
            System.out.print(one[i]);
            if (!(i == 0)) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = two.length - 1; i >= 0; i--) {
            System.out.print(two[i]);
            if (!(i == 0)) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = three.length - 1; i >= 0; i--) {
            System.out.print(three[i]);
            if (!(i == 0)) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");

        for (int i = 0; i <one.length ; i++) {
            if (one[i]%2==1) {
                one[i]+=1;
            }
        }
        System.out.println(Arrays.toString(one));
    }
}
