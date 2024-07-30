package g2;

import g2.a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements a0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f28469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28471c;

    public /* synthetic */ z(a0 a0Var, int i10, int i11) {
        this.f28469a = a0Var;
        this.f28470b = i10;
        this.f28471c = i11;
    }

    @Override // g2.a0.b
    public final void run() {
        a0 a0Var = this.f28469a;
        h hVar = a0Var.f28357s;
        int i10 = this.f28470b;
        int i11 = this.f28471c;
        if (hVar == null) {
            a0Var.y.add(new z(a0Var, i10, i11));
        } else {
            a0Var.f28358t.h(i10, i11 + 0.99f);
        }
    }
}
