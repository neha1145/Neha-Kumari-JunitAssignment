package com.epam.collection_assignment;
import java.util.*;
public class Mycollect  {
	private List<Object> objlinkedlist;
	Mycollect(){
		objlinkedlist=new LinkedList<Object>();
	}
	void AddElement(Object x) {
			objlinkedlist.add(x);
	}
	void AddElementAtFirst(Object x) {
		((LinkedList<Object>) objlinkedlist).addFirst(x);
	}
	void AddElementAtLast(Object x) {
		((LinkedList<Object>) objlinkedlist).addLast(x);
	}
	void removeElement(int i) {
		objlinkedlist.remove(i);
	}
	void AddAtPosition(int i,Object x) {
		List<Object> alter=new Stack<Object>();
		Iterator<Object> p=objlinkedlist.iterator();
		int j=0;
		while(j<i-1)
		{
			((Stack<Object>) alter).push(p.next());
			objlinkedlist.remove(j);
			j++;
		}
		((LinkedList<Object>) objlinkedlist).addFirst(x);
		while(!(alter.isEmpty()))
		{
			((LinkedList<Object>) objlinkedlist).addFirst(((Stack<Object>) alter).pop());
		}
	}
	void display(){
		Iterator<Object> i=objlinkedlist.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	boolean iscontain(Object x) {
		return objlinkedlist.contains(x);
	}
}
