@Application(defaultController = MyApplication.class)
@Assets(scripts = {
    @Script( src = "my.js"),
    @Script( src = "//ajax.googleapis.com/ajax/libs/angularjs/1.1.5/angular.min.js", location = AssetLocation.URL),
    @Script( src = "//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js", location = AssetLocation.URL)
}, stylesheets = {
    @Stylesheet(src = "my.css"),
    @Stylesheet(src = "//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css", location = AssetLocation.URL)
})
package org.juzu.mytests;

import juzu.Application;
import juzu.asset.AssetLocation;
import juzu.plugin.asset.Assets;
import juzu.plugin.asset.Script;
import juzu.plugin.asset.Stylesheet;