package q2;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import com.huawei.hms.ads.gl;
import r2.c;
import s2.g;

/* compiled from: KeyframeParser.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f34610a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final c.a f34611b = c.a.a(com.anythink.core.common.t.f6511a, "s", com.anythink.core.c.e.f4869a, "o", com.anythink.basead.d.i.f3957a, "h", "to", "ti");

    /* renamed from: c, reason: collision with root package name */
    public static final c.a f34612c = c.a.a("x", "y");

    public static BaseInterpolator a(PointF pointF, PointF pointF2) {
        pointF.x = s2.f.b(pointF.x, -1.0f, 1.0f);
        pointF.y = s2.f.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = s2.f.b(pointF2.x, -1.0f, 1.0f);
        float b10 = s2.f.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        float f = pointF.x;
        float f10 = pointF.y;
        float f11 = pointF2.x;
        g.a aVar = s2.g.f35111a;
        try {
            return p0.a.b(f, f10, f11, b10);
        } catch (IllegalArgumentException e10) {
            if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                return p0.a.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, gl.Code), pointF2.y);
            }
            return new LinearInterpolator();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:139:0x025b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.animation.BaseInterpolator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> t2.a<T> b(r2.c r23, g2.h r24, float r25, q2.k0<T> r26, boolean r27, boolean r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.t.b(r2.c, g2.h, float, q2.k0, boolean, boolean):t2.a");
    }
}
