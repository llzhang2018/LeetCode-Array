//  442. Find All Duplicates in an Array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        HashSet<Integer> hs=new HashSet<>();
        ArrayList<Integer> sl=new ArrayList<>();
        
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            flag=hs.add(nums[i]);
            if(flag==false)
                sl.add(nums[i]);
        }
        
        return sl;
    }
}