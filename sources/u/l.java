package u;

import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* loaded from: classes.dex */
public class l extends d {

    /* renamed from: s0, reason: collision with root package name */
    public ArrayList<d> f35709s0 = new ArrayList<>();

    @Override // u.d
    public void D() {
        this.f35709s0.clear();
        super.D();
    }

    @Override // u.d
    public final void G(m2.g gVar) {
        super.G(gVar);
        int size = this.f35709s0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35709s0.get(i10).G(gVar);
        }
    }

    public void R() {
        ArrayList<d> arrayList = this.f35709s0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = this.f35709s0.get(i10);
            if (dVar instanceof l) {
                ((l) dVar).R();
            }
        }
    }
}
