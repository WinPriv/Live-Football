package ka;

/* loaded from: classes2.dex */
public final class u6 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v6 f31926s;

    public u6(v6 v6Var) {
        this.f31926s = v6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v6 v6Var = this.f31926s;
        n7.e(v6Var.a(), "unbindService");
        x6 x6Var = (x6) v6Var.f31988a;
        synchronized (x6Var) {
            x6Var.f32164d.unbindService(x6Var.f32166g);
            x6Var.f32162b = null;
        }
    }
}
