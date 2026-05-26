package com.day2;

import java.util.*;

class Students{
	
	int id;
	String name;
	
	Students(int id, String name){
		this.id = id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Id : "+ id + " name "+ name;
	}
	
	
}

public class RemoveObjectFromArrayList {

	public static void main(String[] args) {

		List<Students> list= new ArrayList<>();
		
		list.add(new Students(1,"naveen"));
		list.add(new Students(2,"praveen"));
		list.add(new Students(3,"ravi"));
		list.add(new Students(4,"anand"));
		list.add(new Students(5,"aravind"));
		list.add(new Students(6,"arun"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id you want to remove: ");
		int removeId = sc.nextInt();
		sc.nextLine();
		
		Iterator<Students> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Students s = iterator.next();
			
			if(s.id == removeId) {
				iterator.remove();
				System.out.println("Student removed sucessfully");
			}
		}
		
		for(Students s : list) {
			System.out.println(s);
		}
	}
}
