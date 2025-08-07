class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        
        int large=-1;
        int secondLarge=-1;
        int thirdLarge=-1;
        
        if(arr.length<=2)
        {
            return -1;
        }
        
        for(int i=0;i<arr.length;i++)
        {
             if(arr[i]>large )
             {  
                 thirdLarge=secondLarge;
                 secondLarge=large;
                 large=arr[i];
             }
             else if(arr[i]>secondLarge)
             {   
                 thirdLarge=secondLarge;
                 secondLarge=arr[i];
             }
             else if(arr[i]>thirdLarge)
             {
                 thirdLarge=arr[i];
             }
        }
        return thirdLarge;
    }
}