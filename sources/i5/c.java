package i5;

import android.net.Uri;
import c6.d0;
import c6.l;
import com.google.android.exoplayer2.offline.StreamKey;
import i5.b;
import java.io.IOException;
import java.util.List;

/* compiled from: FilteringManifestParser.java */
/* loaded from: classes2.dex */
public final class c<T extends b<T>> implements d0.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final d0.a<? extends T> f29168a;

    /* renamed from: b, reason: collision with root package name */
    public final List<StreamKey> f29169b;

    public c(d0.a<? extends T> aVar, List<StreamKey> list) {
        this.f29168a = aVar;
        this.f29169b = list;
    }

    @Override // c6.d0.a
    public final Object a(Uri uri, l lVar) throws IOException {
        b bVar = (b) this.f29168a.a(uri, lVar);
        List<StreamKey> list = this.f29169b;
        if (list != null && !list.isEmpty()) {
            return (b) bVar.a(list);
        }
        return bVar;
    }
}
