@Application(defaultController = MyApplication.class)
@Servlet("/")
@Scripts({
    @Script( value = "my.js"),
    @Script( id="jquery.js", value= "//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js", location = AssetLocation.URL),
    @Script( id="bootstrap.js", value = "//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js", location = AssetLocation.URL)
})
@Stylesheets({
    @Stylesheet(value = "my.css"),
    @Stylesheet(id="bootstrap.css", value = "//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css", location = AssetLocation.URL),
    @Stylesheet(id="bootstrap-theme.css", value = "//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css", location = AssetLocation.URL)
})

@Assets("*")
package org.juzu.mytests;

import juzu.Application;
import juzu.asset.AssetLocation;
import juzu.plugin.asset.*;
import juzu.plugin.servlet.Servlet;
