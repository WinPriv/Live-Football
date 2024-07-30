package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.g f2085s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2086t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Bundle f2087u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f2088v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.f f2089w;

    public i(MediaBrowserServiceCompat.f fVar, MediaBrowserServiceCompat.h hVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f2089w = fVar;
        this.f2085s = hVar;
        this.f2086t = str;
        this.f2087u = bundle;
        this.f2088v = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((MediaBrowserServiceCompat.h) this.f2085s).a();
        MediaBrowserServiceCompat.f fVar = this.f2089w;
        if (MediaBrowserServiceCompat.this.f2031v.getOrDefault(a10, null) == null) {
            Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f2086t + ", extras=" + this.f2087u);
            return;
        }
        MediaBrowserServiceCompat.this.getClass();
        this.f2088v.c(-1, null);
    }
}
