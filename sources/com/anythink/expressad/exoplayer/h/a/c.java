package com.anythink.expressad.exoplayer.h.a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.anythink.expressad.exoplayer.ae;
import com.anythink.expressad.exoplayer.h.a.b;
import com.anythink.expressad.exoplayer.h.f;
import com.anythink.expressad.exoplayer.h.l;
import com.anythink.expressad.exoplayer.h.o;
import com.anythink.expressad.exoplayer.h.r;
import com.anythink.expressad.exoplayer.h.s;
import com.anythink.expressad.exoplayer.j.h;
import com.anythink.expressad.exoplayer.j.k;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends f<s.a> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8162a = "AdsMediaSource";

    /* renamed from: b, reason: collision with root package name */
    private final s f8163b;

    /* renamed from: c, reason: collision with root package name */
    private final e f8164c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.h.a.b f8165d;

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f8166e;
    private final Handler f;

    /* renamed from: g, reason: collision with root package name */
    private final d f8167g;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f8168h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<s, List<l>> f8169i;

    /* renamed from: j, reason: collision with root package name */
    private final ae.a f8170j;

    /* renamed from: k, reason: collision with root package name */
    private C0108c f8171k;

    /* renamed from: l, reason: collision with root package name */
    private ae f8172l;

    /* renamed from: m, reason: collision with root package name */
    private Object f8173m;

    /* renamed from: n, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.h.a.a f8174n;
    private s[][] o;

    /* renamed from: p, reason: collision with root package name */
    private long[][] f8175p;

    /* loaded from: classes.dex */
    public static final class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public static final int f8180a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f8181b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f8182c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f8183d = 3;

        /* renamed from: e, reason: collision with root package name */
        public final int f8184e;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.expressad.exoplayer.h.a.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public @interface InterfaceC0107a {
        }

        private a(int i10, Exception exc) {
            super(exc);
            this.f8184e = i10;
        }

        public static a a(Exception exc) {
            return new a(0, exc);
        }

        private static a b(Exception exc) {
            return new a(2, exc);
        }

        private static a a(Exception exc, int i10) {
            return new a(1, new IOException("Failed to load ad group ".concat(String.valueOf(i10)), exc));
        }

        private static a a(RuntimeException runtimeException) {
            return new a(3, runtimeException);
        }

        private RuntimeException a() {
            com.anythink.expressad.exoplayer.k.a.b(this.f8184e == 3);
            return (RuntimeException) getCause();
        }
    }

    /* loaded from: classes.dex */
    public final class b implements l.a {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f8186b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8187c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8188d;

        public b(Uri uri, int i10, int i11) {
            this.f8186b = uri;
            this.f8187c = i10;
            this.f8188d = i11;
        }

        @Override // com.anythink.expressad.exoplayer.h.l.a
        public final void a(s.a aVar, final IOException iOException) {
            c.this.a(aVar).a(new k(this.f8186b), a.a(iOException));
            c.this.f8168h.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.h.a.c.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.anythink.expressad.exoplayer.h.a.b unused = c.this.f8165d;
                    int unused2 = b.this.f8187c;
                    int unused3 = b.this.f8188d;
                }
            });
        }
    }

    /* renamed from: com.anythink.expressad.exoplayer.h.a.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0108c implements b.a {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f8192b = new Handler();

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f8193c;

        public C0108c() {
        }

        @Override // com.anythink.expressad.exoplayer.h.a.b.a
        public final void b() {
            if (!this.f8193c && c.this.f != null && c.this.f8167g != null) {
                c.this.f.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.h.a.c.c.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (!C0108c.this.f8193c) {
                            d unused = c.this.f8167g;
                        }
                    }
                });
            }
        }

        public final void c() {
            this.f8193c = true;
            this.f8192b.removeCallbacksAndMessages(null);
        }

        @Override // com.anythink.expressad.exoplayer.h.a.b.a
        public final void a(final com.anythink.expressad.exoplayer.h.a.a aVar) {
            if (this.f8193c) {
                return;
            }
            this.f8192b.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.h.a.c.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (C0108c.this.f8193c) {
                        return;
                    }
                    c.a(c.this, aVar);
                }
            });
        }

        @Override // com.anythink.expressad.exoplayer.h.a.b.a
        public final void a() {
            if (this.f8193c || c.this.f == null || c.this.f8167g == null) {
                return;
            }
            c.this.f.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.h.a.c.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (!C0108c.this.f8193c) {
                        d unused = c.this.f8167g;
                    }
                }
            });
        }

        @Override // com.anythink.expressad.exoplayer.h.a.b.a
        public final void a(final a aVar, k kVar) {
            if (this.f8193c) {
                return;
            }
            c.this.a((s.a) null).a(kVar, aVar);
            if (c.this.f == null || c.this.f8167g == null) {
                return;
            }
            c.this.f.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.h.a.c.c.4
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z10;
                    if (!C0108c.this.f8193c) {
                        if (aVar.f8184e == 3) {
                            d unused = c.this.f8167g;
                            a aVar2 = aVar;
                            if (aVar2.f8184e == 3) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            com.anythink.expressad.exoplayer.k.a.b(z10);
                            aVar2.getCause();
                            return;
                        }
                        d unused2 = c.this.f8167g;
                    }
                }
            });
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c();

        void d();
    }

    /* loaded from: classes.dex */
    public interface e {
        int[] a();

        s b(Uri uri);
    }

    private c(s sVar, h.a aVar, com.anythink.expressad.exoplayer.h.a.b bVar, ViewGroup viewGroup) {
        this(sVar, new o.c(aVar), bVar, viewGroup, (Handler) null, (d) null);
    }

    private c(s sVar, e eVar, com.anythink.expressad.exoplayer.h.a.b bVar, ViewGroup viewGroup) {
        this(sVar, eVar, bVar, viewGroup, (Handler) null, (d) null);
    }

    private void c() {
        ae dVar;
        com.anythink.expressad.exoplayer.h.a.a aVar = this.f8174n;
        if (aVar == null || this.f8172l == null) {
            return;
        }
        com.anythink.expressad.exoplayer.h.a.a a10 = aVar.a(this.f8175p);
        this.f8174n = a10;
        if (a10.f8153g == 0) {
            dVar = this.f8172l;
        } else {
            dVar = new com.anythink.expressad.exoplayer.h.a.d(this.f8172l, this.f8174n);
        }
        a(dVar, this.f8173m);
    }

    @Override // com.anythink.expressad.exoplayer.h.f
    public final /* bridge */ /* synthetic */ s.a a(s.a aVar, s.a aVar2) {
        s.a aVar3 = aVar;
        return aVar3.a() ? aVar3 : aVar2;
    }

    @Deprecated
    private c(s sVar, h.a aVar, com.anythink.expressad.exoplayer.h.a.b bVar, ViewGroup viewGroup, Handler handler, d dVar) {
        this(sVar, new o.c(aVar), bVar, viewGroup, handler, dVar);
    }

    private void b(ae aeVar, Object obj) {
        this.f8172l = aeVar;
        this.f8173m = obj;
        c();
    }

    @Deprecated
    private c(s sVar, e eVar, com.anythink.expressad.exoplayer.h.a.b bVar, ViewGroup viewGroup, Handler handler, d dVar) {
        this.f8163b = sVar;
        this.f8164c = eVar;
        this.f8165d = bVar;
        this.f8166e = viewGroup;
        this.f = handler;
        this.f8167g = dVar;
        this.f8168h = new Handler(Looper.getMainLooper());
        this.f8169i = new HashMap();
        this.f8170j = new ae.a();
        this.o = new s[0];
        this.f8175p = new long[0];
    }

    @Override // com.anythink.expressad.exoplayer.h.f
    public final /* synthetic */ void a(s.a aVar, s sVar, ae aeVar, Object obj) {
        s.a aVar2 = aVar;
        if (aVar2.a()) {
            int i10 = aVar2.f8485b;
            int i11 = aVar2.f8486c;
            com.anythink.expressad.exoplayer.k.a.a(aeVar.c() == 1);
            this.f8175p[i10][i11] = aeVar.a(0, this.f8170j, false).f7275d;
            if (this.f8169i.containsKey(sVar)) {
                List<l> list = this.f8169i.get(sVar);
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).f();
                }
                this.f8169i.remove(sVar);
            }
            c();
            return;
        }
        this.f8172l = aeVar;
        this.f8173m = obj;
        c();
    }

    @Override // com.anythink.expressad.exoplayer.h.f, com.anythink.expressad.exoplayer.h.c
    public final void a(final com.anythink.expressad.exoplayer.h hVar, boolean z10) {
        super.a(hVar, z10);
        com.anythink.expressad.exoplayer.k.a.a(z10);
        final C0108c c0108c = new C0108c();
        this.f8171k = c0108c;
        a((c) new s.a(0), this.f8163b);
        this.f8168h.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.h.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.exoplayer.h.a.b unused = c.this.f8165d;
                ViewGroup unused2 = c.this.f8166e;
            }
        });
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.expressad.exoplayer.j.b bVar) {
        if (this.f8174n.f8153g > 0 && aVar.a()) {
            int i10 = aVar.f8485b;
            int i11 = aVar.f8486c;
            Uri uri = this.f8174n.f8155i[i10].f8159b[i11];
            if (this.o[i10].length <= i11) {
                s b10 = this.f8164c.b(uri);
                s[][] sVarArr = this.o;
                s[] sVarArr2 = sVarArr[i10];
                int length = sVarArr2.length;
                if (i11 >= length) {
                    int i12 = i11 + 1;
                    sVarArr[i10] = (s[]) Arrays.copyOf(sVarArr2, i12);
                    long[][] jArr = this.f8175p;
                    jArr[i10] = Arrays.copyOf(jArr[i10], i12);
                    Arrays.fill(this.f8175p[i10], length, i12, com.anythink.expressad.exoplayer.b.f7291b);
                }
                this.o[i10][i11] = b10;
                this.f8169i.put(b10, new ArrayList());
                a((c) aVar, b10);
            }
            s sVar = this.o[i10][i11];
            l lVar = new l(sVar, new s.a(0, aVar.f8487d), bVar);
            lVar.a(new b(uri, i10, i11));
            List<l> list = this.f8169i.get(sVar);
            if (list == null) {
                lVar.f();
            } else {
                list.add(lVar);
            }
            return lVar;
        }
        l lVar2 = new l(this.f8163b, aVar, bVar);
        lVar2.f();
        return lVar2;
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final void a(r rVar) {
        l lVar = (l) rVar;
        List<l> list = this.f8169i.get(lVar.f8408a);
        if (list != null) {
            list.remove(lVar);
        }
        lVar.g();
    }

    @Override // com.anythink.expressad.exoplayer.h.f, com.anythink.expressad.exoplayer.h.c
    public final void a() {
        super.a();
        this.f8171k.c();
        this.f8171k = null;
        this.f8169i.clear();
        this.f8172l = null;
        this.f8173m = null;
        this.f8174n = null;
        this.o = new s[0];
        this.f8175p = new long[0];
        this.f8168h.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.h.a.c.2
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.exoplayer.h.a.b unused = c.this.f8165d;
            }
        });
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(s.a aVar, s sVar, ae aeVar, Object obj) {
        if (aVar.a()) {
            int i10 = aVar.f8485b;
            int i11 = aVar.f8486c;
            com.anythink.expressad.exoplayer.k.a.a(aeVar.c() == 1);
            this.f8175p[i10][i11] = aeVar.a(0, this.f8170j, false).f7275d;
            if (this.f8169i.containsKey(sVar)) {
                List<l> list = this.f8169i.get(sVar);
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).f();
                }
                this.f8169i.remove(sVar);
            }
            c();
            return;
        }
        this.f8172l = aeVar;
        this.f8173m = obj;
        c();
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static s.a a2(s.a aVar, s.a aVar2) {
        return aVar.a() ? aVar : aVar2;
    }

    private void a(com.anythink.expressad.exoplayer.h.a.a aVar) {
        if (this.f8174n == null) {
            s[][] sVarArr = new s[aVar.f8153g];
            this.o = sVarArr;
            Arrays.fill(sVarArr, new s[0]);
            long[][] jArr = new long[aVar.f8153g];
            this.f8175p = jArr;
            Arrays.fill(jArr, new long[0]);
        }
        this.f8174n = aVar;
        c();
    }

    private void a(s sVar, int i10, int i11, ae aeVar) {
        com.anythink.expressad.exoplayer.k.a.a(aeVar.c() == 1);
        this.f8175p[i10][i11] = aeVar.a(0, this.f8170j, false).f7275d;
        if (this.f8169i.containsKey(sVar)) {
            List<l> list = this.f8169i.get(sVar);
            for (int i12 = 0; i12 < list.size(); i12++) {
                list.get(i12).f();
            }
            this.f8169i.remove(sVar);
        }
        c();
    }

    public static /* synthetic */ void a(c cVar, com.anythink.expressad.exoplayer.h.a.a aVar) {
        if (cVar.f8174n == null) {
            s[][] sVarArr = new s[aVar.f8153g];
            cVar.o = sVarArr;
            Arrays.fill(sVarArr, new s[0]);
            long[][] jArr = new long[aVar.f8153g];
            cVar.f8175p = jArr;
            Arrays.fill(jArr, new long[0]);
        }
        cVar.f8174n = aVar;
        cVar.c();
    }
}
