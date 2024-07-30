package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

/* loaded from: classes2.dex */
public class TokenQueue {

    /* renamed from: a, reason: collision with root package name */
    public String f34072a;

    /* renamed from: b, reason: collision with root package name */
    public int f34073b = 0;

    public TokenQueue(String str) {
        Validate.notNull(str);
        this.f34072a = str;
    }

    public static String unescape(String str) {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i10 = 0;
        char c10 = 0;
        while (i10 < length) {
            char c11 = charArray[i10];
            if (c11 == '\\') {
                if (c10 == '\\') {
                    borrowBuilder.append(c11);
                }
            } else {
                borrowBuilder.append(c11);
            }
            i10++;
            c10 = c11;
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public void addFirst(String str) {
        StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
        j10.append(this.f34072a.substring(this.f34073b));
        this.f34072a = j10.toString();
        this.f34073b = 0;
    }

    public void advance() {
        if (!isEmpty()) {
            this.f34073b++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[LOOP:0: B:2:0x0009->B:24:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[EDGE_INSN: B:25:0x0055->B:26:0x0055 BREAK  A[LOOP:0: B:2:0x0009->B:24:0x0079], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String chompBalanced(char r12, char r13) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r5 = r0
            r6 = r5
            r2 = r1
            r3 = r2
            r4 = r3
            r7 = r4
            r8 = r7
        L9:
            boolean r9 = r11.isEmpty()
            if (r9 == 0) goto L10
            goto L55
        L10:
            char r9 = r11.consume()
            r10 = 92
            if (r2 == r10) goto L42
            r10 = 39
            if (r9 != r10) goto L23
            if (r9 == r12) goto L23
            if (r3 != 0) goto L23
            r4 = r4 ^ 1
            goto L2d
        L23:
            r10 = 34
            if (r9 != r10) goto L2d
            if (r9 == r12) goto L2d
            if (r4 != 0) goto L2d
            r3 = r3 ^ 1
        L2d:
            if (r4 != 0) goto L53
            if (r3 != 0) goto L53
            if (r8 == 0) goto L34
            goto L53
        L34:
            if (r9 != r12) goto L3d
            int r7 = r7 + 1
            if (r5 != r0) goto L4d
            int r5 = r11.f34073b
            goto L4d
        L3d:
            if (r9 != r13) goto L4d
            int r7 = r7 + (-1)
            goto L4d
        L42:
            r10 = 81
            if (r9 != r10) goto L48
            r8 = 1
            goto L4d
        L48:
            r10 = 69
            if (r9 != r10) goto L4d
            r8 = r1
        L4d:
            if (r7 <= 0) goto L53
            if (r2 == 0) goto L53
            int r6 = r11.f34073b
        L53:
            if (r7 > 0) goto L79
        L55:
            if (r6 < 0) goto L5e
            java.lang.String r12 = r11.f34072a
            java.lang.String r12 = r12.substring(r5, r6)
            goto L60
        L5e:
            java.lang.String r12 = ""
        L60:
            if (r7 <= 0) goto L78
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Did not find balanced marker at '"
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r0 = "'"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            org.jsoup.helper.Validate.fail(r13)
        L78:
            return r12
        L79:
            r2 = r9
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TokenQueue.chompBalanced(char, char):java.lang.String");
    }

    public String chompTo(String str) {
        String consumeTo = consumeTo(str);
        matchChomp(str);
        return consumeTo;
    }

    public String chompToIgnoreCase(String str) {
        String consumeToIgnoreCase = consumeToIgnoreCase(str);
        matchChomp(str);
        return consumeToIgnoreCase;
    }

    public char consume() {
        String str = this.f34072a;
        int i10 = this.f34073b;
        this.f34073b = i10 + 1;
        return str.charAt(i10);
    }

    public String consumeCssIdentifier() {
        int i10 = this.f34073b;
        while (!isEmpty() && (matchesWord() || matchesAny('-', '_'))) {
            this.f34073b++;
        }
        return this.f34072a.substring(i10, this.f34073b);
    }

    public String consumeElementSelector() {
        int i10 = this.f34073b;
        while (!isEmpty() && (matchesWord() || matchesAny("*|", com.anythink.expressad.foundation.g.a.bQ, "_", "-"))) {
            this.f34073b++;
        }
        return this.f34072a.substring(i10, this.f34073b);
    }

    public String consumeTo(String str) {
        int indexOf = this.f34072a.indexOf(str, this.f34073b);
        if (indexOf != -1) {
            String substring = this.f34072a.substring(this.f34073b, indexOf);
            this.f34073b = substring.length() + this.f34073b;
            return substring;
        }
        return remainder();
    }

    public String consumeToAny(String... strArr) {
        int i10 = this.f34073b;
        while (!isEmpty() && !matchesAny(strArr)) {
            this.f34073b++;
        }
        return this.f34072a.substring(i10, this.f34073b);
    }

    public String consumeToIgnoreCase(String str) {
        int i10 = this.f34073b;
        String substring = str.substring(0, 1);
        boolean equals = substring.toLowerCase().equals(substring.toUpperCase());
        while (!isEmpty() && !matches(str)) {
            if (equals) {
                int indexOf = this.f34072a.indexOf(substring, this.f34073b);
                int i11 = this.f34073b;
                int i12 = indexOf - i11;
                if (i12 == 0) {
                    this.f34073b = i11 + 1;
                } else if (i12 < 0) {
                    this.f34073b = this.f34072a.length();
                } else {
                    this.f34073b = i11 + i12;
                }
            } else {
                this.f34073b++;
            }
        }
        return this.f34072a.substring(i10, this.f34073b);
    }

    public boolean consumeWhitespace() {
        boolean z10 = false;
        while (matchesWhitespace()) {
            this.f34073b++;
            z10 = true;
        }
        return z10;
    }

    public String consumeWord() {
        int i10 = this.f34073b;
        while (matchesWord()) {
            this.f34073b++;
        }
        return this.f34072a.substring(i10, this.f34073b);
    }

    public boolean isEmpty() {
        if (this.f34072a.length() - this.f34073b == 0) {
            return true;
        }
        return false;
    }

    public boolean matchChomp(String str) {
        if (matches(str)) {
            this.f34073b = str.length() + this.f34073b;
            return true;
        }
        return false;
    }

    public boolean matches(String str) {
        return this.f34072a.regionMatches(true, this.f34073b, str, 0, str.length());
    }

    public boolean matchesAny(String... strArr) {
        for (String str : strArr) {
            if (matches(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesWhitespace() {
        if (!isEmpty() && StringUtil.isWhitespace(this.f34072a.charAt(this.f34073b))) {
            return true;
        }
        return false;
    }

    public boolean matchesWord() {
        if (!isEmpty() && Character.isLetterOrDigit(this.f34072a.charAt(this.f34073b))) {
            return true;
        }
        return false;
    }

    public String remainder() {
        String substring = this.f34072a.substring(this.f34073b);
        this.f34073b = this.f34072a.length();
        return substring;
    }

    public String toString() {
        return this.f34072a.substring(this.f34073b);
    }

    public void consume(String str) {
        if (matches(str)) {
            int length = str.length();
            int length2 = this.f34072a.length();
            int i10 = this.f34073b;
            if (length <= length2 - i10) {
                this.f34073b = i10 + length;
                return;
            }
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        for (char c10 : cArr) {
            if (this.f34072a.charAt(this.f34073b) == c10) {
                return true;
            }
        }
        return false;
    }
}
