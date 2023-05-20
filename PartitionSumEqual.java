import java.util.Scanner;

public class PartitionSumEqual {
    
    static int finaArraySum(int arr[]){
        int totalSum = 0;
        for(int i=0 ; i<arr.length ; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int arr[]){
        int totalSum = finaArraySum(arr);

        int prefSum = 0 ;
        for(int i=0 ; i<arr.length ; i++){
            prefSum += arr[i];
            int SuffixSum = totalSum - prefSum;
            if(SuffixSum == prefSum){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the " + n + " elements of the array");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("equalpartition possible" + " " + equalSumPartition(arr));
    }
}
