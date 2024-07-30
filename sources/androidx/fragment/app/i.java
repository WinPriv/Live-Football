package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1824s;

    public i(ArrayList arrayList) {
        this.f1824s = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z.b(4, this.f1824s);
    }
}
