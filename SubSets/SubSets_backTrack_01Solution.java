/* Time Complexity : O(2^(m)) 
 *  m - length of the array - nums */
/* Space Complexity : O(h)
 * 	h - height of the recursion stack */
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :

//backtrack solution

class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        helper(nums, 0, new ArrayList<>());
        return result;
    }

    private void helper(int[] nums, int index, List<Integer> path) {
        //base case
        if(index == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        //logic
        //no choose
        helper(nums, index + 1, path);

        //choose
        //action
        path.add(nums[index]);
        //recurse
        helper(nums, index + 1, path);
        //backtrack
        path.remove(path.size() - 1);
    }
}