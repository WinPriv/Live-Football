package com.ironsource.lifecycle.a;

import android.util.Log;
import com.ironsource.lifecycle.c;
import com.ironsource.lifecycle.d;
import com.ironsource.mediationsdk.server.b;
import java.util.Timer;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final d f24704a;

    /* renamed from: b, reason: collision with root package name */
    public final b f24705b;

    /* renamed from: c, reason: collision with root package name */
    public final c f24706c = new C0325a();

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f24707d;

    /* renamed from: e, reason: collision with root package name */
    public Timer f24708e;

    /* renamed from: com.ironsource.lifecycle.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0325a implements c {
        public C0325a() {
        }

        @Override // com.ironsource.lifecycle.c
        public final void a() {
            a aVar = a.this;
            aVar.f24705b.c(System.currentTimeMillis());
            long a10 = aVar.f24705b.a();
            aVar.a();
            Timer timer = new Timer();
            aVar.f24708e = timer;
            timer.schedule(new qb.a(aVar), a10);
        }

        @Override // com.ironsource.lifecycle.c
        public final void b() {
            a aVar = a.this;
            aVar.f24705b.b(System.currentTimeMillis());
            aVar.a();
        }
    }

    public a(Runnable runnable, d dVar, b bVar) {
        this.f24707d = runnable;
        this.f24704a = dVar;
        this.f24705b = bVar;
    }

    public void a() {
        Timer timer = this.f24708e;
        if (timer != null) {
            timer.cancel();
            this.f24708e = null;
        }
    }

    public final void a(long j10) {
        if (j10 < 0) {
            Log.d("a", "cannot start timer with delay < 0");
            return;
        }
        this.f24704a.a(this.f24706c);
        this.f24705b.a(j10);
        if (this.f24704a.b()) {
            this.f24705b.b(System.currentTimeMillis());
            return;
        }
        a();
        Timer timer = new Timer();
        this.f24708e = timer;
        timer.schedule(new qb.a(this), j10);
    }
}
