package de.bips.integration.file;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class FileTransfer {

  public static void main(String[] args) throws Exception {
    CamelContext context = new DefaultCamelContext();
    context.addRoutes(new FileRoutebuilder());

    context.start();
    Thread.sleep(1000);
    context.stop();

  }

}
