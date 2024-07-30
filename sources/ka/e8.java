package ka;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class e8 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f31124s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w7 f31125t;

    public e8(w7 w7Var, int i10) {
        this.f31125t = w7Var;
        this.f31124s = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<g9> it = this.f31125t.G.iterator();
        while (it.hasNext()) {
            g9 next = it.next();
            if (next != null) {
                next.a(this.f31124s);
            }
        }
    }
}
