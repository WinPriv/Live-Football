package com.applovin.exoplayer2.d;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.applovin.exoplayer2.common.a.aq;
import com.applovin.exoplayer2.common.a.ax;
import com.applovin.exoplayer2.d.b;
import com.applovin.exoplayer2.d.c;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.d.h;
import com.applovin.exoplayer2.d.m;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public class c implements h {

    /* renamed from: a, reason: collision with root package name */
    volatile HandlerC0161c f13972a;

    /* renamed from: d, reason: collision with root package name */
    private final UUID f13973d;

    /* renamed from: e, reason: collision with root package name */
    private final m.c f13974e;
    private final r f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f13975g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f13976h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f13977i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f13978j;

    /* renamed from: k, reason: collision with root package name */
    private final f f13979k;

    /* renamed from: l, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.v f13980l;

    /* renamed from: m, reason: collision with root package name */
    private final g f13981m;

    /* renamed from: n, reason: collision with root package name */
    private final long f13982n;
    private final List<com.applovin.exoplayer2.d.b> o;

    /* renamed from: p, reason: collision with root package name */
    private final Set<e> f13983p;

    /* renamed from: q, reason: collision with root package name */
    private final Set<com.applovin.exoplayer2.d.b> f13984q;

    /* renamed from: r, reason: collision with root package name */
    private int f13985r;

    /* renamed from: s, reason: collision with root package name */
    private m f13986s;

    /* renamed from: t, reason: collision with root package name */
    private com.applovin.exoplayer2.d.b f13987t;

    /* renamed from: u, reason: collision with root package name */
    private com.applovin.exoplayer2.d.b f13988u;

    /* renamed from: v, reason: collision with root package name */
    private Looper f13989v;

    /* renamed from: w, reason: collision with root package name */
    private Handler f13990w;

    /* renamed from: x, reason: collision with root package name */
    private int f13991x;
    private byte[] y;

    /* loaded from: classes.dex */
    public class b implements m.b {
        private b() {
        }

        @Override // com.applovin.exoplayer2.d.m.b
        public void a(m mVar, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((HandlerC0161c) com.applovin.exoplayer2.l.a.b(c.this.f13972a)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.applovin.exoplayer2.d.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class HandlerC0161c extends Handler {
        public HandlerC0161c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (com.applovin.exoplayer2.d.b bVar : c.this.o) {
                if (bVar.a(bArr)) {
                    bVar.a(message.what);
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends Exception {
        private d(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* loaded from: classes.dex */
    public class e implements h.a {

        /* renamed from: c, reason: collision with root package name */
        private final g.a f14002c;

        /* renamed from: d, reason: collision with root package name */
        private com.applovin.exoplayer2.d.f f14003d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f14004e;

        public e(g.a aVar) {
            this.f14002c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(com.applovin.exoplayer2.v vVar) {
            if (c.this.f13985r != 0 && !this.f14004e) {
                c cVar = c.this;
                this.f14003d = cVar.a((Looper) com.applovin.exoplayer2.l.a.b(cVar.f13989v), this.f14002c, vVar, false);
                c.this.f13983p.add(this);
            }
        }

        @Override // com.applovin.exoplayer2.d.h.a
        public void release() {
            ai.a((Handler) com.applovin.exoplayer2.l.a.b(c.this.f13990w), new Runnable() { // from class: com.applovin.exoplayer2.d.y
                @Override // java.lang.Runnable
                public final void run() {
                    c.e.this.a();
                }
            });
        }

        public void a(final com.applovin.exoplayer2.v vVar) {
            ((Handler) com.applovin.exoplayer2.l.a.b(c.this.f13990w)).post(new Runnable() { // from class: com.applovin.exoplayer2.d.z
                @Override // java.lang.Runnable
                public final void run() {
                    c.e.this.b(vVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            if (this.f14004e) {
                return;
            }
            com.applovin.exoplayer2.d.f fVar = this.f14003d;
            if (fVar != null) {
                fVar.b(this.f14002c);
            }
            c.this.f13983p.remove(this);
            this.f14004e = true;
        }
    }

    /* loaded from: classes.dex */
    public class g implements b.InterfaceC0160b {
        private g() {
        }

        @Override // com.applovin.exoplayer2.d.b.InterfaceC0160b
        public void a(com.applovin.exoplayer2.d.b bVar, int i10) {
            if (c.this.f13982n != com.anythink.expressad.exoplayer.b.f7291b) {
                c.this.f13984q.remove(bVar);
                ((Handler) com.applovin.exoplayer2.l.a.b(c.this.f13990w)).removeCallbacksAndMessages(bVar);
            }
        }

        @Override // com.applovin.exoplayer2.d.b.InterfaceC0160b
        public void b(final com.applovin.exoplayer2.d.b bVar, int i10) {
            if (i10 == 1 && c.this.f13985r > 0 && c.this.f13982n != com.anythink.expressad.exoplayer.b.f7291b) {
                c.this.f13984q.add(bVar);
                ((Handler) com.applovin.exoplayer2.l.a.b(c.this.f13990w)).postAtTime(new Runnable() { // from class: com.applovin.exoplayer2.d.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.b(null);
                    }
                }, bVar, c.this.f13982n + SystemClock.uptimeMillis());
            } else if (i10 == 0) {
                c.this.o.remove(bVar);
                if (c.this.f13987t == bVar) {
                    c.this.f13987t = null;
                }
                if (c.this.f13988u == bVar) {
                    c.this.f13988u = null;
                }
                c.this.f13979k.b(bVar);
                if (c.this.f13982n != com.anythink.expressad.exoplayer.b.f7291b) {
                    ((Handler) com.applovin.exoplayer2.l.a.b(c.this.f13990w)).removeCallbacksAndMessages(bVar);
                    c.this.f13984q.remove(bVar);
                }
            }
            c.this.e();
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private boolean f13995d;
        private boolean f;

        /* renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f13992a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        private UUID f13993b = com.applovin.exoplayer2.h.f15242d;

        /* renamed from: c, reason: collision with root package name */
        private m.c f13994c = o.f14048a;

        /* renamed from: g, reason: collision with root package name */
        private com.applovin.exoplayer2.k.v f13997g = new com.applovin.exoplayer2.k.r();

        /* renamed from: e, reason: collision with root package name */
        private int[] f13996e = new int[0];

        /* renamed from: h, reason: collision with root package name */
        private long f13998h = com.huawei.openalliance.ad.constant.w.as;

        public a a(UUID uuid, m.c cVar) {
            this.f13993b = (UUID) com.applovin.exoplayer2.l.a.b(uuid);
            this.f13994c = (m.c) com.applovin.exoplayer2.l.a.b(cVar);
            return this;
        }

        public a b(boolean z10) {
            this.f = z10;
            return this;
        }

        public a a(boolean z10) {
            this.f13995d = z10;
            return this;
        }

        public a a(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                com.applovin.exoplayer2.l.a.a(z10);
            }
            this.f13996e = (int[]) iArr.clone();
            return this;
        }

        public c a(r rVar) {
            return new c(this.f13993b, this.f13994c, rVar, this.f13992a, this.f13995d, this.f13996e, this.f, this.f13997g, this.f13998h);
        }
    }

    private c(UUID uuid, m.c cVar, r rVar, HashMap<String, String> hashMap, boolean z10, int[] iArr, boolean z11, com.applovin.exoplayer2.k.v vVar, long j10) {
        com.applovin.exoplayer2.l.a.b(uuid);
        com.applovin.exoplayer2.l.a.a(!com.applovin.exoplayer2.h.f15240b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f13973d = uuid;
        this.f13974e = cVar;
        this.f = rVar;
        this.f13975g = hashMap;
        this.f13976h = z10;
        this.f13977i = iArr;
        this.f13978j = z11;
        this.f13980l = vVar;
        this.f13979k = new f();
        this.f13981m = new g();
        this.f13991x = 0;
        this.o = new ArrayList();
        this.f13983p = aq.b();
        this.f13984q = aq.b();
        this.f13982n = j10;
    }

    private void c() {
        ax it = com.applovin.exoplayer2.common.a.w.a((Collection) this.f13984q).iterator();
        while (it.hasNext()) {
            ((com.applovin.exoplayer2.d.f) it.next()).b(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d() {
        ax it = com.applovin.exoplayer2.common.a.w.a((Collection) this.f13983p).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f13986s != null && this.f13985r == 0 && this.o.isEmpty() && this.f13983p.isEmpty()) {
            ((m) com.applovin.exoplayer2.l.a.b(this.f13986s)).c();
            this.f13986s = null;
        }
    }

    @Override // com.applovin.exoplayer2.d.h
    public final void b() {
        int i10 = this.f13985r - 1;
        this.f13985r = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f13982n != com.anythink.expressad.exoplayer.b.f7291b) {
            ArrayList arrayList = new ArrayList(this.o);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((com.applovin.exoplayer2.d.b) arrayList.get(i11)).b(null);
            }
        }
        d();
        e();
    }

    /* loaded from: classes.dex */
    public class f implements b.a {

        /* renamed from: b, reason: collision with root package name */
        private final Set<com.applovin.exoplayer2.d.b> f14006b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private com.applovin.exoplayer2.d.b f14007c;

        public f() {
        }

        @Override // com.applovin.exoplayer2.d.b.a
        public void a(com.applovin.exoplayer2.d.b bVar) {
            this.f14006b.add(bVar);
            if (this.f14007c != null) {
                return;
            }
            this.f14007c = bVar;
            bVar.a();
        }

        public void b(com.applovin.exoplayer2.d.b bVar) {
            this.f14006b.remove(bVar);
            if (this.f14007c == bVar) {
                this.f14007c = null;
                if (!this.f14006b.isEmpty()) {
                    com.applovin.exoplayer2.d.b next = this.f14006b.iterator().next();
                    this.f14007c = next;
                    next.a();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.d.b.a
        public void a() {
            this.f14007c = null;
            com.applovin.exoplayer2.common.a.s a10 = com.applovin.exoplayer2.common.a.s.a((Collection) this.f14006b);
            this.f14006b.clear();
            ax it = a10.iterator();
            while (it.hasNext()) {
                ((com.applovin.exoplayer2.d.b) it.next()).b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.d.b.a
        public void a(Exception exc, boolean z10) {
            this.f14007c = null;
            com.applovin.exoplayer2.common.a.s a10 = com.applovin.exoplayer2.common.a.s.a((Collection) this.f14006b);
            this.f14006b.clear();
            ax it = a10.iterator();
            while (it.hasNext()) {
                ((com.applovin.exoplayer2.d.b) it.next()).a(exc, z10);
            }
        }
    }

    public void a(int i10, byte[] bArr) {
        com.applovin.exoplayer2.l.a.b(this.o.isEmpty());
        if (i10 == 1 || i10 == 3) {
            com.applovin.exoplayer2.l.a.b(bArr);
        }
        this.f13991x = i10;
        this.y = bArr;
    }

    @Override // com.applovin.exoplayer2.d.h
    public final void a() {
        int i10 = this.f13985r;
        this.f13985r = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f13986s == null) {
            m acquireExoMediaDrm = this.f13974e.acquireExoMediaDrm(this.f13973d);
            this.f13986s = acquireExoMediaDrm;
            acquireExoMediaDrm.a(new b());
        } else if (this.f13982n != com.anythink.expressad.exoplayer.b.f7291b) {
            for (int i11 = 0; i11 < this.o.size(); i11++) {
                this.o.get(i11).a((g.a) null);
            }
        }
    }

    @Override // com.applovin.exoplayer2.d.h
    public com.applovin.exoplayer2.d.f b(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar) {
        com.applovin.exoplayer2.l.a.b(this.f13985r > 0);
        a(looper);
        return a(looper, aVar, vVar, true);
    }

    private void b(Looper looper) {
        if (this.f13972a == null) {
            this.f13972a = new HandlerC0161c(looper);
        }
    }

    @Override // com.applovin.exoplayer2.d.h
    public h.a a(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar) {
        com.applovin.exoplayer2.l.a.b(this.f13985r > 0);
        a(looper);
        e eVar = new e(aVar);
        eVar.a(vVar);
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public com.applovin.exoplayer2.d.f a(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar, boolean z10) {
        List<e.a> list;
        b(looper);
        com.applovin.exoplayer2.d.e eVar = vVar.o;
        if (eVar == null) {
            return a(com.applovin.exoplayer2.l.u.e(vVar.f16838l), z10);
        }
        com.applovin.exoplayer2.d.b bVar = null;
        Object[] objArr = 0;
        if (this.y == null) {
            list = a((com.applovin.exoplayer2.d.e) com.applovin.exoplayer2.l.a.b(eVar), this.f13973d, false);
            if (list.isEmpty()) {
                d dVar = new d(this.f13973d);
                com.applovin.exoplayer2.l.q.c("DefaultDrmSessionMgr", "DRM error", dVar);
                if (aVar != null) {
                    aVar.a(dVar);
                }
                return new l(new f.a(dVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            list = null;
        }
        if (!this.f13976h) {
            bVar = this.f13988u;
        } else {
            Iterator<com.applovin.exoplayer2.d.b> it = this.o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.applovin.exoplayer2.d.b next = it.next();
                if (ai.a(next.f13940a, list)) {
                    bVar = next;
                    break;
                }
            }
        }
        if (bVar == null) {
            bVar = a(list, false, aVar, z10);
            if (!this.f13976h) {
                this.f13988u = bVar;
            }
            this.o.add(bVar);
        } else {
            bVar.a(aVar);
        }
        return bVar;
    }

    @Override // com.applovin.exoplayer2.d.h
    public int a(com.applovin.exoplayer2.v vVar) {
        int d10 = ((m) com.applovin.exoplayer2.l.a.b(this.f13986s)).d();
        com.applovin.exoplayer2.d.e eVar = vVar.o;
        if (eVar == null) {
            if (ai.a(this.f13977i, com.applovin.exoplayer2.l.u.e(vVar.f16838l)) != -1) {
                return d10;
            }
            return 0;
        }
        if (a(eVar)) {
            return d10;
        }
        return 1;
    }

    private com.applovin.exoplayer2.d.f a(int i10, boolean z10) {
        m mVar = (m) com.applovin.exoplayer2.l.a.b(this.f13986s);
        if ((mVar.d() == 2 && n.f14044a) || ai.a(this.f13977i, i10) == -1 || mVar.d() == 1) {
            return null;
        }
        com.applovin.exoplayer2.d.b bVar = this.f13987t;
        if (bVar == null) {
            com.applovin.exoplayer2.d.b a10 = a((List<e.a>) com.applovin.exoplayer2.common.a.s.g(), true, (g.a) null, z10);
            this.o.add(a10);
            this.f13987t = a10;
        } else {
            bVar.a((g.a) null);
        }
        return this.f13987t;
    }

    private boolean a(com.applovin.exoplayer2.d.e eVar) {
        if (this.y != null) {
            return true;
        }
        if (a(eVar, this.f13973d, true).isEmpty()) {
            if (eVar.f14021b != 1 || !eVar.a(0).a(com.applovin.exoplayer2.h.f15240b)) {
                return false;
            }
            com.applovin.exoplayer2.l.q.c("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f13973d);
        }
        String str = eVar.f14020a;
        if (str == null || com.anythink.expressad.exoplayer.b.f7295bd.equals(str)) {
            return true;
        }
        return com.anythink.expressad.exoplayer.b.bg.equals(str) ? ai.f16274a >= 25 : (com.anythink.expressad.exoplayer.b.be.equals(str) || com.anythink.expressad.exoplayer.b.bf.equals(str)) ? false : true;
    }

    private synchronized void a(Looper looper) {
        Looper looper2 = this.f13989v;
        if (looper2 == null) {
            this.f13989v = looper;
            this.f13990w = new Handler(looper);
        } else {
            com.applovin.exoplayer2.l.a.b(looper2 == looper);
            com.applovin.exoplayer2.l.a.b(this.f13990w);
        }
    }

    private com.applovin.exoplayer2.d.b a(List<e.a> list, boolean z10, g.a aVar, boolean z11) {
        com.applovin.exoplayer2.d.b a10 = a(list, z10, aVar);
        if (a(a10) && !this.f13984q.isEmpty()) {
            c();
            a(a10, aVar);
            a10 = a(list, z10, aVar);
        }
        if (!a(a10) || !z11 || this.f13983p.isEmpty()) {
            return a10;
        }
        d();
        if (!this.f13984q.isEmpty()) {
            c();
        }
        a(a10, aVar);
        return a(list, z10, aVar);
    }

    private static boolean a(com.applovin.exoplayer2.d.f fVar) {
        return fVar.c() == 1 && (ai.f16274a < 19 || (((f.a) com.applovin.exoplayer2.l.a.b(fVar.e())).getCause() instanceof ResourceBusyException));
    }

    private void a(com.applovin.exoplayer2.d.f fVar, g.a aVar) {
        fVar.b(aVar);
        if (this.f13982n != com.anythink.expressad.exoplayer.b.f7291b) {
            fVar.b(null);
        }
    }

    private com.applovin.exoplayer2.d.b a(List<e.a> list, boolean z10, g.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.f13986s);
        com.applovin.exoplayer2.d.b bVar = new com.applovin.exoplayer2.d.b(this.f13973d, this.f13986s, this.f13979k, this.f13981m, list, this.f13991x, this.f13978j | z10, z10, this.y, this.f13975g, this.f, (Looper) com.applovin.exoplayer2.l.a.b(this.f13989v), this.f13980l);
        bVar.a(aVar);
        if (this.f13982n != com.anythink.expressad.exoplayer.b.f7291b) {
            bVar.a((g.a) null);
        }
        return bVar;
    }

    private static List<e.a> a(com.applovin.exoplayer2.d.e eVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(eVar.f14021b);
        for (int i10 = 0; i10 < eVar.f14021b; i10++) {
            e.a a10 = eVar.a(i10);
            if ((a10.a(uuid) || (com.applovin.exoplayer2.h.f15241c.equals(uuid) && a10.a(com.applovin.exoplayer2.h.f15240b))) && (a10.f14027d != null || z10)) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }
}
