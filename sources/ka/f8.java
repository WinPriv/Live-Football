package ka;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class f8 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f31171s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w7 f31172t;

    public f8(w7 w7Var, int i10) {
        this.f31172t = w7Var;
        this.f31171s = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<g9> it = this.f31172t.G.iterator();
        while (it.hasNext()) {
            g9 next = it.next();
            if (next != null) {
                next.b(this.f31171s);
            }
        }
    }
}
