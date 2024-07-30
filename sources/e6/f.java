package e6;

import android.view.Surface;

/* compiled from: MediaCodecVideoDecoderException.java */
/* loaded from: classes2.dex */
public final class f extends b5.l {
    public f(IllegalStateException illegalStateException, b5.m mVar, Surface surface) {
        super(illegalStateException, mVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
