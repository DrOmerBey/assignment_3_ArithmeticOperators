package Assignment_3_ArithmeticOperators;

public class question_5 {
	
	public static void main(String[] args) {
	
		int seconds, minutes, hours, inputSeconds;
		inputSeconds=3695;
		hours = inputSeconds/3600;
		minutes= (inputSeconds/60)%60;
		seconds = inputSeconds%60;
		
		System.out.println(hours+ " hours, " + minutes + " minutes, " + seconds  + " seconds");
		
	}
}
