package ka;

/* loaded from: classes2.dex */
public final class d6 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a6 f31092s;

    public d6(a6 a6Var) {
        this.f31092s = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        a6 a6Var = this.f31092s;
        synchronized (a6Var) {
            z10 = a6Var.D;
        }
        if (z10) {
            a6Var.H = null;
        } else {
            a6Var.invalidateSelf();
            a6Var.c();
        }
    }
}
