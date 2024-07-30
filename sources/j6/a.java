package j6;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.huawei.hms.ads.gl;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import o0.k;

/* compiled from: SwipeDismissBehavior.java */
/* loaded from: classes2.dex */
public final class a implements k {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f29871s;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f29871s = swipeDismissBehavior;
    }

    @Override // o0.k
    public final boolean a(View view) {
        boolean z10;
        SwipeDismissBehavior swipeDismissBehavior = this.f29871s;
        boolean z11 = false;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.e.d(view) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = swipeDismissBehavior.f20501d;
        if ((i10 == 0 && z10) || (i10 == 1 && !z10)) {
            z11 = true;
        }
        int width = view.getWidth();
        if (z11) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(gl.Code);
        return true;
    }
}
