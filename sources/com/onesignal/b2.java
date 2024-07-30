package com.onesignal;

import com.onesignal.e3;

/* compiled from: OSNotificationOpenedResult.java */
/* loaded from: classes2.dex */
public final class b2 implements e3.o {

    /* renamed from: a, reason: collision with root package name */
    public final y2 f26678a;

    /* renamed from: b, reason: collision with root package name */
    public final a f26679b;

    /* renamed from: c, reason: collision with root package name */
    public final t1 f26680c;

    /* renamed from: d, reason: collision with root package name */
    public final a0.a f26681d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26682e = false;

    /* compiled from: OSNotificationOpenedResult.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e3.b(6, "Running complete from OSNotificationOpenedResult timeout runnable!", null);
            b2.this.b(false);
        }
    }

    public b2(t1 t1Var, a0.a aVar) {
        this.f26680c = t1Var;
        this.f26681d = aVar;
        y2 b10 = y2.b();
        this.f26678a = b10;
        a aVar2 = new a();
        this.f26679b = aVar2;
        b10.c(com.anythink.expressad.exoplayer.f.f7962a, aVar2);
    }

    @Override // com.onesignal.e3.o
    public final void a(e3.m mVar) {
        e3.b(6, "OSNotificationOpenedResult onEntryStateChange called with appEntryState: " + mVar, null);
        b(e3.m.APP_CLOSE.equals(mVar));
    }

    public final void b(boolean z10) {
        e3.b(6, "OSNotificationOpenedResult complete called with opened: " + z10, null);
        this.f26678a.a(this.f26679b);
        if (this.f26682e) {
            e3.b(6, "OSNotificationOpenedResult already completed", null);
            return;
        }
        this.f26682e = true;
        if (z10) {
            e3.e(this.f26680c.f27070c);
        }
        e3.f26746a.remove(this);
    }

    public final String toString() {
        return "OSNotificationOpenedResult{notification=" + this.f26680c + ", action=" + this.f26681d + ", isComplete=" + this.f26682e + '}';
    }
}
