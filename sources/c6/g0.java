package c6;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: StatsDataSource.java */
/* loaded from: classes2.dex */
public final class g0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f3354a;

    /* renamed from: b, reason: collision with root package name */
    public long f3355b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f3356c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, List<String>> f3357d;

    public g0(j jVar) {
        jVar.getClass();
        this.f3354a = jVar;
        this.f3356c = Uri.EMPTY;
        this.f3357d = Collections.emptyMap();
    }

    @Override // c6.j
    public final void b(h0 h0Var) {
        h0Var.getClass();
        this.f3354a.b(h0Var);
    }

    @Override // c6.j
    public final void close() throws IOException {
        this.f3354a.close();
    }

    @Override // c6.j
    public final long f(m mVar) throws IOException {
        this.f3356c = mVar.f3377a;
        this.f3357d = Collections.emptyMap();
        long f = this.f3354a.f(mVar);
        Uri uri = getUri();
        uri.getClass();
        this.f3356c = uri;
        this.f3357d = g();
        return f;
    }

    @Override // c6.j
    public final Map<String, List<String>> g() {
        return this.f3354a.g();
    }

    @Override // c6.j
    public final Uri getUri() {
        return this.f3354a.getUri();
    }

    @Override // c6.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.f3354a.read(bArr, i10, i11);
        if (read != -1) {
            this.f3355b += read;
        }
        return read;
    }
}
