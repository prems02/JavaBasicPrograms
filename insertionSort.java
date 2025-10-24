public class insertion {
    public static void insertions(int arr[]){
        for(int i = 1; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct pos to insert
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }



    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,5,2};
        insertions(arr);

    }
}
