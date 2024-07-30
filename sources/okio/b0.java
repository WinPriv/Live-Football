package okio;

import java.nio.charset.Charset;

/* compiled from: Util.java */
/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f33832a = Charset.forName("UTF-8");

    public static void a(long j10, long j11, long j12) {
        if ((j11 | j12) >= 0 && j11 <= j10 && j10 - j11 >= j12) {
        } else {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12)));
        }
    }
}
