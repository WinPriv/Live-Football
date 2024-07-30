package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e0 f1819s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f1820t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Rect f1821u;

    public h(e0 e0Var, View view, Rect rect) {
        this.f1819s = e0Var;
        this.f1820t = view;
        this.f1821u = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1819s.getClass();
        e0.g(this.f1820t, this.f1821u);
    }
}
