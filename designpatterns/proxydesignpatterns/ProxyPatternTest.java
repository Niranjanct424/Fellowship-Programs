package proxydesignpatterns;

public class ProxyPatternTest {

	/**
	 * Proxy design pattern common uses are to control access 
	 * or to provide a wrapper implementation for better performance.
	 *Java RMI package uses proxy pattern
	 * @param args
	 */
	public static void main(String[] args) {
		CommandExecutor c = new CommandExecutorProxy("n", "tangodar");
		try {
			c.runCommand("echo");
			c.runCommand("ls -ltr");
			c.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
