public class Average {
    public static void main(String[] args) {
        float numbers[] = new float[]{18.9f,32.4f,6.7f,4.9f,7.9f};
        System.out.println("Average: " + average(numbers));
    }
    public static float average(float[] num)
    {
        float sum = 0;    
        for(int i = 0; i < num.length; i++)
        {
            sum += num[i];
        }
        return sum/num.length;
    }

}
