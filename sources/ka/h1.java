package ka;

import java.util.HashMap;
import ka.te;

/* loaded from: classes2.dex */
public final class h1 extends c0 {

    /* loaded from: classes2.dex */
    public static class a implements te.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.huawei.android.hms.ppskit.a f31229a;

        /* renamed from: b, reason: collision with root package name */
        public final String f31230b;

        public a(com.huawei.android.hms.ppskit.a aVar, String str) {
            this.f31229a = aVar;
            this.f31230b = str;
        }

        @Override // ka.te.a
        public final void a(int i10) {
            y.d(this.f31229a, this.f31230b, i10, "");
        }

        @Override // ka.te.a
        public final void a(HashMap hashMap) {
            String q10 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, hashMap);
            y.d(this.f31229a, this.f31230b, 200, q10);
        }
    }

    public h1() {
        super("interstitial_ad_load");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ka.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.content.Context r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, com.huawei.android.hms.ppskit.a r30) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.h1.h(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.huawei.android.hms.ppskit.a):void");
    }

    @Override // ka.y, ka.b2
    public final void a() {
    }
}
