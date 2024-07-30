package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c6.a0;
import c6.t;
import com.applovin.exoplayer2.b.e0;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.a;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.drm.i;
import d6.g0;
import d6.p;
import d6.r;
import j7.j0;
import j7.t0;
import j7.v1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import k4.i0;
import l4.w;

/* compiled from: DefaultDrmSessionManager.java */
/* loaded from: classes2.dex */
public final class b implements com.google.android.exoplayer2.drm.f {

    /* renamed from: b, reason: collision with root package name */
    public final UUID f19943b;

    /* renamed from: c, reason: collision with root package name */
    public final i.c f19944c;

    /* renamed from: d, reason: collision with root package name */
    public final l f19945d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, String> f19946e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f19947g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19948h;

    /* renamed from: i, reason: collision with root package name */
    public final e f19949i;

    /* renamed from: j, reason: collision with root package name */
    public final a0 f19950j;

    /* renamed from: k, reason: collision with root package name */
    public final f f19951k;

    /* renamed from: l, reason: collision with root package name */
    public final long f19952l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f19953m;

    /* renamed from: n, reason: collision with root package name */
    public final Set<d> f19954n;
    public final Set<com.google.android.exoplayer2.drm.a> o;

    /* renamed from: p, reason: collision with root package name */
    public int f19955p;

    /* renamed from: q, reason: collision with root package name */
    public i f19956q;

    /* renamed from: r, reason: collision with root package name */
    public com.google.android.exoplayer2.drm.a f19957r;

    /* renamed from: s, reason: collision with root package name */
    public com.google.android.exoplayer2.drm.a f19958s;

    /* renamed from: t, reason: collision with root package name */
    public Looper f19959t;

    /* renamed from: u, reason: collision with root package name */
    public Handler f19960u;

    /* renamed from: v, reason: collision with root package name */
    public int f19961v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f19962w;

    /* renamed from: x, reason: collision with root package name */
    public w f19963x;
    public volatile HandlerC0230b y;

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: classes2.dex */
    public class a implements i.b {
        public a() {
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class HandlerC0230b extends Handler {
        public HandlerC0230b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            Iterator it = b.this.f19953m.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.drm.a aVar = (com.google.android.exoplayer2.drm.a) it.next();
                if (Arrays.equals(aVar.f19932u, bArr)) {
                    if (message.what == 2 && aVar.f19918e == 0 && aVar.o == 4) {
                        int i10 = g0.f27302a;
                        aVar.i(false);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: classes2.dex */
    public static final class c extends Exception {
        public c(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: classes2.dex */
    public class d implements f.b {

        /* renamed from: s, reason: collision with root package name */
        public final e.a f19966s;

        /* renamed from: t, reason: collision with root package name */
        public com.google.android.exoplayer2.drm.d f19967t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f19968u;

        public d(e.a aVar) {
            this.f19966s = aVar;
        }

        @Override // com.google.android.exoplayer2.drm.f.b
        public final void release() {
            Handler handler = b.this.f19960u;
            handler.getClass();
            g0.N(handler, new androidx.activity.b(this, 7));
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: classes2.dex */
    public class e implements a.InterfaceC0229a {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f19970a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        public com.google.android.exoplayer2.drm.a f19971b;

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Exception exc, boolean z10) {
            int i10;
            this.f19971b = null;
            HashSet hashSet = this.f19970a;
            j0 C = j0.C(hashSet);
            hashSet.clear();
            j0.b listIterator = C.listIterator(0);
            while (listIterator.hasNext()) {
                com.google.android.exoplayer2.drm.a aVar = (com.google.android.exoplayer2.drm.a) listIterator.next();
                aVar.getClass();
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = 3;
                }
                aVar.k(i10, exc);
            }
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: classes2.dex */
    public class f implements a.b {
        public f() {
        }
    }

    public b(UUID uuid, i.c cVar, k kVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, t tVar, long j10) {
        uuid.getClass();
        d6.a.b(!k4.g.f30464b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f19943b = uuid;
        this.f19944c = cVar;
        this.f19945d = kVar;
        this.f19946e = hashMap;
        this.f = z10;
        this.f19947g = iArr;
        this.f19948h = z11;
        this.f19950j = tVar;
        this.f19949i = new e();
        this.f19951k = new f();
        this.f19961v = 0;
        this.f19953m = new ArrayList();
        this.f19954n = Collections.newSetFromMap(new IdentityHashMap());
        this.o = Collections.newSetFromMap(new IdentityHashMap());
        this.f19952l = j10;
    }

    public static boolean g(com.google.android.exoplayer2.drm.a aVar) {
        if (aVar.o == 1) {
            if (g0.f27302a < 19) {
                return true;
            }
            d.a error = aVar.getError();
            error.getClass();
            if (error.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList j(DrmInitData drmInitData, UUID uuid, boolean z10) {
        boolean z11;
        ArrayList arrayList = new ArrayList(drmInitData.f19908v);
        for (int i10 = 0; i10 < drmInitData.f19908v; i10++) {
            DrmInitData.SchemeData schemeData = drmInitData.f19905s[i10];
            if (!schemeData.a(uuid) && (!k4.g.f30465c.equals(uuid) || !schemeData.a(k4.g.f30464b))) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && (schemeData.f19913w != null || z10)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    public final com.google.android.exoplayer2.drm.d a(Looper looper, e.a aVar, i0 i0Var, boolean z10) {
        ArrayList arrayList;
        boolean z11;
        if (this.y == null) {
            this.y = new HandlerC0230b(looper);
        }
        DrmInitData drmInitData = i0Var.G;
        int i10 = 0;
        com.google.android.exoplayer2.drm.a aVar2 = null;
        if (drmInitData == null) {
            int i11 = r.i(i0Var.D);
            i iVar = this.f19956q;
            iVar.getClass();
            if (iVar.l() == 2 && o4.g.f33618d) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return null;
            }
            int[] iArr = this.f19947g;
            while (true) {
                if (i10 < iArr.length) {
                    if (iArr[i10] == i11) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1 || iVar.l() == 1) {
                return null;
            }
            com.google.android.exoplayer2.drm.a aVar3 = this.f19957r;
            if (aVar3 == null) {
                j0.b bVar = j0.f30006t;
                com.google.android.exoplayer2.drm.a i12 = i(v1.f30113w, true, null, z10);
                this.f19953m.add(i12);
                this.f19957r = i12;
            } else {
                aVar3.a(null);
            }
            return this.f19957r;
        }
        if (this.f19962w == null) {
            arrayList = j(drmInitData, this.f19943b, false);
            if (arrayList.isEmpty()) {
                c cVar = new c(this.f19943b);
                p.d("DefaultDrmSessionMgr", "DRM error", cVar);
                if (aVar != null) {
                    aVar.e(cVar);
                }
                return new h(new d.a(cVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            arrayList = null;
        }
        if (!this.f) {
            aVar2 = this.f19958s;
        } else {
            Iterator it = this.f19953m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.exoplayer2.drm.a aVar4 = (com.google.android.exoplayer2.drm.a) it.next();
                if (g0.a(aVar4.f19914a, arrayList)) {
                    aVar2 = aVar4;
                    break;
                }
            }
        }
        if (aVar2 == null) {
            aVar2 = i(arrayList, false, aVar, z10);
            if (!this.f) {
                this.f19958s = aVar2;
            }
            this.f19953m.add(aVar2);
        } else {
            aVar2.a(aVar);
        }
        return aVar2;
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final void b() {
        int i10 = this.f19955p;
        this.f19955p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f19956q == null) {
            i acquireExoMediaDrm = this.f19944c.acquireExoMediaDrm(this.f19943b);
            this.f19956q = acquireExoMediaDrm;
            acquireExoMediaDrm.j(new a());
        } else if (this.f19952l != com.anythink.expressad.exoplayer.b.f7291b) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f19953m;
                if (i11 < arrayList.size()) {
                    ((com.google.android.exoplayer2.drm.a) arrayList.get(i11)).a(null);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final f.b c(e.a aVar, i0 i0Var) {
        boolean z10;
        if (this.f19955p > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        d6.a.e(this.f19959t);
        d dVar = new d(aVar);
        Handler handler = this.f19960u;
        handler.getClass();
        handler.post(new e0(6, dVar, i0Var));
        return dVar;
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final void d(Looper looper, w wVar) {
        boolean z10;
        synchronized (this) {
            Looper looper2 = this.f19959t;
            if (looper2 == null) {
                this.f19959t = looper;
                this.f19960u = new Handler(looper);
            } else {
                if (looper2 == looper) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d6.a.d(z10);
                this.f19960u.getClass();
            }
        }
        this.f19963x = wVar;
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final com.google.android.exoplayer2.drm.d e(e.a aVar, i0 i0Var) {
        boolean z10;
        if (this.f19955p > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        d6.a.e(this.f19959t);
        return a(this.f19959t, aVar, i0Var, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.drm.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(k4.i0 r7) {
        /*
            r6 = this;
            com.google.android.exoplayer2.drm.i r0 = r6.f19956q
            r0.getClass()
            int r0 = r0.l()
            com.google.android.exoplayer2.drm.DrmInitData r1 = r7.G
            r2 = 0
            if (r1 != 0) goto L29
            java.lang.String r7 = r7.D
            int r7 = d6.r.i(r7)
            r1 = r2
        L15:
            int[] r3 = r6.f19947g
            int r4 = r3.length
            r5 = -1
            if (r1 >= r4) goto L23
            r3 = r3[r1]
            if (r3 != r7) goto L20
            goto L24
        L20:
            int r1 = r1 + 1
            goto L15
        L23:
            r1 = r5
        L24:
            if (r1 == r5) goto L27
            goto L28
        L27:
            r0 = r2
        L28:
            return r0
        L29:
            byte[] r7 = r6.f19962w
            r3 = 1
            if (r7 == 0) goto L2f
            goto L8b
        L2f:
            java.util.UUID r7 = r6.f19943b
            java.util.ArrayList r4 = j(r1, r7, r3)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L5e
            int r4 = r1.f19908v
            if (r4 != r3) goto L8c
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r4 = r1.f19905s
            r4 = r4[r2]
            java.util.UUID r5 = k4.g.f30464b
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L8c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            java.lang.String r4 = "DefaultDrmSessionMgr"
            d6.p.f(r4, r7)
        L5e:
            java.lang.String r7 = r1.f19907u
            if (r7 == 0) goto L8b
            java.lang.String r1 = "cenc"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L6b
            goto L8b
        L6b:
            java.lang.String r1 = "cbcs"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L7a
            int r7 = d6.g0.f27302a
            r1 = 25
            if (r7 < r1) goto L8c
            goto L8b
        L7a:
            java.lang.String r1 = "cbc1"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L8c
            java.lang.String r1 = "cens"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L8b
            goto L8c
        L8b:
            r2 = r3
        L8c:
            if (r2 == 0) goto L8f
            goto L90
        L8f:
            r0 = r3
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.b.f(k4.i0):int");
    }

    public final com.google.android.exoplayer2.drm.a h(List<DrmInitData.SchemeData> list, boolean z10, e.a aVar) {
        this.f19956q.getClass();
        boolean z11 = this.f19948h | z10;
        UUID uuid = this.f19943b;
        i iVar = this.f19956q;
        e eVar = this.f19949i;
        f fVar = this.f19951k;
        int i10 = this.f19961v;
        byte[] bArr = this.f19962w;
        HashMap<String, String> hashMap = this.f19946e;
        l lVar = this.f19945d;
        Looper looper = this.f19959t;
        looper.getClass();
        a0 a0Var = this.f19950j;
        w wVar = this.f19963x;
        wVar.getClass();
        com.google.android.exoplayer2.drm.a aVar2 = new com.google.android.exoplayer2.drm.a(uuid, iVar, eVar, fVar, list, i10, z11, z10, bArr, hashMap, lVar, looper, a0Var, wVar);
        aVar2.a(aVar);
        if (this.f19952l != com.anythink.expressad.exoplayer.b.f7291b) {
            aVar2.a(null);
        }
        return aVar2;
    }

    public final com.google.android.exoplayer2.drm.a i(List<DrmInitData.SchemeData> list, boolean z10, e.a aVar, boolean z11) {
        com.google.android.exoplayer2.drm.a h10 = h(list, z10, aVar);
        boolean g6 = g(h10);
        long j10 = this.f19952l;
        Set<com.google.android.exoplayer2.drm.a> set = this.o;
        if (g6 && !set.isEmpty()) {
            Iterator it = t0.D(set).iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.drm.d) it.next()).b(null);
            }
            h10.b(aVar);
            if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                h10.b(null);
            }
            h10 = h(list, z10, aVar);
        }
        if (g(h10) && z11) {
            Set<d> set2 = this.f19954n;
            if (!set2.isEmpty()) {
                Iterator it2 = t0.D(set2).iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    Iterator it3 = t0.D(set).iterator();
                    while (it3.hasNext()) {
                        ((com.google.android.exoplayer2.drm.d) it3.next()).b(null);
                    }
                }
                h10.b(aVar);
                if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                    h10.b(null);
                }
                return h(list, z10, aVar);
            }
            return h10;
        }
        return h10;
    }

    public final void k() {
        if (this.f19956q != null && this.f19955p == 0 && this.f19953m.isEmpty() && this.f19954n.isEmpty()) {
            i iVar = this.f19956q;
            iVar.getClass();
            iVar.release();
            this.f19956q = null;
        }
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final void release() {
        int i10 = this.f19955p - 1;
        this.f19955p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f19952l != com.anythink.expressad.exoplayer.b.f7291b) {
            ArrayList arrayList = new ArrayList(this.f19953m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((com.google.android.exoplayer2.drm.a) arrayList.get(i11)).b(null);
            }
        }
        Iterator it = t0.D(this.f19954n).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        k();
    }
}
