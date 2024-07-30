package com.anythink.expressad.foundation.g.f.h;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.d.c;
import com.anythink.expressad.foundation.g.f.d.d;
import com.anythink.expressad.foundation.g.f.d.g;
import com.anythink.expressad.foundation.g.f.e;
import com.anythink.expressad.foundation.g.f.i;
import com.anythink.expressad.foundation.g.f.l;
import com.anythink.expressad.foundation.g.f.m;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.p;
import com.anythink.expressad.out.k;
import com.huawei.openalliance.ad.constant.av;
import java.io.File;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f10024b = "a";

    /* renamed from: a, reason: collision with root package name */
    protected Context f10025a;

    public a(Context context) {
        if (context == null) {
            this.f10025a = com.anythink.expressad.foundation.b.a.b().d();
        } else {
            this.f10025a = context.getApplicationContext();
        }
    }

    private void b(int i10, String str, b bVar, e eVar) {
        b(i10, str, bVar, new com.anythink.expressad.foundation.g.f.b(), eVar);
    }

    public void a(String str, b bVar) {
        if (bVar != null) {
            bVar.a(av.ai, com.anythink.expressad.foundation.g.a.cy);
            StringBuilder sb2 = new StringBuilder();
            com.anythink.expressad.foundation.g.f.a.a();
            sb2.append(com.anythink.expressad.foundation.g.f.a.b());
            bVar.a("band_width", sb2.toString());
            String str2 = bVar.b().get("unit_id");
            if (str2 != null) {
                String a10 = k.a().a(str2, str);
                if (TextUtils.isEmpty(a10)) {
                    return;
                }
                bVar.a("ch_info", a10);
            }
        }
    }

    private void b(int i10, String str, b bVar, l lVar, e eVar) {
        i gVar;
        if (bVar == null) {
            try {
                bVar = new b();
            } catch (Exception e10) {
                o.a(f10024b, e10.getMessage());
            }
        }
        a(str, bVar);
        if (i10 == 0) {
            gVar = new g(1, str, bVar.toString(), eVar);
            gVar.a("Content-Type", "application/x-www-form-urlencoded");
        } else if (i10 == 1) {
            gVar = new d(1, str, bVar.toString(), eVar);
            gVar.a("Content-Type", "application/x-www-form-urlencoded");
        } else if (i10 != 2) {
            gVar = null;
        } else {
            gVar = new c(1, str, bVar.toString(), eVar);
            gVar.a("Content-Type", "application/x-www-form-urlencoded");
        }
        if (gVar != null) {
            gVar.a(lVar);
            m.a(gVar);
        }
    }

    public final void a(String str, b bVar, e eVar) {
        com.anythink.expressad.foundation.g.f.b bVar2 = new com.anythink.expressad.foundation.g.f.b();
        if (bVar == null) {
            try {
                bVar = new b();
            } catch (Exception e10) {
                o.a(f10024b, e10.getMessage());
            }
        }
        a(str, bVar);
        String str2 = bVar.b().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        bVar.a(com.anythink.expressad.foundation.d.c.f9454bb, String.valueOf(currentTimeMillis));
        bVar.a("st", p.a(str2 + currentTimeMillis));
        StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, "?");
        l10.append(bVar.toString());
        g gVar = new g(0, l10.toString(), null, eVar);
        gVar.a((l) bVar2);
        m.a(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r6, java.lang.String r7, com.anythink.expressad.foundation.g.f.h.b r8, com.anythink.expressad.foundation.g.f.l r9, com.anythink.expressad.foundation.g.f.e r10) {
        /*
            r5 = this;
            if (r8 != 0) goto L8
            com.anythink.expressad.foundation.g.f.h.b r0 = new com.anythink.expressad.foundation.g.f.h.b     // Catch: java.lang.Exception -> L41
            r0.<init>()     // Catch: java.lang.Exception -> L41
            r8 = r0
        L8:
            r5.a(r7, r8)     // Catch: java.lang.Exception -> L41
            java.util.Map r0 = r8.b()     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = "sign"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L41
            if (r0 != 0) goto L1b
            java.lang.String r0 = ""
        L1b:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = "ts"
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L41
            r8.a(r3, r4)     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = "st"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L41
            r4.<init>()     // Catch: java.lang.Exception -> L41
            r4.append(r0)     // Catch: java.lang.Exception -> L41
            r4.append(r1)     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = com.anythink.expressad.foundation.h.p.a(r0)     // Catch: java.lang.Exception -> L41
            r8.a(r3, r0)     // Catch: java.lang.Exception -> L41
            goto L4b
        L41:
            r0 = move-exception
            java.lang.String r1 = com.anythink.expressad.foundation.g.f.h.a.f10024b
            java.lang.String r0 = r0.getMessage()
            com.anythink.expressad.foundation.h.o.a(r1, r0)
        L4b:
            java.lang.String r0 = "?"
            java.lang.StringBuilder r7 = com.ironsource.adapters.facebook.a.l(r7, r0)
            java.lang.String r8 = r8.toString()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 0
            r0 = 0
            if (r6 == 0) goto L73
            r1 = 1
            if (r6 == r1) goto L6d
            r1 = 2
            if (r6 == r1) goto L67
            goto L79
        L67:
            com.anythink.expressad.foundation.g.f.d.c r6 = new com.anythink.expressad.foundation.g.f.d.c
            r6.<init>(r8, r7, r0, r10)
            goto L78
        L6d:
            com.anythink.expressad.foundation.g.f.d.d r6 = new com.anythink.expressad.foundation.g.f.d.d
            r6.<init>(r8, r7, r0, r10)
            goto L78
        L73:
            com.anythink.expressad.foundation.g.f.d.g r6 = new com.anythink.expressad.foundation.g.f.d.g
            r6.<init>(r8, r7, r0, r10)
        L78:
            r0 = r6
        L79:
            if (r0 == 0) goto L81
            r0.a(r9)
            com.anythink.expressad.foundation.g.f.m.a(r0)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.g.f.h.a.a(int, java.lang.String, com.anythink.expressad.foundation.g.f.h.b, com.anythink.expressad.foundation.g.f.l, com.anythink.expressad.foundation.g.f.e):void");
    }

    public static void a(File file, String str, e eVar) {
        m.a().a(file, str, (e<Void>) eVar);
    }

    private void a(int i10, String str, b bVar, e eVar) {
        String str2 = bVar.b().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        bVar.a(com.anythink.expressad.foundation.d.c.f9454bb, String.valueOf(currentTimeMillis));
        bVar.a("st", p.a(str2 + currentTimeMillis));
        b(i10, str, bVar, new com.anythink.expressad.foundation.g.f.b(), eVar);
    }
}
