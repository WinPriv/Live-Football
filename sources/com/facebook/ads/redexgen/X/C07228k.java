package com.facebook.ads.redexgen.X;

import androidx.annotation.VisibleForTesting;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.8k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07228k implements Closeable {
    public static byte[] A03;
    public static String[] A04 = {"Gii7pzXwK3MpiHC8B9NJqbzL", "8Pqq6WSNf8vKrPOx7XSY9C7", "LI4waC8pDZc7B2Ob9Mw4umyD0YVp7Iep", "HQVOS1q9k5iJuCSZxlwiHtDpSPIo2CAf", "0wBrPWYDPAFL7IDgbo0bQ8s", "e5cW7wYXRGqKaYX8", "aNUR51q123XM3tsFczjtkJvp", "F8bzMC9kGkJ5CLi2olbpsia5Bq7Sq0"};
    public final C07128a A01;
    public final Deque<C07218j> A02 = new LinkedList();
    public boolean A00 = false;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            if (A04[5].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[0] = "u097qyCEcqL0dCUFF3RqUSqj";
            strArr[6] = "TBb0mUAcLDsBFXHpNBOq9rzF";
            copyOfRange[i13] = (byte) (i14 ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {5, 41, 51, 42, 34, 102, 40, 41, 50, 102, 39, 34, 34, 102, 52, 35, 37, 41, 52, 34, 102, 50, 41, 102, 40, 35, 49, 42, 63, 102, 39, 34, 34, 35, 34, 102, 32, 47, 42, 35, 42, Ascii.CR, 5, 0, 9, 8, 76, Ascii.CAN, 3, 76, 8, 9, 0, 9, Ascii.CAN, 9, 76, 10, 5, 0, 9, 76, 75, 73, Ascii.US, 75, 106, 77, 69, 64, 73, 72, Ascii.FF, 88, 67, Ascii.FF, 64, 69, 95, 88, Ascii.FF, 74, 69, 64, 73, 72, Ascii.FF, 69, 66, Ascii.FF, 72, 69, 94, 73, 79, 88, 67, 94, 85, Ascii.FF, Ascii.VT, 9, 95, Ascii.VT, Ascii.FS, 59, 51, 54, 63, 62, 122, 46, 53, 122, 54, 53, 59, 62, 122, 60, 51, 54, 63, 122, 125, Ascii.DEL, 41, 125, 118, 122, 41, 49, 51, 42, 42, 51, 52, 61, 122, 59, 54, 54, 122, 42, 40, 63, 44, 51, 53, 47, 41, 122, 60, 51, 54, 63, 41, 122, 47, 52, 46, 51, 54, 122, Ascii.DEL, 62, 61, Ascii.FS, Ascii.GS, 94, Ascii.DLE, Ascii.FS, Ascii.GS, 7, Ascii.SUB, Ascii.DC4, 6, Ascii.FS, 6, 0, 83, Ascii.GS, Ascii.DC2, Ascii.RS, Ascii.SYN, Ascii.ETB, 83, Ascii.NAK, Ascii.SUB, Ascii.US, Ascii.SYN, 83, Ascii.SUB, Ascii.GS, 83, Ascii.US, Ascii.FS, Ascii.DC4, Ascii.DC4, Ascii.SUB, Ascii.GS, Ascii.DC4, 83, Ascii.ETB, Ascii.SUB, 1, Ascii.SYN, Ascii.DLE, 7, Ascii.FS, 1, 10, 73, 83, 86, Ascii.ETB, 95, 83, Ascii.RS, Ascii.SUB, Ascii.GS, 83, Ascii.SUB, 0, 83, 86, Ascii.ETB, Ascii.GS, 42, 44, 32, 61, 43, 9, 38, 35, 42, Ascii.FS, 42, 62, 58, 42, 33, 44, 42, 111, 46, 35, 61, 42, 46, 43, 54, 111, 44, 35, 32, 60, 42, 43, 107, 80, 85, 80, 81, 73, 80, Ascii.RS, 88, 87, 82, 91, Ascii.RS, 87, 80, Ascii.RS, 82, 81, 89, 89, 87, 80, 89, Ascii.RS, 90, 87, 76, 91, 93, 74, 81, 76, 71, 4, Ascii.RS, Ascii.EM, Ascii.ESC, 77, Ascii.EM};
        String[] strArr = A04;
        if (strArr[3].charAt(18) != strArr[2].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[3] = "rXUNYUFSY3Wwjf0Rt9wI3pKgcM0mrVi5";
        strArr2[2] = "NbfmFkvRWQfztm8Xt0wszzyUhHEjBSFU";
        A03 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized int A09() throws IOException {
        int i10;
        if (this.A00) {
            throw new IOException(A02(227, 33, 62));
        }
        i10 = 0;
        Iterator<C07218j> it = this.A02.iterator();
        while (it.hasNext()) {
            i10 += it.next().A01();
        }
        return i10;
    }

    static {
        A03();
    }

    public C07228k(C07128a c07128a, InterfaceC07208i interfaceC07208i) throws IOException {
        this.A01 = c07128a;
        A05(c07128a, interfaceC07208i);
        if (this.A02.isEmpty()) {
            A00();
        }
    }

    private C07218j A00() throws IOException {
        int i10 = -1;
        if (!this.A02.isEmpty()) {
            i10 = this.A02.getLast().A00();
        }
        int i11 = i10 + 1;
        this.A02.add(new C07218j(i11, new C07188g(new File(this.A01.A05(), A01(i11)))));
        return this.A02.getLast();
    }

    @VisibleForTesting
    public static String A01(int i10) {
        return Integer.toString(i10);
    }

    private void A04(int i10, File file) throws IOException {
        C07188g c07188g = new C07188g(file);
        c07188g.A05();
        this.A02.addFirst(new C07218j(i10, c07188g));
    }

    private void A05(C07128a c07128a, InterfaceC07208i interfaceC07208i) throws IOException {
        File[] listFiles = c07128a.A05().listFiles();
        if (listFiles != null) {
            HashMap hashMap = new HashMap();
            HashSet<File> hashSet = new HashSet();
            int i10 = -1;
            for (File file : listFiles) {
                try {
                    int parseInt = Integer.parseInt(file.getName());
                    hashMap.put(Integer.valueOf(parseInt), file);
                    if (parseInt > i10) {
                        i10 = parseInt;
                    }
                } catch (NumberFormatException unused) {
                    hashSet.add(file);
                    interfaceC07208i.ADw(String.format(Locale.US, A02(260, 39, 79), file.getCanonicalPath()));
                }
            }
            if (!hashMap.isEmpty()) {
                int i11 = i10;
                while (hashMap.containsKey(Integer.valueOf(i11 - 1))) {
                    i11--;
                }
                Iterator it = new HashSet(hashMap.keySet()).iterator();
                while (it.hasNext()) {
                    int minFileNumber = ((Integer) it.next()).intValue();
                    if (minFileNumber < i11) {
                        interfaceC07208i.ADw(String.format(Locale.US, A02(166, 61, 2), Integer.valueOf(minFileNumber), Integer.valueOf(i11)));
                        hashSet.add((File) hashMap.remove(Integer.valueOf(minFileNumber)));
                    }
                }
                while (i10 >= i11) {
                    Integer valueOf = Integer.valueOf(i10);
                    if (A04[7].length() == 23) {
                        throw new RuntimeException();
                    }
                    A04[5] = "fmCLvQkSN3nY4ZJN";
                    File file2 = (File) hashMap.get(valueOf);
                    try {
                        A04(i10, file2);
                        hashMap.remove(Integer.valueOf(i10));
                        i10--;
                    } catch (IOException e10) {
                        interfaceC07208i.ADx(String.format(Locale.US, A02(104, 62, 43), file2.getCanonicalPath(), Integer.valueOf(i10)), e10);
                        hashSet.addAll(hashMap.values());
                    }
                }
            }
            for (File file3 : hashSet) {
                if (!file3.delete()) {
                    interfaceC07208i.ADw(String.format(Locale.US, A02(40, 26, 29), file3.getCanonicalPath()));
                }
            }
            return;
        }
        throw new IOException(String.format(Locale.US, A02(66, 38, 93), c07128a.A05().getCanonicalPath()));
    }

    public final synchronized int A06() throws IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return -1;
            }
            return this.A02.getFirst().A00();
        }
        throw new IOException(A02(227, 33, 62));
    }

    public final synchronized int A07() throws IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return 0;
            }
            return this.A02.getFirst().A01();
        }
        throw new IOException(A02(227, 33, 62));
    }

    public final synchronized int A08() throws IOException {
        if (!this.A00) {
        } else {
            throw new IOException(A02(227, 33, 62));
        }
        return this.A02.size();
    }

    public final synchronized C8Y A0A(int i10, int i11, byte[] bArr, int i12, int[] iArr, int i13) throws IOException {
        if (!this.A00) {
            for (C07218j file : this.A02) {
                if (file.A00() == i10) {
                    return new C8Y(i10, file.A02(i11, bArr, i12, iArr, i13));
                }
            }
            return new C8Y(-1, new C8X(C8W.A04, -1, -1, 0));
        }
        throw new IOException(A02(227, 33, 62));
    }

    public final synchronized void A0B() throws IOException {
        if (!this.A00) {
            Iterator<C07218j> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().A04();
            }
            this.A02.clear();
            A00();
        } else {
            throw new IOException(A02(227, 33, 62));
        }
    }

    public final synchronized void A0C(byte[] bArr) throws IOException {
        if (!this.A00) {
            if ((this.A02.isEmpty() || !this.A02.getLast().A05(bArr)) && !A00().A05(bArr)) {
                throw new IOException(A02(0, 40, 55));
            }
        } else {
            throw new IOException(A02(227, 33, 62));
        }
    }

    public final synchronized boolean A0D() throws IOException {
        if (!this.A00) {
            if (this.A02.size() > 1) {
                C07218j first = this.A02.getFirst();
                this.A02.removeFirst();
                first.A04();
                return true;
            }
            return false;
        }
        throw new IOException(A02(227, 33, 62));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        Iterator<C07218j> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A03();
        }
    }
}
