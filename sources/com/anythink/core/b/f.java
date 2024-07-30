package com.anythink.core.b;

import android.text.TextUtils;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.m;
import com.anythink.core.common.k.p;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    private static f f4641h;

    /* renamed from: d, reason: collision with root package name */
    ConcurrentHashMap<String, List<ai>> f4645d;

    /* renamed from: e, reason: collision with root package name */
    ConcurrentHashMap<String, Integer> f4646e;

    /* renamed from: i, reason: collision with root package name */
    private MediationBidManager f4648i;

    /* renamed from: g, reason: collision with root package name */
    private final String f4647g = "f";

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, m> f4642a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, j> f4643b = new ConcurrentHashMap<>(5);

    /* renamed from: c, reason: collision with root package name */
    ConcurrentHashMap<String, ai> f4644c = new ConcurrentHashMap<>(5);
    List<Integer> f = new CopyOnWriteArrayList();

    private f() {
    }

    public static f a() {
        if (f4641h == null) {
            f4641h = new f();
        }
        return f4641h;
    }

    public static void b(String str) {
        p.a(n.a().g(), com.anythink.core.common.b.g.f5013u, str);
    }

    private j c(ai aiVar) {
        if (aiVar != null) {
            return b(aiVar.N().f5695g, aiVar.N().f5699k);
        }
        return null;
    }

    private void d(ai aiVar) {
        m N;
        if (aiVar == null || (N = aiVar.N()) == null) {
            return;
        }
        c(N.f5695g, N.f5699k);
    }

    private boolean e(String str) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.f4646e;
        if (concurrentHashMap != null) {
            if (concurrentHashMap.get(str + "_c2sfirstStatus") != null) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final MediationBidManager b() {
        return this.f4648i;
    }

    public final void c(String str, String str2) {
        this.f4643b.remove(str + "_" + str2);
    }

    private void d(String str) {
        if (this.f4646e == null) {
            this.f4646e = new ConcurrentHashMap<>();
        }
        this.f4646e.put(com.ironsource.adapters.facebook.a.h(str, "_c2sfirstStatus"), 1);
    }

    public final double b(ai aiVar) {
        m N;
        if (aiVar == null || (N = aiVar.N()) == null) {
            return 0.0d;
        }
        return a(N.f5695g, aiVar.t());
    }

    public final ai c(String str) {
        return this.f4644c.get(str);
    }

    private void a(ai aiVar, m mVar) {
        this.f4642a.put(aiVar.t(), mVar);
        if (aiVar.l() == 3 || aiVar.l() == 7) {
            a(aiVar.t(), mVar);
        }
    }

    public final j b(String str, String str2) {
        return this.f4643b.get(str + "_" + str2);
    }

    public final boolean b(int i10) {
        boolean z10;
        synchronized (this.f) {
            z10 = !this.f.contains(Integer.valueOf(i10));
        }
        return z10;
    }

    public final void a(String str) {
        this.f4642a.remove(str);
    }

    public static void a(String str, m mVar) {
        p.a(n.a().g(), com.anythink.core.common.b.g.f5013u, str, mVar.c());
    }

    public final m a(ai aiVar) {
        m mVar = this.f4642a.get(aiVar.t());
        if (mVar == null && (aiVar.l() == 3 || aiVar.l() == 7)) {
            String b10 = p.b(n.a().g(), com.anythink.core.common.b.g.f5013u, aiVar.t(), "");
            if (!TextUtils.isEmpty(b10)) {
                mVar = m.a(b10);
            }
            if (mVar != null) {
                this.f4642a.put(aiVar.t(), mVar);
            }
        }
        return mVar;
    }

    public final void a(MediationBidManager mediationBidManager) {
        this.f4648i = mediationBidManager;
    }

    public final double a(String str, String str2) {
        j jVar = this.f4643b.get(str + "_" + str2);
        if (jVar != null) {
            return jVar.f4668c;
        }
        return 0.0d;
    }

    public final void a(String str, String str2, j jVar) {
        this.f4643b.put(str + "_" + str2, jVar);
    }

    public final void a(String str, ai aiVar) {
        this.f4644c.put(str, aiVar);
    }

    public final void a(int i10) {
        synchronized (this.f) {
            if (!this.f.contains(Integer.valueOf(i10))) {
                this.f.add(Integer.valueOf(i10));
            }
        }
    }
}
