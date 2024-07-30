package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import b0.f;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.hamkho.livefoot.Activities.MainActivity;
import com.hamkho.livefoot.Activities.SplashActivity;
import com.hamkho.livefoot.Activities.UpdateActivity;
import j5.b0;
import j5.s;
import java.lang.reflect.Method;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f480s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f481t;

    public /* synthetic */ g(Object obj, int i10) {
        this.f480s = i10;
        this.f481t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        Object obj;
        boolean z11;
        int i10 = this.f480s;
        int i11 = 4;
        boolean z12 = true;
        Object obj2 = this.f481t;
        switch (i10) {
            case 0:
                h.a((h) obj2);
                return;
            case 1:
                Activity activity = (Activity) obj2;
                int i12 = b0.a.f2696c;
                if (!activity.isFinishing()) {
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 28) {
                        Class<?> cls = b0.f.f2707a;
                        activity.recreate();
                    } else {
                        Class<?> cls2 = b0.f.f2707a;
                        if (i13 != 26 && i13 != 27) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        Method method = b0.f.f;
                        if ((!z10 || method != null) && (b0.f.f2711e != null || b0.f.f2710d != null)) {
                            try {
                                Object obj3 = b0.f.f2709c.get(activity);
                                if (obj3 != null && (obj = b0.f.f2708b.get(activity)) != null) {
                                    Application application = activity.getApplication();
                                    f.a aVar = new f.a(activity);
                                    application.registerActivityLifecycleCallbacks(aVar);
                                    Handler handler = b0.f.f2712g;
                                    handler.post(new b0.c(aVar, obj3));
                                    if (i13 != 26 && i13 != 27) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    try {
                                        if (z11) {
                                            Boolean bool = Boolean.FALSE;
                                            method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                        } else {
                                            activity.recreate();
                                        }
                                        handler.post(new b0.d(application, aVar));
                                    } catch (Throwable th) {
                                        handler.post(new b0.d(application, aVar));
                                        throw th;
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        z12 = false;
                    }
                    if (!z12) {
                        activity.recreate();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((com.applovin.exoplayer2.ui.f) obj2).b();
                return;
            case 3:
                f4.j jVar = (f4.j) obj2;
                jVar.getClass();
                jVar.f28107d.e(new b0.b(jVar, i11));
                return;
            case 4:
                b0 b0Var = (b0) obj2;
                if (!b0Var.f29652f0) {
                    s.a aVar2 = b0Var.I;
                    aVar2.getClass();
                    aVar2.g(b0Var);
                    return;
                }
                return;
            case 5:
                o5.n nVar = (o5.n) obj2;
                nVar.U = true;
                nVar.C();
                return;
            case 6:
                int i14 = DefaultTimeBar.f20245k0;
                ((DefaultTimeBar) obj2).f(false);
                return;
            case 7:
                int i15 = PlayerControlView.f20261x0;
                ((PlayerControlView) obj2).j();
                return;
            case 8:
            default:
                RealWebSocket.a((RealWebSocket) obj2);
                return;
            case 9:
                com.google.android.material.textfield.m mVar = (com.google.android.material.textfield.m) obj2;
                boolean isPopupShowing = mVar.f21170h.isPopupShowing();
                mVar.t(isPopupShowing);
                mVar.f21175m = isPopupShowing;
                return;
            case 10:
                SplashActivity.a aVar3 = (SplashActivity.a) ((h9.a) obj2);
                aVar3.getClass();
                boolean g6 = t8.l.f35592c.g();
                SplashActivity splashActivity = SplashActivity.this;
                if (g6) {
                    try {
                        if (splashActivity.getPackageManager().getPackageInfo(splashActivity.getPackageName(), 0).versionCode != t8.l.f35592c.d()) {
                            splashActivity.startActivity(new Intent(splashActivity, (Class<?>) UpdateActivity.class));
                        } else {
                            splashActivity.startActivity(new Intent(splashActivity, (Class<?>) MainActivity.class));
                        }
                        return;
                    } catch (PackageManager.NameNotFoundException e10) {
                        e10.printStackTrace();
                        splashActivity.startActivity(new Intent(splashActivity, (Class<?>) MainActivity.class));
                        return;
                    }
                }
                splashActivity.startActivity(new Intent(splashActivity, (Class<?>) MainActivity.class));
                return;
        }
    }
}
