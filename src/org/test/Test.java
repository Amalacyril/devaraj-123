package org.test;

import com.rest.Rest;

public class Test extends Rest {
	public Test() {
		this(123);
		System.out.println("hari");
	}
	public Test(int id) {
	 this("david");
		System.out.println(id);
		
	}
	public Test(String name) {
		this('m');
		System.out.println(name);

	}
	public Test(char nt) {
		super();
		System.out.println(nt);
	}

	public static void main(String[] args) {
		Test a = new Test();
	}

}
