
public class SpacedLogger implements Logger {
	
	public void log(String log) {
		
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < log.length(); i ++) {
			str.append(log.charAt(i) + " ");
		}
		System.out.println(str.toString());
		
	}
	
	public void error(String error) {
		
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < error.length(); i ++) {
			str.append(error.charAt(i) + " ");
		}
		System.out.println("ERROR: " + str.toString());
	}

}
