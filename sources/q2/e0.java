package q2;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import r2.c;

/* compiled from: ShapeDataParser.java */
/* loaded from: classes.dex */
public final class e0 implements k0<n2.l> {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f34574a = new e0();

    /* renamed from: b, reason: collision with root package name */
    public static final c.a f34575b = c.a.a("c", "v", com.anythink.basead.d.i.f3957a, "o");

    @Override // q2.k0
    public final n2.l a(r2.c cVar, float f) throws IOException {
        if (cVar.l() == 1) {
            cVar.b();
        }
        cVar.c();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z10 = false;
        while (cVar.g()) {
            int P = cVar.P(f34575b);
            if (P != 0) {
                if (P != 1) {
                    if (P != 2) {
                        if (P != 3) {
                            cVar.Q();
                            cVar.S();
                        } else {
                            arrayList3 = s.c(cVar, f);
                        }
                    } else {
                        arrayList2 = s.c(cVar, f);
                    }
                } else {
                    arrayList = s.c(cVar, f);
                }
            } else {
                z10 = cVar.h();
            }
        }
        cVar.e();
        if (cVar.l() == 2) {
            cVar.d();
        }
        if (arrayList != null && arrayList2 != null && arrayList3 != null) {
            if (arrayList.isEmpty()) {
                return new n2.l(new PointF(), false, Collections.emptyList());
            }
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i10 = 1; i10 < size; i10++) {
                PointF pointF2 = (PointF) arrayList.get(i10);
                int i11 = i10 - 1;
                arrayList4.add(new l2.a(s2.f.a((PointF) arrayList.get(i11), (PointF) arrayList3.get(i11)), s2.f.a(pointF2, (PointF) arrayList2.get(i10)), pointF2));
            }
            if (z10) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i12 = size - 1;
                arrayList4.add(new l2.a(s2.f.a((PointF) arrayList.get(i12), (PointF) arrayList3.get(i12)), s2.f.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new n2.l(pointF, z10, arrayList4);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
