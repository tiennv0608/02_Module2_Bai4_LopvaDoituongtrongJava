import java.util.Scanner;
import java.time.LocalTime;

public class Practice {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        int size;
        Scanner sc = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        System.out.println("Enter size");
        size = sc.nextInt();
        arr = createArr(arr, size);
        stopWatch.start();
        arr = sort(arr, size);
        stopWatch.stop();
        System.out.println(stopWatch.getElapse());
        displayArr(arr, size);
    }

    static int[] createArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        return arr;
    }

    static void displayArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] sort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
