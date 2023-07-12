import java.util.Scanner;
public class MinMaxElementOfArray {
    static int minElement(int[] A){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < A.length; i++){
            if(A[i]<min){
                min = A[i];
            }
        }
        return min;
    }
    static int maxElement(int[] A){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        System.out.println("Array elements: ");
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(minElement(array)+maxElement(array));
    }
}
