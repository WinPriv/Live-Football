package b6;

import android.os.SystemClock;
import c6.a0;

/* compiled from: TrackSelectionUtil.java */
/* loaded from: classes2.dex */
public final class l {
    public static a0.a a(f fVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = fVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (fVar.j(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new a0.a(1, 0, length, i10);
    }
}
