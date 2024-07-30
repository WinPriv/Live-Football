package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.n;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.constant.cp;
import d7.g;
import d7.h;
import d7.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class RadialViewGroup extends ConstraintLayout {
    public final c I;
    public int J;
    public g K;

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            view.setId(c0.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            c cVar = this.I;
            handler.removeCallbacks(cVar);
            handler.post(cVar);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            c cVar = this.I;
            handler.removeCallbacks(cVar);
            handler.post(cVar);
        }
    }

    public void p() {
        int i10;
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getId() != R.id.circle_center && !cp.F.equals(childAt.getTag())) {
                int i12 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i12 == null) {
                    i12 = 1;
                }
                if (!hashMap.containsKey(i12)) {
                    hashMap.put(i12, new ArrayList());
                }
                ((List) hashMap.get(i12)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i10 = Math.round(this.J * 0.66f);
            } else {
                i10 = this.J;
            }
            Iterator it = list.iterator();
            float f = gl.Code;
            while (it.hasNext()) {
                int id2 = ((View) it.next()).getId();
                HashMap<Integer, a.C0014a> hashMap2 = aVar.f1437c;
                if (!hashMap2.containsKey(Integer.valueOf(id2))) {
                    hashMap2.put(Integer.valueOf(id2), new a.C0014a());
                }
                a.b bVar = hashMap2.get(Integer.valueOf(id2)).f1441d;
                bVar.f1492z = R.id.circle_center;
                bVar.A = i10;
                bVar.B = f;
                f += 360.0f / list.size();
            }
        }
        aVar.a(this);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.K.k(ColorStateList.valueOf(i10));
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.c] */
    public RadialViewGroup(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g gVar = new g();
        this.K = gVar;
        h hVar = new h(0.5f);
        j jVar = gVar.f27403s.f27411a;
        jVar.getClass();
        j.a aVar = new j.a(jVar);
        aVar.f27446e = hVar;
        aVar.f = hVar;
        aVar.f27447g = hVar;
        aVar.f27448h = hVar;
        gVar.setShapeAppearanceModel(new j(aVar));
        this.K.k(ColorStateList.valueOf(-1));
        g gVar2 = this.K;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.d.q(this, gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f503o0, i10, 0);
        this.J = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.I = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                RadialViewGroup.this.p();
            }
        };
        obtainStyledAttributes.recycle();
    }
}
