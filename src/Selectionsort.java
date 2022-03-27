import java.util.Scanner;

public class Selectionsort {
    void sort2(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int l = 0; l < arr.length; l++) {
            System.out.println(arr[l]);
        }
    }

    public static void main(String[] args) {
        Selectionsort obj = new Selectionsort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int k = 0; k < a; k++) {
            arr[k] = sc.nextInt();
        }

        obj.sort2(arr);
    }
}
