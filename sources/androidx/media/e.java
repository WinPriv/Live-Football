package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.g f2070s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2071t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f2072u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.f f2073v;

    public e(MediaBrowserServiceCompat.f fVar, MediaBrowserServiceCompat.h hVar, String str, ResultReceiver resultReceiver) {
        this.f2073v = fVar;
        this.f2070s = hVar;
        this.f2071t = str;
        this.f2072u = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((MediaBrowserServiceCompat.h) this.f2070s).a();
        MediaBrowserServiceCompat.f fVar = this.f2073v;
        if (MediaBrowserServiceCompat.this.f2031v.getOrDefault(a10, null) == null) {
            Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f2071t);
            return;
        }
        MediaBrowserServiceCompat.this.getClass();
        int i10 = 2 & 2;
        ResultReceiver resultReceiver = this.f2072u;
        if (i10 != 0) {
            resultReceiver.c(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", null);
        resultReceiver.c(0, bundle);
    }
}
