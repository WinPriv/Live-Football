package com.applovin.exoplayer2.k;

import android.content.Context;
import android.net.Uri;
import com.applovin.exoplayer2.k.i;
import com.applovin.exoplayer2.k.q;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class o implements i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16147a;

    /* renamed from: b, reason: collision with root package name */
    private final List<aa> f16148b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final i f16149c;

    /* renamed from: d, reason: collision with root package name */
    private i f16150d;

    /* renamed from: e, reason: collision with root package name */
    private i f16151e;
    private i f;

    /* renamed from: g, reason: collision with root package name */
    private i f16152g;

    /* renamed from: h, reason: collision with root package name */
    private i f16153h;

    /* renamed from: i, reason: collision with root package name */
    private i f16154i;

    /* renamed from: j, reason: collision with root package name */
    private i f16155j;

    /* renamed from: k, reason: collision with root package name */
    private i f16156k;

    /* loaded from: classes.dex */
    public static final class a implements i.a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f16157a;

        /* renamed from: b, reason: collision with root package name */
        private final i.a f16158b;

        /* renamed from: c, reason: collision with root package name */
        private aa f16159c;

        public a(Context context) {
            this(context, new q.a());
        }

        @Override // com.applovin.exoplayer2.k.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o a() {
            o oVar = new o(this.f16157a, this.f16158b.a());
            aa aaVar = this.f16159c;
            if (aaVar != null) {
                oVar.a(aaVar);
            }
            return oVar;
        }

        public a(Context context, i.a aVar) {
            this.f16157a = context.getApplicationContext();
            this.f16158b = aVar;
        }
    }

    public o(Context context, i iVar) {
        this.f16147a = context.getApplicationContext();
        this.f16149c = (i) com.applovin.exoplayer2.l.a.b(iVar);
    }

    private i d() {
        if (this.f16153h == null) {
            ab abVar = new ab();
            this.f16153h = abVar;
            a(abVar);
        }
        return this.f16153h;
    }

    private i e() {
        if (this.f16150d == null) {
            s sVar = new s();
            this.f16150d = sVar;
            a(sVar);
        }
        return this.f16150d;
    }

    private i f() {
        if (this.f16151e == null) {
            c cVar = new c(this.f16147a);
            this.f16151e = cVar;
            a(cVar);
        }
        return this.f16151e;
    }

    private i g() {
        if (this.f == null) {
            f fVar = new f(this.f16147a);
            this.f = fVar;
            a(fVar);
        }
        return this.f;
    }

    private i h() {
        if (this.f16152g == null) {
            try {
                i iVar = (i) Class.forName("com.applovin.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f16152g = iVar;
                a(iVar);
            } catch (ClassNotFoundException unused) {
                com.applovin.exoplayer2.l.q.c("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f16152g == null) {
                this.f16152g = this.f16149c;
            }
        }
        return this.f16152g;
    }

    private i i() {
        if (this.f16154i == null) {
            h hVar = new h();
            this.f16154i = hVar;
            a(hVar);
        }
        return this.f16154i;
    }

    private i j() {
        if (this.f16155j == null) {
            x xVar = new x(this.f16147a);
            this.f16155j = xVar;
            a(xVar);
        }
        return this.f16155j;
    }

    @Override // com.applovin.exoplayer2.k.i
    public void a(aa aaVar) {
        com.applovin.exoplayer2.l.a.b(aaVar);
        this.f16149c.a(aaVar);
        this.f16148b.add(aaVar);
        a(this.f16150d, aaVar);
        a(this.f16151e, aaVar);
        a(this.f, aaVar);
        a(this.f16152g, aaVar);
        a(this.f16153h, aaVar);
        a(this.f16154i, aaVar);
        a(this.f16155j, aaVar);
    }

    @Override // com.applovin.exoplayer2.k.i
    public Map<String, List<String>> b() {
        i iVar = this.f16156k;
        if (iVar == null) {
            return Collections.emptyMap();
        }
        return iVar.b();
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws IOException {
        i iVar = this.f16156k;
        if (iVar != null) {
            try {
                iVar.c();
            } finally {
                this.f16156k = null;
            }
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws IOException {
        com.applovin.exoplayer2.l.a.b(this.f16156k == null);
        String scheme = lVar.f16095a.getScheme();
        if (ai.a(lVar.f16095a)) {
            String path = lVar.f16095a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.f16156k = f();
            } else {
                this.f16156k = e();
            }
        } else if ("asset".equals(scheme)) {
            this.f16156k = f();
        } else if ("content".equals(scheme)) {
            this.f16156k = g();
        } else if ("rtmp".equals(scheme)) {
            this.f16156k = h();
        } else if ("udp".equals(scheme)) {
            this.f16156k = d();
        } else if ("data".equals(scheme)) {
            this.f16156k = i();
        } else if (!com.anythink.expressad.exoplayer.j.y.f8940a.equals(scheme) && !"android.resource".equals(scheme)) {
            this.f16156k = this.f16149c;
        } else {
            this.f16156k = j();
        }
        return this.f16156k.a(lVar);
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws IOException {
        return ((i) com.applovin.exoplayer2.l.a.b(this.f16156k)).a(bArr, i10, i11);
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        i iVar = this.f16156k;
        if (iVar == null) {
            return null;
        }
        return iVar.a();
    }

    private void a(i iVar) {
        for (int i10 = 0; i10 < this.f16148b.size(); i10++) {
            iVar.a(this.f16148b.get(i10));
        }
    }

    private void a(i iVar, aa aaVar) {
        if (iVar != null) {
            iVar.a(aaVar);
        }
    }
}
