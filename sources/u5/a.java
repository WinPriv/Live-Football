package u5;

import android.graphics.Bitmap;
import com.anythink.expressad.exoplayer.k.p;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import d6.g0;
import d6.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import r5.a;
import r5.f;
import r5.g;
import r5.i;

/* compiled from: PgsDecoder.java */
/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: m, reason: collision with root package name */
    public final w f35780m = new w();

    /* renamed from: n, reason: collision with root package name */
    public final w f35781n = new w();
    public final C0494a o = new C0494a();

    /* renamed from: p, reason: collision with root package name */
    public Inflater f35782p;

    /* compiled from: PgsDecoder.java */
    /* renamed from: u5.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0494a {

        /* renamed from: a, reason: collision with root package name */
        public final w f35783a = new w();

        /* renamed from: b, reason: collision with root package name */
        public final int[] f35784b = new int[256];

        /* renamed from: c, reason: collision with root package name */
        public boolean f35785c;

        /* renamed from: d, reason: collision with root package name */
        public int f35786d;

        /* renamed from: e, reason: collision with root package name */
        public int f35787e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f35788g;

        /* renamed from: h, reason: collision with root package name */
        public int f35789h;

        /* renamed from: i, reason: collision with root package name */
        public int f35790i;
    }

    @Override // r5.f
    public final g g(byte[] bArr, int i10, boolean z10) throws i {
        char c10;
        r5.a aVar;
        int i11;
        int i12;
        int t10;
        int i13;
        int i14;
        int v3;
        w wVar = this.f35780m;
        wVar.C(i10, bArr);
        int i15 = wVar.f27386c;
        int i16 = wVar.f27385b;
        char c11 = 255;
        if (i15 - i16 > 0 && (wVar.f27384a[i16] & DefaultClassResolver.NAME) == 120) {
            if (this.f35782p == null) {
                this.f35782p = new Inflater();
            }
            Inflater inflater = this.f35782p;
            w wVar2 = this.f35781n;
            if (g0.E(wVar, wVar2, inflater)) {
                wVar.C(wVar2.f27386c, wVar2.f27384a);
            }
        }
        C0494a c0494a = this.o;
        int i17 = 0;
        c0494a.f35786d = 0;
        c0494a.f35787e = 0;
        c0494a.f = 0;
        c0494a.f35788g = 0;
        c0494a.f35789h = 0;
        c0494a.f35790i = 0;
        c0494a.f35783a.B(0);
        c0494a.f35785c = false;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i18 = wVar.f27386c;
            if (i18 - wVar.f27385b >= 3) {
                int t11 = wVar.t();
                int y = wVar.y();
                int i19 = wVar.f27385b + y;
                if (i19 > i18) {
                    wVar.E(i18);
                    c10 = c11;
                    aVar = null;
                } else {
                    int[] iArr = c0494a.f35784b;
                    w wVar3 = c0494a.f35783a;
                    if (t11 != 128) {
                        switch (t11) {
                            case 20:
                                if (y % 5 == 2) {
                                    wVar.F(2);
                                    Arrays.fill(iArr, i17);
                                    int i20 = y / 5;
                                    int i21 = i17;
                                    while (i21 < i20) {
                                        int t12 = wVar.t();
                                        int[] iArr2 = iArr;
                                        double t13 = wVar.t();
                                        double t14 = wVar.t() - 128;
                                        double t15 = wVar.t() - 128;
                                        iArr2[t12] = (g0.h((int) ((t13 - (0.34414d * t15)) - (t14 * 0.71414d)), 0, p.f9095b) << 8) | (g0.h((int) ((1.402d * t14) + t13), 0, p.f9095b) << 16) | (wVar.t() << 24) | g0.h((int) ((t15 * 1.772d) + t13), 0, p.f9095b);
                                        i21++;
                                        c11 = 255;
                                        i20 = i20;
                                        iArr = iArr2;
                                    }
                                    c10 = c11;
                                    c0494a.f35785c = true;
                                    break;
                                }
                                break;
                            case 21:
                                if (y >= 4) {
                                    wVar.F(3);
                                    if ((128 & wVar.t()) != 0) {
                                        i14 = 1;
                                    } else {
                                        i14 = i17;
                                    }
                                    int i22 = y - 4;
                                    if (i14 != 0) {
                                        if (i22 >= 7 && (v3 = wVar.v()) >= 4) {
                                            c0494a.f35789h = wVar.y();
                                            c0494a.f35790i = wVar.y();
                                            wVar3.B(v3 - 4);
                                            i22 -= 7;
                                        }
                                    }
                                    int i23 = wVar3.f27385b;
                                    int i24 = wVar3.f27386c;
                                    if (i23 < i24 && i22 > 0) {
                                        int min = Math.min(i22, i24 - i23);
                                        wVar.b(wVar3.f27384a, i23, min);
                                        wVar3.E(i23 + min);
                                        break;
                                    }
                                }
                                break;
                            case 22:
                                if (y >= 19) {
                                    c0494a.f35786d = wVar.y();
                                    c0494a.f35787e = wVar.y();
                                    wVar.F(11);
                                    c0494a.f = wVar.y();
                                    c0494a.f35788g = wVar.y();
                                    break;
                                }
                                break;
                        }
                        c10 = c11;
                        i17 = 0;
                        aVar = null;
                    } else {
                        c10 = c11;
                        if (c0494a.f35786d != 0 && c0494a.f35787e != 0 && c0494a.f35789h != 0 && c0494a.f35790i != 0 && (i11 = wVar3.f27386c) != 0 && wVar3.f27385b == i11 && c0494a.f35785c) {
                            wVar3.E(0);
                            int i25 = c0494a.f35789h * c0494a.f35790i;
                            int[] iArr3 = new int[i25];
                            int i26 = 0;
                            while (i26 < i25) {
                                int t16 = wVar3.t();
                                if (t16 != 0) {
                                    i12 = i26 + 1;
                                    iArr3[i26] = iArr[t16];
                                } else {
                                    int t17 = wVar3.t();
                                    if (t17 != 0) {
                                        if ((t17 & 64) == 0) {
                                            t10 = t17 & 63;
                                        } else {
                                            t10 = ((t17 & 63) << 8) | wVar3.t();
                                        }
                                        if ((t17 & 128) == 0) {
                                            i13 = 0;
                                        } else {
                                            i13 = iArr[wVar3.t()];
                                        }
                                        i12 = t10 + i26;
                                        Arrays.fill(iArr3, i26, i12, i13);
                                    }
                                }
                                i26 = i12;
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(iArr3, c0494a.f35789h, c0494a.f35790i, Bitmap.Config.ARGB_8888);
                            a.C0471a c0471a = new a.C0471a();
                            c0471a.f34902b = createBitmap;
                            float f = c0494a.f;
                            float f10 = c0494a.f35786d;
                            c0471a.f34907h = f / f10;
                            c0471a.f34908i = 0;
                            float f11 = c0494a.f35788g;
                            float f12 = c0494a.f35787e;
                            c0471a.f34905e = f11 / f12;
                            c0471a.f = 0;
                            c0471a.f34906g = 0;
                            c0471a.f34911l = c0494a.f35789h / f10;
                            c0471a.f34912m = c0494a.f35790i / f12;
                            aVar = c0471a.a();
                        } else {
                            aVar = null;
                        }
                        i17 = 0;
                        c0494a.f35786d = 0;
                        c0494a.f35787e = 0;
                        c0494a.f = 0;
                        c0494a.f35788g = 0;
                        c0494a.f35789h = 0;
                        c0494a.f35790i = 0;
                        wVar3.B(0);
                        c0494a.f35785c = false;
                    }
                    wVar.E(i19);
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
                c11 = c10;
            } else {
                return new b(Collections.unmodifiableList(arrayList));
            }
        }
    }
}
