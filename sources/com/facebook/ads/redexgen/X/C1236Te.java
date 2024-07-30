package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Te, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1236Te implements GQ {
    public static String[] A04 = {"jlvJAgNeHWnJa3dPhRRd4EpOWMdB4X8x", "basxIWwUdkqjCj33WkHPX1XLcRlnz9UL", "EJ8jlkQXjQdwyr2PvL7NnSmrIKvSoKH9", "vRfpY4dXxgFvSAkqLCYO6SFKljAHuCzv", "ygfsCaK9ODNV1JdDOAbtF6as7T2mwjea", "kZYhIpAIarjEuyurYojB34Vr8jYSU6r4", "j4JmDL8bElApoe2AoNbHhKsqdvNkVwQT", "xpYPLrN7DnWMQWubBysNzF9"};
    public long A00;
    public boolean A01;
    public final GO A02;
    public final GQ A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.GQ
    public final long ACq(GU gu) throws IOException {
        this.A00 = this.A03.ACq(gu);
        if (this.A00 == 0) {
            return 0L;
        }
        long j10 = gu.A02;
        if (A04[4].charAt(25) == 'd') {
            throw new RuntimeException();
        }
        A04[4] = "5eBqCtKJCfmd3joSOHW3VJl5u39JA8K8";
        if (j10 == -1 && this.A00 != -1) {
            gu = new GU(gu.A04, gu.A01, gu.A03, this.A00, gu.A05, gu.A00);
        }
        this.A01 = true;
        this.A02.ACs(gu);
        return this.A00;
    }

    public C1236Te(GQ gq, GO go) {
        this.A03 = (GQ) H6.A01(gq);
        this.A02 = (GO) H6.A01(go);
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final Uri A7i() {
        return this.A03.A7i();
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final void close() throws IOException {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A03.read(bArr, i10, i11);
        if (read > 0) {
            this.A02.write(bArr, i10, read);
            long j10 = this.A00;
            if (j10 != -1) {
                long j11 = read;
                if (A04[2].charAt(20) == 'R') {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[0] = "pjLm1ZauVMrHAqpQAI7gN0n14eRh7O52";
                strArr[5] = "T96N4GskjcbGLsEcsrwL44bvdnkYKV6X";
                this.A00 = j10 - j11;
            }
        }
        return read;
    }
}
