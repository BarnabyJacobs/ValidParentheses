package ValidParentheses;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
	
	 public boolean isValid(String s) {
		 
	        if(s.length() % 2 != 0) return false;
	        
	        Stack<Character> stack = new Stack<>();
	        List<Character> leftBrackets = new ArrayList<>();
	        
	        leftBrackets.add('(');
	        leftBrackets.add('{');
	        leftBrackets.add('[');
	       
	        for(char c : s.toCharArray()) {

	        	if(leftBrackets.contains(c))  { // if the character at the current index is a left bracket
	        		
	        		stack.push(c);
	        		System.out.println("I am a left bracket");
	        	} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') { 
	        		System.out.println("I am a complete bracket");
	        		stack.pop();
	        	
	        	}
	        	else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
	        		System.out.println("I am a complete curly braces");
	        		stack.pop();
	        		
	        	}
	        	else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
	        		System.out.println("I am a complete square bracket");
	        		stack.pop();
	        		
	        	} else {
	        		
	        		return false;
	        		
	        	}
	        }
	        return stack.isEmpty();

	    }
}
