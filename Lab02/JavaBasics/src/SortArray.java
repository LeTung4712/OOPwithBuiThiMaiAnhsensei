import java.util.Arrays;
import java.util.Scanner;

/**
 * SortArray
 */
public class SortArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("nhập số lượng phần tử  Array");
        int n = inp.nextInt();
        int arr[]=new int[n];
        for (int i=0 ;i<n;i++){
            
            System.out.println("nhập phần tử thứ " +(i+1));
            arr[i]= inp.nextInt();
        }
        System.out.println("-----------------------------------------");
        System.out.println("|  mảng ban đầu :");System.out.print("|");
        for (int i=0;i<n;i++){
            
            System.out.print("\t"+ arr[i]);
        }

        System.out.println("\n|  mảng sắp xếp tang dần :");System.out.print("|");
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            
            System.out.print("\t"+ arr[i]);
        }

        int sum=0;
        float tb;
        for (int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("\n|  Giá trị trung bình của mảng :"+(tb=(float)sum/n));
        System.out.println("-----------------------------------------");

    }
    
}