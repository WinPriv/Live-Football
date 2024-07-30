package g2;

import g2.a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements a0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f28457b;

    public /* synthetic */ u(a0 a0Var, int i10) {
        this.f28456a = i10;
        this.f28457b = a0Var;
    }

    @Override // g2.a0.b
    public final void run() {
        int i10 = this.f28456a;
        a0 a0Var = this.f28457b;
        switch (i10) {
            case 0:
                a0Var.l();
                return;
            default:
                a0Var.j();
                return;
        }
    }
}
