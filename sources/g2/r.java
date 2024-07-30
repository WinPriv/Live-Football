package g2;

import g2.a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements a0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f28450b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28451c;

    public /* synthetic */ r(a0 a0Var, int i10, int i11) {
        this.f28449a = i11;
        this.f28450b = a0Var;
        this.f28451c = i10;
    }

    @Override // g2.a0.b
    public final void run() {
        int i10 = this.f28449a;
        int i11 = this.f28451c;
        a0 a0Var = this.f28450b;
        switch (i10) {
            case 0:
                a0Var.r(i11);
                return;
            default:
                a0Var.m(i11);
                return;
        }
    }
}
