package x6;

import android.animation.ValueAnimator;
import com.google.android.material.navigation.NavigationBarItemView;

/* compiled from: NavigationBarItemView.java */
/* loaded from: classes2.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f36482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavigationBarItemView f36483b;

    public a(NavigationBarItemView navigationBarItemView, float f) {
        this.f36483b = navigationBarItemView;
        this.f36482a = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int[] iArr = NavigationBarItemView.W;
        this.f36483b.b(floatValue, this.f36482a);
    }
}
