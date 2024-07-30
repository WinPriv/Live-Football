package c6;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import c6.j;
import c6.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultDataSource.java */
/* loaded from: classes2.dex */
public final class q implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3415a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3416b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3417c;

    /* renamed from: d, reason: collision with root package name */
    public u f3418d;

    /* renamed from: e, reason: collision with root package name */
    public c f3419e;
    public g f;

    /* renamed from: g, reason: collision with root package name */
    public j f3420g;

    /* renamed from: h, reason: collision with root package name */
    public i0 f3421h;

    /* renamed from: i, reason: collision with root package name */
    public i f3422i;

    /* renamed from: j, reason: collision with root package name */
    public e0 f3423j;

    /* renamed from: k, reason: collision with root package name */
    public j f3424k;

    /* compiled from: DefaultDataSource.java */
    /* loaded from: classes2.dex */
    public static final class a implements j.a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f3425a;

        /* renamed from: b, reason: collision with root package name */
        public final j.a f3426b;

        public a(Context context) {
            r.a aVar = new r.a();
            this.f3425a = context.getApplicationContext();
            this.f3426b = aVar;
        }

        @Override // c6.j.a
        public final j a() {
            return new q(this.f3425a, this.f3426b.a());
        }
    }

    public q(Context context, j jVar) {
        this.f3415a = context.getApplicationContext();
        jVar.getClass();
        this.f3417c = jVar;
        this.f3416b = new ArrayList();
    }

    public static void l(j jVar, h0 h0Var) {
        if (jVar != null) {
            jVar.b(h0Var);
        }
    }

    @Override // c6.j
    public final void b(h0 h0Var) {
        h0Var.getClass();
        this.f3417c.b(h0Var);
        this.f3416b.add(h0Var);
        l(this.f3418d, h0Var);
        l(this.f3419e, h0Var);
        l(this.f, h0Var);
        l(this.f3420g, h0Var);
        l(this.f3421h, h0Var);
        l(this.f3422i, h0Var);
        l(this.f3423j, h0Var);
    }

    @Override // c6.j
    public final void close() throws IOException {
        j jVar = this.f3424k;
        if (jVar != null) {
            try {
                jVar.close();
            } finally {
                this.f3424k = null;
            }
        }
    }

    @Override // c6.j
    public final long f(m mVar) throws IOException {
        boolean z10;
        boolean z11 = true;
        if (this.f3424k == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        String scheme = mVar.f3377a.getScheme();
        int i10 = d6.g0.f27302a;
        Uri uri = mVar.f3377a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z11 = false;
        }
        Context context = this.f3415a;
        if (z11) {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f3419e == null) {
                    c cVar = new c(context);
                    this.f3419e = cVar;
                    k(cVar);
                }
                this.f3424k = this.f3419e;
            } else {
                if (this.f3418d == null) {
                    u uVar = new u();
                    this.f3418d = uVar;
                    k(uVar);
                }
                this.f3424k = this.f3418d;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f3419e == null) {
                c cVar2 = new c(context);
                this.f3419e = cVar2;
                k(cVar2);
            }
            this.f3424k = this.f3419e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                g gVar = new g(context);
                this.f = gVar;
                k(gVar);
            }
            this.f3424k = this.f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            j jVar = this.f3417c;
            if (equals) {
                if (this.f3420g == null) {
                    try {
                        j jVar2 = (j) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f3420g = jVar2;
                        k(jVar2);
                    } catch (ClassNotFoundException unused) {
                        d6.p.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.f3420g == null) {
                        this.f3420g = jVar;
                    }
                }
                this.f3424k = this.f3420g;
            } else if ("udp".equals(scheme)) {
                if (this.f3421h == null) {
                    i0 i0Var = new i0();
                    this.f3421h = i0Var;
                    k(i0Var);
                }
                this.f3424k = this.f3421h;
            } else if ("data".equals(scheme)) {
                if (this.f3422i == null) {
                    i iVar = new i();
                    this.f3422i = iVar;
                    k(iVar);
                }
                this.f3424k = this.f3422i;
            } else if (!com.anythink.expressad.exoplayer.j.y.f8940a.equals(scheme) && !"android.resource".equals(scheme)) {
                this.f3424k = jVar;
            } else {
                if (this.f3423j == null) {
                    e0 e0Var = new e0(context);
                    this.f3423j = e0Var;
                    k(e0Var);
                }
                this.f3424k = this.f3423j;
            }
        }
        return this.f3424k.f(mVar);
    }

    @Override // c6.j
    public final Map<String, List<String>> g() {
        j jVar = this.f3424k;
        if (jVar == null) {
            return Collections.emptyMap();
        }
        return jVar.g();
    }

    @Override // c6.j
    public final Uri getUri() {
        j jVar = this.f3424k;
        if (jVar == null) {
            return null;
        }
        return jVar.getUri();
    }

    public final void k(j jVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3416b;
            if (i10 < arrayList.size()) {
                jVar.b((h0) arrayList.get(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // c6.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        j jVar = this.f3424k;
        jVar.getClass();
        return jVar.read(bArr, i10, i11);
    }
}
