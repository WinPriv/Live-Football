package s2;

import android.graphics.PointF;
import i2.j;
import java.util.ArrayList;

/* compiled from: MiscUtils.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f35110a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f));
    }

    public static int c(float f, float f10) {
        boolean z10;
        int i10 = (int) f;
        int i11 = (int) f10;
        int i12 = i10 / i11;
        if ((i10 ^ i11) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = i10 % i11;
        if (!z10 && i13 != 0) {
            i12--;
        }
        return i10 - (i11 * i12);
    }

    public static void d(l2.e eVar, int i10, ArrayList arrayList, l2.e eVar2, j jVar) {
        if (eVar.a(i10, jVar.getName())) {
            String name = jVar.getName();
            eVar2.getClass();
            l2.e eVar3 = new l2.e(eVar2);
            eVar3.f32342a.add(name);
            l2.e eVar4 = new l2.e(eVar3);
            eVar4.f32343b = jVar;
            arrayList.add(eVar4);
        }
    }
}
