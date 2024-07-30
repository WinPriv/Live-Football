package com.anythink.banner.b;

import android.text.TextUtils;
import com.anythink.banner.a.d;
import com.anythink.core.c.e;
import com.anythink.core.common.b.n;
import com.anythink.expressad.exoplayer.f;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    String f3513a;

    /* renamed from: b, reason: collision with root package name */
    WeakReference<d> f3514b;

    /* renamed from: c, reason: collision with root package name */
    Timer f3515c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3516d = false;

    /* renamed from: com.anythink.banner.b.a$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends TimerTask {
        public AnonymousClass1() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            a.a(a.this);
        }
    }

    public a(d dVar) {
        this.f3514b = new WeakReference<>(dVar);
    }

    private TimerTask e() {
        return new AnonymousClass1();
    }

    private void f() {
        d dVar;
        WeakReference<d> weakReference = this.f3514b;
        if (weakReference != null) {
            dVar = weakReference.get();
        } else {
            dVar = null;
        }
        if (dVar != null) {
            dVar.timeUpRefreshView();
        } else {
            d();
        }
    }

    public final void a(String str) {
        this.f3513a = str;
    }

    public final synchronized void b() {
        if (TextUtils.isEmpty(this.f3513a)) {
            return;
        }
        com.anythink.core.c.d a10 = e.a(n.a().g()).a(this.f3513a);
        Timer timer = this.f3515c;
        if (timer != null) {
            timer.cancel();
        }
        if (a10 != null && a10.V() == 1) {
            this.f3516d = true;
            this.f3515c = new Timer();
            long W = a10.W();
            long j10 = f.f7962a;
            if (W > f.f7962a) {
                j10 = a10.W();
            }
            long j11 = j10;
            this.f3515c.schedule(new AnonymousClass1(), j11, j11);
        }
    }

    public final boolean c() {
        if (this.f3515c == null) {
            return true;
        }
        return false;
    }

    public final synchronized void d() {
        Timer timer = this.f3515c;
        if (timer != null) {
            timer.cancel();
        }
        this.f3515c = null;
    }

    public final boolean a() {
        return this.f3516d;
    }

    public static /* synthetic */ void a(a aVar) {
        WeakReference<d> weakReference = aVar.f3514b;
        d dVar = weakReference != null ? weakReference.get() : null;
        if (dVar != null) {
            dVar.timeUpRefreshView();
        } else {
            aVar.d();
        }
    }
}
