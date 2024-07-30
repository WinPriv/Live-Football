package androidx.media;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.g f2079s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.f f2080t;

    public g(MediaBrowserServiceCompat.f fVar, MediaBrowserServiceCompat.h hVar) {
        this.f2080t = fVar;
        this.f2079s = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((MediaBrowserServiceCompat.h) this.f2079s).a();
        MediaBrowserServiceCompat.b remove = MediaBrowserServiceCompat.this.f2031v.remove(a10);
        if (remove != null) {
            a10.unlinkToDeath(remove, 0);
        }
    }
}
