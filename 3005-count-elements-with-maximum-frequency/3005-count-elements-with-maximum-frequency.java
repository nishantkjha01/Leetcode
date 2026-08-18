class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int max=0;
        for(int key :map.keySet()){
             max=Math.max(max,map.get(key));
        }
        int max1=0;
        for(int key:map.keySet()){
            if(max==map.get(key)) max1+=map.get(key);
        }
        return max1;
    }
}