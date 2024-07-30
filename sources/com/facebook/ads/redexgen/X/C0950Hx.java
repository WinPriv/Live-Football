package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;

@TargetApi(17)
/* renamed from: com.facebook.ads.redexgen.X.Hx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0950Hx implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C0952Hz A01;

    public C0950Hx(C0952Hz c0952Hz, DisplayManager displayManager) {
        this.A01 = c0952Hz;
        this.A00 = displayManager;
    }

    public final void A00() {
        this.A00.registerDisplayListener(this, null);
    }

    public final void A01() {
        this.A00.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (i10 != 0) {
            return;
        }
        this.A01.A03();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
