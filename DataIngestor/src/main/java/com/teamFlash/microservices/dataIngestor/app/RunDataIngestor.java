package com.teamFlash.microservices.dataIngestor.app;



import com.teamFlash.microservices.dataIngestor.routes.DataIngestorRouteBuilder;


public class RunDataIngestor {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		RunDataIngestor instance=new RunDataIngestor();
		final String port = (args.length == 1 ? args[0] : "8765");
		instance.boot(port);
	}

	@SuppressWarnings("deprecation")
	public void boot(String port) throws Exception {
	    System.setProperty("port", port);

	    // create a Main instance
	    
	  }
}
