package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.c.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6511a = "t";

    /* renamed from: b, reason: collision with root package name */
    private static volatile t f6512b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, com.anythink.core.common.e.w> f6513c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.anythink.core.common.e.w> f6514d;
    private final int f = 5;

    /* renamed from: g, reason: collision with root package name */
    private final int f6516g = 500;

    /* renamed from: e, reason: collision with root package name */
    private List<String> f6515e = Collections.synchronizedList(new ArrayList(8));

    private t() {
    }

    public static boolean a(int i10) {
        boolean z10;
        switch (i10) {
            case com.anythink.core.common.g.g.f5908d /* -1003 */:
            case com.anythink.core.common.g.g.f5907c /* -1002 */:
            case -1001:
            case -1000:
                z10 = true;
                break;
            default:
                z10 = false;
                break;
        }
        if (z10 || ((i10 < -99 || i10 >= 200) && i10 < 400)) {
            return z10;
        }
        return true;
    }

    private synchronized void c() {
        try {
            if (this.f6513c == null && this.f6514d == null) {
                i.a c10 = com.anythink.core.common.c.i.a(com.anythink.core.common.c.c.a(com.anythink.core.common.b.n.a().g())).c();
                this.f6513c = c10.f5323b;
                this.f6514d = c10.f5322a;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.f6513c == null) {
            this.f6513c = new ConcurrentHashMap();
        }
        if (this.f6514d == null) {
            this.f6514d = Collections.synchronizedList(new ArrayList());
        }
    }

    public final synchronized void b() {
        try {
            c();
            List<com.anythink.core.common.e.w> synchronizedList = Collections.synchronizedList(new ArrayList(this.f6514d));
            if (synchronizedList != null && synchronizedList.size() > 0) {
                for (com.anythink.core.common.e.w wVar : synchronizedList) {
                    wVar.a();
                    a(wVar, true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static t a() {
        if (f6512b == null) {
            synchronized (t.class) {
                if (f6512b == null) {
                    f6512b = new t();
                }
            }
        }
        return f6512b;
    }

    public final synchronized void a(String str, String str2, long j10) {
        com.anythink.core.common.e.w wVar = new com.anythink.core.common.e.w();
        wVar.f5750b = 2;
        wVar.f5752d = str;
        wVar.f5751c = str2;
        wVar.f = j10;
        wVar.a();
        a(wVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(com.anythink.core.common.e.w wVar) {
        if (TextUtils.isEmpty(wVar.f5749a)) {
            wVar.f5753e = System.currentTimeMillis();
            String a10 = com.anythink.core.common.k.f.a(wVar.f5752d + wVar.f5753e);
            wVar.f5749a = a10;
            this.f6513c.put(a10, wVar);
            this.f6514d.add(wVar);
        }
        wVar.a();
        com.anythink.core.common.c.i.a(com.anythink.core.common.c.c.a(com.anythink.core.common.b.n.a().g())).a(wVar);
        if (this.f6514d.size() > 500) {
            com.anythink.core.common.e.w wVar2 = this.f6514d.get(0);
            wVar.a();
            this.f6515e.remove(wVar.f5749a);
            a(wVar2);
        }
    }

    private synchronized void a(final com.anythink.core.common.e.w wVar, final boolean z10) {
        if (System.currentTimeMillis() > wVar.f) {
            wVar.a();
            this.f6515e.remove(wVar.f5749a);
            if (z10) {
                a(wVar);
            }
            return;
        }
        if (this.f6515e.contains(wVar.f5749a)) {
            wVar.a();
            return;
        }
        this.f6515e.add(wVar.f5749a);
        if (z10) {
            int i10 = wVar.f5754g + 1;
            wVar.f5754g = i10;
            if (i10 >= 5) {
                wVar.a();
                a(wVar);
            } else {
                b(wVar);
            }
        } else {
            int i11 = wVar.f5754g + 1;
            wVar.f5754g = i11;
            if (i11 >= 5) {
                wVar.a();
                this.f6515e.remove(wVar.f5749a);
                return;
            }
        }
        wVar.a();
        new com.anythink.core.common.g.k(wVar).a(0, new com.anythink.core.common.g.i() { // from class: com.anythink.core.common.t.1
            @Override // com.anythink.core.common.g.i
            public final void onLoadCanceled(int i12) {
                synchronized (t.this) {
                    t.this.f6515e.remove(wVar.f5749a);
                }
            }

            @Override // com.anythink.core.common.g.i
            public final void onLoadError(int i12, String str, AdError adError) {
                wVar.a();
                synchronized (t.this) {
                    t.this.f6515e.remove(wVar.f5749a);
                    if (!z10) {
                        t.this.b(wVar);
                    }
                }
            }

            @Override // com.anythink.core.common.g.i
            public final void onLoadFinish(int i12, Object obj) {
                wVar.a();
                synchronized (t.this) {
                    t.this.f6515e.remove(wVar.f5749a);
                    if (z10) {
                        t.this.a(wVar);
                    }
                }
            }

            @Override // com.anythink.core.common.g.i
            public final void onLoadStart(int i12) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(com.anythink.core.common.e.w wVar) {
        wVar.a();
        this.f6513c.remove(wVar.f5749a);
        this.f6514d.remove(wVar);
        com.anythink.core.common.c.i.a(com.anythink.core.common.c.c.a(com.anythink.core.common.b.n.a().g())).b(wVar);
    }
}
