package com.anythink.expressad.foundation.g.c;

import android.util.Log;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9865a = "AnythinkDirManager";

    /* renamed from: d, reason: collision with root package name */
    private static d f9866d;

    /* renamed from: b, reason: collision with root package name */
    private f f9867b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<a> f9868c = new ArrayList<>();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public com.anythink.expressad.foundation.g.c.a f9869a;

        /* renamed from: b, reason: collision with root package name */
        public File f9870b;

        public a(com.anythink.expressad.foundation.g.c.a aVar, File file) {
            this.f9869a = aVar;
            this.f9870b = file;
        }
    }

    private d(f fVar) {
        this.f9867b = fVar;
    }

    public static synchronized void a(f fVar) {
        synchronized (d.class) {
            if (f9866d == null) {
                f9866d = new d(fVar);
            }
        }
    }

    public static String b(com.anythink.expressad.foundation.g.c.a aVar) {
        File a10 = a(aVar);
        if (a10 != null) {
            return a10.getAbsolutePath();
        }
        return null;
    }

    public final boolean b() {
        return a(this.f9867b.b());
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f9866d == null && com.anythink.expressad.foundation.b.a.b().d() != null) {
                r.a(com.anythink.expressad.foundation.b.a.b().d());
            }
            if (f9866d == null) {
                Log.e(f9865a, "mDirectoryManager == null");
            }
            dVar = f9866d;
        }
        return dVar;
    }

    public static File a(com.anythink.expressad.foundation.g.c.a aVar) {
        try {
            if (a() == null || a().f9868c == null || a().f9868c.size() <= 0) {
                return null;
            }
            Iterator<a> it = a().f9868c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f9869a.equals(aVar)) {
                    return next.f9870b;
                }
            }
            return null;
        } catch (Throwable th) {
            o.b(f9865a, th.getMessage(), th);
            return null;
        }
    }

    private boolean a(e eVar) {
        String str;
        e c10 = eVar.c();
        if (c10 == null) {
            str = eVar.b();
        } else {
            File a10 = a(c10.a());
            if (a10 == null) {
                return false;
            }
            str = a10.getAbsolutePath() + File.separator + eVar.b();
        }
        File file = new File(str);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f9868c.add(new a(eVar.a(), file));
        List<e> d10 = eVar.d();
        if (d10 != null) {
            Iterator<e> it = d10.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
