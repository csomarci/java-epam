
public class BitDemo {

	public static void main(String[] args) {
		int bitmask = 0x0002;
		int val = 0x0001;
		
		
		System.out.printf("bitmask:\t%s, %s\n", bitmask, Integer.toHexString(bitmask));
		System.out.printf("val:\t%s, %s\n", val, Integer.toHexString(val));
		System.out.printf("~bitmask:\t%s, %s\n", ~bitmask, Integer.toHexString(~bitmask));
		System.out.printf("bitmask<<val:\t%s, %s\n", bitmask<<val, Integer.toHexString(bitmask<<val));
		System.out.printf("bitmask>>val:\t%s, %s\n", bitmask>>val, Integer.toHexString(bitmask>>val));
		System.out.printf("bitmask>>>val:\t%s, %s\n", bitmask>>>val, Integer.toHexString(bitmask>>>val));
		System.out.printf("bitmask&val:\t%s, %s\n", bitmask&val, Integer.toHexString(bitmask&val));
		System.out.printf("bitmask^val:\t%s, %s\n", bitmask^val, Integer.toHexString(bitmask^val));
		System.out.printf("bitmask|val:\t%s, %s\n", bitmask|val, Integer.toHexString(bitmask|val));
	}

}
