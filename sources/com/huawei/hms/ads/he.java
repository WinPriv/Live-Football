package com.huawei.hms.ads;

import android.media.AudioManager;

/* loaded from: classes2.dex */
public class he {
    public static final float Code = 1.0E-8f;
    private static final String V = "VolumeStrategy";

    public static float Code(AudioManager audioManager, boolean z10) {
        if (audioManager != null) {
            float streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(1);
            int streamVolume2 = audioManager.getStreamVolume(3);
            if (streamVolume != 0 && !z10 && streamMaxVolume > 1.0E-8f) {
                return streamVolume2 / streamMaxVolume;
            }
        }
        return gl.Code;
    }
}
