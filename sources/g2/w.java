package g2;

import g2.a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements a0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f28461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28462c;

    public /* synthetic */ w(a0 a0Var, String str, int i10) {
        this.f28460a = i10;
        this.f28461b = a0Var;
        this.f28462c = str;
    }

    @Override // g2.a0.b
    public final void run() {
        int i10 = this.f28460a;
        String str = this.f28462c;
        a0 a0Var = this.f28461b;
        switch (i10) {
            case 0:
                a0Var.s(str);
                return;
            default:
                a0Var.q(str);
                return;
        }
    }
}
