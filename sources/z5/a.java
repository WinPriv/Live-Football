package z5;

import a3.k;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.hms.ads.gl;
import d6.g0;
import d6.w;
import i7.c;
import java.nio.charset.Charset;
import java.util.List;
import r5.a;
import r5.f;
import r5.g;
import r5.i;

/* compiled from: Tx3gDecoder.java */
/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: m, reason: collision with root package name */
    public final w f37299m = new w();

    /* renamed from: n, reason: collision with root package name */
    public final boolean f37300n;
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public final int f37301p;

    /* renamed from: q, reason: collision with root package name */
    public final String f37302q;

    /* renamed from: r, reason: collision with root package name */
    public final float f37303r;

    /* renamed from: s, reason: collision with root package name */
    public final int f37304s;

    public a(List<byte[]> list) {
        int size = list.size();
        String str = com.anythink.expressad.exoplayer.b.f7305m;
        if (size == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.o = bArr[24];
            this.f37301p = ((bArr[26] & DefaultClassResolver.NAME) << 24) | ((bArr[27] & DefaultClassResolver.NAME) << 16) | ((bArr[28] & DefaultClassResolver.NAME) << 8) | (bArr[29] & DefaultClassResolver.NAME);
            int length = bArr.length - 43;
            int i10 = g0.f27302a;
            this.f37302q = "Serif".equals(new String(bArr, 43, length, c.f29202c)) ? com.anythink.expressad.exoplayer.b.f7304l : str;
            int i11 = bArr[25] * Ascii.DC4;
            this.f37304s = i11;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f37300n = z10;
            if (z10) {
                this.f37303r = g0.g(((bArr[11] & DefaultClassResolver.NAME) | ((bArr[10] & DefaultClassResolver.NAME) << 8)) / i11, gl.Code, 0.95f);
                return;
            } else {
                this.f37303r = 0.85f;
                return;
            }
        }
        this.o = 0;
        this.f37301p = -1;
        this.f37302q = com.anythink.expressad.exoplayer.b.f7305m;
        this.f37300n = false;
        this.f37303r = 0.85f;
        this.f37304s = -1;
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        boolean z10;
        boolean z11;
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z12 = true;
            if ((i10 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z12 = false;
            }
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (!z12 && !z10 && !z11) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    @Override // r5.f
    public final g g(byte[] bArr, int i10, boolean z10) throws i {
        boolean z11;
        String r10;
        boolean z12;
        int i11;
        int i12;
        float f;
        int i13;
        w wVar = this.f37299m;
        wVar.C(i10, bArr);
        int i14 = 2;
        int i15 = 1;
        int i16 = 0;
        if (wVar.f27386c - wVar.f27385b >= 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            int y = wVar.y();
            if (y == 0) {
                r10 = "";
            } else {
                int i17 = wVar.f27385b;
                Charset A = wVar.A();
                int i18 = y - (wVar.f27385b - i17);
                if (A == null) {
                    A = c.f29202c;
                }
                r10 = wVar.r(i18, A);
            }
            if (r10.isEmpty()) {
                return b.f37305t;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r10);
            h(spannableStringBuilder, this.o, 0, 0, spannableStringBuilder.length(), 16711680);
            int length = spannableStringBuilder.length();
            int i19 = this.f37301p;
            if (i19 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((i19 & p.f9095b) << 24) | (i19 >>> 8)), 0, length, 16711713);
            }
            int length2 = spannableStringBuilder.length();
            String str = this.f37302q;
            if (str != com.anythink.expressad.exoplayer.b.f7305m) {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
            }
            float f10 = this.f37303r;
            while (true) {
                int i20 = wVar.f27386c;
                int i21 = wVar.f27385b;
                if (i20 - i21 >= 8) {
                    int d10 = wVar.d();
                    int d11 = wVar.d();
                    if (d11 == 1937013100) {
                        if (wVar.f27386c - wVar.f27385b >= i14) {
                            i11 = i15;
                        } else {
                            i11 = i16;
                        }
                        if (i11 != 0) {
                            int y10 = wVar.y();
                            int i22 = i16;
                            while (i16 < y10) {
                                if (wVar.f27386c - wVar.f27385b >= 12) {
                                    i22 = i15;
                                }
                                if (i22 != 0) {
                                    int y11 = wVar.y();
                                    int y12 = wVar.y();
                                    wVar.F(i14);
                                    int t10 = wVar.t();
                                    wVar.F(i15);
                                    int d12 = wVar.d();
                                    if (y12 > spannableStringBuilder.length()) {
                                        i12 = y10;
                                        StringBuilder n10 = k.n("Truncating styl end (", y12, ") to cueText.length() (");
                                        n10.append(spannableStringBuilder.length());
                                        n10.append(").");
                                        d6.p.f("Tx3gDecoder", n10.toString());
                                        y12 = spannableStringBuilder.length();
                                    } else {
                                        i12 = y10;
                                    }
                                    int i23 = y12;
                                    if (y11 >= i23) {
                                        d6.p.f("Tx3gDecoder", "Ignoring styl with start (" + y11 + ") >= end (" + i23 + ").");
                                        i13 = i12;
                                        f = f10;
                                    } else {
                                        f = f10;
                                        i13 = i12;
                                        h(spannableStringBuilder, t10, this.o, y11, i23, 0);
                                        if (d12 != i19) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan((d12 >>> 8) | ((d12 & p.f9095b) << 24)), y11, i23, 33);
                                        }
                                    }
                                    i16++;
                                    i14 = 2;
                                    i15 = 1;
                                    i22 = 0;
                                    f10 = f;
                                    y10 = i13;
                                } else {
                                    throw new i("Unexpected subtitle format.");
                                }
                            }
                        } else {
                            throw new i("Unexpected subtitle format.");
                        }
                    } else {
                        float f11 = f10;
                        if (d11 == 1952608120 && this.f37300n) {
                            i14 = 2;
                            if (wVar.f27386c - wVar.f27385b >= 2) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                f10 = g0.g(wVar.y() / this.f37304s, gl.Code, 0.95f);
                            } else {
                                throw new i("Unexpected subtitle format.");
                            }
                        } else {
                            i14 = 2;
                            f10 = f11;
                        }
                    }
                    wVar.E(i21 + d10);
                    i15 = 1;
                    i16 = 0;
                } else {
                    float f12 = f10;
                    a.C0471a c0471a = new a.C0471a();
                    c0471a.f34901a = spannableStringBuilder;
                    c0471a.f34905e = f12;
                    c0471a.f = 0;
                    c0471a.f34906g = 0;
                    return new b(c0471a.a());
                }
            }
        } else {
            throw new i("Unexpected subtitle format.");
        }
    }
}
