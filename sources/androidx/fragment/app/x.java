package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: FragmentStore.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<Fragment> f1887a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<String, w> f1888b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public u f1889c;

    public final void a(Fragment fragment) {
        if (!this.f1887a.contains(fragment)) {
            synchronized (this.f1887a) {
                this.f1887a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public final Fragment b(String str) {
        w wVar = this.f1888b.get(str);
        if (wVar != null) {
            return wVar.f1883c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment findFragmentByWho;
        for (w wVar : this.f1888b.values()) {
            if (wVar != null && (findFragmentByWho = wVar.f1883c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (w wVar : this.f1888b.values()) {
            if (wVar != null) {
                arrayList.add(wVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (w wVar : this.f1888b.values()) {
            if (wVar != null) {
                arrayList.add(wVar.f1883c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List<Fragment> f() {
        ArrayList arrayList;
        if (this.f1887a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1887a) {
            arrayList = new ArrayList(this.f1887a);
        }
        return arrayList;
    }

    public final void g(w wVar) {
        boolean z10;
        Fragment fragment = wVar.f1883c;
        String str = fragment.mWho;
        HashMap<String, w> hashMap = this.f1888b;
        if (hashMap.get(str) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        hashMap.put(fragment.mWho, wVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f1889c.c(fragment);
            } else {
                this.f1889c.d(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.H(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void h(w wVar) {
        Fragment fragment = wVar.f1883c;
        if (fragment.mRetainInstance) {
            this.f1889c.d(fragment);
        }
        if (this.f1888b.put(fragment.mWho, null) != null && FragmentManager.H(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }
}
