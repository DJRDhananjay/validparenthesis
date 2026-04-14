import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String bracket="{()}";
		Stack<Character>stack=new Stack();
		for(int i=0;i<bracket.length();i++){
		    char ch=bracket.charAt(i);
		    if(ch=='{'||ch=='('){
		        stack.push(ch);
		    }else{
		        if(stack.isEmpty()){
		            System.out.println("Invalid");
		        }
		        char top=stack.pop();
		        if(ch==')'&& top!='('||ch=='}'&&top!='{'){
		            System.out.println("Invalid");
		        }
		}
		}
		System.out.println(stack.isEmpty()?"Valid":"Invalid");
	}
}
