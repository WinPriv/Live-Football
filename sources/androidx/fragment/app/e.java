package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.k;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k.a f1806c;

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            eVar.f1804a.endViewTransition(eVar.f1805b);
            eVar.f1806c.a();
        }
    }

    public e(View view, ViewGroup viewGroup, k.a aVar) {
        this.f1804a = viewGroup;
        this.f1805b = view;
        this.f1806c = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1804a.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
