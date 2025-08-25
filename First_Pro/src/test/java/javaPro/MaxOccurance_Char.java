package javaPro;

public class MaxOccurance_Char {
	
	public static void main(String[] args) {
		String s="manoj ssssss kushwaha Sarita Kus";
		int ar[] =new int[256];
		for(int i=0;i<s.length();i++) {
			ar[s.charAt(i)]=ar[s.charAt(i)]+1;
		}
		
		int max=-1;
		char C=' ';
		for(int i=0;i<s.length();i++) {
			if(max<ar[s.charAt(i)]) {
				max=ar[s.charAt(i)];
				C=s.charAt(i);
			}
		}
		System.out.println("max occurance Char --- > " + C);
		
		
	}

}
