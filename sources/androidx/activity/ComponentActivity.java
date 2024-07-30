package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.b0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import b0.a;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.w;
import e.a;
import i1.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import n0.j;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements j0, androidx.lifecycle.g, i1.d, m, androidx.activity.result.f {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final androidx.activity.result.e mActivityResultRegistry;
    private int mContentLayoutId;
    final d.a mContextAwareHelper;
    private g0.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    private final androidx.lifecycle.n mLifecycleRegistry;
    private final n0.j mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<m0.a<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<m0.a<b0.j>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<m0.a<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<m0.a<n>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<m0.a<Integer>> mOnTrimMemoryListeners;
    final i1.c mSavedStateRegistryController;
    private i0 mViewModelStore;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                } else {
                    throw e10;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.activity.result.e {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.activity.result.e
        public final void b(int i10, e.a aVar, Object obj) {
            Bundle bundle;
            String[] strArr;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0364a b10 = aVar.b(componentActivity, obj);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new e(this, i10, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, obj);
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                int i11 = b0.a.f2696c;
                HashSet hashSet = new HashSet();
                for (int i12 = 0; i12 < stringArrayExtra.length; i12++) {
                    if (!TextUtils.isEmpty(stringArrayExtra[i12])) {
                        if (!j0.a.c() && TextUtils.equals(stringArrayExtra[i12], w.cx)) {
                            hashSet.add(Integer.valueOf(i12));
                        }
                    } else {
                        throw new IllegalArgumentException(a3.l.p(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    }
                }
                int size = hashSet.size();
                if (size > 0) {
                    strArr = new String[stringArrayExtra.length - size];
                } else {
                    strArr = stringArrayExtra;
                }
                if (size > 0) {
                    if (size != stringArrayExtra.length) {
                        int i13 = 0;
                        for (int i14 = 0; i14 < stringArrayExtra.length; i14++) {
                            if (!hashSet.contains(Integer.valueOf(i14))) {
                                strArr[i13] = stringArrayExtra[i14];
                                i13++;
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (componentActivity instanceof a.d) {
                    ((a.d) componentActivity).validateRequestPermissionsRequestCode(i10);
                }
                a.c.b(componentActivity, stringArrayExtra, i10);
                return;
            }
            if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = intentSenderRequest.f527s;
                    Intent intent = intentSenderRequest.f528t;
                    int i15 = intentSenderRequest.f529u;
                    int i16 = intentSenderRequest.f530v;
                    int i17 = b0.a.f2696c;
                    a.C0028a.c(componentActivity, intentSender, i10, intent, i15, i16, 0, bundle);
                    return;
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new f(this, i10, e10));
                    return;
                }
            }
            int i18 = b0.a.f2696c;
            a.C0028a.b(componentActivity, a10, i10, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public Object f456a;

        /* renamed from: b, reason: collision with root package name */
        public i0 f457b;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new d.a();
        this.mMenuHostHelper = new n0.j(new androidx.activity.b(this, 0));
        this.mLifecycleRegistry = new androidx.lifecycle.n(this);
        i1.c cVar = new i1.c(this);
        this.mSavedStateRegistryController = cVar;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            getLifecycle().a(new androidx.lifecycle.k() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.k
                public final void c(androidx.lifecycle.m mVar, i.b bVar) {
                    View view;
                    if (bVar == i.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().a(new androidx.lifecycle.k() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.k
                public final void c(androidx.lifecycle.m mVar, i.b bVar) {
                    if (bVar == i.b.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.f27247b = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                    }
                }
            });
            getLifecycle().a(new androidx.lifecycle.k() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.k
                public final void c(androidx.lifecycle.m mVar, i.b bVar) {
                    ComponentActivity componentActivity = ComponentActivity.this;
                    componentActivity.ensureViewModelStore();
                    componentActivity.getLifecycle().c(this);
                }
            });
            cVar.a();
            i.c b10 = getLifecycle().b();
            zc.d.c(b10, "lifecycle.currentState");
            if (((b10 == i.c.INITIALIZED || b10 == i.c.CREATED) ? 1 : 0) != 0) {
                if (getSavedStateRegistry().b() == null) {
                    z zVar = new z(getSavedStateRegistry(), this);
                    getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", zVar);
                    getLifecycle().a(new SavedStateHandleAttacher(zVar));
                }
                getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new b.InterfaceC0395b() { // from class: androidx.activity.c
                    @Override // i1.b.InterfaceC0395b
                    public final Bundle a() {
                        Bundle lambda$new$0;
                        lambda$new$0 = ComponentActivity.this.lambda$new$0();
                        return lambda$new$0;
                    }
                });
                addOnContextAvailableListener(new d.b() { // from class: androidx.activity.d
                    @Override // d.b
                    public final void a(Context context) {
                        ComponentActivity.this.lambda$new$1(context);
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
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

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle lambda$new$0() {
        Bundle bundle = new Bundle();
        androidx.activity.result.e eVar = this.mActivityResultRegistry;
        eVar.getClass();
        HashMap hashMap = eVar.f536c;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(eVar.f538e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) eVar.f540h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", eVar.f534a);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$1(Context context) {
        Bundle a10 = getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a10 != null) {
            androidx.activity.result.e eVar = this.mActivityResultRegistry;
            eVar.getClass();
            ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                eVar.f538e = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                eVar.f534a = (Random) a10.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                Bundle bundle = a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = eVar.f540h;
                bundle2.putAll(bundle);
                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                    String str = stringArrayList.get(i10);
                    HashMap hashMap = eVar.f536c;
                    boolean containsKey = hashMap.containsKey(str);
                    HashMap hashMap2 = eVar.f535b;
                    if (containsKey) {
                        Integer num = (Integer) hashMap.remove(str);
                        if (!bundle2.containsKey(str)) {
                            hashMap2.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i10).intValue();
                    String str2 = stringArrayList.get(i10);
                    hashMap2.put(Integer.valueOf(intValue), str2);
                    hashMap.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(n0.m mVar) {
        n0.j jVar = this.mMenuHostHelper;
        jVar.f33085b.add(mVar);
        jVar.f33084a.run();
    }

    public final void addOnConfigurationChangedListener(m0.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(d.b bVar) {
        d.a aVar = this.mContextAwareHelper;
        if (aVar.f27247b != null) {
            bVar.a(aVar.f27247b);
        }
        aVar.f27246a.add(bVar);
    }

    public final void addOnMultiWindowModeChangedListener(m0.a<b0.j> aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(m0.a<Intent> aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(m0.a<n> aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(m0.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.mViewModelStore = dVar.f457b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new i0();
            }
        }
    }

    @Override // androidx.activity.result.f
    public final androidx.activity.result.e getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.g
    public b1.a getDefaultViewModelCreationExtras() {
        b1.d dVar = new b1.d();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f2797a;
        if (application != null) {
            linkedHashMap.put(f0.f1965a, getApplication());
        }
        linkedHashMap.put(y.f2011a, this);
        linkedHashMap.put(y.f2012b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(y.f2013c, getIntent().getExtras());
        }
        return dVar;
    }

    public g0.b getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new b0(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.f456a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.m
    public androidx.lifecycle.i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.m
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // i1.d
    public final i1.b getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f29034b;
    }

    @Override // androidx.lifecycle.j0
    public i0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.mActivityResultRegistry.a(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<m0.a<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        d.a aVar = this.mContextAwareHelper;
        aVar.f27247b = this;
        Iterator it = aVar.f27246a.iterator();
        while (it.hasNext()) {
            ((d.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        v.c(this);
        if (j0.a.c()) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.mOnBackPressedDispatcher;
            onBackPressedDispatcher.f463e = c.a(this);
            onBackPressedDispatcher.c();
        }
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            super.onCreatePanelMenu(i10, menu);
            n0.j jVar = this.mMenuHostHelper;
            getMenuInflater();
            Iterator<n0.m> it = jVar.f33085b.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            return false;
        }
        Iterator<n0.m> it = this.mMenuHostHelper.f33085b.iterator();
        while (it.hasNext()) {
            if (it.next().b()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<m0.a<b0.j>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new b0.j(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<m0.a<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Iterator<n0.m> it = this.mMenuHostHelper.f33085b.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<m0.a<n>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new n());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            super.onPreparePanel(i10, view, menu);
            Iterator<n0.m> it = this.mMenuHostHelper.f33085b.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        i0 i0Var = this.mViewModelStore;
        if (i0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            i0Var = dVar.f457b;
        }
        if (i0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f456a = onRetainCustomNonConfigurationInstance;
        dVar2.f457b = i0Var;
        return dVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.i lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.n) {
            androidx.lifecycle.n nVar = (androidx.lifecycle.n) lifecycle;
            i.c cVar = i.c.CREATED;
            nVar.e("setCurrentState");
            nVar.g(cVar);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<m0.a<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f27247b;
    }

    public final <I, O> androidx.activity.result.b<I> registerForActivityResult(e.a<I, O> aVar, androidx.activity.result.e eVar, androidx.activity.result.a<O> aVar2) {
        return eVar.c("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, aVar2);
    }

    public void removeMenuProvider(n0.m mVar) {
        this.mMenuHostHelper.a(mVar);
    }

    public final void removeOnConfigurationChangedListener(m0.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(d.b bVar) {
        this.mContextAwareHelper.f27246a.remove(bVar);
    }

    public final void removeOnMultiWindowModeChangedListener(m0.a<b0.j> aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(m0.a<Intent> aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(m0.a<n> aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(m0.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (m1.a.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<m0.a<b0.j>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new b0.j(z10, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        int i10 = 0;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<m0.a<n>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new n(i10));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final <I, O> androidx.activity.result.b<I> registerForActivityResult(e.a<I, O> aVar, androidx.activity.result.a<O> aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    public void addMenuProvider(final n0.m mVar, androidx.lifecycle.m mVar2) {
        final n0.j jVar = this.mMenuHostHelper;
        jVar.f33085b.add(mVar);
        jVar.f33084a.run();
        androidx.lifecycle.i lifecycle = mVar2.getLifecycle();
        HashMap hashMap = jVar.f33086c;
        j.a aVar = (j.a) hashMap.remove(mVar);
        if (aVar != null) {
            aVar.f33087a.c(aVar.f33088b);
            aVar.f33088b = null;
        }
        hashMap.put(mVar, new j.a(lifecycle, new androidx.lifecycle.k() { // from class: n0.h
            @Override // androidx.lifecycle.k
            public final void c(androidx.lifecycle.m mVar3, i.b bVar) {
                i.b bVar2 = i.b.ON_DESTROY;
                j jVar2 = j.this;
                if (bVar == bVar2) {
                    jVar2.a(mVar);
                } else {
                    jVar2.getClass();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final n0.m mVar, androidx.lifecycle.m mVar2, final i.c cVar) {
        final n0.j jVar = this.mMenuHostHelper;
        jVar.getClass();
        androidx.lifecycle.i lifecycle = mVar2.getLifecycle();
        HashMap hashMap = jVar.f33086c;
        j.a aVar = (j.a) hashMap.remove(mVar);
        if (aVar != null) {
            aVar.f33087a.c(aVar.f33088b);
            aVar.f33088b = null;
        }
        hashMap.put(mVar, new j.a(lifecycle, new androidx.lifecycle.k() { // from class: n0.i
            @Override // androidx.lifecycle.k
            public final void c(androidx.lifecycle.m mVar3, i.b bVar) {
                i.b bVar2;
                j jVar2 = j.this;
                jVar2.getClass();
                i.c cVar2 = cVar;
                int ordinal = cVar2.ordinal();
                i.b bVar3 = null;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            bVar2 = null;
                        } else {
                            bVar2 = i.b.ON_RESUME;
                        }
                    } else {
                        bVar2 = i.b.ON_START;
                    }
                } else {
                    bVar2 = i.b.ON_CREATE;
                }
                Runnable runnable = jVar2.f33084a;
                CopyOnWriteArrayList<m> copyOnWriteArrayList = jVar2.f33085b;
                m mVar4 = mVar;
                if (bVar == bVar2) {
                    copyOnWriteArrayList.add(mVar4);
                    runnable.run();
                    return;
                }
                i.b bVar4 = i.b.ON_DESTROY;
                if (bVar == bVar4) {
                    jVar2.a(mVar4);
                    return;
                }
                int ordinal2 = cVar2.ordinal();
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        if (ordinal2 == 4) {
                            bVar3 = i.b.ON_PAUSE;
                        }
                    } else {
                        bVar3 = i.b.ON_STOP;
                    }
                } else {
                    bVar3 = bVar4;
                }
                if (bVar == bVar3) {
                    copyOnWriteArrayList.remove(mVar4);
                    runnable.run();
                }
            }
        }));
    }

    public ComponentActivity(int i10) {
        this();
        this.mContentLayoutId = i10;
    }
}
