package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.g0;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
public final class u extends androidx.lifecycle.e0 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f1875j = new a();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1878g;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap<String, Fragment> f1876d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, u> f1877e = new HashMap<>();
    public final HashMap<String, androidx.lifecycle.i0> f = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    public boolean f1879h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1880i = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* loaded from: classes.dex */
    public class a implements g0.b {
        @Override // androidx.lifecycle.g0.b
        public final <T extends androidx.lifecycle.e0> T a(Class<T> cls) {
            return new u(true);
        }
    }

    public u(boolean z10) {
        this.f1878g = z10;
    }

    @Override // androidx.lifecycle.e0
    public final void b() {
        if (FragmentManager.H(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1879h = true;
    }

    public final void c(Fragment fragment) {
        if (this.f1880i) {
            if (FragmentManager.H(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap<String, Fragment> hashMap = this.f1876d;
        if (hashMap.containsKey(fragment.mWho)) {
            return;
        }
        hashMap.put(fragment.mWho, fragment);
        if (FragmentManager.H(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void d(Fragment fragment) {
        boolean z10;
        if (this.f1880i) {
            if (FragmentManager.H(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if (this.f1876d.remove(fragment.mWho) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && FragmentManager.H(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f1876d.equals(uVar.f1876d) && this.f1877e.equals(uVar.f1877e) && this.f.equals(uVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.f1877e.hashCode() + (this.f1876d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f1876d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f1877e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
