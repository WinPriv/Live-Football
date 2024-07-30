package com.anythink.core.api;

import java.util.List;

/* loaded from: classes.dex */
public class ATNetworkConfig {
    List<ATInitConfig> mATInitConfigList;

    /* loaded from: classes.dex */
    public static class Builder {
        List<ATInitConfig> mATInitConfigs;

        public ATNetworkConfig build() {
            ATNetworkConfig aTNetworkConfig = new ATNetworkConfig();
            aTNetworkConfig.mATInitConfigList = this.mATInitConfigs;
            return aTNetworkConfig;
        }

        public Builder withInitConfigList(List<ATInitConfig> list) {
            this.mATInitConfigs = list;
            return this;
        }
    }

    public List<ATInitConfig> getATInitConfigList() {
        return this.mATInitConfigList;
    }
}
