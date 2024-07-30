package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.g0;
import androidx.lifecycle.i;
import b0.a;
import c1.b;
import com.hamkho.livefoot.R;
import d0.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.m, androidx.lifecycle.j0, androidx.lifecycle.g, i1.d {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    i mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    g0.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    q<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.n mLifecycleRegistry;
    i.c mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<k> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    i1.c mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    f0 mViewLifecycleOwner;
    androidx.lifecycle.q<androidx.lifecycle.m> mViewLifecycleOwnerLiveData;
    String mWho;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ j0 f1688s;

        public c(j0 j0Var) {
            this.f1688s = j0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f1688s.c();
        }
    }

    /* loaded from: classes.dex */
    public class d extends n {
        public d() {
        }

        @Override // androidx.fragment.app.n
        public final View b(int i10) {
            Fragment fragment = Fragment.this;
            View view = fragment.mView;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a view");
        }

        @Override // androidx.fragment.app.n
        public final boolean c() {
            if (Fragment.this.mView != null) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class e implements l.a<Void, androidx.activity.result.e> {
        public e() {
        }

        @Override // l.a
        public final Object apply() {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            if (obj instanceof androidx.activity.result.f) {
                return ((androidx.activity.result.f) obj).getActivityResultRegistry();
            }
            return fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* loaded from: classes.dex */
    public class f implements l.a<Void, androidx.activity.result.e> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.e f1691a;

        public f(androidx.activity.result.e eVar) {
            this.f1691a = eVar;
        }

        @Override // l.a
        public final Object apply() {
            return this.f1691a;
        }
    }

    /* loaded from: classes.dex */
    public class g extends k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l.a f1692a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f1693b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e.a f1694c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.a f1695d;

        public g(l.a aVar, AtomicReference atomicReference, e.a aVar2, androidx.activity.result.a aVar3) {
            this.f1692a = aVar;
            this.f1693b = atomicReference;
            this.f1694c = aVar2;
            this.f1695d = aVar3;
        }

        @Override // androidx.fragment.app.Fragment.k
        public final void a() {
            Fragment fragment = Fragment.this;
            this.f1693b.set(((androidx.activity.result.e) this.f1692a.apply()).c(fragment.generateActivityResultKey(), fragment, this.f1694c, this.f1695d));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class h<I> extends androidx.activity.result.b<I> {
        public h(AtomicReference atomicReference) {
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public View f1697a;

        /* renamed from: b, reason: collision with root package name */
        public Animator f1698b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1699c;

        /* renamed from: d, reason: collision with root package name */
        public int f1700d;

        /* renamed from: e, reason: collision with root package name */
        public int f1701e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f1702g;

        /* renamed from: h, reason: collision with root package name */
        public int f1703h;

        /* renamed from: i, reason: collision with root package name */
        public ArrayList<String> f1704i;

        /* renamed from: j, reason: collision with root package name */
        public ArrayList<String> f1705j;

        /* renamed from: k, reason: collision with root package name */
        public Object f1706k = null;

        /* renamed from: l, reason: collision with root package name */
        public Object f1707l;

        /* renamed from: m, reason: collision with root package name */
        public Object f1708m;

        /* renamed from: n, reason: collision with root package name */
        public Object f1709n;
        public Object o;

        /* renamed from: p, reason: collision with root package name */
        public Object f1710p;

        /* renamed from: q, reason: collision with root package name */
        public Boolean f1711q;

        /* renamed from: r, reason: collision with root package name */
        public Boolean f1712r;

        /* renamed from: s, reason: collision with root package name */
        public float f1713s;

        /* renamed from: t, reason: collision with root package name */
        public View f1714t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f1715u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f1716v;

        public i() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f1707l = obj;
            this.f1708m = null;
            this.f1709n = obj;
            this.o = null;
            this.f1710p = obj;
            this.f1713s = 1.0f;
            this.f1714t = null;
        }
    }

    /* loaded from: classes.dex */
    public static class j extends RuntimeException {
        public j(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {
        public abstract void a();
    }

    /* loaded from: classes.dex */
    public interface l {
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new t();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new a();
        this.mMaxState = i.c.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.q<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    private i ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new i();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        i.c cVar = this.mMaxState;
        if (cVar != i.c.INITIALIZED && this.mParentFragment != null) {
            return Math.min(cVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
        }
        return cVar.ordinal();
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.n(this);
        this.mSavedStateRegistryController = new i1.c(this);
        this.mDefaultFactory = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private <I, O> androidx.activity.result.b<I> prepareCallInternal(e.a<I, O> aVar, l.a<Void, androidx.activity.result.e> aVar2, androidx.activity.result.a<O> aVar3) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new g(aVar2, atomicReference, aVar, aVar3));
            return new h(atomicReference);
        }
        throw new IllegalStateException(a3.l.l("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    private void registerOnPreAttachListener(k kVar) {
        if (this.mState >= 0) {
            kVar.a();
        } else {
            this.mOnPreAttachedListeners.add(kVar);
        }
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        i iVar = this.mAnimationInfo;
        if (iVar != null) {
            iVar.f1715u = false;
            iVar.getClass();
            iVar.getClass();
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            j0 g6 = j0.g(viewGroup, fragmentManager.F());
            g6.h();
            if (z10) {
                this.mHost.f1866u.post(new c(g6));
            } else {
                g6.c();
            }
        }
    }

    public n createFragmentContainer() {
        return new d();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            c1.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + com.huawei.openalliance.ad.constant.w.bE);
        this.mChildFragmentManager.t(com.ironsource.adapters.facebook.a.h(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.f1726c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final FragmentActivity getActivity() {
        q<?> qVar = this.mHost;
        if (qVar == null) {
            return null;
        }
        return (FragmentActivity) qVar.f1864s;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar != null && (bool = iVar.f1712r) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar != null && (bool = iVar.f1711q) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public View getAnimatingAway() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f1697a;
    }

    public Animator getAnimator() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f1698b;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(a3.l.l("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        q<?> qVar = this.mHost;
        if (qVar == null) {
            return null;
        }
        return qVar.f1865t;
    }

    public g0.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && FragmentManager.H(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new androidx.lifecycle.b0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f1700d;
    }

    public Object getEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f1706k;
    }

    public b0.z getEnterTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        iVar.getClass();
        return null;
    }

    public int getExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f1701e;
    }

    public Object getExitTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f1708m;
    }

    public b0.z getExitTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        iVar.getClass();
        return null;
    }

    public View getFocusedView() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f1714t;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        q<?> qVar = this.mHost;
        if (qVar == null) {
            return null;
        }
        return qVar.e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.m
    public androidx.lifecycle.i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public c1.a getLoaderManager() {
        return c1.a.a(this);
    }

    public int getNextTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f1703h;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(a3.l.l("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f1699c;
    }

    public int getPopEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f;
    }

    public int getPopExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f1702g;
    }

    public float getPostOnViewCreatedAlpha() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.f1713s;
    }

    public Object getReenterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f1709n;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f1707l;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    @Override // i1.d
    public final i1.b getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f29034b;
    }

    public Object getSharedElementEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.o;
    }

    public Object getSharedElementReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f1710p;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        if (iVar != null && (arrayList = iVar.f1704i) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        if (iVar != null && (arrayList = iVar.f1705j) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null && (str = this.mTargetWho) != null) {
            return fragmentManager.z(str);
        }
        return null;
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.m getViewLifecycleOwner() {
        f0 f0Var = this.mViewLifecycleOwner;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<androidx.lifecycle.m> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.j0
    public androidx.lifecycle.i0 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (getMinimumMaxLifecycleState() != 1) {
                HashMap<String, androidx.lifecycle.i0> hashMap = this.mFragmentManager.H.f;
                androidx.lifecycle.i0 i0Var = hashMap.get(this.mWho);
                if (i0Var == null) {
                    androidx.lifecycle.i0 i0Var2 = new androidx.lifecycle.i0();
                    hashMap.put(this.mWho, i0Var2);
                    return i0Var2;
                }
                return i0Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new t();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        if (this.mHost != null && this.mAdded) {
            return true;
        }
        return false;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public boolean isHideReplaced() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f1716v;
    }

    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        boolean isMenuVisible;
        if (this.mMenuVisible) {
            if (this.mFragmentManager == null) {
                return true;
            }
            Fragment fragment = this.mParentFragment;
            if (fragment == null) {
                isMenuVisible = true;
            } else {
                isMenuVisible = fragment.isMenuVisible();
            }
            if (isMenuVisible) {
                return true;
            }
        }
        return false;
    }

    public boolean isPostponed() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f1715u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent())) {
            return true;
        }
        return false;
    }

    public final boolean isResumed() {
        if (this.mState >= 7) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.K();
    }

    public final boolean isVisible() {
        View view;
        if (isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.M();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (FragmentManager.H(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        q<?> qVar = this.mHost;
        Activity activity = qVar == null ? null : qVar.f1864s;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        boolean z10;
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.o >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            fragmentManager.A = false;
            fragmentManager.B = false;
            fragmentManager.H.f1880i = false;
            fragmentManager.s(1);
        }
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        q<?> qVar = this.mHost;
        Activity activity = qVar == null ? null : qVar.f1864s;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.M();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.A = false;
            fragmentManager.B = false;
            fragmentManager.H.f1880i = false;
            fragmentManager.s(4);
            return;
        }
        throw new m0(a3.l.l("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        Iterator<k> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f1865t);
        if (this.mCalled) {
            Iterator<v> it2 = this.mFragmentManager.f1736n.iterator();
            while (it2.hasNext()) {
                it2.next().a(this);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.A = false;
            fragmentManager.B = false;
            fragmentManager.H.f1880i = false;
            fragmentManager.s(0);
            return;
        }
        throw new m0(a3.l.l("Fragment ", this, " did not call through to super.onAttach()"));
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.h(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.i(menuItem);
        }
        return false;
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.M();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new androidx.lifecycle.k() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.k
            public final void c(androidx.lifecycle.m mVar, i.b bVar) {
                View view;
                if (bVar == i.b.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        this.mSavedStateRegistryController.b(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.f(i.b.ON_CREATE);
            return;
        }
        throw new m0(a3.l.l("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.j(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.M();
        boolean z10 = true;
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new f0(getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.b();
            this.mView.setTag(R.id.view_tree_lifecycle_owner, this.mViewLifecycleOwner);
            this.mView.setTag(R.id.view_tree_view_model_store_owner, this.mViewLifecycleOwner);
            View view = this.mView;
            f0 f0Var = this.mViewLifecycleOwner;
            zc.d.d(view, "<this>");
            view.setTag(R.id.view_tree_saved_state_registry_owner, f0Var);
            this.mViewLifecycleOwnerLiveData.h(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.f1812t == null) {
            z10 = false;
        }
        if (!z10) {
            this.mViewLifecycleOwner = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void performDestroy() {
        this.mChildFragmentManager.k();
        this.mLifecycleRegistry.f(i.b.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
        } else {
            throw new m0(a3.l.l("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.s(1);
        if (this.mView != null) {
            f0 f0Var = this.mViewLifecycleOwner;
            f0Var.b();
            if (f0Var.f1812t.f1984b.a(i.c.CREATED)) {
                this.mViewLifecycleOwner.a(i.b.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            q.j<b.a> jVar = c1.a.a(this).f3197b.f3199d;
            int i10 = jVar.f34551u;
            for (int i11 = 0; i11 < i10; i11++) {
                ((b.a) jVar.f34550t[i11]).getClass();
            }
            this.mPerformedCreateView = false;
            return;
        }
        throw new m0(a3.l.l("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            FragmentManager fragmentManager = this.mChildFragmentManager;
            if (!fragmentManager.C) {
                fragmentManager.k();
                this.mChildFragmentManager = new t();
                return;
            }
            return;
        }
        throw new m0(a3.l.l("Fragment ", this, " did not call through to super.onDetach()"));
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.l();
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
        this.mChildFragmentManager.m(z10);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.n(menuItem);
        }
        return false;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.o(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.s(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(i.b.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(i.b.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
        } else {
            throw new m0(a3.l.l("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
        this.mChildFragmentManager.q(z10);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.r(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean J = FragmentManager.J(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != J) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(J);
            onPrimaryNavigationFragmentChanged(J);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.e0();
            fragmentManager.p(fragmentManager.f1740s);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.M();
        this.mChildFragmentManager.w(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            androidx.lifecycle.n nVar = this.mLifecycleRegistry;
            i.b bVar = i.b.ON_RESUME;
            nVar.f(bVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(bVar);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.A = false;
            fragmentManager.B = false;
            fragmentManager.H.f1880i = false;
            fragmentManager.s(7);
            return;
        }
        throw new m0(a3.l.l("Fragment ", this, " did not call through to super.onResume()"));
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
        Parcelable T = this.mChildFragmentManager.T();
        if (T != null) {
            bundle.putParcelable("android:support:fragments", T);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.M();
        this.mChildFragmentManager.w(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            androidx.lifecycle.n nVar = this.mLifecycleRegistry;
            i.b bVar = i.b.ON_START;
            nVar.f(bVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(bVar);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.A = false;
            fragmentManager.B = false;
            fragmentManager.H.f1880i = false;
            fragmentManager.s(5);
            return;
        }
        throw new m0(a3.l.l("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.B = true;
        fragmentManager.H.f1880i = true;
        fragmentManager.s(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(i.b.ON_STOP);
        }
        this.mLifecycleRegistry.f(i.b.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
        } else {
            throw new m0(a3.l.l("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.s(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f1715u = true;
    }

    public final <I, O> androidx.activity.result.b<I> registerForActivityResult(e.a<I, O> aVar, androidx.activity.result.a<O> aVar2) {
        return prepareCallInternal(aVar, new e(), aVar2);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i10) {
        if (this.mHost != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f1745x != null) {
                parentFragmentManager.y.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i10));
                parentFragmentManager.f1745x.a(strArr);
                return;
            }
            parentFragmentManager.f1737p.getClass();
            return;
        }
        throw new IllegalStateException(a3.l.l("Fragment ", this, " not attached to Activity"));
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(a3.l.l("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(a3.l.l("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(a3.l.l("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(a3.l.l("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException(a3.l.l("Fragment ", this, " is not attached to any Fragment or host"));
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a3.l.l("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.S(parcelable);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.A = false;
            fragmentManager.B = false;
            fragmentManager.H.f1880i = false;
            fragmentManager.s(1);
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            f0 f0Var = this.mViewLifecycleOwner;
            f0Var.f1813u.b(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(i.b.ON_CREATE);
                return;
            }
            return;
        }
        throw new m0(a3.l.l("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f1712r = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f1711q = Boolean.valueOf(z10);
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f1697a = view;
    }

    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        ensureAnimationInfo().f1700d = i10;
        ensureAnimationInfo().f1701e = i11;
        ensureAnimationInfo().f = i12;
        ensureAnimationInfo().f1702g = i13;
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f1698b = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(b0.z zVar) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f1706k = obj;
    }

    public void setExitSharedElementCallback(b0.z zVar) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f1708m = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f1714t = view;
    }

    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (isAdded() && !isHidden()) {
                this.mHost.h();
            }
        }
    }

    public void setHideReplaced(boolean z10) {
        ensureAnimationInfo().f1716v = z10;
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (savedState == null || (bundle = savedState.f1685s) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.h();
            }
        }
    }

    public void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f1703h = i10;
    }

    public void setOnStartEnterTransitionListener(l lVar) {
        ensureAnimationInfo();
        i iVar = this.mAnimationInfo;
        iVar.getClass();
        if (lVar == null) {
            return;
        }
        if (iVar.f1715u) {
            iVar.getClass();
        }
        if (lVar != null) {
            ((FragmentManager.n) lVar).f1759a++;
        }
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f1699c = z10;
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        ensureAnimationInfo().f1713s = f10;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f1709n = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        this.mRetainInstance = z10;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            if (z10) {
                fragmentManager.H.c(this);
                return;
            } else {
                fragmentManager.H.d(this);
                return;
            }
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f1707l = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().o = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        i iVar = this.mAnimationInfo;
        iVar.f1704i = arrayList;
        iVar.f1705j = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f1710p = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i10) {
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2 = this.mFragmentManager;
        if (fragment != null) {
            fragmentManager = fragment.mFragmentManager;
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 != null && fragmentManager != null && fragmentManager2 != fragmentManager) {
            throw new IllegalArgumentException(a3.l.l("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment()) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = fragment;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        boolean z11 = true;
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            w f10 = fragmentManager.f(this);
            Fragment fragment = f10.f1883c;
            if (fragment.mDeferStart) {
                if (fragmentManager.f1725b) {
                    fragmentManager.D = true;
                } else {
                    fragment.mDeferStart = false;
                    f10.k();
                }
            }
        }
        this.mUserVisibleHint = z10;
        if (this.mState >= 5 || z10) {
            z11 = false;
        }
        this.mDeferStart = z11;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        q<?> qVar = this.mHost;
        if (qVar != null) {
            return qVar.g(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2 = intent;
        if (this.mHost != null) {
            if (FragmentManager.H(2)) {
                Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
            }
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f1744w != null) {
                if (bundle != null) {
                    if (intent2 == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    }
                    if (FragmentManager.H(2)) {
                        Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i11, i12);
                parentFragmentManager.y.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i10));
                if (FragmentManager.H(2)) {
                    Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
                }
                parentFragmentManager.f1744w.a(intentSenderRequest);
                return;
            }
            q<?> qVar = parentFragmentManager.f1737p;
            if (i10 == -1) {
                Activity activity = qVar.f1864s;
                int i14 = b0.a.f2696c;
                a.C0028a.c(activity, intentSender, i10, intent, i11, i12, i13, bundle);
                return;
            }
            qVar.getClass();
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(a3.l.l("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().f1715u) {
            if (this.mHost == null) {
                ensureAnimationInfo().f1715u = false;
            } else if (Looper.myLooper() != this.mHost.f1866u.getLooper()) {
                this.mHost.f1866u.postAtFrontOfQueue(new b());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public final Bundle f1685s;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Bundle bundle) {
            this.f1685s = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f1685s);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f1685s = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = p.b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new j(a3.k.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new j(a3.k.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new j(a3.k.l("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new j(a3.k.l("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j10, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().f1715u = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.f1737p.f1866u;
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    public final <I, O> androidx.activity.result.b<I> registerForActivityResult(e.a<I, O> aVar, androidx.activity.result.e eVar, androidx.activity.result.a<O> aVar2) {
        return prepareCallInternal(aVar, new f(eVar), aVar2);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        q<?> qVar = this.mHost;
        if (qVar != null) {
            Object obj = d0.a.f27248a;
            a.C0353a.b(qVar.f1865t, intent, bundle);
            return;
        }
        throw new IllegalStateException(a3.l.l("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (this.mHost != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f1743v != null) {
                parentFragmentManager.y.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i10));
                if (intent != null && bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.f1743v.a(intent);
                return;
            }
            q<?> qVar = parentFragmentManager.f1737p;
            qVar.getClass();
            if (i10 == -1) {
                Object obj = d0.a.f27248a;
                a.C0353a.b(qVar.f1865t, intent, bundle);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(a3.l.l("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        q<?> qVar = this.mHost;
        if (qVar != null) {
            LayoutInflater f10 = qVar.f();
            f10.setFactory2(this.mChildFragmentManager.f);
            return f10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    private void restoreViewState() {
        if (FragmentManager.H(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onHiddenChanged(boolean z10) {
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }
}
