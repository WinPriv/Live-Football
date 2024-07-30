package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.To, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1246To implements GQ {
    public static byte[] A05;
    public static String[] A06 = {"l2rBvT9KAEY6yl2SIp", "0cRN39km0cT", "q9WvQr", "pX7zul93kCJ6F7tIXqRnEpKrjeNmhaPh", "ddKujtHDPllkfb3cyYepVcXFvJyDikdo", "gNoa3Z", "AdKzyhJyCrP", "aoyUT4m5l2MLf3LhSWprSpj54sdxW1uC"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    @Nullable
    public final InterfaceC0915Gm<? super C1246To> A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{37};
    }

    static {
        A01();
    }

    public C1246To() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gm != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.FileDataSource> */
    public C1246To(@Nullable InterfaceC0915Gm<? super C1246To> interfaceC0915Gm) {
        this.A04 = interfaceC0915Gm;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final Uri A7i() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final long ACq(GU gu) throws GX {
        try {
            this.A01 = gu.A04;
            this.A02 = new RandomAccessFile(gu.A04.getPath(), A00(0, 1, 72));
            this.A02.seek(gu.A03);
            this.A00 = gu.A02 == -1 ? this.A02.length() - gu.A03 : gu.A02;
            if (this.A00 >= 0) {
                this.A03 = true;
                InterfaceC0915Gm<? super C1246To> interfaceC0915Gm = this.A04;
                if (interfaceC0915Gm != null) {
                    interfaceC0915Gm.ACV(this, gu);
                }
                long j10 = this.A00;
                if (A06[0].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[7] = "qz0up6ppIELboyns2CZBgMvSr8RDOOhA";
                strArr[3] = "iQKzkqELqDYakLKWZdfSUnFo9DHl6nVv";
                return j10;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new GX(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final void close() throws GX {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e10) {
                throw new GX(e10);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                InterfaceC0915Gm<? super C1246To> interfaceC0915Gm = this.A04;
                if (interfaceC0915Gm != null) {
                    interfaceC0915Gm.ACU(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final int read(byte[] bArr, int i10, int i11) throws GX {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.A00;
        if (j10 == 0) {
            return -1;
        }
        try {
            int read = this.A02.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.A00 -= read;
                InterfaceC0915Gm<? super C1246To> interfaceC0915Gm = this.A04;
                if (interfaceC0915Gm != null) {
                    interfaceC0915Gm.AAA(this, read);
                }
            }
            return read;
        } catch (IOException e10) {
            throw new GX(e10);
        }
    }
}
