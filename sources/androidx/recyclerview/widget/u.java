package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public class u extends y {

    /* renamed from: c, reason: collision with root package name */
    public r f2381c;

    /* renamed from: d, reason: collision with root package name */
    public q f2382d;

    public static int e(View view, s sVar) {
        return ((sVar.c(view) / 2) + sVar.e(view)) - ((sVar.l() / 2) + sVar.k());
    }

    public static View f(RecyclerView.o oVar, s sVar) {
        int w10 = oVar.w();
        View view = null;
        if (w10 == 0) {
            return null;
        }
        int l10 = (sVar.l() / 2) + sVar.k();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < w10; i11++) {
            View v3 = oVar.v(i11);
            int abs = Math.abs(((sVar.c(v3) / 2) + sVar.e(v3)) - l10);
            if (abs < i10) {
                view = v3;
                i10 = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.y
    public final int[] b(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.d()) {
            iArr[0] = e(view, g(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.e()) {
            iArr[1] = e(view, h(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.y
    public View c(RecyclerView.o oVar) {
        if (oVar.e()) {
            return f(oVar, h(oVar));
        }
        if (oVar.d()) {
            return f(oVar, g(oVar));
        }
        return null;
    }

    public final s g(RecyclerView.o oVar) {
        q qVar = this.f2382d;
        if (qVar == null || qVar.f2377a != oVar) {
            this.f2382d = new q(oVar);
        }
        return this.f2382d;
    }

    public final s h(RecyclerView.o oVar) {
        r rVar = this.f2381c;
        if (rVar == null || rVar.f2377a != oVar) {
            this.f2381c = new r(oVar);
        }
        return this.f2381c;
    }
}
