package c6;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: DataSource.java */
/* loaded from: classes2.dex */
public interface j extends h {

    /* compiled from: DataSource.java */
    /* loaded from: classes2.dex */
    public interface a {
        j a();
    }

    void b(h0 h0Var);

    void close() throws IOException;

    long f(m mVar) throws IOException;

    default Map<String, List<String>> g() {
        return Collections.emptyMap();
    }

    Uri getUri();
}
