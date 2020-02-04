package proxydesignpatterns;

public class CommandExecutorProxy implements CommandExecutor {

	/**
	 * Now we want to provide only admin users to have full access of above class, 
	 * if the user is not admin then only limited commands will be allowed. 
	 * Here is our very simple proxy class implementation.
	 */
	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommandExecutorProxy(String user, String pwd){
		if("niranjan".equals(user) && "tangodar".equals(pwd)) isAdmin=true;
		executor = new CommandExecutorImpl();
	}
	
	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin){
			executor.runCommand(cmd);
		}else{
			if(cmd.trim().startsWith("rm")){
				throw new Exception("rm command is not allowed for non-admin users.");
			}else{
				executor.runCommand(cmd);
			}
		}
	}

}