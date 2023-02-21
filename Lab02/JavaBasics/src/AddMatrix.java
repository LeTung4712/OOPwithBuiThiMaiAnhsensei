import java.util.Scanner;

/**
 * AddMatrix
 */
public class AddMatrix {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Nhập vào số hàng :");
        int row = inp.nextInt();
        System.out.println("Nhập vào số cột :");
        int col = inp.nextInt();
        

        int matrix1[][] = new int[row][col];
        int matrix2[][] = new int[row][col];
        int sum[][]     = new int[row][col];

        System.out.println("nhập ma trận thứ nhất ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print("M1["+i+"]["+j+"] ");
                matrix1[i][j] = inp.nextInt();
            }
        }

        System.out.println("nhập ma trận thứ hai ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print("M2["+i+"]["+j+"] ");
                matrix2[i][j] = inp.nextInt();
            }
        }
        System.out.println("---------Cộng hai ma trận "+row+"x"+col+"-----------");
        System.out.println("ma trận thứ nhất ");
        in(matrix1,row,col);
        System.out.println("ma trận thứ hai ");
        in(matrix2,row,col);
        System.out.println("ma trận tổng là : ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                sum[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        in(sum,row,col);
    }
    static void in(int matrix[][],int row,int col){
        
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}