package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* loaded from: assets/audience_network.dex */
public class P2 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C06756j A00;

    public P2(C06756j c06756j) {
        this.A00 = c06756j;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        new Handler(Looper.getMainLooper()).post(new JJ(this, i10));
    }
}
