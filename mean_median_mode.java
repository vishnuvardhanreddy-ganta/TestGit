import java.util.*;
public class mean_median_mode {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            System.out.print("Enter length of array(n) : ");
                int n=sc.nextInt();
            System.out.println("Enter numbers of array : ");
                int[] arr=new int[n];
         
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          }
        
        //mean of the array
        double sum=0;
         for(int i=0;i<n;i++){
            sum=sum+arr[i];
         } 
        double mean=sum/n;
         System.out.println("mean of the given array = "+ mean);

        //median of the array
        double median=0;
        Arrays.sort(arr);
        if (arr.length % 2 != 0) 
        {
            median= arr[arr.length / 2];
        }
        else{
        median=(arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;
        }
        System.out.println("median of the given array = "+ median);

        //mode of the array
        double mode=3*median-2*mean;
        System.out.println("mode of the given array = "+ mode);
        sc.close();
    }
}
