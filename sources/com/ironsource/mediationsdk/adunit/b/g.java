package com.ironsource.mediationsdk.adunit.b;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class g extends sb.a {
    public g(d dVar) {
        super(dVar);
    }

    public final void a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j10));
        a(b.INIT_ENDED, hashMap);
    }

    public final void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str + com.anythink.expressad.foundation.g.a.bQ + str2);
        a(b.INIT_STARTED, hashMap);
    }
}
