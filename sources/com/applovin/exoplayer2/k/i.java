package com.applovin.exoplayer2.k;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface i extends g {

    /* loaded from: classes.dex */
    public interface a {
        i a();
    }

    long a(l lVar) throws IOException;

    Uri a();

    void a(aa aaVar);

    default Map<String, List<String>> b() {
        return Collections.emptyMap();
    }

    void c() throws IOException;
}
