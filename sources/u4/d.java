package u4;

import p4.j;
import p4.u;
import p4.v;
import p4.w;

/* compiled from: StartOffsetExtractorOutput.java */
/* loaded from: classes2.dex */
public final class d implements j {

    /* renamed from: s, reason: collision with root package name */
    public final long f35773s;

    /* renamed from: t, reason: collision with root package name */
    public final j f35774t;

    /* compiled from: StartOffsetExtractorOutput.java */
    /* loaded from: classes2.dex */
    public class a implements u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u f35775a;

        public a(u uVar) {
            this.f35775a = uVar;
        }

        @Override // p4.u
        public final boolean e() {
            return this.f35775a.e();
        }

        @Override // p4.u
        public final u.a h(long j10) {
            u.a h10 = this.f35775a.h(j10);
            v vVar = h10.f34350a;
            long j11 = vVar.f34355a;
            long j12 = vVar.f34356b;
            long j13 = d.this.f35773s;
            v vVar2 = new v(j11, j12 + j13);
            v vVar3 = h10.f34351b;
            return new u.a(vVar2, new v(vVar3.f34355a, vVar3.f34356b + j13));
        }

        @Override // p4.u
        public final long i() {
            return this.f35775a.i();
        }
    }

    public d(long j10, j jVar) {
        this.f35773s = j10;
        this.f35774t = jVar;
    }

    @Override // p4.j
    public final void i(u uVar) {
        this.f35774t.i(new a(uVar));
    }

    @Override // p4.j
    public final void m() {
        this.f35774t.m();
    }

    @Override // p4.j
    public final w s(int i10, int i11) {
        return this.f35774t.s(i10, i11);
    }
}
