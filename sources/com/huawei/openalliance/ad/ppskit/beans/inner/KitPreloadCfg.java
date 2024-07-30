package com.huawei.openalliance.ad.ppskit.beans.inner;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.List;
import ma.d;

@DataKeep
/* loaded from: classes2.dex */
public class KitPreloadCfg {

    @d(a = "plMode")
    private int preloadMode;

    @d(a = "plr")
    private int preloadRandom;

    @d(a = "pls")
    private List<String> preloadSchedule;

    public final int a() {
        return this.preloadMode;
    }

    public final List<String> b() {
        return this.preloadSchedule;
    }

    public final int c() {
        return this.preloadRandom;
    }
}
