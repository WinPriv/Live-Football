package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.k;
import j0.d;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class f implements d.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f1808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k.a f1810c;

    public f(View view, ViewGroup viewGroup, k.a aVar) {
        this.f1808a = view;
        this.f1809b = viewGroup;
        this.f1810c = aVar;
    }

    @Override // j0.d.a
    public final void onCancel() {
        View view = this.f1808a;
        view.clearAnimation();
        this.f1809b.endViewTransition(view);
        this.f1810c.a();
    }
}
