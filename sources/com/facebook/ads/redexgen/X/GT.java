package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: assets/audience_network.dex */
public final class GT implements InterfaceC1143Po {
    public static byte[] A07;
    public static String[] A08 = {"Z3ZBH3trhaxMswGoeO0i3WMhBsCqcWgs", "P814sFImmOC", "INcscN3Z5kcfIuBeknVxelrdNm8ANoXs", "RvJjsajerkLdUat3TDI8NPR3DDSWtO", "ZLSXhw", "wxtWSqUF9a7Aw2d1StIocmcoa4QX", "58xAXbC3p", "Zj1UZNXOzFX"};
    public static final String A09;
    public InterfaceC06967k A00;
    public Executor A01;
    public boolean A02;
    public C1148Pt A03;
    public final InterfaceC1153Py A04 = new C0916Gn();
    public final Q3 A05;
    public final Q4 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final InterfaceC1142Pn A01(Q0 q02) throws Q1 {
        String A072 = A07(220, 7, 7);
        HttpURLConnection httpURLConnection = null;
        InterfaceC1142Pn interfaceC1142Pn = null;
        boolean z10 = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection A082 = A08(q02.A05(), KO.A04() ? A09() : null);
                A0H(A082, q02);
                A0G(A082, q02);
                if (this.A06.A8W()) {
                    this.A06.A99(A082, q02.A06());
                }
                A082.connect();
                this.A02 = true;
                Set<String> A01 = this.A03.A01();
                Set<String> A02 = this.A03.A02();
                boolean z11 = (A01 == null || A01.isEmpty()) ? false : true;
                if (A02 != null && !A02.isEmpty()) {
                    z10 = true;
                }
                if ((A082 instanceof HttpsURLConnection) && (z11 || z10)) {
                    try {
                        Q5.A03((HttpsURLConnection) A082, A01, A02);
                    } catch (CertificateException e10) {
                        this.A00.A9D(A072, C06977l.A1y, new C06987m(e10));
                    } catch (Exception e11) {
                        this.A00.A9D(A072, C06977l.A1x, new C06987m(e11));
                    }
                }
                if (A082.getDoOutput() && q02.A06() != null) {
                    A00(A082, q02.A06());
                }
                InterfaceC1142Pn A06 = A082.getDoInput() ? A06(A082) : new GW(A082, null);
                if (this.A06.A8W()) {
                    this.A06.A9A(A06);
                }
                A082.disconnect();
                return A06;
            } catch (Exception e12) {
                try {
                    try {
                        interfaceC1142Pn = A05(null);
                        if (interfaceC1142Pn == null || interfaceC1142Pn.A7Y() <= 0) {
                            throw new Q1(e12, interfaceC1142Pn);
                        }
                        if (this.A06.A8W()) {
                            this.A06.A9A(interfaceC1142Pn);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return interfaceC1142Pn;
                    } catch (Exception unused) {
                        Log.e(getClass().getSimpleName(), A07(117, 13, 53), e12);
                        if (interfaceC1142Pn == null || interfaceC1142Pn.A7Y() <= 0) {
                            throw new Q1(e12, interfaceC1142Pn);
                        }
                        if (this.A06.A8W()) {
                            this.A06.A9A(interfaceC1142Pn);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return interfaceC1142Pn;
                    }
                } catch (Throwable unused2) {
                    if (interfaceC1142Pn == null || interfaceC1142Pn.A7Y() <= 0) {
                        throw new Q1(e12, interfaceC1142Pn);
                    }
                    if (this.A06.A8W()) {
                        this.A06.A9A(interfaceC1142Pn);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return interfaceC1142Pn;
                }
            }
        } catch (Throwable th) {
            if (this.A06.A8W()) {
                this.A06.A9A(interfaceC1142Pn);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{Ascii.DLE, Ascii.DC2, 55, 58, 95, 55, 53, 74, 71, Ascii.SO, 74, 72, Ascii.SI, 76, 90, 93, 67, Ascii.SI, Ascii.SO, 71, 93, Ascii.SO, 64, 65, 90, Ascii.SO, 79, Ascii.SO, 88, 79, 66, 71, 74, Ascii.SO, 123, 124, 98, Ascii.SO, 65, 72, Ascii.SO, 94, 102, 106, 9, Ascii.RS, 106, 119, 106, Ascii.FS, Ascii.DLE, 98, 100, Ascii.DLE, Ascii.CR, Ascii.DLE, 55, 59, 111, 105, 98, 114, 117, 124, 59, 81, 17, 59, 50, 63, 46, 45, 59, 58, 94, 42, 55, 51, 59, 94, 67, 94, 1, 35, 50, 50, 47, 40, 33, 102, 50, 46, 35, 102, 46, 50, 50, 54, 102, 52, 35, 53, 54, 41, 40, 53, 35, 102, 50, 47, 43, 35, 34, 102, 41, 51, 50, 38, Ascii.CR, Ascii.FS, Ascii.US, 7, Ascii.SUB, 3, 72, Ascii.CR, Ascii.SUB, Ascii.SUB, 7, Ascii.SUB, 34, 35, 49, 90, 79, 122, 107, 107, 119, 114, 120, 122, 111, 114, 116, 117, 52, 99, 54, 108, 108, 108, 54, 125, 116, 105, 118, 54, 110, 105, 119, 126, 117, 120, 116, Ascii.DEL, 126, Ascii.DEL, 32, 120, 115, 122, 105, 104, 126, 111, 38, 78, 79, 93, 54, 35, 47, 57, 62, 32, 108, 97, 39, 108, 97, 37, Ascii.CAN, 4, 4, 0, 94, 0, 2, Ascii.US, 8, 9, 56, Ascii.US, 3, 4, Ascii.DEL, 99, 99, 103, 57, 103, 101, 120, 111, 110, 71, 120, 101, 99, 52, 63, 46, 45, 53, 40, 49};
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x017d, code lost:
    
        if (r25.A04 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017f, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ab, code lost:
    
        r0 = r25.A04.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a8, code lost:
    
        if (r25.A04 == null) goto L66;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 28 out of bounds for length 26
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.InterfaceC1142Pn A0J(com.facebook.ads.redexgen.X.Q0 r25) throws com.facebook.ads.redexgen.X.Q1 {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.GT.A0J(com.facebook.ads.redexgen.X.Q0):com.facebook.ads.redexgen.X.Pn");
    }

    static {
        A0A();
        A09 = InterfaceC1143Po.class.getSimpleName();
    }

    public GT(C1148Pt c1148Pt, InterfaceC06967k interfaceC06967k, Executor executor) {
        A0B();
        this.A03 = c1148Pt;
        this.A06 = new GS(c1148Pt.A04());
        final Q4 q42 = this.A06;
        this.A05 = new AbstractC0913Gk(q42) { // from class: com.facebook.ads.redexgen.X.4M
        };
        this.A01 = executor;
        this.A00 = interfaceC06967k;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A05.ACv(httpURLConnection);
            if (outputStream != null) {
                this.A05.AFY(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    @Nullable
    private final InterfaceC1142Pn A02(Q0 q02) {
        if (this.A03.A04()) {
            A0C(q02);
        }
        InterfaceC1142Pn interfaceC1142Pn = null;
        try {
            interfaceC1142Pn = A01(q02);
            return interfaceC1142Pn;
        } catch (Q1 hre) {
            this.A05.AAf(hre);
            return interfaceC1142Pn;
        } catch (Exception e10) {
            this.A05.AAf(new Q1(e10, interfaceC1142Pn));
            return interfaceC1142Pn;
        }
    }

    @Nullable
    private final InterfaceC1142Pn A03(String str, Q2 q22, C1151Pw c1151Pw) {
        return A02(new GZ(str, q22, c1151Pw));
    }

    @Nullable
    private final InterfaceC1142Pn A04(String str, String str2, byte[] bArr, C1151Pw c1151Pw) {
        return A02(new GY(str, null, str2, bArr, c1151Pw));
    }

    private final InterfaceC1142Pn A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                responseBody = this.A05.ADX(inputStream);
            }
            GW gw = new GW(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return gw;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final InterfaceC1142Pn A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = this.A05.ACu(httpURLConnection);
            if (inputStream != null) {
                responseBody = this.A05.ADX(inputStream);
            }
            GW gw = new GW(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return gw;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str, @Nullable Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.ACt(str, proxy);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(str + A07(18, 19, 115), e10);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 45));
        String proxyAddress = System.getProperty(A07(206, 14, 74));
        int i10 = -1;
        if (proxyAddress != null) {
            try {
                i10 = Integer.parseInt(proxyAddress);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(property);
        String[] strArr = A08;
        String portStr = strArr[0];
        if (portStr.charAt(28) == strArr[2].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "UW2PAxLqNCWQ7bdKo0A7Pw4nSyNkIv";
        strArr2[6] = "26yRDH09B";
        if (!isEmpty && i10 > 0 && i10 <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, i10));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        synchronized (GT.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(Q0 q02) {
        StringBuilder sb2 = new StringBuilder(A07(182, 10, 17));
        boolean equals = q02.A03().equals(EnumC1154Pz.A06);
        String A072 = A07(41, 1, 33);
        if (equals && q02.A06() != null) {
            sb2.append(A07(7, 5, 55));
            sb2.append(new String(q02.A06(), Charset.forName(A07(130, 5, 42))));
            sb2.append(A072);
        }
        Map<String, String> A06 = q02.A02().A06();
        String[] strArr = A08;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "s0c02ga9sXqOOqZgqzjFkG4II3gfLx";
        strArr2[6] = "iECV1gT3x";
        for (Map.Entry<String, String> entry : A06.entrySet()) {
            sb2.append(A07(2, 5, 74));
            sb2.append(entry.getKey());
            sb2.append(A07(66, 1, 118));
            sb2.append(entry.getValue());
            sb2.append(A072);
        }
        sb2.append(A07(0, 2, 109));
        sb2.append(q02.A05());
        sb2.append(A072);
        String sb3 = sb2.toString();
        A0E(sb3, 1, (sb3.length() / 4000) + 1);
    }

    private void A0D(Q0 q02, InterfaceC1144Pp interfaceC1144Pp) {
        InterfaceC1152Px executor = this.A04.A5i(this, interfaceC1144Pp, this.A01);
        executor.A5G(q02);
        if (this.A03.A04()) {
            A0C(q02);
        }
    }

    private void A0E(String str, int i10, int i11) {
        String str2 = A09 + A07(12, 6, 114) + i10 + A07(65, 1, 35) + i11;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i10 + 1, i11);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC1144Pp interfaceC1144Pp, C1151Pw c1151Pw) {
        GY req = new GY(str, null, str2, bArr, c1151Pw);
        A0D(req, interfaceC1144Pp);
    }

    private void A0G(HttpURLConnection httpURLConnection, Q0 q02) {
        Map<String, String> A06 = q02.A02().A06();
        InterfaceC1141Pm A05 = q02.A02().A05();
        for (String str : A06.keySet()) {
            httpURLConnection.setRequestProperty(str, A06.get(str));
        }
        if (A05 != null) {
            Map<String, String> A5U = A05.A5U(this.A03.A03());
            for (String str2 : A5U.keySet()) {
                httpURLConnection.setRequestProperty(str2, A5U.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, Q0 q02) throws IOException {
        C1151Pw A02 = q02.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.ADB(httpURLConnection, q02.A03(), q02.A04());
    }

    private final boolean A0I(Throwable th, long j10, Q0 q02) {
        C1151Pw A02 = q02.A02();
        long elapsedTime = (System.currentTimeMillis() - j10) + 10;
        if (this.A06.A8W()) {
            String str = A07(67, 15, 35) + elapsedTime + A07(42, 7, 23) + A02.A00() + A07(49, 7, 109) + A02.A02();
        }
        if (this.A02) {
            return elapsedTime >= ((long) A02.A02());
        }
        long A00 = A02.A00();
        if (A08[5].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "UT6xnSlzbr9JaeC9T1uoRQiwoDXC3Y";
        strArr[6] = "g5URFCrsk";
        return elapsedTime >= A00;
    }

    public final C1148Pt A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1143Po
    @Nullable
    @Deprecated
    public final InterfaceC1142Pn AD3(String str, Map<String, String> parameters) {
        return A03(str, new Q2(parameters), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1143Po
    @Nullable
    @Deprecated
    public final InterfaceC1142Pn AD4(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 70), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1143Po
    public final void AD5(String str, byte[] bArr, InterfaceC1144Pp interfaceC1144Pp) {
        A0F(str, A07(135, 47, 70), bArr, interfaceC1144Pp, this.A03.A00());
    }
}
