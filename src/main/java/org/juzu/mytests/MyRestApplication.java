package org.juzu.mytests;

import juzu.HttpMethod;
import juzu.MimeType;
import juzu.Resource;
import juzu.Route;
import juzu.plugin.jackson.Jackson;
import org.juzu.mytests.model.Software;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyRestApplication {

  private static final Logger LOGGER = LoggerFactory.getLogger(MyRestApplication.class);

  @Route("rest/app")
  @MimeType.JSON
  @Resource(method = HttpMethod.GET)
  @Jackson
  public Software getApp() {
    Software software = new Software();
    software.setId("00001");
    software.setName("eXo Platform");
    software.setDescription("eXo Platform is an open-source social-collaboration software designed for enterprises. It is full featured, based on standards, extensible and has an amazing design.");
    return software;
  }

  @Route("rest/app-save")
  @Resource(method = HttpMethod.POST)
  @MimeType.JSON
  @Jackson
  public Software saveApp(@Jackson Software software) {

    LOGGER.info("FAKE saving of the software : " + software.getName());

    software.setId(Math.round(Math.random() * 10000) + "");

    return software;
  }


}
