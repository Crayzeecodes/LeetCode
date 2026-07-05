class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums,0,nums.length-1);
    }
    private void quickSort(int[] arr,int low,int high){
        if(low<high){
            int p_index = pivotFunc(arr,low,high);
            quickSort(arr,low,p_index-1);
            quickSort(arr,p_index+1,high);
        }
    }
    private int pivotFunc(int[] arr, int low, int high){
        int pivot = arr[low];
        int i=low;
        int j = high;

        while(i<j){
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            // FIX: Index check 'j >= low' must come first
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int tem  = arr[low];
        arr[low] = arr[j];
        arr[j] = tem;
        return j;
    }
}