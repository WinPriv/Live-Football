package okhttp3.internal.http;

import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okio.b;
import okio.e;

/* loaded from: classes2.dex */
public final class HttpHeaders {
    private static final e QUOTED_STRING_DELIMITERS = e.p("\"\\");
    private static final e TOKEN_DELIMITERS = e.p("\t ,=");

    private HttpHeaders() {
    }

    public static long contentLength(Response response) {
        return contentLength(response.headers());
    }

    public static boolean hasBody(Response response) {
        if (response.request().method().equals(VersionInfo.GIT_BRANCH)) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && contentLength(response) == -1 && !"chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public static boolean hasVaryAll(Response response) {
        return hasVaryAll(response.headers());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0079, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseChallengeHeader(java.util.List<okhttp3.Challenge> r8, okio.b r9) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            skipWhitespaceAndCommas(r9)
            java.lang.String r1 = readToken(r9)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = skipWhitespaceAndCommas(r9)
            java.lang.String r3 = readToken(r9)
            if (r3 != 0) goto L2c
            boolean r9 = r9.u()
            if (r9 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r9 = new okhttp3.Challenge
            java.util.Map r0 = java.util.Collections.emptyMap()
            r9.<init>(r1, r0)
            r8.add(r9)
            return
        L2c:
            r4 = 61
            int r5 = skipAll(r9, r4)
            boolean r6 = skipWhitespaceAndCommas(r9)
            if (r2 != 0) goto L5c
            if (r6 != 0) goto L40
            boolean r2 = r9.u()
            if (r2 == 0) goto L5c
        L40:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r3 = com.ironsource.adapters.facebook.a.j(r3)
            java.lang.String r4 = repeat(r4, r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L5c:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = skipAll(r9, r4)
            int r5 = r5 + r6
        L66:
            if (r3 != 0) goto L77
            java.lang.String r3 = readToken(r9)
            boolean r5 = skipWhitespaceAndCommas(r9)
            if (r5 == 0) goto L73
            goto L79
        L73:
            int r5 = skipAll(r9, r4)
        L77:
            if (r5 != 0) goto L84
        L79:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L84:
            r6 = 1
            if (r5 <= r6) goto L88
            return
        L88:
            boolean r6 = skipWhitespaceAndCommas(r9)
            if (r6 == 0) goto L8f
            return
        L8f:
            boolean r6 = r9.u()
            if (r6 != 0) goto La4
            r6 = 0
            byte r6 = r9.f(r6)
            r7 = 34
            if (r6 != r7) goto La4
            java.lang.String r6 = readQuotedString(r9)
            goto La8
        La4:
            java.lang.String r6 = readToken(r9)
        La8:
            if (r6 != 0) goto Lab
            return
        Lab:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb4
            return
        Lb4:
            boolean r3 = skipWhitespaceAndCommas(r9)
            if (r3 != 0) goto Lc1
            boolean r3 = r9.u()
            if (r3 != 0) goto Lc1
            return
        Lc1:
            r3 = r0
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.parseChallengeHeader(java.util.List, okio.b):void");
    }

    public static List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < headers.size(); i10++) {
            if (str.equalsIgnoreCase(headers.name(i10))) {
                b bVar = new b();
                String value = headers.value(i10);
                bVar.g0(0, value.length(), value);
                parseChallengeHeader(arrayList, bVar);
            }
        }
        return arrayList;
    }

    public static int parseSeconds(String str, int i10) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    private static String readQuotedString(b bVar) {
        if (bVar.readByte() == 34) {
            b bVar2 = new b();
            while (true) {
                long y = bVar.y(QUOTED_STRING_DELIMITERS);
                if (y == -1) {
                    return null;
                }
                if (bVar.f(y) == 34) {
                    bVar2.write(bVar, y);
                    bVar.readByte();
                    return bVar2.l();
                }
                if (bVar.f33824t == y + 1) {
                    return null;
                }
                bVar2.write(bVar, y);
                bVar.readByte();
                bVar2.write(bVar, 1L);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static String readToken(b bVar) {
        try {
            long y = bVar.y(TOKEN_DELIMITERS);
            if (y == -1) {
                y = bVar.f33824t;
            }
            if (y != 0) {
                return bVar.m(y);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public static void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.parseAll(httpUrl, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, parseAll);
    }

    private static String repeat(char c10, int i10) {
        char[] cArr = new char[i10];
        Arrays.fill(cArr, c10);
        return new String(cArr);
    }

    private static int skipAll(b bVar, byte b10) {
        int i10 = 0;
        while (!bVar.u() && bVar.f(0L) == b10) {
            i10++;
            bVar.readByte();
        }
        return i10;
    }

    public static int skipUntil(String str, int i10, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }

    public static int skipWhitespace(String str, int i10) {
        char charAt;
        while (i10 < str.length() && ((charAt = str.charAt(i10)) == ' ' || charAt == '\t')) {
            i10++;
        }
        return i10;
    }

    private static boolean skipWhitespaceAndCommas(b bVar) {
        boolean z10 = false;
        while (!bVar.u()) {
            byte f = bVar.f(0L);
            if (f == 44) {
                bVar.readByte();
                z10 = true;
            } else {
                if (f != 32 && f != 9) {
                    break;
                }
                bVar.readByte();
            }
        }
        return z10;
    }

    private static long stringToLong(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private static Set<String> varyFields(Response response) {
        return varyFields(response.headers());
    }

    public static Headers varyHeaders(Response response) {
        return varyHeaders(response.networkResponse().request().headers(), response.headers());
    }

    public static boolean varyMatches(Response response, Headers headers, Request request) {
        for (String str : varyFields(response)) {
            if (!Objects.equals(headers.values(str), request.headers(str))) {
                return false;
            }
        }
        return true;
    }

    public static long contentLength(Headers headers) {
        return stringToLong(headers.get("Content-Length"));
    }

    public static boolean hasVaryAll(Headers headers) {
        return varyFields(headers).contains("*");
    }

    public static Set<String> varyFields(Headers headers) {
        Set<String> emptySet = Collections.emptySet();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if ("Vary".equalsIgnoreCase(headers.name(i10))) {
                String value = headers.value(i10);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : value.split(",")) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }

    public static Headers varyHeaders(Headers headers, Headers headers2) {
        Set<String> varyFields = varyFields(headers2);
        if (varyFields.isEmpty()) {
            return Util.EMPTY_HEADERS;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            String name = headers.name(i10);
            if (varyFields.contains(name)) {
                builder.add(name, headers.value(i10));
            }
        }
        return builder.build();
    }
}
