import java.util.Scanner;

public class Bubblesort {
 void sort(int arr[]){
    int temp;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1;j++){//j<arr.length-i-1 for large data
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]=temp;

            }
        }
    }
    for(int l=0;l< arr.length;l++){
        System.out.println(arr[l]);
    }
}


    public static void main(String[] args) {
        Bubblesort obj = new Bubblesort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
           int a= sc.nextInt();
           int arr[]=new int[a];
           for(int k=0;k<a;k++){
            arr[k]=sc.nextInt();
           }

           obj.sort(arr);


    }


}
