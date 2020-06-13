package com.teamFlash.microservices.registry.app;


import com.teamFlash.microservices.registry.routes.RouteRegistryService;

public class RunRegistryService {

	private Main main;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		RunRegistryService instance=new RunRegistryService();
		final String port = (args.length == 1 ? args[0] : "8765");
		instance.boot(port);
	}

	@SuppressWarnings("deprecation")
	public void boot(String port) throws Exception {
	    System.setProperty("port", port);

	    // create a Main instance
	    main = new Main();
	    // enable hangup support so you can press ctrl + c to terminate the JVM
	    main.enableHangupSupport();
	    // add routes
	    main.addRouteBuilder(new RouteRegistryService());

	    // run until you terminate the JVM
	    System.out.println(String.format("Starting Camel, using port %s. Use ctrl + c to terminate the JVM.", port));
	    main.run();
	  }

}
