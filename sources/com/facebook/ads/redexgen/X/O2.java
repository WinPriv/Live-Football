package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class O2 extends InputStream {
    public static byte[] A04;
    public static String[] A05 = {"5FxkjmViipfuOEmeGZRh1rWuAhi58BIY", "P0uDFh8HOwAWvDVGkGeATzc", "FQ2HPVuJ9Fju5P7EfteSFhbDkCSiUGCr", "lMnDCDrcSzZtU6RMhKfYe1rO633Hkzz8", "BZaCeAJ4mpNw1z6aTzzGkvXJAvKgKDg7", "gl5vlYV0aCgrCc0s0sEnhviYHRKbo8Yg", "Tgc0UJMQxUN8PgOF6KJ9ZKrej2a3tpw", "OSPCme8ftb56UzOVrw2bgiBSvmZFYlRk"};

    @Nullable
    public MessageDigest A00;
    public final C1315Wi A01;
    public final O1 A02;
    public final FileInputStream A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[7].charAt(24) == 'i') {
                break;
            }
            A05[7] = "wkBtkBfOXubsKwfKzYpxBJzZI93GSJMw";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            byte b10 = copyOfRange[i13];
            String[] strArr = A05;
            if (strArr[0].charAt(11) == strArr[3].charAt(11)) {
                break;
            }
            String[] strArr2 = A05;
            strArr2[1] = "6MRboz4pfSS0DylRcsmX7nz";
            strArr2[6] = "Z3yJOYkAPU5AGas9ZlGFYfEzislvm9u";
            copyOfRange[i13] = (byte) ((b10 - i12) - 45);
            i13++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A04 = new byte[]{-104, -113, Byte.MIN_VALUE, Ascii.VT, Ascii.SUB, 19};
    }

    static {
        A01();
    }

    public O2(C1315Wi c1315Wi, FileInputStream fileInputStream, O1 o12) {
        this.A03 = fileInputStream;
        this.A02 = o12;
        this.A01 = c1315Wi;
        try {
            this.A00 = MessageDigest.getInstance(A00(0, 3, 30));
        } catch (NoSuchAlgorithmException unused) {
            this.A00 = null;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.A03.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b10 = new byte[1];
        return read(b10);
    }

    @Override // java.io.InputStream
    @SuppressLint({"CatchGeneralException"})
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.A03.read(bArr, i10, i11);
        MessageDigest messageDigest = this.A00;
        if (messageDigest != null) {
            if (A05[7].charAt(24) == 'i') {
                throw new RuntimeException();
            }
            A05[2] = "wFnf9K6AarqF2rYbRIkm3wGElU25UaCd";
            try {
                if (read > 0) {
                    messageDigest.update(bArr, i10, read);
                } else if (read == -1) {
                    String hash = C1007Kg.A05(messageDigest.digest());
                    this.A02.A85(hash);
                    this.A00 = null;
                }
            } catch (Exception e10) {
                this.A00 = null;
                this.A01.A06().A9D(A00(3, 3, 122), C06977l.A13, new C06987m(e10));
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        int actuallyRead = (int) j10;
        byte[] bArr = new byte[1024];
        long j11 = 0;
        while (actuallyRead > 0) {
            int bytesToRead = read(bArr, 0, Math.min(actuallyRead, 1024));
            if (bytesToRead <= 0) {
                break;
            }
            actuallyRead -= bytesToRead;
            j11 += bytesToRead;
        }
        return j11;
    }
}
