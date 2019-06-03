package exercises;

import java.util.ArrayList;

public class Stack extends ArrayList<Object>{
	private static ArrayList<Object> stack;
	public static void print() {
		System.out.println();}
	
	
	public static void pop(ArrayList<Object> list) {
		list.remove(list.size()-1);}


public static void main (String [] args) {
	
	ArrayList<Object> list = new ArrayList<Object>();
	list.add("html");
	list.add("java");
	list.add("c++");
	list.add("ubuntu");
	
	print(list);
	Stack.pop(list);
	print(list);
Stack.pop(list);

print(list);
}


private static void print(ArrayList<Object> list) {
	System.out.println(list);
}}