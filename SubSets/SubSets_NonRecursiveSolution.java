/* Time Complexity : O(2^(n)) 
 *  n - length of the array - nums */
/* Space Complexity : O(m)
 * m - length of the temp array used for deep copy */
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :

//Non recursive solution

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int i = 0; i < nums.length; i++){
            int size = result.size();
            for(int j = 0; j < size; j++){
                List<Integer> temp = new ArrayList<>(result.get(j));
                temp.add(nums[i]);
                result.add(temp);
            }
        }
        return result;
    }
}

