package androidx.fragment.app;

import android.animation.Animator;
import j0.d;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class d implements d.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animator f1798a;

    public d(Animator animator) {
        this.f1798a = animator;
    }

    @Override // j0.d.a
    public final void onCancel() {
        this.f1798a.end();
    }
}
