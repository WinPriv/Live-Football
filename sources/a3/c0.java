package a3;

import a3.h;
import a3.o;
import android.os.SystemClock;
import android.util.Log;
import e3.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: SourceGenerator.java */
/* loaded from: classes.dex */
public final class c0 implements h, h.a {

    /* renamed from: s, reason: collision with root package name */
    public final i<?> f100s;

    /* renamed from: t, reason: collision with root package name */
    public final h.a f101t;

    /* renamed from: u, reason: collision with root package name */
    public volatile int f102u;

    /* renamed from: v, reason: collision with root package name */
    public volatile e f103v;

    /* renamed from: w, reason: collision with root package name */
    public volatile Object f104w;

    /* renamed from: x, reason: collision with root package name */
    public volatile n.a<?> f105x;
    public volatile f y;

    public c0(i<?> iVar, h.a aVar) {
        this.f100s = iVar;
        this.f101t = aVar;
    }

    @Override // a3.h.a
    public final void a(y2.e eVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, y2.a aVar) {
        this.f101t.a(eVar, exc, dVar, this.f105x.f27705c.d());
    }

    @Override // a3.h
    public final boolean b() {
        boolean z10;
        boolean z11;
        if (this.f104w != null) {
            Object obj = this.f104w;
            this.f104w = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f103v != null && this.f103v.b()) {
            return true;
        }
        this.f103v = null;
        this.f105x = null;
        boolean z12 = false;
        while (!z12) {
            if (this.f102u < this.f100s.b().size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            ArrayList b10 = this.f100s.b();
            int i10 = this.f102u;
            this.f102u = i10 + 1;
            this.f105x = (n.a) b10.get(i10);
            if (this.f105x != null) {
                if (!this.f100s.f131p.c(this.f105x.f27705c.d())) {
                    if (this.f100s.c(this.f105x.f27705c.a()) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                    }
                }
                this.f105x.f27705c.e(this.f100s.o, new b0(this, this.f105x));
                z12 = true;
            }
        }
        return z12;
    }

    @Override // a3.h.a
    public final void c(y2.e eVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, y2.a aVar, y2.e eVar2) {
        this.f101t.c(eVar, obj, dVar, this.f105x.f27705c.d(), eVar);
    }

    @Override // a3.h
    public final void cancel() {
        n.a<?> aVar = this.f105x;
        if (aVar != null) {
            aVar.f27705c.cancel();
        }
    }

    @Override // a3.h.a
    public final void d() {
        throw new UnsupportedOperationException();
    }

    public final boolean e(Object obj) throws IOException {
        int i10 = t3.h.f35419b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.e f = this.f100s.f120c.a().f(obj);
            Object a10 = f.a();
            y2.d<X> e10 = this.f100s.e(a10);
            g gVar = new g(e10, a10, this.f100s.f125i);
            y2.e eVar = this.f105x.f27703a;
            i<?> iVar = this.f100s;
            f fVar = new f(eVar, iVar.f130n);
            c3.a a11 = ((o.c) iVar.f124h).a();
            a11.c(fVar, gVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + fVar + ", data: " + obj + ", encoder: " + e10 + ", duration: " + t3.h.a(elapsedRealtimeNanos));
            }
            if (a11.j(fVar) != null) {
                this.y = fVar;
                this.f103v = new e(Collections.singletonList(this.f105x.f27703a), this.f100s, this);
                this.f105x.f27705c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.y + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f101t.c(this.f105x.f27703a, f.a(), this.f105x.f27705c, this.f105x.f27705c.d(), this.f105x.f27703a);
                return false;
            } catch (Throwable th) {
                th = th;
                z10 = true;
                if (!z10) {
                    this.f105x.f27705c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
