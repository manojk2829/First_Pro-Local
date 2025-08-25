package intro;

public class CallingCall {

	public static void main(String[] args) {
		EncapClass ec=new EncapClass("Manoj", "Sarita");
		ec.setCode("34634654");
		String code=ec.getCode();
		System.out.println(code);
	}

}
