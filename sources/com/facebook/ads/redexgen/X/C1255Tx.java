package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1255Tx implements GQ {
    public static byte[] A06;
    public static String[] A07 = {"pM08nT1ncmNJ", "g85", "nscQf0o4Li7UcF904CUq0pnhLdimh0nx", "F8VXv1qVoFp68OVo6WPqVPomjNx", "ZQ8cSAnJS", "Qhc2B", "YeRFTalD9", "SLGuxMrf5R7JWBKvcRLC7wUDDVq2YQ4u"};
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;

    @Nullable
    public final InterfaceC0915Gm<? super C1255Tx> A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{107, 98, 44, 35, 41, 63, 34, 36, 41, Ascii.DC2, 44, 62, 62, 40, 57, 98};
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        if (r0 != (-1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        r8.A00 = r8.A02.available();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
    
        if (r8.A00 != 2147483647L) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        r8.A00 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        r8.A00 = r9.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r0 != (-1)) goto L23;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.GQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long ACq(com.facebook.ads.redexgen.X.GU r9) throws com.facebook.ads.redexgen.X.GJ {
        /*
            r8 = this;
            android.net.Uri r0 = r9.A04     // Catch: java.io.IOException -> Lb9
            r8.A01 = r0     // Catch: java.io.IOException -> Lb9
            android.net.Uri r0 = r8.A01     // Catch: java.io.IOException -> Lb9
            java.lang.String r3 = r0.getPath()     // Catch: java.io.IOException -> Lb9
            r2 = 1
            r1 = 15
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: java.io.IOException -> Lb9
            boolean r0 = r3.startsWith(r0)     // Catch: java.io.IOException -> Lb9
            r7 = 1
            if (r0 == 0) goto L33
            r0 = 15
            java.lang.String r3 = r3.substring(r0)     // Catch: java.io.IOException -> Lb9
        L20:
            android.content.res.AssetManager r0 = r8.A04     // Catch: java.io.IOException -> Lb9
            java.io.InputStream r0 = r0.open(r3, r7)     // Catch: java.io.IOException -> Lb9
            r8.A02 = r0     // Catch: java.io.IOException -> Lb9
            java.io.InputStream r2 = r8.A02     // Catch: java.io.IOException -> Lb9
            long r0 = r9.A03     // Catch: java.io.IOException -> Lb9
            long r4 = r2.skip(r0)     // Catch: java.io.IOException -> Lb9
            long r0 = r9.A03     // Catch: java.io.IOException -> Lb9
            goto L46
        L33:
            r2 = 0
            r1 = 1
            r0 = 114(0x72, float:1.6E-43)
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: java.io.IOException -> Lb9
            boolean r0 = r3.startsWith(r0)     // Catch: java.io.IOException -> Lb9
            if (r0 == 0) goto L20
            java.lang.String r3 = r3.substring(r7)     // Catch: java.io.IOException -> Lb9
            goto L20
        L46:
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1255Tx.A07
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 12
            if (r1 == r0) goto L5b
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L5b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1255Tx.A07
            java.lang.String r1 = "V0B6GAr2PKDbDxhNZksh7AEMCKFKekNi"
            r0 = 7
            r2[r0] = r1
            if (r3 < 0) goto Lb3
            long r0 = r9.A02     // Catch: java.io.IOException -> Lb9
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1255Tx.A07
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L85
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1255Tx.A07
            java.lang.String r1 = "LLeOWo0qfJ5aEilGNMg5Y9nqgC8u5H4z"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "bhHcjvupHtwrsEsZMKxHQW2SejO"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L93
            goto L8e
        L85:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1255Tx.A07
            java.lang.String r1 = "z68meBkT3TqiKmw4pf8g7Y6845REpoZL"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto L93
        L8e:
            long r0 = r9.A02     // Catch: java.io.IOException -> Lb9
            r8.A00 = r0     // Catch: java.io.IOException -> Lb9
            goto La7
        L93:
            java.io.InputStream r0 = r8.A02     // Catch: java.io.IOException -> Lb9
            int r0 = r0.available()     // Catch: java.io.IOException -> Lb9
            long r0 = (long) r0     // Catch: java.io.IOException -> Lb9
            r8.A00 = r0     // Catch: java.io.IOException -> Lb9
            long r3 = r8.A00     // Catch: java.io.IOException -> Lb9
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto La7
            r8.A00 = r5     // Catch: java.io.IOException -> Lb9
        La7:
            r8.A03 = r7
            com.facebook.ads.redexgen.X.Gm<? super com.facebook.ads.redexgen.X.Tx> r0 = r8.A05
            if (r0 == 0) goto Lb0
            r0.ACV(r8, r9)
        Lb0:
            long r0 = r8.A00
            return r0
        Lb3:
            java.io.EOFException r0 = new java.io.EOFException     // Catch: java.io.IOException -> Lb9
            r0.<init>()     // Catch: java.io.IOException -> Lb9
            throw r0     // Catch: java.io.IOException -> Lb9
        Lb9:
            r1 = move-exception
            com.facebook.ads.redexgen.X.GJ r0 = new com.facebook.ads.redexgen.X.GJ
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1255Tx.ACq(com.facebook.ads.redexgen.X.GU):long");
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gm != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.AssetDataSource> */
    public C1255Tx(Context context, @Nullable InterfaceC0915Gm<? super C1255Tx> interfaceC0915Gm) {
        this.A04 = context.getAssets();
        this.A05 = interfaceC0915Gm;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final Uri A7i() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final void close() throws GJ {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e10) {
                throw new GJ(e10);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                InterfaceC0915Gm<? super C1255Tx> interfaceC0915Gm = this.A05;
                if (interfaceC0915Gm != null) {
                    interfaceC0915Gm.ACU(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final int read(byte[] bArr, int i10, int i11) throws GJ {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.A00;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new GJ(e10);
            }
        }
        int read = this.A02.read(bArr, i10, i11);
        if (read == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new GJ(new EOFException());
        }
        long j11 = this.A00;
        if (j11 != -1) {
            this.A00 = j11 - read;
        }
        InterfaceC0915Gm<? super C1255Tx> interfaceC0915Gm = this.A05;
        if (interfaceC0915Gm != null) {
            interfaceC0915Gm.AAA(this, read);
        }
        return read;
    }
}
