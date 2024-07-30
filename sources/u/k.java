package u;

import androidx.constraintlayout.widget.ConstraintLayout;
import v.b;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public class k extends i {

    /* renamed from: u0, reason: collision with root package name */
    public int f35704u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public int f35705v0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    public int f35706w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public int f35707x0 = 0;
    public int y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    public int f35708z0 = 0;
    public boolean A0 = false;
    public int B0 = 0;
    public int C0 = 0;
    public final b.a D0 = new b.a();
    public b.InterfaceC0495b E0 = null;

    public final void T(d dVar, int i10, int i11, int i12, int i13) {
        b.InterfaceC0495b interfaceC0495b;
        boolean z10;
        d dVar2;
        while (true) {
            interfaceC0495b = this.E0;
            if (interfaceC0495b != null || (dVar2 = this.W) == null) {
                break;
            } else {
                this.E0 = ((e) dVar2).f35673w0;
            }
        }
        b.a aVar = this.D0;
        aVar.f35854a = i10;
        aVar.f35855b = i12;
        aVar.f35856c = i11;
        aVar.f35857d = i13;
        ((ConstraintLayout.b) interfaceC0495b).b(dVar, aVar);
        dVar.O(aVar.f35858e);
        dVar.L(aVar.f);
        dVar.F = aVar.f35860h;
        int i14 = aVar.f35859g;
        dVar.f35636d0 = i14;
        if (i14 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.F = z10;
    }

    @Override // u.i, u.h
    public final void a() {
        for (int i10 = 0; i10 < this.f35703t0; i10++) {
            d dVar = this.f35702s0[i10];
            if (dVar != null) {
                dVar.H = true;
            }
        }
    }

    public void S(int i10, int i11, int i12, int i13) {
    }
}
