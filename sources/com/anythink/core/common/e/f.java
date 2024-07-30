package com.anythink.core.common.e;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f extends q {

    /* renamed from: a, reason: collision with root package name */
    public int f5604a;

    /* renamed from: b, reason: collision with root package name */
    public ah f5605b;

    /* renamed from: c, reason: collision with root package name */
    public long f5606c;

    @Override // com.anythink.core.common.e.q
    public final JSONObject a() {
        JSONObject A = this.f5605b.A(this.f5604a);
        if (A != null) {
            try {
                A.put("sdk_time", this.f5606c);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return A;
    }
}
