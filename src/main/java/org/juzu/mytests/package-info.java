@Application(defaultController = MyApplication.class)
@Assets (scripts = {
    @Script( src = "my.js")
})
package org.juzu.mytests;

import juzu.Application;
import juzu.plugin.asset.Assets;
import juzu.plugin.asset.Script;