package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper.java */
/* loaded from: classes.dex */
public final class w {
    public static int a(RecyclerView.z zVar, s sVar, View view, View view2, RecyclerView.o oVar, boolean z10) {
        if (oVar.w() != 0 && zVar.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return Math.abs(RecyclerView.o.F(view) - RecyclerView.o.F(view2)) + 1;
            }
            return Math.min(sVar.l(), sVar.b(view2) - sVar.e(view));
        }
        return 0;
    }

    public static int b(RecyclerView.z zVar, s sVar, View view, View view2, RecyclerView.o oVar, boolean z10, boolean z11) {
        int max;
        if (oVar.w() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(RecyclerView.o.F(view), RecyclerView.o.F(view2));
        int max2 = Math.max(RecyclerView.o.F(view), RecyclerView.o.F(view2));
        if (z11) {
            max = Math.max(0, (zVar.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z10) {
            return max;
        }
        return Math.round((max * (Math.abs(sVar.b(view2) - sVar.e(view)) / (Math.abs(RecyclerView.o.F(view) - RecyclerView.o.F(view2)) + 1))) + (sVar.k() - sVar.e(view)));
    }

    public static int c(RecyclerView.z zVar, s sVar, View view, View view2, RecyclerView.o oVar, boolean z10) {
        if (oVar.w() != 0 && zVar.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return zVar.b();
            }
            return (int) (((sVar.b(view2) - sVar.e(view)) / (Math.abs(RecyclerView.o.F(view) - RecyclerView.o.F(view2)) + 1)) * zVar.b());
        }
        return 0;
    }
}
