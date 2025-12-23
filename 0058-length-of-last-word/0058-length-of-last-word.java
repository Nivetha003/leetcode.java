class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for(char ch : s.toCharArray()){
            count++;
            if(ch==' '){
                count = 0;
            }
        }
      return count ;
          }
}