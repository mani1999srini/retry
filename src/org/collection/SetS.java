package org.collection;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

public class SetS {

	public static void main(String[] args) {
		List <Integer>l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(70);
		l.add(80);
		l.add(90);
		l.add(10);
		System.out.println(l);
		Set<Integer>s=new HashSet<>();
		s.addAll(l);
		System.out.println(s);
//		int size = l.size();
//		System.out.println(size);
//		
//		for (Integer integer : l) {
//			System.out.println(integer);
//		}
	}

}
