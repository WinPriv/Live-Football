package com.ironsource.mediationsdk.adunit.b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class h extends sb.a {
    public h(d dVar) {
        super(dVar);
    }

    public final void a(long j10, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        a(b.LOAD_AD_FAILED, hashMap);
    }

    public final void b(long j10, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        a(b.LOAD_AD_NO_FILL, hashMap);
    }

    public final void a(long j10, int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        a(b.LOAD_AD_FAILED_WITH_REASON, hashMap);
    }

    public final void a(long j10, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j10));
        if (z10) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.valueOf(z10));
        }
        a(b.LOAD_AD_SUCCESS, hashMap);
    }

    public final void a(boolean z10) {
        HashMap hashMap = new HashMap();
        if (z10) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.valueOf(z10));
        }
        a(b.LOAD_AD, hashMap);
    }

    public final void a(boolean z10, long j10, boolean z11) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j10));
        if (z11) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            hashMap.put("reason", "loaded ads are expired");
        }
        a(z10 ? b.AD_AVAILABILITY_CHANGED_TRUE : b.AD_AVAILABILITY_CHANGED_FALSE, hashMap);
    }
}
