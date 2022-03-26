package org.collection;

import java.util.ArrayList;
import java.util.List;

public class ListS {

	public static void main(String[] args) {
		List <Integer>l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(10);
		
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		Object object = l.get(1);
		System.out.println(object);
		
		for (int i = 0; i < l.size(); i++) {
			Integer a=l.get(i);
			System.out.println(a);
		}
	}

}
