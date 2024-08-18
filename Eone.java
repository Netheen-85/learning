import java.util.*;
class Eone{
    public static void main(String args[]){
        int prices[] = new int[]{10,3,4,2,7,1,4,};
        int profit = 0;
        int lowest = prices[0];
        
        for(int i = 1; i < prices.length; i++){
            if (lowest < prices[i])
                {
                    int diff = prices[i] - lowest;
                    if(diff > profit)
                    {
                        profit = diff;
                    }
                }  
            else
            {
                lowest = prices[i];
            }                           
        }
        System.out.println(profit);
    }
}