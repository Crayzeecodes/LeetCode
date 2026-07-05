class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    private void mergeSort(int[] array,int low,int high){
        if(low>=high){return;}
        int mid=(low+high)/2;
        mergeSort(array,low,mid);
        mergeSort(array,mid+1,high);
        merge(array,low,mid,high);
    }
    private void merge(int[] array,int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(array[left]<=array[right]){
                temp.add(array[left]);
                left++;
            }
            else{
                temp.add(array[right]);
                right++;
            }

        }
        while(left<=mid){
            temp.add(array[left]);
            left++;
        }
        while(right<=high){
            temp.add(array[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            array[i]=temp.get(i-low);
        }
    }

}