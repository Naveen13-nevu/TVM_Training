package com.Day4;

class Solution {
    public int lengthOfLastWord(String s) {
        
        int length =0;
        int i = s.length()-1;

        while(i>=0 && s.charAt(i) == ' '){
            i--;
        }
        while(i>=0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;
    }
}

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		String str = " Hi Iam Naveen  ";
		int result = s.lengthOfLastWord(str);
		System.out.println(result);
		

	}

}
