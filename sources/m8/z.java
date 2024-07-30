package m8;

import java.io.IOException;

/* compiled from: TypeAdapter.java */
/* loaded from: classes2.dex */
public final class z extends a0<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f32949a;

    public z(a0 a0Var) {
        this.f32949a = a0Var;
    }

    @Override // m8.a0
    public final Object a(s8.a aVar) throws IOException {
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        return this.f32949a.a(aVar);
    }

    @Override // m8.a0
    public final void b(s8.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.j();
        } else {
            this.f32949a.b(bVar, obj);
        }
    }
}
