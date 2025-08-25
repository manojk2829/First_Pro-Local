package intro;

public class EncapClass {
	
	EncapClass(String userPass,String Code){
		System.out.println("User Name and PassCode");
		System.out.println(userPass);
		System.out.println(Code);
	}

	private String userPass;
	private String Code;
	
	public void setPass(String userPass) {
		this.userPass=userPass;
	}
	
	public void setCode(String Code) {
		this.Code=Code;
	}
	
	public String getPass() {
		return userPass;
	}
	
	public String getCode() {
		return Code;
	}
}
