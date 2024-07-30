package pb;

import com.ironsource.lifecycle.c;
import com.ironsource.lifecycle.d;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f34487s;

    public a(d dVar) {
        this.f34487s = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f34487s.f24717x.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b();
        }
    }
}
