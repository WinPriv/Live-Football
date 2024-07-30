package o4;

import android.media.MediaDrm;
import d6.g0;

/* compiled from: DrmUtil.java */
/* loaded from: classes2.dex */
public final class e {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        return g0.r(g0.s(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}
