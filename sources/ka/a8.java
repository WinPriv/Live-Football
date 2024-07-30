package ka;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class a8 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w7 f30928s;

    public a8(w7 w7Var) {
        this.f30928s = w7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<j9> it = this.f30928s.H.iterator();
        while (it.hasNext()) {
            j9 next = it.next();
            if (next != null) {
                next.a();
            }
        }
    }
}
