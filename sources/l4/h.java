package l4;

import d6.o;
import l4.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements o.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f32409s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.a f32410t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f32411u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f32412v;

    public /* synthetic */ h(b.a aVar, int i10, long j10, long j11, int i11) {
        this.f32409s = i11;
        this.f32410t = aVar;
        this.f32411u = i10;
        this.f32412v = j10;
    }

    @Override // d6.o.a
    public final void invoke(Object obj) {
        switch (this.f32409s) {
            case 0:
                ((b) obj).getClass();
                return;
            default:
                ((b) obj).f(this.f32410t, this.f32411u, this.f32412v);
                return;
        }
    }
}
