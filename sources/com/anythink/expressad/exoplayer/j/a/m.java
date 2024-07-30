package com.anythink.expressad.exoplayer.j.a;

import android.os.ConditionVariable;
import android.util.Log;
import com.anythink.expressad.exoplayer.j.a.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class m implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8777a = "SimpleCache";

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet<File> f8778b = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f8779c;

    /* renamed from: d, reason: collision with root package name */
    private final File f8780d;

    /* renamed from: e, reason: collision with root package name */
    private final d f8781e;
    private final h f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, ArrayList<a.b>> f8782g;

    /* renamed from: h, reason: collision with root package name */
    private long f8783h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8784i;

    private m(File file, d dVar) {
        this(file, dVar, null, false);
    }

    @Deprecated
    private static synchronized void d() {
        synchronized (m.class) {
            f8779c = true;
            f8778b.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.expressad.exoplayer.j.a.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized n a(String str, long j10) {
        n b10;
        while (true) {
            b10 = b(str, j10);
            if (b10 == null) {
                wait();
            }
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.expressad.exoplayer.j.a.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized n b(String str, long j10) {
        n a10;
        n nVar;
        com.anythink.expressad.exoplayer.k.a.b(!this.f8784i);
        g b10 = this.f.b(str);
        if (b10 == null) {
            nVar = n.b(str, j10);
        } else {
            while (true) {
                a10 = b10.a(j10);
                if (!a10.f8745d || a10.f8746e.exists()) {
                    break;
                }
                f();
            }
            nVar = a10;
        }
        if (nVar.f8745d) {
            n b11 = this.f.b(str).b(nVar);
            ArrayList<a.b> arrayList = this.f8782g.get(nVar.f8742a);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size);
                }
            }
            return b11;
        }
        g a11 = this.f.a(str);
        if (a11.b()) {
            return null;
        }
        a11.a(true);
        return nVar;
    }

    private n g(String str, long j10) {
        n a10;
        g b10 = this.f.b(str);
        if (b10 == null) {
            return n.b(str, j10);
        }
        while (true) {
            a10 = b10.a(j10);
            if (!a10.f8745d || a10.f8746e.exists()) {
                break;
            }
            f();
        }
        return a10;
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized long c() {
        com.anythink.expressad.exoplayer.k.a.b(!this.f8784i);
        return this.f8783h;
    }

    private m(File file, d dVar, byte[] bArr) {
        this(file, dVar, bArr, bArr != null);
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized void a() {
        if (this.f8784i) {
            return;
        }
        this.f8782g.clear();
        try {
            f();
        } finally {
            d(this.f8780d);
            this.f8784i = true;
        }
    }

    private m(File file, d dVar, byte[] bArr, boolean z10) {
        this(file, dVar, new h(file, bArr, z10));
    }

    private static synchronized boolean b(File file) {
        boolean contains;
        synchronized (m.class) {
            contains = f8778b.contains(file.getAbsoluteFile());
        }
        return contains;
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized File c(String str, long j10) {
        g b10;
        com.anythink.expressad.exoplayer.k.a.b(!this.f8784i);
        b10 = this.f.b(str);
        com.anythink.expressad.exoplayer.k.a.a(b10);
        com.anythink.expressad.exoplayer.k.a.b(b10.b());
        if (!this.f8780d.exists()) {
            this.f8780d.mkdirs();
            f();
        }
        return n.a(this.f8780d, b10.f8753a, j10, System.currentTimeMillis());
    }

    private m(File file, d dVar, h hVar) {
        if (c(file)) {
            this.f8780d = file;
            this.f8781e = dVar;
            this.f = hVar;
            this.f8782g = new HashMap<>();
            final ConditionVariable conditionVariable = new ConditionVariable();
            new Thread("SimpleCache.initialize()") { // from class: com.anythink.expressad.exoplayer.j.a.m.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    synchronized (m.this) {
                        conditionVariable.open();
                        m.a(m.this);
                        d unused = m.this.f8781e;
                    }
                }
            }.start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: ".concat(String.valueOf(file)));
    }

    private void e() {
        if (!this.f8780d.exists()) {
            this.f8780d.mkdirs();
            return;
        }
        this.f.a();
        File[] listFiles = this.f8780d.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(h.f8757a)) {
                n a10 = file.length() > 0 ? n.a(file, this.f) : null;
                if (a10 != null) {
                    a(a10);
                } else {
                    file.delete();
                }
            }
        }
        this.f.d();
        try {
            this.f.b();
        } catch (a.C0114a e10) {
            Log.e(f8777a, "Storing index file failed", e10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized void b(String str, a.b bVar) {
        if (this.f8784i) {
            return;
        }
        ArrayList<a.b> arrayList = this.f8782g.get(str);
        if (arrayList != null) {
            arrayList.remove(bVar);
            if (arrayList.isEmpty()) {
                this.f8782g.remove(str);
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized void d(String str, long j10) {
        k kVar = new k();
        j.a(kVar, j10);
        a(str, kVar);
    }

    private static synchronized void d(File file) {
        synchronized (m.class) {
            if (!f8779c) {
                f8778b.remove(file.getAbsoluteFile());
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized Set<String> b() {
        com.anythink.expressad.exoplayer.k.a.b(!this.f8784i);
        return new HashSet(this.f.e());
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized NavigableSet<e> a(String str, a.b bVar) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f8784i);
        ArrayList<a.b> arrayList = this.f8782g.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f8782g.put(str, arrayList);
        }
        arrayList.add(bVar);
        return a(str);
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized void b(e eVar) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f8784i);
        a(eVar, true);
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized i c(String str) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f8784i);
        return this.f.e(str);
    }

    private void c(e eVar) {
        ArrayList<a.b> arrayList = this.f8782g.get(eVar.f8742a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size);
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized long b(String str, long j10, long j11) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f8784i);
        g b10 = this.f.b(str);
        if (b10 != null) {
            return b10.a(j10, j11);
        }
        return -j11;
    }

    private void c(n nVar) {
        ArrayList<a.b> arrayList = this.f8782g.get(nVar.f8742a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size);
            }
        }
    }

    private void f() {
        ArrayList arrayList = new ArrayList();
        Iterator<g> it = this.f.c().iterator();
        while (it.hasNext()) {
            Iterator<n> it2 = it.next().c().iterator();
            while (it2.hasNext()) {
                n next = it2.next();
                if (!next.f8746e.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            a((e) arrayList.get(i10), false);
        }
        this.f.d();
        this.f.b();
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized NavigableSet<e> a(String str) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f8784i);
        g b10 = this.f.b(str);
        if (b10 != null && !b10.d()) {
            return new TreeSet((Collection) b10.c());
        }
        return new TreeSet();
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized long b(String str) {
        return j.a(c(str));
    }

    private void b(n nVar) {
        ArrayList<a.b> arrayList = this.f8782g.get(nVar.f8742a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size);
            }
        }
    }

    private static synchronized boolean c(File file) {
        synchronized (m.class) {
            if (f8779c) {
                return true;
            }
            return f8778b.add(file.getAbsoluteFile());
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized void a(File file) {
        boolean z10 = true;
        com.anythink.expressad.exoplayer.k.a.b(!this.f8784i);
        n a10 = n.a(file, this.f);
        com.anythink.expressad.exoplayer.k.a.b(a10 != null);
        g b10 = this.f.b(a10.f8742a);
        com.anythink.expressad.exoplayer.k.a.a(b10);
        com.anythink.expressad.exoplayer.k.a.b(b10.b());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long a11 = j.a(b10.a());
            if (a11 != -1) {
                if (a10.f8743b + a10.f8744c > a11) {
                    z10 = false;
                }
                com.anythink.expressad.exoplayer.k.a.b(z10);
            }
            a(a10);
            this.f.b();
            notifyAll();
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized void a(e eVar) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f8784i);
        g b10 = this.f.b(eVar.f8742a);
        com.anythink.expressad.exoplayer.k.a.a(b10);
        com.anythink.expressad.exoplayer.k.a.b(b10.b());
        b10.a(false);
        this.f.d(b10.f8754b);
        notifyAll();
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized boolean a(String str, long j10, long j11) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f8784i);
        g b10 = this.f.b(str);
        if (b10 != null) {
            if (b10.a(j10, j11) >= j11) {
                return true;
            }
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.j.a.a
    public final synchronized void a(String str, k kVar) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f8784i);
        this.f.a(str, kVar);
        this.f.b();
    }

    private void a(n nVar) {
        this.f.a(nVar.f8742a).a(nVar);
        this.f8783h += nVar.f8744c;
        b(nVar);
    }

    private void a(e eVar, boolean z10) {
        g b10 = this.f.b(eVar.f8742a);
        if (b10 == null || !b10.a(eVar)) {
            return;
        }
        this.f8783h -= eVar.f8744c;
        if (z10) {
            try {
                this.f.d(b10.f8754b);
                this.f.b();
            } finally {
                c(eVar);
            }
        }
    }

    public static /* synthetic */ void a(m mVar) {
        if (!mVar.f8780d.exists()) {
            mVar.f8780d.mkdirs();
            return;
        }
        mVar.f.a();
        File[] listFiles = mVar.f8780d.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.getName().equals(h.f8757a)) {
                    n a10 = file.length() > 0 ? n.a(file, mVar.f) : null;
                    if (a10 != null) {
                        mVar.a(a10);
                    } else {
                        file.delete();
                    }
                }
            }
            mVar.f.d();
            try {
                mVar.f.b();
            } catch (a.C0114a e10) {
                Log.e(f8777a, "Storing index file failed", e10);
            }
        }
    }
}
