package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import c6.a0;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.i;
import d6.g0;
import d6.p;
import j5.o;
import j7.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import l4.w;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: DefaultDrmSession.java */
/* loaded from: classes2.dex */
public final class a implements com.google.android.exoplayer2.drm.d {

    /* renamed from: a, reason: collision with root package name */
    public final List<DrmInitData.SchemeData> f19914a;

    /* renamed from: b, reason: collision with root package name */
    public final i f19915b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0229a f19916c;

    /* renamed from: d, reason: collision with root package name */
    public final b f19917d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19918e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19919g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap<String, String> f19920h;

    /* renamed from: i, reason: collision with root package name */
    public final d6.g<e.a> f19921i;

    /* renamed from: j, reason: collision with root package name */
    public final a0 f19922j;

    /* renamed from: k, reason: collision with root package name */
    public final w f19923k;

    /* renamed from: l, reason: collision with root package name */
    public final l f19924l;

    /* renamed from: m, reason: collision with root package name */
    public final UUID f19925m;

    /* renamed from: n, reason: collision with root package name */
    public final e f19926n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f19927p;

    /* renamed from: q, reason: collision with root package name */
    public HandlerThread f19928q;

    /* renamed from: r, reason: collision with root package name */
    public c f19929r;

    /* renamed from: s, reason: collision with root package name */
    public n4.b f19930s;

    /* renamed from: t, reason: collision with root package name */
    public d.a f19931t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f19932u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f19933v;

    /* renamed from: w, reason: collision with root package name */
    public i.a f19934w;

    /* renamed from: x, reason: collision with root package name */
    public i.d f19935x;

    /* compiled from: DefaultDrmSession.java */
    /* renamed from: com.google.android.exoplayer2.drm.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0229a {
    }

    /* compiled from: DefaultDrmSession.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    /* compiled from: DefaultDrmSession.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f19936a;

        public c(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r8.obj
                com.google.android.exoplayer2.drm.a$d r0 = (com.google.android.exoplayer2.drm.a.d) r0
                r1 = 1
                int r2 = r8.what     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                if (r2 == 0) goto L23
                if (r2 != r1) goto L1d
                com.google.android.exoplayer2.drm.a r2 = com.google.android.exoplayer2.drm.a.this     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                com.google.android.exoplayer2.drm.l r3 = r2.f19924l     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                java.util.UUID r2 = r2.f19925m     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                java.lang.Object r4 = r0.f19940c     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                com.google.android.exoplayer2.drm.i$a r4 = (com.google.android.exoplayer2.drm.i.a) r4     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                com.google.android.exoplayer2.drm.k r3 = (com.google.android.exoplayer2.drm.k) r3     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                byte[] r1 = r3.a(r2, r4)     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                goto La4
            L1d:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                r2.<init>()     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                throw r2     // Catch: java.lang.Exception -> L33 o4.j -> L3c
            L23:
                com.google.android.exoplayer2.drm.a r2 = com.google.android.exoplayer2.drm.a.this     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                com.google.android.exoplayer2.drm.l r2 = r2.f19924l     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                java.lang.Object r3 = r0.f19940c     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                com.google.android.exoplayer2.drm.i$d r3 = (com.google.android.exoplayer2.drm.i.d) r3     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                com.google.android.exoplayer2.drm.k r2 = (com.google.android.exoplayer2.drm.k) r2     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                byte[] r1 = r2.c(r3)     // Catch: java.lang.Exception -> L33 o4.j -> L3c
                goto La4
            L33:
                r1 = move-exception
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                d6.p.g(r2, r3, r1)
                goto La4
            L3c:
                r2 = move-exception
                java.lang.Object r3 = r8.obj
                com.google.android.exoplayer2.drm.a$d r3 = (com.google.android.exoplayer2.drm.a.d) r3
                boolean r4 = r3.f19939b
                if (r4 != 0) goto L46
                goto L9f
            L46:
                int r4 = r3.f19941d
                int r4 = r4 + r1
                r3.f19941d = r4
                com.google.android.exoplayer2.drm.a r5 = com.google.android.exoplayer2.drm.a.this
                c6.a0 r5 = r5.f19922j
                r6 = 3
                int r5 = r5.c(r6)
                if (r4 <= r5) goto L57
                goto L9f
            L57:
                j5.o r4 = new j5.o
                android.os.SystemClock.elapsedRealtime()
                android.os.SystemClock.elapsedRealtime()
                java.lang.Throwable r4 = r2.getCause()
                boolean r4 = r4 instanceof java.io.IOException
                if (r4 == 0) goto L6e
                java.lang.Throwable r4 = r2.getCause()
                java.io.IOException r4 = (java.io.IOException) r4
                goto L77
            L6e:
                com.google.android.exoplayer2.drm.a$f r4 = new com.google.android.exoplayer2.drm.a$f
                java.lang.Throwable r5 = r2.getCause()
                r4.<init>(r5)
            L77:
                com.google.android.exoplayer2.drm.a r5 = com.google.android.exoplayer2.drm.a.this
                c6.a0 r5 = r5.f19922j
                c6.a0$c r6 = new c6.a0$c
                int r3 = r3.f19941d
                r6.<init>(r4, r3)
                long r3 = r5.a(r6)
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r5 != 0) goto L90
                goto L9f
            L90:
                monitor-enter(r7)
                boolean r5 = r7.f19936a     // Catch: java.lang.Throwable -> Lca
                if (r5 != 0) goto L9e
                android.os.Message r5 = android.os.Message.obtain(r8)     // Catch: java.lang.Throwable -> Lca
                r7.sendMessageDelayed(r5, r3)     // Catch: java.lang.Throwable -> Lca
                monitor-exit(r7)     // Catch: java.lang.Throwable -> Lca
                goto La0
            L9e:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> Lca
            L9f:
                r1 = 0
            La0:
                if (r1 == 0) goto La3
                return
            La3:
                r1 = r2
            La4:
                com.google.android.exoplayer2.drm.a r2 = com.google.android.exoplayer2.drm.a.this
                c6.a0 r2 = r2.f19922j
                long r3 = r0.f19938a
                r2.getClass()
                monitor-enter(r7)
                boolean r2 = r7.f19936a     // Catch: java.lang.Throwable -> Lc7
                if (r2 != 0) goto Lc5
                com.google.android.exoplayer2.drm.a r2 = com.google.android.exoplayer2.drm.a.this     // Catch: java.lang.Throwable -> Lc7
                com.google.android.exoplayer2.drm.a$e r2 = r2.f19926n     // Catch: java.lang.Throwable -> Lc7
                int r8 = r8.what     // Catch: java.lang.Throwable -> Lc7
                java.lang.Object r0 = r0.f19940c     // Catch: java.lang.Throwable -> Lc7
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch: java.lang.Throwable -> Lc7
                android.os.Message r8 = r2.obtainMessage(r8, r0)     // Catch: java.lang.Throwable -> Lc7
                r8.sendToTarget()     // Catch: java.lang.Throwable -> Lc7
            Lc5:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc7
                return
            Lc7:
                r8 = move-exception
                monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc7
                throw r8
            Lca:
                r8 = move-exception
                monitor-exit(r7)     // Catch: java.lang.Throwable -> Lca
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.a.c.handleMessage(android.os.Message):void");
        }
    }

    /* compiled from: DefaultDrmSession.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f19938a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f19939b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f19940c;

        /* renamed from: d, reason: collision with root package name */
        public int f19941d;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f19938a = j10;
            this.f19939b = z10;
            this.f19940c = obj;
        }
    }

    /* compiled from: DefaultDrmSession.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Set<e.a> set;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 == 1) {
                    a aVar = a.this;
                    if (obj == aVar.f19934w && aVar.j()) {
                        aVar.f19934w = null;
                        if (obj2 instanceof Exception) {
                            aVar.l((Exception) obj2, false);
                            return;
                        }
                        try {
                            byte[] bArr = (byte[]) obj2;
                            if (aVar.f19918e == 3) {
                                i iVar = aVar.f19915b;
                                byte[] bArr2 = aVar.f19933v;
                                int i11 = g0.f27302a;
                                iVar.h(bArr2, bArr);
                                aVar.h(new com.applovin.exoplayer2.d.w(11));
                                return;
                            }
                            byte[] h10 = aVar.f19915b.h(aVar.f19932u, bArr);
                            int i12 = aVar.f19918e;
                            if ((i12 == 2 || (i12 == 0 && aVar.f19933v != null)) && h10 != null && h10.length != 0) {
                                aVar.f19933v = h10;
                            }
                            aVar.o = 4;
                            d6.g<e.a> gVar = aVar.f19921i;
                            synchronized (gVar.f27298s) {
                                set = gVar.f27300u;
                            }
                            Iterator<e.a> it = set.iterator();
                            while (it.hasNext()) {
                                it.next().a();
                            }
                            return;
                        } catch (Exception e10) {
                            aVar.l(e10, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            a aVar2 = a.this;
            if (obj == aVar2.f19935x) {
                if (aVar2.o == 2 || aVar2.j()) {
                    aVar2.f19935x = null;
                    boolean z10 = obj2 instanceof Exception;
                    InterfaceC0229a interfaceC0229a = aVar2.f19916c;
                    if (z10) {
                        ((b.e) interfaceC0229a).a((Exception) obj2, false);
                        return;
                    }
                    try {
                        aVar2.f19915b.i((byte[]) obj2);
                        b.e eVar = (b.e) interfaceC0229a;
                        eVar.f19971b = null;
                        HashSet hashSet = eVar.f19970a;
                        j0 C = j0.C(hashSet);
                        hashSet.clear();
                        j0.b listIterator = C.listIterator(0);
                        while (listIterator.hasNext()) {
                            a aVar3 = (a) listIterator.next();
                            if (aVar3.m()) {
                                aVar3.i(true);
                            }
                        }
                    } catch (Exception e11) {
                        ((b.e) interfaceC0229a).a(e11, true);
                    }
                }
            }
        }
    }

    /* compiled from: DefaultDrmSession.java */
    /* loaded from: classes2.dex */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public a(UUID uuid, i iVar, b.e eVar, b.f fVar, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, l lVar, Looper looper, a0 a0Var, w wVar) {
        if (i10 == 1 || i10 == 3) {
            bArr.getClass();
        }
        this.f19925m = uuid;
        this.f19916c = eVar;
        this.f19917d = fVar;
        this.f19915b = iVar;
        this.f19918e = i10;
        this.f = z10;
        this.f19919g = z11;
        if (bArr != null) {
            this.f19933v = bArr;
            this.f19914a = null;
        } else {
            list.getClass();
            this.f19914a = Collections.unmodifiableList(list);
        }
        this.f19920h = hashMap;
        this.f19924l = lVar;
        this.f19921i = new d6.g<>();
        this.f19922j = a0Var;
        this.f19923k = wVar;
        this.o = 2;
        this.f19926n = new e(looper);
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final void a(e.a aVar) {
        int i10;
        boolean z10 = false;
        if (this.f19927p < 0) {
            p.c("DefaultDrmSession", "Session reference count less than zero: " + this.f19927p);
            this.f19927p = 0;
        }
        if (aVar != null) {
            d6.g<e.a> gVar = this.f19921i;
            synchronized (gVar.f27298s) {
                ArrayList arrayList = new ArrayList(gVar.f27301v);
                arrayList.add(aVar);
                gVar.f27301v = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) gVar.f27299t.get(aVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(gVar.f27300u);
                    hashSet.add(aVar);
                    gVar.f27300u = Collections.unmodifiableSet(hashSet);
                }
                HashMap hashMap = gVar.f27299t;
                if (num != null) {
                    i10 = num.intValue() + 1;
                } else {
                    i10 = 1;
                }
                hashMap.put(aVar, Integer.valueOf(i10));
            }
        }
        int i11 = this.f19927p + 1;
        this.f19927p = i11;
        if (i11 == 1) {
            if (this.o == 2) {
                z10 = true;
            }
            d6.a.d(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f19928q = handlerThread;
            handlerThread.start();
            this.f19929r = new c(this.f19928q.getLooper());
            if (m()) {
                i(true);
            }
        } else if (aVar != null && j() && this.f19921i.a(aVar) == 1) {
            aVar.d(this.o);
        }
        com.google.android.exoplayer2.drm.b bVar = com.google.android.exoplayer2.drm.b.this;
        if (bVar.f19952l != com.anythink.expressad.exoplayer.b.f7291b) {
            bVar.o.remove(this);
            Handler handler = bVar.f19960u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final void b(e.a aVar) {
        int i10 = this.f19927p;
        if (i10 <= 0) {
            p.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f19927p = i11;
        if (i11 == 0) {
            this.o = 0;
            e eVar = this.f19926n;
            int i12 = g0.f27302a;
            eVar.removeCallbacksAndMessages(null);
            c cVar = this.f19929r;
            synchronized (cVar) {
                cVar.removeCallbacksAndMessages(null);
                cVar.f19936a = true;
            }
            this.f19929r = null;
            this.f19928q.quit();
            this.f19928q = null;
            this.f19930s = null;
            this.f19931t = null;
            this.f19934w = null;
            this.f19935x = null;
            byte[] bArr = this.f19932u;
            if (bArr != null) {
                this.f19915b.g(bArr);
                this.f19932u = null;
            }
        }
        if (aVar != null) {
            d6.g<e.a> gVar = this.f19921i;
            synchronized (gVar.f27298s) {
                Integer num = (Integer) gVar.f27299t.get(aVar);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(gVar.f27301v);
                    arrayList.remove(aVar);
                    gVar.f27301v = Collections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        gVar.f27299t.remove(aVar);
                        HashSet hashSet = new HashSet(gVar.f27300u);
                        hashSet.remove(aVar);
                        gVar.f27300u = Collections.unmodifiableSet(hashSet);
                    } else {
                        gVar.f27299t.put(aVar, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
            if (this.f19921i.a(aVar) == 0) {
                aVar.f();
            }
        }
        b bVar = this.f19917d;
        int i13 = this.f19927p;
        com.google.android.exoplayer2.drm.b bVar2 = com.google.android.exoplayer2.drm.b.this;
        if (i13 == 1 && bVar2.f19955p > 0 && bVar2.f19952l != com.anythink.expressad.exoplayer.b.f7291b) {
            bVar2.o.add(this);
            Handler handler = bVar2.f19960u;
            handler.getClass();
            handler.postAtTime(new androidx.activity.k(this, 4), this, SystemClock.uptimeMillis() + bVar2.f19952l);
        } else if (i13 == 0) {
            bVar2.f19953m.remove(this);
            if (bVar2.f19957r == this) {
                bVar2.f19957r = null;
            }
            if (bVar2.f19958s == this) {
                bVar2.f19958s = null;
            }
            b.e eVar2 = bVar2.f19949i;
            HashSet hashSet2 = eVar2.f19970a;
            hashSet2.remove(this);
            if (eVar2.f19971b == this) {
                eVar2.f19971b = null;
                if (!hashSet2.isEmpty()) {
                    a aVar2 = (a) hashSet2.iterator().next();
                    eVar2.f19971b = aVar2;
                    i.d b10 = aVar2.f19915b.b();
                    aVar2.f19935x = b10;
                    c cVar2 = aVar2.f19929r;
                    int i14 = g0.f27302a;
                    b10.getClass();
                    cVar2.getClass();
                    cVar2.obtainMessage(0, new d(o.f29817b.getAndIncrement(), true, SystemClock.elapsedRealtime(), b10)).sendToTarget();
                }
            }
            if (bVar2.f19952l != com.anythink.expressad.exoplayer.b.f7291b) {
                Handler handler2 = bVar2.f19960u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                bVar2.o.remove(this);
            }
        }
        bVar2.k();
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final UUID d() {
        return this.f19925m;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final boolean e() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final boolean f(String str) {
        byte[] bArr = this.f19932u;
        d6.a.e(bArr);
        return this.f19915b.m(str, bArr);
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final n4.b g() {
        return this.f19930s;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final d.a getError() {
        if (this.o == 1) {
            return this.f19931t;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final int getState() {
        return this.o;
    }

    public final void h(com.applovin.exoplayer2.d.w wVar) {
        Set<e.a> set;
        d6.g<e.a> gVar = this.f19921i;
        synchronized (gVar.f27298s) {
            set = gVar.f27300u;
        }
        Iterator<e.a> it = set.iterator();
        while (it.hasNext()) {
            wVar.accept(it.next());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:50|51|52|(6:54|55|56|57|(1:59)|61)|64|55|56|57|(0)|61) */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096 A[Catch: NumberFormatException -> 0x009a, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x009a, blocks: (B:57:0x008e, B:59:0x0096), top: B:56:0x008e }] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sessionId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(boolean r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.a.i(boolean):void");
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean j() {
        int i10 = this.o;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void k(int i10, Exception exc) {
        int i11;
        Set<e.a> set;
        int i12 = g0.f27302a;
        if (i12 >= 21 && o4.e.a(exc)) {
            i11 = o4.e.b(exc);
        } else {
            if (i12 < 23 || !o4.f.a(exc)) {
                if (i12 < 18 || !o4.d.b(exc)) {
                    if (i12 >= 18 && o4.d.a(exc)) {
                        i11 = 6007;
                    } else if (exc instanceof o4.k) {
                        i11 = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
                    } else if (exc instanceof b.c) {
                        i11 = AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                    } else if (exc instanceof o4.i) {
                        i11 = 6008;
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = 6004;
                        } else if (i10 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i11 = 6002;
            }
            i11 = 6006;
        }
        this.f19931t = new d.a(exc, i11);
        p.d("DefaultDrmSession", "DRM session error", exc);
        d6.g<e.a> gVar = this.f19921i;
        synchronized (gVar.f27298s) {
            set = gVar.f27300u;
        }
        Iterator<e.a> it = set.iterator();
        while (it.hasNext()) {
            it.next().e(exc);
        }
        if (this.o != 4) {
            this.o = 1;
        }
    }

    public final void l(Exception exc, boolean z10) {
        int i10;
        if (exc instanceof NotProvisionedException) {
            b.e eVar = (b.e) this.f19916c;
            eVar.f19970a.add(this);
            if (eVar.f19971b == null) {
                eVar.f19971b = this;
                i.d b10 = this.f19915b.b();
                this.f19935x = b10;
                c cVar = this.f19929r;
                int i11 = g0.f27302a;
                b10.getClass();
                cVar.getClass();
                cVar.obtainMessage(0, new d(o.f29817b.getAndIncrement(), true, SystemClock.elapsedRealtime(), b10)).sendToTarget();
                return;
            }
            return;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        k(i10, exc);
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean m() {
        Set<e.a> set;
        if (j()) {
            return true;
        }
        try {
            byte[] d10 = this.f19915b.d();
            this.f19932u = d10;
            this.f19915b.f(d10, this.f19923k);
            this.f19930s = this.f19915b.c(this.f19932u);
            this.o = 3;
            d6.g<e.a> gVar = this.f19921i;
            synchronized (gVar.f27298s) {
                set = gVar.f27300u;
            }
            Iterator<e.a> it = set.iterator();
            while (it.hasNext()) {
                it.next().d(3);
            }
            this.f19932u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            b.e eVar = (b.e) this.f19916c;
            eVar.f19970a.add(this);
            if (eVar.f19971b == null) {
                eVar.f19971b = this;
                i.d b10 = this.f19915b.b();
                this.f19935x = b10;
                c cVar = this.f19929r;
                int i10 = g0.f27302a;
                b10.getClass();
                cVar.getClass();
                cVar.obtainMessage(0, new d(o.f29817b.getAndIncrement(), true, SystemClock.elapsedRealtime(), b10)).sendToTarget();
            }
            return false;
        } catch (Exception e10) {
            k(1, e10);
            return false;
        }
    }

    public final void n(byte[] bArr, int i10, boolean z10) {
        try {
            i.a k10 = this.f19915b.k(bArr, this.f19914a, i10, this.f19920h);
            this.f19934w = k10;
            c cVar = this.f19929r;
            int i11 = g0.f27302a;
            k10.getClass();
            cVar.getClass();
            cVar.obtainMessage(1, new d(o.f29817b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k10)).sendToTarget();
        } catch (Exception e10) {
            l(e10, true);
        }
    }

    public final Map<String, String> o() {
        byte[] bArr = this.f19932u;
        if (bArr == null) {
            return null;
        }
        return this.f19915b.a(bArr);
    }
}
