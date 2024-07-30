package com.huawei.openalliance.ad.feedback;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.n;
import com.huawei.hms.ads.ex;
import ea.b;
import gb.r0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class FlowLayoutView extends ViewGroup {

    /* renamed from: s, reason: collision with root package name */
    public b f22209s;

    /* renamed from: t, reason: collision with root package name */
    public final int f22210t;

    /* renamed from: u, reason: collision with root package name */
    public final int f22211u;

    /* renamed from: v, reason: collision with root package name */
    public int f22212v;

    /* renamed from: w, reason: collision with root package name */
    public int f22213w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f22214x;

    public FlowLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f22212v = 1;
        this.f22210t = r0.i(context, 8.0f);
        this.f22211u = r0.i(context, 8.0f);
        this.f22214x = new ArrayList();
        this.f22213w = 0;
    }

    public final void a() {
        int i10 = this.f22213w;
        if (i10 > 0) {
            this.f22209s.f27886c = i10 - this.f22210t;
        }
        b bVar = this.f22209s;
        if (bVar != null) {
            this.f22214x.add(bVar);
        }
        this.f22213w = 0;
        this.f22209s = new b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = (getMeasuredWidth() - paddingLeft) - paddingTop;
        Iterator it = this.f22214x.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i14 = this.f22212v;
            int left = getLeft();
            ArrayList arrayList = bVar.f27884a;
            if (!n.h(arrayList)) {
                int i15 = this.f22210t;
                if (i14 == -1) {
                    int i16 = (measuredWidth - bVar.f27886c) + paddingLeft + left + i15;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((View) arrayList.get(size)).layout(i16, paddingTop, ((View) arrayList.get(size)).getMeasuredWidth() + i16, ((View) arrayList.get(size)).getMeasuredHeight() + paddingTop);
                        i16 += ((View) arrayList.get(size)).getMeasuredWidth() + i15;
                    }
                } else if (i14 == 0) {
                    int size2 = ((((arrayList.size() - 1) * i15) + measuredWidth) - bVar.f27886c) / (arrayList.size() + 1);
                    Iterator it2 = arrayList.iterator();
                    int i17 = paddingLeft;
                    while (it2.hasNext()) {
                        View view = (View) it2.next();
                        int i18 = i17 + size2;
                        view.layout(i18, paddingTop, view.getMeasuredWidth() + i18, view.getMeasuredHeight() + paddingTop);
                        i17 = i18 + view.getMeasuredWidth();
                    }
                } else if (i14 != 1) {
                    ex.V("FlowLayoutLine", "lineMode error");
                } else {
                    Iterator it3 = arrayList.iterator();
                    int i19 = paddingLeft;
                    while (it3.hasNext()) {
                        View view2 = (View) it3.next();
                        view2.layout(i19, paddingTop, view2.getMeasuredWidth() + i19, view2.getMeasuredHeight() + paddingTop);
                        i19 += view2.getMeasuredWidth() + i15;
                    }
                }
            }
            paddingTop = this.f22211u + bVar.f27885b + paddingTop;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i11) - getPaddingBottom()) - getPaddingTop();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        ArrayList arrayList = this.f22214x;
        arrayList.clear();
        this.f22209s = new b();
        int i13 = 0;
        this.f22213w = 0;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            int i15 = Integer.MIN_VALUE;
            if (mode == 1073741824) {
                i12 = Integer.MIN_VALUE;
            } else {
                i12 = mode;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, i12);
            if (mode2 != 1073741824) {
                i15 = mode2;
            }
            childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, i15));
            int measuredWidth = childAt.getMeasuredWidth();
            if (this.f22213w + measuredWidth > size) {
                a();
            }
            int i16 = this.f22213w + this.f22210t + measuredWidth;
            this.f22213w = i16;
            b bVar = this.f22209s;
            bVar.f27886c = i16;
            bVar.f27884a.add(childAt);
            if (bVar.f27885b < childAt.getMeasuredHeight()) {
                bVar.f27885b = childAt.getMeasuredHeight();
            }
        }
        b bVar2 = this.f22209s;
        if (bVar2 != null && !arrayList.contains(bVar2)) {
            a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i13 += ((b) it.next()).f27885b;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.resolveSize(getPaddingTop() + getPaddingBottom() + ((arrayList.size() - 1) * this.f22211u) + i13, i11));
    }

    public void setDefaultDisplayMode(int i10) {
        this.f22212v = i10;
    }
}
