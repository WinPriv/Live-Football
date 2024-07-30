package ka;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class z7 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f32239s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w7 f32240t;

    public z7(w7 w7Var, int i10) {
        this.f32240t = w7Var;
        this.f32239s = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<e9> it = this.f32240t.D.iterator();
        while (it.hasNext()) {
            e9 next = it.next();
            if (next != null) {
                next.a(this.f32239s);
            }
        }
    }
}
