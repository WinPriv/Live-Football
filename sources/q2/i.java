package q2;

import android.graphics.PointF;
import java.io.IOException;
import r2.c;

/* compiled from: DocumentDataParser.java */
/* loaded from: classes.dex */
public final class i implements k0<l2.b> {

    /* renamed from: a, reason: collision with root package name */
    public static final i f34582a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final c.a f34583b = c.a.a(com.anythink.core.common.t.f6511a, "f", "s", "j", "tr", "lh", "ls", "fc", com.anythink.expressad.d.a.b.bH, "sw", "of", "ps", "sz");

    @Override // q2.k0
    public final l2.b a(r2.c cVar, float f) throws IOException {
        cVar.c();
        int i10 = 3;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = true;
        while (cVar.g()) {
            switch (cVar.P(f34583b)) {
                case 0:
                    str = cVar.k();
                    break;
                case 1:
                    str2 = cVar.k();
                    break;
                case 2:
                    f10 = (float) cVar.i();
                    break;
                case 3:
                    int j10 = cVar.j();
                    if (j10 <= 2 && j10 >= 0) {
                        i10 = s.f.d(3)[j10];
                        break;
                    } else {
                        i10 = 3;
                        break;
                    }
                    break;
                case 4:
                    i11 = cVar.j();
                    break;
                case 5:
                    f11 = (float) cVar.i();
                    break;
                case 6:
                    f12 = (float) cVar.i();
                    break;
                case 7:
                    i12 = s.a(cVar);
                    break;
                case 8:
                    i13 = s.a(cVar);
                    break;
                case 9:
                    f13 = (float) cVar.i();
                    break;
                case 10:
                    z10 = cVar.h();
                    break;
                case 11:
                    cVar.b();
                    PointF pointF3 = new PointF(((float) cVar.i()) * f, ((float) cVar.i()) * f);
                    cVar.d();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.b();
                    PointF pointF4 = new PointF(((float) cVar.i()) * f, ((float) cVar.i()) * f);
                    cVar.d();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.Q();
                    cVar.S();
                    break;
            }
        }
        cVar.e();
        return new l2.b(str, str2, f10, i10, i11, f11, f12, i12, i13, f13, z10, pointF, pointF2);
    }
}
