package v;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;

/* compiled from: BasicMeasure.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<u.d> f35851a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final a f35852b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final u.e f35853c;

    /* compiled from: BasicMeasure.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f35854a;

        /* renamed from: b, reason: collision with root package name */
        public int f35855b;

        /* renamed from: c, reason: collision with root package name */
        public int f35856c;

        /* renamed from: d, reason: collision with root package name */
        public int f35857d;

        /* renamed from: e, reason: collision with root package name */
        public int f35858e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f35859g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f35860h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f35861i;

        /* renamed from: j, reason: collision with root package name */
        public int f35862j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: v.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0495b {
    }

    public b(u.e eVar) {
        this.f35853c = eVar;
    }

    public final boolean a(int i10, u.d dVar, InterfaceC0495b interfaceC0495b) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int[] iArr = dVar.V;
        int i11 = iArr[0];
        a aVar = this.f35852b;
        aVar.f35854a = i11;
        boolean z14 = true;
        aVar.f35855b = iArr[1];
        aVar.f35856c = dVar.r();
        aVar.f35857d = dVar.l();
        aVar.f35861i = false;
        aVar.f35862j = i10;
        if (aVar.f35854a == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (aVar.f35855b == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && dVar.Z > gl.Code) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && dVar.Z > gl.Code) {
            z13 = true;
        } else {
            z13 = false;
        }
        int[] iArr2 = dVar.f35665u;
        if (z12 && iArr2[0] == 4) {
            aVar.f35854a = 1;
        }
        if (z13 && iArr2[1] == 4) {
            aVar.f35855b = 1;
        }
        ((ConstraintLayout.b) interfaceC0495b).b(dVar, aVar);
        dVar.O(aVar.f35858e);
        dVar.L(aVar.f);
        dVar.F = aVar.f35860h;
        int i12 = aVar.f35859g;
        dVar.f35636d0 = i12;
        if (i12 <= 0) {
            z14 = false;
        }
        dVar.F = z14;
        aVar.f35862j = 0;
        return aVar.f35861i;
    }

    public final void b(u.e eVar, int i10, int i11, int i12) {
        int i13 = eVar.f35638e0;
        int i14 = eVar.f35639f0;
        eVar.f35638e0 = 0;
        eVar.f35639f0 = 0;
        eVar.O(i11);
        eVar.L(i12);
        if (i13 < 0) {
            eVar.f35638e0 = 0;
        } else {
            eVar.f35638e0 = i13;
        }
        if (i14 < 0) {
            eVar.f35639f0 = 0;
        } else {
            eVar.f35639f0 = i14;
        }
        u.e eVar2 = this.f35853c;
        eVar2.f35672v0 = i10;
        eVar2.R();
    }

    public final void c(u.e eVar) {
        ArrayList<u.d> arrayList = this.f35851a;
        arrayList.clear();
        int size = eVar.f35709s0.size();
        for (int i10 = 0; i10 < size; i10++) {
            u.d dVar = eVar.f35709s0.get(i10);
            int[] iArr = dVar.V;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f35671u0.f35866b = true;
    }
}
