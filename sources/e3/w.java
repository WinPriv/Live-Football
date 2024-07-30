package e3;

import android.net.Uri;
import e3.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UrlUriLoader.java */
/* loaded from: classes.dex */
public final class w<Data> implements n<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f27741b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final n<f, Data> f27742a;

    /* compiled from: UrlUriLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {
        @Override // e3.o
        public final n<Uri, InputStream> a(r rVar) {
            return new w(rVar.b(f.class, InputStream.class));
        }
    }

    public w(n<f, Data> nVar) {
        this.f27742a = nVar;
    }

    @Override // e3.n
    public final boolean a(Uri uri) {
        return f27741b.contains(uri.getScheme());
    }

    @Override // e3.n
    public final n.a b(Uri uri, int i10, int i11, y2.g gVar) {
        return this.f27742a.b(new f(uri.toString()), i10, i11, gVar);
    }
}
