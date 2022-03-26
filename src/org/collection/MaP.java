package org.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MaP {

	public static void main(String[] args) {
		Map<Integer, String>m=new TreeMap<>();
		m.put(10, "Java");
		m.put(20, "Sql");
		m.put(30, "Os");
		m.put(40, "Sql");
		m.put(50, "Python");
		m.put(60, "Mani");
		m.put(10, "Selenium");
		
		System.out.println(m);
		Set<Entry<Integer, String>> MS = m.entrySet();
		for (Entry<Integer, String> x : MS) {
			System.out.println(x.getKey());
			System.out.println(x.getValue());
			
		}
	}

}
