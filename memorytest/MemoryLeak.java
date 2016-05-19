

import java.util.ArrayList;
import java.util.List;

public class MemoryLeak {

	public static void main(String[] args) throws InterruptedException {
		List<byte[]> list = new ArrayList<byte[]>();
		while (true) {			
			Thread.sleep(1);
			list.add(new byte[10000]);
			if (list.size() % 1000 == 0) {
				System.out.printf("%s element added.\n", list.size());
			}
		}
	}
}
