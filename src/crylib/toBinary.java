package crylib;

public class toBinary<T>{
	
	T input;
	private String FINAL = "";
	
	public toBinary(T input) {
		input.getClass().getSimpleName();
		System.out.println(input.getClass().getSimpleName());
		
		switch (input.getClass().getSimpleName()) {
			case "Integer":
				FINAL = Integer.toBinaryString((int) input);
				break;
			case "String":
				char[] messChar = ((String) input).toCharArray();
			    for (int i = 0; i < messChar.length; i++) {
			    	FINAL += Integer.toBinaryString(messChar[i]) + " ";
			    }
				break;
			case "Double":
				break;
			}
	}
	
	public String getFinal() {
		return FINAL;
	}

}
