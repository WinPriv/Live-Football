package r2;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.r;

/* compiled from: JsonReader.java */
/* loaded from: classes.dex */
public abstract class c implements Closeable {

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f34841w = new String[128];

    /* renamed from: s, reason: collision with root package name */
    public int f34842s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f34843t = new int[32];

    /* renamed from: u, reason: collision with root package name */
    public String[] f34844u = new String[32];

    /* renamed from: v, reason: collision with root package name */
    public int[] f34845v = new int[32];

    /* compiled from: JsonReader.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f34846a;

        /* renamed from: b, reason: collision with root package name */
        public final r f34847b;

        public a(String[] strArr, r rVar) {
            this.f34846a = strArr;
            this.f34847b = rVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0046, B:15:0x003a, B:16:0x003d, B:27:0x004b, B:29:0x004e, B:32:0x005d), top: B:1:0x0000 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static r2.c.a a(java.lang.String... r12) {
            /*
                int r0 = r12.length     // Catch: java.io.IOException -> L6d
                okio.e[] r0 = new okio.e[r0]     // Catch: java.io.IOException -> L6d
                okio.b r1 = new okio.b     // Catch: java.io.IOException -> L6d
                r1.<init>()     // Catch: java.io.IOException -> L6d
                r2 = 0
                r3 = r2
            La:
                int r4 = r12.length     // Catch: java.io.IOException -> L6d
                if (r3 >= r4) goto L5d
                r4 = r12[r3]     // Catch: java.io.IOException -> L6d
                java.lang.String[] r5 = r2.c.f34841w     // Catch: java.io.IOException -> L6d
                r6 = 34
                r1.Z(r6)     // Catch: java.io.IOException -> L6d
                int r7 = r4.length()     // Catch: java.io.IOException -> L6d
                r8 = r2
                r9 = r8
            L1c:
                if (r8 >= r7) goto L49
                char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6d
                r11 = 128(0x80, float:1.8E-43)
                if (r10 >= r11) goto L2b
                r10 = r5[r10]     // Catch: java.io.IOException -> L6d
                if (r10 != 0) goto L38
                goto L46
            L2b:
                r11 = 8232(0x2028, float:1.1535E-41)
                if (r10 != r11) goto L32
                java.lang.String r10 = "\\u2028"
                goto L38
            L32:
                r11 = 8233(0x2029, float:1.1537E-41)
                if (r10 != r11) goto L46
                java.lang.String r10 = "\\u2029"
            L38:
                if (r9 >= r8) goto L3d
                r1.g0(r9, r8, r4)     // Catch: java.io.IOException -> L6d
            L3d:
                int r9 = r10.length()     // Catch: java.io.IOException -> L6d
                r1.g0(r2, r9, r10)     // Catch: java.io.IOException -> L6d
                int r9 = r8 + 1
            L46:
                int r8 = r8 + 1
                goto L1c
            L49:
                if (r9 >= r7) goto L4e
                r1.g0(r9, r7, r4)     // Catch: java.io.IOException -> L6d
            L4e:
                r1.Z(r6)     // Catch: java.io.IOException -> L6d
                r1.readByte()     // Catch: java.io.IOException -> L6d
                okio.e r4 = r1.j()     // Catch: java.io.IOException -> L6d
                r0[r3] = r4     // Catch: java.io.IOException -> L6d
                int r3 = r3 + 1
                goto La
            L5d:
                r2.c$a r1 = new r2.c$a     // Catch: java.io.IOException -> L6d
                java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6d
                java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6d
                okio.r r0 = okio.r.b(r0)     // Catch: java.io.IOException -> L6d
                r1.<init>(r12, r0)     // Catch: java.io.IOException -> L6d
                return r1
            L6d:
                r12 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r2.c.a.a(java.lang.String[]):r2.c$a");
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f34841w[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f34841w;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract int P(a aVar) throws IOException;

    public abstract void Q() throws IOException;

    public abstract void S() throws IOException;

    public final void X(String str) throws b {
        StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, " at path ");
        l10.append(f());
        throw new b(l10.toString());
    }

    public abstract void b() throws IOException;

    public abstract void c() throws IOException;

    public abstract void d() throws IOException;

    public abstract void e() throws IOException;

    public final String f() {
        int i10 = this.f34842s;
        int[] iArr = this.f34843t;
        String[] strArr = this.f34844u;
        int[] iArr2 = this.f34845v;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 != 1 && i12 != 2) {
                if (i12 == 3 || i12 == 4 || i12 == 5) {
                    sb2.append('.');
                    String str = strArr[i11];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(iArr2[i11]);
                sb2.append(']');
            }
        }
        return sb2.toString();
    }

    public abstract boolean g() throws IOException;

    public abstract boolean h() throws IOException;

    public abstract double i() throws IOException;

    public abstract int j() throws IOException;

    public abstract String k() throws IOException;

    public abstract int l() throws IOException;

    public final void m(int i10) {
        int i11 = this.f34842s;
        int[] iArr = this.f34843t;
        if (i11 == iArr.length) {
            if (i11 != 256) {
                this.f34843t = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f34844u;
                this.f34844u = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f34845v;
                this.f34845v = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new r2.a("Nesting too deep at " + f());
            }
        }
        int[] iArr3 = this.f34843t;
        int i12 = this.f34842s;
        this.f34842s = i12 + 1;
        iArr3[i12] = i10;
    }
}
