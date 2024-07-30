package v6;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.d;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f35991s;

    public b(d dVar) {
        this.f35991s = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        d dVar = this.f35991s;
        float rotation = dVar.f20787q.getRotation();
        if (dVar.f20781j != rotation) {
            dVar.f20781j = rotation;
            dVar.m();
            return true;
        }
        return true;
    }
}
