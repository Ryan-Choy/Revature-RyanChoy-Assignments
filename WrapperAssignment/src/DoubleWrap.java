
public class DoubleWrap {
	public static void main(String[] args) {

		Double d1 = 10d;
		Double d2 = 10d;
		Double d3 = new Double(10);

		System.out.println("d1==d2: " + (d1 == d2));
		System.out.println("d1==d3: " + (d1 == d2));

		System.out.println("(d1.equals(d2)) : " + (d1.equals(d2)));
		System.out.println("(d1.equals(d2)) : " + (d1.equals(d3)));

		System.out.println(System.identityHashCode(d1));
		System.out.println(System.identityHashCode(d2));
		System.out.println(System.identityHashCode(d3));

		d2++;
		System.out.println(System.identityHashCode(d2));

		double x = d2; // auto boxing -> obj to primitive
		System.out.println("x = " + x);
		x = 7;
		d2 = x;
		System.out.println("d2 = " + d2);

		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		String s = "123";
		double d = Double.parseDouble(s);
		System.out.println(d);

		d2 = 22.333d;
		System.out.println("Double: " + d2);

		Integer i = d2.intValue();
		System.out.println("Integer: " + i);
		Float f = d2.floatValue();
		System.out.println("Float: " + f);
		Long l = d2.longValue();
		System.out.println("Long: " + l);
		Short s1 = d2.shortValue();
		System.out.println("Short: " + s1);

		Double x1 = 19d;
		System.out.println(x1.compareTo(19d)); // both are same so it will give 0
		System.out.println(x1.compareTo(22d)); // 2nd value is greater then the first so it will give -ve value here
		System.out.println(x1.compareTo(10d)); // 1st value is greater then the second so it will give +ve value here

	}

}
