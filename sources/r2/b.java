package r2;

import java.io.IOException;

/* compiled from: JsonEncodingException.java */
/* loaded from: classes.dex */
public final class b extends IOException {
    public /* synthetic */ b(String str) {
        super(str);
    }

    public /* synthetic */ b(int i10, String str, IOException iOException) {
        super(str + ", status code: " + i10, iOException);
    }
}
