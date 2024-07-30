package m8;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Gson.java */
/* loaded from: classes2.dex */
public final class g extends a0<AtomicLong> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f32912a;

    public g(a0 a0Var) {
        this.f32912a = a0Var;
    }

    @Override // m8.a0
    public final AtomicLong a(s8.a aVar) throws IOException {
        return new AtomicLong(((Number) this.f32912a.a(aVar)).longValue());
    }

    @Override // m8.a0
    public final void b(s8.b bVar, AtomicLong atomicLong) throws IOException {
        this.f32912a.b(bVar, Long.valueOf(atomicLong.get()));
    }
}
