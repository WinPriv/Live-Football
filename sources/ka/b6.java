package ka;

/* loaded from: classes2.dex */
public final class b6 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a6 f30974s;

    public b6(a6 a6Var) {
        this.f30974s = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a6 a6Var = this.f30974s;
        a6Var.getClass();
        String d10 = a6Var.d();
        StringBuilder sb2 = new StringBuilder("replay ");
        String str = a6Var.f30923z;
        sb2.append(com.huawei.openalliance.ad.ppskit.utils.y1.j(str));
        n7.e(d10, sb2.toString());
        a6Var.J.b(new y5(a6Var, str));
    }
}
