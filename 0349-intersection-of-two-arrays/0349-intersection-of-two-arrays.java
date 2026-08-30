class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set =new HashSet<>();
        for (int i=0; i<nums1.length; i++){
            if (map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i])+1);
                
            } else{
                map.put(nums1[i],1);
            }
        }  
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                set.add(nums2[i]);
            }
        }
        int n=set.size();
        int[] arr=new int[n];
        int i=0;
        for(int x : set){
          arr[i]=x;
          i++;
        }
        return arr;
    }
}