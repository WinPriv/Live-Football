package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.manager.k;
import java.util.HashMap;

/* compiled from: RequestManagerRetriever.java */
/* loaded from: classes.dex */
public final class n implements Handler.Callback {
    public static final a A = new a();

    /* renamed from: s, reason: collision with root package name */
    public volatile com.bumptech.glide.o f19799s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f19800t = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f19801u = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public final Handler f19802v;

    /* renamed from: w, reason: collision with root package name */
    public final b f19803w;

    /* renamed from: x, reason: collision with root package name */
    public final com.bumptech.glide.i f19804x;
    public final g y;

    /* renamed from: z, reason: collision with root package name */
    public final k f19805z;

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: classes.dex */
    public class a implements b {
    }

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public n(b bVar, com.bumptech.glide.i iVar) {
        g dVar;
        new q.b();
        new q.b();
        new Bundle();
        bVar = bVar == null ? A : bVar;
        this.f19803w = bVar;
        this.f19804x = iVar;
        this.f19802v = new Handler(Looper.getMainLooper(), this);
        this.f19805z = new k(bVar);
        if (h3.r.f28723h && h3.r.f28722g) {
            if (iVar.f19733a.containsKey(com.bumptech.glide.g.class)) {
                dVar = new f();
            } else {
                dVar = new androidx.activity.n(0);
            }
        } else {
            dVar = new l3.d();
        }
        this.y = dVar;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    public final com.bumptech.glide.o b(Activity activity) {
        boolean z10;
        char[] cArr = t3.l.f35429a;
        boolean z11 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return c(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return d((FragmentActivity) activity);
        }
        if (!activity.isDestroyed()) {
            this.y.a();
            FragmentManager fragmentManager = activity.getFragmentManager();
            Activity a10 = a(activity);
            if (a10 == null || !a10.isFinishing()) {
                z11 = true;
            }
            m e10 = e(fragmentManager);
            com.bumptech.glide.o oVar = e10.f19795v;
            if (oVar == null) {
                com.bumptech.glide.b b10 = com.bumptech.glide.b.b(activity);
                ((a) this.f19803w).getClass();
                com.bumptech.glide.o oVar2 = new com.bumptech.glide.o(b10, e10.f19792s, e10.f19793t, activity);
                if (z11) {
                    oVar2.onStart();
                }
                e10.f19795v = oVar2;
                return oVar2;
            }
            return oVar;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final com.bumptech.glide.o c(Context context) {
        boolean z10;
        if (context != null) {
            char[] cArr = t3.l.f35429a;
            int i10 = 0;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return d((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return b((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return c(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f19799s == null) {
                synchronized (this) {
                    if (this.f19799s == null) {
                        com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context.getApplicationContext());
                        b bVar = this.f19803w;
                        androidx.activity.n nVar = new androidx.activity.n(i10);
                        l3.d dVar = new l3.d();
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar).getClass();
                        this.f19799s = new com.bumptech.glide.o(b10, nVar, dVar, applicationContext);
                    }
                }
            }
            return this.f19799s;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final com.bumptech.glide.o d(FragmentActivity fragmentActivity) {
        boolean z10;
        char[] cArr = t3.l.f35429a;
        boolean z11 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return c(fragmentActivity.getApplicationContext());
        }
        if (!fragmentActivity.isDestroyed()) {
            this.y.a();
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Activity a10 = a(fragmentActivity);
            if (a10 == null || !a10.isFinishing()) {
                z11 = true;
            }
            if (this.f19804x.f19733a.containsKey(com.bumptech.glide.f.class)) {
                Context applicationContext = fragmentActivity.getApplicationContext();
                com.bumptech.glide.b b10 = com.bumptech.glide.b.b(applicationContext);
                androidx.lifecycle.i lifecycle = fragmentActivity.getLifecycle();
                androidx.fragment.app.FragmentManager supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
                k kVar = this.f19805z;
                kVar.getClass();
                t3.l.a();
                t3.l.a();
                HashMap hashMap = kVar.f19790a;
                com.bumptech.glide.o oVar = (com.bumptech.glide.o) hashMap.get(lifecycle);
                if (oVar == null) {
                    LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
                    k.a aVar = new k.a(kVar, supportFragmentManager2);
                    ((a) kVar.f19791b).getClass();
                    com.bumptech.glide.o oVar2 = new com.bumptech.glide.o(b10, lifecycleLifecycle, aVar, applicationContext);
                    hashMap.put(lifecycle, oVar2);
                    lifecycleLifecycle.d(new j(kVar, lifecycle));
                    if (z11) {
                        oVar2.onStart();
                    }
                    return oVar2;
                }
                return oVar;
            }
            s f = f(supportFragmentManager);
            com.bumptech.glide.o oVar3 = f.f19826w;
            if (oVar3 == null) {
                com.bumptech.glide.b b11 = com.bumptech.glide.b.b(fragmentActivity);
                ((a) this.f19803w).getClass();
                com.bumptech.glide.o oVar4 = new com.bumptech.glide.o(b11, f.f19822s, f.f19823t, fragmentActivity);
                if (z11) {
                    oVar4.onStart();
                }
                f.f19826w = oVar4;
                return oVar4;
            }
            return oVar3;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final m e(FragmentManager fragmentManager) {
        HashMap hashMap = this.f19800t;
        m mVar = (m) hashMap.get(fragmentManager);
        if (mVar == null) {
            m mVar2 = (m) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (mVar2 == null) {
                mVar2 = new m();
                mVar2.f19797x = null;
                hashMap.put(fragmentManager, mVar2);
                fragmentManager.beginTransaction().add(mVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f19802v.obtainMessage(1, fragmentManager).sendToTarget();
            }
            return mVar2;
        }
        return mVar;
    }

    public final s f(androidx.fragment.app.FragmentManager fragmentManager) {
        HashMap hashMap = this.f19801u;
        s sVar = (s) hashMap.get(fragmentManager);
        if (sVar == null) {
            s sVar2 = (s) fragmentManager.B("com.bumptech.glide.manager");
            if (sVar2 == null) {
                sVar2 = new s();
                sVar2.f19827x = null;
                hashMap.put(fragmentManager, sVar2);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                aVar.c(0, sVar2, "com.bumptech.glide.manager", 1);
                aVar.e(true);
                this.f19802v.obtainMessage(2, fragmentManager).sendToTarget();
            }
            return sVar2;
        }
        return sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r19) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.n.handleMessage(android.os.Message):boolean");
    }
}
