package ka;

import android.content.Context;
import android.media.AudioManager;
import com.huawei.hms.ads.gl;

/* loaded from: classes2.dex */
public final class kb {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f31373a;

    public kb(Context context) {
        this.f31373a = (AudioManager) context.getApplicationContext().getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b);
    }

    public final float a(boolean z10) {
        AudioManager audioManager = this.f31373a;
        if (audioManager == null || audioManager == null) {
            return gl.Code;
        }
        float streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(1);
        int streamVolume2 = audioManager.getStreamVolume(3);
        if (streamVolume == 0 || z10 || streamMaxVolume <= 1.0E-8f) {
            return gl.Code;
        }
        return streamVolume2 / streamMaxVolume;
    }
}
