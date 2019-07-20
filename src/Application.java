
public class Application {

	public static void main(String[] args) {
		
		Logger AsteriskLogger = new AsteriskLogger();
		Logger SpacedLogger = new SpacedLogger();
		
		AsteriskLogger.log("Hello");
		AsteriskLogger.error("Hello");
		
		SpacedLogger.log("Hello");
		SpacedLogger.error("Hello");

	}

}
