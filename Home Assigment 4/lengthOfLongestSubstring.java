class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low =  0;
        int high = 0;
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        while(high<s.length()){
            
            while(set.contains(s.charAt(high))){
                set.remove(s.charAt(low));
                low++;
            }
            if(!set.contains(s.charAt(high))){
                set.add(s.charAt(high));
            }
              high++;
            ans = Math.max(ans,high-low);
        
        }
        return ans;
    }
}