import java.util.*;
class Mone {
    public static void main(String args[]){
        System.out.println("Enter a String");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String tem = " ";

        for(int i = 0; i < str.length(); i++){
            //System.out.println("1");
            for(int j = 0; j < tem.length(); j++){
                //System.out.println("2");
                if(str.charAt(i) == tem.charAt(j)){
                    //System.out.println("3");
                    break;
                }
                else{
                    tem = tem + str.charAt(i);
                    break;
                }
                
                    ///break;
            }
        }

        System.out.println(tem);
    }
}
