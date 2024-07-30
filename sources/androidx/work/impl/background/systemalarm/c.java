package androidx.work.impl.background.systemalarm;

import a2.q;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import b2.o;
import b2.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r1.h;

/* compiled from: DelayMetCommandHandler.java */
/* loaded from: classes.dex */
public final class c implements w1.c, s1.a, t.b {
    public static final String B = h.e("DelayMetCommandHandler");

    /* renamed from: s, reason: collision with root package name */
    public final Context f2653s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2654t;

    /* renamed from: u, reason: collision with root package name */
    public final String f2655u;

    /* renamed from: v, reason: collision with root package name */
    public final d f2656v;

    /* renamed from: w, reason: collision with root package name */
    public final w1.d f2657w;

    /* renamed from: z, reason: collision with root package name */
    public PowerManager.WakeLock f2659z;
    public boolean A = false;
    public int y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Object f2658x = new Object();

    public c(Context context, int i10, String str, d dVar) {
        this.f2653s = context;
        this.f2654t = i10;
        this.f2656v = dVar;
        this.f2655u = str;
        this.f2657w = new w1.d(context, dVar.f2661t, this);
    }

    @Override // b2.t.b
    public final void a(String str) {
        h.c().a(B, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // s1.a
    public final void b(String str, boolean z10) {
        h.c().a(B, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        d();
        int i10 = this.f2654t;
        d dVar = this.f2656v;
        Context context = this.f2653s;
        if (z10) {
            dVar.e(new d.b(i10, a.c(context, this.f2655u), dVar));
        }
        if (this.A) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            dVar.e(new d.b(i10, intent, dVar));
        }
    }

    @Override // w1.c
    public final void c(ArrayList arrayList) {
        g();
    }

    public final void d() {
        synchronized (this.f2658x) {
            this.f2657w.c();
            this.f2656v.f2662u.b(this.f2655u);
            PowerManager.WakeLock wakeLock = this.f2659z;
            if (wakeLock != null && wakeLock.isHeld()) {
                h.c().a(B, String.format("Releasing wakelock %s for WorkSpec %s", this.f2659z, this.f2655u), new Throwable[0]);
                this.f2659z.release();
            }
        }
    }

    @Override // w1.c
    public final void e(List<String> list) {
        if (!list.contains(this.f2655u)) {
            return;
        }
        synchronized (this.f2658x) {
            if (this.y == 0) {
                this.y = 1;
                h.c().a(B, String.format("onAllConstraintsMet for %s", this.f2655u), new Throwable[0]);
                if (this.f2656v.f2663v.f(this.f2655u, null)) {
                    this.f2656v.f2662u.a(this.f2655u, this);
                } else {
                    d();
                }
            } else {
                h.c().a(B, String.format("Already started work for %s", this.f2655u), new Throwable[0]);
            }
        }
    }

    public final void f() {
        String str = this.f2655u;
        this.f2659z = o.a(this.f2653s, String.format("%s (%s)", str, Integer.valueOf(this.f2654t)));
        h c10 = h.c();
        Object[] objArr = {this.f2659z, str};
        String str2 = B;
        c10.a(str2, String.format("Acquiring wakelock %s for WorkSpec %s", objArr), new Throwable[0]);
        this.f2659z.acquire();
        a2.o i10 = ((q) this.f2656v.f2664w.f35074c.n()).i(str);
        if (i10 == null) {
            g();
            return;
        }
        boolean b10 = i10.b();
        this.A = b10;
        if (!b10) {
            h.c().a(str2, String.format("No constraints for %s", str), new Throwable[0]);
            e(Collections.singletonList(str));
        } else {
            this.f2657w.b(Collections.singletonList(i10));
        }
    }

    public final void g() {
        synchronized (this.f2658x) {
            if (this.y < 2) {
                this.y = 2;
                h c10 = h.c();
                String str = B;
                c10.a(str, String.format("Stopping work for WorkSpec %s", this.f2655u), new Throwable[0]);
                Context context = this.f2653s;
                String str2 = this.f2655u;
                Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                d dVar = this.f2656v;
                dVar.e(new d.b(this.f2654t, intent, dVar));
                if (this.f2656v.f2663v.d(this.f2655u)) {
                    h.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f2655u), new Throwable[0]);
                    Intent c11 = a.c(this.f2653s, this.f2655u);
                    d dVar2 = this.f2656v;
                    dVar2.e(new d.b(this.f2654t, c11, dVar2));
                } else {
                    h.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f2655u), new Throwable[0]);
                }
            } else {
                h.c().a(B, String.format("Already stopped work for %s", this.f2655u), new Throwable[0]);
            }
        }
    }
}
