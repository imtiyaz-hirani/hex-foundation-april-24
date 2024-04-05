package com.ds;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		 Queue<String> queue = new  LinkedList<>();
		 queue.add("harry");
		 queue.add("ronald");
		 queue.add("hermione");
		 System.out.println(queue); //[harry, ronald, hermione]
		 System.out.println(queue.size()); //3
		 System.out.println(queue.remove()); //harry
		 System.out.println(queue); //[ronald, hermione]
		 System.out.println(queue.size()); //2
		 System.out.println(queue.element()); //ronald
		 System.out.println(queue);//[ronald, hermione]
	}
}
/* 
 * [harry, ronald, hermione]
3
harry
[ronald, hermione]
2
ronald
[ronald, hermione]
 * 
 */