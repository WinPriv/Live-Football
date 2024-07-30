package c6;

import java.util.ArrayList;

/* compiled from: BaseDataSource.java */
/* loaded from: classes2.dex */
public abstract class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3334a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<h0> f3335b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    public int f3336c;

    /* renamed from: d, reason: collision with root package name */
    public m f3337d;

    public f(boolean z10) {
        this.f3334a = z10;
    }

    @Override // c6.j
    public final void b(h0 h0Var) {
        h0Var.getClass();
        ArrayList<h0> arrayList = this.f3335b;
        if (!arrayList.contains(h0Var)) {
            arrayList.add(h0Var);
            this.f3336c++;
        }
    }

    public final void k(int i10) {
        m mVar = this.f3337d;
        int i11 = d6.g0.f27302a;
        for (int i12 = 0; i12 < this.f3336c; i12++) {
            this.f3335b.get(i12).g(mVar, this.f3334a, i10);
        }
    }

    public final void l() {
        m mVar = this.f3337d;
        int i10 = d6.g0.f27302a;
        for (int i11 = 0; i11 < this.f3336c; i11++) {
            this.f3335b.get(i11).f(mVar, this.f3334a);
        }
        this.f3337d = null;
    }

    public final void m(m mVar) {
        for (int i10 = 0; i10 < this.f3336c; i10++) {
            this.f3335b.get(i10).b();
        }
    }

    public final void n(m mVar) {
        this.f3337d = mVar;
        for (int i10 = 0; i10 < this.f3336c; i10++) {
            this.f3335b.get(i10).a(mVar, this.f3334a);
        }
    }
}
