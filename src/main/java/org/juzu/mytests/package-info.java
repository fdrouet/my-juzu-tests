@Application(defaultController = MyApplication.class)
@Servlet("/")
@Scripts({
    @Script( value = "my.js"),
    @Script( id="angular.js", value= "//ajax.googleapis.com/ajax/libs/angularjs/1.1.5/angular.min.js", location = AssetLocation.URL),
    @Script( id="bootstrap.js", value = "//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js", location = AssetLocation.URL)
})
@Stylesheets({
    @Stylesheet(value = "my.css"),
    @Stylesheet(id="bootstrap.css", value = "//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css", location = AssetLocation.URL)
})

@Assets({"angular.js", "bootstrap.js", "bootstrap.css", "my.js", "my.css"})
package org.juzu.mytests;

import juzu.Application;
import juzu.asset.AssetLocation;
import juzu.plugin.asset.*;
import juzu.plugin.servlet.Servlet;
