package k4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import d6.o;
import k4.a0;
import k4.e1;

/* compiled from: StreamVolumeManager.java */
/* loaded from: classes2.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30715a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f30716b;

    /* renamed from: c, reason: collision with root package name */
    public final a f30717c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioManager f30718d;

    /* renamed from: e, reason: collision with root package name */
    public b f30719e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f30720g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30721h;

    /* compiled from: StreamVolumeManager.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* compiled from: StreamVolumeManager.java */
    /* loaded from: classes2.dex */
    public final class b extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f30722b = 0;

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            o1 o1Var = o1.this;
            o1Var.f30716b.post(new androidx.activity.b(o1Var, 6));
        }
    }

    public o1(Context context, Handler handler, a0.b bVar) {
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        this.f30715a = applicationContext;
        this.f30716b = handler;
        this.f30717c = bVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b);
        d6.a.e(audioManager);
        this.f30718d = audioManager;
        this.f = 3;
        this.f30720g = a(audioManager, 3);
        int i10 = this.f;
        if (d6.g0.f27302a >= 23) {
            z10 = audioManager.isStreamMute(i10);
        } else if (a(audioManager, i10) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30721h = z10;
        b bVar2 = new b();
        try {
            applicationContext.registerReceiver(bVar2, new IntentFilter(com.huawei.openalliance.ad.constant.w.f22148cb));
            this.f30719e = bVar2;
        } catch (RuntimeException e10) {
            d6.p.g("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public static int a(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            d6.p.g("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public final void b(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        c();
        a0 a0Var = a0.this;
        l a02 = a0.a0(a0Var.B);
        if (!a02.equals(a0Var.f30327f0)) {
            a0Var.f30327f0 = a02;
            a0Var.f30338l.e(29, new b0.b(a02, 6));
        }
    }

    public final void c() {
        final boolean z10;
        int i10 = this.f;
        AudioManager audioManager = this.f30718d;
        final int a10 = a(audioManager, i10);
        int i11 = this.f;
        if (d6.g0.f27302a >= 23) {
            z10 = audioManager.isStreamMute(i11);
        } else if (a(audioManager, i11) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f30720g != a10 || this.f30721h != z10) {
            this.f30720g = a10;
            this.f30721h = z10;
            a0.this.f30338l.e(30, new o.a() { // from class: k4.b0
                @Override // d6.o.a
                public final void invoke(Object obj) {
                    ((e1.c) obj).R(a10, z10);
                }
            });
        }
    }
}
