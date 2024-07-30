package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.k.p;
import com.anythink.expressad.foundation.g.a;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class AP implements InterfaceC1240Ti {
    public static byte[] A0G;
    public static String[] A0H = {"8Cwpq0myFqrjMYQXCF426Bvv7lF", "BCZ", "9QEkehaQ45REYiwwIXw9otHnKiruCzQN", "DxeLZUhsDe6Etn8eMTd", "i0KDABCUI1wPuXC", "cHzp87p", "Z4Mhgoj", "Wxs5ICSBRzcNleT3VwYrHD2lep8WMSnM"};
    public static final AtomicReference<byte[]> A0I;
    public static final Pattern A0J;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public GU A04;
    public InputStream A05;
    public HttpURLConnection A06;
    public boolean A07;
    public final int A08;
    public final int A09;

    @Nullable
    public final C0904Gb A0A;
    public final C0904Gb A0B = new C0904Gb();

    @Nullable
    public final InterfaceC0915Gm<? super AP> A0C;

    @Nullable
    public final HX<String> A0D;
    public final String A0E;
    public final boolean A0F;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            String[] strArr = A0H;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[0] = "a9yJ7ENBXfuIUHaNhs8YhzHERJT";
            strArr2[1] = "38v";
            copyOfRange[i13] = (byte) (i14 ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0G = new byte[]{Ascii.US, 92, 126, 126, 120, 109, 105, 48, 88, 115, 126, 114, 121, 116, 115, 122, 8, 36, 37, 63, 46, 37, 63, 102, 7, 46, 37, 44, 63, 35, 84, 120, 121, 99, 114, 121, 99, 58, 69, 118, 121, 112, 114, Ascii.SYN, 55, 52, 51, 39, 62, 38, Ascii.SUB, 38, 38, 34, Ascii.SYN, 51, 38, 51, 1, 61, 39, 32, 49, 55, 82, 117, 120, 116, 117, 104, 114, 104, 111, 126, 117, 111, 59, 115, 126, 122, Ascii.DEL, 126, 105, 104, 59, 64, 48, 19, Ascii.US, Ascii.GS, 8, Ascii.NAK, 19, Ascii.DC2, 38, Ascii.GS, 4, 4, 72, 4, 7, Ascii.VT, 9, Ascii.FS, 1, 7, 6, 72, Ascii.SUB, Ascii.CR, Ascii.FF, 1, Ascii.SUB, Ascii.CR, Ascii.VT, Ascii.FS, 54, 41, 53, 50, 109, 94, 81, 88, 90, 7, 60, 60, 115, 62, 50, 61, 42, 115, 33, 54, 55, 58, 33, 54, 48, 39, 32, 105, 115, 6, 61, 50, 49, 63, 54, 115, 39, 60, 115, 48, 60, 61, 61, 54, 48, 39, 115, 39, 60, 115, 45, Ascii.SYN, Ascii.GS, 0, 8, Ascii.GS, Ascii.ESC, Ascii.FF, Ascii.GS, Ascii.FS, 88, 59, Ascii.ETB, Ascii.SYN, Ascii.FF, Ascii.GS, Ascii.SYN, Ascii.FF, 85, 52, Ascii.GS, Ascii.SYN, Ascii.US, Ascii.FF, Ascii.DLE, 88, 35, Ascii.DEL, 68, 79, 82, 90, 79, 73, 94, 79, 78, 10, 105, 69, 68, 94, 79, 68, 94, 7, 120, 75, 68, 77, 79, 10, 113, 59, 0, Ascii.VT, Ascii.SYN, Ascii.RS, Ascii.VT, Ascii.CR, Ascii.SUB, Ascii.VT, 10, 78, Ascii.VT, Ascii.FS, Ascii.FS, 1, Ascii.FS, 78, Ascii.EM, 6, 7, 2, Ascii.VT, 78, 10, 7, Ascii.GS, Ascii.CR, 1, 0, 0, Ascii.VT, Ascii.CR, Ascii.SUB, 7, 0, 9, 59, 0, Ascii.GS, Ascii.ESC, Ascii.RS, Ascii.RS, 1, Ascii.FS, Ascii.SUB, Ascii.VT, 10, 78, Ascii.RS, Ascii.FS, 1, Ascii.SUB, 1, Ascii.CR, 1, 2, 78, Ascii.FS, Ascii.VT, 10, 7, Ascii.FS, Ascii.VT, Ascii.CR, Ascii.SUB, 84, 78, Ascii.ETB, 49, 39, 48, 111, 3, 37, 39, 44, 54, 122, 2, Ascii.DEL, 4, 49, Ascii.CR, Ascii.SYN, Ascii.ESC, 10, Ascii.FS, 79, 71, 51, Ascii.VT, 68, 70, 66, 71, 51, Ascii.VT, 68, 70, 64, 71, 51, Ascii.VT, 68, 70, 75, Ascii.VT, Ascii.DLE, Ascii.GS, Ascii.FF, Ascii.SUB, 84, 115, Ascii.DEL, 125, 62, 113, 126, 116, 98, Ascii.DEL, 121, 116, 62, Ascii.DEL, 123, 120, 100, 100, 96, 62, 121, 126, 100, 117, 98, 126, 113, 124, 62, 120, 100, 100, 96, 62, 88, 100, 100, 96, 68, 98, 113, 126, 99, 96, Ascii.DEL, 98, 100, 52, 83, 120, 101, 126, 123, 117, 116, 89, 126, 96, 101, 100, 67, 100, 98, 117, 113, 125, 41, 37, 39, 100, 43, 36, 46, 56, 37, 35, 46, 100, 37, 33, 34, 62, 62, 58, 100, 35, 36, 62, 47, 56, 36, 43, 38, 100, 34, 62, 62, 58, 100, 2, 62, 62, 58, Ascii.RS, 56, 43, 36, 57, 58, 37, 56, 62, 110, Ascii.FF, 35, 50, 47, 46, 6, 47, 36, 45, 62, 34, 3, 36, 58, 63, 62, Ascii.EM, 62, 56, 47, 43, 39, 55, 43, 43, 47, Ascii.VT, Ascii.ETB, Ascii.ETB, 19, Ascii.DLE, 2, Ascii.SI, Ascii.SO, 5, Ascii.US, 2, Ascii.US, Ascii.DC2, 126, 101, 110, 115, 123, 110, 104, Ascii.DEL, 110, 111, 78, 101, 111, 68, 109, 66, 101, 123, 126, Ascii.DEL};
    }

    static {
        A09();
        A0J = Pattern.compile(A03(300, 25, 29));
        A0I = new AtomicReference<>();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gm != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DefaultHttpDataSource> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HX != com.facebook.ads.internal.exoplayer2.util.Predicate<java.lang.String> */
    public AP(String str, @Nullable HX<String> hx, @Nullable InterfaceC0915Gm<? super AP> interfaceC0915Gm, int i10, int i11, boolean z10, @Nullable C0904Gb c0904Gb) {
        this.A0E = H6.A02(str);
        this.A0D = hx;
        this.A0C = interfaceC0915Gm;
        this.A08 = i10;
        this.A09 = i11;
        this.A0F = z10;
        this.A0A = c0904Gb;
    }

    private int A00(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.A02;
        String[] strArr = A0H;
        if (strArr[0].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0H;
        strArr2[0] = "bWPLRd721NhcJPFUmTbRIXPAhQ9";
        strArr2[1] = "JEA";
        if (j10 != -1) {
            long bytesRemaining = j10 - this.A00;
            if (bytesRemaining == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, bytesRemaining);
        }
        int read = this.A05.read(bArr, i10, i11);
        String[] strArr3 = A0H;
        if (strArr3[6].length() != strArr3[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0H;
        strArr4[0] = "AfChosDvH2k0xVUSu60NEuB2wOO";
        strArr4[1] = "7R7";
        if (read == -1) {
            if (this.A02 == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.A00 += read;
        InterfaceC0915Gm<? super AP> interfaceC0915Gm = this.A0C;
        if (interfaceC0915Gm != null) {
            interfaceC0915Gm.AAA(this, read);
        }
        return read;
    }

    private final long A01() {
        long j10 = this.A02;
        return j10 == -1 ? j10 : j10 - this.A00;
    }

    public static long A02(HttpURLConnection httpURLConnection) {
        long j10 = -1;
        String headerField = httpURLConnection.getHeaderField(A03(16, 14, 57));
        boolean isEmpty = TextUtils.isEmpty(headerField);
        String A03 = A03(a.aP, 1, 85);
        String A032 = A03(43, 21, 32);
        if (!isEmpty) {
            try {
                j10 = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                Log.e(A032, A03(166, 27, 10) + headerField + A03);
            }
        }
        String headerField2 = httpURLConnection.getHeaderField(A03(30, 13, 101));
        if (!TextUtils.isEmpty(headerField2)) {
            Matcher matcher = A0J.matcher(headerField2);
            if (matcher.find()) {
                try {
                    long parseLong = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                    if (j10 < 0) {
                        return parseLong;
                    }
                    if (j10 != parseLong) {
                        Log.w(A032, A03(64, 22, 105) + headerField + A03(a.aV, 3, 45) + headerField2 + A03);
                        j10 = Math.max(j10, parseLong);
                        return j10;
                    }
                    return j10;
                } catch (NumberFormatException unused2) {
                    Log.e(A032, A03(193, 26, 88) + headerField2 + A03);
                    return j10;
                }
            }
            return j10;
        }
        return j10;
    }

    private HttpURLConnection A04(GU gu) throws IOException {
        HttpURLConnection A05;
        URL url = new URL(gu.A04.toString());
        byte[] bArr = gu.A06;
        long j10 = gu.A03;
        long j11 = gu.A02;
        boolean A02 = gu.A02(1);
        if (!this.A0F) {
            if (A0H[4].length() == 2) {
                throw new RuntimeException();
            }
            A0H[3] = "AfmLjTAqEjfBoFvfwAy";
            return A05(url, bArr, j10, j11, A02, true);
        }
        int redirectCount = 0;
        while (true) {
            int i10 = redirectCount + 1;
            if (redirectCount <= 20) {
                A05 = A05(url, bArr, j10, j11, A02, false);
                int responseCode = A05.getResponseCode();
                if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                    bArr = null;
                    String headerField = A05.getHeaderField(A03(86, 8, 14));
                    A05.disconnect();
                    url = A06(url, headerField);
                    redirectCount = i10;
                }
            } else {
                throw new NoRouteToHostException(A03(125, 20, 33) + i10);
            }
        }
        return A05;
    }

    private HttpURLConnection A05(URL url, byte[] bArr, long j10, long j11, boolean z10, boolean z11) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.A08);
        httpURLConnection.setReadTimeout(this.A09);
        C0904Gb c0904Gb = this.A0A;
        if (c0904Gb != null) {
            for (Map.Entry<String, String> entry : c0904Gb.A00().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.A0B.A00().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j10 != 0 || j11 != -1) {
            String str = A03(325, 6, 27) + j10 + A03(0, 1, 64);
            if (j11 != -1) {
                str = str + ((j10 + j11) - 1);
            }
            httpURLConnection.setRequestProperty(A03(120, 5, 77), str);
        }
        httpURLConnection.setRequestProperty(A03(286, 10, 48), this.A0E);
        if (!z10) {
            httpURLConnection.setRequestProperty(A03(1, 15, 111), A03(474, 8, 25));
        }
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        if (A0H[2].charAt(11) != 'E') {
            throw new RuntimeException();
        }
        A0H[7] = "Y4214PJ0d833V29vzm0V8RPiGXomA3ZU";
        if (bArr != null) {
            httpURLConnection.setRequestMethod(A03(116, 4, 20));
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public static URL A06(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (A03(469, 5, 17).equals(protocol) || A03(465, 4, 45).equals(protocol)) {
                return url2;
            }
            String protocol2 = A03(p.f9095b, 31, 28) + protocol;
            throw new ProtocolException(protocol2);
        }
        throw new ProtocolException(A03(94, 22, 26));
    }

    private void A07() {
        HttpURLConnection httpURLConnection = this.A06;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                Log.e(A03(43, 21, 32), A03(219, 36, 28), e10);
            }
            this.A06 = null;
        }
    }

    private void A08() throws IOException {
        if (this.A01 == this.A03) {
            return;
        }
        byte[] andSet = A0I.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j10 = this.A01;
            long j11 = this.A03;
            if (j10 != j11) {
                int readLength = (int) Math.min(j11 - j10, andSet.length);
                int read = this.A05.read(andSet, 0, readLength);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                String[] strArr = A0H;
                String str = strArr[0];
                String str2 = strArr[1];
                int read2 = str.length();
                if (read2 == str2.length()) {
                    throw new RuntimeException();
                }
                A0H[2] = "xCxIxiNgjMSECsgVhCWdWfEPU1XUNw0H";
                if (read != -1) {
                    this.A01 += read;
                    InterfaceC0915Gm<? super AP> interfaceC0915Gm = this.A0C;
                    if (interfaceC0915Gm != null) {
                        interfaceC0915Gm.AAA(this, read);
                    }
                } else {
                    throw new EOFException();
                }
            } else {
                A0I.set(andSet);
                return;
            }
        }
    }

    public static void A0A(HttpURLConnection httpURLConnection, long j10) {
        if (C0940Hl.A02 != 19 && C0940Hl.A02 != 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else {
                if (A0H[4].length() == 2) {
                    throw new RuntimeException();
                }
                A0H[7] = "fvAwzL9wombuya3LmhGM8hGg4ouN1XgQ";
                if (j10 <= 2048) {
                    return;
                }
            }
            String name = inputStream.getClass().getName();
            if (A03(331, 65, 98).equals(name) || A03(396, 69, 56).equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                String className = A03(482, 20, 121);
                Method declaredMethod = superclass.getDeclaredMethod(className, new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final Uri A7i() {
        HttpURLConnection httpURLConnection = this.A06;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r1 != (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        r10.A02 = r11.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ae, code lost:
    
        r6 = A02(r10.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        if (r6 == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        r4 = r6 - r10.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bc, code lost:
    
        r10.A02 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
    
        if (r1 != (-1)) goto L30;
     */
    @Override // com.facebook.ads.redexgen.X.GQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long ACq(com.facebook.ads.redexgen.X.GU r11) throws com.facebook.ads.redexgen.X.C0903Ga {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AP.ACq(com.facebook.ads.redexgen.X.GU):long");
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final void close() throws C0903Ga {
        try {
            if (this.A05 != null) {
                A0A(this.A06, A01());
                try {
                    this.A05.close();
                } catch (IOException e10) {
                    throw new C0903Ga(e10, this.A04, 3);
                }
            }
            this.A05 = null;
            if (A0H[3].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[0] = "hQ3mc1CdxqPeh2AA8lkYs0MW7MP";
            strArr[1] = "PCj";
            A07();
            if (this.A07) {
                this.A07 = false;
                InterfaceC0915Gm<? super AP> interfaceC0915Gm = this.A0C;
                if (interfaceC0915Gm != null) {
                    interfaceC0915Gm.ACU(this);
                }
            }
        } catch (Throwable th) {
            this.A05 = null;
            A07();
            if (this.A07) {
                this.A07 = false;
                InterfaceC0915Gm<? super AP> interfaceC0915Gm2 = this.A0C;
                if (interfaceC0915Gm2 != null) {
                    interfaceC0915Gm2.ACU(this);
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final int read(byte[] bArr, int i10, int i11) throws C0903Ga {
        try {
            A08();
            return A00(bArr, i10, i11);
        } catch (IOException e10) {
            throw new C0903Ga(e10, this.A04, 2);
        }
    }
}
