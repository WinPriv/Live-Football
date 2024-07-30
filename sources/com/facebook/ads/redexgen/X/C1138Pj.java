package com.facebook.ads.redexgen.X;

import com.huawei.hms.ads.gl;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Pj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1138Pj {
    public float A00;
    public C0Q A01;
    public Map<String, String> A02;

    public C1138Pj(C0Q c0q) {
        this(c0q, gl.Code);
    }

    public C1138Pj(C0Q c0q, float f) {
        this(c0q, f, null);
    }

    public C1138Pj(C0Q c0q, float f, Map<String, String> windowParams) {
        this.A01 = c0q;
        this.A00 = f;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A02();
    }

    public final C0Q A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == C0Q.A0J;
    }
}
