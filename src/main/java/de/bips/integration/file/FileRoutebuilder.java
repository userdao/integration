package de.bips.integration.file;

import java.lang.invoke.MethodHandles;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileRoutebuilder extends RouteBuilder {

  public static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  @Override
  public void configure() throws Exception {
    // from("file:d:/vids").to("file:d:/temp");
    logger.info("Routing from:");
  }

}
