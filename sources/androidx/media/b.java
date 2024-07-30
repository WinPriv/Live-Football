package androidx.media;

import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.g f2059s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.f f2060t;

    public b(MediaBrowserServiceCompat.f fVar, MediaBrowserServiceCompat.h hVar) {
        this.f2060t = fVar;
        this.f2059s = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.b remove = MediaBrowserServiceCompat.this.f2031v.remove(((MediaBrowserServiceCompat.h) this.f2059s).a());
        if (remove != null) {
            ((MediaBrowserServiceCompat.h) remove.f2046d).a().unlinkToDeath(remove, 0);
        }
    }
}
