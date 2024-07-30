package com.applovin.exoplayer2.b;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class s {
    public static int a(byte[] bArr) {
        return bArr[9] & DefaultClassResolver.NAME;
    }

    public static List<byte[]> b(byte[] bArr) {
        long b10 = b(c(bArr));
        long b11 = b(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(a(b10));
        arrayList.add(a(b11));
        return arrayList;
    }

    private static int c(byte[] bArr) {
        return (bArr[10] & DefaultClassResolver.NAME) | ((bArr[11] & DefaultClassResolver.NAME) << 8);
    }

    private static byte[] a(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }

    private static long b(long j10) {
        return (j10 * com.anythink.expressad.exoplayer.b.f7300h) / 48000;
    }
}
