package p5;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.appcompat.app.p;
import c6.a0;
import c6.b0;
import c6.d0;
import c6.y;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import d6.g0;
import j5.o;
import j5.x;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.i0;
import k4.z0;
import p5.e;
import p5.f;
import p5.h;
import p5.j;

/* compiled from: DefaultHlsPlaylistTracker.java */
/* loaded from: classes2.dex */
public final class b implements j, b0.a<d0<g>> {
    public static final com.applovin.exoplayer2.b0 G = new com.applovin.exoplayer2.b0(20);
    public j.d A;
    public f B;
    public Uri C;
    public e D;
    public boolean E;

    /* renamed from: s, reason: collision with root package name */
    public final o5.h f34380s;

    /* renamed from: t, reason: collision with root package name */
    public final i f34381t;

    /* renamed from: u, reason: collision with root package name */
    public final a0 f34382u;

    /* renamed from: x, reason: collision with root package name */
    public x.a f34385x;
    public b0 y;

    /* renamed from: z, reason: collision with root package name */
    public Handler f34386z;

    /* renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArrayList<j.a> f34384w = new CopyOnWriteArrayList<>();

    /* renamed from: v, reason: collision with root package name */
    public final HashMap<Uri, C0459b> f34383v = new HashMap<>();
    public long F = com.anythink.expressad.exoplayer.b.f7291b;

    /* compiled from: DefaultHlsPlaylistTracker.java */
    /* loaded from: classes2.dex */
    public class a implements j.a {
        public a() {
        }

        @Override // p5.j.a
        public final void a() {
            b.this.f34384w.remove(this);
        }

        @Override // p5.j.a
        public final boolean g(Uri uri, a0.c cVar, boolean z10) {
            HashMap<Uri, C0459b> hashMap;
            C0459b c0459b;
            b bVar = b.this;
            if (bVar.D == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                f fVar = bVar.B;
                int i10 = g0.f27302a;
                List<f.b> list = fVar.f34431e;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int size = list.size();
                    hashMap = bVar.f34383v;
                    if (i11 >= size) {
                        break;
                    }
                    C0459b c0459b2 = hashMap.get(list.get(i11).f34442a);
                    if (c0459b2 != null && elapsedRealtime < c0459b2.f34394z) {
                        i12++;
                    }
                    i11++;
                }
                a0.b b10 = bVar.f34382u.b(new a0.a(1, 0, bVar.B.f34431e.size(), i12), cVar);
                if (b10 != null && b10.f3292a == 2 && (c0459b = hashMap.get(uri)) != null) {
                    C0459b.a(c0459b, b10.f3293b);
                }
            }
            return false;
        }
    }

    /* compiled from: DefaultHlsPlaylistTracker.java */
    /* renamed from: p5.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0459b implements b0.a<d0<g>> {
        public boolean A;
        public IOException B;

        /* renamed from: s, reason: collision with root package name */
        public final Uri f34388s;

        /* renamed from: t, reason: collision with root package name */
        public final b0 f34389t = new b0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: u, reason: collision with root package name */
        public final c6.j f34390u;

        /* renamed from: v, reason: collision with root package name */
        public e f34391v;

        /* renamed from: w, reason: collision with root package name */
        public long f34392w;

        /* renamed from: x, reason: collision with root package name */
        public long f34393x;
        public long y;

        /* renamed from: z, reason: collision with root package name */
        public long f34394z;

        public C0459b(Uri uri) {
            this.f34388s = uri;
            this.f34390u = b.this.f34380s.a();
        }

        public static boolean a(C0459b c0459b, long j10) {
            boolean z10;
            c0459b.f34394z = SystemClock.elapsedRealtime() + j10;
            b bVar = b.this;
            if (!c0459b.f34388s.equals(bVar.C)) {
                return false;
            }
            List<f.b> list = bVar.B.f34431e;
            int size = list.size();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    C0459b c0459b2 = bVar.f34383v.get(list.get(i10).f34442a);
                    c0459b2.getClass();
                    if (elapsedRealtime > c0459b2.f34394z) {
                        Uri uri = c0459b2.f34388s;
                        bVar.C = uri;
                        c0459b2.c(bVar.o(uri));
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                return false;
            }
            return true;
        }

        public final void b(Uri uri) {
            b bVar = b.this;
            d0 d0Var = new d0(this.f34390u, uri, 4, bVar.f34381t.a(bVar.B, this.f34391v));
            a0 a0Var = bVar.f34382u;
            int i10 = d0Var.f3321c;
            bVar.f34385x.m(new o(d0Var.f3319a, d0Var.f3320b, this.f34389t.f(d0Var, this, a0Var.c(i10))), i10);
        }

        public final void c(Uri uri) {
            this.f34394z = 0L;
            if (!this.A) {
                b0 b0Var = this.f34389t;
                if (!b0Var.d() && !b0Var.c()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j10 = this.y;
                    if (elapsedRealtime < j10) {
                        this.A = true;
                        b.this.f34386z.postDelayed(new p(8, this, uri), j10 - elapsedRealtime);
                    } else {
                        b(uri);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0226  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0231  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x00af  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d(p5.e r65) {
            /*
                Method dump skipped, instructions count: 720
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p5.b.C0459b.d(p5.e):void");
        }

        @Override // c6.b0.a
        public final void g(d0<g> d0Var, long j10, long j11) {
            d0<g> d0Var2 = d0Var;
            g gVar = d0Var2.f;
            c6.g0 g0Var = d0Var2.f3322d;
            Uri uri = g0Var.f3356c;
            o oVar = new o(g0Var.f3357d);
            if (gVar instanceof e) {
                d((e) gVar);
                b.this.f34385x.g(oVar, 4);
            } else {
                z0 b10 = z0.b("Loaded playlist has unexpected type.", null);
                this.B = b10;
                b.this.f34385x.k(oVar, 4, b10, true);
            }
            b.this.f34382u.getClass();
        }

        @Override // c6.b0.a
        public final b0.b n(d0<g> d0Var, long j10, long j11, IOException iOException, int i10) {
            boolean z10;
            int i11;
            d0<g> d0Var2 = d0Var;
            long j12 = d0Var2.f3319a;
            c6.g0 g0Var = d0Var2.f3322d;
            Uri uri = g0Var.f3356c;
            o oVar = new o(g0Var.f3357d);
            if (uri.getQueryParameter("_HLS_msn") != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = iOException instanceof h.a;
            b0.b bVar = b0.f3297e;
            Uri uri2 = this.f34388s;
            b bVar2 = b.this;
            int i12 = d0Var2.f3321c;
            if (z10 || z11) {
                if (iOException instanceof y) {
                    i11 = ((y) iOException).f3448v;
                } else {
                    i11 = Integer.MAX_VALUE;
                }
                if (z11 || i11 == 400 || i11 == 503) {
                    this.y = SystemClock.elapsedRealtime();
                    c(uri2);
                    x.a aVar = bVar2.f34385x;
                    int i13 = g0.f27302a;
                    aVar.k(oVar, i12, iOException, true);
                    return bVar;
                }
            }
            a0.c cVar = new a0.c(iOException, i10);
            Iterator<j.a> it = bVar2.f34384w.iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                z12 |= !it.next().g(uri2, cVar, false);
            }
            a0 a0Var = bVar2.f34382u;
            if (z12) {
                long a10 = a0Var.a(cVar);
                if (a10 != com.anythink.expressad.exoplayer.b.f7291b) {
                    bVar = new b0.b(0, a10);
                } else {
                    bVar = b0.f;
                }
            }
            boolean z13 = !bVar.a();
            bVar2.f34385x.k(oVar, i12, iOException, z13);
            if (z13) {
                a0Var.getClass();
            }
            return bVar;
        }

        @Override // c6.b0.a
        public final void q(d0<g> d0Var, long j10, long j11, boolean z10) {
            d0<g> d0Var2 = d0Var;
            long j12 = d0Var2.f3319a;
            c6.g0 g0Var = d0Var2.f3322d;
            Uri uri = g0Var.f3356c;
            o oVar = new o(g0Var.f3357d);
            b bVar = b.this;
            bVar.f34382u.getClass();
            bVar.f34385x.d(oVar, 4);
        }
    }

    public b(o5.h hVar, a0 a0Var, i iVar) {
        this.f34380s = hVar;
        this.f34381t = iVar;
        this.f34382u = a0Var;
    }

    @Override // p5.j
    public final boolean a(Uri uri) {
        int i10;
        C0459b c0459b = this.f34383v.get(uri);
        if (c0459b.f34391v == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, g0.S(c0459b.f34391v.f34412u));
        e eVar = c0459b.f34391v;
        if (!eVar.o && (i10 = eVar.f34397d) != 2 && i10 != 1 && c0459b.f34392w + max <= elapsedRealtime) {
            return false;
        }
        return true;
    }

    @Override // p5.j
    public final void b(Uri uri) throws IOException {
        C0459b c0459b = this.f34383v.get(uri);
        c0459b.f34389t.a();
        IOException iOException = c0459b.B;
        if (iOException == null) {
        } else {
            throw iOException;
        }
    }

    @Override // p5.j
    public final void c(j.a aVar) {
        aVar.getClass();
        this.f34384w.add(aVar);
    }

    @Override // p5.j
    public final void d(Uri uri, x.a aVar, j.d dVar) {
        boolean z10;
        this.f34386z = g0.k(null);
        this.f34385x = aVar;
        this.A = dVar;
        d0 d0Var = new d0(this.f34380s.a(), uri, 4, this.f34381t.b());
        if (this.y == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        b0 b0Var = new b0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.y = b0Var;
        a0 a0Var = this.f34382u;
        int i10 = d0Var.f3321c;
        aVar.m(new o(d0Var.f3319a, d0Var.f3320b, b0Var.f(d0Var, this, a0Var.c(i10))), i10);
    }

    @Override // p5.j
    public final void e(j.a aVar) {
        this.f34384w.remove(aVar);
    }

    @Override // p5.j
    public final long f() {
        return this.F;
    }

    @Override // c6.b0.a
    public final void g(d0<g> d0Var, long j10, long j11) {
        f fVar;
        d0<g> d0Var2 = d0Var;
        g gVar = d0Var2.f;
        boolean z10 = gVar instanceof e;
        if (z10) {
            String str = gVar.f34447a;
            f fVar2 = f.f34429n;
            Uri parse = Uri.parse(str);
            i0.a aVar = new i0.a();
            aVar.f30525a = "0";
            aVar.f30533j = com.anythink.expressad.exoplayer.k.o.T;
            fVar = new f("", Collections.emptyList(), Collections.singletonList(new f.b(parse, new i0(aVar), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            fVar = (f) gVar;
        }
        this.B = fVar;
        this.C = fVar.f34431e.get(0).f34442a;
        this.f34384w.add(new a());
        List<Uri> list = fVar.f34430d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f34383v.put(uri, new C0459b(uri));
        }
        c6.g0 g0Var = d0Var2.f3322d;
        Uri uri2 = g0Var.f3356c;
        o oVar = new o(g0Var.f3357d);
        C0459b c0459b = this.f34383v.get(this.C);
        if (z10) {
            c0459b.d((e) gVar);
        } else {
            c0459b.c(c0459b.f34388s);
        }
        this.f34382u.getClass();
        this.f34385x.g(oVar, 4);
    }

    @Override // p5.j
    public final boolean h() {
        return this.E;
    }

    @Override // p5.j
    public final f i() {
        return this.B;
    }

    @Override // p5.j
    public final boolean j(Uri uri, long j10) {
        if (this.f34383v.get(uri) != null) {
            return !C0459b.a(r2, j10);
        }
        return false;
    }

    @Override // p5.j
    public final void k() throws IOException {
        b0 b0Var = this.y;
        if (b0Var != null) {
            b0Var.a();
        }
        Uri uri = this.C;
        if (uri != null) {
            b(uri);
        }
    }

    @Override // p5.j
    public final void l(Uri uri) {
        C0459b c0459b = this.f34383v.get(uri);
        c0459b.c(c0459b.f34388s);
    }

    @Override // p5.j
    public final e m(Uri uri, boolean z10) {
        e eVar;
        HashMap<Uri, C0459b> hashMap = this.f34383v;
        e eVar2 = hashMap.get(uri).f34391v;
        if (eVar2 != null && z10 && !uri.equals(this.C)) {
            List<f.b> list = this.B.f34431e;
            boolean z11 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (uri.equals(list.get(i10).f34442a)) {
                    z11 = true;
                    break;
                }
                i10++;
            }
            if (z11 && ((eVar = this.D) == null || !eVar.o)) {
                this.C = uri;
                C0459b c0459b = hashMap.get(uri);
                e eVar3 = c0459b.f34391v;
                if (eVar3 != null && eVar3.o) {
                    this.D = eVar3;
                    ((HlsMediaSource) this.A).y(eVar3);
                } else {
                    c0459b.c(o(uri));
                }
            }
        }
        return eVar2;
    }

    @Override // c6.b0.a
    public final b0.b n(d0<g> d0Var, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        d0<g> d0Var2 = d0Var;
        long j12 = d0Var2.f3319a;
        c6.g0 g0Var = d0Var2.f3322d;
        Uri uri = g0Var.f3356c;
        o oVar = new o(g0Var.f3357d);
        long a10 = this.f34382u.a(new a0.c(iOException, i10));
        if (a10 == com.anythink.expressad.exoplayer.b.f7291b) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34385x.k(oVar, d0Var2.f3321c, iOException, z10);
        if (z10) {
            return b0.f;
        }
        return new b0.b(0, a10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Uri o(Uri uri) {
        e.b bVar;
        e eVar = this.D;
        if (eVar != null && eVar.f34413v.f34428e && (bVar = (e.b) eVar.f34411t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(bVar.f34415b));
            int i10 = bVar.f34416c;
            if (i10 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
            }
            return buildUpon.build();
        }
        return uri;
    }

    @Override // c6.b0.a
    public final void q(d0<g> d0Var, long j10, long j11, boolean z10) {
        d0<g> d0Var2 = d0Var;
        long j12 = d0Var2.f3319a;
        c6.g0 g0Var = d0Var2.f3322d;
        Uri uri = g0Var.f3356c;
        o oVar = new o(g0Var.f3357d);
        this.f34382u.getClass();
        this.f34385x.d(oVar, 4);
    }

    @Override // p5.j
    public final void stop() {
        this.C = null;
        this.D = null;
        this.B = null;
        this.F = com.anythink.expressad.exoplayer.b.f7291b;
        this.y.e(null);
        this.y = null;
        HashMap<Uri, C0459b> hashMap = this.f34383v;
        Iterator<C0459b> it = hashMap.values().iterator();
        while (it.hasNext()) {
            it.next().f34389t.e(null);
        }
        this.f34386z.removeCallbacksAndMessages(null);
        this.f34386z = null;
        hashMap.clear();
    }
}
