package b5;

import android.media.MediaCodec;
import b5.c;
import b5.k;
import b5.r;
import d6.g0;
import java.io.IOException;

/* compiled from: DefaultMediaCodecAdapterFactory.java */
/* loaded from: classes2.dex */
public final class i implements k.b {
    @Override // b5.k.b
    public final k a(k.a aVar) throws IOException {
        int i10 = g0.f27302a;
        if (i10 >= 23 && i10 >= 31) {
            int i11 = d6.r.i(aVar.f2941c.D);
            d6.p.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + g0.B(i11));
            return new c.a(i11).a(aVar);
        }
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = r.a.b(aVar);
            a0.a.n0("configureCodec");
            mediaCodec.configure(aVar.f2940b, aVar.f2942d, aVar.f2943e, 0);
            a0.a.F0();
            a0.a.n0("startCodec");
            mediaCodec.start();
            a0.a.F0();
            return new r(mediaCodec);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e10;
        }
    }
}
