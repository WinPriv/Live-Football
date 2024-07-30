package c6;

import c6.a0;
import c6.b0;
import java.io.FileNotFoundException;
import java.io.IOException;
import k4.z0;

/* compiled from: DefaultLoadErrorHandlingPolicy.java */
/* loaded from: classes2.dex */
public final class t implements a0 {
    @Override // c6.a0
    public final long a(a0.c cVar) {
        boolean z10;
        Throwable th = cVar.f3294a;
        if (!(th instanceof z0) && !(th instanceof FileNotFoundException) && !(th instanceof v) && !(th instanceof b0.g)) {
            int i10 = k.f3369t;
            while (true) {
                if (th != null) {
                    if ((th instanceof k) && ((k) th).f3370s == 2008) {
                        z10 = true;
                        break;
                    }
                    th = th.getCause();
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                return Math.min((cVar.f3295b - 1) * 1000, 5000);
            }
        }
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // c6.a0
    public final a0.b b(a0.a aVar, a0.c cVar) {
        boolean z10;
        int i10;
        IOException iOException = cVar.f3294a;
        if (!(iOException instanceof y) || ((i10 = ((y) iOException).f3448v) != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return null;
        }
        if (aVar.a(1)) {
            return new a0.b(1, com.huawei.openalliance.ad.constant.w.as);
        }
        if (!aVar.a(2)) {
            return null;
        }
        return new a0.b(2, 60000L);
    }

    @Override // c6.a0
    public final int c(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return 3;
    }
}
