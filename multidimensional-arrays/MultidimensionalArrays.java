import java.util.Scanner;

public class MultidimensionalArrays {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int [][] mat = new int[N][N];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                mat[i][j] = scanner.nextInt();
            }
        }

        for(int [] row : mat){
            // mat → int[][]
            //row → int[]
            for(int number : row){
                //row → int[]
                //each element → int
                System.out.print(number + " ");
            }
            System.out.println();
        }

        System.out.println("Main diagonal: " );
        for(int i = 0; i < mat.length; i++){
            System.out.println(mat[i][i] + " ");
            }

        int count = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
               if(mat[i][j] < 0){
                   count++;
               }
            }
        }

        System.out.println("Negative numbers = " + count);
        scanner.close();

    }
}
