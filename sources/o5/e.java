package o5;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: FullSegmentEncryptionKeyCache.java */
/* loaded from: classes2.dex */
public final class e extends LinkedHashMap<Uri, byte[]> {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f33635s = 4;

    public e(int i10) {
        super(i10, 1.0f, false);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
        if (size() > this.f33635s) {
            return true;
        }
        return false;
    }
}
