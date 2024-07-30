package com.huawei.opendevice.open;

import com.huawei.hms.app.CoreApplication;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import ka.j;
import ka.n7;

@OuterVisible
/* loaded from: classes2.dex */
public class PpsRecommendationManager {

    /* renamed from: c, reason: collision with root package name */
    public static PpsRecommendationManager f24219c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f24220d = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public final Object f24222b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final j f24221a = new j(CoreApplication.getCoreBaseContext());

    private PpsRecommendationManager() {
    }

    @OuterVisible
    public static PpsRecommendationManager getInstance() {
        PpsRecommendationManager ppsRecommendationManager;
        synchronized (f24220d) {
            if (f24219c == null) {
                f24219c = new PpsRecommendationManager();
            }
            ppsRecommendationManager = f24219c;
        }
        return ppsRecommendationManager;
    }

    @OuterVisible
    public String getIntelligentRecommendationSwitch() {
        String a10;
        synchronized (this.f24222b) {
            try {
                a10 = this.f24221a.a();
            } catch (Throwable th) {
                n7.h("PpsRecommendationManager", "getIntelligentRecommendationSwitch ex: %s", th.getClass().getSimpleName());
                return "";
            }
        }
        return a10;
    }
}
