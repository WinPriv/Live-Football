package com.anythink.expressad.mbbanner.a.e;

import a3.l;
import android.os.Handler;
import android.os.Looper;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.o;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10398a = "a";

    /* renamed from: b, reason: collision with root package name */
    private final Handler f10399b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private boolean f10400c;

    public final void b(final com.anythink.expressad.mbbanner.a.c.b bVar, final String str) {
        l.B(str, "postResourceFail unitId=", f10398a);
        this.f10399b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.4
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.mbbanner.a.c.b bVar2 = bVar;
                if (bVar2 != null) {
                    boolean unused = a.this.f10400c;
                    bVar2.b();
                }
            }
        });
    }

    private void a(boolean z10) {
        this.f10400c = z10;
    }

    private void a(final com.anythink.expressad.mbbanner.a.c.b bVar, final d dVar, final String str) {
        l.B(str, "postCampaignSuccess unitId=", f10398a);
        this.f10399b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.mbbanner.a.c.b bVar2 = bVar;
                if (bVar2 != null) {
                    d dVar2 = dVar;
                    boolean unused = a.this.f10400c;
                    bVar2.a(dVar2);
                }
            }
        });
    }

    public final void a(final com.anythink.expressad.mbbanner.a.c.b bVar, final String str, final String str2) {
        o.b(f10398a, "postCampaignFail errorMsg=" + str + " unitId=" + str2);
        this.f10399b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.2
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.mbbanner.a.c.b bVar2 = bVar;
                if (bVar2 != null) {
                    String str3 = str;
                    boolean unused = a.this.f10400c;
                    bVar2.a(str3);
                }
            }
        });
    }

    public final void a(final com.anythink.expressad.mbbanner.a.c.b bVar, final String str) {
        l.B(str, "postResourceSuccess unitId=", f10398a);
        this.f10399b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.3
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.mbbanner.a.c.b bVar2 = bVar;
                if (bVar2 != null) {
                    boolean unused = a.this.f10400c;
                    bVar2.a();
                }
            }
        });
    }
}
