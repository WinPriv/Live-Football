package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.v;

/* compiled from: ProcessLifecycleOwner.java */
/* loaded from: classes.dex */
public final class t implements m {
    public static final t A = new t();

    /* renamed from: w, reason: collision with root package name */
    public Handler f1998w;

    /* renamed from: s, reason: collision with root package name */
    public int f1994s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f1995t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1996u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1997v = true;

    /* renamed from: x, reason: collision with root package name */
    public final n f1999x = new n(this);
    public final a y = new a();

    /* renamed from: z, reason: collision with root package name */
    public final b f2000z = new b();

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            t tVar = t.this;
            int i10 = tVar.f1995t;
            n nVar = tVar.f1999x;
            if (i10 == 0) {
                tVar.f1996u = true;
                nVar.f(i.b.ON_PAUSE);
            }
            if (tVar.f1994s == 0 && tVar.f1996u) {
                nVar.f(i.b.ON_STOP);
                tVar.f1997v = true;
            }
        }
    }

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    public class b implements v.a {
        public b() {
        }
    }

    public final void a() {
        int i10 = this.f1995t + 1;
        this.f1995t = i10;
        if (i10 == 1) {
            if (this.f1996u) {
                this.f1999x.f(i.b.ON_RESUME);
                this.f1996u = false;
            } else {
                this.f1998w.removeCallbacks(this.y);
            }
        }
    }

    @Override // androidx.lifecycle.m
    public final i getLifecycle() {
        return this.f1999x;
    }
}
