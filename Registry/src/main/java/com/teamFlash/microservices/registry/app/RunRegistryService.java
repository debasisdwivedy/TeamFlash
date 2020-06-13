package com.teamFlash.microservices.registry.app;

public class RunRegistryService {

	public static void main(final String[] args) throws Exception {
		// TODO Auto-generated method stub
		final RunRegistryService instance = new RunRegistryService();
		final String port = (args.length == 1 ? args[0] : "8765");
		instance.boot(port);
	}

	@SuppressWarnings("deprecation")
	public void boot(final String port) throws Exception {
	    System.setProperty("port", port);
	  }

}
