package u;

import java.util.ArrayList;
import v.o;

/* compiled from: HelperWidget.java */
/* loaded from: classes.dex */
public class i extends d implements h {

    /* renamed from: s0, reason: collision with root package name */
    public d[] f35702s0 = new d[4];

    /* renamed from: t0, reason: collision with root package name */
    public int f35703t0 = 0;

    public final void R(int i10, o oVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f35703t0; i11++) {
            d dVar = this.f35702s0[i11];
            ArrayList<d> arrayList2 = oVar.f35890a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i12 = 0; i12 < this.f35703t0; i12++) {
            v.i.a(this.f35702s0[i12], i10, arrayList, oVar);
        }
    }

    @Override // u.h
    public void a() {
    }
}
