package v;

import java.util.ArrayList;

/* compiled from: RunGroup.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final p f35886a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<p> f35887b = new ArrayList<>();

    public m(p pVar) {
        this.f35886a = null;
        this.f35886a = pVar;
    }

    public static long a(f fVar, long j10) {
        p pVar = fVar.f35875d;
        if (pVar instanceof k) {
            return j10;
        }
        ArrayList arrayList = fVar.f35881k;
        int size = arrayList.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f35875d != pVar) {
                    j11 = Math.min(j11, a(fVar2, fVar2.f + j10));
                }
            }
        }
        if (fVar == pVar.f35902i) {
            long j12 = pVar.j();
            long j13 = j10 - j12;
            return Math.min(Math.min(j11, a(pVar.f35901h, j13)), j13 - r9.f);
        }
        return j11;
    }

    public static long b(f fVar, long j10) {
        p pVar = fVar.f35875d;
        if (pVar instanceof k) {
            return j10;
        }
        ArrayList arrayList = fVar.f35881k;
        int size = arrayList.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f35875d != pVar) {
                    j11 = Math.max(j11, b(fVar2, fVar2.f + j10));
                }
            }
        }
        if (fVar == pVar.f35901h) {
            long j12 = pVar.j();
            long j13 = j10 + j12;
            return Math.max(Math.max(j11, b(pVar.f35902i, j13)), j13 - r9.f);
        }
        return j11;
    }
}
