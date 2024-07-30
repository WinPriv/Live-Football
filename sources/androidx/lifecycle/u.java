package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.i;

/* compiled from: ProcessLifecycleOwner.java */
/* loaded from: classes.dex */
public final class u extends d {
    final /* synthetic */ t this$0;

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    public class a extends d {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            u.this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            t tVar = u.this.this$0;
            int i10 = tVar.f1994s + 1;
            tVar.f1994s = i10;
            if (i10 == 1 && tVar.f1997v) {
                tVar.f1999x.f(i.b.ON_START);
                tVar.f1997v = false;
            }
        }
    }

    public u(t tVar) {
        this.this$0 = tVar;
    }

    @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = v.f2003t;
            ((v) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f2004s = this.this$0.f2000z;
        }
    }

    @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        t tVar = this.this$0;
        int i10 = tVar.f1995t - 1;
        tVar.f1995t = i10;
        if (i10 == 0) {
            tVar.f1998w.postDelayed(tVar.y, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new a());
    }

    @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        t tVar = this.this$0;
        int i10 = tVar.f1994s - 1;
        tVar.f1994s = i10;
        if (i10 == 0 && tVar.f1996u) {
            tVar.f1999x.f(i.b.ON_STOP);
            tVar.f1997v = true;
        }
    }
}
