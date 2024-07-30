package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.ironsrc.processor.a;
import com.iab.omid.library.ironsrc.utils.f;
import com.iab.omid.library.ironsrc.utils.h;
import com.iab.omid.library.ironsrc.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TreeWalker implements a.InterfaceC0311a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f24429i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f24430j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f24431k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f24432l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f24433m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f24435b;

    /* renamed from: h, reason: collision with root package name */
    private long f24440h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f24434a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f24436c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.ironsrc.weakreference.a> f24437d = new ArrayList();
    private com.iab.omid.library.ironsrc.walking.a f = new com.iab.omid.library.ironsrc.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.processor.b f24438e = new com.iab.omid.library.ironsrc.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.walking.b f24439g = new com.iab.omid.library.ironsrc.walking.b(new com.iab.omid.library.ironsrc.walking.async.c());

    /* loaded from: classes2.dex */
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    /* loaded from: classes2.dex */
    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f24439g.b();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f24431k != null) {
                TreeWalker.f24431k.post(TreeWalker.f24432l);
                TreeWalker.f24431k.postDelayed(TreeWalker.f24433m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f24440h);
    }

    private void e() {
        this.f24435b = 0;
        this.f24437d.clear();
        this.f24436c = false;
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f24436c = true;
                break;
            }
        }
        this.f24440h = f.b();
    }

    public static TreeWalker getInstance() {
        return f24429i;
    }

    private void i() {
        if (f24431k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24431k = handler;
            handler.post(f24432l);
            f24431k.postDelayed(f24433m, 200L);
        }
    }

    private void k() {
        Handler handler = f24431k;
        if (handler != null) {
            handler.removeCallbacks(f24433m);
            f24431k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f24434a.contains(treeWalkerTimeLogger)) {
            this.f24434a.add(treeWalkerTimeLogger);
        }
    }

    public void f() {
        this.f.e();
        long b10 = f.b();
        com.iab.omid.library.ironsrc.processor.a a10 = this.f24438e.a();
        if (this.f.b().size() > 0) {
            Iterator<String> it = this.f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a11 = a10.a(null);
                a(next, this.f.a(next), a11);
                com.iab.omid.library.ironsrc.utils.c.b(a11);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f24439g.a(a11, hashSet, b10);
            }
        }
        if (this.f.c().size() > 0) {
            JSONObject a12 = a10.a(null);
            a(null, a10, a12, com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.ironsrc.utils.c.b(a12);
            this.f24439g.b(a12, this.f.c(), b10);
            if (this.f24436c) {
                Iterator<com.iab.omid.library.ironsrc.adsession.a> it2 = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.f24437d);
                }
            }
        } else {
            this.f24439g.b();
        }
        this.f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f24434a.clear();
        f24430j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24434a.contains(treeWalkerTimeLogger)) {
            this.f24434a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f24434a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f24434a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f24435b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f24435b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String d10 = this.f.d(view);
        if (d10 == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, d10);
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, Boolean.valueOf(this.f.f(view)));
        this.f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.ironsrc.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.ironsrc.processor.a.InterfaceC0311a
    public void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.ironsrc.walking.c e10;
        if (h.d(view) && (e10 = this.f.e(view)) != com.iab.omid.library.ironsrc.walking.c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, a10);
            if (!b(view, a10)) {
                boolean z11 = z10 || a(view, a10);
                if (this.f24436c && e10 == com.iab.omid.library.ironsrc.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f24437d.add(new com.iab.omid.library.ironsrc.weakreference.a(view));
                }
                a(view, aVar, a10, e10, z11);
            }
            this.f24435b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.ironsrc.processor.a b10 = this.f24438e.b();
        String b11 = this.f.b(str);
        if (b11 != null) {
            JSONObject a10 = b10.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(a10, str);
            com.iab.omid.library.ironsrc.utils.c.b(a10, b11);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, a10);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0312a c10 = this.f.c(view);
        if (c10 == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, c10);
        return true;
    }
}
