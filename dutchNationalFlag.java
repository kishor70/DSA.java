public class dutchNationalFlag {
          static void swap(int arr[],int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,2,1,2,0,2,1,0};
        
        int mid = 0;
        int low = 0;
        int high = arr.length-1;
        while(mid<high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                mid++;
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr,high,mid);
                high--;
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
