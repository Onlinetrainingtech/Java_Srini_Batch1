
public class StringP1 {

	public static void main(String[] args) {
		
		String s1="admin";
		String s2=new String("admin");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s2.charAt(2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.startsWith("a"));
		System.out.println(s1.endsWith("n"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());

	}

}
