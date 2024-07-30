package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: assets/audience_network.dex */
public interface A7 {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean A47(int i10, int i11, int i12) throws A6;

    ByteBuffer A71();

    int A72();

    int A73();

    int A74();

    boolean A8L();

    boolean A8P();

    void ADN();

    void ADO(ByteBuffer byteBuffer);

    void flush();

    void reset();
}
