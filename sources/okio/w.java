package okio;

import javax.annotation.Nullable;

/* compiled from: SegmentPool.java */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public static v f33883a;

    /* renamed from: b, reason: collision with root package name */
    public static long f33884b;

    public static void a(v vVar) {
        if (vVar.f == null && vVar.f33882g == null) {
            if (vVar.f33880d) {
                return;
            }
            synchronized (w.class) {
                long j10 = f33884b + 8192;
                if (j10 > 65536) {
                    return;
                }
                f33884b = j10;
                vVar.f = f33883a;
                vVar.f33879c = 0;
                vVar.f33878b = 0;
                f33883a = vVar;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static v b() {
        synchronized (w.class) {
            v vVar = f33883a;
            if (vVar != null) {
                f33883a = vVar.f;
                vVar.f = null;
                f33884b -= 8192;
                return vVar;
            }
            return new v();
        }
    }
}
