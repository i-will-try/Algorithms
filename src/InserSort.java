import java.util.Arrays;

public class InserSort {
    public static void insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int insertValjue=arr[i];
            int index=i-1;
            while(index>=0&&insertValjue<arr[index]){
                arr[index+1]=arr[index];
                index--;
            }
            arr[index+1]=insertValjue;

        }
    }

    public static void main(String[] args){
        int arr[]={2,9,1,2,4,6};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
