package com.google.android.exoplayer2.offline;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import d6.g0;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class DownloadService extends Service {

    /* renamed from: u, reason: collision with root package name */
    public static final HashMap<Class<? extends DownloadService>, a> f20112u = new HashMap<>();

    /* renamed from: s, reason: collision with root package name */
    public a f20113s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20114t;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public DownloadService f20115a;

        public a() {
            throw null;
        }
    }

    public abstract i5.a a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        boolean z10;
        a aVar = f20112u.get(getClass());
        if (aVar != null) {
            this.f20113s = aVar;
            if (aVar.f20115a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            d6.a.d(z10);
            aVar.f20115a = this;
            throw null;
        }
        int i10 = g0.f27302a;
        a();
        throw null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        boolean z10;
        a aVar = this.f20113s;
        aVar.getClass();
        if (aVar.f20115a == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        aVar.f20115a = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x008f, code lost:
    
        if (r2.equals("com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS") == false) goto L54;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int onStartCommand(android.content.Intent r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadService.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
    }
}
