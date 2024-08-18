import java.util.*;
class Etwo{
    public static void main(String args[]){
        int[] temper = new int[5];
        int result[] = {0,0,0,0,0,0,0,0};
        

        for(int i = 0; i < temper.length; i++){
            for(int j = i + 1, k = 1; j < temper.length; j++, k++){
                

                if(temper[j] > temper[i]){
                    result[i] = k;
                    break;
                }
            }
        }

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]  + " ");
        }
        
    }
}