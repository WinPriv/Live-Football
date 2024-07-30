package com.applovin.exoplayer2.l;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class t {
    public static void a(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(a3.l.i("csd-", i10), ByteBuffer.wrap(list.get(i10)));
        }
    }

    public static void a(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void a(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void a(MediaFormat mediaFormat, com.applovin.exoplayer2.m.b bVar) {
        if (bVar != null) {
            a(mediaFormat, "color-transfer", bVar.f16434c);
            a(mediaFormat, "color-standard", bVar.f16432a);
            a(mediaFormat, "color-range", bVar.f16433b);
            a(mediaFormat, "hdr-static-info", bVar.f16435d);
        }
    }
}
