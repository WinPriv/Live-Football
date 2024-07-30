package ka;

import java.util.HashMap;
import ka.ud;

/* loaded from: classes2.dex */
public final class p1 extends c0 {

    /* loaded from: classes2.dex */
    public static class a implements ud.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.huawei.android.hms.ppskit.a f31621a;

        /* renamed from: b, reason: collision with root package name */
        public final String f31622b;

        public a(com.huawei.android.hms.ppskit.a aVar, String str) {
            this.f31621a = aVar;
            this.f31622b = str;
        }

        @Override // ka.ud.a
        public final void a(int i10) {
            y.d(this.f31621a, this.f31622b, i10, "");
        }

        @Override // ka.ud.a
        public final void a(HashMap hashMap) {
            String q10 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, hashMap);
            y.d(this.f31621a, this.f31622b, 200, q10);
        }
    }

    public p1() {
        super("reqRewardAd");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0176  */
    @Override // ka.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.content.Context r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, com.huawei.android.hms.ppskit.a r26) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.p1.h(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.huawei.android.hms.ppskit.a):void");
    }
}
