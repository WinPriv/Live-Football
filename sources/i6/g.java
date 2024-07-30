package i6;

import android.view.View;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final View f29191a;

    /* renamed from: b, reason: collision with root package name */
    public int f29192b;

    /* renamed from: c, reason: collision with root package name */
    public int f29193c;

    /* renamed from: d, reason: collision with root package name */
    public int f29194d;

    public g(View view) {
        this.f29191a = view;
    }

    public final void a() {
        int i10 = this.f29194d;
        View view = this.f29191a;
        int top = i10 - (view.getTop() - this.f29192b);
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f29193c));
    }

    public final boolean b(int i10) {
        if (this.f29194d != i10) {
            this.f29194d = i10;
            a();
            return true;
        }
        return false;
    }
}
