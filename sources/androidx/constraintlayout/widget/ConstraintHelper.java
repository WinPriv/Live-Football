package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.ads.gl;
import java.util.Arrays;
import java.util.HashMap;
import q.e;
import u.d;
import u.i;

/* loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: s, reason: collision with root package name */
    public int[] f1356s;

    /* renamed from: t, reason: collision with root package name */
    public int f1357t;

    /* renamed from: u, reason: collision with root package name */
    public final Context f1358u;

    /* renamed from: v, reason: collision with root package name */
    public i f1359v;

    /* renamed from: w, reason: collision with root package name */
    public String f1360w;

    /* renamed from: x, reason: collision with root package name */
    public String f1361x;
    public View[] y;

    /* renamed from: z, reason: collision with root package name */
    public final HashMap<Integer, String> f1362z;

    public ConstraintHelper(Context context) {
        super(context);
        this.f1356s = new int[32];
        this.y = null;
        this.f1362z = new HashMap<>();
        this.f1358u = context;
        k(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto La7
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto La7
        La:
            android.content.Context r0 = r5.f1358u
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L21
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L21:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L31
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5b
            if (r1 == 0) goto L5b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L4f
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.E
            if (r3 == 0) goto L4f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4f
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.E
            java.lang.Object r3 = r3.get(r6)
            goto L50
        L4f:
            r3 = r2
        L50:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5c
        L5b:
            r3 = 0
        L5c:
            if (r3 != 0) goto L64
            if (r1 == 0) goto L64
            int r3 = r5.i(r1, r6)
        L64:
            if (r3 != 0) goto L70
            java.lang.Class<x.d> r1 = x.d.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L70
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L70
        L70:
            if (r3 != 0) goto L80
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L80:
            if (r3 == 0) goto L8f
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r5.f1362z
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.d(r3)
            goto La7
        L8f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.c(java.lang.String):void");
    }

    public final void d(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f1357t + 1;
        int[] iArr = this.f1356s;
        if (i11 > iArr.length) {
            this.f1356s = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1356s;
        int i12 = this.f1357t;
        iArr2[i12] = i10;
        this.f1357t = i12 + 1;
    }

    public final void e(String str) {
        ConstraintLayout constraintLayout;
        if (str == null || str.length() == 0 || this.f1358u == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    d(childAt.getId());
                }
            }
        }
    }

    public final void f() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            g((ConstraintLayout) parent);
        }
    }

    public final void g(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f1357t; i10++) {
            View b10 = constraintLayout.b(this.f1356s[i10]);
            if (b10 != null) {
                b10.setVisibility(visibility);
                if (elevation > gl.Code) {
                    b10.setTranslationZ(b10.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1356s, this.f1357t);
    }

    public final int i(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f1358u.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final View[] j(ConstraintLayout constraintLayout) {
        View[] viewArr = this.y;
        if (viewArr == null || viewArr.length != this.f1357t) {
            this.y = new View[this.f1357t];
        }
        for (int i10 = 0; i10 < this.f1357t; i10++) {
            this.y[i10] = constraintLayout.b(this.f1356s[i10]);
        }
        return this.y;
    }

    public void k(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f34521z);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1360w = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1361x = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void o() {
        if (this.f1359v == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).f1401q0 = this.f1359v;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1360w;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1361x;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1360w = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f1357t = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                c(str.substring(i10));
                return;
            } else {
                c(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1361x = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f1357t = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                e(str.substring(i10));
                return;
            } else {
                e(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1360w = null;
        this.f1357t = 0;
        for (int i10 : iArr) {
            d(i10);
        }
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f1360w == null) {
            d(i10);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1356s = new int[32];
        this.y = null;
        this.f1362z = new HashMap<>();
        this.f1358u = context;
        k(attributeSet);
    }

    public void m() {
    }

    public void h(ConstraintLayout constraintLayout) {
    }

    public void n(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void l(d dVar, boolean z10) {
    }
}
