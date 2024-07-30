package com.applovin.exoplayer2.d;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.d.m;
import com.applovin.exoplayer2.k.v;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b implements com.applovin.exoplayer2.d.f {

    /* renamed from: a, reason: collision with root package name */
    public final List<e.a> f13940a;

    /* renamed from: b, reason: collision with root package name */
    final r f13941b;

    /* renamed from: c, reason: collision with root package name */
    final UUID f13942c;

    /* renamed from: d, reason: collision with root package name */
    final e f13943d;

    /* renamed from: e, reason: collision with root package name */
    private final m f13944e;
    private final a f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC0160b f13945g;

    /* renamed from: h, reason: collision with root package name */
    private final int f13946h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f13947i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f13948j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap<String, String> f13949k;

    /* renamed from: l, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.i<g.a> f13950l;

    /* renamed from: m, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.v f13951m;

    /* renamed from: n, reason: collision with root package name */
    private int f13952n;
    private int o;

    /* renamed from: p, reason: collision with root package name */
    private HandlerThread f13953p;

    /* renamed from: q, reason: collision with root package name */
    private c f13954q;

    /* renamed from: r, reason: collision with root package name */
    private com.applovin.exoplayer2.c.b f13955r;

    /* renamed from: s, reason: collision with root package name */
    private f.a f13956s;

    /* renamed from: t, reason: collision with root package name */
    private byte[] f13957t;

    /* renamed from: u, reason: collision with root package name */
    private byte[] f13958u;

    /* renamed from: v, reason: collision with root package name */
    private m.a f13959v;

    /* renamed from: w, reason: collision with root package name */
    private m.d f13960w;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(b bVar);

        void a(Exception exc, boolean z10);
    }

    /* renamed from: com.applovin.exoplayer2.d.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0160b {
        void a(b bVar, int i10);

        void b(b bVar, int i10);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f13963a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13964b;

        /* renamed from: c, reason: collision with root package name */
        public final long f13965c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f13966d;

        /* renamed from: e, reason: collision with root package name */
        public int f13967e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f13963a = j10;
            this.f13964b = z10;
            this.f13965c = j11;
            this.f13966d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                b.this.a(obj, obj2);
            } else if (i10 == 1) {
                b.this.b(obj, obj2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public b(UUID uuid, m mVar, a aVar, InterfaceC0160b interfaceC0160b, List<e.a> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> hashMap, r rVar, Looper looper, com.applovin.exoplayer2.k.v vVar) {
        if (i10 == 1 || i10 == 3) {
            com.applovin.exoplayer2.l.a.b(bArr);
        }
        this.f13942c = uuid;
        this.f = aVar;
        this.f13945g = interfaceC0160b;
        this.f13944e = mVar;
        this.f13946h = i10;
        this.f13947i = z10;
        this.f13948j = z11;
        if (bArr != null) {
            this.f13958u = bArr;
            this.f13940a = null;
        } else {
            this.f13940a = Collections.unmodifiableList((List) com.applovin.exoplayer2.l.a.b(list));
        }
        this.f13949k = hashMap;
        this.f13941b = rVar;
        this.f13950l = new com.applovin.exoplayer2.l.i<>();
        this.f13951m = vVar;
        this.f13952n = 2;
        this.f13943d = new e(looper);
    }

    private boolean i() {
        if (m()) {
            return true;
        }
        try {
            byte[] a10 = this.f13944e.a();
            this.f13957t = a10;
            this.f13955r = this.f13944e.d(a10);
            this.f13952n = 3;
            a(new com.applovin.exoplayer2.l.h() { // from class: com.applovin.exoplayer2.d.v
                @Override // com.applovin.exoplayer2.l.h, d6.f
                public final void accept(Object obj) {
                    ((g.a) obj).a(3);
                }
            });
            com.applovin.exoplayer2.l.a.b(this.f13957t);
            return true;
        } catch (NotProvisionedException unused) {
            this.f.a(this);
            return false;
        } catch (Exception e10) {
            a(e10, 1);
            return false;
        }
    }

    private boolean j() {
        try {
            this.f13944e.b(this.f13957t, this.f13958u);
            return true;
        } catch (Exception e10) {
            a(e10, 1);
            return false;
        }
    }

    private long k() {
        if (!com.applovin.exoplayer2.h.f15242d.equals(this.f13942c)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) com.applovin.exoplayer2.l.a.b(u.a(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private void l() {
        if (this.f13946h == 0 && this.f13952n == 4) {
            ai.a(this.f13957t);
            a(false);
        }
    }

    private boolean m() {
        int i10 = this.f13952n;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    @Override // com.applovin.exoplayer2.d.f
    public boolean d() {
        return this.f13947i;
    }

    @Override // com.applovin.exoplayer2.d.f
    public final f.a e() {
        if (this.f13952n == 1) {
            return this.f13956s;
        }
        return null;
    }

    @Override // com.applovin.exoplayer2.d.f
    public final UUID f() {
        return this.f13942c;
    }

    @Override // com.applovin.exoplayer2.d.f
    public final com.applovin.exoplayer2.c.b g() {
        return this.f13955r;
    }

    @Override // com.applovin.exoplayer2.d.f
    public Map<String, String> h() {
        byte[] bArr = this.f13957t;
        if (bArr == null) {
            return null;
        }
        return this.f13944e.c(bArr);
    }

    @Override // com.applovin.exoplayer2.d.f
    public final int c() {
        return this.f13952n;
    }

    public boolean a(byte[] bArr) {
        return Arrays.equals(this.f13957t, bArr);
    }

    public void b() {
        if (i()) {
            a(true);
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public class c extends Handler {

        /* renamed from: b, reason: collision with root package name */
        private boolean f13962b;

        public c(Looper looper) {
            super(looper);
        }

        public void a(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(com.applovin.exoplayer2.h.j.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable th;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 != 0) {
                    if (i10 == 1) {
                        b bVar = b.this;
                        th = bVar.f13941b.a(bVar.f13942c, (m.a) dVar.f13966d);
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    b bVar2 = b.this;
                    th = bVar2.f13941b.a(bVar2.f13942c, (m.d) dVar.f13966d);
                }
            } catch (s e10) {
                boolean a10 = a(message, e10);
                th = e10;
                if (a10) {
                    return;
                }
            } catch (Exception e11) {
                com.applovin.exoplayer2.l.q.b("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                th = e11;
            }
            b.this.f13951m.a(dVar.f13963a);
            synchronized (this) {
                if (!this.f13962b) {
                    b.this.f13943d.obtainMessage(message.what, Pair.create(dVar.f13966d, th)).sendToTarget();
                }
            }
        }

        private boolean a(Message message, s sVar) {
            IOException fVar;
            d dVar = (d) message.obj;
            if (!dVar.f13964b) {
                return false;
            }
            int i10 = dVar.f13967e + 1;
            dVar.f13967e = i10;
            if (i10 > b.this.f13951m.a(3)) {
                return false;
            }
            com.applovin.exoplayer2.h.j jVar = new com.applovin.exoplayer2.h.j(dVar.f13963a, sVar.f14056a, sVar.f14057b, sVar.f14058c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f13965c, sVar.f14059d);
            com.applovin.exoplayer2.h.m mVar = new com.applovin.exoplayer2.h.m(3);
            if (sVar.getCause() instanceof IOException) {
                fVar = (IOException) sVar.getCause();
            } else {
                fVar = new f(sVar.getCause());
            }
            long a10 = b.this.f13951m.a(new v.a(jVar, mVar, fVar, dVar.f13967e));
            if (a10 == com.anythink.expressad.exoplayer.b.f7291b) {
                return false;
            }
            synchronized (this) {
                if (this.f13962b) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), a10);
                return true;
            }
        }

        public synchronized void a() {
            removeCallbacksAndMessages(null);
            this.f13962b = true;
        }
    }

    public void a(int i10) {
        if (i10 != 2) {
            return;
        }
        l();
    }

    public void a() {
        this.f13960w = this.f13944e.b();
        ((c) ai.a(this.f13954q)).a(0, com.applovin.exoplayer2.l.a.b(this.f13960w), true);
    }

    @Override // com.applovin.exoplayer2.d.f
    public void b(g.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.o > 0);
        int i10 = this.o - 1;
        this.o = i10;
        if (i10 == 0) {
            this.f13952n = 0;
            ((e) ai.a(this.f13943d)).removeCallbacksAndMessages(null);
            ((c) ai.a(this.f13954q)).a();
            this.f13954q = null;
            ((HandlerThread) ai.a(this.f13953p)).quit();
            this.f13953p = null;
            this.f13955r = null;
            this.f13956s = null;
            this.f13959v = null;
            this.f13960w = null;
            byte[] bArr = this.f13957t;
            if (bArr != null) {
                this.f13944e.a(bArr);
                this.f13957t = null;
            }
        }
        if (aVar != null) {
            this.f13950l.b(aVar);
            if (this.f13950l.c(aVar) == 0) {
                aVar.d();
            }
        }
        this.f13945g.b(this, this.o);
    }

    public void a(Exception exc, boolean z10) {
        a(exc, z10 ? 1 : 3);
    }

    @Override // com.applovin.exoplayer2.d.f
    public boolean a(String str) {
        return this.f13944e.a((byte[]) com.applovin.exoplayer2.l.a.a(this.f13957t), str);
    }

    @Override // com.applovin.exoplayer2.d.f
    public void a(g.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.o >= 0);
        if (aVar != null) {
            this.f13950l.a(aVar);
        }
        int i10 = this.o + 1;
        this.o = i10;
        if (i10 == 1) {
            com.applovin.exoplayer2.l.a.b(this.f13952n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f13953p = handlerThread;
            handlerThread.start();
            this.f13954q = new c(this.f13953p.getLooper());
            if (i()) {
                a(true);
            }
        } else if (aVar != null && m() && this.f13950l.c(aVar) == 1) {
            aVar.a(this.f13952n);
        }
        this.f13945g.a(this, this.o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj, Object obj2) {
        if (obj == this.f13959v && m()) {
            this.f13959v = null;
            if (obj2 instanceof Exception) {
                b((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f13946h == 3) {
                    this.f13944e.a((byte[]) ai.a(this.f13958u), bArr);
                    a(new com.applovin.exoplayer2.a.l(5));
                    return;
                }
                byte[] a10 = this.f13944e.a(this.f13957t, bArr);
                int i10 = this.f13946h;
                if ((i10 == 2 || (i10 == 0 && this.f13958u != null)) && a10 != null && a10.length != 0) {
                    this.f13958u = a10;
                }
                this.f13952n = 4;
                a(new com.applovin.exoplayer2.a0(4));
            } catch (Exception e10) {
                b(e10, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, Object obj2) {
        if (obj == this.f13960w) {
            if (this.f13952n == 2 || m()) {
                this.f13960w = null;
                if (obj2 instanceof Exception) {
                    this.f.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f13944e.b((byte[]) obj2);
                    this.f.a();
                } catch (Exception e10) {
                    this.f.a(e10, true);
                }
            }
        }
    }

    private void a(boolean z10) {
        if (this.f13948j) {
            return;
        }
        byte[] bArr = (byte[]) ai.a(this.f13957t);
        int i10 = this.f13946h;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f13958u == null || j()) {
                    a(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            com.applovin.exoplayer2.l.a.b(this.f13958u);
            com.applovin.exoplayer2.l.a.b(this.f13957t);
            a(this.f13958u, 3, z10);
            return;
        }
        if (this.f13958u == null) {
            a(bArr, 1, z10);
            return;
        }
        if (this.f13952n == 4 || j()) {
            long k10 = k();
            if (this.f13946h == 0 && k10 <= 60) {
                com.applovin.exoplayer2.l.q.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + k10);
                a(bArr, 2, z10);
                return;
            }
            if (k10 <= 0) {
                a(new q(), 2);
            } else {
                this.f13952n = 4;
                a(new w(0));
            }
        }
    }

    private void b(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f.a(this);
        } else {
            a(exc, z10 ? 1 : 2);
        }
    }

    private void a(byte[] bArr, int i10, boolean z10) {
        try {
            this.f13959v = this.f13944e.a(bArr, this.f13940a, i10, this.f13949k);
            ((c) ai.a(this.f13954q)).a(1, com.applovin.exoplayer2.l.a.b(this.f13959v), z10);
        } catch (Exception e10) {
            b(e10, true);
        }
    }

    private void a(final Exception exc, int i10) {
        this.f13956s = new f.a(exc, j.a(exc, i10));
        com.applovin.exoplayer2.l.q.c("DefaultDrmSession", "DRM session error", exc);
        a(new com.applovin.exoplayer2.l.h() { // from class: com.applovin.exoplayer2.d.x
            @Override // com.applovin.exoplayer2.l.h, d6.f
            public final void accept(Object obj) {
                ((g.a) obj).a(exc);
            }
        });
        if (this.f13952n != 4) {
            this.f13952n = 1;
        }
    }

    private void a(com.applovin.exoplayer2.l.h<g.a> hVar) {
        Iterator<g.a> it = this.f13950l.a().iterator();
        while (it.hasNext()) {
            hVar.accept(it.next());
        }
    }
}
