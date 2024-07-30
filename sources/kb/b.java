package kb;

import javax.security.auth.x500.X500Principal;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f32273a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32274b;

    /* renamed from: c, reason: collision with root package name */
    public int f32275c;

    /* renamed from: d, reason: collision with root package name */
    public int f32276d;

    /* renamed from: e, reason: collision with root package name */
    public int f32277e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public char[] f32278g;

    public b(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f32273a = name;
        this.f32274b = name.length();
    }

    public final int a(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        int i14 = this.f32274b;
        String str = this.f32273a;
        if (i13 < i14) {
            char[] cArr = this.f32278g;
            char c10 = cArr[i10];
            if (c10 >= '0' && c10 <= '9') {
                i11 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i11 = c10 - 'W';
            } else if (c10 >= 'A' && c10 <= 'F') {
                i11 = c10 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            char c11 = cArr[i13];
            if (c11 >= '0' && c11 <= '9') {
                i12 = c11 - '0';
            } else if (c11 >= 'a' && c11 <= 'f') {
                i12 = c11 - 'W';
            } else if (c11 >= 'A' && c11 <= 'F') {
                i12 = c11 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            return (i11 << 4) + i12;
        }
        throw new IllegalStateException("Malformed DN: " + str);
    }

    public final char b() {
        int i10;
        int i11 = this.f32275c + 1;
        this.f32275c = i11;
        int i12 = this.f32274b;
        if (i11 != i12) {
            char c10 = this.f32278g[i11];
            if (c10 != ' ' && c10 != '%' && c10 != '\\' && c10 != '_' && c10 != '\"' && c10 != '#') {
                switch (c10) {
                    default:
                        switch (c10) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                int a10 = a(i11);
                                this.f32275c++;
                                if (a10 >= 128) {
                                    if (a10 >= 192 && a10 <= 247) {
                                        if (a10 <= 223) {
                                            a10 &= 31;
                                            i10 = 1;
                                        } else if (a10 <= 239) {
                                            a10 &= 15;
                                            i10 = 2;
                                        } else {
                                            a10 &= 7;
                                            i10 = 3;
                                        }
                                        for (int i13 = 0; i13 < i10; i13++) {
                                            int i14 = this.f32275c + 1;
                                            this.f32275c = i14;
                                            if (i14 != i12 && this.f32278g[i14] == '\\') {
                                                int i15 = i14 + 1;
                                                this.f32275c = i15;
                                                int a11 = a(i15);
                                                this.f32275c++;
                                                if ((a11 & 192) == 128) {
                                                    a10 = (a10 << 6) + (a11 & 63);
                                                }
                                            }
                                        }
                                    }
                                    return '?';
                                }
                                return (char) a10;
                        }
                    case '*':
                    case '+':
                    case ',':
                        return c10;
                }
            }
            return c10;
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f32273a);
    }

    public final String c() {
        int i10;
        int i11;
        int i12;
        char c10;
        char c11;
        char c12;
        int i13;
        char c13;
        char c14;
        while (true) {
            i10 = this.f32275c;
            i11 = this.f32274b;
            if (i10 >= i11 || this.f32278g[i10] != ' ') {
                break;
            }
            this.f32275c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.f32276d = i10;
        this.f32275c = i10 + 1;
        while (true) {
            i12 = this.f32275c;
            if (i12 >= i11 || (c14 = this.f32278g[i12]) == '=' || c14 == ' ') {
                break;
            }
            this.f32275c = i12 + 1;
        }
        String str = this.f32273a;
        if (i12 < i11) {
            this.f32277e = i12;
            if (this.f32278g[i12] == ' ') {
                while (true) {
                    i13 = this.f32275c;
                    if (i13 >= i11 || (c13 = this.f32278g[i13]) == '=' || c13 != ' ') {
                        break;
                    }
                    this.f32275c = i13 + 1;
                }
                if (this.f32278g[i13] != '=' || i13 == i11) {
                    throw new IllegalStateException("Unexpected end of DN: " + str);
                }
            }
            this.f32275c++;
            while (true) {
                int i14 = this.f32275c;
                if (i14 >= i11 || this.f32278g[i14] != ' ') {
                    break;
                }
                this.f32275c = i14 + 1;
            }
            int i15 = this.f32277e;
            int i16 = this.f32276d;
            if (i15 - i16 > 4) {
                char[] cArr = this.f32278g;
                if (cArr[i16 + 3] == '.' && (((c10 = cArr[i16]) == 'O' || c10 == 'o') && (((c11 = cArr[i16 + 1]) == 'I' || c11 == 'i') && ((c12 = cArr[i16 + 2]) == 'D' || c12 == 'd')))) {
                    this.f32276d = i16 + 4;
                }
            }
            char[] cArr2 = this.f32278g;
            int i17 = this.f32276d;
            return new String(cArr2, i17, i15 - i17);
        }
        throw new IllegalStateException("Unexpected end of DN: " + str);
    }
}
