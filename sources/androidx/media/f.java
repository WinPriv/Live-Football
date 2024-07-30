package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Iterator;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.g f2074s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2075t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f2076u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2077v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.f f2078w;

    public f(int i10, int i11, Bundle bundle, MediaBrowserServiceCompat.f fVar, MediaBrowserServiceCompat.h hVar, String str) {
        this.f2078w = fVar;
        this.f2074s = hVar;
        this.f2075t = i10;
        this.f2076u = str;
        this.f2077v = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.b bVar;
        IBinder a10 = ((MediaBrowserServiceCompat.h) this.f2074s).a();
        MediaBrowserServiceCompat.f fVar = this.f2078w;
        MediaBrowserServiceCompat.this.f2031v.remove(a10);
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        Iterator<MediaBrowserServiceCompat.b> it = mediaBrowserServiceCompat.f2030u.iterator();
        while (true) {
            bVar = null;
            if (!it.hasNext()) {
                break;
            }
            MediaBrowserServiceCompat.b next = it.next();
            if (next.f2045c == this.f2075t) {
                if (TextUtils.isEmpty(this.f2076u) || this.f2077v <= 0) {
                    bVar = new MediaBrowserServiceCompat.b(next.f2043a, next.f2044b, next.f2045c, this.f2074s);
                }
                it.remove();
            }
        }
        if (bVar == null) {
            bVar = new MediaBrowserServiceCompat.b(this.f2076u, this.f2077v, this.f2075t, this.f2074s);
        }
        mediaBrowserServiceCompat.f2031v.put(a10, bVar);
        try {
            a10.linkToDeath(bVar, 0);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
