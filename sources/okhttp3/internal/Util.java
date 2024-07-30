package okhttp3.internal;

import a3.k;
import com.applovin.exoplayer2.j.l;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.openalliance.ad.constant.w;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okio.b;
import okio.d;
import okio.e;
import okio.r;
import okio.z;

/* loaded from: classes2.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final Pattern VERIFY_AS_IP_ADDRESS;
    private static final Method addSuppressedExceptionMethod;
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final Headers EMPTY_HEADERS = Headers.of(new String[0]);
    private static final r UNICODE_BOMS = r.b(e.m("efbbbf"), e.m("feff"), e.m("fffe"), e.m("0000ffff"), e.m("ffff0000"));
    private static final Charset UTF_32BE = Charset.forName("UTF-32BE");
    private static final Charset UTF_32LE = Charset.forName("UTF-32LE");
    public static final TimeZone UTC = TimeZone.getTimeZone("GMT");
    public static final Comparator<String> NATURAL_ORDER = new l(8);

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        Method method = null;
        EMPTY_RESPONSE = ResponseBody.create((MediaType) null, bArr);
        EMPTY_REQUEST = RequestBody.create((MediaType) null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        addSuppressedExceptionMethod = method;
        VERIFY_AS_IP_ADDRESS = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    private Util() {
    }

    public static void addSuppressedIfPossible(Throwable th, Throwable th2) {
        Method method = addSuppressedExceptionMethod;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static Charset bomAwareCharset(d dVar, Charset charset) throws IOException {
        int W = dVar.W(UNICODE_BOMS);
        if (W != -1) {
            if (W != 0) {
                if (W != 1) {
                    if (W != 2) {
                        if (W != 3) {
                            if (W == 4) {
                                return UTF_32LE;
                            }
                            throw new AssertionError();
                        }
                        return UTF_32BE;
                    }
                    return StandardCharsets.UTF_16LE;
                }
                return StandardCharsets.UTF_16BE;
            }
            return StandardCharsets.UTF_8;
        }
        return charset;
    }

    public static String canonicalizeHost(String str) {
        InetAddress decodeIpv6;
        if (str.contains(w.bE)) {
            if (str.startsWith("[") && str.endsWith("]")) {
                decodeIpv6 = decodeIpv6(str, 1, str.length() - 1);
            } else {
                decodeIpv6 = decodeIpv6(str, 0, str.length());
            }
            if (decodeIpv6 == null) {
                return null;
            }
            byte[] address = decodeIpv6.getAddress();
            if (address.length == 16) {
                return inet6AddressToAscii(address);
            }
            if (address.length == 4) {
                return decodeIpv6.getHostAddress();
            }
            throw new AssertionError(k.l("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int checkDuration(String str, long j10, TimeUnit timeUnit) {
        if (j10 >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j10);
                if (millis <= 2147483647L) {
                    if (millis == 0 && j10 > 0) {
                        throw new IllegalArgumentException(com.ironsource.adapters.facebook.a.h(str, " too small."));
                    }
                    return (int) millis;
                }
                throw new IllegalArgumentException(com.ironsource.adapters.facebook.a.h(str, " too large."));
            }
            throw new NullPointerException("unit == null");
        }
        throw new IllegalArgumentException(com.ironsource.adapters.facebook.a.h(str, " < 0"));
    }

    public static void checkOffsetAndCount(long j10, long j11, long j12) {
        if ((j11 | j12) >= 0 && j11 <= j10 && j10 - j11 >= j12) {
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static String[] concat(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    private static boolean containsInvalidHostnameAsciiCodes(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int decodeHexDigit(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    private static boolean decodeIpv4Suffix(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char charAt = str.charAt(i14);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        if (i13 != i12 + 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.net.InetAddress decodeIpv6(java.lang.String r11, int r12, int r13) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = r2
            r5 = r3
            r6 = r5
        L9:
            r7 = 0
            if (r12 >= r13) goto L7a
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r12 + 2
            if (r8 > r13) goto L27
            java.lang.String r9 = "::"
            r10 = 2
            boolean r9 = r11.regionMatches(r12, r9, r2, r10)
            if (r9 == 0) goto L27
            if (r5 == r3) goto L1f
            return r7
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r13) goto L25
            goto L7a
        L25:
            r6 = r8
            goto L4b
        L27:
            if (r4 == 0) goto L4a
            java.lang.String r8 = ":"
            r9 = 1
            boolean r8 = r11.regionMatches(r12, r8, r2, r9)
            if (r8 == 0) goto L35
            int r12 = r12 + 1
            goto L4a
        L35:
            java.lang.String r8 = "."
            boolean r12 = r11.regionMatches(r12, r8, r2, r9)
            if (r12 == 0) goto L49
            int r12 = r4 + (-2)
            boolean r11 = decodeIpv4Suffix(r11, r6, r13, r1, r12)
            if (r11 != 0) goto L46
            return r7
        L46:
            int r4 = r4 + 2
            goto L7a
        L49:
            return r7
        L4a:
            r6 = r12
        L4b:
            r8 = r2
            r12 = r6
        L4d:
            if (r12 >= r13) goto L60
            char r9 = r11.charAt(r12)
            int r9 = decodeHexDigit(r9)
            if (r9 != r3) goto L5a
            goto L60
        L5a:
            int r8 = r8 << 4
            int r8 = r8 + r9
            int r12 = r12 + 1
            goto L4d
        L60:
            int r9 = r12 - r6
            if (r9 == 0) goto L79
            r10 = 4
            if (r9 <= r10) goto L68
            goto L79
        L68:
            int r7 = r4 + 1
            int r9 = r8 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r7 + 1
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            goto L9
        L79:
            return r7
        L7a:
            if (r4 == r0) goto L8b
            if (r5 != r3) goto L7f
            return r7
        L7f:
            int r11 = r4 - r5
            int r12 = 16 - r11
            java.lang.System.arraycopy(r1, r5, r1, r12, r11)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L8b:
            java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L90
            return r11
        L90:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.decodeIpv6(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int delimiterOffset(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static boolean discard(z zVar, int i10, TimeUnit timeUnit) {
        try {
            return skipAll(zVar, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static String format(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String getSystemProperty(String str, @Nullable String str2) {
        try {
            String property = System.getProperty(str);
            if (property != null) {
                return property;
            }
            return str2;
        } catch (AccessControlException unused) {
            return str2;
        }
    }

    public static String hostHeader(HttpUrl httpUrl, boolean z10) {
        String host;
        if (httpUrl.host().contains(w.bE)) {
            host = "[" + httpUrl.host() + "]";
        } else {
            host = httpUrl.host();
        }
        if (z10 || httpUrl.port() != HttpUrl.defaultPort(httpUrl.scheme())) {
            StringBuilder l10 = com.ironsource.adapters.facebook.a.l(host, w.bE);
            l10.append(httpUrl.port());
            return l10.toString();
        }
        return host;
    }

    public static <T> List<T> immutableList(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> immutableMap(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static int indexOf(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static int indexOfControlOrNonAscii(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt >= 127) {
                return i10;
            }
        }
        return -1;
    }

    private static String inet6AddressToAscii(byte[] bArr) {
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        b bVar = new b();
        while (i11 < bArr.length) {
            if (i11 == i10) {
                bVar.Z(58);
                i11 += i13;
                if (i11 == 16) {
                    bVar.Z(58);
                }
            } else {
                if (i11 > 0) {
                    bVar.Z(58);
                }
                bVar.b0(((bArr[i11] & DefaultClassResolver.NAME) << 8) | (bArr[i11 + 1] & DefaultClassResolver.NAME));
                i11 += 2;
            }
        }
        return bVar.l();
    }

    public static String[] intersect(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean isAndroidGetsocknameError(AssertionError assertionError) {
        if (assertionError.getCause() != null && assertionError.getMessage() != null && assertionError.getMessage().contains("getsockname failed")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$threadFactory$0(String str, boolean z10, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    public static boolean nonEmptyIntersection(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static X509TrustManager platformTrustManager() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS", e10);
        }
    }

    public static boolean sameConnection(HttpUrl httpUrl, HttpUrl httpUrl2) {
        if (httpUrl.host().equals(httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && httpUrl.scheme().equals(httpUrl2.scheme())) {
            return true;
        }
        return false;
    }

    public static boolean skipAll(z zVar, int i10, TimeUnit timeUnit) throws IOException {
        long j10;
        long nanoTime = System.nanoTime();
        if (zVar.timeout().hasDeadline()) {
            j10 = zVar.timeout().deadlineNanoTime() - nanoTime;
        } else {
            j10 = Long.MAX_VALUE;
        }
        zVar.timeout().deadlineNanoTime(Math.min(j10, timeUnit.toNanos(i10)) + nanoTime);
        try {
            b bVar = new b();
            while (zVar.read(bVar, 8192L) != -1) {
                bVar.b();
            }
            if (j10 == Long.MAX_VALUE) {
                zVar.timeout().clearDeadline();
                return true;
            }
            zVar.timeout().deadlineNanoTime(nanoTime + j10);
            return true;
        } catch (InterruptedIOException unused) {
            if (j10 == Long.MAX_VALUE) {
                zVar.timeout().clearDeadline();
                return false;
            }
            zVar.timeout().deadlineNanoTime(nanoTime + j10);
            return false;
        } catch (Throwable th) {
            if (j10 == Long.MAX_VALUE) {
                zVar.timeout().clearDeadline();
            } else {
                zVar.timeout().deadlineNanoTime(nanoTime + j10);
            }
            throw th;
        }
    }

    public static int skipLeadingAsciiWhitespace(String str, int i10, int i11) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int skipTrailingAsciiWhitespace(String str, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char charAt = str.charAt(i12);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    public static ThreadFactory threadFactory(final String str, final boolean z10) {
        return new ThreadFactory() { // from class: okhttp3.internal.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread lambda$threadFactory$0;
                lambda$threadFactory$0 = Util.lambda$threadFactory$0(str, z10, runnable);
                return lambda$threadFactory$0;
            }
        };
    }

    public static List<Header> toHeaderBlock(Headers headers) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < headers.size(); i10++) {
            arrayList.add(new Header(headers.name(i10), headers.value(i10)));
        }
        return arrayList;
    }

    public static Headers toHeaders(List<Header> list) {
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            Internal.instance.addLenient(builder, header.name.G(), header.value.G());
        }
        return builder.build();
    }

    public static String trimSubstring(String str, int i10, int i11) {
        int skipLeadingAsciiWhitespace = skipLeadingAsciiWhitespace(str, i10, i11);
        return str.substring(skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace(str, skipLeadingAsciiWhitespace, i11));
    }

    public static boolean verifyAsIpAddress(String str) {
        return VERIFY_AS_IP_ADDRESS.matcher(str).matches();
    }

    public static int delimiterOffset(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    @SafeVarargs
    public static <T> List<T> immutableList(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e10) {
                if (!isAndroidGetsocknameError(e10)) {
                    throw e10;
                }
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }
}
