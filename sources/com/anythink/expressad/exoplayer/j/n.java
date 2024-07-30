package com.anythink.expressad.exoplayer.j;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.anythink.expressad.exoplayer.k.af;

/* loaded from: classes.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8851a = "DefaultDataSource";

    /* renamed from: b, reason: collision with root package name */
    private static final String f8852b = "asset";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8853c = "content";

    /* renamed from: d, reason: collision with root package name */
    private static final String f8854d = "rtmp";

    /* renamed from: e, reason: collision with root package name */
    private static final String f8855e = "rawresource";
    private final Context f;

    /* renamed from: g, reason: collision with root package name */
    private final aa<? super h> f8856g;

    /* renamed from: h, reason: collision with root package name */
    private final h f8857h;

    /* renamed from: i, reason: collision with root package name */
    private h f8858i;

    /* renamed from: j, reason: collision with root package name */
    private h f8859j;

    /* renamed from: k, reason: collision with root package name */
    private h f8860k;

    /* renamed from: l, reason: collision with root package name */
    private h f8861l;

    /* renamed from: m, reason: collision with root package name */
    private h f8862m;

    /* renamed from: n, reason: collision with root package name */
    private h f8863n;
    private h o;

    private n(Context context, aa<? super h> aaVar, String str, boolean z10) {
        this(context, aaVar, str, z10, (byte) 0);
    }

    private h c() {
        if (this.f8858i == null) {
            this.f8858i = new r(this.f8856g);
        }
        return this.f8858i;
    }

    private h d() {
        if (this.f8859j == null) {
            this.f8859j = new c(this.f, this.f8856g);
        }
        return this.f8859j;
    }

    private h e() {
        if (this.f8860k == null) {
            this.f8860k = new e(this.f, this.f8856g);
        }
        return this.f8860k;
    }

    private h f() {
        if (this.f8861l == null) {
            try {
                this.f8861l = (h) Class.forName("com.anythink.expressad.exoplayer.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                Log.w(f8851a, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f8861l == null) {
                this.f8861l = this.f8857h;
            }
        }
        return this.f8861l;
    }

    private h g() {
        if (this.f8862m == null) {
            this.f8862m = new f();
        }
        return this.f8862m;
    }

    private h h() {
        if (this.f8863n == null) {
            this.f8863n = new y(this.f, this.f8856g);
        }
        return this.f8863n;
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final long a(k kVar) {
        com.anythink.expressad.exoplayer.k.a.b(this.o == null);
        String scheme = kVar.f8815c.getScheme();
        if (af.a(kVar.f8815c)) {
            if (kVar.f8815c.getPath().startsWith("/android_asset/")) {
                this.o = d();
            } else {
                if (this.f8858i == null) {
                    this.f8858i = new r(this.f8856g);
                }
                this.o = this.f8858i;
            }
        } else if (f8852b.equals(scheme)) {
            this.o = d();
        } else if ("content".equals(scheme)) {
            if (this.f8860k == null) {
                this.f8860k = new e(this.f, this.f8856g);
            }
            this.o = this.f8860k;
        } else if (f8854d.equals(scheme)) {
            this.o = f();
        } else if ("data".equals(scheme)) {
            if (this.f8862m == null) {
                this.f8862m = new f();
            }
            this.o = this.f8862m;
        } else if ("rawresource".equals(scheme)) {
            if (this.f8863n == null) {
                this.f8863n = new y(this.f, this.f8856g);
            }
            this.o = this.f8863n;
        } else {
            this.o = this.f8857h;
        }
        return this.o.a(kVar);
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final void b() {
        h hVar = this.o;
        if (hVar != null) {
            try {
                hVar.b();
            } finally {
                this.o = null;
            }
        }
    }

    private n(Context context, aa<? super h> aaVar, String str, boolean z10, byte b10) {
        this(context, aaVar, new p(str, null, aaVar, 8000, 8000, z10, null));
    }

    public n(Context context, aa<? super h> aaVar, h hVar) {
        this.f = context.getApplicationContext();
        this.f8856g = aaVar;
        this.f8857h = (h) com.anythink.expressad.exoplayer.k.a.a(hVar);
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final int a(byte[] bArr, int i10, int i11) {
        return this.o.a(bArr, i10, i11);
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    public final Uri a() {
        h hVar = this.o;
        if (hVar == null) {
            return null;
        }
        return hVar.a();
    }
}
