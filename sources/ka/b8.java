package ka;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class b8 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f30976s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w7 f30977t;

    public b8(w7 w7Var, int i10) {
        this.f30977t = w7Var;
        this.f30976s = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w7 w7Var = this.f30977t;
        Iterator<h9> it = w7Var.C.iterator();
        while (it.hasNext()) {
            h9 next = it.next();
            if (next != null) {
                next.h(w7Var, this.f30976s);
            }
        }
    }
}
