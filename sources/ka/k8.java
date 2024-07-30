package ka;

import ka.r8;

/* loaded from: classes2.dex */
public final class k8 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w7 f31372s;

    public k8(w7 w7Var) {
        this.f31372s = w7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w7 w7Var = this.f31372s;
        r8 r8Var = w7Var.f32087m;
        n7.f("MediaPlayerAgent", "prepareInternal - current state: %s - agent: %s", r8Var, w7Var);
        if (!r8Var.b(r8.b.END) && r8Var.b(r8.b.INITIALIZED)) {
            w7Var.f32082h = true;
            w7Var.l(false);
        }
    }
}
