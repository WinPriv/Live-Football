package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.i;

/* compiled from: ReportFragment.java */
/* loaded from: classes.dex */
public final class v extends Fragment {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f2003t = 0;

    /* renamed from: s, reason: collision with root package name */
    public a f2004s;

    /* compiled from: ReportFragment.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, i.b bVar) {
        if (activity instanceof o) {
            ((o) activity).getLifecycle().f(bVar);
        } else if (activity instanceof m) {
            i lifecycle = ((m) activity).getLifecycle();
            if (lifecycle instanceof n) {
                ((n) lifecycle).f(bVar);
            }
        }
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new v(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(i.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), bVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(i.b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        b(i.b.ON_DESTROY);
        this.f2004s = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        b(i.b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a aVar = this.f2004s;
        if (aVar != null) {
            t.this.a();
        }
        b(i.b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a aVar = this.f2004s;
        if (aVar != null) {
            t tVar = t.this;
            int i10 = tVar.f1994s + 1;
            tVar.f1994s = i10;
            if (i10 == 1 && tVar.f1997v) {
                tVar.f1999x.f(i.b.ON_START);
                tVar.f1997v = false;
            }
        }
        b(i.b.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        b(i.b.ON_STOP);
    }

    /* compiled from: ReportFragment.java */
    /* loaded from: classes.dex */
    public static class b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            v.a(activity, i.b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            v.a(activity, i.b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            v.a(activity, i.b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            v.a(activity, i.b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            v.a(activity, i.b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            v.a(activity, i.b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
