package com.anythink.expressad.exoplayer.f;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

@TargetApi(16)
/* loaded from: classes.dex */
public final class e {
    private e() {
    }

    private static void a(MediaFormat mediaFormat, String str, String str2) {
        mediaFormat.setString(str, str2);
    }

    public static void a(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer("csd-".concat(String.valueOf(i10)), ByteBuffer.wrap(list.get(i10)));
        }
    }

    public static void a(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    private static void a(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    private static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    private static void a(MediaFormat mediaFormat, com.anythink.expressad.exoplayer.l.b bVar) {
        if (bVar != null) {
            a(mediaFormat, "color-transfer", bVar.f9171c);
            a(mediaFormat, "color-standard", bVar.f9169a);
            a(mediaFormat, "color-range", bVar.f9170b);
            byte[] bArr = bVar.f9172d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }
}
