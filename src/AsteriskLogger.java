
public class AsteriskLogger implements Logger {
	
	public void log(String log) {
		
		StringBuilder str = new StringBuilder("******");
		
		for (int i = 0; i < log.length(); i ++) {
			  str.append("*");
		}
		System.out.println(str.toString());
		System.out.println("***" + log + "***");
		System.out.println(str.toString());
	}
	
	public void error(String error) {
		
		StringBuilder str = new StringBuilder("*************");
		
		for (int i = 0; i < error.length(); i++) {
			str.append("*");
		}
		System.out.println(str.toString());
		System.out.println("***Error: " + error + "***");
		System.out.println(str.toString());
	}
}
			
