class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> numcountmap = new HashMap<>();
        for (int i : nums){
            numcountmap.put(i,numcountmap.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:numcountmap.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return 0;
    }
}