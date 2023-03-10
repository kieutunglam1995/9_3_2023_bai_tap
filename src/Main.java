import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] newArr = new int[arr.length + 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào vị tr muốn in :");
        int index = sc.nextInt();
        System.out.println("nhập vào giá trị của phần tử ");
        int value = sc.nextInt();
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[i-1];

            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}