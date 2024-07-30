package v;

import java.util.ArrayList;

/* compiled from: Grouping.java */
/* loaded from: classes.dex */
public final class i {
    public static o a(u.d dVar, int i10, ArrayList<o> arrayList, o oVar) {
        int i11;
        boolean z10;
        int i12;
        if (i10 == 0) {
            i11 = dVar.f35660q0;
        } else {
            i11 = dVar.f35662r0;
        }
        int i13 = 0;
        if (i11 != -1 && (oVar == null || i11 != oVar.f35891b)) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i14);
                if (oVar2.f35891b == i11) {
                    if (oVar != null) {
                        oVar.c(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i14++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (dVar instanceof u.i) {
                u.i iVar = (u.i) dVar;
                int i15 = 0;
                while (true) {
                    if (i15 < iVar.f35703t0) {
                        u.d dVar2 = iVar.f35702s0[i15];
                        if ((i10 == 0 && (i12 = dVar2.f35660q0) != -1) || (i10 == 1 && (i12 = dVar2.f35662r0) != -1)) {
                            break;
                        }
                        i15++;
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 != -1) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i16);
                        if (oVar3.f35891b == i12) {
                            oVar = oVar3;
                            break;
                        }
                        i16++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        ArrayList<u.d> arrayList2 = oVar.f35890a;
        if (arrayList2.contains(dVar)) {
            z10 = false;
        } else {
            arrayList2.add(dVar);
            z10 = true;
        }
        if (z10) {
            if (dVar instanceof u.g) {
                u.g gVar = (u.g) dVar;
                u.c cVar = gVar.f35699v0;
                if (gVar.f35700w0 == 0) {
                    i13 = 1;
                }
                cVar.c(i13, oVar, arrayList);
            }
            int i17 = oVar.f35891b;
            if (i10 == 0) {
                dVar.f35660q0 = i17;
                dVar.K.c(i10, oVar, arrayList);
                dVar.M.c(i10, oVar, arrayList);
            } else {
                dVar.f35662r0 = i17;
                dVar.L.c(i10, oVar, arrayList);
                dVar.O.c(i10, oVar, arrayList);
                dVar.N.c(i10, oVar, arrayList);
            }
            dVar.R.c(i10, oVar, arrayList);
        }
        return oVar;
    }

    public static boolean b(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        if (i12 != 1 && i12 != 2 && (i12 != 4 || i10 == 2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i13 != 1 && i13 != 2 && (i13 != 4 || i11 == 2)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 || z11) {
            return true;
        }
        return false;
    }
}
