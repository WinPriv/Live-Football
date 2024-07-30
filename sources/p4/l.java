package p4;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: ExtractorsFactory.java */
/* loaded from: classes2.dex */
public interface l {
    default h[] a(Uri uri, Map<String, List<String>> map) {
        return createExtractors();
    }

    h[] createExtractors();
}
