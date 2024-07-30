package p5;

import android.net.Uri;
import c6.a0;
import j5.x;
import java.io.IOException;

/* compiled from: HlsPlaylistTracker.java */
/* loaded from: classes2.dex */
public interface j {

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        boolean g(Uri uri, a0.c cVar, boolean z10);
    }

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: classes2.dex */
    public static final class b extends IOException {
    }

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: classes2.dex */
    public static final class c extends IOException {
    }

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: classes2.dex */
    public interface d {
    }

    boolean a(Uri uri);

    void b(Uri uri) throws IOException;

    void c(a aVar);

    void d(Uri uri, x.a aVar, d dVar);

    void e(a aVar);

    long f();

    boolean h();

    f i();

    boolean j(Uri uri, long j10);

    void k() throws IOException;

    void l(Uri uri);

    e m(Uri uri, boolean z10);

    void stop();
}
