package intro;

public class StringClass {
   public static void main(String[] args) {
	 
  }
   
   public void removeSpecialChar(String s) {	   
		  String new_String=s.replaceAll("[^a-zA-Z]", "");
		  System.out.println(new_String);
   }
}
