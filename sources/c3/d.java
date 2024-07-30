package c3;

import android.util.Log;
import c3.b;
import java.io.File;
import java.io.IOException;
import w2.a;

/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: t, reason: collision with root package name */
    public final File f3236t;

    /* renamed from: u, reason: collision with root package name */
    public final long f3237u;

    /* renamed from: w, reason: collision with root package name */
    public w2.a f3239w;

    /* renamed from: v, reason: collision with root package name */
    public final b f3238v = new b();

    /* renamed from: s, reason: collision with root package name */
    public final j f3235s = new j();

    @Deprecated
    public d(File file, long j10) {
        this.f3236t = file;
        this.f3237u = j10;
    }

    @Override // c3.a
    public final void c(y2.e eVar, a3.g gVar) {
        b.a aVar;
        w2.a aVar2;
        boolean z10;
        String a10 = this.f3235s.a(eVar);
        b bVar = this.f3238v;
        synchronized (bVar) {
            aVar = (b.a) bVar.f3228a.get(a10);
            if (aVar == null) {
                b.C0038b c0038b = bVar.f3229b;
                synchronized (c0038b.f3232a) {
                    aVar = (b.a) c0038b.f3232a.poll();
                }
                if (aVar == null) {
                    aVar = new b.a();
                }
                bVar.f3228a.put(a10, aVar);
            }
            aVar.f3231b++;
        }
        aVar.f3230a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + a10 + " for for Key: " + eVar);
            }
            try {
                synchronized (this) {
                    if (this.f3239w == null) {
                        this.f3239w = w2.a.i(this.f3236t, this.f3237u);
                    }
                    aVar2 = this.f3239w;
                }
                if (aVar2.g(a10) == null) {
                    a.c e10 = aVar2.e(a10);
                    if (e10 != null) {
                        try {
                            if (gVar.f115a.g(gVar.f116b, e10.b(), gVar.f117c)) {
                                w2.a.b(w2.a.this, e10, true);
                                e10.f36052c = true;
                            }
                            if (!z10) {
                                try {
                                    e10.a();
                                } catch (IOException unused) {
                                }
                            }
                        } finally {
                            if (!e10.f36052c) {
                                try {
                                    e10.a();
                                } catch (IOException unused2) {
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(a10));
                    }
                }
            } catch (IOException e11) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e11);
                }
            }
        } finally {
            this.f3238v.a(a10);
        }
    }

    @Override // c3.a
    public final File j(y2.e eVar) {
        w2.a aVar;
        String a10 = this.f3235s.a(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a10 + " for for Key: " + eVar);
        }
        try {
            synchronized (this) {
                if (this.f3239w == null) {
                    this.f3239w = w2.a.i(this.f3236t, this.f3237u);
                }
                aVar = this.f3239w;
            }
            a.e g6 = aVar.g(a10);
            if (g6 != null) {
                return g6.f36060a[0];
            }
        } catch (IOException e10) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            }
        }
        return null;
    }
}
