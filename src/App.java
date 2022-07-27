
public class App {

	public static void main(String[] args) {

		Logger loggerA = new AsteriskLogger();
		loggerA.log("Hello");
		loggerA.error("Hello");
		
		Logger loggerS = new SpacedLogger();
		loggerS.log("Hola");
		loggerS.error("Hola");
		
	}

}

