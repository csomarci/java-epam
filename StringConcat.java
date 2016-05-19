

import java.util.Date;

public class StringConcat {

	public static void main(String[] args) {
		String a = "";
		long start = new Date().getTime();
		for (int i = 0; i < 50000; i ++) {
			a+=i;
		}
		System.out.println(new Date().getTime() - start);
		
		StringBuffer b = new StringBuffer();
		start = new Date().getTime();
		for (int i = 0; i < 50000; i ++) {
			b.append(i);
		}
		System.out.println(new Date().getTime() - start);
		

		StringBuilder bu = new StringBuilder();
		start = new Date().getTime();
		for (int i = 0; i < 50000; i ++) {
			bu.append(i);
		}
		System.out.println(new Date().getTime() - start);

		

	}

}
