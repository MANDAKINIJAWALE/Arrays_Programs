class Solution {
    // Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int k) {
        // Your code here
        
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        
        for(int ele:arr)  //n
        {
            queue.add(ele);  //nlogn  //add elements
            if(queue.size()>k)
            {
                queue.poll();  //nlogn   //remove smallest element everyTime
            }
            
        }
        return queue.peek();     //so overall time complexity nlogk --nlogn
        
        
    }
}