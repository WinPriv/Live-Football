package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.utils.h;
import com.iab.omid.library.applovin.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TreeWalker implements a.InterfaceC0308a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f24311i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f24312j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f24313k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f24314l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f24315m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f24317b;

    /* renamed from: h, reason: collision with root package name */
    private long f24322h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f24316a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f24318c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f24319d = new ArrayList();
    private com.iab.omid.library.applovin.walking.a f = new com.iab.omid.library.applovin.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f24320e = new com.iab.omid.library.applovin.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f24321g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

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
            TreeWalker.this.f24321g.b();
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
            if (TreeWalker.f24313k != null) {
                TreeWalker.f24313k.post(TreeWalker.f24314l);
                TreeWalker.f24313k.postDelayed(TreeWalker.f24315m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f24322h);
    }

    private void e() {
        this.f24317b = 0;
        this.f24319d.clear();
        this.f24318c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f24318c = true;
                break;
            }
        }
        this.f24322h = f.b();
    }

    public static TreeWalker getInstance() {
        return f24311i;
    }

    private void i() {
        if (f24313k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24313k = handler;
            handler.post(f24314l);
            f24313k.postDelayed(f24315m, 200L);
        }
    }

    private void k() {
        Handler handler = f24313k;
        if (handler != null) {
            handler.removeCallbacks(f24315m);
            f24313k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f24316a.contains(treeWalkerTimeLogger)) {
            this.f24316a.add(treeWalkerTimeLogger);
        }
    }

    public void f() {
        this.f.e();
        long b10 = f.b();
        com.iab.omid.library.applovin.processor.a a10 = this.f24320e.a();
        if (this.f.b().size() > 0) {
            Iterator<String> it = this.f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a11 = a10.a(null);
                a(next, this.f.a(next), a11);
                com.iab.omid.library.applovin.utils.c.b(a11);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f24321g.a(a11, hashSet, b10);
            }
        }
        if (this.f.c().size() > 0) {
            JSONObject a12 = a10.a(null);
            a(null, a10, a12, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(a12);
            this.f24321g.b(a12, this.f.c(), b10);
            if (this.f24318c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it2 = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.f24319d);
                }
            }
        } else {
            this.f24321g.b();
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
        this.f24316a.clear();
        f24312j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24316a.contains(treeWalkerTimeLogger)) {
            this.f24316a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f24316a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f24316a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f24317b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f24317b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String d10 = this.f.d(view);
        if (d10 == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, d10);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f.f(view)));
        this.f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0308a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.applovin.walking.c e10;
        if (h.d(view) && (e10 = this.f.e(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, a10);
            if (!b(view, a10)) {
                boolean z11 = z10 || a(view, a10);
                if (this.f24318c && e10 == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f24319d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                a(view, aVar, a10, e10, z11);
            }
            this.f24317b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.processor.a b10 = this.f24320e.b();
        String b11 = this.f.b(str);
        if (b11 != null) {
            JSONObject a10 = b10.a(view);
            com.iab.omid.library.applovin.utils.c.a(a10, str);
            com.iab.omid.library.applovin.utils.c.b(a10, b11);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, a10);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0309a c10 = this.f.c(view);
        if (c10 == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c10);
        return true;
    }
}
