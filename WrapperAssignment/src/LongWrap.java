
public class LongWrap {
	public static void main(String[] args) {
		Long l1 = 10l;
		Long l2 = 10l;
		Long l3 = new Long(10);
		
		System.out.println("l1==l2: " + (l1 == l2));
		System.out.println("l1==l3: " + (l1 == l2));

		System.out.println("(l1.equals(l2)) : " + (l1.equals(l2)));
		System.out.println("(l1.equals(l2)) : " + (l1.equals(l3)));

		System.out.println(System.identityHashCode(l1));
		System.out.println(System.identityHashCode(l2));
		System.out.println(System.identityHashCode(l3));

		l2++;
		System.out.println(System.identityHashCode(l2));

		long x = l2; // auto boxing -> obj to primitive
		System.out.println("x = " + x);
		x = 7;
		l2 = x;
		System.out.println("l2 = " + l2);

		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		String s = "123";
		long d = Long.parseLong(s);
		System.out.println(d);

		l2 = 220000000000000l;
		System.out.println("Long: " + l2);

		Integer i = l2.intValue();
		System.out.println("Integer: " + i);
		Float f = l2.floatValue();
		System.out.println("Float: " + f);
		Double d1 = l2.doubleValue();
		System.out.println("Double: " + d1);
		Short s1 = l2.shortValue();
		System.out.println("Short: " + s1);

		Long x1 = 19l;
		System.out.println(x1.compareTo(19l));// both are same so it will give 0
		System.out.println(x1.compareTo(22l));
		System.out.println(x1.compareTo(10l));

	}

}
