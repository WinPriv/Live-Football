package o4;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* compiled from: DrmUtil.java */
/* loaded from: classes2.dex */
public final class d {
    public static boolean a(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
