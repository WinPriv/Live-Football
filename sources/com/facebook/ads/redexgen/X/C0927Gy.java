package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.facebook.ads.redexgen.X.Gy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0927Gy {
    public static byte[] A08;
    public static String[] A09 = {"XONorMmEkuhCG9piVxKUh1vkXNNJ", "9nfZq9rsOYHCIqBCRPzuDpg7UYzPD2Yl", "Yz44fu3QSKzu2i5DyXETxtSOt38Z3WJk", "HOY3mHCHBdW1ht", "XI2xTZ9JkVa2GEn", "4OCnssyPGh2MUqheTrzmDcc0Epkw2MIq", "4Z9FwJdzaIh4z0baUKFOBcRAp1yx", "rZsSxCWfylE928lHlC5xkXC43RMRLxAb"};
    public C0931Hc A00;
    public boolean A01;
    public final SparseArray<String> A02;
    public final H8 A03;
    public final HashMap<String, C0926Gx> A04;
    public final Cipher A05;
    public final SecretKeySpec A06;
    public final boolean A07;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        String[] strArr = A09;
        if (strArr[6].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "3hiG2MwLP1vY28w2jyIZHTbcKAlMPBPZ";
        strArr2[2] = "9NEv2gVVsGFA2BwX54IQqGQXEg3TAXQS";
        A08 = new byte[]{Ascii.SUB, Ascii.RS, 44, 32, 36, 50, Ascii.SO, 34, 33, 34, Ascii.SO, 47, 42, 34, 50, Ascii.DC4, 47, 32, 35, 35, 40, 45, 38, -48, -47, Ascii.SUB, Ascii.CAN, Ascii.SUB, Ascii.US, Ascii.FS, Ascii.ESC, Ascii.SYN, Ascii.SUB, 38, 37, 43, Ascii.FS, 37, 43, Ascii.SYN, 32, 37, Ascii.ESC, Ascii.FS, 47, -27, Ascii.FS, 47, 32};
    }

    static {
        A05();
    }

    public C0927Gy(File file, @Nullable byte[] bArr, boolean z10) {
        this.A07 = z10;
        if (bArr != null) {
            H6.A03(bArr.length == 16);
            try {
                this.A05 = A03();
                this.A06 = new SecretKeySpec(bArr, A02(0, 3, 101));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            H6.A04(!z10);
            this.A05 = null;
            this.A06 = null;
        }
        this.A04 = new HashMap<>();
        this.A02 = new SparseArray<>();
        this.A03 = new H8(new File(file, A02(25, 24, 67)));
    }

    public static int A00(SparseArray<String> sparseArray) {
        int id2;
        int size = sparseArray.size();
        if (size == 0) {
            id2 = 0;
        } else {
            int i10 = size - 1;
            String[] strArr = A09;
            String str = strArr[7];
            String str2 = strArr[2];
            int id3 = str.charAt(12);
            int size2 = str2.charAt(12);
            if (id3 != size2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[6] = "GpSMRVwbmVnvoZI5Ggc91zVjP9Ti";
            strArr2[0] = "f9953PfVQawIaiCUJ4cnumBLGdw9";
            int size3 = sparseArray.keyAt(i10);
            id2 = size3 + 1;
        }
        if (id2 < 0) {
            id2 = 0;
            while (id2 < size) {
                int size4 = sparseArray.keyAt(id2);
                if (id2 != size4) {
                    break;
                }
                id2++;
            }
        }
        return id2;
    }

    private C0926Gx A01(String str) {
        int id2 = A00(this.A02);
        C0926Gx cachedContent = new C0926Gx(id2, str);
        A06(cachedContent);
        this.A01 = true;
        return cachedContent;
    }

    public static Cipher A03() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i10 = C0940Hl.A02;
        String A02 = A02(3, 20, 107);
        if (i10 == 18) {
            try {
                return Cipher.getInstance(A02, A02(23, 2, 26));
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance(A02);
    }

    private void A04() throws C0917Go {
        try {
            try {
                OutputStream outputStream = this.A03.A04();
                if (this.A00 == null) {
                    this.A00 = new C0931Hc(outputStream);
                } else {
                    this.A00.A00(outputStream);
                }
                DataOutputStream output = new DataOutputStream(this.A00);
                DataOutputStream dataOutputStream = output;
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.A07 ? 1 : 0);
                if (this.A07) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.A05.init(1, this.A06, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        DataOutputStream output2 = new DataOutputStream(new CipherOutputStream(this.A00, this.A05));
                        dataOutputStream = output2;
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                        throw new IllegalStateException(e10);
                    }
                }
                dataOutputStream.writeInt(this.A04.size());
                int i10 = 0;
                for (C0926Gx c0926Gx : this.A04.values()) {
                    c0926Gx.A0A(dataOutputStream);
                    i10 += c0926Gx.A03(2);
                }
                dataOutputStream.writeInt(i10);
                this.A03.A06(dataOutputStream);
                C0940Hl.A0X(null);
            } catch (IOException e11) {
                throw new C0917Go(e11);
            }
        } catch (Throwable th) {
            C0940Hl.A0X(null);
            throw th;
        }
    }

    private void A06(C0926Gx c0926Gx) {
        this.A04.put(c0926Gx.A03, c0926Gx);
        this.A02.put(c0926Gx.A02, c0926Gx.A03);
    }

    private boolean A07() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A03.A03());
            DataInputStream input = new DataInputStream(bufferedInputStream);
            DataInputStream dataInputStream = input;
            int hashCode = dataInputStream.readInt();
            if (hashCode < 0 || hashCode > 2) {
                C0940Hl.A0X(dataInputStream);
                return false;
            }
            if ((dataInputStream.readInt() & 1) != 0) {
                if (this.A05 == null) {
                    C0940Hl.A0X(dataInputStream);
                    return false;
                }
                byte[] bArr = new byte[16];
                dataInputStream.readFully(bArr);
                try {
                    this.A05.init(2, this.A06, new IvParameterSpec(bArr));
                    DataInputStream input2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A05));
                    dataInputStream = input2;
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                    throw new IllegalStateException(e10);
                }
            } else if (this.A07) {
                this.A01 = true;
            }
            int readInt = dataInputStream.readInt();
            int version = 0;
            for (int i10 = 0; i10 < readInt; i10++) {
                C0926Gx A00 = C0926Gx.A00(hashCode, dataInputStream);
                A06(A00);
                version += A00.A03(hashCode);
            }
            int readInt2 = dataInputStream.readInt();
            boolean z10 = dataInputStream.read() == -1;
            if (readInt2 != version || !z10) {
                C0940Hl.A0X(dataInputStream);
                return false;
            }
            C0940Hl.A0X(dataInputStream);
            return true;
        } catch (IOException unused) {
            if (0 != 0) {
                C0940Hl.A0X(null);
            }
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                C0940Hl.A0X(null);
            }
            throw th;
        }
    }

    public final int A08(String str) {
        return A0A(str).A02;
    }

    public final C0926Gx A09(String str) {
        return this.A04.get(str);
    }

    public final C0926Gx A0A(String str) {
        C0926Gx cachedContent = this.A04.get(str);
        return cachedContent == null ? A01(str) : cachedContent;
    }

    public final H0 A0B(String str) {
        C0926Gx cachedContent = A09(str);
        return cachedContent != null ? cachedContent.A05() : TY.A04;
    }

    public final String A0C(int i10) {
        return this.A02.get(i10);
    }

    public final Collection<C0926Gx> A0D() {
        return this.A04.values();
    }

    public final void A0E() {
        H6.A04(!this.A01);
        if (!A07()) {
            this.A03.A05();
            this.A04.clear();
            this.A02.clear();
        }
    }

    public final void A0F() {
        String[] strArr = new String[this.A04.size()];
        this.A04.keySet().toArray(strArr);
        for (String str : strArr) {
            A0H(str);
        }
    }

    public final void A0G() throws C0917Go {
        if (!this.A01) {
            return;
        }
        A04();
        this.A01 = false;
    }

    public final void A0H(String str) {
        C0926Gx c0926Gx = this.A04.get(str);
        if (c0926Gx != null && c0926Gx.A0C() && !c0926Gx.A0D()) {
            this.A04.remove(str);
            this.A02.remove(c0926Gx.A02);
            this.A01 = true;
        }
    }

    public final void A0I(String str, H2 h22) {
        C0926Gx cachedContent = A0A(str);
        if (cachedContent.A0F(h22)) {
            this.A01 = true;
        }
    }
}
