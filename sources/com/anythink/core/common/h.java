package com.anythink.core.common;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.IATAdFilter;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.f;
import com.anythink.core.common.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class h {
    int A;
    int B;
    ConcurrentHashMap<String, ai> D;
    ai F;
    protected Runnable J;
    com.anythink.core.common.l.f L;
    ai N;
    double O;
    ai Q;
    List<ai> R;

    /* renamed from: b, reason: collision with root package name */
    protected WeakReference<Context> f5954b;

    /* renamed from: c, reason: collision with root package name */
    protected int f5955c;

    /* renamed from: e, reason: collision with root package name */
    protected com.anythink.core.c.d f5957e;
    protected String f;

    /* renamed from: g, reason: collision with root package name */
    protected String f5958g;

    /* renamed from: h, reason: collision with root package name */
    Map<String, Object> f5959h;

    /* renamed from: i, reason: collision with root package name */
    com.anythink.core.common.e.e f5960i;

    /* renamed from: j, reason: collision with root package name */
    protected j f5961j;

    /* renamed from: l, reason: collision with root package name */
    protected com.anythink.core.common.b.b f5963l;

    /* renamed from: p, reason: collision with root package name */
    boolean f5966p;

    /* renamed from: q, reason: collision with root package name */
    boolean f5967q;

    /* renamed from: t, reason: collision with root package name */
    List<ai> f5970t;

    /* renamed from: u, reason: collision with root package name */
    List<ai> f5971u;

    /* renamed from: v, reason: collision with root package name */
    List<ai> f5972v;

    /* renamed from: x, reason: collision with root package name */
    String f5974x;

    /* renamed from: z, reason: collision with root package name */
    long f5975z;
    private final String T = getClass().getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    protected String f5956d = "";

    /* renamed from: k, reason: collision with root package name */
    protected int f5962k = 0;

    /* renamed from: m, reason: collision with root package name */
    boolean f5964m = false;

    /* renamed from: n, reason: collision with root package name */
    boolean f5965n = false;
    protected boolean o = false;

    /* renamed from: r, reason: collision with root package name */
    boolean f5968r = false;

    /* renamed from: s, reason: collision with root package name */
    boolean f5969s = false;
    Object C = new Object();
    double E = -1.0d;
    protected Runnable I = null;
    protected Runnable M = new Runnable() { // from class: com.anythink.core.common.h.1
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.k.b.a.a().b(new Runnable() { // from class: com.anythink.core.common.h.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    h.this.a();
                }
            });
        }
    };
    boolean P = false;
    boolean S = false;

    /* renamed from: a, reason: collision with root package name */
    protected Context f5953a = com.anythink.core.common.b.n.a().g();

    /* renamed from: w, reason: collision with root package name */
    List<com.anythink.core.common.l.e> f5973w = Collections.synchronizedList(new ArrayList(2));
    AdError y = ErrorCode.getErrorCode(ErrorCode.noADError, "", "");
    protected Map<String, com.anythink.core.common.l.d> G = new ConcurrentHashMap();
    List<ai> H = Collections.synchronizedList(new ArrayList(3));
    com.anythink.core.common.l.h K = new com.anythink.core.common.l.h();

    /* renamed from: com.anythink.core.common.h$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h.this.I = null;
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.h.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    h.this.j();
                }
            });
        }
    }

    /* renamed from: com.anythink.core.common.h$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h.this.o();
        }
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f5989a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f5990b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f5991c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f5992d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f5993e = 5;
    }

    public h(Context context) {
        this.f5954b = new WeakReference<>(context);
    }

    private synchronized boolean A() {
        this.f5970t.size();
        this.f5971u.size();
        this.f5972v.size();
        this.f5973w.size();
        if (this.f5970t.size() == 0 && this.f5972v.size() == 0 && this.f5973w.size() == 0) {
            if (this.f5971u.size() == 0) {
                return true;
            }
        }
        return false;
    }

    private synchronized boolean B() {
        if (this.f5970t.size() == 0) {
            if (this.f5971u.size() == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean C() {
        if (this.f5957e.j() == 1 && this.f5962k != 8 && !v.a().f(this.f5958g)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean c(int i10) {
        return i10 == 3 || i10 == 5;
    }

    private static boolean d(int i10) {
        return i10 == 3 || i10 == 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        ai aiVar;
        com.anythink.core.common.e.b a10 = com.anythink.core.common.a.a().a(this.f5953a, this.f5958g);
        this.f5969s = true;
        if (!this.o && a10 != null) {
            if (a10.e() != null) {
                aiVar = a10.e().getUnitGroupInfo();
            } else {
                aiVar = null;
            }
            d(aiVar);
            b(9);
        }
    }

    private synchronized void k() {
        if (!this.f5966p) {
            return;
        }
        synchronized (this.f5970t) {
            for (ai aiVar : this.f5970t) {
                if (aiVar != null && aiVar.j()) {
                    a(aiVar);
                }
            }
            this.f5970t.clear();
        }
        synchronized (this.f5973w) {
            for (com.anythink.core.common.l.e eVar : this.f5973w) {
                if (eVar != null && eVar.a() != null && eVar.a().j()) {
                    a(eVar.a());
                }
            }
            this.f5973w.clear();
        }
        synchronized (this.f5972v) {
            this.f5972v.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l() {
        double a10 = this.L.a(false);
        double s10 = s();
        this.L.d();
        int i10 = this.B;
        this.f5957e.am();
        this.K.c();
        this.K.b();
        if ((this.f5964m && this.B >= this.f5957e.am() && a10 > s10) || this.K.c() || this.K.b()) {
            this.f5966p = true;
            k();
            if (this.L.d() == 0) {
                com.anythink.core.common.l.f.a(this.f5953a, this.f5958g);
                q();
            }
        }
        p();
        if (this.f5966p || A()) {
            q();
        }
    }

    private void m() {
        if (this.f5957e.m() > 0) {
            this.I = new AnonymousClass2();
            com.anythink.core.common.b.n.a().a(this.I, this.f5957e.m());
        }
    }

    private Runnable n() {
        return new AnonymousClass3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o() {
        if (!this.o && this.f5972v.size() > 0) {
            this.J = null;
            ai remove = this.f5972v.remove(0);
            remove.ab();
            this.f5971u.add(remove);
            this.f5972v.size();
            this.L.f();
            b(remove, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r2 = r7.f5973w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0058, code lost:
    
        r3 = r7.f5973w.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0062, code lost:
    
        if (r3.hasNext() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0064, code lost:
    
        r4 = r3.next().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
    
        if (com.anythink.core.common.k.g.a(r4) <= r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0076, code lost:
    
        r4.ab();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0079, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007c, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007d, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void p() {
        /*
            r7 = this;
            monitor-enter(r7)
            com.anythink.core.common.l.h r0 = r7.K     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.g()     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto La1
            com.anythink.core.common.l.h r0 = r7.K     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L13
            goto La1
        L13:
            com.anythink.core.common.l.h r0 = r7.K     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L1d
            monitor-exit(r7)
            return
        L1d:
            boolean r0 = r7.f5964m     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L85
            com.anythink.core.common.e.ai r0 = r7.F     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L85
            boolean r0 = r0.j()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L85
            com.anythink.core.common.e.ai r0 = r7.F     // Catch: java.lang.Throwable -> Lad
            double r0 = com.anythink.core.common.k.g.a(r0)     // Catch: java.lang.Throwable -> Lad
            java.util.List<com.anythink.core.common.e.ai> r2 = r7.f5971u     // Catch: java.lang.Throwable -> Lad
            monitor-enter(r2)     // Catch: java.lang.Throwable -> Lad
            java.util.List<com.anythink.core.common.e.ai> r3 = r7.f5971u     // Catch: java.lang.Throwable -> L82
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L82
        L3a:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L82
            if (r4 == 0) goto L54
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L82
            com.anythink.core.common.e.ai r4 = (com.anythink.core.common.e.ai) r4     // Catch: java.lang.Throwable -> L82
            double r5 = com.anythink.core.common.k.g.a(r4)     // Catch: java.lang.Throwable -> L82
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L3a
            r4.ab()     // Catch: java.lang.Throwable -> L82
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r7)
            return
        L54:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lad
            java.util.List<com.anythink.core.common.l.e> r2 = r7.f5973w     // Catch: java.lang.Throwable -> Lad
            monitor-enter(r2)     // Catch: java.lang.Throwable -> Lad
            java.util.List<com.anythink.core.common.l.e> r3 = r7.f5973w     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L7f
        L5e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L7f
            com.anythink.core.common.l.e r4 = (com.anythink.core.common.l.e) r4     // Catch: java.lang.Throwable -> L7f
            com.anythink.core.common.e.ai r4 = r4.a()     // Catch: java.lang.Throwable -> L7f
            double r5 = com.anythink.core.common.k.g.a(r4)     // Catch: java.lang.Throwable -> L7f
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L5e
            r4.ab()     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r7)
            return
        L7c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lad
            r0 = 1
            goto L86
        L7f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lad
            throw r0     // Catch: java.lang.Throwable -> Lad
        L82:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lad
            throw r0     // Catch: java.lang.Throwable -> Lad
        L85:
            r0 = 0
        L86:
            if (r0 == 0) goto L9f
            com.anythink.core.common.e.ai r0 = r7.F     // Catch: java.lang.Throwable -> Lad
            com.anythink.core.common.e.m r0 = r0.N()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L9f
            com.anythink.core.common.l.h r1 = r7.K     // Catch: java.lang.Throwable -> Lad
            r1.h()     // Catch: java.lang.Throwable -> Lad
            com.anythink.core.common.e.ai r1 = r7.F     // Catch: java.lang.Throwable -> Lad
            r1.ab()     // Catch: java.lang.Throwable -> Lad
            com.anythink.core.common.e.ai r1 = r7.F     // Catch: java.lang.Throwable -> Lad
            r0.a(r1)     // Catch: java.lang.Throwable -> Lad
        L9f:
            monitor-exit(r7)
            return
        La1:
            com.anythink.core.common.l.h r0 = r7.K     // Catch: java.lang.Throwable -> Lad
            r0.g()     // Catch: java.lang.Throwable -> Lad
            com.anythink.core.common.l.h r0 = r7.K     // Catch: java.lang.Throwable -> Lad
            r0.e()     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r7)
            return
        Lad:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.h.p():void");
    }

    private synchronized void q() {
        Map<String, Object> map;
        if (!this.K.e()) {
            this.K.e();
            return;
        }
        if (this.K.b()) {
            return;
        }
        String str = this.f;
        String str2 = this.f5958g;
        String str3 = this.f5956d;
        com.anythink.core.c.d dVar = this.f5957e;
        int i10 = this.f5962k;
        int i11 = this.f5955c;
        j jVar = this.f5961j;
        if (jVar != null) {
            map = jVar.f6025g;
        } else {
            map = null;
        }
        this.L.a(com.anythink.core.common.k.s.a(str, str2, str3, dVar, "", 1, i10, i11, map), this.F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void r() {
        boolean z10;
        double s10 = s();
        double d10 = this.E;
        if (d10 >= 0.0d) {
            if (((this.f5964m || this.f5968r) && d10 >= s10) || this.f5969s) {
                if (!this.o) {
                    b(-1);
                }
                w();
            }
        } else if (this.f5964m) {
            if (this.J != null && B()) {
                com.anythink.core.common.b.n.a().c(this.J);
                this.J.run();
                this.J = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return;
            }
            if (A() && !this.o) {
                z();
            }
        }
    }

    private double s() {
        ai aiVar;
        ai aiVar2;
        com.anythink.core.common.l.e eVar;
        ai aiVar3 = null;
        if (this.f5957e.a() == 2) {
            synchronized (this.G) {
                Iterator<Map.Entry<String, com.anythink.core.common.l.d>> it = this.G.entrySet().iterator();
                aiVar = null;
                if (it != null) {
                    while (it.hasNext()) {
                        com.anythink.core.common.l.d value = it.next().getValue();
                        if (value != null) {
                            if (!value.g()) {
                                ai h10 = value.h();
                                if (h10 != null) {
                                    if (aiVar != null && com.anythink.core.common.k.g.a(h10) <= com.anythink.core.common.k.g.a(aiVar)) {
                                    }
                                    aiVar = h10;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            aiVar = null;
        }
        if (this.f5970t.size() > 0) {
            aiVar2 = this.f5970t.get(0);
        } else {
            aiVar2 = null;
        }
        synchronized (this.f5973w) {
            if (this.f5973w.size() > 0 && (eVar = this.f5973w.get(0)) != null) {
                aiVar3 = eVar.a();
            }
        }
        return Math.max(Math.max(com.anythink.core.common.k.g.a(aiVar2), com.anythink.core.common.k.g.a(aiVar3)), com.anythink.core.common.k.g.a(aiVar));
    }

    private synchronized void t() {
        this.f5972v.clear();
        if (this.J != null) {
            com.anythink.core.common.b.n.a().c(this.J);
            this.J = null;
        }
    }

    private void u() {
        v();
        if (!this.P) {
            h();
        }
    }

    private synchronized boolean v() {
        List<ai> list = this.R;
        if (list != null && list.size() != 0) {
            if (this.K.c()) {
                return false;
            }
            this.S = true;
            ArrayList arrayList = new ArrayList(3);
            arrayList.addAll(this.R);
            this.R.clear();
            a(8, arrayList, new k.a() { // from class: com.anythink.core.common.h.6
                @Override // com.anythink.core.common.k.a
                public final void a(String str) {
                }

                @Override // com.anythink.core.common.k.a
                public final void b(String str) {
                    h hVar = h.this;
                    hVar.S = false;
                    hVar.r();
                }

                @Override // com.anythink.core.common.k.a
                public final void a(String str, List<ai> list2, List<ai> list3) {
                    w a10 = w.a();
                    h hVar = h.this;
                    a10.b(hVar.f5958g, hVar.f, list2);
                    for (ai aiVar : list2) {
                        aiVar.y(8);
                        h.this.f5971u.add(aiVar);
                        h.this.b(aiVar, 3);
                    }
                }
            });
            return true;
        }
        return false;
    }

    private synchronized void w() {
        if (!this.f5964m) {
            return;
        }
        if (this.K.c()) {
            return;
        }
        List<ai> list = this.H;
        if (list != null && list.size() != 0) {
            if (this.f5967q) {
                return;
            }
            this.f5967q = true;
            a(7, this.H, new k.a() { // from class: com.anythink.core.common.h.7
                @Override // com.anythink.core.common.k.a
                public final void a(String str) {
                }

                @Override // com.anythink.core.common.k.a
                public final void a(String str, List<ai> list2, List<ai> list3) {
                    if (h.this.K.c()) {
                        String unused = h.this.T;
                        Iterator<ai> it = list2.iterator();
                        while (it.hasNext()) {
                            h.this.a(it.next());
                        }
                        return;
                    }
                    w a10 = w.a();
                    h hVar = h.this;
                    a10.b(hVar.f5958g, hVar.f, list2);
                    h hVar2 = h.this;
                    if (hVar2.B < hVar2.f5957e.am()) {
                        String unused2 = h.this.T;
                        h.this.a(list2, (List<ai>) null, (List<ai>) null);
                        h.this.l();
                        return;
                    }
                    String unused3 = h.this.T;
                    double a11 = h.this.L.a(false);
                    int size = list2.size();
                    ArrayList arrayList = new ArrayList(size);
                    ArrayList arrayList2 = new ArrayList(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        ai aiVar = list2.get(i10);
                        if (com.anythink.core.common.k.g.a(aiVar) > a11) {
                            arrayList.add(aiVar);
                        } else {
                            arrayList2.add(aiVar);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ai aiVar2 = (ai) it2.next();
                        aiVar2.y(7);
                        h.this.f5971u.add(aiVar2);
                        h.this.b(aiVar2, 5);
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        h.this.a((ai) it3.next());
                    }
                }

                @Override // com.anythink.core.common.k.a
                public final void b(String str) {
                }
            });
        }
    }

    private boolean x() {
        if (this.J != null && B()) {
            com.anythink.core.common.b.n.a().c(this.J);
            this.J.run();
            this.J = null;
            return true;
        }
        return false;
    }

    private void y() {
        Map<String, Object> map;
        j jVar;
        boolean z10 = true;
        this.o = true;
        this.f5965n = false;
        if (this.M != null) {
            com.anythink.core.common.b.n.a().c(this.M);
        }
        String str = this.f;
        String str2 = this.f5958g;
        String str3 = this.f5956d;
        com.anythink.core.c.d dVar = this.f5957e;
        String str4 = this.f5974x;
        int l10 = dVar.l();
        int i10 = this.f5962k;
        int i11 = this.f5955c;
        j jVar2 = this.f5961j;
        if (jVar2 != null) {
            map = jVar2.f6025g;
        } else {
            map = null;
        }
        com.anythink.core.common.j.c.a(com.anythink.core.common.k.s.a(str, str2, str3, dVar, str4, l10, i10, i11, map), this.y);
        if (!this.P) {
            if (this.f5957e.j() != 1 || this.f5962k == 8 || v.a().f(this.f5958g)) {
                z10 = false;
            }
            if (z10) {
                f b10 = v.a().b(this.f5958g);
                if (b10 != null && (jVar = this.f5961j) != null) {
                    jVar.f6023d = 8;
                    Context context = this.f5953a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f5957e.X());
                    b10.a(context, sb2.toString(), this.f5958g, (String) this.f5961j, (com.anythink.core.common.b.a) null);
                }
            } else {
                a(this.y);
            }
        }
        f();
    }

    private void z() {
        if (com.anythink.core.common.a.a().a(this.f5953a, this.f5958g) != null) {
            b(9);
        } else if (!v()) {
            y();
        }
    }

    public abstract void a(ATBaseAdAdapter aTBaseAdAdapter);

    public final void f() {
        this.P = true;
        v.a().b(this.f5958g).b(this.f);
    }

    public void g() {
        if (this.M != null) {
            com.anythink.core.common.b.n.a().c(this.M);
        }
    }

    public void h() {
        com.anythink.core.common.b.a aVar;
        com.anythink.core.common.k.n.a("Mediation", "placementId:" + this.f5958g + ";result_callback:success;loadType:" + this.f5962k + com.huawei.openalliance.ad.constant.w.aG);
        j jVar = this.f5961j;
        if (jVar != null && (aVar = jVar.f) != null) {
            aVar.onAdLoaded();
            this.f5961j.f = null;
        }
    }

    public final void i() {
        synchronized (this.f5973w) {
            if (this.f5973w.size() > 0) {
                ai a10 = this.f5973w.remove(0).a();
                if (!this.o || this.B < this.f5957e.am() || com.anythink.core.common.k.g.a(a10) > this.E) {
                    this.f5971u.add(a10);
                    b(a10, 4);
                }
            }
            if (this.f5973w.size() > 0) {
                for (com.anythink.core.common.l.e eVar : this.f5973w) {
                    ai a11 = eVar.a();
                    if (!this.o || this.B < this.f5957e.am() || com.anythink.core.common.k.g.a(a11) > this.E) {
                        int b10 = eVar.b();
                        if (b10 != 1) {
                            if (b10 != 2) {
                                if (b10 == 3) {
                                    this.f5971u.add(a11);
                                    b(a11, 3);
                                }
                            } else {
                                a(a11, 2);
                                e(b10);
                            }
                        } else {
                            a(a11, 1);
                            e(b10);
                        }
                    }
                }
            }
            this.f5973w.clear();
        }
        l();
    }

    /* renamed from: com.anythink.core.common.h$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements com.anythink.core.common.l.b {
        public AnonymousClass5() {
        }

        @Override // com.anythink.core.common.l.b
        public final void a(com.anythink.core.common.e.e eVar) {
            com.anythink.core.common.j.a.a(h.this.f5953a).a(1, eVar);
            com.anythink.core.common.k.g.a(eVar, g.i.f5074a, g.i.f5080h, "");
        }

        @Override // com.anythink.core.common.l.b
        public final void b(com.anythink.core.common.e.e eVar) {
            h.a(h.this, eVar);
        }

        @Override // com.anythink.core.common.l.b
        public final void a(ATBaseAdAdapter aTBaseAdAdapter) {
            h.this.a(aTBaseAdAdapter);
        }

        @Override // com.anythink.core.common.l.b
        public final void a(String str, String str2) {
            h.this.a(str);
        }

        @Override // com.anythink.core.common.l.b
        public final void a(String str, ATBaseAdAdapter aTBaseAdAdapter, ai aiVar) {
            h.this.a(str, aTBaseAdAdapter, aiVar);
        }

        @Override // com.anythink.core.common.l.b
        public final void a(String str, ATBaseAdAdapter aTBaseAdAdapter, BaseAd... baseAdArr) {
            IATAdFilter o = com.anythink.core.common.b.n.a().o(h.this.f5958g);
            BaseAd baseAd = (baseAdArr == null || baseAdArr.length <= 0) ? null : baseAdArr[0];
            if (o != null && o.isAdFilter(com.anythink.core.common.b.j.a(aTBaseAdAdapter), baseAd)) {
                com.anythink.core.common.l.a aVar = new com.anythink.core.common.l.a();
                aVar.f6264a = 8;
                aVar.f6266c = aTBaseAdAdapter.getTrackingInfo().K();
                aVar.f6265b = ErrorCode.getErrorCode(ErrorCode.adSourceNotFilledError, "", "");
                aVar.f6267d = aTBaseAdAdapter.getTrackingInfo();
                aVar.f6268e = aTBaseAdAdapter.getUnitGroupInfo();
                h.this.a(str, aVar);
                return;
            }
            h.this.a(str, aTBaseAdAdapter, baseAdArr != null ? Arrays.asList(baseAdArr) : null);
        }

        @Override // com.anythink.core.common.l.b
        public final void a(String str, com.anythink.core.common.l.a aVar) {
            h.this.a(str, aVar);
        }
    }

    private synchronized void e(int i10) {
        int f;
        if (i10 != 2) {
            f = this.L.e();
        } else {
            f = this.L.f();
        }
        if (f == 0) {
            a(this.L.b(i10), i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(ai aiVar) {
        this.f5971u.remove(aiVar);
    }

    private int f(int i10) {
        return i10 > 0 ? i10 : this.B < this.f5957e.am() ? 5 : 2;
    }

    public final void d() {
        this.f5968r = true;
        r();
    }

    private void c(ai aiVar) {
        if (this.D == null) {
            this.D = new ConcurrentHashMap<>();
        }
        this.D.put(aiVar.t(), aiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ai aiVar) {
        com.anythink.core.common.e.m N;
        if (aiVar == null) {
            return;
        }
        double a10 = com.anythink.core.common.k.g.a(aiVar);
        if (aiVar.j() && aiVar.c() == 1 && a10 == 10000.0d && (N = aiVar.N()) != null) {
            a10 = N.o;
        }
        if (a10 > com.anythink.core.common.k.g.a(this.Q)) {
            this.Q = aiVar;
        }
    }

    public final void b() {
        long j10;
        List<ai> c10 = this.L.c();
        this.f5972v = c10;
        if (c10 == null || c10.size() <= 0) {
            j10 = 1000;
        } else {
            j10 = this.f5957e.o();
            if (this.f5970t.size() == 0 && this.f5964m) {
                j10 = 0;
            }
            this.J = new AnonymousClass3();
        }
        this.f5975z = SystemClock.elapsedRealtime();
        if (this.f5957e.m() > 0) {
            this.I = new AnonymousClass2();
            com.anythink.core.common.b.n.a().a(this.I, this.f5957e.m());
        }
        com.anythink.core.common.b.n.a().a(this.M, this.f5957e.R());
        if (this.f5972v.size() == 0 && this.f5970t.size() == 0 && this.f5964m) {
            v();
        }
        a(this.L.h(), 1);
        if (this.J != null) {
            com.anythink.core.common.b.n.a().a(this.J, j10);
        }
    }

    public final void e() {
        synchronized (this.C) {
            this.f5964m = true;
            this.f5968r = true;
            r();
            l();
        }
    }

    private void c(com.anythink.core.common.e.e eVar) {
        com.anythink.core.common.b.b bVar = this.f5963l;
        if (bVar != null) {
            bVar.d(eVar);
        }
    }

    public final synchronized void a() {
        ConcurrentHashMap concurrentHashMap;
        this.K.a();
        synchronized (this.G) {
            concurrentHashMap = new ConcurrentHashMap(this.G);
        }
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            com.anythink.core.common.l.d dVar = (com.anythink.core.common.l.d) ((Map.Entry) it.next()).getValue();
            if (dVar != null) {
                dVar.c();
            }
        }
        if (!this.o) {
            this.o = true;
            z();
        }
        l();
    }

    public final boolean c() {
        if (this.o) {
            return true;
        }
        return this.f5964m && this.f5970t.size() == 0 && this.L.d() == 0;
    }

    private void a(Map<String, Object> map) {
        this.f5959h = map;
    }

    private void a(com.anythink.core.common.e.e eVar) {
        this.f5960i = eVar;
    }

    public final void a(com.anythink.core.common.b.b bVar) {
        this.f5963l = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final ai aiVar, final int i10) {
        this.L.a(1, i10);
        com.anythink.core.common.k.b.a.a().b(new Runnable() { // from class: com.anythink.core.common.h.4
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                Map<String, Object> map;
                synchronized (h.this) {
                    if (h.this.K.b()) {
                        return;
                    }
                    if (com.anythink.core.common.k.t.a(aiVar) && TextUtils.isEmpty(v.a().a(h.this.f5958g, aiVar.c()))) {
                        v.a().a(h.this.f5958g, aiVar.c(), aiVar.g());
                    }
                    boolean c10 = h.c(i10);
                    h hVar = h.this;
                    String str2 = hVar.f;
                    String str3 = hVar.f5958g;
                    String str4 = hVar.f5956d;
                    com.anythink.core.c.d dVar = hVar.f5957e;
                    if (c10) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(aiVar.c());
                        str = sb2.toString();
                    } else {
                        str = hVar.f5974x;
                    }
                    String str5 = str;
                    int l10 = h.this.f5957e.l();
                    h hVar2 = h.this;
                    int i11 = hVar2.f5962k;
                    int i12 = hVar2.f5955c;
                    j jVar = hVar2.f5961j;
                    if (jVar != null) {
                        map = jVar.f6025g;
                    } else {
                        map = null;
                    }
                    com.anythink.core.common.e.e a10 = com.anythink.core.common.k.s.a(str2, str3, str4, dVar, str5, l10, i11, i12, map);
                    com.anythink.core.common.e.e eVar = h.this.f5960i;
                    if (eVar != null) {
                        a10.a(eVar.a());
                    }
                    com.anythink.core.common.k.s.a(a10, aiVar, h.this.A, true);
                    a10.a(SystemClock.elapsedRealtime() - h.this.f5975z);
                    com.anythink.core.common.e.d d10 = v.a().d(h.this.f5958g);
                    int i13 = 0;
                    if (d10 == null || !d10.a(aiVar)) {
                        String unused = h.this.T;
                        aiVar.ab();
                        try {
                            if (aiVar.j()) {
                                String unused2 = h.this.T;
                                com.anythink.core.common.e.m N = aiVar.N();
                                if (aiVar.c() != 66 && aiVar.c() != 67) {
                                    com.anythink.core.b.f.a().a(aiVar.t());
                                }
                                if (N != null && N.a()) {
                                    i13 = 1;
                                }
                                if (i13 != 0 && N != null) {
                                    com.anythink.core.common.e.r rVar = new com.anythink.core.common.e.r();
                                    rVar.f5731a = 1;
                                    rVar.f5732b = N.getSortPrice();
                                    rVar.f5735e = a10;
                                    ai aiVar2 = aiVar;
                                    rVar.f5733c = aiVar2;
                                    rVar.f5734d = aiVar2;
                                    N.a(rVar, true);
                                }
                            }
                        } catch (Throwable unused3) {
                        }
                        com.anythink.core.common.l.d dVar2 = new com.anythink.core.common.l.d(aiVar, i10);
                        String a11 = dVar2.a();
                        h.this.G.put(a11, dVar2);
                        h.this.A++;
                        if (i13 != 0) {
                            com.anythink.core.common.l.a aVar = new com.anythink.core.common.l.a();
                            aVar.f6264a = 6;
                            aVar.f6265b = ErrorCode.getErrorCode(ErrorCode.noADError, "", "Bid result has expired.");
                            aVar.f6266c = 0L;
                            aVar.f6267d = a10;
                            aVar.f6268e = aiVar;
                            h.this.a(a11, aVar);
                            return;
                        }
                        if (aiVar.j()) {
                            h.this.d(aiVar);
                        }
                        int ac2 = aiVar.ac();
                        if (ac2 > 0) {
                            a10.f5595q = ac2;
                        } else {
                            h hVar3 = h.this;
                            if (hVar3.f5965n && hVar3.B < hVar3.f5957e.am()) {
                                a10.f5595q = 5;
                            }
                        }
                        h.a(h.this, dVar2, a10);
                        return;
                    }
                    com.anythink.core.common.k.n.a(h.this.f5958g, a10, "Can't Load On Showing", aiVar, -1, -1);
                    com.anythink.core.common.j.c.a(a10, 7, ErrorCode.getErrorCode(ErrorCode.loadInShowingFilter, "", "Can't Load On Showing"));
                    v.a().a(h.this.f5958g, d10.a(), h.this.f);
                    synchronized (h.this.f5973w) {
                        Iterator<com.anythink.core.common.l.e> it = h.this.f5973w.iterator();
                        while (it.hasNext() && com.anythink.core.common.k.g.a(it.next().a()) > com.anythink.core.common.k.g.a(aiVar)) {
                            i13++;
                        }
                        h.this.f5973w.add(i13, new com.anythink.core.common.l.e(aiVar, i10));
                    }
                    h.this.b(aiVar);
                    h.this.L.a(i10);
                    h.this.L.a(-1, i10);
                    h hVar4 = h.this;
                    hVar4.a(hVar4.L.b(i10), i10);
                }
            }
        });
    }

    public final void a(j jVar) {
        this.f5961j = jVar;
    }

    public final void a(int i10) {
        this.f5962k = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ai aiVar) {
        if (aiVar != null && aiVar.j() && aiVar.L() == 2) {
            String str = this.f;
            String str2 = this.f5958g;
            String str3 = this.f5956d;
            com.anythink.core.c.d dVar = this.f5957e;
            int i10 = this.f5962k;
            int i11 = this.f5955c;
            j jVar = this.f5961j;
            com.anythink.core.common.l.f.a(aiVar, com.anythink.core.common.k.s.a(str, str2, str3, dVar, "", 1, i10, i11, jVar != null ? jVar.f6025g : null), this.F, true);
        }
    }

    private void b(com.anythink.core.common.e.e eVar) {
        com.anythink.core.common.b.b bVar = this.f5963l;
        if (bVar != null) {
            bVar.c(eVar);
        }
    }

    private void b(com.anythink.core.common.l.d dVar) {
        if (dVar.d() == null || !dVar.d().booleanValue() || dVar.f() == 2 || !dVar.d().booleanValue()) {
            return;
        }
        this.B++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(List<ai> list, int i10) {
        if (!this.K.b() && !this.K.c() && list != null && list.size() != 0) {
            this.f5971u.addAll(list);
            this.f5971u.size();
            Iterator<ai> it = list.iterator();
            while (it.hasNext()) {
                b(it.next(), i10);
            }
        }
    }

    public final void b(int i10) {
        if (this.I != null) {
            com.anythink.core.common.b.n.a().c(this.I);
            this.I = null;
        }
        boolean z10 = i10 == 5 || i10 == 9 || i10 == 10;
        this.o = true;
        this.f5965n = true;
        if (this.M != null) {
            com.anythink.core.common.b.n.a().c(this.M);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f5975z;
        String str = this.f;
        String str2 = this.f5958g;
        String str3 = this.f5956d;
        com.anythink.core.c.d dVar = this.f5957e;
        String str4 = this.f5974x;
        int l10 = dVar.l();
        int i11 = this.f5962k;
        int i12 = this.f5955c;
        j jVar = this.f5961j;
        com.anythink.core.common.e.e a10 = com.anythink.core.common.k.s.a(str, str2, str3, dVar, str4, l10, i11, i12, jVar != null ? jVar.f6025g : null);
        a10.a(true);
        a10.d(elapsedRealtime);
        if (z10) {
            a10.z(i10);
        }
        com.anythink.core.common.j.a.a(this.f5953a).a(12, a10);
        f b10 = v.a().b(this.f5958g);
        if (b10 != null && i10 != 10) {
            b10.a(this.f5957e.U());
        }
        com.anythink.core.common.l.f.a(this.f5953a, this.f5958g);
        u();
    }

    private synchronized void a(ai aiVar, int i10) {
        List<ai> list;
        if (i10 != 2) {
            list = this.f5970t;
        } else {
            list = this.f5972v;
        }
        synchronized (list) {
            com.anythink.core.common.k.g.a(list, aiVar, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:48:0x0005, B:49:0x0009, B:51:0x000f, B:5:0x0038, B:7:0x003f, B:10:0x0047, B:13:0x00b7, B:14:0x00bb, B:16:0x00c1, B:18:0x00d9, B:20:0x00e0, B:23:0x00ee, B:26:0x0064, B:34:0x0084, B:36:0x009b, B:37:0x009d, B:41:0x006c, B:45:0x00f0), top: B:47:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List<com.anythink.core.common.e.ai> r13, java.util.List<com.anythink.core.common.e.ai> r14, java.util.List<com.anythink.core.common.e.ai> r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.h.a(java.util.List, java.util.List, java.util.List):void");
    }

    private void b(long j10) {
        com.anythink.core.common.b.n.a().a(this.M, j10);
    }

    private ai b(String str) {
        ConcurrentHashMap<String, ai> concurrentHashMap = this.D;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    public final void a(com.anythink.core.common.l.g gVar) {
        com.anythink.core.common.l.f fVar = new com.anythink.core.common.l.f(gVar);
        this.L = fVar;
        this.f5970t = fVar.a();
        this.f5971u = this.L.b();
        this.f5964m = gVar.f6329e;
        this.f = gVar.f6326b;
        this.f5958g = gVar.f6325a;
        this.f5957e = gVar.f6327c;
        this.f5955c = gVar.f;
        this.f5974x = com.anythink.core.common.l.f.a(gVar.f6328d);
    }

    private void a(long j10) {
        if (this.J != null) {
            com.anythink.core.common.b.n.a().a(this.J, j10);
        }
    }

    private void a(com.anythink.core.common.l.d dVar, com.anythink.core.common.e.e eVar) {
        com.anythink.core.common.l.c cVar = new com.anythink.core.common.l.c();
        cVar.f6269a = this.f5953a;
        cVar.f6270b = this.f5954b;
        cVar.f6271c = this.f;
        cVar.f6272d = this.f5958g;
        cVar.f6273e = this.f5957e;
        cVar.f = this.f5959h;
        cVar.f6274g = this.A;
        cVar.f6275h = eVar;
        dVar.a(cVar);
        dVar.a(new AnonymousClass5());
        dVar.b();
    }

    private void a(com.anythink.core.common.e.e eVar, AdError adError) {
        com.anythink.core.common.b.b bVar = this.f5963l;
        if (bVar != null) {
            bVar.b(eVar, adError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, ATBaseAdAdapter aTBaseAdAdapter, ai aiVar) {
        com.anythink.core.common.l.d remove = this.G.remove(str);
        if (remove == null) {
            return;
        }
        a(remove, aTBaseAdAdapter, aiVar, aTBaseAdAdapter.getTrackingInfo());
        aiVar.ab();
        b(aiVar);
        t();
        c(aTBaseAdAdapter.getTrackingInfo());
        aiVar.t();
        a(remove);
    }

    public final synchronized void a(String str, ATBaseAdAdapter aTBaseAdAdapter, List<? extends BaseAd> list) {
        f b10;
        if (aTBaseAdAdapter != null) {
            aTBaseAdAdapter.getTrackingInfo().x();
        }
        com.anythink.core.common.l.d remove = this.G.remove(str);
        if (remove == null) {
            return;
        }
        com.anythink.core.common.e.e trackingInfo = aTBaseAdAdapter.getTrackingInfo();
        ai unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
        unitGroupInfo.ab();
        b(unitGroupInfo);
        t();
        a(remove, aTBaseAdAdapter, unitGroupInfo, trackingInfo);
        if (unitGroupInfo.B() != -1 && trackingInfo.J() > 0) {
            com.anythink.core.common.j.c.a(trackingInfo);
        }
        c(aTBaseAdAdapter.getTrackingInfo());
        com.anythink.core.common.j.a.a(this.f5953a).a(2, trackingInfo);
        com.anythink.core.common.a.a().a(this.f5958g, trackingInfo.z(), aTBaseAdAdapter, list, unitGroupInfo.p());
        com.anythink.core.common.k.g.a(trackingInfo, g.i.f5075b, g.i.f, "");
        if (!this.P && !this.K.c() && (b10 = v.a().b(this.f5958g)) != null && this.f5957e.T() > 0) {
            com.anythink.core.common.b.n.a().a(new f.AnonymousClass4(aTBaseAdAdapter, com.anythink.core.common.k.g.a(unitGroupInfo), this.f));
        }
        a(remove);
    }

    private void a(com.anythink.core.common.l.d dVar, ATBaseAdAdapter aTBaseAdAdapter, ai aiVar, com.anythink.core.common.e.e eVar) {
        eVar.g(aTBaseAdAdapter.getNetworkPlacementId());
        double a10 = dVar.f() != 2 ? com.anythink.core.common.k.g.a(aiVar) : 0.0d;
        if (a10 > this.E) {
            this.E = a10;
        }
        d(aiVar);
        if (this.F == null) {
            this.F = aiVar;
            com.anythink.core.b.f.a().a(this.f5958g, this.F);
        } else if (com.anythink.core.common.k.g.a(aiVar) > com.anythink.core.common.k.g.a(this.F)) {
            this.F = aiVar;
            com.anythink.core.b.f.a().a(this.f5958g, this.F);
        }
        this.L.b(aiVar);
        double d10 = this.O;
        if (d10 <= 0.0d) {
            eVar.f5597s = 0;
        } else if (d10 < a10) {
            eVar.f5597s = 2;
        } else {
            eVar.f5597s = 1;
        }
        com.anythink.core.common.l.f.a(this.f5953a, this.f5958g, this.f, aiVar, null);
    }

    private void a(com.anythink.core.common.l.d dVar) {
        boolean e10 = dVar.e();
        if (e10) {
            this.L.a(-1, dVar.f());
        }
        b(dVar);
        r();
        if (e10) {
            if (this.L.d() == 0 && this.f5970t.size() == 0 && (this.f5968r || this.f5964m)) {
                v();
            }
            dVar.f();
            this.L.a(dVar.f());
            a(this.L.b(dVar.f()), dVar.f());
            l();
        }
    }

    private void a(int i10, List<ai> list, final k.a aVar) {
        boolean z10 = this.N != null || com.anythink.core.common.k.t.a(this.H);
        com.anythink.core.common.e.a aVar2 = new com.anythink.core.common.e.a();
        aVar2.f5387a = this.f5953a;
        aVar2.f5388b = this.f5961j;
        aVar2.f5389c = this.f;
        aVar2.f5390d = this.f5958g;
        aVar2.f5391e = this.f5957e.X();
        aVar2.f = this.f5957e.H();
        aVar2.f5392g = this.f5957e.z();
        i.a();
        aVar2.f5397l = i.a(this.f5957e, z10);
        i.a();
        aVar2.o = i.a(this.f5957e);
        i.a();
        aVar2.f5400p = i.b(this.f5957e);
        aVar2.f5394i = list;
        aVar2.f5399n = this.f5957e;
        aVar2.f5403s = this.f5960i;
        aVar2.f5401q = this.f5959h;
        aVar2.f5407w = this.L.g();
        List<ai> b10 = w.a().b(this.f5958g, this.f);
        if (b10 == null) {
            aVar2.f5395j = new ArrayList(4);
        } else {
            aVar2.f5395j = b10;
        }
        aVar2.f5398m = z10;
        aVar2.f5405u = i10;
        aVar2.f5404t = this.N;
        aVar2.f5406v = com.anythink.core.common.k.g.a(this.Q);
        com.anythink.core.b.b bVar = new com.anythink.core.b.b(aVar2);
        bVar.a(ATSDK.isNetworkLogDebug());
        bVar.a(new k.a() { // from class: com.anythink.core.common.h.8
            @Override // com.anythink.core.common.k.a
            public final void a(String str, List<ai> list2, List<ai> list3) {
                k.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.a(str, list2, list3);
                }
            }

            @Override // com.anythink.core.common.k.a
            public final void b(String str) {
                k.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.b(str);
                }
            }

            @Override // com.anythink.core.common.k.a
            public final void a(String str) {
                k.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.a(str);
                }
            }
        });
    }

    public synchronized void a(String str, com.anythink.core.common.l.a aVar) {
        com.anythink.core.common.e.e eVar = aVar.f6267d;
        ai aiVar = aVar.f6268e;
        AdError adError = aVar.f6265b;
        long j10 = aVar.f6266c;
        String x10 = eVar.x();
        com.anythink.core.common.l.d remove = this.G.remove(str);
        if (remove == null) {
            return;
        }
        aiVar.ab();
        b(aiVar);
        this.y.putNetworkErrorMsg(x10, eVar.H(), eVar.T(), adError);
        com.anythink.core.common.j.c.a(eVar, aVar.f6264a, adError, j10);
        if (j10 > 0) {
            com.anythink.core.common.b.b bVar = this.f5963l;
            if (bVar != null) {
                bVar.b(eVar, adError);
            }
            com.anythink.core.common.k.g.a(eVar, g.i.f5075b, g.i.f5079g, adError.printStackTrace());
        }
        a(remove);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str) {
        if (this.K.b()) {
            return;
        }
        a(this.G.get(str));
    }

    public final synchronized void a(double d10, ai aiVar) {
        if (!this.K.g() && aiVar != null && aiVar.j()) {
            this.K.h();
        }
        if (d10 > this.O) {
            this.O = d10;
        }
        int X = this.f5957e.X();
        if (X == 0 || X == 2) {
            return;
        }
        this.K.d();
        v.a().b(this.f5958g).b(this.f);
        if (!this.o) {
            b(10);
        }
        l();
    }

    public void a(AdError adError) {
        com.anythink.core.common.b.a aVar;
        com.anythink.core.common.k.n.a("Mediation", "placementId:" + this.f5958g + ";result_callback:fail;loadType:" + this.f5962k + com.huawei.openalliance.ad.constant.w.aG);
        j jVar = this.f5961j;
        if (jVar == null || (aVar = jVar.f) == null) {
            return;
        }
        aVar.onAdLoadFail(adError);
        this.f5961j.f = null;
    }

    private void a(List<ai> list) {
        this.R = list;
    }

    public static /* synthetic */ void a(h hVar, com.anythink.core.common.l.d dVar, com.anythink.core.common.e.e eVar) {
        com.anythink.core.common.l.c cVar = new com.anythink.core.common.l.c();
        cVar.f6269a = hVar.f5953a;
        cVar.f6270b = hVar.f5954b;
        cVar.f6271c = hVar.f;
        cVar.f6272d = hVar.f5958g;
        cVar.f6273e = hVar.f5957e;
        cVar.f = hVar.f5959h;
        cVar.f6274g = hVar.A;
        cVar.f6275h = eVar;
        dVar.a(cVar);
        dVar.a(new AnonymousClass5());
        dVar.b();
    }

    public static /* synthetic */ void a(h hVar, com.anythink.core.common.e.e eVar) {
        com.anythink.core.common.b.b bVar = hVar.f5963l;
        if (bVar != null) {
            bVar.c(eVar);
        }
    }
}
