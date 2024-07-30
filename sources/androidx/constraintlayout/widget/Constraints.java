package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import com.huawei.hms.ads.gl;
import java.util.HashMap;
import q.e;

/* loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* renamed from: s, reason: collision with root package name */
    public androidx.constraintlayout.widget.a f1418s;

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public androidx.constraintlayout.widget.a getConstraintSet() {
        if (this.f1418s == null) {
            this.f1418s = new androidx.constraintlayout.widget.a();
        }
        androidx.constraintlayout.widget.a aVar = this.f1418s;
        aVar.getClass();
        int childCount = getChildCount();
        HashMap<Integer, a.C0014a> hashMap = aVar.f1437c;
        hashMap.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            a aVar2 = (a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (aVar.f1436b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                hashMap.put(Integer.valueOf(id2), new a.C0014a());
            }
            a.C0014a c0014a = hashMap.get(Integer.valueOf(id2));
            if (c0014a != null) {
                if (childAt instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                    c0014a.c(id2, aVar2);
                    if (constraintHelper instanceof Barrier) {
                        a.b bVar = c0014a.f1441d;
                        bVar.f1469h0 = 1;
                        Barrier barrier = (Barrier) constraintHelper;
                        bVar.f1465f0 = barrier.getType();
                        bVar.f1471i0 = barrier.getReferencedIds();
                        bVar.f1467g0 = barrier.getMargin();
                    }
                }
                c0014a.c(id2, aVar2);
            }
        }
        return this.f1418s;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.a {
        public final float A0;
        public final float B0;
        public final float C0;
        public final float D0;

        /* renamed from: r0, reason: collision with root package name */
        public final float f1419r0;

        /* renamed from: s0, reason: collision with root package name */
        public final boolean f1420s0;

        /* renamed from: t0, reason: collision with root package name */
        public final float f1421t0;

        /* renamed from: u0, reason: collision with root package name */
        public final float f1422u0;

        /* renamed from: v0, reason: collision with root package name */
        public final float f1423v0;

        /* renamed from: w0, reason: collision with root package name */
        public final float f1424w0;

        /* renamed from: x0, reason: collision with root package name */
        public final float f1425x0;
        public final float y0;

        /* renamed from: z0, reason: collision with root package name */
        public final float f1426z0;

        public a() {
            this.f1419r0 = 1.0f;
            this.f1420s0 = false;
            this.f1421t0 = gl.Code;
            this.f1422u0 = gl.Code;
            this.f1423v0 = gl.Code;
            this.f1424w0 = gl.Code;
            this.f1425x0 = 1.0f;
            this.y0 = 1.0f;
            this.f1426z0 = gl.Code;
            this.A0 = gl.Code;
            this.B0 = gl.Code;
            this.C0 = gl.Code;
            this.D0 = gl.Code;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1419r0 = 1.0f;
            this.f1420s0 = false;
            this.f1421t0 = gl.Code;
            this.f1422u0 = gl.Code;
            this.f1423v0 = gl.Code;
            this.f1424w0 = gl.Code;
            this.f1425x0 = 1.0f;
            this.y0 = 1.0f;
            this.f1426z0 = gl.Code;
            this.A0 = gl.Code;
            this.B0 = gl.Code;
            this.C0 = gl.Code;
            this.D0 = gl.Code;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.B);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 15) {
                    this.f1419r0 = obtainStyledAttributes.getFloat(index, this.f1419r0);
                } else if (index == 28) {
                    this.f1421t0 = obtainStyledAttributes.getFloat(index, this.f1421t0);
                    this.f1420s0 = true;
                } else if (index == 23) {
                    this.f1423v0 = obtainStyledAttributes.getFloat(index, this.f1423v0);
                } else if (index == 24) {
                    this.f1424w0 = obtainStyledAttributes.getFloat(index, this.f1424w0);
                } else if (index == 22) {
                    this.f1422u0 = obtainStyledAttributes.getFloat(index, this.f1422u0);
                } else if (index == 20) {
                    this.f1425x0 = obtainStyledAttributes.getFloat(index, this.f1425x0);
                } else if (index == 21) {
                    this.y0 = obtainStyledAttributes.getFloat(index, this.y0);
                } else if (index == 16) {
                    this.f1426z0 = obtainStyledAttributes.getFloat(index, this.f1426z0);
                } else if (index == 17) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
