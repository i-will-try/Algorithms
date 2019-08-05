import java.util.Arrays;

public class SelectSort {
    public static void SelectSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minindex=i;
            int min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    minindex=j;
                }
            }
            if(minindex!=i){
                arr[minindex]=arr[i];
                arr[i]=min;

            }
        }
    }
    public static void main(String[] args){
        int arr[]={2,9,1,2,4,6};
        SelectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
