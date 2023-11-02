/* Time Complexity : O(2^(m)) 
 *  m - length of the array - nums */
/* Space Complexity : O(h)
 * 	h - height of the recursion stack */
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :

//for loop backtrack solution

class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        helper(nums, 0, new ArrayList<>());
        return result;
    }

    private void helper(int[] nums, int pivot, List<Integer> path) {        
        //logic
        result.add(new ArrayList<>(path));
        for(int i = pivot; i < nums.length; i++){
            //action
            path.add(nums[i]);
            //recurse
            helper(nums, i + 1, path);
            //backtrack
            path.remove(path.size()-1);

        }
    }
}

/*
class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        helper(nums, 0, new ArrayList<>());
        return result;
    }

    private void helper(int[] nums, int pivot, List<Integer> path) {        
        //logic
        result.add(new ArrayList<>(path));
        for(int i = pivot; i < nums.length; i++){
            //action
            List<Integer> temp = new ArrayList<>(path);
            temp.add(nums[i]);
            //recurse
            helper(nums, i + 1, temp);
        }
    }
}
*/