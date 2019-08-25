import java.util.HashSet;

public class ValidPalindrome {
	
//  Question:
//	Given a string, determine if it is a palindrome, considering only alphanumeric characters
//	and ignoring cases.
//	For example,
//	"A man, a plan, a canal: Panama" is a palindrome.
//	"race a car" is not a palindrome.
	
	public boolean validPalindrome(String s) {
		int start = 0, end = s.length()-1;
		while(start < end) {
			while(start < end && !Character.isLetterOrDigit(s.charAt(start))) start++;
			while(start < end && !Character.isLetterOrDigit(s.charAt(end))) end--;
			if(start < end && s.charAt(start) != s.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
	
}

//	The Space complexity of this algorithm is O(1) because it does not use a datastructure to store 
// 	the characters. And the time complexity of the algorithm is O(n), where n represents the 
//	number of characters in the array that are to be iterated through in the worst case.
