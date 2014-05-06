package org.juzu.mytests;

import javax.inject.Inject;
import juzu.Path;
import juzu.Response;
import juzu.Route;
import juzu.View;
import juzu.template.Template;

/**
 * Default controller for the demo application
 */
public class MyApplication {

  @Inject
  @Path("index.gtmpl")
  Template index;

  @View
  @Route("/")
  public Response index() {
    return index.ok();
  }
}
