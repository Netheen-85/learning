import java.util.*;
class Ethree{
    public static void main(String args[]){

        System.out.println("Enter the no. of rows");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        int build[][] = new int[row][row];

        for(int i = 0; i < row; i++){
            System.out.println("Enter value for row " + (i + 1));
            for(int j = 0; j < row; j++){
                build[i][j] = sc.nextInt();
            }
        }

        Boolean base = false;
        Boolean fin = false;

        int count1 = 0;

        for(int i = 0; i < row; i++){
            //System.out.println("s");
            if(build[0][i] > 0){
                if(build[row - 1][i] > 0){
                    count1++;
                    
                }  
            }
        }

        if(count1 == row){
            //System.out.println("s1");
            base = true;
        }

        if(base == true){
            //System.out.println("s2");
            int count = 2;
            for(int i = 1; i <= row - 2; i++){
                if(build[i][row - count] > 0){
                    count++;
                    //System.out.println("count" + count);
                }
            }

            if(count == row){
                fin = true;
            }
        }
        //System.out.println(base);
        System.out.println(fin);
        

    }
}
