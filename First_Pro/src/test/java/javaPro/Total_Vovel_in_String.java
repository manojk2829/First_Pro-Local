package javaPro;

public class Total_Vovel_in_String {

	public static void main(String[] args) {
		totalVovel_count("aeiou USDFRTE");
	}
	
	
	public static void totalVovel_count(String v_string) {
		v_string=v_string.toLowerCase();
		int count=0;
		char[] ch=v_string.toCharArray();
		for(Character c:ch) {
			if(c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u')) {
				count++;
			}
		}
		System.out.println("Total Vovel count --- > " + count);
	} 

}
