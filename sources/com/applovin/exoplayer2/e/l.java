package com.applovin.exoplayer2.e;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface l {

    /* renamed from: a */
    public static final l f14910a = new com.applovin.exoplayer2.e.b.c(2);

    static /* synthetic */ h[] a() {
        return new h[0];
    }

    static /* synthetic */ h[] b() {
        return a();
    }

    h[] createExtractors();

    default h[] a(Uri uri, Map<String, List<String>> map) {
        return createExtractors();
    }
}
