package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public final class t extends o {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ u f2380q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context) {
        super(context);
        this.f2380q = uVar;
    }

    @Override // androidx.recyclerview.widget.o, androidx.recyclerview.widget.RecyclerView.y
    public final void c(View view, RecyclerView.y.a aVar) {
        u uVar = this.f2380q;
        int[] b10 = uVar.b(uVar.f2388a.getLayoutManager(), view);
        int i10 = b10[0];
        int i11 = b10[1];
        int ceil = (int) Math.ceil(g(Math.max(Math.abs(i10), Math.abs(i11))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f2370j;
            aVar.f2195a = i10;
            aVar.f2196b = i11;
            aVar.f2197c = ceil;
            aVar.f2199e = decelerateInterpolator;
            aVar.f = true;
        }
    }

    @Override // androidx.recyclerview.widget.o
    public final float f(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.o
    public final int g(int i10) {
        return Math.min(100, super.g(i10));
    }
}
