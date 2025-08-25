package Inheritance_Class;

public class MainClass extends childClass{
	
	public static void main(String[] args) {
		parent1();
		parent2();
		chiel_1();
		chiel_2();
		
		sampleClass sc=new sampleClass();
		sc.parent1();
		sc.parent2();
		
	
	GeneralKey_Class gc=new GeneralKey_Class();
	gc.general_1();
	gc.general_2();
	
	childClass cc=new childClass();
	cc.chiel_1();
	cc.chiel_2();
	cc.parent1();
	cc.parent2();
		
	}

}
