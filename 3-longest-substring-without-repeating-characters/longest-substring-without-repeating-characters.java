class Solution {
    public int lengthOfLongestSubstring(String s) {
       int l = 0 , r = 0 , max = 0;
       char c;
       HashSet<Character> set = new HashSet<>();
       while(r < s.length()){
        c = s.charAt(r);
        if(!set.contains(c)){
            set.add(c);
            max = Math.max(max , r - l + 1);
            r++;
        }else{
            set.remove(s.charAt(l));
            l++;
        }
       }
       return max;
    }
}