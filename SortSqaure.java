import java.util.Scanner;

public class SortSqaure {

    static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void printArray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static int [] sortArray(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int ans [] = new int[n];
        int k = 0;

        while(i<=j){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[k++] = arr[i] * arr[j];
                i++;
            }
            else{
                ans[k++] = arr[j] * arr[j];
                j++;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the" + n + "elements of the array");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("ORIGINAL ARRAY");
        printArray(arr);
        int ans[] = sortArray(arr);
        System.out.println("SORTED ARRAY");
        reverse(ans);
        printArray(ans);
    }
}
