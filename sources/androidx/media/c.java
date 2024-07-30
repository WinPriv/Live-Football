package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.g f2061s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2062t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ IBinder f2063u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bundle f2064v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.f f2065w;

    public c(MediaBrowserServiceCompat.f fVar, MediaBrowserServiceCompat.h hVar, String str, IBinder iBinder, Bundle bundle) {
        this.f2065w = fVar;
        this.f2061s = hVar;
        this.f2062t = str;
        this.f2063u = iBinder;
        this.f2064v = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r12 = this;
            androidx.media.MediaBrowserServiceCompat$g r0 = r12.f2061s
            androidx.media.MediaBrowserServiceCompat$h r0 = (androidx.media.MediaBrowserServiceCompat.h) r0
            android.os.IBinder r0 = r0.a()
            androidx.media.MediaBrowserServiceCompat$f r1 = r12.f2065w
            androidx.media.MediaBrowserServiceCompat r2 = androidx.media.MediaBrowserServiceCompat.this
            q.b<android.os.IBinder, androidx.media.MediaBrowserServiceCompat$b> r2 = r2.f2031v
            r3 = 0
            java.lang.Object r0 = r2.getOrDefault(r0, r3)
            androidx.media.MediaBrowserServiceCompat$b r0 = (androidx.media.MediaBrowserServiceCompat.b) r0
            java.lang.String r2 = r12.f2062t
            if (r0 != 0) goto L2d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "addSubscription for callback that isn't registered id="
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MBServiceCompat"
            android.util.Log.w(r1, r0)
            return
        L2d:
            androidx.media.MediaBrowserServiceCompat r1 = androidx.media.MediaBrowserServiceCompat.this
            r1.getClass()
            java.util.HashMap<java.lang.String, java.util.List<m0.c<android.os.IBinder, android.os.Bundle>>> r3 = r0.f2047e
            java.lang.Object r4 = r3.get(r2)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L41
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L41:
            java.util.Iterator r5 = r4.iterator()
        L45:
            boolean r6 = r5.hasNext()
            android.os.Bundle r7 = r12.f2064v
            android.os.IBinder r8 = r12.f2063u
            if (r6 == 0) goto L9d
            java.lang.Object r6 = r5.next()
            m0.c r6 = (m0.c) r6
            F r9 = r6.f32635a
            if (r8 != r9) goto L45
            S r6 = r6.f32636b
            android.os.Bundle r6 = (android.os.Bundle) r6
            if (r7 != r6) goto L60
            goto L97
        L60:
            java.lang.String r8 = "android.media.browse.extra.PAGE_SIZE"
            java.lang.String r9 = "android.media.browse.extra.PAGE"
            r10 = -1
            if (r7 != 0) goto L74
            int r7 = r6.getInt(r9, r10)
            if (r7 != r10) goto L99
            int r6 = r6.getInt(r8, r10)
            if (r6 != r10) goto L99
            goto L97
        L74:
            if (r6 != 0) goto L83
            int r6 = r7.getInt(r9, r10)
            if (r6 != r10) goto L99
            int r6 = r7.getInt(r8, r10)
            if (r6 != r10) goto L99
            goto L97
        L83:
            int r11 = r7.getInt(r9, r10)
            int r9 = r6.getInt(r9, r10)
            if (r11 != r9) goto L99
            int r7 = r7.getInt(r8, r10)
            int r6 = r6.getInt(r8, r10)
            if (r7 != r6) goto L99
        L97:
            r6 = 1
            goto L9a
        L99:
            r6 = 0
        L9a:
            if (r6 == 0) goto L45
            return
        L9d:
            m0.c r5 = new m0.c
            r5.<init>(r8, r7)
            r4.add(r5)
            r3.put(r2, r4)
            if (r7 != 0) goto Lae
            r1.b()
            goto Lb1
        Lae:
            r1.b()
        Lb1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "onLoadChildren must call detach() or sendResult() before returning for package="
            r3.<init>(r4)
            java.lang.String r0 = r0.f2043a
            java.lang.String r4 = " id="
            java.lang.String r0 = a3.k.m(r3, r0, r4, r2)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.c.run():void");
    }
}
