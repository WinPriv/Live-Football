package n0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f33093a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f33094b;

    /* renamed from: c, reason: collision with root package name */
    public final View f33095c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f33096d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f33097e;

    public o(View view) {
        this.f33095c = view;
    }

    public final boolean a(float f, float f10, boolean z10) {
        ViewParent f11;
        if (!this.f33096d || (f11 = f(0)) == null) {
            return false;
        }
        try {
            return i0.a(f11, this.f33095c, f, f10, z10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f11 + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public final boolean b(float f, float f10) {
        ViewParent f11;
        if (!this.f33096d || (f11 = f(0)) == null) {
            return false;
        }
        try {
            return i0.b(f11, this.f33095c, f, f10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f11 + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public final boolean c(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent f;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f33096d || (f = f(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f33095c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f33097e == null) {
                this.f33097e = new int[2];
            }
            iArr3 = this.f33097e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.f33095c;
        if (f instanceof p) {
            ((p) f).o(view2, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                i0.c(f, view2, i10, i11, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final void d(int i10, int i11, int i12, int[] iArr) {
        e(0, i10, 0, i11, null, i12, iArr);
    }

    public final boolean e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent f;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.f33096d || (f = f(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f33095c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            if (this.f33097e == null) {
                this.f33097e = new int[2];
            }
            int[] iArr4 = this.f33097e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f33095c;
        if (f instanceof q) {
            ((q) f).k(view2, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (f instanceof p) {
                ((p) f).l(view2, i10, i11, i12, i13, i14);
            } else if (i14 == 0) {
                try {
                    i0.d(f, view2, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    public final ViewParent f(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return this.f33094b;
        }
        return this.f33093a;
    }

    public final boolean g(int i10, int i11) {
        boolean z10;
        boolean f;
        if (f(i11) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        if (this.f33096d) {
            View view = this.f33095c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z11 = parent instanceof p;
                if (z11) {
                    f = ((p) parent).m(view2, view, i10, i11);
                } else {
                    if (i11 == 0) {
                        try {
                            f = i0.f(parent, view2, view, i10);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        }
                    }
                    f = false;
                }
                if (f) {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            this.f33094b = parent;
                        }
                    } else {
                        this.f33093a = parent;
                    }
                    if (z11) {
                        ((p) parent).n(view2, view, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            i0.e(parent, view2, view, i10);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public final void h(int i10) {
        ViewParent f = f(i10);
        if (f != null) {
            boolean z10 = f instanceof p;
            View view = this.f33095c;
            if (z10) {
                ((p) f).j(i10, view);
            } else if (i10 == 0) {
                try {
                    i0.g(f, view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f33094b = null;
                    return;
                }
                return;
            }
            this.f33093a = null;
        }
    }
}
