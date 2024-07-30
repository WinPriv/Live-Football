package c6;

import java.io.IOException;

/* compiled from: HttpDataSource.java */
/* loaded from: classes2.dex */
public final class v extends w {
    public v(IOException iOException) {
        super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, 2007);
    }
}
