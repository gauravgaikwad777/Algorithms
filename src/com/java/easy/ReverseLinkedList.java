package com.java.easy;

import java.util.LinkedList;

public class ReverseLinkedList {
	private Node head;
	 
	private static class Node {
		private int value;
		private Node next;
 
		Node(int value) {
			this.value = value;
 
		}
	}
 
	public void addToTheLast(Node node) {
 
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
 
			temp.next = node;
		}
	}
 
 
	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
 
	// Reverse linkedlist using this function 
	public static Node reverseLinkedList(Node currentNode)
	{
		// For first node, previousNode will be null
		Node previousNode=null;
		Node nextNode;
		while(currentNode!=null)
		{
			nextNode=currentNode.next;
			// reversing the link
			currentNode.next=previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode=currentNode;
			currentNode=nextNode;
		}
		return previousNode;
	}
 
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// Creating a linked list
		Node head=new Node(5);
		list.addLast(head);
		list.addLast(new Node(6));
		list.addLast(new Node(7));
		list.addLast(new Node(1));
		list.addLast(new Node(2));
 
//		list.printList(head);
		System.out.println(list.toString());
		
		//Reversing LinkedList
		Node reverseHead=reverseLinkedList(head);
		System.out.println("After reversing");
		System.out.println((reverseHead));
		
 
	}
 }
