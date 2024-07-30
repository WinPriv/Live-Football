package com.iab.omid.library.vungle.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.vungle.c.a;
import com.iab.omid.library.vungle.d.d;
import com.iab.omid.library.vungle.d.f;
import com.iab.omid.library.vungle.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TreeWalker implements a.InterfaceC0314a {

    /* renamed from: a, reason: collision with root package name */
    private static TreeWalker f24540a = new TreeWalker();

    /* renamed from: b, reason: collision with root package name */
    private static Handler f24541b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private static Handler f24542c = null;

    /* renamed from: j, reason: collision with root package name */
    private static final Runnable f24543j = new Runnable() { // from class: com.iab.omid.library.vungle.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().h();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final Runnable f24544k = new Runnable() { // from class: com.iab.omid.library.vungle.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f24542c != null) {
                TreeWalker.f24542c.post(TreeWalker.f24543j);
                TreeWalker.f24542c.postDelayed(TreeWalker.f24544k, 200L);
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private int f24546e;

    /* renamed from: i, reason: collision with root package name */
    private long f24549i;

    /* renamed from: d, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f24545d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private a f24547g = new a();
    private com.iab.omid.library.vungle.c.b f = new com.iab.omid.library.vungle.c.b();

    /* renamed from: h, reason: collision with root package name */
    private b f24548h = new b(new com.iab.omid.library.vungle.walking.a.c());

    /* loaded from: classes2.dex */
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    /* loaded from: classes2.dex */
    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    public static TreeWalker getInstance() {
        return f24540a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f24546e = 0;
        this.f24549i = d.a();
    }

    private void j() {
        a(d.a() - this.f24549i);
    }

    private void k() {
        if (f24542c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24542c = handler;
            handler.post(f24543j);
            f24542c.postDelayed(f24544k, 200L);
        }
    }

    private void l() {
        Handler handler = f24542c;
        if (handler != null) {
            handler.removeCallbacks(f24544k);
            f24542c = null;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f24545d.contains(treeWalkerTimeLogger)) {
            this.f24545d.add(treeWalkerTimeLogger);
        }
    }

    public void b() {
        c();
        this.f24545d.clear();
        f24541b.post(new Runnable() { // from class: com.iab.omid.library.vungle.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f24548h.a();
            }
        });
    }

    public void c() {
        l();
    }

    public void d() {
        this.f24547g.c();
        long a10 = d.a();
        com.iab.omid.library.vungle.c.a a11 = this.f.a();
        if (this.f24547g.b().size() > 0) {
            Iterator<String> it = this.f24547g.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a12 = a11.a(null);
                a(next, this.f24547g.b(next), a12);
                com.iab.omid.library.vungle.d.b.a(a12);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f24548h.b(a12, hashSet, a10);
            }
        }
        if (this.f24547g.a().size() > 0) {
            JSONObject a13 = a11.a(null);
            a(null, a11, a13, c.PARENT_VIEW);
            com.iab.omid.library.vungle.d.b.a(a13);
            this.f24548h.a(a13, this.f24547g.a(), a10);
        } else {
            this.f24548h.a();
        }
        this.f24547g.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24545d.contains(treeWalkerTimeLogger)) {
            this.f24545d.remove(treeWalkerTimeLogger);
        }
    }

    private void b(View view, JSONObject jSONObject) {
        a.C0315a b10 = this.f24547g.b(view);
        if (b10 != null) {
            com.iab.omid.library.vungle.d.b.a(jSONObject, b10);
        }
    }

    public void a() {
        k();
    }

    private void a(long j10) {
        if (this.f24545d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f24545d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f24546e, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f24546e, j10);
                }
            }
        }
    }

    @Override // com.iab.omid.library.vungle.c.a.InterfaceC0314a
    public void a(View view, com.iab.omid.library.vungle.c.a aVar, JSONObject jSONObject) {
        c c10;
        if (f.d(view) && (c10 = this.f24547g.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.vungle.d.b.a(jSONObject, a10);
            if (!a(view, a10)) {
                b(view, a10);
                a(view, aVar, a10, c10);
            }
            this.f24546e++;
        }
    }

    private void a(View view, com.iab.omid.library.vungle.c.a aVar, JSONObject jSONObject, c cVar) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.vungle.c.a b10 = this.f.b();
        String a10 = this.f24547g.a(str);
        if (a10 != null) {
            JSONObject a11 = b10.a(view);
            com.iab.omid.library.vungle.d.b.a(a11, str);
            com.iab.omid.library.vungle.d.b.b(a11, a10);
            com.iab.omid.library.vungle.d.b.a(jSONObject, a11);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String a10 = this.f24547g.a(view);
        if (a10 == null) {
            return false;
        }
        com.iab.omid.library.vungle.d.b.a(jSONObject, a10);
        this.f24547g.e();
        return true;
    }
}
