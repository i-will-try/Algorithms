import java.util.Arrays;

public class ShellSort {
    private static void ShellSort(int[] arr){
        for(int grap=arr.length/2;grap>0;grap=grap/2){
            for(int i=grap;i<arr.length;i++){
                for(int j=i-grap;j>=0;j=j-grap){
                    int tmp;
                    if(arr[j]>arr[j+grap]){
                        tmp=arr[j];
                        arr[j]=arr[j+grap];
                        arr[j+grap]=tmp;
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        int arr[]={2,9,1,2,4,6};
        ShellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
