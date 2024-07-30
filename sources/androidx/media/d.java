package androidx.media;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.g f2066s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2067t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ IBinder f2068u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.f f2069v;

    public d(MediaBrowserServiceCompat.f fVar, MediaBrowserServiceCompat.h hVar, String str, IBinder iBinder) {
        this.f2069v = fVar;
        this.f2066s = hVar;
        this.f2067t = str;
        this.f2068u = iBinder;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            androidx.media.MediaBrowserServiceCompat$g r0 = r9.f2066s
            androidx.media.MediaBrowserServiceCompat$h r0 = (androidx.media.MediaBrowserServiceCompat.h) r0
            android.os.IBinder r0 = r0.a()
            androidx.media.MediaBrowserServiceCompat$f r1 = r9.f2069v
            androidx.media.MediaBrowserServiceCompat r2 = androidx.media.MediaBrowserServiceCompat.this
            q.b<android.os.IBinder, androidx.media.MediaBrowserServiceCompat$b> r2 = r2.f2031v
            r3 = 0
            java.lang.Object r0 = r2.getOrDefault(r0, r3)
            androidx.media.MediaBrowserServiceCompat$b r0 = (androidx.media.MediaBrowserServiceCompat.b) r0
            java.lang.String r2 = "MBServiceCompat"
            java.lang.String r3 = r9.f2067t
            if (r0 != 0) goto L2d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "removeSubscription for callback that isn't registered id="
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r2, r0)
            return
        L2d:
            androidx.media.MediaBrowserServiceCompat r1 = androidx.media.MediaBrowserServiceCompat.this
            r1.getClass()
            java.util.HashMap<java.lang.String, java.util.List<m0.c<android.os.IBinder, android.os.Bundle>>> r0 = r0.f2047e
            android.os.IBinder r1 = r9.f2068u
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L43
            java.lang.Object r0 = r0.remove(r3)     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L41
            goto L6e
        L41:
            r4 = r5
            goto L6e
        L43:
            java.lang.Object r6 = r0.get(r3)     // Catch: java.lang.Throwable -> L87
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L87
            if (r6 == 0) goto L41
            java.util.Iterator r7 = r6.iterator()     // Catch: java.lang.Throwable -> L87
        L4f:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L87
            if (r8 == 0) goto L64
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L87
            m0.c r8 = (m0.c) r8     // Catch: java.lang.Throwable -> L87
            F r8 = r8.f32635a     // Catch: java.lang.Throwable -> L87
            if (r1 != r8) goto L4f
            r7.remove()     // Catch: java.lang.Throwable -> L87
            r5 = r4
            goto L4f
        L64:
            int r1 = r6.size()     // Catch: java.lang.Throwable -> L87
            if (r1 != 0) goto L41
            r0.remove(r3)     // Catch: java.lang.Throwable -> L87
            goto L41
        L6e:
            if (r4 != 0) goto L86
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "removeSubscription called for "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " which is not subscribed"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r2, r0)
        L86:
            return
        L87:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.d.run():void");
    }
}
