package hello;

import java.util.*;
public class validps {
	public static boolean val(String str) {
		Stack<Character> stack= new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			 if(ch=='('||ch=='{'||ch=='[') {
				 stack.push(ch);
			 }
			 else {
				 if (stack.isEmpty()) return false;
	                char top = stack.pop();
	                if ((ch == ')' && top != '(') ||
	                    (ch == '}' && top != '{') ||
	                    (ch == ']' && top != '[')) {
	                    return false;
	                }
	            }
	        }
	        return stack.isEmpty();
	    }

	    public static void main(String[] args) {
	        System.out.println(val("{[()]}")); // true
	        System.out.println(val("{[(])}")); // false
	    }
}
