package de.bips.integration.file;

import org.apache.camel.builder.RouteBuilder;

public class FileRoutebuilder extends RouteBuilder {

  @Override
  public void configure() throws Exception {
    from("file:d:/vids").to("file:d:/temp");
  }

}
