import java.util.Arrays;

public class BubbleSort {
    public static void BubbleSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                int tmp;
                if(arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }

    public static void main(String[] args){
        int arr[]={2,9,1,2,4,6};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
