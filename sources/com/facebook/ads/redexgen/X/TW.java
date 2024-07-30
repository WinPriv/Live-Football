package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.b;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class TW extends C0923Gu {
    public static byte[] A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Nullable
    public static TW A00(File file, C0927Gy c0927Gy) {
        String name = file.getName();
        if (!name.endsWith(A06(1, 7, 106))) {
            file = A05(file, c0927Gy);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        Matcher matcher = A03.matcher(name);
        if (!matcher.matches()) {
            return null;
        }
        long length = file.length();
        String A0C = c0927Gy.A0C(Integer.parseInt(matcher.group(1)));
        if (A0C == null) {
            return null;
        }
        return new TW(A0C, Long.parseLong(matcher.group(2)), length, Long.parseLong(matcher.group(3)), file);
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{120, 86, Ascii.SO, 75, 86, Ascii.GS, 0, Ascii.ETB, 39, 81, 87, 82, 80, 37, 87, 81, 37, Ascii.GS, 82, 80, 37, 87, 81, 37, Ascii.GS, 82, 80, 37, 87, Ascii.SI, 72, 37, 87, Ascii.FS, 1, Ascii.SYN, 93, 107, Ascii.GS, Ascii.ESC, Ascii.RS, Ascii.FS, 105, Ascii.ESC, Ascii.GS, 105, 81, Ascii.RS, Ascii.FS, 105, Ascii.ESC, Ascii.GS, 105, 81, Ascii.RS, Ascii.FS, 105, Ascii.ESC, 67, 7, 105, Ascii.ESC, 80, 77, 90, 17, 85, 35, 87, 111, 32, 34, 87, 37, 35, 87, 111, 32, 34, 87, 37, 35, 87, 111, 32, 34, 87, 37, 125, 56, 87, 37, 110, 115, 100, 47};
    }

    static {
        A07();
        A01 = Pattern.compile(A06(8, 29, 107), 32);
        A02 = Pattern.compile(A06(37, 29, 39), 32);
        A03 = Pattern.compile(A06(66, 30, 25), 32);
    }

    public TW(String str, long j10, long j11, long j12, @Nullable File file) {
        super(str, j10, j11, j12, file);
    }

    public static TW A01(String str, long j10) {
        return new TW(str, j10, -1L, b.f7291b, null);
    }

    public static TW A02(String str, long j10) {
        return new TW(str, j10, -1L, b.f7291b, null);
    }

    public static TW A03(String str, long j10, long j11) {
        return new TW(str, j10, j11, b.f7291b, null);
    }

    public static File A04(File file, int i10, long j10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        String A06 = A06(0, 1, 68);
        sb2.append(A06);
        sb2.append(j10);
        sb2.append(A06);
        sb2.append(j11);
        sb2.append(A06(1, 7, 106));
        return new File(file, sb2.toString());
    }

    @Nullable
    public static File A05(File file, C0927Gy c0927Gy) {
        String filename;
        String name = file.getName();
        Matcher matcher = A02.matcher(name);
        if (matcher.matches()) {
            String filename2 = matcher.group(1);
            filename = C0940Hl.A0O(filename2);
            if (filename == null) {
                return null;
            }
        } else {
            matcher = A01.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            filename = matcher.group(1);
        }
        File parentFile = file.getParentFile();
        int A08 = c0927Gy.A08(filename);
        String filename3 = matcher.group(2);
        long parseLong = Long.parseLong(filename3);
        String filename4 = matcher.group(3);
        File A04 = A04(parentFile, A08, parseLong, Long.parseLong(filename4));
        if (file.renameTo(A04)) {
            return A04;
        }
        return null;
    }

    public final TW A08(int i10) {
        H6.A04(this.A05);
        long currentTimeMillis = System.currentTimeMillis();
        return new TW(this.A04, this.A02, this.A01, currentTimeMillis, A04(this.A03.getParentFile(), i10, this.A02, currentTimeMillis));
    }
}
