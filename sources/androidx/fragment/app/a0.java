package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
public final class a0 extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f1779a;

    public a0(Rect rect) {
        this.f1779a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.f1779a;
    }
}
