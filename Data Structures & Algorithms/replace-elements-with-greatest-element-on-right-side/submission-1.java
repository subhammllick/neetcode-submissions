class Solution {
    public int[] replaceElements(int[] arr) {
        int i=0;
        int right=arr.length - 1;
        while(i < right) {
            int maxValue = arr[i + 1];
            for (int j = i+1; j <= right; j++) {
                if (arr[j] > maxValue) { 
                    maxValue = arr[j];
                }
            }
            arr[i]=maxValue;
            i++;
        }
        if (arr.length >0) {
            arr[arr.length -1]= -1;
        }
        return arr;       
    }
}