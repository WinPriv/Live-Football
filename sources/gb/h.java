package gb;

import android.location.LocationListener;

/* loaded from: classes2.dex */
public final class h implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LocationListener f28587s;

    public h(g gVar) {
        this.f28587s = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!e.f28577g) {
            e.d(this.f28587s);
        }
    }
}
