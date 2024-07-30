package com.applovin.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ay {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13310a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f13311b;

    /* renamed from: c, reason: collision with root package name */
    private final a f13312c;

    /* renamed from: d, reason: collision with root package name */
    private final AudioManager f13313d;

    /* renamed from: e, reason: collision with root package name */
    private b f13314e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f13315g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13316h;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10, boolean z10);

        void f(int i10);
    }

    /* loaded from: classes.dex */
    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = ay.this.f13311b;
            final ay ayVar = ay.this;
            handler.post(new Runnable() { // from class: com.applovin.exoplayer2.e0
                @Override // java.lang.Runnable
                public final void run() {
                    ay.this.d();
                }
            });
        }
    }

    public ay(Context context, Handler handler, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f13310a = applicationContext;
        this.f13311b = handler;
        this.f13312c = aVar;
        AudioManager audioManager = (AudioManager) com.applovin.exoplayer2.l.a.a((AudioManager) applicationContext.getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b));
        this.f13313d = audioManager;
        this.f = 3;
        this.f13315g = a(audioManager, 3);
        this.f13316h = b(audioManager, this.f);
        b bVar = new b();
        try {
            applicationContext.registerReceiver(bVar, new IntentFilter(com.huawei.openalliance.ad.constant.w.f22148cb));
            this.f13314e = bVar;
        } catch (RuntimeException e10) {
            com.applovin.exoplayer2.l.q.b("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int a10 = a(this.f13313d, this.f);
        boolean b10 = b(this.f13313d, this.f);
        if (this.f13315g != a10 || this.f13316h != b10) {
            this.f13315g = a10;
            this.f13316h = b10;
            this.f13312c.a(a10, b10);
        }
    }

    public void c() {
        b bVar = this.f13314e;
        if (bVar != null) {
            try {
                this.f13310a.unregisterReceiver(bVar);
            } catch (RuntimeException e10) {
                com.applovin.exoplayer2.l.q.b("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f13314e = null;
        }
    }

    public void a(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        d();
        this.f13312c.f(i10);
    }

    public int b() {
        return this.f13313d.getStreamMaxVolume(this.f);
    }

    private static boolean b(AudioManager audioManager, int i10) {
        if (com.applovin.exoplayer2.l.ai.f16274a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return a(audioManager, i10) == 0;
    }

    public int a() {
        int streamMinVolume;
        if (com.applovin.exoplayer2.l.ai.f16274a < 28) {
            return 0;
        }
        streamMinVolume = this.f13313d.getStreamMinVolume(this.f);
        return streamMinVolume;
    }

    private static int a(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            com.applovin.exoplayer2.l.q.b("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }
}
