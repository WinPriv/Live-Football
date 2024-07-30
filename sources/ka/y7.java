package ka;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class y7 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f32212s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w7 f32213t;

    public y7(w7 w7Var, int i10) {
        this.f32213t = w7Var;
        this.f32212s = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w7 w7Var = this.f32213t;
        Iterator<h9> it = w7Var.C.iterator();
        while (it.hasNext()) {
            h9 next = it.next();
            if (next != null) {
                next.m(w7Var, this.f32212s);
            }
        }
    }
}
