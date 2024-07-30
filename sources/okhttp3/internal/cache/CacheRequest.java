package okhttp3.internal.cache;

import java.io.IOException;
import okio.y;

/* loaded from: classes2.dex */
public interface CacheRequest {
    void abort();

    y body() throws IOException;
}
