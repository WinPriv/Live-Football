package com.google.android.gms.common.server.response;

import android.util.Log;
import com.anythink.expressad.exoplayer.b;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.huawei.hms.ads.gl;
import com.vungle.warren.downloader.DownloadRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import org.jsoup.nodes.Element;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', '\"'};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zaf = {'\n'};
    private static final zai<Integer> zag = new zaa();
    private static final zai<Long> zah = new zab();
    private static final zai<Float> zai = new zac();
    private static final zai<Double> zaj = new zad();
    private static final zai<Boolean> zak = new zae();
    private static final zai<String> zal = new zaf();
    private static final zai<BigInteger> zam = new zag();
    private static final zai<BigDecimal> zan = new zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(1024);
    private final Stack<Integer> zat = new Stack<>();

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String zaA(java.io.BufferedReader r8, char[] r9, java.lang.StringBuilder r10, char[] r11) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            r0 = 0
            r10.setLength(r0)
            int r1 = r9.length
            r8.mark(r1)
            r1 = r0
            r2 = r1
        La:
            int r3 = r8.read(r9)
            r4 = -1
            if (r3 == r4) goto L68
            r4 = r0
        L12:
            if (r4 >= r3) goto L60
            char r5 = r9[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            if (r6 == 0) goto L31
            if (r11 == 0) goto L29
            r6 = r0
        L1f:
            if (r6 > 0) goto L29
            char r7 = r11[r6]
            if (r7 != r5) goto L26
            goto L31
        L26:
            int r6 = r6 + 1
            goto L1f
        L29:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected control character while reading string"
            r8.<init>(r9)
            throw r8
        L31:
            r6 = 34
            r7 = 1
            if (r5 != r6) goto L53
            if (r2 != 0) goto L5c
            r10.append(r9, r0, r4)
            r8.reset()
            int r4 = r4 + r7
            long r2 = (long) r4
            r8.skip(r2)
            if (r1 == 0) goto L4e
            java.lang.String r8 = r10.toString()
            java.lang.String r8 = com.google.android.gms.common.util.JsonUtils.unescapeString(r8)
            return r8
        L4e:
            java.lang.String r8 = r10.toString()
            return r8
        L53:
            r6 = 92
            if (r5 != r6) goto L5c
            r1 = r2 ^ 1
            r2 = r1
            r1 = r7
            goto L5d
        L5c:
            r2 = r0
        L5d:
            int r4 = r4 + 1
            goto L12
        L60:
            r10.append(r9, r0, r3)
            int r3 = r9.length
            r8.mark(r3)
            goto La
        L68:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected EOF while parsing string"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaA(java.io.BufferedReader, char[], java.lang.StringBuilder, char[]):java.lang.String");
    }

    private final char zai(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.zao) == -1) {
            return (char) 0;
        }
        while (Character.isWhitespace(this.zao[0])) {
            if (bufferedReader.read(this.zao) == -1) {
                return (char) 0;
            }
        }
        return this.zao[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return gl.Code;
        }
        return Float.parseFloat(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(BufferedReader bufferedReader) throws ParseException, IOException {
        int i10;
        int i11;
        int i12;
        int i13;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (zam2 > 0) {
            char c10 = cArr[0];
            if (c10 == '-') {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = DownloadRequest.Priority.CRITICAL;
            }
            if (c10 == '-') {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (i11 < zam2) {
                i13 = i11 + 1;
                int digit = Character.digit(cArr[i11], 10);
                if (digit >= 0) {
                    i12 = -digit;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                i12 = 0;
                i13 = i11;
            }
            while (i13 < zam2) {
                int i14 = i13 + 1;
                int digit2 = Character.digit(cArr[i13], 10);
                if (digit2 >= 0) {
                    if (i12 >= -214748364) {
                        int i15 = i12 * 10;
                        if (i15 >= i10 + digit2) {
                            i12 = i15 - digit2;
                            i13 = i14;
                        } else {
                            throw new ParseException("Number too large");
                        }
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            if (i11 != 0) {
                if (i13 <= 1) {
                    throw new ParseException("No digits to parse");
                }
                return i12;
            }
            return -i12;
        }
        throw new ParseException("No number to parse");
    }

    private final int zam(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i10;
        char zai2 = zai(bufferedReader);
        if (zai2 != 0) {
            if (zai2 != ',') {
                if (zai2 == 'n') {
                    zax(bufferedReader, zaa);
                    return 0;
                }
                bufferedReader.mark(1024);
                if (zai2 == '\"') {
                    i10 = 0;
                    boolean z10 = false;
                    while (i10 < 1024 && bufferedReader.read(cArr, i10, 1) != -1) {
                        char c10 = cArr[i10];
                        if (!Character.isISOControl(c10)) {
                            if (c10 == '\"') {
                                if (!z10) {
                                    bufferedReader.reset();
                                    bufferedReader.skip(i10 + 1);
                                    return i10;
                                }
                            } else if (c10 == '\\') {
                                z10 = !z10;
                                i10++;
                            }
                            z10 = false;
                            i10++;
                        } else {
                            throw new ParseException("Unexpected control character while reading string");
                        }
                    }
                } else {
                    cArr[0] = zai2;
                    i10 = 1;
                    while (i10 < 1024 && bufferedReader.read(cArr, i10, 1) != -1) {
                        char c11 = cArr[i10];
                        if (c11 != '}' && c11 != ',' && !Character.isWhitespace(c11) && cArr[i10] != ']') {
                            i10++;
                        } else {
                            bufferedReader.reset();
                            bufferedReader.skip(i10 - 1);
                            cArr[i10] = 0;
                            return i10;
                        }
                    }
                }
                if (i10 == 1024) {
                    throw new ParseException("Absurdly long value");
                }
                throw new ParseException("Unexpected EOF");
            }
            throw new ParseException("Missing value");
        }
        throw new ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(BufferedReader bufferedReader) throws ParseException, IOException {
        long j10;
        long j11;
        int i10;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (zam2 > 0) {
            int i11 = 0;
            char c10 = cArr[0];
            if (c10 == '-') {
                j10 = Long.MIN_VALUE;
            } else {
                j10 = b.f7291b;
            }
            if (c10 == '-') {
                i11 = 1;
            }
            if (i11 < zam2) {
                i10 = i11 + 1;
                int digit = Character.digit(cArr[i11], 10);
                if (digit >= 0) {
                    j11 = -digit;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                j11 = 0;
                i10 = i11;
            }
            while (i10 < zam2) {
                int i12 = i10 + 1;
                int digit2 = Character.digit(cArr[i10], 10);
                if (digit2 >= 0) {
                    if (j11 >= -922337203685477580L) {
                        long j12 = j11 * 10;
                        int i13 = zam2;
                        long j13 = digit2;
                        if (j12 >= j10 + j13) {
                            j11 = j12 - j13;
                            zam2 = i13;
                            i10 = i12;
                        } else {
                            throw new ParseException("Number too large");
                        }
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            if (i11 != 0) {
                if (i10 <= 1) {
                    throw new ParseException("No digits to parse");
                }
                return j11;
            }
            return -j11;
        }
        throw new ParseException("No number to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zao(BufferedReader bufferedReader) throws ParseException, IOException {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    private final String zap(BufferedReader bufferedReader, char[] cArr, StringBuilder sb2, char[] cArr2) throws ParseException, IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 != '\"') {
            if (zai2 == 'n') {
                zax(bufferedReader, zaa);
                return null;
            }
            throw new ParseException("Expected string");
        }
        return zaA(bufferedReader, cArr, sb2, cArr2);
    }

    private final String zaq(BufferedReader bufferedReader) throws ParseException, IOException {
        this.zat.push(2);
        char zai2 = zai(bufferedReader);
        if (zai2 != '\"') {
            if (zai2 != ']') {
                if (zai2 == '}') {
                    zaw(2);
                    return null;
                }
                StringBuilder sb2 = new StringBuilder(19);
                sb2.append("Unexpected token: ");
                sb2.append(zai2);
                throw new ParseException(sb2.toString());
            }
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        }
        this.zat.push(3);
        String zaA = zaA(bufferedReader, this.zap, this.zar, null);
        zaw(3);
        if (zai(bufferedReader) == ':') {
            return zaA;
        }
        throw new ParseException("Expected key/value separator");
    }

    private final String zar(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char zai2 = zai(bufferedReader);
        int i10 = 1;
        if (zai2 != '\"') {
            if (zai2 != ',') {
                if (zai2 != '[') {
                    if (zai2 != '{') {
                        bufferedReader.reset();
                        zam(bufferedReader, this.zaq);
                    } else {
                        this.zat.push(1);
                        bufferedReader.mark(32);
                        char zai3 = zai(bufferedReader);
                        if (zai3 == '}') {
                            zaw(1);
                        } else if (zai3 == '\"') {
                            bufferedReader.reset();
                            zaq(bufferedReader);
                            do {
                            } while (zar(bufferedReader) != null);
                            zaw(1);
                        } else {
                            StringBuilder sb2 = new StringBuilder(18);
                            sb2.append("Unexpected token ");
                            sb2.append(zai3);
                            throw new ParseException(sb2.toString());
                        }
                    }
                } else {
                    this.zat.push(5);
                    bufferedReader.mark(32);
                    if (zai(bufferedReader) == ']') {
                        zaw(5);
                    } else {
                        bufferedReader.reset();
                        boolean z10 = false;
                        boolean z11 = false;
                        while (i10 > 0) {
                            char zai4 = zai(bufferedReader);
                            if (zai4 != 0) {
                                if (!Character.isISOControl(zai4)) {
                                    if (zai4 == '\"') {
                                        if (!z11) {
                                            z10 = !z10;
                                        }
                                        zai4 = '\"';
                                    }
                                    if (zai4 == '[') {
                                        if (!z10) {
                                            i10++;
                                        }
                                        zai4 = '[';
                                    }
                                    if (zai4 == ']' && !z10) {
                                        i10--;
                                    }
                                    if (zai4 == '\\' && z10) {
                                        z11 = !z11;
                                    } else {
                                        z11 = false;
                                    }
                                } else {
                                    throw new ParseException("Unexpected control character while reading array");
                                }
                            } else {
                                throw new ParseException("Unexpected EOF while parsing array");
                            }
                        }
                        zaw(5);
                    }
                }
            } else {
                throw new ParseException("Missing value");
            }
        } else {
            if (bufferedReader.read(this.zao) != -1) {
                char c10 = this.zao[0];
                boolean z12 = false;
                do {
                    if (c10 == '\"') {
                        if (z12) {
                            c10 = '\"';
                            z12 = true;
                        }
                    }
                    if (c10 == '\\') {
                        z12 = !z12;
                    } else {
                        z12 = false;
                    }
                    if (bufferedReader.read(this.zao) != -1) {
                        c10 = this.zao[0];
                    } else {
                        throw new ParseException("Unexpected EOF while parsing string");
                    }
                } while (!Character.isISOControl(c10));
                throw new ParseException("Unexpected control character while reading string");
            }
            throw new ParseException("Unexpected EOF while parsing string");
        }
        char zai5 = zai(bufferedReader);
        if (zai5 != ',') {
            if (zai5 == '}') {
                zaw(2);
                return null;
            }
            StringBuilder sb3 = new StringBuilder(18);
            sb3.append("Unexpected token ");
            sb3.append(zai5);
            throw new ParseException(sb3.toString());
        }
        zaw(2);
        return zaq(bufferedReader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigDecimal zas(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigInteger zat(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaq, 0, zam2));
    }

    private final <O> ArrayList<O> zau(BufferedReader bufferedReader, zai<O> zaiVar) throws ParseException, IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (zai2 == '[') {
            this.zat.push(5);
            ArrayList<O> arrayList = new ArrayList<>();
            while (true) {
                bufferedReader.mark(1024);
                char zai3 = zai(bufferedReader);
                if (zai3 != 0) {
                    if (zai3 != ',') {
                        if (zai3 != ']') {
                            bufferedReader.reset();
                            arrayList.add(zaiVar.zaa(this, bufferedReader));
                        } else {
                            zaw(5);
                            return arrayList;
                        }
                    }
                } else {
                    throw new ParseException("Unexpected EOF");
                }
            }
        } else {
            throw new ParseException("Expected start of array");
        }
    }

    private final <T extends FastJsonResponse> ArrayList<T> zav(BufferedReader bufferedReader, FastJsonResponse.Field<?, ?> field) throws ParseException, IOException {
        Element.b bVar = (ArrayList<T>) new ArrayList();
        char zai2 = zai(bufferedReader);
        if (zai2 != ']') {
            if (zai2 != 'n') {
                if (zai2 == '{') {
                    this.zat.push(1);
                    while (true) {
                        try {
                            FastJsonResponse zad2 = field.zad();
                            if (zaz(bufferedReader, zad2)) {
                                bVar.add(zad2);
                                char zai3 = zai(bufferedReader);
                                if (zai3 != ',') {
                                    if (zai3 == ']') {
                                        zaw(5);
                                        return bVar;
                                    }
                                    StringBuilder sb2 = new StringBuilder(19);
                                    sb2.append("Unexpected token: ");
                                    sb2.append(zai3);
                                    throw new ParseException(sb2.toString());
                                }
                                if (zai(bufferedReader) == '{') {
                                    this.zat.push(1);
                                } else {
                                    throw new ParseException("Expected start of next object in array");
                                }
                            } else {
                                return bVar;
                            }
                        } catch (IllegalAccessException e10) {
                            throw new ParseException("Error instantiating inner object", e10);
                        } catch (InstantiationException e11) {
                            throw new ParseException("Error instantiating inner object", e11);
                        }
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(19);
                    sb3.append("Unexpected token: ");
                    sb3.append(zai2);
                    throw new ParseException(sb3.toString());
                }
            } else {
                zax(bufferedReader, zaa);
                zaw(5);
                return null;
            }
        } else {
            zaw(5);
            return bVar;
        }
    }

    private final void zaw(int i10) throws ParseException {
        if (!this.zat.isEmpty()) {
            int intValue = this.zat.pop().intValue();
            if (intValue == i10) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(46);
            sb2.append("Expected state ");
            sb2.append(i10);
            sb2.append(" but had ");
            sb2.append(intValue);
            throw new ParseException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(46);
        sb3.append("Expected state ");
        sb3.append(i10);
        sb3.append(" but had empty stack");
        throw new ParseException(sb3.toString());
    }

    private final void zax(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i10 = 0;
        while (true) {
            int length = cArr.length;
            if (i10 < length) {
                int read = bufferedReader.read(this.zap, 0, length - i10);
                if (read != -1) {
                    for (int i11 = 0; i11 < read; i11++) {
                        if (cArr[i11 + i10] != this.zap[i11]) {
                            throw new ParseException("Unexpected character");
                        }
                    }
                    i10 += read;
                } else {
                    throw new ParseException("Unexpected EOF");
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(BufferedReader bufferedReader, boolean z10) throws ParseException, IOException {
        char[] cArr;
        char[] cArr2;
        char zai2 = zai(bufferedReader);
        if (zai2 != '\"') {
            if (zai2 != 'f') {
                if (zai2 != 'n') {
                    if (zai2 == 't') {
                        if (z10) {
                            cArr2 = zac;
                        } else {
                            cArr2 = zab;
                        }
                        zax(bufferedReader, cArr2);
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder(19);
                    sb2.append("Unexpected token: ");
                    sb2.append(zai2);
                    throw new ParseException(sb2.toString());
                }
                zax(bufferedReader, zaa);
                return false;
            }
            if (z10) {
                cArr = zae;
            } else {
                cArr = zad;
            }
            zax(bufferedReader, cArr);
            return false;
        }
        if (!z10) {
            return zay(bufferedReader, true);
        }
        throw new ParseException("No boolean value found in string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x003b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x028f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0271 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zaz(java.io.BufferedReader r17, com.google.android.gms.common.server.response.FastJsonResponse r18) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaz(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse):boolean");
    }

    @KeepForSdk
    public void parse(InputStream inputStream, T t10) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char zai2 = zai(bufferedReader);
                if (zai2 != 0) {
                    if (zai2 != '[') {
                        if (zai2 == '{') {
                            this.zat.push(1);
                            zaz(bufferedReader, t10);
                        } else {
                            StringBuilder sb2 = new StringBuilder(19);
                            sb2.append("Unexpected token: ");
                            sb2.append(zai2);
                            throw new ParseException(sb2.toString());
                        }
                    } else {
                        this.zat.push(5);
                        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t10.getFieldMappings();
                        if (fieldMappings.size() == 1) {
                            FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                            t10.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                        } else {
                            throw new ParseException("Object array response class must have a single Field");
                        }
                    }
                    zaw(0);
                    try {
                        bufferedReader.close();
                        return;
                    } catch (IOException unused) {
                        Log.w("FastParser", "Failed to close reader while parsing.");
                        return;
                    }
                }
                throw new ParseException("No data to parse");
            } catch (IOException e10) {
                throw new ParseException(e10);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }
}
