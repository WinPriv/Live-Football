package qa;

import androidx.transition.n;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class f implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f34731s;

    public f(g gVar) {
        this.f34731s = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar;
        g gVar = this.f34731s;
        synchronized (gVar) {
            WeakReference<c> weakReference = gVar.f34735v;
            if (weakReference != null) {
                cVar = weakReference.get();
            } else {
                cVar = null;
            }
        }
        n.D(cVar);
    }
}
