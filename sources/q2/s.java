package q2;

import android.graphics.Color;
import android.graphics.PointF;
import com.huawei.hms.ads.gl;
import java.io.IOException;
import java.util.ArrayList;
import r2.c;

/* compiled from: JsonUtils.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f34609a = c.a.a("x", "y");

    public static int a(r2.c cVar) throws IOException {
        cVar.b();
        int i10 = (int) (cVar.i() * 255.0d);
        int i11 = (int) (cVar.i() * 255.0d);
        int i12 = (int) (cVar.i() * 255.0d);
        while (cVar.g()) {
            cVar.S();
        }
        cVar.d();
        return Color.argb(com.anythink.expressad.exoplayer.k.p.f9095b, i10, i11, i12);
    }

    public static PointF b(r2.c cVar, float f) throws IOException {
        int c10 = s.f.c(cVar.l());
        if (c10 != 0) {
            if (c10 != 2) {
                if (c10 == 6) {
                    float i10 = (float) cVar.i();
                    float i11 = (float) cVar.i();
                    while (cVar.g()) {
                        cVar.S();
                    }
                    return new PointF(i10 * f, i11 * f);
                }
                throw new IllegalArgumentException("Unknown point starts with ".concat(com.ironsource.adapters.facebook.a.y(cVar.l())));
            }
            cVar.c();
            float f10 = gl.Code;
            float f11 = 0.0f;
            while (cVar.g()) {
                int P = cVar.P(f34609a);
                if (P != 0) {
                    if (P != 1) {
                        cVar.Q();
                        cVar.S();
                    } else {
                        f11 = d(cVar);
                    }
                } else {
                    f10 = d(cVar);
                }
            }
            cVar.e();
            return new PointF(f10 * f, f11 * f);
        }
        cVar.b();
        float i12 = (float) cVar.i();
        float i13 = (float) cVar.i();
        while (cVar.l() != 2) {
            cVar.S();
        }
        cVar.d();
        return new PointF(i12 * f, i13 * f);
    }

    public static ArrayList c(r2.c cVar, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.b();
        while (cVar.l() == 1) {
            cVar.b();
            arrayList.add(b(cVar, f));
            cVar.d();
        }
        cVar.d();
        return arrayList;
    }

    public static float d(r2.c cVar) throws IOException {
        int l10 = cVar.l();
        int c10 = s.f.c(l10);
        if (c10 != 0) {
            if (c10 == 6) {
                return (float) cVar.i();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(com.ironsource.adapters.facebook.a.y(l10)));
        }
        cVar.b();
        float i10 = (float) cVar.i();
        while (cVar.g()) {
            cVar.S();
        }
        cVar.d();
        return i10;
    }
}
