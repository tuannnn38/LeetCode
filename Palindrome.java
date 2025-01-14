package sample;


class Solution {
	/*
	 * Given an integer x, return true if x is a palindrome , and false otherwise. 
	 * Example 1:
	 * 
	 * Input: x = 121 Output: true Explanation: 121 reads as 121 from left to right
	 * and from right to left. Example 2:
	 * 
	 * Input: x = -121 Output: false Explanation: From left to right, it reads -121.
	 * From right to left, it becomes 121-. Therefore it is not a palindrome.
	 * Example 3:
	 * 
	 * Input: x = 10 Output: false Explanation: Reads 01 from right to left.
	 * Therefore it is not a palindrome.
	 * 
	 * Constraints:
	 * 
	 * -231 <= x <= 231 - 1
	 */
    public static boolean isPalindrome(int x) {
        if (x < 0) {
        	return false;
        }
        int length = String.valueOf(x).length()-1;
        String[] arr = String.valueOf(x).split("");
      
        for (int i = 0; i < Math.floor(String.valueOf(x).length()/2.0); i++){
            if (arr[i].equalsIgnoreCase(arr[length-i])) {
            	continue;
            } else {
            	return false;
            }
        }
        return true;
    }
	
	// best solution 
	public static boolean isPalindrome3(int x) {
		if (x < 0  || (x != 0 && x % 10 == 0))
		    return false;
		int half = 0;
		while (x > half){
		    half = half * 10 + x % 10;
		    x = x / 10;
		}
		    return x == half || x == (half / 10);
	}
	
	public static boolean isPalindrome2(int x) {
        String value = String.valueOf(x);
		StringBuilder sb = new StringBuilder(value);
		return sb.reverse().toString().equals(value);
    }
    
    public static void main(String[] args) {
    	System.out.println(isPalindrome(121));
	}
	
	/*
	What we need to remember:
	- Handling digits in numbers by division is better than converting to array of digit strings
	- There are some method in StringBuilder that support that we can use when we convert a integer to number. 
	- Using while is better than a for loop in some cases, especially in this case.
	
	
	*/
}
