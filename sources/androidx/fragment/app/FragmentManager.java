package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.i;
import com.hamkho.livefoot.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class FragmentManager {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ArrayList<androidx.fragment.app.a> E;
    public ArrayList<Boolean> F;
    public ArrayList<Fragment> G;
    public u H;
    public final g I;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1725b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f1727d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<Fragment> f1728e;

    /* renamed from: g, reason: collision with root package name */
    public OnBackPressedDispatcher f1729g;

    /* renamed from: m, reason: collision with root package name */
    public final s f1735m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList<v> f1736n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public q<?> f1737p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.fragment.app.n f1738q;

    /* renamed from: r, reason: collision with root package name */
    public Fragment f1739r;

    /* renamed from: s, reason: collision with root package name */
    public Fragment f1740s;

    /* renamed from: t, reason: collision with root package name */
    public final e f1741t;

    /* renamed from: u, reason: collision with root package name */
    public final f f1742u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.activity.result.d f1743v;

    /* renamed from: w, reason: collision with root package name */
    public androidx.activity.result.d f1744w;

    /* renamed from: x, reason: collision with root package name */
    public androidx.activity.result.d f1745x;
    public ArrayDeque<LaunchedFragmentInfo> y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1746z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<l> f1724a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final x f1726c = new x();
    public final r f = new r(this);

    /* renamed from: h, reason: collision with root package name */
    public final c f1730h = new c();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f1731i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, Bundle> f1732j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map<String, Object> f1733k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    public final Map<Fragment, HashSet<j0.d>> f1734l = Collections.synchronizedMap(new HashMap());

    /* renamed from: androidx.fragment.app.FragmentManager$6, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass6 implements androidx.lifecycle.k {
        @Override // androidx.lifecycle.k
        public final void c(androidx.lifecycle.m mVar, i.b bVar) {
            if (bVar != i.b.ON_START) {
                if (bVar != i.b.ON_DESTROY) {
                    return;
                } else {
                    throw null;
                }
            }
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class a implements androidx.activity.result.a<ActivityResult> {
        public a() {
        }

        @Override // androidx.activity.result.a
        public final void a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo pollFirst = fragmentManager.y.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            x xVar = fragmentManager.f1726c;
            String str = pollFirst.f1747s;
            Fragment c10 = xVar.c(str);
            if (c10 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            } else {
                c10.onActivityResult(pollFirst.f1748t, activityResult2.f521s, activityResult2.f522t);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements androidx.activity.result.a<Map<String, Boolean>> {
        public b() {
        }

        @Override // androidx.activity.result.a
        @SuppressLint({"SyntheticAccessor"})
        public final void a(Map<String, Boolean> map) {
            int i10;
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((Boolean) arrayList.get(i11)).booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = -1;
                }
                iArr[i11] = i10;
            }
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo pollFirst = fragmentManager.y.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            x xVar = fragmentManager.f1726c;
            String str = pollFirst.f1747s;
            Fragment c10 = xVar.c(str);
            if (c10 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            c10.onRequestPermissionsResult(pollFirst.f1748t, strArr, iArr);
        }
    }

    /* loaded from: classes.dex */
    public class c extends androidx.activity.i {
        public c() {
        }

        @Override // androidx.activity.i
        public final void a() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.w(true);
            if (fragmentManager.f1730h.f484a) {
                fragmentManager.N();
            } else {
                fragmentManager.f1729g.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d {
        public d(FragmentManager fragmentManager) {
        }
    }

    /* loaded from: classes.dex */
    public class e extends p {
        public e() {
        }
    }

    /* loaded from: classes.dex */
    public class f implements l0 {
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.w(true);
        }
    }

    /* loaded from: classes.dex */
    public class h implements v {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Fragment f1754s;

        public h(Fragment fragment) {
            this.f1754s = fragment;
        }

        @Override // androidx.fragment.app.v
        public final void a(Fragment fragment) {
            this.f1754s.onAttachFragment(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class i implements androidx.activity.result.a<ActivityResult> {
        public i() {
        }

        @Override // androidx.activity.result.a
        public final void a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo pollFirst = fragmentManager.y.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            x xVar = fragmentManager.f1726c;
            String str = pollFirst.f1747s;
            Fragment c10 = xVar.c(str);
            if (c10 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            } else {
                c10.onActivityResult(pollFirst.f1748t, activityResult2.f521s, activityResult2.f522t);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class j extends e.a<IntentSenderRequest, ActivityResult> {
        @Override // e.a
        public final Intent a(ComponentActivity componentActivity, Object obj) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest.f528t;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest(intentSenderRequest.f527s, null, intentSenderRequest.f529u, intentSenderRequest.f530v);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.H(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // e.a
        public final ActivityResult c(int i10, Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class m implements l {

        /* renamed from: a, reason: collision with root package name */
        public final int f1756a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1757b = 1;

        public m(int i10) {
            this.f1756a = i10;
        }

        @Override // androidx.fragment.app.FragmentManager.l
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f1740s;
            if (fragment != null && this.f1756a < 0 && fragment.getChildFragmentManager().N()) {
                return false;
            }
            return FragmentManager.this.O(arrayList, arrayList2, null, this.f1756a, this.f1757b);
        }
    }

    /* loaded from: classes.dex */
    public static class n implements Fragment.l {

        /* renamed from: a, reason: collision with root package name */
        public int f1759a;
    }

    public FragmentManager() {
        new d(this);
        this.f1735m = new s(this);
        this.f1736n = new CopyOnWriteArrayList<>();
        this.o = -1;
        this.f1741t = new e();
        this.f1742u = new f();
        this.y = new ArrayDeque<>();
        this.I = new g();
    }

    public static boolean H(int i10) {
        if (Log.isLoggable("FragmentManager", i10)) {
            return true;
        }
        return false;
    }

    public static boolean I(Fragment fragment) {
        boolean z10;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        Iterator it = fragment.mChildFragmentManager.f1726c.e().iterator();
        boolean z11 = false;
        while (true) {
            if (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                if (fragment2 != null) {
                    z11 = I(fragment2);
                }
                if (z11) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public static boolean J(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragment.equals(fragmentManager.f1740s) && J(fragmentManager.f1739r)) {
            return true;
        }
        return false;
    }

    public static void a0(Fragment fragment) {
        if (H(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final Fragment A(int i10) {
        x xVar = this.f1726c;
        ArrayList<Fragment> arrayList = xVar.f1887a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = arrayList.get(size);
                if (fragment != null && fragment.mFragmentId == i10) {
                    return fragment;
                }
            } else {
                for (w wVar : xVar.f1888b.values()) {
                    if (wVar != null) {
                        Fragment fragment2 = wVar.f1883c;
                        if (fragment2.mFragmentId == i10) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final Fragment B(String str) {
        x xVar = this.f1726c;
        ArrayList<Fragment> arrayList = xVar.f1887a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            } else {
                for (w wVar : xVar.f1888b.values()) {
                    if (wVar != null) {
                        Fragment fragment2 = wVar.f1883c;
                        if (str.equals(fragment2.mTag)) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final void C() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            if (j0Var.f1832e) {
                j0Var.f1832e = false;
                j0Var.c();
            }
        }
    }

    public final ViewGroup D(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f1738q.c()) {
            View b10 = this.f1738q.b(fragment.mContainerId);
            if (b10 instanceof ViewGroup) {
                return (ViewGroup) b10;
            }
        }
        return null;
    }

    public final p E() {
        Fragment fragment = this.f1739r;
        if (fragment != null) {
            return fragment.mFragmentManager.E();
        }
        return this.f1741t;
    }

    public final l0 F() {
        Fragment fragment = this.f1739r;
        if (fragment != null) {
            return fragment.mFragmentManager.F();
        }
        return this.f1742u;
    }

    public final void G(Fragment fragment) {
        if (H(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            Z(fragment);
        }
    }

    public final boolean K() {
        if (!this.A && !this.B) {
            return false;
        }
        return true;
    }

    public final void L(int i10, boolean z10) {
        HashMap<String, w> hashMap;
        q<?> qVar;
        if (this.f1737p == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z10 && i10 == this.o) {
            return;
        }
        this.o = i10;
        x xVar = this.f1726c;
        Iterator<Fragment> it = xVar.f1887a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = xVar.f1888b;
            if (!hasNext) {
                break;
            }
            w wVar = hashMap.get(it.next().mWho);
            if (wVar != null) {
                wVar.k();
            }
        }
        Iterator<w> it2 = hashMap.values().iterator();
        while (true) {
            boolean z11 = false;
            if (!it2.hasNext()) {
                break;
            }
            w next = it2.next();
            if (next != null) {
                next.k();
                Fragment fragment = next.f1883c;
                if (fragment.mRemoving && !fragment.isInBackStack()) {
                    z11 = true;
                }
                if (z11) {
                    xVar.h(next);
                }
            }
        }
        b0();
        if (this.f1746z && (qVar = this.f1737p) != null && this.o == 7) {
            qVar.h();
            this.f1746z = false;
        }
    }

    public final void M() {
        if (this.f1737p == null) {
            return;
        }
        this.A = false;
        this.B = false;
        this.H.f1880i = false;
        for (Fragment fragment : this.f1726c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean N() {
        w(false);
        v(true);
        Fragment fragment = this.f1740s;
        if (fragment != null && fragment.getChildFragmentManager().N()) {
            return true;
        }
        boolean O = O(this.E, this.F, null, -1, 0);
        if (O) {
            this.f1725b = true;
            try {
                R(this.E, this.F);
            } finally {
                d();
            }
        }
        e0();
        if (this.D) {
            this.D = false;
            b0();
        }
        this.f1726c.f1888b.values().removeAll(Collections.singleton(null));
        return O;
    }

    public final boolean O(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1727d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1727d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            int i12 = -1;
            if (str != null || i10 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f1727d.get(size2);
                    if ((str != null && str.equals(aVar.f1896h)) || (i10 >= 0 && i10 == aVar.f1778r)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f1727d.get(size2);
                        if (str == null || !str.equals(aVar2.f1896h)) {
                            if (i10 < 0 || i10 != aVar2.f1778r) {
                                break;
                            }
                        }
                    }
                }
                i12 = size2;
            }
            if (i12 == this.f1727d.size() - 1) {
                return false;
            }
            for (int size3 = this.f1727d.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.f1727d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public final void P(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            c0(new IllegalStateException(a3.l.l("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void Q(Fragment fragment) {
        if (H(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z10 = !fragment.isInBackStack();
        if (!fragment.mDetached || z10) {
            x xVar = this.f1726c;
            synchronized (xVar.f1887a) {
                xVar.f1887a.remove(fragment);
            }
            fragment.mAdded = false;
            if (I(fragment)) {
                this.f1746z = true;
            }
            fragment.mRemoving = true;
            Z(fragment);
        }
    }

    public final void R(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                if (!arrayList.get(i10).o) {
                    if (i11 != i10) {
                        y(arrayList, arrayList2, i11, i10);
                    }
                    i11 = i10 + 1;
                    if (arrayList2.get(i10).booleanValue()) {
                        while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).o) {
                            i11++;
                        }
                    }
                    y(arrayList, arrayList2, i10, i11);
                    i10 = i11 - 1;
                }
                i10++;
            }
            if (i11 != size) {
                y(arrayList, arrayList2, i11, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final void S(Parcelable parcelable) {
        s sVar;
        int i10;
        boolean z10;
        w wVar;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f1760s == null) {
            return;
        }
        x xVar = this.f1726c;
        xVar.f1888b.clear();
        Iterator<FragmentState> it = fragmentManagerState.f1760s.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            sVar = this.f1735m;
            if (!hasNext) {
                break;
            }
            FragmentState next = it.next();
            if (next != null) {
                Fragment fragment = this.H.f1876d.get(next.f1768t);
                if (fragment != null) {
                    if (H(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    wVar = new w(sVar, xVar, fragment, next);
                } else {
                    wVar = new w(this.f1735m, this.f1726c, this.f1737p.f1865t.getClassLoader(), E(), next);
                }
                Fragment fragment2 = wVar.f1883c;
                fragment2.mFragmentManager = this;
                if (H(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                wVar.m(this.f1737p.f1865t.getClassLoader());
                xVar.g(wVar);
                wVar.f1885e = this.o;
            }
        }
        u uVar = this.H;
        uVar.getClass();
        Iterator it2 = new ArrayList(uVar.f1876d.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (xVar.f1888b.get(fragment3.mWho) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (H(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f1760s);
                }
                this.H.d(fragment3);
                fragment3.mFragmentManager = this;
                w wVar2 = new w(sVar, xVar, fragment3);
                wVar2.f1885e = 1;
                wVar2.k();
                fragment3.mRemoving = true;
                wVar2.k();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f1761t;
        xVar.f1887a.clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                Fragment b10 = xVar.b(str);
                if (b10 != null) {
                    if (H(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + b10);
                    }
                    xVar.a(b10);
                } else {
                    throw new IllegalStateException(a3.k.l("No instantiated fragment for (", str, ")"));
                }
            }
        }
        if (fragmentManagerState.f1762u != null) {
            this.f1727d = new ArrayList<>(fragmentManagerState.f1762u.length);
            int i11 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f1762u;
                if (i11 >= backStackStateArr.length) {
                    break;
                }
                BackStackState backStackState = backStackStateArr[i11];
                backStackState.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int[] iArr = backStackState.f1677s;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    y.a aVar2 = new y.a();
                    int i14 = i12 + 1;
                    aVar2.f1903a = iArr[i12];
                    if (H(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i13 + " base fragment #" + iArr[i14]);
                    }
                    String str2 = backStackState.f1678t.get(i13);
                    if (str2 != null) {
                        aVar2.f1904b = z(str2);
                    } else {
                        aVar2.f1904b = null;
                    }
                    aVar2.f1908g = i.c.values()[backStackState.f1679u[i13]];
                    aVar2.f1909h = i.c.values()[backStackState.f1680v[i13]];
                    int i15 = i14 + 1;
                    int i16 = iArr[i14];
                    aVar2.f1905c = i16;
                    int i17 = i15 + 1;
                    int i18 = iArr[i15];
                    aVar2.f1906d = i18;
                    int i19 = i17 + 1;
                    int i20 = iArr[i17];
                    aVar2.f1907e = i20;
                    int i21 = iArr[i19];
                    aVar2.f = i21;
                    aVar.f1891b = i16;
                    aVar.f1892c = i18;
                    aVar.f1893d = i20;
                    aVar.f1894e = i21;
                    aVar.b(aVar2);
                    i13++;
                    i12 = i19 + 1;
                }
                aVar.f = backStackState.f1681w;
                aVar.f1896h = backStackState.f1682x;
                aVar.f1778r = backStackState.y;
                aVar.f1895g = true;
                aVar.f1897i = backStackState.f1683z;
                aVar.f1898j = backStackState.A;
                aVar.f1899k = backStackState.B;
                aVar.f1900l = backStackState.C;
                aVar.f1901m = backStackState.D;
                aVar.f1902n = backStackState.E;
                aVar.o = backStackState.F;
                aVar.d(1);
                if (H(2)) {
                    StringBuilder n10 = a3.k.n("restoreAllState: back stack #", i11, " (index ");
                    n10.append(aVar.f1778r);
                    n10.append("): ");
                    n10.append(aVar);
                    Log.v("FragmentManager", n10.toString());
                    PrintWriter printWriter = new PrintWriter(new g0());
                    aVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1727d.add(aVar);
                i11++;
            }
            i10 = 0;
        } else {
            i10 = 0;
            this.f1727d = null;
        }
        this.f1731i.set(fragmentManagerState.f1763v);
        String str3 = fragmentManagerState.f1764w;
        if (str3 != null) {
            Fragment z11 = z(str3);
            this.f1740s = z11;
            p(z11);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f1765x;
        if (arrayList2 != null) {
            while (i10 < arrayList2.size()) {
                Bundle bundle = fragmentManagerState.y.get(i10);
                bundle.setClassLoader(this.f1737p.f1865t.getClassLoader());
                this.f1732j.put(arrayList2.get(i10), bundle);
                i10++;
            }
        }
        this.y = new ArrayDeque<>(fragmentManagerState.f1766z);
    }

    public final Parcelable T() {
        ArrayList<String> arrayList;
        int size;
        C();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((j0) it.next()).e();
        }
        w(true);
        this.A = true;
        this.H.f1880i = true;
        x xVar = this.f1726c;
        xVar.getClass();
        HashMap<String, w> hashMap = xVar.f1888b;
        ArrayList<FragmentState> arrayList2 = new ArrayList<>(hashMap.size());
        for (w wVar : hashMap.values()) {
            if (wVar != null) {
                Fragment fragment = wVar.f1883c;
                FragmentState fragmentState = new FragmentState(fragment);
                if (fragment.mState > -1 && fragmentState.E == null) {
                    Bundle o = wVar.o();
                    fragmentState.E = o;
                    if (fragment.mTargetWho != null) {
                        if (o == null) {
                            fragmentState.E = new Bundle();
                        }
                        fragmentState.E.putString("android:target_state", fragment.mTargetWho);
                        int i10 = fragment.mTargetRequestCode;
                        if (i10 != 0) {
                            fragmentState.E.putInt("android:target_req_state", i10);
                        }
                    }
                } else {
                    fragmentState.E = fragment.mSavedFragmentState;
                }
                arrayList2.add(fragmentState);
                if (H(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragmentState.E);
                }
            }
        }
        BackStackState[] backStackStateArr = null;
        if (arrayList2.isEmpty()) {
            if (H(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        x xVar2 = this.f1726c;
        synchronized (xVar2.f1887a) {
            if (xVar2.f1887a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(xVar2.f1887a.size());
                Iterator<Fragment> it2 = xVar2.f1887a.iterator();
                while (it2.hasNext()) {
                    Fragment next = it2.next();
                    arrayList.add(next.mWho);
                    if (H(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                    }
                }
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1727d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i11 = 0; i11 < size; i11++) {
                backStackStateArr[i11] = new BackStackState(this.f1727d.get(i11));
                if (H(2)) {
                    StringBuilder n10 = a3.k.n("saveAllState: adding back stack #", i11, ": ");
                    n10.append(this.f1727d.get(i11));
                    Log.v("FragmentManager", n10.toString());
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f1760s = arrayList2;
        fragmentManagerState.f1761t = arrayList;
        fragmentManagerState.f1762u = backStackStateArr;
        fragmentManagerState.f1763v = this.f1731i.get();
        Fragment fragment2 = this.f1740s;
        if (fragment2 != null) {
            fragmentManagerState.f1764w = fragment2.mWho;
        }
        fragmentManagerState.f1765x.addAll(this.f1732j.keySet());
        fragmentManagerState.y.addAll(this.f1732j.values());
        fragmentManagerState.f1766z = new ArrayList<>(this.y);
        return fragmentManagerState;
    }

    public final Fragment.SavedState U(Fragment fragment) {
        Bundle o;
        w wVar = this.f1726c.f1888b.get(fragment.mWho);
        if (wVar != null) {
            Fragment fragment2 = wVar.f1883c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState <= -1 || (o = wVar.o()) == null) {
                    return null;
                }
                return new Fragment.SavedState(o);
            }
        }
        c0(new IllegalStateException(a3.l.l("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void V() {
        synchronized (this.f1724a) {
            boolean z10 = true;
            if (this.f1724a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f1737p.f1866u.removeCallbacks(this.I);
                this.f1737p.f1866u.post(this.I);
                e0();
            }
        }
    }

    public final void W(Fragment fragment, boolean z10) {
        ViewGroup D = D(fragment);
        if (D != null && (D instanceof FragmentContainerView)) {
            ((FragmentContainerView) D).setDrawDisappearingViewsLast(!z10);
        }
    }

    public final void X(Fragment fragment, i.c cVar) {
        if (fragment.equals(z(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void Y(Fragment fragment) {
        if (fragment != null && (!fragment.equals(z(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f1740s;
        this.f1740s = fragment;
        p(fragment2);
        p(this.f1740s);
    }

    public final void Z(Fragment fragment) {
        ViewGroup D = D(fragment);
        if (D != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (D.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    D.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) D.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final w a(Fragment fragment) {
        if (H(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        w f10 = f(fragment);
        fragment.mFragmentManager = this;
        x xVar = this.f1726c;
        xVar.g(f10);
        if (!fragment.mDetached) {
            xVar.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (I(fragment)) {
                this.f1746z = true;
            }
        }
        return f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public final void b(q<?> qVar, androidx.fragment.app.n nVar, Fragment fragment) {
        String str;
        if (this.f1737p == null) {
            this.f1737p = qVar;
            this.f1738q = nVar;
            this.f1739r = fragment;
            CopyOnWriteArrayList<v> copyOnWriteArrayList = this.f1736n;
            if (fragment != null) {
                copyOnWriteArrayList.add(new h(fragment));
            } else if (qVar instanceof v) {
                copyOnWriteArrayList.add((v) qVar);
            }
            if (this.f1739r != null) {
                e0();
            }
            if (qVar instanceof androidx.activity.m) {
                androidx.activity.m mVar = (androidx.activity.m) qVar;
                OnBackPressedDispatcher onBackPressedDispatcher = mVar.getOnBackPressedDispatcher();
                this.f1729g = onBackPressedDispatcher;
                androidx.lifecycle.m mVar2 = mVar;
                if (fragment != null) {
                    mVar2 = fragment;
                }
                onBackPressedDispatcher.a(mVar2, this.f1730h);
            }
            if (fragment != null) {
                u uVar = fragment.mFragmentManager.H;
                HashMap<String, u> hashMap = uVar.f1877e;
                u uVar2 = hashMap.get(fragment.mWho);
                if (uVar2 == null) {
                    uVar2 = new u(uVar.f1878g);
                    hashMap.put(fragment.mWho, uVar2);
                }
                this.H = uVar2;
            } else if (qVar instanceof androidx.lifecycle.j0) {
                this.H = (u) new androidx.lifecycle.g0(((androidx.lifecycle.j0) qVar).getViewModelStore(), u.f1875j).a(u.class);
            } else {
                this.H = new u(false);
            }
            this.H.f1880i = K();
            this.f1726c.f1889c = this.H;
            Object obj = this.f1737p;
            if (obj instanceof androidx.activity.result.f) {
                androidx.activity.result.e activityResultRegistry = ((androidx.activity.result.f) obj).getActivityResultRegistry();
                if (fragment != null) {
                    str = a3.l.p(new StringBuilder(), fragment.mWho, com.huawei.openalliance.ad.constant.w.bE);
                } else {
                    str = "";
                }
                String b10 = s.f.b("FragmentManager:", str);
                this.f1743v = activityResultRegistry.d(com.ironsource.adapters.facebook.a.h(b10, "StartActivityForResult"), new e.c(), new i());
                this.f1744w = activityResultRegistry.d(com.ironsource.adapters.facebook.a.h(b10, "StartIntentSenderForResult"), new j(), new a());
                this.f1745x = activityResultRegistry.d(com.ironsource.adapters.facebook.a.h(b10, "RequestPermissions"), new e.b(), new b());
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void b0() {
        Iterator it = this.f1726c.d().iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            Fragment fragment = wVar.f1883c;
            if (fragment.mDeferStart) {
                if (this.f1725b) {
                    this.D = true;
                } else {
                    fragment.mDeferStart = false;
                    wVar.k();
                }
            }
        }
    }

    public final void c(Fragment fragment) {
        if (H(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f1726c.a(fragment);
                if (H(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (I(fragment)) {
                    this.f1746z = true;
                }
            }
        }
    }

    public final void c0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new g0());
        q<?> qVar = this.f1737p;
        if (qVar != null) {
            try {
                qVar.d(printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw illegalStateException;
            }
        }
        try {
            t("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw illegalStateException;
        }
    }

    public final void d() {
        this.f1725b = false;
        this.F.clear();
        this.E.clear();
    }

    public final void d0(k kVar) {
        s sVar = this.f1735m;
        synchronized (sVar.f1871a) {
            int size = sVar.f1871a.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (sVar.f1871a.get(i10).f1873a == kVar) {
                    sVar.f1871a.remove(i10);
                    break;
                }
                i10++;
            }
        }
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1726c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((w) it.next()).f1883c.mContainer;
            if (viewGroup != null) {
                hashSet.add(j0.g(viewGroup, F()));
            }
        }
        return hashSet;
    }

    public final void e0() {
        int i10;
        synchronized (this.f1724a) {
            try {
                boolean z10 = true;
                if (!this.f1724a.isEmpty()) {
                    c cVar = this.f1730h;
                    cVar.f484a = true;
                    m0.a<Boolean> aVar = cVar.f486c;
                    if (aVar != null) {
                        aVar.accept(Boolean.TRUE);
                    }
                    return;
                }
                c cVar2 = this.f1730h;
                ArrayList<androidx.fragment.app.a> arrayList = this.f1727d;
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 0;
                }
                if (i10 <= 0 || !J(this.f1739r)) {
                    z10 = false;
                }
                cVar2.f484a = z10;
                m0.a<Boolean> aVar2 = cVar2.f486c;
                if (aVar2 != null) {
                    aVar2.accept(Boolean.valueOf(z10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final w f(Fragment fragment) {
        String str = fragment.mWho;
        x xVar = this.f1726c;
        w wVar = xVar.f1888b.get(str);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this.f1735m, xVar, fragment);
        wVar2.m(this.f1737p.f1865t.getClassLoader());
        wVar2.f1885e = this.o;
        return wVar2;
    }

    public final void g(Fragment fragment) {
        if (H(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (H(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                x xVar = this.f1726c;
                synchronized (xVar.f1887a) {
                    xVar.f1887a.remove(fragment);
                }
                fragment.mAdded = false;
                if (I(fragment)) {
                    this.f1746z = true;
                }
                Z(fragment);
            }
        }
    }

    public final void h(Configuration configuration) {
        for (Fragment fragment : this.f1726c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.o < 1) {
            return false;
        }
        for (Fragment fragment : this.f1726c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        if (this.o < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f1726c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f1728e != null) {
            for (int i10 = 0; i10 < this.f1728e.size(); i10++) {
                Fragment fragment2 = this.f1728e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f1728e = arrayList;
        return z10;
    }

    public final void k() {
        this.C = true;
        w(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((j0) it.next()).e();
        }
        s(-1);
        this.f1737p = null;
        this.f1738q = null;
        this.f1739r = null;
        if (this.f1729g != null) {
            Iterator<androidx.activity.a> it2 = this.f1730h.f485b.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.f1729g = null;
        }
        androidx.activity.result.d dVar = this.f1743v;
        if (dVar != null) {
            dVar.b();
            this.f1744w.b();
            this.f1745x.b();
        }
    }

    public final void l() {
        for (Fragment fragment : this.f1726c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public final void m(boolean z10) {
        for (Fragment fragment : this.f1726c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
            }
        }
    }

    public final boolean n(MenuItem menuItem) {
        if (this.o < 1) {
            return false;
        }
        for (Fragment fragment : this.f1726c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void o(Menu menu) {
        if (this.o < 1) {
            return;
        }
        for (Fragment fragment : this.f1726c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void p(Fragment fragment) {
        if (fragment != null && fragment.equals(z(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    public final void q(boolean z10) {
        for (Fragment fragment : this.f1726c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
            }
        }
    }

    public final boolean r(Menu menu) {
        boolean z10 = false;
        if (this.o < 1) {
            return false;
        }
        for (Fragment fragment : this.f1726c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void s(int i10) {
        try {
            this.f1725b = true;
            for (w wVar : this.f1726c.f1888b.values()) {
                if (wVar != null) {
                    wVar.f1885e = i10;
                }
            }
            L(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((j0) it.next()).e();
            }
            this.f1725b = false;
            w(true);
        } catch (Throwable th) {
            this.f1725b = false;
            throw th;
        }
    }

    public final void t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String h10 = com.ironsource.adapters.facebook.a.h(str, "    ");
        x xVar = this.f1726c;
        xVar.getClass();
        String str2 = str + "    ";
        HashMap<String, w> hashMap = xVar.f1888b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (w wVar : hashMap.values()) {
                printWriter.print(str);
                if (wVar != null) {
                    Fragment fragment = wVar.f1883c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList<Fragment> arrayList = xVar.f1887a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                Fragment fragment2 = arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.f1728e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                Fragment fragment3 = this.f1728e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1727d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                androidx.fragment.app.a aVar = this.f1727d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(h10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1731i.get());
        synchronized (this.f1724a) {
            int size4 = this.f1724a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size4; i13++) {
                    Object obj = (l) this.f1724a.get(i13);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1737p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1738q);
        if (this.f1739r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1739r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.A);
        printWriter.print(" mStopped=");
        printWriter.print(this.B);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.C);
        if (this.f1746z) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1746z);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f1739r;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f1739r)));
            sb2.append("}");
        } else {
            q<?> qVar = this.f1737p;
            if (qVar != null) {
                sb2.append(qVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f1737p)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(l lVar, boolean z10) {
        if (!z10) {
            if (this.f1737p == null) {
                if (this.C) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (K()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1724a) {
            if (this.f1737p == null) {
                if (z10) {
                } else {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f1724a.add(lVar);
                V();
            }
        }
    }

    public final void v(boolean z10) {
        if (!this.f1725b) {
            if (this.f1737p == null) {
                if (this.C) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.f1737p.f1866u.getLooper()) {
                if (!z10 && K()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.E == null) {
                    this.E = new ArrayList<>();
                    this.F = new ArrayList<>();
                }
                this.f1725b = false;
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean w(boolean z10) {
        boolean z11;
        v(z10);
        boolean z12 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList = this.E;
            ArrayList<Boolean> arrayList2 = this.F;
            synchronized (this.f1724a) {
                if (this.f1724a.isEmpty()) {
                    z11 = false;
                } else {
                    int size = this.f1724a.size();
                    z11 = false;
                    for (int i10 = 0; i10 < size; i10++) {
                        z11 |= this.f1724a.get(i10).a(arrayList, arrayList2);
                    }
                    this.f1724a.clear();
                    this.f1737p.f1866u.removeCallbacks(this.I);
                }
            }
            if (!z11) {
                break;
            }
            z12 = true;
            this.f1725b = true;
            try {
                R(this.E, this.F);
            } finally {
                d();
            }
        }
        e0();
        if (this.D) {
            this.D = false;
            b0();
        }
        this.f1726c.f1888b.values().removeAll(Collections.singleton(null));
        return z12;
    }

    public final void x(l lVar, boolean z10) {
        if (z10 && (this.f1737p == null || this.C)) {
            return;
        }
        v(z10);
        if (lVar.a(this.E, this.F)) {
            this.f1725b = true;
            try {
                R(this.E, this.F);
            } finally {
                d();
            }
        }
        e0();
        if (this.D) {
            this.D = false;
            b0();
        }
        this.f1726c.f1888b.values().removeAll(Collections.singleton(null));
    }

    public final void y(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        ViewGroup viewGroup;
        x xVar;
        x xVar2;
        x xVar3;
        int i12;
        ArrayList<androidx.fragment.app.a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        boolean z10 = arrayList3.get(i10).o;
        ArrayList<Fragment> arrayList5 = this.G;
        if (arrayList5 == null) {
            this.G = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        ArrayList<Fragment> arrayList6 = this.G;
        x xVar4 = this.f1726c;
        arrayList6.addAll(xVar4.f());
        Fragment fragment = this.f1740s;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int i14 = 1;
            if (i13 < i11) {
                androidx.fragment.app.a aVar = arrayList3.get(i13);
                if (!arrayList4.get(i13).booleanValue()) {
                    ArrayList<Fragment> arrayList7 = this.G;
                    int i15 = 0;
                    while (true) {
                        ArrayList<y.a> arrayList8 = aVar.f1890a;
                        if (i15 < arrayList8.size()) {
                            y.a aVar2 = arrayList8.get(i15);
                            int i16 = aVar2.f1903a;
                            if (i16 != i14) {
                                if (i16 != 2) {
                                    if (i16 != 3 && i16 != 6) {
                                        if (i16 != 7) {
                                            if (i16 == 8) {
                                                arrayList8.add(i15, new y.a(fragment, 9));
                                                i15++;
                                                fragment = aVar2.f1904b;
                                            }
                                        } else {
                                            xVar3 = xVar4;
                                            i12 = 1;
                                        }
                                    } else {
                                        arrayList7.remove(aVar2.f1904b);
                                        Fragment fragment2 = aVar2.f1904b;
                                        if (fragment2 == fragment) {
                                            arrayList8.add(i15, new y.a(fragment2, 9));
                                            i15++;
                                            xVar3 = xVar4;
                                            i12 = 1;
                                            fragment = null;
                                        }
                                    }
                                    xVar3 = xVar4;
                                    i12 = 1;
                                } else {
                                    Fragment fragment3 = aVar2.f1904b;
                                    int i17 = fragment3.mContainerId;
                                    int size = arrayList7.size() - 1;
                                    boolean z12 = false;
                                    while (size >= 0) {
                                        x xVar5 = xVar4;
                                        Fragment fragment4 = arrayList7.get(size);
                                        if (fragment4.mContainerId == i17) {
                                            if (fragment4 == fragment3) {
                                                z12 = true;
                                            } else {
                                                if (fragment4 == fragment) {
                                                    arrayList8.add(i15, new y.a(fragment4, 9));
                                                    i15++;
                                                    fragment = null;
                                                }
                                                y.a aVar3 = new y.a(fragment4, 3);
                                                aVar3.f1905c = aVar2.f1905c;
                                                aVar3.f1907e = aVar2.f1907e;
                                                aVar3.f1906d = aVar2.f1906d;
                                                aVar3.f = aVar2.f;
                                                arrayList8.add(i15, aVar3);
                                                arrayList7.remove(fragment4);
                                                i15++;
                                                fragment = fragment;
                                            }
                                        }
                                        size--;
                                        xVar4 = xVar5;
                                    }
                                    xVar3 = xVar4;
                                    i12 = 1;
                                    if (z12) {
                                        arrayList8.remove(i15);
                                        i15--;
                                    } else {
                                        aVar2.f1903a = 1;
                                        arrayList7.add(fragment3);
                                    }
                                }
                                i15 += i12;
                                i14 = i12;
                                xVar4 = xVar3;
                            } else {
                                xVar3 = xVar4;
                                i12 = i14;
                            }
                            arrayList7.add(aVar2.f1904b);
                            i15 += i12;
                            i14 = i12;
                            xVar4 = xVar3;
                        } else {
                            xVar2 = xVar4;
                        }
                    }
                } else {
                    xVar2 = xVar4;
                    int i18 = 1;
                    ArrayList<Fragment> arrayList9 = this.G;
                    ArrayList<y.a> arrayList10 = aVar.f1890a;
                    int size2 = arrayList10.size() - 1;
                    while (size2 >= 0) {
                        y.a aVar4 = arrayList10.get(size2);
                        int i19 = aVar4.f1903a;
                        if (i19 != i18) {
                            if (i19 != 3) {
                                switch (i19) {
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = aVar4.f1904b;
                                        break;
                                    case 10:
                                        aVar4.f1909h = aVar4.f1908g;
                                        break;
                                }
                                size2--;
                                i18 = 1;
                            }
                            arrayList9.add(aVar4.f1904b);
                            size2--;
                            i18 = 1;
                        }
                        arrayList9.remove(aVar4.f1904b);
                        size2--;
                        i18 = 1;
                    }
                }
                if (!z11 && !aVar.f1895g) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                i13++;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                xVar4 = xVar2;
            } else {
                x xVar6 = xVar4;
                this.G.clear();
                if (!z10 && this.o >= 1) {
                    for (int i20 = i10; i20 < i11; i20++) {
                        Iterator<y.a> it = arrayList.get(i20).f1890a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment5 = it.next().f1904b;
                            if (fragment5 != null && fragment5.mFragmentManager != null) {
                                xVar = xVar6;
                                xVar.g(f(fragment5));
                            } else {
                                xVar = xVar6;
                            }
                            xVar6 = xVar;
                        }
                    }
                }
                for (int i21 = i10; i21 < i11; i21++) {
                    androidx.fragment.app.a aVar5 = arrayList.get(i21);
                    if (arrayList2.get(i21).booleanValue()) {
                        aVar5.d(-1);
                        aVar5.h();
                    } else {
                        aVar5.d(1);
                        aVar5.g();
                    }
                }
                boolean booleanValue = arrayList2.get(i11 - 1).booleanValue();
                for (int i22 = i10; i22 < i11; i22++) {
                    androidx.fragment.app.a aVar6 = arrayList.get(i22);
                    if (booleanValue) {
                        for (int size3 = aVar6.f1890a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment6 = aVar6.f1890a.get(size3).f1904b;
                            if (fragment6 != null) {
                                f(fragment6).k();
                            }
                        }
                    } else {
                        Iterator<y.a> it2 = aVar6.f1890a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment7 = it2.next().f1904b;
                            if (fragment7 != null) {
                                f(fragment7).k();
                            }
                        }
                    }
                }
                L(this.o, true);
                HashSet hashSet = new HashSet();
                for (int i23 = i10; i23 < i11; i23++) {
                    Iterator<y.a> it3 = arrayList.get(i23).f1890a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment8 = it3.next().f1904b;
                        if (fragment8 != null && (viewGroup = fragment8.mContainer) != null) {
                            hashSet.add(j0.g(viewGroup, F()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    j0 j0Var = (j0) it4.next();
                    j0Var.f1831d = booleanValue;
                    j0Var.h();
                    j0Var.c();
                }
                for (int i24 = i10; i24 < i11; i24++) {
                    androidx.fragment.app.a aVar7 = arrayList.get(i24);
                    if (arrayList2.get(i24).booleanValue() && aVar7.f1778r >= 0) {
                        aVar7.f1778r = -1;
                    }
                    aVar7.getClass();
                }
                return;
            }
        }
    }

    public final Fragment z(String str) {
        return this.f1726c.b(str);
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public final String f1747s;

        /* renamed from: t, reason: collision with root package name */
        public final int f1748t;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        public LaunchedFragmentInfo(String str, int i10) {
            this.f1747s = str;
            this.f1748t = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f1747s);
            parcel.writeInt(this.f1748t);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f1747s = parcel.readString();
            this.f1748t = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {
        public void a(Fragment fragment) {
        }

        public void b(FragmentManager fragmentManager, Fragment fragment, View view) {
        }
    }
}
