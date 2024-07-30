package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.i;
import b0.a;
import i1.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements a.d {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final androidx.lifecycle.n mFragmentLifecycleRegistry;
    final o mFragments;
    boolean mResumed;
    boolean mStopped;

    /* loaded from: classes.dex */
    public class a implements b.InterfaceC0395b {
        public a() {
        }

        @Override // i1.b.InterfaceC0395b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            FragmentActivity fragmentActivity = FragmentActivity.this;
            fragmentActivity.markFragmentsCreated();
            fragmentActivity.mFragmentLifecycleRegistry.f(i.b.ON_STOP);
            Parcelable T = fragmentActivity.mFragments.f1862a.f1867v.T();
            if (T != null) {
                bundle.putParcelable(FragmentActivity.FRAGMENTS_TAG, T);
            }
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public class b implements d.b {
        public b() {
        }

        @Override // d.b
        public final void a(Context context) {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            q<?> qVar = fragmentActivity.mFragments.f1862a;
            qVar.f1867v.b(qVar, qVar, null);
            Bundle a10 = fragmentActivity.getSavedStateRegistry().a(FragmentActivity.FRAGMENTS_TAG);
            if (a10 != null) {
                Parcelable parcelable = a10.getParcelable(FragmentActivity.FRAGMENTS_TAG);
                q<?> qVar2 = fragmentActivity.mFragments.f1862a;
                if (qVar2 instanceof androidx.lifecycle.j0) {
                    qVar2.f1867v.S(parcelable);
                    return;
                }
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends q<FragmentActivity> implements androidx.lifecycle.j0, androidx.activity.m, androidx.activity.result.f, v {
        public c() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.v
        public final void a(Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.n
        public final View b(int i10) {
            return FragmentActivity.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.n
        public final boolean c() {
            Window window = FragmentActivity.this.getWindow();
            if (window != null && window.peekDecorView() != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.fragment.app.q
        public final void d(PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.q
        public final FragmentActivity e() {
            return FragmentActivity.this;
        }

        @Override // androidx.fragment.app.q
        public final LayoutInflater f() {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            return fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        }

        @Override // androidx.fragment.app.q
        public final boolean g(String str) {
            return b0.a.c(FragmentActivity.this, str);
        }

        @Override // androidx.activity.result.f
        public final androidx.activity.result.e getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.m
        public final androidx.lifecycle.i getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.m
        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.lifecycle.j0
        public final androidx.lifecycle.i0 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.q
        public final void h() {
            FragmentActivity.this.supportInvalidateOptionsMenu();
        }
    }

    public FragmentActivity() {
        this.mFragments = new o(new c());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.n(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(FRAGMENTS_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private static boolean markState(FragmentManager fragmentManager, i.c cVar) {
        boolean z10 = false;
        for (Fragment fragment : fragmentManager.f1726c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z10 |= markState(fragment.getChildFragmentManager(), cVar);
                }
                f0 f0Var = fragment.mViewLifecycleOwner;
                i.c cVar2 = i.c.STARTED;
                if (f0Var != null) {
                    f0Var.b();
                    if (f0Var.f1812t.f1984b.a(cVar2)) {
                        androidx.lifecycle.n nVar = fragment.mViewLifecycleOwner.f1812t;
                        nVar.e("setCurrentState");
                        nVar.g(cVar);
                        z10 = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f1984b.a(cVar2)) {
                    androidx.lifecycle.n nVar2 = fragment.mLifecycleRegistry;
                    nVar2.e("setCurrentState");
                    nVar2.g(cVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f1862a.f1867v.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            c1.a.a(this).b(str2, printWriter);
        }
        this.mFragments.f1862a.f1867v.t(str, fileDescriptor, printWriter, strArr);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f1862a.f1867v;
    }

    @Deprecated
    public c1.a getSupportLoaderManager() {
        return c1.a.a(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), i.c.CREATED));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.a();
        super.onConfigurationChanged(configuration);
        this.mFragments.f1862a.f1867v.h(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(i.b.ON_CREATE);
        t tVar = this.mFragments.f1862a.f1867v;
        tVar.A = false;
        tVar.B = false;
        tVar.H.f1880i = false;
        tVar.s(1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i10, menu);
            o oVar = this.mFragments;
            return onCreatePanelMenu | oVar.f1862a.f1867v.j(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i10, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f1862a.f1867v.k();
        this.mFragmentLifecycleRegistry.f(i.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.f1862a.f1867v.l();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            if (i10 != 6) {
                return false;
            }
            return this.mFragments.f1862a.f1867v.i(menuItem);
        }
        return this.mFragments.f1862a.f1867v.n(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        this.mFragments.f1862a.f1867v.m(z10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.mFragments.a();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.mFragments.f1862a.f1867v.o(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f1862a.f1867v.s(5);
        this.mFragmentLifecycleRegistry.f(i.b.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        this.mFragments.f1862a.f1867v.q(z10);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.f1862a.f1867v.r(menu);
        }
        return super.onPreparePanel(i10, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f1862a.f1867v.w(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(i.b.ON_RESUME);
        t tVar = this.mFragments.f1862a.f1867v;
        tVar.A = false;
        tVar.B = false;
        tVar.H.f1880i = false;
        tVar.s(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            t tVar = this.mFragments.f1862a.f1867v;
            tVar.A = false;
            tVar.B = false;
            tVar.H.f1880i = false;
            tVar.s(4);
        }
        this.mFragments.f1862a.f1867v.w(true);
        this.mFragmentLifecycleRegistry.f(i.b.ON_START);
        t tVar2 = this.mFragments.f1862a.f1867v;
        tVar2.A = false;
        tVar2.B = false;
        tVar2.H.f1880i = false;
        tVar2.s(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        t tVar = this.mFragments.f1862a.f1867v;
        tVar.B = true;
        tVar.H.f1880i = true;
        tVar.s(4);
        this.mFragmentLifecycleRegistry.f(i.b.ON_STOP);
    }

    public void setEnterSharedElementCallback(b0.z zVar) {
        int i10 = b0.a.f2696c;
        a.b.c(this, null);
    }

    public void setExitSharedElementCallback(b0.z zVar) {
        int i10 = b0.a.f2696c;
        a.b.d(this, null);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            int i14 = b0.a.f2696c;
            a.C0028a.c(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        int i10 = b0.a.f2696c;
        a.b.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        int i10 = b0.a.f2696c;
        a.b.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i10 = b0.a.f2696c;
        a.b.e(this);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            int i11 = b0.a.f2696c;
            a.C0028a.b(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i10) {
        super(i10);
        this.mFragments = new o(new c());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.n(this);
        this.mStopped = true;
        init();
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // b0.a.d
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
