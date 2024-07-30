package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.j0;
import androidx.lifecycle.i;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.c0;

/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final s f1881a;

    /* renamed from: b, reason: collision with root package name */
    public final x f1882b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f1883c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1884d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1885e = -1;

    public w(s sVar, x xVar, Fragment fragment) {
        this.f1881a = sVar;
        this.f1882b = xVar;
        this.f1883c = fragment;
    }

    public final void a() {
        boolean H = FragmentManager.H(3);
        Fragment fragment = this.f1883c;
        if (H) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        this.f1881a.a(false);
    }

    public final void b() {
        View view;
        View view2;
        x xVar = this.f1882b;
        xVar.getClass();
        Fragment fragment = this.f1883c;
        ViewGroup viewGroup = fragment.mContainer;
        int i10 = -1;
        if (viewGroup != null) {
            ArrayList<Fragment> arrayList = xVar.f1887a;
            int indexOf = arrayList.indexOf(fragment);
            int i11 = indexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = arrayList.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i10 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = arrayList.get(i11);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i10 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, i10);
    }

    public final void c() {
        boolean H = FragmentManager.H(3);
        Fragment fragment = this.f1883c;
        if (H) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        w wVar = null;
        x xVar = this.f1882b;
        if (fragment2 != null) {
            w wVar2 = xVar.f1888b.get(fragment2.mWho);
            if (wVar2 != null) {
                fragment.mTargetWho = fragment.mTarget.mWho;
                fragment.mTarget = null;
                wVar = wVar2;
            } else {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (wVar = xVar.f1888b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(a3.l.p(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (wVar != null) {
            wVar.k();
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        fragment.mHost = fragmentManager.f1737p;
        fragment.mParentFragment = fragmentManager.f1739r;
        s sVar = this.f1881a;
        sVar.g(false);
        fragment.performAttach();
        sVar.b(false);
    }

    public final int d() {
        j0.b bVar;
        Fragment fragment = this.f1883c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i10 = this.f1885e;
        int ordinal = fragment.mMaxState.ordinal();
        int i11 = 0;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i10 = Math.min(i10, -1);
                    }
                } else {
                    i10 = Math.min(i10, 5);
                }
            } else {
                i10 = Math.min(i10, 1);
            }
        } else {
            i10 = Math.min(i10, 0);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                i10 = Math.max(this.f1885e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f1885e < 4 ? Math.min(i10, fragment.mState) : Math.min(i10, 1);
            }
        }
        if (!fragment.mAdded) {
            i10 = Math.min(i10, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            j0 f = j0.f(viewGroup, fragment.getParentFragmentManager());
            f.getClass();
            j0.b d10 = f.d(fragment);
            if (d10 != null) {
                i11 = d10.f1835b;
            }
            Iterator<j0.b> it = f.f1830c.iterator();
            while (true) {
                if (it.hasNext()) {
                    bVar = it.next();
                    if (bVar.f1836c.equals(fragment) && !bVar.f) {
                        break;
                    }
                } else {
                    bVar = null;
                    break;
                }
            }
            if (bVar != null && (i11 == 0 || i11 == 1)) {
                i11 = bVar.f1835b;
            }
        }
        if (i11 == 2) {
            i10 = Math.min(i10, 6);
        } else if (i11 == 3) {
            i10 = Math.max(i10, 3);
        } else if (fragment.mRemoving) {
            if (fragment.isInBackStack()) {
                i10 = Math.min(i10, 1);
            } else {
                i10 = Math.min(i10, -1);
            }
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            i10 = Math.min(i10, 4);
        }
        if (FragmentManager.H(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + fragment);
        }
        return i10;
    }

    public final void e() {
        boolean H = FragmentManager.H(3);
        Fragment fragment = this.f1883c;
        if (H) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        if (!fragment.mIsCreated) {
            s sVar = this.f1881a;
            sVar.h(false);
            fragment.performCreate(fragment.mSavedFragmentState);
            sVar.c(false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        fragment.mState = 1;
    }

    public final void f() {
        String str;
        Fragment fragment = this.f1883c;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.H(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            int i10 = fragment.mContainerId;
            if (i10 != 0) {
                if (i10 != -1) {
                    viewGroup = (ViewGroup) fragment.mFragmentManager.f1738q.b(i10);
                    if (viewGroup == null && !fragment.mRestored) {
                        try {
                            str = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + str + ") for fragment " + fragment);
                    }
                } else {
                    throw new IllegalArgumentException(a3.l.l("Cannot create fragment ", fragment, " for a container view with no id"));
                }
            } else {
                viewGroup = null;
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(performGetLayoutInflater, viewGroup, fragment.mSavedFragmentState);
        View view = fragment.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                b();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            View view2 = fragment.mView;
            WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
            if (c0.g.b(view2)) {
                c0.h.c(fragment.mView);
            } else {
                View view3 = fragment.mView;
                view3.addOnAttachStateChangeListener(new a(view3));
            }
            fragment.performViewCreated();
            this.f1881a.m(fragment, fragment.mView, fragment.mSavedFragmentState, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.H(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(gl.Code);
            }
        }
        fragment.mState = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.g():void");
    }

    public final void h() {
        View view;
        boolean H = FragmentManager.H(3);
        Fragment fragment = this.f1883c;
        if (H) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f1881a.n(false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.h(null);
        fragment.mInLayout = false;
    }

    public final void i() {
        boolean H = FragmentManager.H(3);
        Fragment fragment = this.f1883c;
        if (H) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        boolean z10 = false;
        this.f1881a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        boolean z11 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z10 = true;
        }
        if (!z10) {
            u uVar = this.f1882b.f1889c;
            if (uVar.f1876d.containsKey(fragment.mWho) && uVar.f1878g) {
                z11 = uVar.f1879h;
            }
            if (!z11) {
                return;
            }
        }
        if (FragmentManager.H(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void j() {
        Fragment fragment = this.f1883c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.H(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f1881a.m(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                fragment.mState = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z10 = this.f1884d;
        Fragment fragment = this.f1883c;
        if (z10) {
            if (FragmentManager.H(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.f1884d = true;
            while (true) {
                int d10 = d();
                int i10 = fragment.mState;
                if (d10 != i10) {
                    if (d10 > i10) {
                        switch (i10 + 1) {
                            case 0:
                                c();
                                break;
                            case 1:
                                e();
                                break;
                            case 2:
                                j();
                                f();
                                break;
                            case 3:
                                a();
                                break;
                            case 4:
                                if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                    j0 f = j0.f(viewGroup2, fragment.getParentFragmentManager());
                                    int b10 = a3.l.b(fragment.mView.getVisibility());
                                    f.getClass();
                                    if (FragmentManager.H(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragment);
                                    }
                                    f.a(b10, 2, this);
                                }
                                fragment.mState = 4;
                                break;
                            case 5:
                                q();
                                break;
                            case 6:
                                fragment.mState = 6;
                                break;
                            case 7:
                                n();
                                break;
                        }
                    } else {
                        switch (i10 - 1) {
                            case -1:
                                i();
                                break;
                            case 0:
                                g();
                                break;
                            case 1:
                                h();
                                fragment.mState = 1;
                                break;
                            case 2:
                                fragment.mInLayout = false;
                                fragment.mState = 2;
                                break;
                            case 3:
                                if (FragmentManager.H(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                                }
                                if (fragment.mView != null && fragment.mSavedViewState == null) {
                                    p();
                                }
                                if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                    j0 f10 = j0.f(viewGroup3, fragment.getParentFragmentManager());
                                    f10.getClass();
                                    if (FragmentManager.H(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                    }
                                    f10.a(1, 3, this);
                                }
                                fragment.mState = 3;
                                break;
                            case 4:
                                r();
                                break;
                            case 5:
                                fragment.mState = 5;
                                break;
                            case 6:
                                l();
                                break;
                        }
                    }
                } else {
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            j0 f11 = j0.f(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                f11.getClass();
                                if (FragmentManager.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                f11.a(3, 1, this);
                            } else {
                                f11.getClass();
                                if (FragmentManager.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                f11.a(2, 1, this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null && fragment.mAdded && FragmentManager.I(fragment)) {
                            fragmentManager.f1746z = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                    }
                    return;
                }
            }
        } finally {
            this.f1884d = false;
        }
    }

    public final void l() {
        boolean H = FragmentManager.H(3);
        Fragment fragment = this.f1883c;
        if (H) {
            Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
        }
        fragment.performPause();
        this.f1881a.f(false);
    }

    public final void m(ClassLoader classLoader) {
        Fragment fragment = this.f1883c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("android:view_registry_state");
        fragment.mTargetWho = fragment.mSavedFragmentState.getString("android:target_state");
        if (fragment.mTargetWho != null) {
            fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Boolean bool = fragment.mSavedUserVisibleHint;
        if (bool != null) {
            fragment.mUserVisibleHint = bool.booleanValue();
            fragment.mSavedUserVisibleHint = null;
        } else {
            fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        if (!fragment.mUserVisibleHint) {
            fragment.mDeferStart = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.H(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.Fragment r2 = r7.f1883c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            android.view.View r0 = r2.getFocusedView()
            r3 = 0
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.mView
            if (r0 != r4) goto L28
            goto L32
        L28:
            android.view.ViewParent r4 = r0.getParent()
        L2c:
            if (r4 == 0) goto L39
            android.view.View r5 = r2.mView
            if (r4 != r5) goto L34
        L32:
            r4 = 1
            goto L3a
        L34:
            android.view.ViewParent r4 = r4.getParent()
            goto L2c
        L39:
            r4 = r3
        L3a:
            if (r4 == 0) goto L7d
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = androidx.fragment.app.FragmentManager.H(r5)
            if (r5 == 0) goto L7d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "requestFocus: Restoring focused view "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            if (r4 == 0) goto L5b
            java.lang.String r0 = "succeeded"
            goto L5d
        L5b:
            java.lang.String r0 = "failed"
        L5d:
            r5.append(r0)
            java.lang.String r0 = " on Fragment "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r5.append(r0)
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
        L7d:
            r0 = 0
            r2.setFocusedView(r0)
            r2.performResume()
            androidx.fragment.app.s r1 = r7.f1881a
            r1.i(r3)
            r2.mSavedFragmentState = r0
            r2.mSavedViewState = r0
            r2.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.n():void");
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        Fragment fragment = this.f1883c;
        fragment.performSaveInstanceState(bundle);
        this.f1881a.j(false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (fragment.mView != null) {
            p();
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (fragment.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", fragment.mSavedViewRegistryState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    public final void p() {
        Fragment fragment = this.f1883c;
        if (fragment.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f1813u.c(bundle);
        if (!bundle.isEmpty()) {
            fragment.mSavedViewRegistryState = bundle;
        }
    }

    public final void q() {
        boolean H = FragmentManager.H(3);
        Fragment fragment = this.f1883c;
        if (H) {
            Log.d("FragmentManager", "moveto STARTED: " + fragment);
        }
        fragment.performStart();
        this.f1881a.k(false);
    }

    public final void r() {
        boolean H = FragmentManager.H(3);
        Fragment fragment = this.f1883c;
        if (H) {
            Log.d("FragmentManager", "movefrom STARTED: " + fragment);
        }
        fragment.performStop();
        this.f1881a.l(false);
    }

    public w(s sVar, x xVar, ClassLoader classLoader, p pVar, FragmentState fragmentState) {
        this.f1881a = sVar;
        this.f1882b = xVar;
        Fragment instantiate = Fragment.instantiate(FragmentManager.this.f1737p.f1865t, fragmentState.f1767s, null);
        this.f1883c = instantiate;
        Bundle bundle = fragmentState.B;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        instantiate.setArguments(bundle);
        instantiate.mWho = fragmentState.f1768t;
        instantiate.mFromLayout = fragmentState.f1769u;
        instantiate.mRestored = true;
        instantiate.mFragmentId = fragmentState.f1770v;
        instantiate.mContainerId = fragmentState.f1771w;
        instantiate.mTag = fragmentState.f1772x;
        instantiate.mRetainInstance = fragmentState.y;
        instantiate.mRemoving = fragmentState.f1773z;
        instantiate.mDetached = fragmentState.A;
        instantiate.mHidden = fragmentState.C;
        instantiate.mMaxState = i.c.values()[fragmentState.D];
        Bundle bundle2 = fragmentState.E;
        if (bundle2 != null) {
            instantiate.mSavedFragmentState = bundle2;
        } else {
            instantiate.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.H(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + instantiate);
        }
    }

    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ View f1886s;

        public a(View view) {
            this.f1886s = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f1886s;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
            c0.h.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public w(s sVar, x xVar, Fragment fragment, FragmentState fragmentState) {
        this.f1881a = sVar;
        this.f1882b = xVar;
        this.f1883c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.E;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
