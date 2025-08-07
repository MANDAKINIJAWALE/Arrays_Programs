class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        
        ArrayList<Integer> array=new ArrayList<>();
      
      PriorityQueue<Integer> queue=new PriorityQueue<>();
      
      for(int ele:arr)
      {
          queue.add(ele);   //nlogk
          if(queue.size()>k)
          {
            queue.poll();   //nlogk
          }
          
      }
      
      for(int ele:queue)
      {
          array.add(ele);  //logn     
      }
      
      array.sort(Collections.reverseOrder());
      return array;    //nlogn
        
    }
}