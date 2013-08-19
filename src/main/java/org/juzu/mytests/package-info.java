@Application(defaultController = MyApplication.class)
@WebJars("angular.js")
@Assets (scripts = {
    @Script( src = "my.js"),
    @Script( id = "angular", src = "angular.js")
})
package org.juzu.mytests;

import juzu.Application;
import juzu.plugin.asset.Assets;
import juzu.plugin.asset.Script;
import juzu.plugin.webjars.WebJars;