package com.anythink.network.vungle;

import com.anythink.core.api.ATInitConfig;

/* loaded from: classes.dex */
public class VungleATInitConfig extends ATInitConfig {
    public VungleATInitConfig(String str) {
        this.paramMap.put("app_id", str);
        this.initMediation = VungleATInitManager.getInstance();
    }
}
