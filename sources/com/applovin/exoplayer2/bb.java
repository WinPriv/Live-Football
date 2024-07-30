package com.applovin.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
final class bb {

    /* renamed from: a, reason: collision with root package name */
    private final PowerManager f13604a;

    /* renamed from: b, reason: collision with root package name */
    private PowerManager.WakeLock f13605b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13606c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13607d;

    public bb(Context context) {
        this.f13604a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void a(boolean z10) {
        if (z10 && this.f13605b == null) {
            PowerManager powerManager = this.f13604a;
            if (powerManager == null) {
                com.applovin.exoplayer2.l.q.c("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f13605b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        this.f13606c = z10;
        a();
    }

    public void b(boolean z10) {
        this.f13607d = z10;
        a();
    }

    @SuppressLint({"WakelockTimeout"})
    private void a() {
        PowerManager.WakeLock wakeLock = this.f13605b;
        if (wakeLock == null) {
            return;
        }
        if (this.f13606c && this.f13607d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
