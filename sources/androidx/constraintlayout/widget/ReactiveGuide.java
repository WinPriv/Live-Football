package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ReactiveGuide extends View implements b.a {

    /* renamed from: s, reason: collision with root package name */
    public int f1431s;

    /* renamed from: t, reason: collision with root package name */
    public int f1432t;

    public int getApplyToConstraintSetId() {
        return this.f1432t;
    }

    public int getAttributeId() {
        return this.f1431s;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setApplyToConstraintSetId(int i10) {
        this.f1432t = i10;
    }

    public void setAttributeId(int i10) {
        HashSet<WeakReference<b.a>> hashSet;
        b sharedValues = ConstraintLayout.getSharedValues();
        int i11 = this.f1431s;
        if (i11 != -1 && (hashSet = sharedValues.f1519a.get(Integer.valueOf(i11))) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<WeakReference<b.a>> it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference<b.a> next = it.next();
                b.a aVar = next.get();
                if (aVar == null || aVar == this) {
                    arrayList.add(next);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.f1431s = i10;
        if (i10 != -1) {
            HashMap<Integer, HashSet<WeakReference<b.a>>> hashMap = sharedValues.f1519a;
            HashSet<WeakReference<b.a>> hashSet2 = hashMap.get(Integer.valueOf(i10));
            if (hashSet2 == null) {
                hashSet2 = new HashSet<>();
                hashMap.put(Integer.valueOf(i10), hashSet2);
            }
            hashSet2.add(new WeakReference<>(this));
        }
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f1370a = i10;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f1372b = i10;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f1374c = f;
        setLayoutParams(aVar);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public void setAnimateChange(boolean z10) {
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
