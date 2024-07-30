package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.activity.k;
import androidx.appcompat.widget.n0;
import c6.a0;
import c6.b0;
import c6.c0;
import c6.d0;
import c6.h0;
import c6.j;
import c6.l;
import c6.t;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.d;
import d6.g0;
import d6.p;
import d6.y;
import j5.o;
import j5.s;
import j5.u;
import j5.x;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.n0;
import k4.q1;
import k4.z0;
import l4.w;

/* loaded from: classes2.dex */
public final class DashMediaSource extends j5.a {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f20120j0 = 0;
    public final boolean A;
    public final j.a B;
    public final a.InterfaceC0232a C;
    public final l3.d D;
    public final com.google.android.exoplayer2.drm.f E;
    public final a0 F;
    public final m5.a G;
    public final long H;
    public final x.a I;
    public final d0.a<? extends n5.c> J;
    public final e K;
    public final Object L;
    public final SparseArray<com.google.android.exoplayer2.source.dash.b> M;
    public final n0 N;
    public final k O;
    public final c P;
    public final c0 Q;
    public j R;
    public b0 S;
    public h0 T;
    public m5.b U;
    public Handler V;
    public n0.e W;
    public Uri X;
    public final Uri Y;
    public n5.c Z;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f20121c0;

    /* renamed from: d0, reason: collision with root package name */
    public long f20122d0;

    /* renamed from: e0, reason: collision with root package name */
    public long f20123e0;

    /* renamed from: f0, reason: collision with root package name */
    public long f20124f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f20125g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f20126h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f20127i0;

    /* renamed from: z, reason: collision with root package name */
    public final k4.n0 f20128z;

    /* loaded from: classes2.dex */
    public static final class Factory implements u.a {

        /* renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0232a f20129a;

        /* renamed from: b, reason: collision with root package name */
        public final j.a f20130b;

        /* renamed from: c, reason: collision with root package name */
        public o4.c f20131c = new com.google.android.exoplayer2.drm.c();

        /* renamed from: e, reason: collision with root package name */
        public a0 f20133e = new t();
        public final long f = 30000;

        /* renamed from: d, reason: collision with root package name */
        public final l3.d f20132d = new l3.d(0);

        public Factory(j.a aVar) {
            this.f20129a = new c.a(aVar);
            this.f20130b = aVar;
        }

        @Override // j5.u.a
        public final u.a a(a0 a0Var) {
            if (a0Var != null) {
                this.f20133e = a0Var;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }

        @Override // j5.u.a
        public final u.a b(o4.c cVar) {
            if (cVar != null) {
                this.f20131c = cVar;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }

        @Override // j5.u.a
        public final u c(k4.n0 n0Var) {
            d0.a aVar;
            n0Var.f30575t.getClass();
            d0.a dVar = new n5.d();
            List<StreamKey> list = n0Var.f30575t.f30632d;
            if (!list.isEmpty()) {
                aVar = new i5.c(dVar, list);
            } else {
                aVar = dVar;
            }
            return new DashMediaSource(n0Var, this.f20130b, aVar, this.f20129a, this.f20132d, this.f20131c.a(n0Var), this.f20133e, this.f);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements y.a {
        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q1 {
        public final n5.c A;
        public final k4.n0 B;
        public final n0.e C;

        /* renamed from: t, reason: collision with root package name */
        public final long f20135t;

        /* renamed from: u, reason: collision with root package name */
        public final long f20136u;

        /* renamed from: v, reason: collision with root package name */
        public final long f20137v;

        /* renamed from: w, reason: collision with root package name */
        public final int f20138w;

        /* renamed from: x, reason: collision with root package name */
        public final long f20139x;
        public final long y;

        /* renamed from: z, reason: collision with root package name */
        public final long f20140z;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, n5.c cVar, k4.n0 n0Var, n0.e eVar) {
            boolean z10;
            boolean z11 = cVar.f33357d;
            if (eVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            d6.a.d(z11 == z10);
            this.f20135t = j10;
            this.f20136u = j11;
            this.f20137v = j12;
            this.f20138w = i10;
            this.f20139x = j13;
            this.y = j14;
            this.f20140z = j15;
            this.A = cVar;
            this.B = n0Var;
            this.C = eVar;
        }

        @Override // k4.q1
        public final int b(Object obj) {
            int intValue;
            if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.f20138w) < 0 || intValue >= h()) {
                return -1;
            }
            return intValue;
        }

        @Override // k4.q1
        public final q1.b f(int i10, q1.b bVar, boolean z10) {
            String str;
            d6.a.c(i10, h());
            Integer num = null;
            n5.c cVar = this.A;
            if (z10) {
                str = cVar.b(i10).f33386a;
            } else {
                str = null;
            }
            if (z10) {
                num = Integer.valueOf(this.f20138w + i10);
            }
            long e10 = cVar.e(i10);
            long J = g0.J(cVar.b(i10).f33387b - cVar.b(0).f33387b) - this.f20139x;
            bVar.getClass();
            bVar.h(str, num, 0, e10, J, k5.a.y, false);
            return bVar;
        }

        @Override // k4.q1
        public final int h() {
            return this.A.c();
        }

        @Override // k4.q1
        public final Object l(int i10) {
            d6.a.c(i10, h());
            return Integer.valueOf(this.f20138w + i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00b7  */
        @Override // k4.q1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final k4.q1.c n(int r24, k4.q1.c r25, long r26) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.b.n(int, k4.q1$c, long):k4.q1$c");
        }

        @Override // k4.q1
        public final int o() {
            return 1;
        }
    }

    /* loaded from: classes2.dex */
    public final class c implements d.b {
        public c() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements d0.a<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static final Pattern f20142a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // c6.d0.a
        public final Object a(Uri uri, l lVar) throws IOException {
            long j10;
            long parseLong;
            String readLine = new BufferedReader(new InputStreamReader(lVar, i7.c.f29202c)).readLine();
            try {
                Matcher matcher = f20142a.matcher(readLine);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    long time = simpleDateFormat.parse(group).getTime();
                    if (!"Z".equals(matcher.group(2))) {
                        if ("+".equals(matcher.group(4))) {
                            j10 = 1;
                        } else {
                            j10 = -1;
                        }
                        long parseLong2 = Long.parseLong(matcher.group(5));
                        String group2 = matcher.group(7);
                        if (TextUtils.isEmpty(group2)) {
                            parseLong = 0;
                        } else {
                            parseLong = Long.parseLong(group2);
                        }
                        time -= ((((parseLong2 * 60) + parseLong) * 60) * 1000) * j10;
                    }
                    return Long.valueOf(time);
                }
                throw z0.b("Couldn't parse timestamp: " + readLine, null);
            } catch (ParseException e10) {
                throw z0.b(null, e10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class e implements b0.a<d0<n5.c>> {
        public e() {
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
        @Override // c6.b0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(c6.d0<n5.c> r18, long r19, long r21) {
            /*
                Method dump skipped, instructions count: 503
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.e.g(c6.b0$d, long, long):void");
        }

        @Override // c6.b0.a
        public final b0.b n(d0<n5.c> d0Var, long j10, long j11, IOException iOException, int i10) {
            b0.b bVar;
            d0<n5.c> d0Var2 = d0Var;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.getClass();
            long j12 = d0Var2.f3319a;
            c6.g0 g0Var = d0Var2.f3322d;
            Uri uri = g0Var.f3356c;
            o oVar = new o(g0Var.f3357d);
            long a10 = dashMediaSource.F.a(new a0.c(iOException, i10));
            if (a10 == com.anythink.expressad.exoplayer.b.f7291b) {
                bVar = b0.f;
            } else {
                bVar = new b0.b(0, a10);
            }
            dashMediaSource.I.k(oVar, d0Var2.f3321c, iOException, !bVar.a());
            return bVar;
        }

        @Override // c6.b0.a
        public final void q(d0<n5.c> d0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.z(d0Var, j10, j11);
        }
    }

    /* loaded from: classes2.dex */
    public final class f implements c0 {
        public f() {
        }

        @Override // c6.c0
        public final void a() throws IOException {
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.S.a();
            m5.b bVar = dashMediaSource.U;
            if (bVar == null) {
            } else {
                throw bVar;
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class g implements b0.a<d0<Long>> {
        public g() {
        }

        @Override // c6.b0.a
        public final void g(d0<Long> d0Var, long j10, long j11) {
            d0<Long> d0Var2 = d0Var;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.getClass();
            long j12 = d0Var2.f3319a;
            c6.g0 g0Var = d0Var2.f3322d;
            Uri uri = g0Var.f3356c;
            o oVar = new o(g0Var.f3357d);
            dashMediaSource.F.getClass();
            dashMediaSource.I.g(oVar, d0Var2.f3321c);
            dashMediaSource.f20124f0 = d0Var2.f.longValue() - j10;
            dashMediaSource.A(true);
        }

        @Override // c6.b0.a
        public final b0.b n(d0<Long> d0Var, long j10, long j11, IOException iOException, int i10) {
            d0<Long> d0Var2 = d0Var;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.getClass();
            long j12 = d0Var2.f3319a;
            c6.g0 g0Var = d0Var2.f3322d;
            Uri uri = g0Var.f3356c;
            dashMediaSource.I.k(new o(g0Var.f3357d), d0Var2.f3321c, iOException, true);
            dashMediaSource.F.getClass();
            p.d("DashMediaSource", "Failed to resolve time offset.", iOException);
            dashMediaSource.A(true);
            return b0.f3297e;
        }

        @Override // c6.b0.a
        public final void q(d0<Long> d0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.z(d0Var, j10, j11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements d0.a<Long> {
        @Override // c6.d0.a
        public final Object a(Uri uri, l lVar) throws IOException {
            return Long.valueOf(g0.M(new BufferedReader(new InputStreamReader(lVar)).readLine()));
        }
    }

    static {
        k4.g0.a("goog.exo.dash");
    }

    public DashMediaSource(k4.n0 n0Var, j.a aVar, d0.a aVar2, a.InterfaceC0232a interfaceC0232a, l3.d dVar, com.google.android.exoplayer2.drm.f fVar, a0 a0Var, long j10) {
        this.f20128z = n0Var;
        this.W = n0Var.f30576u;
        n0.g gVar = n0Var.f30575t;
        gVar.getClass();
        Uri uri = gVar.f30629a;
        this.X = uri;
        this.Y = uri;
        this.Z = null;
        this.B = aVar;
        this.J = aVar2;
        this.C = interfaceC0232a;
        this.E = fVar;
        this.F = a0Var;
        this.H = j10;
        this.D = dVar;
        this.G = new m5.a();
        this.A = false;
        this.I = r(null);
        this.L = new Object();
        this.M = new SparseArray<>();
        this.P = new c();
        this.f20126h0 = com.anythink.expressad.exoplayer.b.f7291b;
        this.f20124f0 = com.anythink.expressad.exoplayer.b.f7291b;
        this.K = new e();
        this.Q = new f();
        this.N = new androidx.appcompat.widget.n0(this, 6);
        this.O = new k(this, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean x(n5.g r5) {
        /*
            r0 = 0
            r1 = r0
        L2:
            java.util.List<n5.a> r2 = r5.f33388c
            int r3 = r2.size()
            if (r1 >= r3) goto L1d
            java.lang.Object r2 = r2.get(r1)
            n5.a r2 = (n5.a) r2
            int r2 = r2.f33346b
            r3 = 1
            if (r2 == r3) goto L1c
            r4 = 2
            if (r2 != r4) goto L19
            goto L1c
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            return r3
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.x(n5.g):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cf, code lost:
    
        if (r5 != com.anythink.expressad.exoplayer.b.f7291b) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0485, code lost:
    
        if (r9 > 0) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0488, code lost:
    
        if (r11 > 0) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x048b, code lost:
    
        if (r11 < 0) goto L236;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:204:0x0454. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(boolean r46) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.A(boolean):void");
    }

    public final void B() {
        Uri uri;
        this.V.removeCallbacks(this.N);
        if (this.S.c()) {
            return;
        }
        if (this.S.d()) {
            this.f20121c0 = true;
            return;
        }
        synchronized (this.L) {
            uri = this.X;
        }
        this.f20121c0 = false;
        d0 d0Var = new d0(this.R, uri, 4, this.J);
        this.I.m(new o(d0Var.f3319a, d0Var.f3320b, this.S.f(d0Var, this.K, this.F.c(4))), d0Var.f3321c);
    }

    @Override // j5.u
    public final void c(s sVar) {
        com.google.android.exoplayer2.source.dash.b bVar = (com.google.android.exoplayer2.source.dash.b) sVar;
        com.google.android.exoplayer2.source.dash.d dVar = bVar.E;
        dVar.A = true;
        dVar.f20181v.removeCallbacksAndMessages(null);
        for (l5.g<com.google.android.exoplayer2.source.dash.a> gVar : bVar.K) {
            gVar.z(bVar);
        }
        bVar.J = null;
        this.M.remove(bVar.f20146s);
    }

    @Override // j5.u
    public final k4.n0 d() {
        return this.f20128z;
    }

    @Override // j5.u
    public final void j() throws IOException {
        this.Q.a();
    }

    @Override // j5.u
    public final s p(u.b bVar, c6.b bVar2, long j10) {
        int intValue = ((Integer) bVar.f29835a).intValue() - this.f20127i0;
        x.a aVar = new x.a(this.f29643u.f29853c, 0, bVar, this.Z.b(intValue).f33387b);
        e.a aVar2 = new e.a(this.f29644v.f19979c, 0, bVar);
        int i10 = this.f20127i0 + intValue;
        n5.c cVar = this.Z;
        m5.a aVar3 = this.G;
        a.InterfaceC0232a interfaceC0232a = this.C;
        h0 h0Var = this.T;
        com.google.android.exoplayer2.drm.f fVar = this.E;
        a0 a0Var = this.F;
        long j11 = this.f20124f0;
        c0 c0Var = this.Q;
        l3.d dVar = this.D;
        c cVar2 = this.P;
        w wVar = this.y;
        d6.a.e(wVar);
        com.google.android.exoplayer2.source.dash.b bVar3 = new com.google.android.exoplayer2.source.dash.b(i10, cVar, aVar3, intValue, interfaceC0232a, h0Var, fVar, aVar2, a0Var, aVar, j11, c0Var, bVar2, dVar, cVar2, wVar);
        this.M.put(i10, bVar3);
        return bVar3;
    }

    @Override // j5.a
    public final void u(h0 h0Var) {
        this.T = h0Var;
        com.google.android.exoplayer2.drm.f fVar = this.E;
        fVar.b();
        Looper myLooper = Looper.myLooper();
        w wVar = this.y;
        d6.a.e(wVar);
        fVar.d(myLooper, wVar);
        if (this.A) {
            A(false);
            return;
        }
        this.R = this.B.a();
        this.S = new b0("DashMediaSource");
        this.V = g0.k(null);
        B();
    }

    @Override // j5.a
    public final void w() {
        n5.c cVar;
        this.f20121c0 = false;
        this.R = null;
        b0 b0Var = this.S;
        if (b0Var != null) {
            b0Var.e(null);
            this.S = null;
        }
        this.f20122d0 = 0L;
        this.f20123e0 = 0L;
        if (this.A) {
            cVar = this.Z;
        } else {
            cVar = null;
        }
        this.Z = cVar;
        this.X = this.Y;
        this.U = null;
        Handler handler = this.V;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.V = null;
        }
        this.f20124f0 = com.anythink.expressad.exoplayer.b.f7291b;
        this.f20125g0 = 0;
        this.f20126h0 = com.anythink.expressad.exoplayer.b.f7291b;
        this.f20127i0 = 0;
        this.M.clear();
        m5.a aVar = this.G;
        aVar.f32892a.clear();
        aVar.f32893b.clear();
        aVar.f32894c.clear();
        this.E.release();
    }

    public final void y() {
        boolean z10;
        long j10;
        b0 b0Var = this.S;
        a aVar = new a();
        Object obj = y.f27391b;
        synchronized (obj) {
            z10 = y.f27392c;
        }
        if (z10) {
            synchronized (obj) {
                if (y.f27392c) {
                    j10 = y.f27393d;
                } else {
                    j10 = com.anythink.expressad.exoplayer.b.f7291b;
                }
            }
            this.f20124f0 = j10;
            A(true);
            return;
        }
        if (b0Var == null) {
            b0Var = new b0("SntpClient");
        }
        b0Var.f(new y.c(), new y.b(aVar), 1);
    }

    public final void z(d0<?> d0Var, long j10, long j11) {
        long j12 = d0Var.f3319a;
        c6.g0 g0Var = d0Var.f3322d;
        Uri uri = g0Var.f3356c;
        o oVar = new o(g0Var.f3357d);
        this.F.getClass();
        this.I.d(oVar, d0Var.f3321c);
    }
}
