
import static java.lang.System.in;
import java.util.Arrays;
import java.util.Scanner;

public class DataProcess {
    public static void main(String[] args){
        int[] values =  new int[5];
        Scanner in = new Scanner(System.in);
        int num=1;
        for(int count=0; 4 >= count; count++)
        {
            System.out.println("Enter an integer value for number "+ num +" of 5:");
            values[count] = in.nextInt(); 
            num++;
        }
        double Average=getAverage(values);
        double Largest=getLargest(values);
        double Smallest=getSmallest(values);
       
    }
    static float getAverage(int[] data) {
        float sum=0;
        for(int i=0; i<data.length; i++){
            sum = sum + data[i];
        }
        float average = sum / data.length;
        System.out.println("The average value of the array is: "+ average);        
        return 0;}
     
    static int getLargest(int[] data)  {
        int max=data[0];
        for(int i=0; i<data.length; i++){
            if(max<data[i]){
                max=data[i];}     
        }
        System.out.println("The largest value in the array is: "+ max);
        return 0;}
    
    static int getSmallest(int[] data) {
        int min=data[0];
        for(int i=0; i<data.length; i++){
            if(min>data[i]){
                min=data[i];}     
        }
        System.out.println("The smallest value in the array is: "+ min);
        return 0;} 
}

