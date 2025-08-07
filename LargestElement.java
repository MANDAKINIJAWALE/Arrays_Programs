class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int large=arr[0],secondLarge=-1;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                secondLarge=large;
                large=arr[i];
               
            }
            else if(arr[i]!=large && arr[i]>secondLarge)
            {
                secondLarge=arr[i];
            }
            
            
        }
        return secondLarge;
    }
}
