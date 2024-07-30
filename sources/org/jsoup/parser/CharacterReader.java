package org.jsoup.parser;

import com.huawei.openalliance.ad.constant.w;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.annotation.Nullable;
import org.jsoup.UncheckedIOException;
import org.jsoup.helper.Validate;

/* loaded from: classes2.dex */
public final class CharacterReader {

    /* renamed from: a, reason: collision with root package name */
    public char[] f34009a;

    /* renamed from: b, reason: collision with root package name */
    public Reader f34010b;

    /* renamed from: c, reason: collision with root package name */
    public int f34011c;

    /* renamed from: d, reason: collision with root package name */
    public int f34012d;

    /* renamed from: e, reason: collision with root package name */
    public int f34013e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f34014g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f34015h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public ArrayList<Integer> f34016i;

    /* renamed from: j, reason: collision with root package name */
    public int f34017j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f34018k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public String f34019l;

    /* renamed from: m, reason: collision with root package name */
    public int f34020m;

    public CharacterReader(Reader reader, int i10) {
        this.f34014g = -1;
        this.f34015h = new String[512];
        this.f34016i = null;
        this.f34017j = 1;
        Validate.notNull(reader);
        Validate.isTrue(reader.markSupported());
        this.f34010b = reader;
        this.f34009a = new char[Math.min(i10, 32768)];
        a();
    }

    public static String b(char[] cArr, String[] strArr, int i10, int i11) {
        if (i11 > 12) {
            return new String(cArr, i10, i11);
        }
        boolean z10 = true;
        if (i11 < 1) {
            return "";
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 31) + cArr[i10 + i13];
        }
        int i14 = i12 & 511;
        String str = strArr[i14];
        if (str != null) {
            if (i11 == str.length()) {
                int i15 = i10;
                int i16 = i11;
                int i17 = 0;
                while (true) {
                    int i18 = i16 - 1;
                    if (i16 == 0) {
                        break;
                    }
                    int i19 = i15 + 1;
                    int i20 = i17 + 1;
                    if (cArr[i15] != str.charAt(i17)) {
                        break;
                    }
                    i15 = i19;
                    i16 = i18;
                    i17 = i20;
                }
            }
            z10 = false;
            if (z10) {
                return str;
            }
        }
        String str2 = new String(cArr, i10, i11);
        strArr[i14] = str2;
        return str2;
    }

    public final void a() {
        int i10;
        int i11;
        boolean z10;
        if (!this.f34018k && (i10 = this.f34013e) >= this.f34012d) {
            int i12 = this.f34014g;
            if (i12 != -1) {
                i11 = i10 - i12;
                i10 = i12;
            } else {
                i11 = 0;
            }
            try {
                long j10 = i10;
                long skip = this.f34010b.skip(j10);
                this.f34010b.mark(32768);
                int i13 = 0;
                while (true) {
                    z10 = true;
                    if (i13 > 1024) {
                        break;
                    }
                    Reader reader = this.f34010b;
                    char[] cArr = this.f34009a;
                    int read = reader.read(cArr, i13, cArr.length - i13);
                    if (read == -1) {
                        this.f34018k = true;
                    }
                    if (read <= 0) {
                        break;
                    } else {
                        i13 += read;
                    }
                }
                this.f34010b.reset();
                if (i13 > 0) {
                    if (skip != j10) {
                        z10 = false;
                    }
                    Validate.isTrue(z10);
                    this.f34011c = i13;
                    this.f += i10;
                    this.f34013e = i11;
                    if (this.f34014g != -1) {
                        this.f34014g = 0;
                    }
                    this.f34012d = Math.min(i13, 24576);
                }
                t();
                this.f34019l = null;
            } catch (IOException e10) {
                throw new UncheckedIOException(e10);
            }
        }
    }

    public void advance() {
        this.f34013e++;
    }

    public final int c(int i10) {
        if (!isTrackNewlines()) {
            return i10 + 1;
        }
        int j10 = j(i10);
        if (j10 == -1) {
            return i10 + 1;
        }
        return (i10 - this.f34016i.get(j10).intValue()) + 1;
    }

    public void close() {
        Reader reader = this.f34010b;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.f34010b = null;
            this.f34009a = null;
            this.f34015h = null;
            throw th;
        }
        this.f34010b = null;
        this.f34009a = null;
        this.f34015h = null;
    }

    public int columnNumber() {
        return c(pos());
    }

    public String consumeTo(char c10) {
        int i10;
        a();
        int i11 = this.f34013e;
        while (true) {
            if (i11 < this.f34011c) {
                if (c10 == this.f34009a[i11]) {
                    i10 = i11 - this.f34013e;
                    break;
                }
                i11++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            String b10 = b(this.f34009a, this.f34015h, this.f34013e, i10);
            this.f34013e += i10;
            return b10;
        }
        a();
        char[] cArr = this.f34009a;
        String[] strArr = this.f34015h;
        int i12 = this.f34013e;
        String b11 = b(cArr, strArr, i12, this.f34011c - i12);
        this.f34013e = this.f34011c;
        return b11;
    }

    public String consumeToAny(char... cArr) {
        a();
        int i10 = this.f34013e;
        int i11 = this.f34011c;
        char[] cArr2 = this.f34009a;
        int i12 = i10;
        loop0: while (i12 < i11) {
            for (char c10 : cArr) {
                if (cArr2[i12] == c10) {
                    break loop0;
                }
            }
            i12++;
        }
        this.f34013e = i12;
        if (i12 > i10) {
            return b(this.f34009a, this.f34015h, i10, i12 - i10);
        }
        return "";
    }

    public char current() {
        boolean z10;
        a();
        int i10 = this.f34013e;
        if (i10 >= this.f34011c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return (char) 65535;
        }
        return this.f34009a[i10];
    }

    public final char d() {
        boolean z10;
        char c10;
        a();
        int i10 = this.f34013e;
        if (i10 >= this.f34011c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c10 = 65535;
        } else {
            c10 = this.f34009a[i10];
        }
        this.f34013e = i10 + 1;
        return c10;
    }

    public final String e(boolean z10) {
        int i10 = this.f34013e;
        int i11 = this.f34011c;
        char[] cArr = this.f34009a;
        int i12 = i10;
        while (i12 < i11) {
            char c10 = cArr[i12];
            if (c10 == 0) {
                break;
            }
            if (c10 != '\"') {
                if (c10 == '&') {
                    break;
                }
                if (c10 == '\'') {
                    if (z10) {
                        break;
                    }
                } else {
                    continue;
                    i12++;
                }
            }
            if (!z10) {
                break;
            }
            i12++;
        }
        this.f34013e = i12;
        if (i12 > i10) {
            return b(this.f34009a, this.f34015h, i10, i12 - i10);
        }
        return "";
    }

    public final String f() {
        int i10 = this.f34013e;
        int i11 = this.f34011c;
        char[] cArr = this.f34009a;
        int i12 = i10;
        while (i12 < i11) {
            char c10 = cArr[i12];
            if (c10 == 0 || c10 == '&' || c10 == '<') {
                break;
            }
            i12++;
        }
        this.f34013e = i12;
        if (i12 > i10) {
            return b(this.f34009a, this.f34015h, i10, i12 - i10);
        }
        return "";
    }

    public final String g() {
        char c10;
        a();
        int i10 = this.f34013e;
        while (true) {
            int i11 = this.f34013e;
            if (i11 >= this.f34011c || (((c10 = this.f34009a[i11]) < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !Character.isLetter(c10)))) {
                break;
            }
            this.f34013e++;
        }
        return b(this.f34009a, this.f34015h, i10, this.f34013e - i10);
    }

    public final String h(char... cArr) {
        a();
        int i10 = this.f34013e;
        int i11 = this.f34011c;
        char[] cArr2 = this.f34009a;
        int i12 = i10;
        while (i12 < i11 && Arrays.binarySearch(cArr, cArr2[i12]) < 0) {
            i12++;
        }
        this.f34013e = i12;
        if (i12 > i10) {
            return b(this.f34009a, this.f34015h, i10, i12 - i10);
        }
        return "";
    }

    public final String i() {
        return lineNumber() + w.bE + columnNumber();
    }

    public boolean isEmpty() {
        a();
        if (this.f34013e >= this.f34011c) {
            return true;
        }
        return false;
    }

    public boolean isTrackNewlines() {
        if (this.f34016i != null) {
            return true;
        }
        return false;
    }

    public final int j(int i10) {
        if (!isTrackNewlines()) {
            return 0;
        }
        int binarySearch = Collections.binarySearch(this.f34016i, Integer.valueOf(i10));
        if (binarySearch < -1) {
            return Math.abs(binarySearch) - 2;
        }
        return binarySearch;
    }

    public final int k(int i10) {
        if (!isTrackNewlines()) {
            return 1;
        }
        int j10 = j(i10);
        if (j10 == -1) {
            return this.f34017j;
        }
        return j10 + this.f34017j + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.String r8) {
        /*
            r7 = this;
            r7.a()
            r7.a()
            int r0 = r8.length()
            int r1 = r7.f34011c
            int r2 = r7.f34013e
            int r1 = r1 - r2
            r2 = 0
            r3 = 1
            if (r0 <= r1) goto L14
            goto L24
        L14:
            r1 = r2
        L15:
            if (r1 >= r0) goto L29
            char r4 = r8.charAt(r1)
            char[] r5 = r7.f34009a
            int r6 = r7.f34013e
            int r6 = r6 + r1
            char r5 = r5[r6]
            if (r4 == r5) goto L26
        L24:
            r0 = r2
            goto L2a
        L26:
            int r1 = r1 + 1
            goto L15
        L29:
            r0 = r3
        L2a:
            if (r0 == 0) goto L36
            int r0 = r7.f34013e
            int r8 = r8.length()
            int r8 = r8 + r0
            r7.f34013e = r8
            return r3
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.CharacterReader.l(java.lang.String):boolean");
    }

    public int lineNumber() {
        return k(pos());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(java.lang.String r8) {
        /*
            r7 = this;
            r7.a()
            int r0 = r8.length()
            int r1 = r7.f34011c
            int r2 = r7.f34013e
            int r1 = r1 - r2
            r2 = 0
            r3 = 1
            if (r0 <= r1) goto L11
            goto L29
        L11:
            r1 = r2
        L12:
            if (r1 >= r0) goto L2e
            char r4 = r8.charAt(r1)
            char r4 = java.lang.Character.toUpperCase(r4)
            char[] r5 = r7.f34009a
            int r6 = r7.f34013e
            int r6 = r6 + r1
            char r5 = r5[r6]
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r4 == r5) goto L2b
        L29:
            r0 = r2
            goto L2f
        L2b:
            int r1 = r1 + 1
            goto L12
        L2e:
            r0 = r3
        L2f:
            if (r0 == 0) goto L3b
            int r0 = r7.f34013e
            int r8 = r8.length()
            int r8 = r8 + r0
            r7.f34013e = r8
            return r3
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.CharacterReader.m(java.lang.String):boolean");
    }

    public final boolean n(char c10) {
        if (!isEmpty() && this.f34009a[this.f34013e] == c10) {
            return true;
        }
        return false;
    }

    public final boolean o(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        a();
        char c10 = this.f34009a[this.f34013e];
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        if (isEmpty()) {
            return false;
        }
        char c10 = this.f34009a[this.f34013e];
        if ((c10 < 'A' || c10 > 'Z') && (c10 < 'a' || c10 > 'z')) {
            return false;
        }
        return true;
    }

    public int pos() {
        return this.f + this.f34013e;
    }

    public final boolean q() {
        if (isEmpty()) {
            return false;
        }
        char c10 = this.f34009a[this.f34013e];
        if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !Character.isLetter(c10))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r2 = r1 + 1;
        r4 = (r9.length() + r2) - 1;
        r5 = r8.f34011c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 >= r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r4 > r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r5 >= r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r9.charAt(r3) != r8.f34009a[r5]) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r5 = r5 + 1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5 != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        return r1 - r8.f34013e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r0 != r8.f34009a[r1]) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r1 >= r8.f34011c) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r0 == r8.f34009a[r1]) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r(java.lang.String r9) {
        /*
            r8 = this;
            r8.a()
            r0 = 0
            char r0 = r9.charAt(r0)
            int r1 = r8.f34013e
        La:
            int r2 = r8.f34011c
            if (r1 >= r2) goto L49
            char[] r2 = r8.f34009a
            char r2 = r2[r1]
            r3 = 1
            if (r0 == r2) goto L21
        L15:
            int r1 = r1 + r3
            int r2 = r8.f34011c
            if (r1 >= r2) goto L21
            char[] r2 = r8.f34009a
            char r2 = r2[r1]
            if (r0 == r2) goto L21
            goto L15
        L21:
            int r2 = r1 + 1
            int r4 = r9.length()
            int r4 = r4 + r2
            int r4 = r4 - r3
            int r5 = r8.f34011c
            if (r1 >= r5) goto L47
            if (r4 > r5) goto L47
            r5 = r2
        L30:
            if (r5 >= r4) goto L41
            char r6 = r9.charAt(r3)
            char[] r7 = r8.f34009a
            char r7 = r7[r5]
            if (r6 != r7) goto L41
            int r5 = r5 + 1
            int r3 = r3 + 1
            goto L30
        L41:
            if (r5 != r4) goto L47
            int r9 = r8.f34013e
            int r1 = r1 - r9
            return r1
        L47:
            r1 = r2
            goto La
        L49:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.CharacterReader.r(java.lang.String):int");
    }

    public final void s() {
        int i10 = this.f34014g;
        if (i10 != -1) {
            this.f34013e = i10;
            this.f34014g = -1;
            return;
        }
        throw new UncheckedIOException(new IOException("Mark invalid"));
    }

    public final void t() {
        if (!isTrackNewlines()) {
            return;
        }
        if (this.f34016i.size() > 0) {
            int j10 = j(this.f);
            if (j10 == -1) {
                j10 = 0;
            }
            int intValue = this.f34016i.get(j10).intValue();
            this.f34017j += j10;
            this.f34016i.clear();
            this.f34016i.add(Integer.valueOf(intValue));
        }
        for (int i10 = this.f34013e; i10 < this.f34011c; i10++) {
            if (this.f34009a[i10] == '\n') {
                this.f34016i.add(Integer.valueOf(this.f + 1 + i10));
            }
        }
    }

    public String toString() {
        int i10 = this.f34011c;
        int i11 = this.f34013e;
        if (i10 - i11 < 0) {
            return "";
        }
        return new String(this.f34009a, i11, i10 - i11);
    }

    public void trackNewlines(boolean z10) {
        if (z10 && this.f34016i == null) {
            this.f34016i = new ArrayList<>(409);
            t();
        } else if (!z10) {
            this.f34016i = null;
        }
    }

    public final void u() {
        int i10 = this.f34013e;
        if (i10 >= 1) {
            this.f34013e = i10 - 1;
            return;
        }
        throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
    }

    public CharacterReader(Reader reader) {
        this(reader, 32768);
    }

    public CharacterReader(String str) {
        this(new StringReader(str), str.length());
    }
}
