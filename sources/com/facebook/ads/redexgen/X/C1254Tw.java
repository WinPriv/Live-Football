package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1254Tw implements GQ {
    public static byte[] A07;
    public static String[] A08 = {"XY5JZk6rXZ0NPH7SICFbrzLAUaQN4bdH", "HnCNMjQ424yFS", "kyBc0", "GnRsDPDWJf0qkzwG5UAakx0LVXBsKD8t", "8DLCIs9NQKYqN", "T4UYq1MMo7qynT2Sse3Gz88uK5Ayy8ub", "yyLccmqAJUyLoqB1F9xK1icYlgZtX35P", "UgvPXgEXHuOjKzkqR3R9kUCYtrFgRRdg"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;

    @Nullable
    public final InterfaceC0915Gm<? super C1254Tw> A06;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-38, 6, Ascii.FF, 3, -5, -73, 5, 6, Ascii.VT, -73, 6, 7, -4, 5, -73, -3, 0, 3, -4, -73, -5, -4, 10, -6, 9, 0, 7, Ascii.VT, 6, 9, -73, -3, 6, 9, -47, -73, -14};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.GQ
    public final long ACq(GU gu) throws GM {
        try {
            this.A02 = gu.A04;
            this.A01 = this.A05.openAssetFileDescriptor(this.A02, A00(36, 1, 12));
            if (this.A01 == null) {
                throw new FileNotFoundException(A00(0, 36, 35) + this.A02);
            }
            this.A03 = new FileInputStream(this.A01.getFileDescriptor());
            long startOffset = this.A01.getStartOffset();
            long skip = this.A03.skip(gu.A03 + startOffset) - startOffset;
            long j10 = gu.A03;
            String[] strArr = A08;
            if (strArr[1].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A08[2] = "hKUpJ";
            if (skip != j10) {
                throw new EOFException();
            }
            if (gu.A02 != -1) {
                this.A00 = gu.A02;
            } else {
                long length = this.A01.getLength();
                if (length == -1) {
                    FileChannel channel = this.A03.getChannel();
                    long size = channel.size();
                    this.A00 = size != 0 ? size - channel.position() : -1L;
                } else {
                    this.A00 = length - skip;
                }
            }
            this.A04 = true;
            InterfaceC0915Gm<? super C1254Tw> interfaceC0915Gm = this.A06;
            if (interfaceC0915Gm != null) {
                interfaceC0915Gm.ACV(this, gu);
            }
            return this.A00;
        } catch (IOException e10) {
            throw new GM(e10);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gm != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.ContentDataSource> */
    public C1254Tw(Context context, @Nullable InterfaceC0915Gm<? super C1254Tw> interfaceC0915Gm) {
        this.A05 = context.getContentResolver();
        this.A06 = interfaceC0915Gm;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final Uri A7i() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final void close() throws GM {
        int length;
        int i10;
        this.A02 = null;
        try {
            try {
                if (this.A03 != null) {
                    this.A03.close();
                }
                this.A03 = null;
            } catch (Throwable th) {
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                        this.A01 = null;
                    } catch (IOException e10) {
                        throw new GM(e10);
                    }
                } finally {
                    if (length == i10) {
                    }
                    throw new RuntimeException();
                }
                if (this.A04) {
                    this.A04 = false;
                    String[] strArr = A08;
                    if (strArr[6].charAt(21) != strArr[3].charAt(21)) {
                        String[] strArr2 = A08;
                        strArr2[5] = "49IvJFCSRSvhrewf7IAXf1OPFzRU50IL";
                        strArr2[0] = "4e2AtDz0XDbCK0xcLVm9895RacU2kPwa";
                        InterfaceC0915Gm<? super C1254Tw> interfaceC0915Gm = this.A06;
                        if (interfaceC0915Gm != null) {
                            interfaceC0915Gm.ACU(this);
                        }
                    }
                    throw new RuntimeException();
                }
                throw th;
            }
            try {
                try {
                    if (this.A01 != null) {
                        this.A01.close();
                    }
                } catch (IOException e11) {
                    throw new GM(e11);
                }
            } finally {
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    InterfaceC0915Gm<? super C1254Tw> interfaceC0915Gm2 = this.A06;
                    if (interfaceC0915Gm2 != null) {
                        interfaceC0915Gm2.ACU(this);
                    }
                }
            }
        } catch (IOException e12) {
            throw new GM(e12);
        }
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final int read(byte[] bArr, int i10, int i11) throws GM {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.A00;
        if (A08[7].charAt(11) != 'j') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[1] = "ibErvL6ImcJTe";
        strArr[4] = "i4reTFCBluewh";
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new GM(e10);
            }
        }
        int read = this.A03.read(bArr, i10, i11);
        if (read == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new GM(new EOFException());
        }
        long j11 = this.A00;
        if (j11 != -1) {
            this.A00 = j11 - read;
        }
        InterfaceC0915Gm<? super C1254Tw> interfaceC0915Gm = this.A06;
        if (interfaceC0915Gm != null) {
            interfaceC0915Gm.AAA(this, read);
        }
        return read;
    }
}
