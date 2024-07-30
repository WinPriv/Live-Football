package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.i;

/* loaded from: classes.dex */
public class LifecycleService extends Service implements m {

    /* renamed from: s, reason: collision with root package name */
    public final d0 f1918s = new d0(this);

    @Override // androidx.lifecycle.m
    public final i getLifecycle() {
        return this.f1918s.f1956a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.f1918s.a(i.b.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f1918s.a(i.b.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        i.b bVar = i.b.ON_STOP;
        d0 d0Var = this.f1918s;
        d0Var.a(bVar);
        d0Var.a(i.b.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        this.f1918s.a(i.b.ON_START);
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
