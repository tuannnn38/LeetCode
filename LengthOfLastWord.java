package leetCode;

public class Palindrome {
	/*
	 * Given a string s consisting of words and spaces, return the length of the
	 * last word in the string.
	 * 
	 * A word is a maximal substring consisting of non-space characters only.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "Hello World" Output: 5 Explanation: The last word is "World" with
	 * length 5. Example 2:
	 * 
	 * Input: s = "   fly me   to   the moon  " Output: 4 Explanation: The last word
	 * is "moon" with length 4. Example 3:
	 * 
	 * Input: s = "luffy is still joyboy" Output: 6 Explanation: The last word is
	 * "joyboy" with length 6.
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 104 s consists of only English letters and spaces ' '. There
	 * will be at least one word in s.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lengthOfLastWord("Hello World");
		
	}
	  public static int lengthOfLastWord(String s) {
	        int size = s.split(" ").length;
	        return s.split(" ")[size-1].length();
	  }
	  public static int lengthOfLastWord2(String s) {
		  int count = 0;
	        for (int i=s.length()-1; i>=0; i--) {
	            if (s.charAt(i)==' ' && count==0){
	                continue;
	            } else if (s.charAt(i)==' ' && count>0){
	                break;
	            } else {
	                count++;
	            }
	        }
	        return count;
	  }
	  
//	  Use charAt when we need get character in String 
// 	  Using counter is good for most of the cases that return integer value.
}
