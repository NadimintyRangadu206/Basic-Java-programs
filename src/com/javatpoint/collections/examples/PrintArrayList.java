package com.javatpoint.collections.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Student {
	private int studentId;
	private String name;
	private int rollNo;

	public Student(int studentId, String name, int rollNo) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.rollNo = rollNo;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", rollNo=" + rollNo + "]";
	}

}

public class PrintArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(70);
		list.add(80);
		list.add(30);
		list.add(40);
		list.add(120);
		list.add(330);
		list.add(70);
		System.out.println("print the arrayList elements:" + "\n" + list + "\n");

		System.out.println("Using for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();
		System.out.println("Using the For each loop:");
		for (Integer iCopy : list) {
			System.out.println(iCopy);
		}

		System.out.println();
		System.out.println("Using Iterator:");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer iretrive = it.next();
			System.out.println(iretrive);
		}

		System.out.println();
		System.out.println("Array list hashCode:");
		int hashCode = list.hashCode();
		System.out.println(hashCode);

		System.out.println();
		System.out.println("Size of the ArrayList:");
		int size = list.size();
		System.out.println(size + "\n");

		System.out.println("Check the isEmpty() condition");
		if (list.isEmpty()) {
			System.out.println("Elements are not present");
		} else {
			System.out.println("Elements are  present!");
		}

		System.out.println();
		System.out.println("Retrive the particular element:");
		for (int i = 0; i < list.size(); i++) {
			if (i == 5 || i == 1) {
				System.out.println(list.get(i));
				continue;
			}
		}

		System.out.println();
		System.out.println("Find the elements Position:");
		for (int i = 0; i < list.size(); i++) {
			if (i == (list.indexOf(50))) {
				System.out.println(list.get(i));// just i did this one not mandatory
			}
		}
		System.out.println(list.indexOf(50) + "\n");

		System.out.println("Print SubList:");
		System.out.println(list.subList(2, 6) + " ");

		System.out.println("Previous ArrayLists" + "\n" + list + "\n");

		System.out.println("Replace old element to new elemet:");
		System.out.println(list.set(6, 80));
		System.out.println(list + "\n");

		System.out.println("sorts the arraylist according to specified order");

		Collections.sort(list);
		System.out.println(list);

		System.out.println("converts an arraylist to an array");
		// ArrayList toArray() Method with Parameter
		Integer[] arr1 = new Integer[list.size()];
		list.toArray(arr1);
		Iterator<Integer> it1 = list.iterator();
		for (Integer cArray : arr1) {
			System.out.println(cArray);
		}
		// ArrayList toArray() Method without Parameter
		Object[] arr = list.toArray();
		for (Object i : arr) {
			System.out.println(i);
		}

		System.out.println(list.toString());
		System.out.println(list.lastIndexOf(arr1));

		System.out.println();
		System.out.println("Second ArrayList:");
		List<Integer> list2 = new ArrayList<>();

		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(80);
		list2.add(500);
		list2.add(600);
		System.out.println(list2 + "\n");

		System.out.println("Combined ArrayList");
		list.addAll(list2);
		System.out.println(list);

	System.out.println(list.removeAll(list2));
		// if(list.retainAll(list2)) {
		// System.out.println("Elements are match"+list);
		// }else {
		// System.out.println("Elements are not match!");
		// }

		System.out.println(list.retainAll(list2) + "\n");

		Student s1 = new Student(1, "Mahesh", 201);
		Student s2 = new Student(2, "priya", 202);
		Student s3 = new Student(3, "Raju", 203);
		Student s4 = new Student(4, "Ankit", 204);
		Student s5 = new Student(4, "Ankit", 204);

		ArrayList<Student> list3 = new ArrayList<>();

		list3.add(s2);
		list3.add(s4);
		list3.add(s3);
		list3.add(s1);
		list3.add(s4);
		list3.add(null);
		list3.add(null);

		System.out.println(list3 + "\n");

		System.out.println("Remove Duplicate objects:");
		Set<Student> set = new LinkedHashSet<>(list3);
		System.out.println(set);

		Map<Integer, Student> map = new HashMap<>();
		map.put(1, s1);
		map.put(2, s4);
		map.put(3, s2);
		map.put(4, s3);
		map.put(5, s5);
		map.put(null, null);
		System.out.println(map);

	}
}
