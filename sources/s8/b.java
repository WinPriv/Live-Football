package s8;

import com.huawei.hms.ads.ep;
import com.huawei.openalliance.ad.constant.w;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: JsonWriter.java */
/* loaded from: classes2.dex */
public class b implements Closeable, Flushable {
    public static final Pattern B = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] C = new String[128];
    public static final String[] D;
    public boolean A;

    /* renamed from: s, reason: collision with root package name */
    public final Writer f35273s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f35274t;

    /* renamed from: u, reason: collision with root package name */
    public int f35275u;

    /* renamed from: v, reason: collision with root package name */
    public String f35276v;

    /* renamed from: w, reason: collision with root package name */
    public String f35277w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f35278x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public String f35279z;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            C[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = C;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        D = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f35274t = iArr;
        this.f35275u = 0;
        if (iArr.length == 0) {
            this.f35274t = Arrays.copyOf(iArr, 0 * 2);
        }
        int[] iArr2 = this.f35274t;
        int i10 = this.f35275u;
        this.f35275u = i10 + 1;
        iArr2[i10] = 6;
        this.f35277w = w.bE;
        this.A = true;
        Objects.requireNonNull(writer, "out == null");
        this.f35273s = writer;
    }

    public void P(long j10) throws IOException {
        Z();
        b();
        this.f35273s.write(Long.toString(j10));
    }

    public void Q(Boolean bool) throws IOException {
        String str;
        if (bool == null) {
            j();
            return;
        }
        Z();
        b();
        if (bool.booleanValue()) {
            str = ep.Code;
        } else {
            str = ep.V;
        }
        this.f35273s.write(str);
    }

    public void S(Number number) throws IOException {
        boolean z10;
        if (number == null) {
            j();
            return;
        }
        Z();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && !B.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f35278x) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        b();
        this.f35273s.append((CharSequence) obj);
    }

    public void X(String str) throws IOException {
        if (str == null) {
            j();
            return;
        }
        Z();
        b();
        l(str);
    }

    public void Y(boolean z10) throws IOException {
        String str;
        Z();
        b();
        if (z10) {
            str = ep.Code;
        } else {
            str = ep.V;
        }
        this.f35273s.write(str);
    }

    public final void Z() throws IOException {
        if (this.f35279z != null) {
            int k10 = k();
            if (k10 == 5) {
                this.f35273s.write(44);
            } else if (k10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            i();
            this.f35274t[this.f35275u - 1] = 4;
            l(this.f35279z);
            this.f35279z = null;
        }
    }

    public final void b() throws IOException {
        int k10 = k();
        if (k10 != 1) {
            Writer writer = this.f35273s;
            if (k10 != 2) {
                if (k10 != 4) {
                    if (k10 != 6) {
                        if (k10 == 7) {
                            if (!this.f35278x) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.f35274t[this.f35275u - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.f35277w);
                this.f35274t[this.f35275u - 1] = 5;
                return;
            }
            writer.append(',');
            i();
            return;
        }
        this.f35274t[this.f35275u - 1] = 2;
        i();
    }

    public void c() throws IOException {
        Z();
        b();
        int i10 = this.f35275u;
        int[] iArr = this.f35274t;
        if (i10 == iArr.length) {
            this.f35274t = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f35274t;
        int i11 = this.f35275u;
        this.f35275u = i11 + 1;
        iArr2[i11] = 1;
        this.f35273s.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f35273s.close();
        int i10 = this.f35275u;
        if (i10 <= 1 && (i10 != 1 || this.f35274t[i10 - 1] == 7)) {
            this.f35275u = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public void d() throws IOException {
        Z();
        b();
        int i10 = this.f35275u;
        int[] iArr = this.f35274t;
        if (i10 == iArr.length) {
            this.f35274t = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f35274t;
        int i11 = this.f35275u;
        this.f35275u = i11 + 1;
        iArr2[i11] = 3;
        this.f35273s.write(123);
    }

    public final void e(int i10, int i11, char c10) throws IOException {
        int k10 = k();
        if (k10 != i11 && k10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f35279z == null) {
            this.f35275u--;
            if (k10 == i11) {
                i();
            }
            this.f35273s.write(c10);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.f35279z);
    }

    public void f() throws IOException {
        e(1, 2, ']');
    }

    public void flush() throws IOException {
        if (this.f35275u != 0) {
            this.f35273s.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void g() throws IOException {
        e(3, 5, '}');
    }

    public void h(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f35279z == null) {
            if (this.f35275u != 0) {
                this.f35279z = str;
                return;
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new IllegalStateException();
    }

    public final void i() throws IOException {
        if (this.f35276v == null) {
            return;
        }
        Writer writer = this.f35273s;
        writer.write(10);
        int i10 = this.f35275u;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(this.f35276v);
        }
    }

    public b j() throws IOException {
        if (this.f35279z != null) {
            if (this.A) {
                Z();
            } else {
                this.f35279z = null;
                return this;
            }
        }
        b();
        this.f35273s.write("null");
        return this;
    }

    public final int k() {
        int i10 = this.f35275u;
        if (i10 != 0) {
            return this.f35274t[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.y
            if (r0 == 0) goto L7
            java.lang.String[] r0 = s8.b.D
            goto L9
        L7:
            java.lang.String[] r0 = s8.b.C
        L9:
            java.io.Writer r1 = r8.f35273s
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.b.l(java.lang.String):void");
    }

    public void m(double d10) throws IOException {
        Z();
        if (!this.f35278x && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        b();
        this.f35273s.append((CharSequence) Double.toString(d10));
    }
}
