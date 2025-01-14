package sample;


class Solution {
	
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
    
    public static void main(String[] args) {
    	System.out.println(isPalindrome(121));
	}
}
