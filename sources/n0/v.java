package n0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener.java */
/* loaded from: classes.dex */
public final class v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: s, reason: collision with root package name */
    public final View f33130s;

    /* renamed from: t, reason: collision with root package name */
    public ViewTreeObserver f33131t;

    /* renamed from: u, reason: collision with root package name */
    public final Runnable f33132u;

    public v(ViewGroup viewGroup, Runnable runnable) {
        this.f33130s = viewGroup;
        this.f33131t = viewGroup.getViewTreeObserver();
        this.f33132u = runnable;
    }

    public static void a(ViewGroup viewGroup, Runnable runnable) {
        if (viewGroup != null) {
            if (runnable != null) {
                v vVar = new v(viewGroup, runnable);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(vVar);
                viewGroup.addOnAttachStateChangeListener(vVar);
                return;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f33131t.isAlive();
        View view = this.f33130s;
        if (isAlive) {
            this.f33131t.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f33132u.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f33131t = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f33131t.isAlive();
        View view2 = this.f33130s;
        if (isAlive) {
            this.f33131t.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
