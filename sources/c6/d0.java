package c6;

import android.net.Uri;
import c6.b0;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: ParsingLoadable.java */
/* loaded from: classes2.dex */
public final class d0<T> implements b0.d {

    /* renamed from: a, reason: collision with root package name */
    public final long f3319a;

    /* renamed from: b, reason: collision with root package name */
    public final m f3320b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3321c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f3322d;

    /* renamed from: e, reason: collision with root package name */
    public final a<? extends T> f3323e;
    public volatile T f;

    /* compiled from: ParsingLoadable.java */
    /* loaded from: classes2.dex */
    public interface a<T> {
        Object a(Uri uri, l lVar) throws IOException;
    }

    public d0() {
        throw null;
    }

    public d0(j jVar, Uri uri, int i10, a<? extends T> aVar) {
        Map emptyMap = Collections.emptyMap();
        d6.a.f(uri, "The uri must be set.");
        m mVar = new m(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.f3322d = new g0(jVar);
        this.f3320b = mVar;
        this.f3321c = i10;
        this.f3323e = aVar;
        this.f3319a = j5.o.f29817b.getAndIncrement();
    }

    @Override // c6.b0.d
    public final void load() throws IOException {
        this.f3322d.f3355b = 0L;
        l lVar = new l(this.f3322d, this.f3320b);
        try {
            lVar.b();
            Uri uri = this.f3322d.getUri();
            uri.getClass();
            this.f = (T) this.f3323e.a(uri, lVar);
            try {
                lVar.close();
            } catch (IOException unused) {
            }
        } finally {
            int i10 = d6.g0.f27302a;
            try {
                lVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // c6.b0.d
    public final void a() {
    }
}
