package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.g f2081s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2082t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f2083u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.f f2084v;

    public h(MediaBrowserServiceCompat.f fVar, MediaBrowserServiceCompat.h hVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f2084v = fVar;
        this.f2081s = hVar;
        this.f2082t = str;
        this.f2083u = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((MediaBrowserServiceCompat.h) this.f2081s).a();
        MediaBrowserServiceCompat.f fVar = this.f2084v;
        if (MediaBrowserServiceCompat.this.f2031v.getOrDefault(a10, null) == null) {
            Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f2082t);
        } else {
            MediaBrowserServiceCompat.this.getClass();
            this.f2083u.c(-1, null);
        }
    }
}
