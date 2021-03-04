
public class FloatWrap {

	public static void main(String[] args) {
		Float f1 = 10f;
		Float f2 = 10f;
		Float f3 = new Float(10);

		System.out.println("f1==f2: " + (f1 == f2));
		System.out.println("f1==f3: " + (f1 == f2));

		System.out.println("(f1.equals(f2)) : " + (f1.equals(f2)));
		System.out.println("(f1.equals(f2)) : " + (f1.equals(f3)));

		System.out.println(System.identityHashCode(f1));
		System.out.println(System.identityHashCode(f2));
		System.out.println(System.identityHashCode(f3));

		f2++;
		System.out.println(System.identityHashCode(f2));

		float x = f2; // auto boxing -> obj to primitive
		System.out.println("x = " + x);
		x = 7;
		f2 = x;
		System.out.println("f2 = " + f2);

		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		String s = "123";
		float d = Float.parseFloat(s);
		System.out.println(d);

		f2 = 22.333f;
		System.out.println("Float: " + f2);

		Integer i = f2.intValue();
		System.out.println("Integer: " + i);
		Double d1 = f2.doubleValue();
		System.out.println("Double: " + d1);
		Long l = f2.longValue();
		System.out.println("Long: " + l);
		Short s1 = f2.shortValue();
		System.out.println("Short: " + s1);

		Float x1 = 19f;
		System.out.println(x1.compareTo(19f)); // both are same so it will give 0
		System.out.println(x1.compareTo(22f)); // 2nd value is greater then the first so it will give -ve value here
		System.out.println(x1.compareTo(10f)); // 1st value is greater then the second so it will give +ve value here

	}

}
//Assignment Wrapper classes -> Try the same above with Float, Double and Long classes
