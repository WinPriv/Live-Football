package com.applovin.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;

/* loaded from: classes.dex */
final class bc {

    /* renamed from: a, reason: collision with root package name */
    private final WifiManager f13608a;

    /* renamed from: b, reason: collision with root package name */
    private WifiManager.WifiLock f13609b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13610c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13611d;

    public bc(Context context) {
        this.f13608a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void a(boolean z10) {
        if (z10 && this.f13609b == null) {
            WifiManager wifiManager = this.f13608a;
            if (wifiManager == null) {
                com.applovin.exoplayer2.l.q.c("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f13609b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.f13610c = z10;
        a();
    }

    public void b(boolean z10) {
        this.f13611d = z10;
        a();
    }

    private void a() {
        WifiManager.WifiLock wifiLock = this.f13609b;
        if (wifiLock == null) {
            return;
        }
        if (this.f13610c && this.f13611d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
