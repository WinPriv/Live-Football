package i6;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior.java */
/* loaded from: classes2.dex */
public class f<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    public g f29189a;

    /* renamed from: b, reason: collision with root package name */
    public int f29190b;

    public f() {
        this.f29190b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v3, int i10) {
        t(coordinatorLayout, v3, i10);
        if (this.f29189a == null) {
            this.f29189a = new g(v3);
        }
        g gVar = this.f29189a;
        View view = gVar.f29191a;
        gVar.f29192b = view.getTop();
        gVar.f29193c = view.getLeft();
        this.f29189a.a();
        int i11 = this.f29190b;
        if (i11 != 0) {
            this.f29189a.b(i11);
            this.f29190b = 0;
            return true;
        }
        return true;
    }

    public final int s() {
        g gVar = this.f29189a;
        if (gVar != null) {
            return gVar.f29194d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, V v3, int i10) {
        coordinatorLayout.s(i10, v3);
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29190b = 0;
    }
}
