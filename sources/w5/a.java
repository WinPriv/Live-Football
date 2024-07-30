package w5;

import a3.k;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import d6.g0;
import d6.p;
import d6.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r5.a;
import r5.f;
import r5.g;
import w5.c;

/* compiled from: SsaDecoder.java */
/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f36111r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m, reason: collision with root package name */
    public final boolean f36112m;

    /* renamed from: n, reason: collision with root package name */
    public final b f36113n;
    public LinkedHashMap o;

    /* renamed from: p, reason: collision with root package name */
    public float f36114p = -3.4028235E38f;

    /* renamed from: q, reason: collision with root package name */
    public float f36115q = -3.4028235E38f;

    public a(List<byte[]> list) {
        if (list != null && !list.isEmpty()) {
            this.f36112m = true;
            String m10 = g0.m(list.get(0));
            d6.a.a(m10.startsWith("Format:"));
            b a10 = b.a(m10);
            a10.getClass();
            this.f36113n = a10;
            i(new w(list.get(1)));
            return;
        }
        this.f36112m = false;
        this.f36113n = null;
    }

    public static int h(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        ArrayList arrayList3;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j10) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
            } else {
                i10 = 0;
                break;
            }
        }
        arrayList.add(i10, Long.valueOf(j10));
        if (i10 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i10 - 1));
        }
        arrayList2.add(i10, arrayList3);
        return i10;
    }

    public static long j(String str) {
        Matcher matcher = f36111r.matcher(str.trim());
        if (!matcher.matches()) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        String group = matcher.group(1);
        int i10 = g0.f27302a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:94:0x0210. Please report as an issue. */
    @Override // r5.f
    public final g g(byte[] bArr, int i10, boolean z10) {
        b bVar;
        w wVar;
        b bVar2;
        c cVar;
        long j10;
        Layout.Alignment alignment;
        int i11;
        float f;
        int i12;
        int i13;
        Integer num;
        int i14;
        int i15;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        w wVar2 = new w(bArr, i10);
        boolean z11 = aVar.f36112m;
        if (!z11) {
            aVar.i(wVar2);
        }
        if (z11) {
            bVar = aVar.f36113n;
        } else {
            bVar = null;
        }
        while (true) {
            String e10 = wVar2.e();
            if (e10 != null) {
                if (e10.startsWith("Format:")) {
                    bVar = b.a(e10);
                } else {
                    if (e10.startsWith("Dialogue:")) {
                        if (bVar == null) {
                            p.f("SsaDecoder", "Skipping dialogue line before complete format: ".concat(e10));
                        } else {
                            d6.a.a(e10.startsWith("Dialogue:"));
                            String substring = e10.substring(9);
                            int i16 = bVar.f36120e;
                            String[] split = substring.split(",", i16);
                            if (split.length != i16) {
                                p.f("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(e10));
                            } else {
                                long j11 = j(split[bVar.f36116a]);
                                if (j11 == com.anythink.expressad.exoplayer.b.f7291b) {
                                    p.f("SsaDecoder", "Skipping invalid timing: ".concat(e10));
                                } else {
                                    long j12 = j(split[bVar.f36117b]);
                                    if (j12 == com.anythink.expressad.exoplayer.b.f7291b) {
                                        p.f("SsaDecoder", "Skipping invalid timing: ".concat(e10));
                                    } else {
                                        LinkedHashMap linkedHashMap = aVar.o;
                                        int i17 = -1;
                                        if (linkedHashMap != null && (i15 = bVar.f36118c) != -1) {
                                            cVar = (c) linkedHashMap.get(split[i15].trim());
                                        } else {
                                            cVar = null;
                                        }
                                        String str = split[bVar.f36119d];
                                        Matcher matcher = c.b.f36140a.matcher(str);
                                        PointF pointF = null;
                                        while (true) {
                                            wVar = wVar2;
                                            if (matcher.find()) {
                                                String group = matcher.group(1);
                                                group.getClass();
                                                try {
                                                    PointF a10 = c.b.a(group);
                                                    if (a10 != null) {
                                                        pointF = a10;
                                                    }
                                                } catch (RuntimeException unused) {
                                                }
                                                try {
                                                    Matcher matcher2 = c.b.f36143d.matcher(group);
                                                    if (matcher2.find()) {
                                                        String group2 = matcher2.group(1);
                                                        group2.getClass();
                                                        i14 = c.a(group2);
                                                    } else {
                                                        i14 = -1;
                                                    }
                                                    if (i14 != -1) {
                                                        i17 = i14;
                                                    }
                                                } catch (RuntimeException unused2) {
                                                }
                                                wVar2 = wVar;
                                            } else {
                                                String replace = c.b.f36140a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                                float f10 = aVar.f36114p;
                                                float f11 = aVar.f36115q;
                                                SpannableString spannableString = new SpannableString(replace);
                                                a.C0471a c0471a = new a.C0471a();
                                                c0471a.f34901a = spannableString;
                                                if (cVar != null) {
                                                    Integer num2 = cVar.f36123c;
                                                    if (num2 != null) {
                                                        bVar2 = bVar;
                                                        j10 = j12;
                                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                                    } else {
                                                        bVar2 = bVar;
                                                        j10 = j12;
                                                    }
                                                    if (cVar.f36129j == 3 && (num = cVar.f36124d) != null) {
                                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                                    }
                                                    float f12 = cVar.f36125e;
                                                    if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                                                        c0471a.f34910k = f12 / f11;
                                                        c0471a.f34909j = 1;
                                                    }
                                                    boolean z12 = cVar.f36126g;
                                                    boolean z13 = cVar.f;
                                                    if (z13 && z12) {
                                                        i12 = 33;
                                                        i13 = 0;
                                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                                    } else {
                                                        i12 = 33;
                                                        i13 = 0;
                                                        if (z13) {
                                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                        } else if (z12) {
                                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                        }
                                                    }
                                                    if (cVar.f36127h) {
                                                        spannableString.setSpan(new UnderlineSpan(), i13, spannableString.length(), i12);
                                                    }
                                                    if (cVar.f36128i) {
                                                        spannableString.setSpan(new StrikethroughSpan(), i13, spannableString.length(), i12);
                                                    }
                                                } else {
                                                    bVar2 = bVar;
                                                    j10 = j12;
                                                }
                                                if (i17 == -1) {
                                                    if (cVar != null) {
                                                        i17 = cVar.f36122b;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                }
                                                switch (i17) {
                                                    case -1:
                                                        break;
                                                    case 0:
                                                    default:
                                                        k.s("Unknown alignment: ", i17, "SsaDecoder");
                                                        break;
                                                    case 1:
                                                    case 4:
                                                    case 7:
                                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                                        break;
                                                    case 2:
                                                    case 5:
                                                    case 8:
                                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                                        break;
                                                    case 3:
                                                    case 6:
                                                    case 9:
                                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                        break;
                                                }
                                                alignment = null;
                                                c0471a.f34903c = alignment;
                                                int i18 = Integer.MIN_VALUE;
                                                switch (i17) {
                                                    case -1:
                                                        break;
                                                    case 0:
                                                    default:
                                                        k.s("Unknown alignment: ", i17, "SsaDecoder");
                                                        break;
                                                    case 1:
                                                    case 4:
                                                    case 7:
                                                        i11 = 0;
                                                        break;
                                                    case 2:
                                                    case 5:
                                                    case 8:
                                                        i11 = 1;
                                                        break;
                                                    case 3:
                                                    case 6:
                                                    case 9:
                                                        i11 = 2;
                                                        break;
                                                }
                                                i11 = Integer.MIN_VALUE;
                                                c0471a.f34908i = i11;
                                                switch (i17) {
                                                    case -1:
                                                        break;
                                                    case 0:
                                                    default:
                                                        k.s("Unknown alignment: ", i17, "SsaDecoder");
                                                        break;
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                        i18 = 2;
                                                        break;
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                        i18 = 1;
                                                        break;
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        i18 = 0;
                                                        break;
                                                }
                                                c0471a.f34906g = i18;
                                                if (pointF != null && f11 != -3.4028235E38f && f10 != -3.4028235E38f) {
                                                    c0471a.f34907h = pointF.x / f10;
                                                    c0471a.f34905e = pointF.y / f11;
                                                    c0471a.f = 0;
                                                } else {
                                                    int i19 = c0471a.f34908i;
                                                    float f13 = 0.95f;
                                                    if (i19 != 0) {
                                                        if (i19 != 1) {
                                                            if (i19 != 2) {
                                                                f = -3.4028235E38f;
                                                            } else {
                                                                f = 0.95f;
                                                            }
                                                        } else {
                                                            f = 0.5f;
                                                        }
                                                    } else {
                                                        f = 0.05f;
                                                    }
                                                    c0471a.f34907h = f;
                                                    if (i18 != 0) {
                                                        if (i18 != 1) {
                                                            if (i18 != 2) {
                                                                f13 = -3.4028235E38f;
                                                            }
                                                        } else {
                                                            f13 = 0.5f;
                                                        }
                                                    } else {
                                                        f13 = 0.05f;
                                                    }
                                                    c0471a.f34905e = f13;
                                                    c0471a.f = 0;
                                                }
                                                r5.a a11 = c0471a.a();
                                                int h10 = h(j10, arrayList2, arrayList);
                                                for (int h11 = h(j11, arrayList2, arrayList); h11 < h10; h11++) {
                                                    ((List) arrayList.get(h11)).add(a11);
                                                }
                                                aVar = this;
                                                bVar = bVar2;
                                                wVar2 = wVar;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    wVar = wVar2;
                    bVar2 = bVar;
                    aVar = this;
                    bVar = bVar2;
                    wVar2 = wVar;
                }
            } else {
                return new d(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0298 A[Catch: RuntimeException -> 0x02cc, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x02cc, blocks: (B:49:0x01d3, B:51:0x01e1, B:52:0x01f0, B:54:0x01f4, B:55:0x0203, B:57:0x0207, B:58:0x0216, B:60:0x021a, B:62:0x0220, B:63:0x023e, B:65:0x0244, B:68:0x0255, B:70:0x0259, B:73:0x026a, B:75:0x026e, B:78:0x027f, B:80:0x0283, B:83:0x0294, B:85:0x0298, B:87:0x029e, B:94:0x02c6, B:95:0x02b3, B:107:0x0227), top: B:48:0x01d3, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(d6.w r39) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.a.i(d6.w):void");
    }
}
