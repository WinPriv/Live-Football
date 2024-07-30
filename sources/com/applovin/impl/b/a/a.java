package com.applovin.impl.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    public static List<d> a(p pVar, boolean z10) {
        if (!pVar.ae().b()) {
            return null;
        }
        Boolean a10 = com.applovin.impl.b.a.a().a(p.y());
        if (a10 != null && a10.booleanValue()) {
            return null;
        }
        if (z10) {
            return j.c(pVar);
        }
        boolean u2 = pVar.u();
        com.applovin.impl.sdk.c.d<Boolean> dVar = com.applovin.impl.sdk.c.d.f18751t;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) pVar.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) dVar, (com.applovin.impl.sdk.c.d<Boolean>) bool);
        Boolean bool3 = (Boolean) pVar.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) com.applovin.impl.sdk.c.d.f18750s, (com.applovin.impl.sdk.c.d<Boolean>) bool);
        if (u2) {
            if (!bool3.booleanValue() && !bool2.booleanValue()) {
                if (pVar.v() || pVar.ax().getConsentDialogState() != AppLovinSdkConfiguration.ConsentDialogState.APPLIES) {
                    return null;
                }
                return j.c(pVar);
            }
            return a(pVar);
        }
        return a(pVar);
    }

    private static List<d> a(p pVar) {
        if (AppLovinSdkConfiguration.ConsentDialogState.APPLIES == pVar.ax().getConsentDialogState()) {
            return j.c(pVar);
        }
        if (pVar.ae().d() != null) {
            return j.b(pVar);
        }
        return j.a(pVar);
    }
}
