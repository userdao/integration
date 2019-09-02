package de.bips.integration.file;

import java.lang.invoke.MethodHandles;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileTransfer {

  public static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  public static void main(String[] args) throws Exception {
    CamelContext context = new DefaultCamelContext();
    context.addRoutes(new FileRoutebuilder());

    context.start();
    Thread.sleep(1000);
    context.stop();

  }

}
