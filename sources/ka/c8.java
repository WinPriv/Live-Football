package ka;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class c8 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w7 f31031s;

    public c8(w7 w7Var) {
        this.f31031s = w7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<i9> it = this.f31031s.F.iterator();
        while (it.hasNext()) {
            i9 next = it.next();
            if (next != null) {
                next.a();
            }
        }
    }
}
