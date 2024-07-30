package com.anythink.basead.f;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.s;

/* loaded from: classes.dex */
public abstract class c implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final String f3976h = "extra_request_id";

    /* renamed from: i, reason: collision with root package name */
    public static final String f3977i = "extra_scenario";

    /* renamed from: j, reason: collision with root package name */
    public static final String f3978j = "extra_orientation";

    /* renamed from: b, reason: collision with root package name */
    public String f3979b = getClass().getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    protected Context f3980c;

    /* renamed from: d, reason: collision with root package name */
    protected j f3981d;

    /* renamed from: e, reason: collision with root package name */
    protected String f3982e;
    protected boolean f;

    /* renamed from: g, reason: collision with root package name */
    protected s f3983g;

    public c(Context context, j jVar, String str, boolean z10) {
        this.f3980c = context.getApplicationContext();
        this.f3981d = jVar;
        this.f3982e = str;
        this.f = z10;
    }

    private com.anythink.basead.c.e b() {
        if (!TextUtils.isEmpty(this.f3982e) && !TextUtils.isEmpty(this.f3981d.f5654b)) {
            s a10 = com.anythink.basead.f.a.a.a(this.f3980c).a(this.f3981d.f5654b, this.f3982e);
            this.f3983g = a10;
            if (a10 == null) {
                return com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3752i, com.anythink.basead.c.f.f3766x);
            }
            if (this.f3981d.f5664m == null) {
                return com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3753j, com.anythink.basead.c.f.y);
            }
            return null;
        }
        return com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3752i, com.anythink.basead.c.f.f3763u);
    }

    @Override // com.anythink.basead.f.a
    public boolean a() {
        try {
            if (d()) {
                return com.anythink.basead.f.a.a.a(this.f3980c).a(this.f3983g, this.f3981d, this.f);
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final boolean d() {
        if (this.f3980c == null || TextUtils.isEmpty(this.f3981d.f5654b) || TextUtils.isEmpty(this.f3982e)) {
            return false;
        }
        if (this.f3983g == null) {
            s a10 = com.anythink.basead.f.a.a.a(this.f3980c).a(this.f3981d.f5654b, this.f3982e);
            this.f3983g = a10;
            if (a10 == null) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final s e() {
        return this.f3983g;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:2:0x0000, B:5:0x000a, B:8:0x0015, B:10:0x0029, B:12:0x0049, B:15:0x004d, B:17:0x0030, B:19:0x0036, B:21:0x0041), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[Catch: Exception -> 0x0062, TRY_LEAVE, TryCatch #0 {Exception -> 0x0062, blocks: (B:2:0x0000, B:5:0x000a, B:8:0x0015, B:10:0x0029, B:12:0x0049, B:15:0x004d, B:17:0x0030, B:19:0x0036, B:21:0x0041), top: B:1:0x0000 }] */
    @Override // com.anythink.basead.f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final com.anythink.basead.e.c r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.f3982e     // Catch: java.lang.Exception -> L62
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L62
            java.lang.String r1 = "30001"
            if (r0 != 0) goto L41
            com.anythink.core.common.e.j r0 = r5.f3981d     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = r0.f5654b     // Catch: java.lang.Exception -> L62
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L62
            if (r0 == 0) goto L15
            goto L41
        L15:
            android.content.Context r0 = r5.f3980c     // Catch: java.lang.Exception -> L62
            com.anythink.basead.f.a.a r0 = com.anythink.basead.f.a.a.a(r0)     // Catch: java.lang.Exception -> L62
            com.anythink.core.common.e.j r2 = r5.f3981d     // Catch: java.lang.Exception -> L62
            java.lang.String r2 = r2.f5654b     // Catch: java.lang.Exception -> L62
            java.lang.String r3 = r5.f3982e     // Catch: java.lang.Exception -> L62
            com.anythink.core.common.e.s r0 = r0.a(r2, r3)     // Catch: java.lang.Exception -> L62
            r5.f3983g = r0     // Catch: java.lang.Exception -> L62
            if (r0 != 0) goto L30
            java.lang.String r0 = "No fill, offer = null!"
            com.anythink.basead.c.e r0 = com.anythink.basead.c.f.a(r1, r0)     // Catch: java.lang.Exception -> L62
            goto L47
        L30:
            com.anythink.core.common.e.j r0 = r5.f3981d     // Catch: java.lang.Exception -> L62
            com.anythink.core.common.e.k r0 = r0.f5664m     // Catch: java.lang.Exception -> L62
            if (r0 != 0) goto L3f
            java.lang.String r0 = "30002"
            java.lang.String r1 = "No fill, setting = null!"
            com.anythink.basead.c.e r0 = com.anythink.basead.c.f.a(r0, r1)     // Catch: java.lang.Exception -> L62
            goto L47
        L3f:
            r0 = 0
            goto L47
        L41:
            java.lang.String r0 = "offerid、placementid can not be null!"
            com.anythink.basead.c.e r0 = com.anythink.basead.c.f.a(r1, r0)     // Catch: java.lang.Exception -> L62
        L47:
            if (r0 == 0) goto L4d
            r6.onAdLoadFailed(r0)     // Catch: java.lang.Exception -> L62
            return
        L4d:
            android.content.Context r0 = r5.f3980c     // Catch: java.lang.Exception -> L62
            com.anythink.basead.f.a.a r0 = com.anythink.basead.f.a.a.a(r0)     // Catch: java.lang.Exception -> L62
            com.anythink.core.common.e.j r1 = r5.f3981d     // Catch: java.lang.Exception -> L62
            java.lang.String r2 = r1.f5654b     // Catch: java.lang.Exception -> L62
            com.anythink.core.common.e.s r3 = r5.f3983g     // Catch: java.lang.Exception -> L62
            com.anythink.basead.f.c$1 r4 = new com.anythink.basead.f.c$1     // Catch: java.lang.Exception -> L62
            r4.<init>()     // Catch: java.lang.Exception -> L62
            r0.a(r2, r3, r1, r4)     // Catch: java.lang.Exception -> L62
            return
        L62:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r1 = "-9999"
            java.lang.String r0 = r0.getMessage()
            com.anythink.basead.c.e r0 = com.anythink.basead.c.f.a(r1, r0)
            r6.onAdLoadFailed(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.f.c.a(com.anythink.basead.e.c):void");
    }

    public void c() {
    }
}
