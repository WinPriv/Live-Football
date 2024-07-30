package com.huawei.openalliance.ad.ppskit.utils;

import com.huawei.ads.adsrec.EngineUtil;
import com.huawei.ads.adsrec.IDsRelationCallback;
import com.huawei.ads.adsrec.IUtilCallback;

/* loaded from: classes2.dex */
public abstract class r1 {

    /* loaded from: classes2.dex */
    public static class a implements IDsRelationCallback {
    }

    /* loaded from: classes2.dex */
    public static class b implements IUtilCallback {
    }

    public static void a() {
        EngineUtil.setUtilCallback(new b());
        EngineUtil.setDsRelationCallback(new a());
    }
}
