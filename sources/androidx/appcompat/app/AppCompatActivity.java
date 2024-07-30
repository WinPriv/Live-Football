package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.q;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.t0;
import androidx.fragment.app.FragmentActivity;
import b0.a;
import b0.a0;
import b0.k;
import com.hamkho.livefoot.R;
import d0.a;
import i.a;
import i1.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements e, a0.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private g mDelegate;
    private Resources mResources;

    /* loaded from: classes.dex */
    public class a implements b.InterfaceC0395b {
        public a() {
        }

        @Override // i1.b.InterfaceC0395b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.getDelegate().s();
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public class b implements d.b {
        public b() {
        }

        @Override // d.b
        public final void a(Context context) {
            AppCompatActivity appCompatActivity = AppCompatActivity.this;
            g delegate = appCompatActivity.getDelegate();
            delegate.k();
            appCompatActivity.getSavedStateRegistry().a(AppCompatActivity.DELEGATE_TAG);
            delegate.o();
        }
    }

    public AppCompatActivity() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().c(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView = getWindow().getDecorView();
        zc.d.d(decorView, "<this>");
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView2 = getWindow().getDecorView();
        zc.d.d(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().d(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) getDelegate().e(i10);
    }

    public g getDelegate() {
        if (this.mDelegate == null) {
            q.a aVar = g.f650s;
            this.mDelegate = new AppCompatDelegateImpl(this, null, this, this);
        }
        return this.mDelegate;
    }

    public androidx.appcompat.app.b getDrawerToggleDelegate() {
        return getDelegate().g();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().i();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i10 = t0.f1272a;
        }
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public androidx.appcompat.app.a getSupportActionBar() {
        return getDelegate().j();
    }

    @Override // b0.a0.a
    public Intent getSupportParentActivityIntent() {
        return b0.k.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().l();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().n(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(a0 a0Var) {
        a0Var.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = b0.k.a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            Context context = a0Var.f2698t;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(context.getPackageManager());
            }
            ArrayList<Intent> arrayList = a0Var.f2697s;
            int size = arrayList.size();
            try {
                for (Intent b10 = b0.k.b(context, component); b10 != null; b10 = b0.k.b(context, b10.getComponent())) {
                    arrayList.add(size, b10);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e10);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().p();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.d() & 4) != 0) {
            return onSupportNavigateUp();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().q();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().r();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().t();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().u();
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            a0 a0Var = new a0(this);
            onCreateSupportNavigateUpTaskStack(a0Var);
            onPrepareSupportNavigateUpTaskStack(a0Var);
            ArrayList<Intent> arrayList = a0Var.f2697s;
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Object obj = d0.a.f27248a;
                a.C0353a.a(a0Var.f2698t, intentArr, null);
                try {
                    int i10 = b0.a.f2696c;
                    a.C0028a.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        supportNavigateUpTo(supportParentActivityIntent);
        return true;
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().C(charSequence);
    }

    @Override // androidx.appcompat.app.e
    public i.a onWindowStartingSupportActionMode(a.InterfaceC0394a interfaceC0394a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        getDelegate().x(i10);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().A(toolbar);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        getDelegate().B(i10);
    }

    public i.a startSupportActionMode(a.InterfaceC0394a interfaceC0394a) {
        return getDelegate().D(interfaceC0394a);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().l();
    }

    public void supportNavigateUpTo(Intent intent) {
        k.a.b(this, intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().w(i10);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return k.a.c(this, intent);
    }

    public AppCompatActivity(int i10) {
        super(i10);
        initDelegate();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().y(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().z(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(j0.f fVar) {
    }

    public void onNightModeChanged(int i10) {
    }

    public void onPrepareSupportNavigateUpTaskStack(a0 a0Var) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(i.a aVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(i.a aVar) {
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }
}
