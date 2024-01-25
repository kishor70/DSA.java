import java.util.Scanner;
/**
 * linearSearch
 * //TC = O(n);
 *
 */
public class linearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of Array");
            int size = sc.nextInt();

            int[] arr = new int[size];
            System.out.println("Enter the no in the array");
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter the to be Searched");
            int search = sc.nextInt();

            for(int no : arr){
                if(no == search){
                    System.out.println(search + " is present in the array");
                    return;
                }
            } 
            System.out.println(search + " is not present in the array");
    }
    
}