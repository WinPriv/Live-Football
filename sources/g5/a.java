package g5;

import c5.e;
import com.applovin.exoplayer2.b0;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.huawei.openalliance.ad.constant.be;
import d6.g0;
import d6.v;
import d6.w;
import i7.c;
import i7.g;
import j7.j0;
import j7.v1;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: Id3Decoder.java */
/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: w, reason: collision with root package name */
    public static final b0 f28516w = new b0(19);

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC0387a f28517v;

    /* compiled from: Id3Decoder.java */
    /* renamed from: g5.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0387a {
    }

    /* compiled from: Id3Decoder.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f28518a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f28519b;

        /* renamed from: c, reason: collision with root package name */
        public final int f28520c;

        public b(int i10, boolean z10, int i11) {
            this.f28518a = i10;
            this.f28519b = z10;
            this.f28520c = i11;
        }
    }

    public a(b0 b0Var) {
        this.f28517v = b0Var;
    }

    public static ApicFrame j(int i10, int i11, w wVar) {
        int w10;
        String str;
        byte[] copyOfRange;
        int t10 = wVar.t();
        Charset t11 = t(t10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        wVar.b(bArr, 0, i12);
        if (i11 == 2) {
            String str2 = "image/" + g.c(new String(bArr, 0, 3, c.f29201b));
            if (be.I.equals(str2)) {
                str2 = be.V;
            }
            str = str2;
            w10 = 2;
        } else {
            w10 = w(0, bArr);
            String c10 = g.c(new String(bArr, 0, w10, c.f29201b));
            if (c10.indexOf(47) == -1) {
                str = "image/".concat(c10);
            } else {
                str = c10;
            }
        }
        int i13 = bArr[w10 + 1] & DefaultClassResolver.NAME;
        int i14 = w10 + 2;
        int v3 = v(bArr, i14, t10);
        String str3 = new String(bArr, i14, v3 - i14, t11);
        int s10 = s(t10) + v3;
        if (i12 <= s10) {
            copyOfRange = g0.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, s10, i12);
        }
        return new ApicFrame(str, str3, i13, copyOfRange);
    }

    public static ChapterFrame k(w wVar, int i10, int i11, boolean z10, int i12, InterfaceC0387a interfaceC0387a) {
        long j10;
        long j11;
        int i13 = wVar.f27385b;
        int w10 = w(i13, wVar.f27384a);
        String str = new String(wVar.f27384a, i13, w10 - i13, c.f29201b);
        wVar.E(w10 + 1);
        int d10 = wVar.d();
        int d11 = wVar.d();
        long u2 = wVar.u();
        if (u2 == 4294967295L) {
            j10 = -1;
        } else {
            j10 = u2;
        }
        long u10 = wVar.u();
        if (u10 == 4294967295L) {
            j11 = -1;
        } else {
            j11 = u10;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (wVar.f27385b < i14) {
            Id3Frame n10 = n(i11, wVar, z10, i12, interfaceC0387a);
            if (n10 != null) {
                arrayList.add(n10);
            }
        }
        return new ChapterFrame(str, d10, d11, j10, j11, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame l(w wVar, int i10, int i11, boolean z10, int i12, InterfaceC0387a interfaceC0387a) {
        boolean z11;
        boolean z12;
        int i13 = wVar.f27385b;
        int w10 = w(i13, wVar.f27384a);
        String str = new String(wVar.f27384a, i13, w10 - i13, c.f29201b);
        wVar.E(w10 + 1);
        int t10 = wVar.t();
        if ((t10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((t10 & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int t11 = wVar.t();
        String[] strArr = new String[t11];
        for (int i14 = 0; i14 < t11; i14++) {
            int i15 = wVar.f27385b;
            int w11 = w(i15, wVar.f27384a);
            strArr[i14] = new String(wVar.f27384a, i15, w11 - i15, c.f29201b);
            wVar.E(w11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (wVar.f27385b < i16) {
            Id3Frame n10 = n(i11, wVar, z10, i12, interfaceC0387a);
            if (n10 != null) {
                arrayList.add(n10);
            }
        }
        return new ChapterTocFrame(str, z11, z12, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame m(int i10, w wVar) {
        if (i10 < 4) {
            return null;
        }
        int t10 = wVar.t();
        Charset t11 = t(t10);
        byte[] bArr = new byte[3];
        wVar.b(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        wVar.b(bArr2, 0, i11);
        int v3 = v(bArr2, 0, t10);
        String str2 = new String(bArr2, 0, v3, t11);
        int s10 = s(t10) + v3;
        return new CommentFrame(str, str2, q(bArr2, s10, v(bArr2, s10, t10), t11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0228, code lost:
    
        if (r14 == 67) goto L145;
     */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.exoplayer2.metadata.id3.Id3Frame, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame n(int r20, d6.w r21, boolean r22, int r23, g5.a.InterfaceC0387a r24) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.n(int, d6.w, boolean, int, g5.a$a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    public static GeobFrame o(int i10, w wVar) {
        byte[] copyOfRange;
        int t10 = wVar.t();
        Charset t11 = t(t10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        wVar.b(bArr, 0, i11);
        int w10 = w(0, bArr);
        String str = new String(bArr, 0, w10, c.f29201b);
        int i12 = w10 + 1;
        int v3 = v(bArr, i12, t10);
        String q10 = q(bArr, i12, v3, t11);
        int s10 = s(t10) + v3;
        int v10 = v(bArr, s10, t10);
        String q11 = q(bArr, s10, v10, t11);
        int s11 = s(t10) + v10;
        if (i11 <= s11) {
            copyOfRange = g0.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, s11, i11);
        }
        return new GeobFrame(str, q10, q11, copyOfRange);
    }

    public static MlltFrame p(int i10, w wVar) {
        int y = wVar.y();
        int v3 = wVar.v();
        int v10 = wVar.v();
        int t10 = wVar.t();
        int t11 = wVar.t();
        v vVar = new v();
        vVar.j(wVar.f27386c, wVar.f27384a);
        vVar.k(wVar.f27385b * 8);
        int i11 = ((i10 - 10) * 8) / (t10 + t11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int g6 = vVar.g(t10);
            int g10 = vVar.g(t11);
            iArr[i12] = g6;
            iArr2[i12] = g10;
        }
        return new MlltFrame(y, v3, v10, iArr, iArr2);
    }

    public static String q(byte[] bArr, int i10, int i11, Charset charset) {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, charset);
        }
        return "";
    }

    public static v1 r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return j0.G("");
        }
        j0.b bVar = j0.f30006t;
        j0.a aVar = new j0.a();
        int v3 = v(bArr, i11, i10);
        while (i11 < v3) {
            aVar.b(new String(bArr, i11, v3 - i11, t(i10)));
            i11 = s(i10) + v3;
            v3 = v(bArr, i11, i10);
        }
        v1 e10 = aVar.e();
        if (e10.isEmpty()) {
            return j0.G("");
        }
        return e10;
    }

    public static int s(int i10) {
        if (i10 != 0 && i10 != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset t(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return c.f29201b;
                }
                return c.f29202c;
            }
            return c.f29203d;
        }
        return c.f;
    }

    public static String u(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int v(byte[] bArr, int i10, int i11) {
        int w10 = w(i10, bArr);
        if (i11 != 0 && i11 != 3) {
            while (w10 < bArr.length - 1) {
                if ((w10 - i10) % 2 == 0 && bArr[w10 + 1] == 0) {
                    return w10;
                }
                w10 = w(w10 + 1, bArr);
            }
            return bArr.length;
        }
        return w10;
    }

    public static int w(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int x(int i10, w wVar) {
        byte[] bArr = wVar.f27384a;
        int i11 = wVar.f27385b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 < i11 + i10) {
                if ((bArr[i12] & DefaultClassResolver.NAME) == 255 && bArr[i13] == 0) {
                    System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                    i10--;
                }
                i12 = i13;
            } else {
                return i10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0083, code lost:
    
        if ((r10 & 128) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean y(d6.w r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.y(d6.w, int, int, boolean):boolean");
    }

    @Override // c5.e
    public final Metadata g(c5.c cVar, ByteBuffer byteBuffer) {
        return i(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.metadata.Metadata i(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.i(int, byte[]):com.google.android.exoplayer2.metadata.Metadata");
    }
}
