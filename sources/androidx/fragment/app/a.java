package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.y;
import androidx.lifecycle.i;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: BackStackRecord.java */
/* loaded from: classes.dex */
public final class a extends y implements FragmentManager.l {

    /* renamed from: p, reason: collision with root package name */
    public final FragmentManager f1776p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1777q;

    /* renamed from: r, reason: collision with root package name */
    public int f1778r;

    public a(FragmentManager fragmentManager) {
        fragmentManager.E();
        q<?> qVar = fragmentManager.f1737p;
        if (qVar != null) {
            qVar.f1865t.getClassLoader();
        }
        this.f1778r = -1;
        this.f1776p = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.H(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f1895g) {
            FragmentManager fragmentManager = this.f1776p;
            if (fragmentManager.f1727d == null) {
                fragmentManager.f1727d = new ArrayList<>();
            }
            fragmentManager.f1727d.add(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.y
    public final void c(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = fragment.mTag;
                if (str2 != null && !str.equals(str2)) {
                    StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                    sb2.append(fragment);
                    sb2.append(": was ");
                    throw new IllegalStateException(a3.k.m(sb2, fragment.mTag, " now ", str));
                }
                fragment.mTag = str;
            }
            if (i10 != 0) {
                if (i10 != -1) {
                    int i12 = fragment.mFragmentId;
                    if (i12 != 0 && i12 != i10) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
                    }
                    fragment.mFragmentId = i10;
                    fragment.mContainerId = i10;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            b(new y.a(fragment, i11));
            fragment.mFragmentManager = this.f1776p;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void d(int i10) {
        if (!this.f1895g) {
            return;
        }
        if (FragmentManager.H(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
        }
        ArrayList<y.a> arrayList = this.f1890a;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            y.a aVar = arrayList.get(i11);
            Fragment fragment = aVar.f1904b;
            if (fragment != null) {
                fragment.mBackStackNesting += i10;
                if (FragmentManager.H(2)) {
                    Log.v("FragmentManager", "Bump nesting of " + aVar.f1904b + " to " + aVar.f1904b.mBackStackNesting);
                }
            }
        }
    }

    public final int e(boolean z10) {
        if (!this.f1777q) {
            if (FragmentManager.H(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new g0());
                f("  ", printWriter, true);
                printWriter.close();
            }
            this.f1777q = true;
            boolean z11 = this.f1895g;
            FragmentManager fragmentManager = this.f1776p;
            if (z11) {
                this.f1778r = fragmentManager.f1731i.getAndIncrement();
            } else {
                this.f1778r = -1;
            }
            fragmentManager.u(this, z10);
            return this.f1778r;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void f(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1896h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1778r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1777q);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.f1891b != 0 || this.f1892c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1891b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1892c));
            }
            if (this.f1893d != 0 || this.f1894e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1893d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1894e));
            }
            if (this.f1897i != 0 || this.f1898j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1897i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1898j);
            }
            if (this.f1899k != 0 || this.f1900l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1899k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1900l);
            }
        }
        ArrayList<y.a> arrayList = this.f1890a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                y.a aVar = arrayList.get(i10);
                switch (aVar.f1903a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f1903a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1904b);
                if (z10) {
                    if (aVar.f1905c != 0 || aVar.f1906d != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1905c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1906d));
                    }
                    if (aVar.f1907e != 0 || aVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1907e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                }
            }
        }
    }

    public final void g() {
        ArrayList<y.a> arrayList = this.f1890a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            y.a aVar = arrayList.get(i10);
            Fragment fragment = aVar.f1904b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f);
                fragment.setSharedElementNames(this.f1901m, this.f1902n);
            }
            int i11 = aVar.f1903a;
            FragmentManager fragmentManager = this.f1776p;
            switch (i11) {
                case 1:
                    fragment.setAnimations(aVar.f1905c, aVar.f1906d, aVar.f1907e, aVar.f);
                    fragmentManager.W(fragment, false);
                    fragmentManager.a(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1903a);
                case 3:
                    fragment.setAnimations(aVar.f1905c, aVar.f1906d, aVar.f1907e, aVar.f);
                    fragmentManager.Q(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f1905c, aVar.f1906d, aVar.f1907e, aVar.f);
                    fragmentManager.G(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f1905c, aVar.f1906d, aVar.f1907e, aVar.f);
                    fragmentManager.W(fragment, false);
                    FragmentManager.a0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f1905c, aVar.f1906d, aVar.f1907e, aVar.f);
                    fragmentManager.g(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f1905c, aVar.f1906d, aVar.f1907e, aVar.f);
                    fragmentManager.W(fragment, false);
                    fragmentManager.c(fragment);
                    break;
                case 8:
                    fragmentManager.Y(fragment);
                    break;
                case 9:
                    fragmentManager.Y(null);
                    break;
                case 10:
                    fragmentManager.X(fragment, aVar.f1909h);
                    break;
            }
        }
    }

    public final void h() {
        ArrayList<y.a> arrayList = this.f1890a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y.a aVar = arrayList.get(size);
            Fragment fragment = aVar.f1904b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                int i10 = this.f;
                int i11 = 8194;
                if (i10 != 4097) {
                    if (i10 != 4099) {
                        if (i10 != 8194) {
                            i11 = 0;
                        } else {
                            i11 = 4097;
                        }
                    } else {
                        i11 = 4099;
                    }
                }
                fragment.setNextTransition(i11);
                fragment.setSharedElementNames(this.f1902n, this.f1901m);
            }
            int i12 = aVar.f1903a;
            FragmentManager fragmentManager = this.f1776p;
            switch (i12) {
                case 1:
                    fragment.setAnimations(aVar.f1905c, aVar.f1906d, aVar.f1907e, aVar.f);
                    fragmentManager.W(fragment, true);
                    fragmentManager.Q(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1903a);
                case 3:
                    fragment.setAnimations(aVar.f1905c, aVar.f1906d, aVar.f1907e, aVar.f);
                    fragmentManager.a(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f1905c, aVar.f1906d, aVar.f1907e, aVar.f);
                    fragmentManager.getClass();
                    FragmentManager.a0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f1905c, aVar.f1906d, aVar.f1907e, aVar.f);
                    fragmentManager.W(fragment, true);
                    fragmentManager.G(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f1905c, aVar.f1906d, aVar.f1907e, aVar.f);
                    fragmentManager.c(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f1905c, aVar.f1906d, aVar.f1907e, aVar.f);
                    fragmentManager.W(fragment, true);
                    fragmentManager.g(fragment);
                    break;
                case 8:
                    fragmentManager.Y(null);
                    break;
                case 9:
                    fragmentManager.Y(fragment);
                    break;
                case 10:
                    fragmentManager.X(fragment, aVar.f1908g);
                    break;
            }
        }
    }

    public final a i(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f1776p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        b(new y.a(fragment, 3));
        return this;
    }

    public final a j(Fragment fragment, i.c cVar) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        FragmentManager fragmentManager2 = this.f1776p;
        if (fragmentManager == fragmentManager2) {
            if (cVar == i.c.INITIALIZED && fragment.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
            }
            if (cVar != i.c.DESTROYED) {
                b(new y.a(fragment, cVar));
                return this;
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + fragmentManager2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1778r >= 0) {
            sb2.append(" #");
            sb2.append(this.f1778r);
        }
        if (this.f1896h != null) {
            sb2.append(" ");
            sb2.append(this.f1896h);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
