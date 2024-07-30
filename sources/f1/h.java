package f1;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import j1.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: RoomDatabase.java */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public volatile j1.b f27951a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f27952b;

    /* renamed from: c, reason: collision with root package name */
    public j1.c f27953c;

    /* renamed from: d, reason: collision with root package name */
    public final g f27954d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27955e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public List<b> f27956g;

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f27957h = new ReentrantReadWriteLock();

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal<Integer> f27958i = new ThreadLocal<>();

    /* compiled from: RoomDatabase.java */
    /* loaded from: classes.dex */
    public static class a<T extends h> {

        /* renamed from: b, reason: collision with root package name */
        public final String f27960b;

        /* renamed from: c, reason: collision with root package name */
        public final Context f27961c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList<b> f27962d;

        /* renamed from: e, reason: collision with root package name */
        public Executor f27963e;
        public Executor f;

        /* renamed from: g, reason: collision with root package name */
        public c.InterfaceC0403c f27964g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f27965h;

        /* renamed from: j, reason: collision with root package name */
        public boolean f27967j;

        /* renamed from: l, reason: collision with root package name */
        public HashSet f27969l;

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f27959a = WorkDatabase.class;

        /* renamed from: i, reason: collision with root package name */
        public boolean f27966i = true;

        /* renamed from: k, reason: collision with root package name */
        public final c f27968k = new c();

        public a(Context context, String str) {
            this.f27961c = context;
            this.f27960b = str;
        }

        public final void a(g1.a... aVarArr) {
            if (this.f27969l == null) {
                this.f27969l = new HashSet();
            }
            for (g1.a aVar : aVarArr) {
                this.f27969l.add(Integer.valueOf(aVar.f28354a));
                this.f27969l.add(Integer.valueOf(aVar.f28355b));
            }
            c cVar = this.f27968k;
            cVar.getClass();
            for (g1.a aVar2 : aVarArr) {
                int i10 = aVar2.f28354a;
                HashMap<Integer, TreeMap<Integer, g1.a>> hashMap = cVar.f27970a;
                TreeMap<Integer, g1.a> treeMap = hashMap.get(Integer.valueOf(i10));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    hashMap.put(Integer.valueOf(i10), treeMap);
                }
                int i11 = aVar2.f28355b;
                g1.a aVar3 = treeMap.get(Integer.valueOf(i11));
                if (aVar3 != null) {
                    Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
                }
                treeMap.put(Integer.valueOf(i11), aVar2);
            }
        }
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap<Integer, TreeMap<Integer, g1.a>> f27970a = new HashMap<>();
    }

    public h() {
        new ConcurrentHashMap();
        this.f27954d = d();
    }

    public final void a() {
        boolean z10;
        if (this.f27955e) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
        } else {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((k1.a) this.f27953c.H()).f30288s.inTransaction() && this.f27958i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public final void c() {
        a();
        j1.b H = this.f27953c.H();
        this.f27954d.c(H);
        ((k1.a) H).b();
    }

    public abstract g d();

    public abstract j1.c e(f1.a aVar);

    @Deprecated
    public final void f() {
        ((k1.a) this.f27953c.H()).c();
        if (!((k1.a) this.f27953c.H()).f30288s.inTransaction()) {
            g gVar = this.f27954d;
            if (gVar.f27940e.compareAndSet(false, true)) {
                gVar.f27939d.f27952b.execute(gVar.f27944j);
            }
        }
    }

    public final Cursor g(j1.d dVar) {
        a();
        b();
        return ((k1.a) this.f27953c.H()).e(dVar);
    }

    @Deprecated
    public final void h() {
        ((k1.a) this.f27953c.H()).g();
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(k1.a aVar) {
        }
    }
}
