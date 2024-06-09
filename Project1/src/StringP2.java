
public class StringP2 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Welcome");
		System.out.println(sb.append("hai"));
		System.out.println(sb.insert(5,"azar"));
		System.out.println(sb.replace(3, 6,"****"));
		System.out.println(sb.delete(3,6));
		System.out.println(sb.reverse());

	}

}
