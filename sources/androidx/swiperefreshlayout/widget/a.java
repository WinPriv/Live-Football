package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes.dex */
public final class a extends Animation {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f2425s;

    public a(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2425s = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f2425s.setAnimationProgress(1.0f - f);
    }
}
