package ka;

/* loaded from: classes2.dex */
public final class x5 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a6 f32160s;

    public x5(a6 a6Var) {
        this.f32160s = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a6 a6Var = this.f32160s;
        w5 w5Var = a6Var.E;
        if (w5Var != null) {
            w5Var.b();
            a6Var.E = null;
        }
    }
}
