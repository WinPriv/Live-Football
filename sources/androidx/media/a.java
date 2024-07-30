package androidx.media;

import a3.l;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.g f2054s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2055t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2056u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2057v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.f f2058w;

    public a(int i10, int i11, Bundle bundle, MediaBrowserServiceCompat.f fVar, MediaBrowserServiceCompat.h hVar, String str) {
        this.f2058w = fVar;
        this.f2054s = hVar;
        this.f2055t = str;
        this.f2056u = i10;
        this.f2057v = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.g gVar = this.f2054s;
        IBinder a10 = ((MediaBrowserServiceCompat.h) gVar).a();
        MediaBrowserServiceCompat.f fVar = this.f2058w;
        MediaBrowserServiceCompat.this.f2031v.remove(a10);
        MediaBrowserServiceCompat.b bVar = new MediaBrowserServiceCompat.b(this.f2055t, this.f2056u, this.f2057v, this.f2054s);
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        mediaBrowserServiceCompat.getClass();
        bVar.f = mediaBrowserServiceCompat.a();
        mediaBrowserServiceCompat.getClass();
        MediaBrowserServiceCompat.a aVar = bVar.f;
        String str = this.f2055t;
        if (aVar == null) {
            StringBuilder s10 = l.s("No root for client ", str, " from service ");
            s10.append(a.class.getName());
            Log.i("MBServiceCompat", s10.toString());
            try {
                MediaBrowserServiceCompat.h hVar = (MediaBrowserServiceCompat.h) gVar;
                hVar.getClass();
                Message obtain = Message.obtain();
                obtain.what = 2;
                obtain.arg1 = 2;
                obtain.setData(null);
                hVar.f2052a.send(obtain);
                return;
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + str);
                return;
            }
        }
        try {
            mediaBrowserServiceCompat.f2031v.put(a10, bVar);
            a10.linkToDeath(bVar, 0);
            mediaBrowserServiceCompat.getClass();
        } catch (RemoteException unused2) {
            Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + str);
            mediaBrowserServiceCompat.f2031v.remove(a10);
        }
    }
}
