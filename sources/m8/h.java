package m8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Gson.java */
/* loaded from: classes2.dex */
public final class h extends a0<AtomicLongArray> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f32913a;

    public h(a0 a0Var) {
        this.f32913a = a0Var;
    }

    @Override // m8.a0
    public final AtomicLongArray a(s8.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.l()) {
            arrayList.add(Long.valueOf(((Number) this.f32913a.a(aVar)).longValue()));
        }
        aVar.f();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
        }
        return atomicLongArray;
    }

    @Override // m8.a0
    public final void b(s8.b bVar, AtomicLongArray atomicLongArray) throws IOException {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        bVar.c();
        int length = atomicLongArray2.length();
        for (int i10 = 0; i10 < length; i10++) {
            this.f32913a.b(bVar, Long.valueOf(atomicLongArray2.get(i10)));
        }
        bVar.f();
    }
}
