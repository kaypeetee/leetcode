class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> hash = new HashMap<>();

        int l=0;
        int maxCount = 0;
        int maxWindow=0;

        for (int r=0; r<s.length(); r++){
            hash.put(s.charAt(r), hash.getOrDefault(s.charAt(r),0)+1);
            maxCount = Math.max(maxCount, hash.get(s.charAt(r)));

            //if window size - maximum count of letters is bigger than k> decrement and move the window
            while(r-l+1-maxCount>k){
                hash.put(s.charAt(l), hash.getOrDefault(s.charAt(l),0)-1);
                l++;
            }

            maxWindow = Math.max(maxWindow, r-l+1);
        }
        return maxWindow;
    }
}
