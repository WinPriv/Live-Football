package com.anythink.expressad.exoplayer.d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.expressad.exoplayer.d.b;
import com.anythink.expressad.exoplayer.d.c;
import com.anythink.expressad.exoplayer.d.e;
import com.anythink.expressad.exoplayer.d.f;
import com.anythink.expressad.exoplayer.d.i;
import com.anythink.expressad.exoplayer.d.j;
import com.anythink.expressad.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@TargetApi(18)
/* loaded from: classes.dex */
public final class d<T extends i> implements b.c<T>, g<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7668a = "PRCustomData";

    /* renamed from: b, reason: collision with root package name */
    public static final int f7669b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7670c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7671d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7672e = 3;
    public static final int f = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final String f7673h = "DefaultDrmSessionMgr";

    /* renamed from: g, reason: collision with root package name */
    volatile d<T>.c f7674g;

    /* renamed from: i, reason: collision with root package name */
    private final UUID f7675i;

    /* renamed from: j, reason: collision with root package name */
    private final j<T> f7676j;

    /* renamed from: k, reason: collision with root package name */
    private final n f7677k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap<String, String> f7678l;

    /* renamed from: m, reason: collision with root package name */
    private final c.a f7679m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f7680n;
    private final int o;

    /* renamed from: p, reason: collision with root package name */
    private final List<com.anythink.expressad.exoplayer.d.b<T>> f7681p;

    /* renamed from: q, reason: collision with root package name */
    private final List<com.anythink.expressad.exoplayer.d.b<T>> f7682q;

    /* renamed from: r, reason: collision with root package name */
    private Looper f7683r;

    /* renamed from: s, reason: collision with root package name */
    private int f7684s;

    /* renamed from: t, reason: collision with root package name */
    private byte[] f7685t;

    @Deprecated
    /* loaded from: classes.dex */
    public interface a extends com.anythink.expressad.exoplayer.d.c {
    }

    /* loaded from: classes.dex */
    public class b implements j.f<T> {
        private b() {
        }

        @Override // com.anythink.expressad.exoplayer.d.j.f
        public final void a(byte[] bArr, int i10) {
            if (d.this.f7684s == 0) {
                d.this.f7674g.obtainMessage(i10, bArr).sendToTarget();
            }
        }

        public /* synthetic */ b(d dVar, byte b10) {
            this();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            for (com.anythink.expressad.exoplayer.d.b bVar : d.this.f7681p) {
                if (bVar.b(bArr)) {
                    bVar.a(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: com.anythink.expressad.exoplayer.d.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0100d extends Exception {
        public /* synthetic */ C0100d(UUID uuid, byte b10) {
            this(uuid);
        }

        private C0100d(UUID uuid) {
            super("Media does not support uuid: ".concat(String.valueOf(uuid)));
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    @Deprecated
    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap, Handler handler, com.anythink.expressad.exoplayer.d.c cVar) {
        this(uuid, jVar, nVar, hashMap);
        if (handler == null || cVar == null) {
            return;
        }
        a(handler, cVar);
    }

    private static d<k> a(n nVar, HashMap<String, String> hashMap) {
        return a(com.anythink.expressad.exoplayer.b.bk, nVar, hashMap);
    }

    private byte[] b(String str) {
        return this.f7676j.b(str);
    }

    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap) {
        this(uuid, (j) jVar, nVar, hashMap, false, 3);
    }

    private static d<k> a(n nVar, String str) {
        return a(com.anythink.expressad.exoplayer.b.bl, nVar, (HashMap<String, String>) (!TextUtils.isEmpty(str) ? a3.l.t(f7668a, str) : null));
    }

    @Deprecated
    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap, Handler handler, com.anythink.expressad.exoplayer.d.c cVar, boolean z10) {
        this(uuid, jVar, nVar, hashMap, z10);
        if (handler == null || cVar == null) {
            return;
        }
        a(handler, cVar);
    }

    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap, boolean z10) {
        this(uuid, jVar, nVar, hashMap, z10, 3);
    }

    @Deprecated
    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap, Handler handler, com.anythink.expressad.exoplayer.d.c cVar, boolean z10, int i10) {
        this(uuid, jVar, nVar, hashMap, z10, i10);
        if (handler == null || cVar == null) {
            return;
        }
        a(handler, cVar);
    }

    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap, boolean z10, int i10) {
        com.anythink.expressad.exoplayer.k.a.a(uuid);
        com.anythink.expressad.exoplayer.k.a.a(jVar);
        com.anythink.expressad.exoplayer.k.a.a(!com.anythink.expressad.exoplayer.b.bi.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f7675i = uuid;
        this.f7676j = jVar;
        this.f7677k = nVar;
        this.f7678l = hashMap;
        this.f7679m = new c.a();
        this.f7680n = z10;
        this.o = i10;
        byte b10 = 0;
        this.f7684s = 0;
        this.f7681p = new ArrayList();
        this.f7682q = new ArrayList();
        if (z10) {
            jVar.a("sessionSharing", "enable");
        }
        jVar.a(new b(this, b10));
    }

    @Deprecated
    private static d<k> a(UUID uuid, n nVar, HashMap<String, String> hashMap, Handler handler, com.anythink.expressad.exoplayer.d.c cVar) {
        d<k> a10 = a(uuid, nVar, hashMap);
        if (handler != null && cVar != null) {
            a10.a(handler, cVar);
        }
        return a10;
    }

    private static d<k> a(UUID uuid, n nVar, HashMap<String, String> hashMap) {
        return new d<>(uuid, (j) l.a(uuid), nVar, hashMap, false, 3);
    }

    public final void a(Handler handler, com.anythink.expressad.exoplayer.d.c cVar) {
        this.f7679m.a(handler, cVar);
    }

    private void a(com.anythink.expressad.exoplayer.d.c cVar) {
        this.f7679m.a(cVar);
    }

    private String a(String str) {
        return this.f7676j.a(str);
    }

    private void a(String str, String str2) {
        this.f7676j.a(str, str2);
    }

    private void a(String str, byte[] bArr) {
        this.f7676j.a(str, bArr);
    }

    private void a(int i10, byte[] bArr) {
        com.anythink.expressad.exoplayer.k.a.b(this.f7681p.isEmpty());
        if (i10 == 1 || i10 == 3) {
            com.anythink.expressad.exoplayer.k.a.a(bArr);
        }
        this.f7684s = i10;
        this.f7685t = bArr;
    }

    @Override // com.anythink.expressad.exoplayer.d.g
    public final boolean a(com.anythink.expressad.exoplayer.d.e eVar) {
        if (this.f7685t != null) {
            return true;
        }
        if (a(eVar, this.f7675i, true) == null) {
            if (eVar.f7689b != 1 || !eVar.a(0).a(com.anythink.expressad.exoplayer.b.bi)) {
                return false;
            }
            Log.w(f7673h, "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f7675i);
        }
        String str = eVar.f7688a;
        if (str == null || com.anythink.expressad.exoplayer.b.f7295bd.equals(str)) {
            return true;
        }
        return !(com.anythink.expressad.exoplayer.b.be.equals(str) || com.anythink.expressad.exoplayer.b.bg.equals(str) || com.anythink.expressad.exoplayer.b.bf.equals(str)) || af.f8993a >= 25;
    }

    @Override // com.anythink.expressad.exoplayer.d.g
    public final f<T> a(Looper looper, com.anythink.expressad.exoplayer.d.e eVar) {
        e.a aVar;
        Looper looper2 = this.f7683r;
        byte b10 = 0;
        com.anythink.expressad.exoplayer.k.a.b(looper2 == null || looper2 == looper);
        if (this.f7681p.isEmpty()) {
            this.f7683r = looper;
            if (this.f7674g == null) {
                this.f7674g = new c(looper);
            }
        }
        com.anythink.expressad.exoplayer.d.b<T> bVar = null;
        if (this.f7685t == null) {
            e.a a10 = a(eVar, this.f7675i, false);
            if (a10 == null) {
                C0100d c0100d = new C0100d(this.f7675i, b10);
                this.f7679m.a(c0100d);
                return new h(new f.a(c0100d));
            }
            aVar = a10;
        } else {
            aVar = null;
        }
        if (!this.f7680n) {
            if (!this.f7681p.isEmpty()) {
                bVar = this.f7681p.get(0);
            }
        } else {
            byte[] bArr = aVar != null ? aVar.f7694c : null;
            Iterator<com.anythink.expressad.exoplayer.d.b<T>> it = this.f7681p.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.anythink.expressad.exoplayer.d.b<T> next = it.next();
                if (next.a(bArr)) {
                    bVar = next;
                    break;
                }
            }
        }
        if (bVar == null) {
            com.anythink.expressad.exoplayer.d.b<T> bVar2 = new com.anythink.expressad.exoplayer.d.b<>(this.f7675i, this.f7676j, this, aVar, this.f7684s, this.f7685t, this.f7678l, this.f7677k, looper, this.f7679m, this.o);
            this.f7681p.add(bVar2);
            bVar = bVar2;
        }
        bVar.a();
        return bVar;
    }

    @Override // com.anythink.expressad.exoplayer.d.g
    public final void a(f<T> fVar) {
        if (fVar instanceof h) {
            return;
        }
        com.anythink.expressad.exoplayer.d.b<T> bVar = (com.anythink.expressad.exoplayer.d.b) fVar;
        if (bVar.b()) {
            this.f7681p.remove(bVar);
            if (this.f7682q.size() > 1 && this.f7682q.get(0) == bVar) {
                this.f7682q.get(1).c();
            }
            this.f7682q.remove(bVar);
        }
    }

    @Override // com.anythink.expressad.exoplayer.d.b.c
    public final void a(com.anythink.expressad.exoplayer.d.b<T> bVar) {
        this.f7682q.add(bVar);
        if (this.f7682q.size() == 1) {
            bVar.c();
        }
    }

    @Override // com.anythink.expressad.exoplayer.d.b.c
    public final void a() {
        Iterator<com.anythink.expressad.exoplayer.d.b<T>> it = this.f7682q.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        this.f7682q.clear();
    }

    @Override // com.anythink.expressad.exoplayer.d.b.c
    public final void a(Exception exc) {
        Iterator<com.anythink.expressad.exoplayer.d.b<T>> it = this.f7682q.iterator();
        while (it.hasNext()) {
            it.next().a(exc);
        }
        this.f7682q.clear();
    }

    private static e.a a(com.anythink.expressad.exoplayer.d.e eVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(eVar.f7689b);
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= eVar.f7689b) {
                break;
            }
            e.a a10 = eVar.a(i10);
            if (!a10.a(uuid) && (!com.anythink.expressad.exoplayer.b.bj.equals(uuid) || !a10.a(com.anythink.expressad.exoplayer.b.bi))) {
                z11 = false;
            }
            if (z11 && (a10.f7694c != null || z10)) {
                arrayList.add(a10);
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (com.anythink.expressad.exoplayer.b.bk.equals(uuid)) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                e.a aVar = (e.a) arrayList.get(i11);
                int b10 = aVar.a() ? com.anythink.expressad.exoplayer.e.a.h.b(aVar.f7694c) : -1;
                int i12 = af.f8993a;
                if (i12 < 23 && b10 == 0) {
                    return aVar;
                }
                if (i12 >= 23 && b10 == 1) {
                    return aVar;
                }
            }
        }
        return (e.a) arrayList.get(0);
    }

    @Deprecated
    private static d<k> a(n nVar, HashMap<String, String> hashMap, Handler handler, com.anythink.expressad.exoplayer.d.c cVar) {
        d<k> a10 = a(com.anythink.expressad.exoplayer.b.bk, nVar, hashMap);
        if (handler != null && cVar != null) {
            a10.a(handler, cVar);
        }
        return a10;
    }

    @Deprecated
    private static d<k> a(n nVar, String str, Handler handler, com.anythink.expressad.exoplayer.d.c cVar) {
        d<k> a10 = a(com.anythink.expressad.exoplayer.b.bl, nVar, (HashMap<String, String>) (!TextUtils.isEmpty(str) ? a3.l.t(f7668a, str) : null));
        if (handler != null && cVar != null) {
            a10.a(handler, cVar);
        }
        return a10;
    }
}
