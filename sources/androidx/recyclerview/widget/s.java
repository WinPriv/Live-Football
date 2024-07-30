package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.o f2377a;

    /* renamed from: b, reason: collision with root package name */
    public int f2378b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f2379c = new Rect();

    public s(RecyclerView.o oVar) {
        this.f2377a = oVar;
    }

    public static s a(RecyclerView.o oVar, int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return new r(oVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new q(oVar);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i10);
}
