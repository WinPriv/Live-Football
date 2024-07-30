package hd;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final p f28958e = new p(0, null, 1443168256, 1);
    public static final p f = new p(1, null, 1509950721, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final p f28959g = new p(2, null, 1124075009, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final p f28960h = new p(3, null, 1107297537, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final p f28961i = new p(4, null, 1392510721, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final p f28962j = new p(5, null, 1224736769, 1);

    /* renamed from: k, reason: collision with root package name */
    public static final p f28963k = new p(6, null, 1174536705, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final p f28964l = new p(7, null, 1241579778, 1);

    /* renamed from: m, reason: collision with root package name */
    public static final p f28965m = new p(8, null, 1141048066, 1);

    /* renamed from: a, reason: collision with root package name */
    public final int f28966a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f28967b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28968c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28969d;

    public p(int i10, char[] cArr, int i11, int i12) {
        this.f28966a = i10;
        this.f28967b = cArr;
        this.f28968c = i11;
        this.f28969d = i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
    
        if (r5 == 'L') goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0047, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        if (r7[r6 + r0] == ';') goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0058, code lost:
    
        return new hd.p(9, r7, r6, r0 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static hd.p a(int r6, char[] r7) {
        /*
            char r0 = r7[r6]
            r1 = 70
            if (r0 == r1) goto L7c
            r1 = 59
            r2 = 76
            r3 = 1
            if (r0 == r2) goto L68
            r4 = 83
            if (r0 == r4) goto L65
            r4 = 86
            if (r0 == r4) goto L62
            r4 = 73
            if (r0 == r4) goto L5f
            r4 = 74
            if (r0 == r4) goto L5c
            r4 = 90
            if (r0 == r4) goto L59
            r4 = 91
            if (r0 == r4) goto L3b
            switch(r0) {
                case 66: goto L38;
                case 67: goto L35;
                case 68: goto L32;
                default: goto L28;
            }
        L28:
            hd.p r0 = new hd.p
            int r1 = r7.length
            int r1 = r1 - r6
            r2 = 11
            r0.<init>(r2, r7, r6, r1)
            return r0
        L32:
            hd.p r6 = hd.p.f28965m
            return r6
        L35:
            hd.p r6 = hd.p.f28959g
            return r6
        L38:
            hd.p r6 = hd.p.f28960h
            return r6
        L3b:
            r0 = r3
        L3c:
            int r5 = r6 + r0
            char r5 = r7[r5]
            if (r5 != r4) goto L45
            int r0 = r0 + 1
            goto L3c
        L45:
            if (r5 != r2) goto L50
        L47:
            int r0 = r0 + 1
            int r2 = r6 + r0
            char r2 = r7[r2]
            if (r2 == r1) goto L50
            goto L47
        L50:
            hd.p r1 = new hd.p
            r2 = 9
            int r0 = r0 + r3
            r1.<init>(r2, r7, r6, r0)
            return r1
        L59:
            hd.p r6 = hd.p.f
            return r6
        L5c:
            hd.p r6 = hd.p.f28964l
            return r6
        L5f:
            hd.p r6 = hd.p.f28962j
            return r6
        L62:
            hd.p r6 = hd.p.f28958e
            return r6
        L65:
            hd.p r6 = hd.p.f28961i
            return r6
        L68:
            r0 = r3
        L69:
            int r2 = r6 + r0
            char r2 = r7[r2]
            if (r2 == r1) goto L72
            int r0 = r0 + 1
            goto L69
        L72:
            hd.p r1 = new hd.p
            int r6 = r6 + r3
            int r0 = r0 - r3
            r2 = 10
            r1.<init>(r2, r7, r6, r0)
            return r1
        L7c:
            hd.p r6 = hd.p.f28963k
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.p.a(int, char[]):hd.p");
    }

    public static p[] b(String str) {
        int i10;
        char[] charArray = str.toCharArray();
        int i11 = 1;
        int i12 = 1;
        int i13 = 0;
        while (true) {
            int i14 = i12 + 1;
            char c10 = charArray[i12];
            if (c10 == ')') {
                break;
            }
            if (c10 == 'L') {
                while (true) {
                    i12 = i14 + 1;
                    if (charArray[i14] == ';') {
                        break;
                    }
                    i14 = i12;
                }
                i13++;
            } else {
                if (c10 != '[') {
                    i13++;
                }
                i12 = i14;
            }
        }
        p[] pVarArr = new p[i13];
        int i15 = 0;
        while (charArray[i11] != ')') {
            p a10 = a(i11, charArray);
            pVarArr[i15] = a10;
            if (a10.f28966a == 10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            i11 += a10.f28969d + i10;
            i15++;
        }
        return pVarArr;
    }

    public static int c(String str) {
        int i10;
        char charAt;
        int i11 = 1;
        int i12 = 1;
        int i13 = 1;
        while (true) {
            i10 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 == ')') {
                break;
            }
            if (charAt2 == 'L') {
                while (true) {
                    i12 = i10 + 1;
                    if (str.charAt(i10) == ';') {
                        break;
                    }
                    i10 = i12;
                }
                i13++;
            } else {
                if (charAt2 == '[') {
                    while (true) {
                        charAt = str.charAt(i10);
                        if (charAt != '[') {
                            break;
                        }
                        i10++;
                    }
                    if (charAt == 'D' || charAt == 'J') {
                        i13--;
                    }
                } else if (charAt2 != 'D' && charAt2 != 'J') {
                    i13++;
                } else {
                    i13 += 2;
                }
                i12 = i10;
            }
        }
        char charAt3 = str.charAt(i10);
        int i14 = i13 << 2;
        if (charAt3 == 'V') {
            i11 = 0;
        } else if (charAt3 == 'D' || charAt3 == 'J') {
            i11 = 2;
        }
        return i14 | i11;
    }

    public static String f(Class cls) {
        char c10;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            if (cls.isPrimitive()) {
                if (cls == Integer.TYPE) {
                    c10 = 'I';
                } else if (cls == Void.TYPE) {
                    c10 = 'V';
                } else if (cls == Boolean.TYPE) {
                    c10 = 'Z';
                } else if (cls == Byte.TYPE) {
                    c10 = 'B';
                } else if (cls == Character.TYPE) {
                    c10 = 'C';
                } else if (cls == Short.TYPE) {
                    c10 = 'S';
                } else if (cls == Double.TYPE) {
                    c10 = 'D';
                } else if (cls == Float.TYPE) {
                    c10 = 'F';
                } else {
                    c10 = 'J';
                }
            } else if (cls.isArray()) {
                stringBuffer.append('[');
                cls = cls.getComponentType();
            } else {
                stringBuffer.append('L');
                String name = cls.getName();
                int length = name.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = name.charAt(i10);
                    if (charAt == '.') {
                        charAt = '/';
                    }
                    stringBuffer.append(charAt);
                }
                c10 = ';';
            }
        }
        stringBuffer.append(c10);
        return stringBuffer.toString();
    }

    public static p g(Class cls) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return f28962j;
            }
            if (cls == Void.TYPE) {
                return f28958e;
            }
            if (cls == Boolean.TYPE) {
                return f;
            }
            if (cls == Byte.TYPE) {
                return f28960h;
            }
            if (cls == Character.TYPE) {
                return f28959g;
            }
            if (cls == Short.TYPE) {
                return f28961i;
            }
            if (cls == Double.TYPE) {
                return f28965m;
            }
            if (cls == Float.TYPE) {
                return f28963k;
            }
            return f28964l;
        }
        return a(0, f(cls).toCharArray());
    }

    public final String d() {
        int i10 = this.f28966a;
        char[] cArr = this.f28967b;
        int i11 = this.f28968c;
        switch (i10) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return "float";
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                int i12 = 1;
                int i13 = 1;
                while (cArr[i11 + i13] == '[') {
                    i13++;
                }
                StringBuffer stringBuffer = new StringBuffer(a(i13 + i11, cArr).d());
                while (cArr[i11 + i12] == '[') {
                    i12++;
                }
                while (i12 > 0) {
                    stringBuffer.append(ContentRecord.XRINFOLIST_NULL);
                    i12--;
                }
                return stringBuffer.toString();
            case 10:
                return new String(cArr, i11, this.f28969d).replace('/', '.');
            default:
                return null;
        }
    }

    public final String e() {
        char c10;
        StringBuffer stringBuffer = new StringBuffer();
        int i10 = this.f28968c;
        char[] cArr = this.f28967b;
        if (cArr == null) {
            c10 = (char) ((i10 & (-16777216)) >>> 24);
        } else {
            int i11 = this.f28966a;
            int i12 = this.f28969d;
            if (i11 == 10) {
                stringBuffer.append('L');
                stringBuffer.append(cArr, i10, i12);
                c10 = ';';
            } else {
                stringBuffer.append(cArr, i10, i12);
                return stringBuffer.toString();
            }
        }
        stringBuffer.append(c10);
        return stringBuffer.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        int i10 = pVar.f28966a;
        int i11 = this.f28966a;
        if (i11 != i10) {
            return false;
        }
        if (i11 >= 9) {
            int i12 = pVar.f28969d;
            int i13 = this.f28969d;
            if (i13 != i12) {
                return false;
            }
            int i14 = this.f28968c;
            int i15 = i13 + i14;
            int i16 = pVar.f28968c;
            while (i14 < i15) {
                if (this.f28967b[i14] != pVar.f28967b[i16]) {
                    return false;
                }
                i14++;
                i16++;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f28966a;
        int i11 = i10 * 13;
        if (i10 >= 9) {
            int i12 = this.f28969d;
            int i13 = this.f28968c;
            int i14 = i12 + i13;
            while (i13 < i14) {
                i11 = (i11 + this.f28967b[i13]) * 17;
                i13++;
            }
        }
        return i11;
    }

    public final String toString() {
        return e();
    }
}
