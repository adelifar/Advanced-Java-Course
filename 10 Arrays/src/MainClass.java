import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int num1 = 10, num2 = 11, num3 = 12, num4 = 13, num5 = 14, num6 = 15;
        num1 *= 2;
        num2 *= 2;
        num3 *= 2;
        //data structure
        //int double boolean string
        int[] arr;
        arr = new int[6];   //arr[0] ... arr[6]
        arr[1] = 5;
        arr[2] = 8;
        arr[3] = 258;
        int myNumber = arr[2];
        boolean[] booleans;
        String[] strings;

        arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = i * 2;
        }
        System.out.println(arr[4]);
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }

        int n = 7;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array length");
        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {  //arr=new int[5] => 0..4 length=5
            arr[i] = i * 2;
        }
        System.out.println(arr[4]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Length of array: " + arr.length);

        for (int tempNumber : arr) {    //0-1-arr[2]
            System.out.println(tempNumber);
        }

//        int[] arr2 = new int[]{5, 46, 14, 12, 31, 51, 4};
        int[] arr2 = {5, 46, 14, 12, 31, 51, 4};
        for (int tNumber : arr2) {
            System.out.println(tNumber);
        }
        System.out.println("Length of array: " + arr2.length);


        String[] arr22 = {"5", "46", "14", "12", "31", "51", "4"};
        for (String tNumber : arr22) {
            System.out.println(tNumber);
        }
        System.out.println("Length of array: " + arr22.length);

        int[] arr3 ;
        arr3= Arrays.copyOf(arr2,arr2.length);

        arr2[6]=151;
        for (int tNumber : arr3) {
            System.out.println(tNumber);
        }

        System.out.println(  Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println(  Arrays.toString(arr3));

        System.out.println("Args:");
        System.out.println(Arrays.toString(args));

        int[] a=new int[100];
        int[][] arr4=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr4[i][j]=i+j;
            }
        }
//        System.out.println(Arrays.toString(arr4));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }

        int[][] arr5=new int[3][];
        arr5[0]=new int[2];
        arr5[1]=new int[5];
        arr5[2]=new int[12];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.print(arr5[i][j]+" ");
            }
            System.out.println();
        }

        int[][] arr6={{1,2,3},{8,10,12,15,16,17},{78,2}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr6[i].length; j++) {
                System.out.print(arr6[i][j]+" ");
            }
            System.out.println();
        }

        int[] arr7={85,14,23,88,15,65,17,15};
        Arrays.sort(arr7);
        int result=Arrays.binarySearch(arr7,15);
        System.out.println(result);


        int[] c={85,14,23,88,15,65,17,15};
        int[] b={85,14,23,88,15,65,17,15};
        System.out.println(Arrays.equals(c,b));
    }
}
