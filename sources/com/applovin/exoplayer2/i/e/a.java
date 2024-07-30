package com.applovin.exoplayer2.i.e;

import a3.k;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.e.c;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a extends com.applovin.exoplayer2.i.d {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f15699a = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15700b;

    /* renamed from: c, reason: collision with root package name */
    private final b f15701c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, c> f15702d;

    /* renamed from: e, reason: collision with root package name */
    private float f15703e;
    private float f;

    public a() {
        this(null);
    }

    private static Layout.Alignment b(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                k.y("Unknown alignment: ", i10, "SsaDecoder");
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    private static int c(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                k.y("Unknown alignment: ", i10, "SsaDecoder");
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int d(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                k.y("Unknown alignment: ", i10, "SsaDecoder");
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static float e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    @Override // com.applovin.exoplayer2.i.d
    public f a(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        y yVar = new y(bArr, i10);
        if (!this.f15700b) {
            a(yVar);
        }
        a(yVar, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.f15703e = -3.4028235E38f;
        this.f = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.f15700b = true;
            String a10 = ai.a(list.get(0));
            com.applovin.exoplayer2.l.a.a(a10.startsWith("Format:"));
            this.f15701c = (b) com.applovin.exoplayer2.l.a.b(b.a(a10));
            a(new y(list.get(1)));
            return;
        }
        this.f15700b = false;
        this.f15701c = null;
    }

    private static Map<String, c> c(y yVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String C = yVar.C();
            if (C == null || (yVar.a() != 0 && yVar.f() == 91)) {
                break;
            }
            if (C.startsWith("Format:")) {
                aVar = c.a.a(C);
            } else if (C.startsWith("Style:")) {
                if (aVar == null) {
                    q.c("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(C));
                } else {
                    c a10 = c.a(C, aVar);
                    if (a10 != null) {
                        linkedHashMap.put(a10.f15709a, a10);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private void a(y yVar) {
        while (true) {
            String C = yVar.C();
            if (C == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(C)) {
                b(yVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(C)) {
                this.f15702d = c(yVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(C)) {
                q.b("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(C)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(com.applovin.exoplayer2.l.y r5) {
        /*
            r4 = this;
        L0:
            java.lang.String r0 = r5.C()
            if (r0 == 0) goto L59
            int r1 = r5.a()
            if (r1 == 0) goto L14
            int r1 = r5.f()
            r2 = 91
            if (r1 == r2) goto L59
        L14:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L1f
            goto L0
        L1f:
            r1 = 0
            r1 = r0[r1]
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(r1)
            r1.getClass()
            java.lang.String r2 = "playresx"
            boolean r2 = r1.equals(r2)
            r3 = 1
            if (r2 != 0) goto L4c
            java.lang.String r2 = "playresy"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3f
            goto L0
        L3f:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L4c:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f15703e = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.e.a.b(com.applovin.exoplayer2.l.y):void");
    }

    private void a(y yVar, List<List<com.applovin.exoplayer2.i.a>> list, List<Long> list2) {
        b bVar = this.f15700b ? this.f15701c : null;
        while (true) {
            String C = yVar.C();
            if (C == null) {
                return;
            }
            if (C.startsWith("Format:")) {
                bVar = b.a(C);
            } else if (C.startsWith("Dialogue:")) {
                if (bVar == null) {
                    q.c("SsaDecoder", "Skipping dialogue line before complete format: ".concat(C));
                } else {
                    a(C, bVar, list, list2);
                }
            }
        }
    }

    private void a(String str, b bVar, List<List<com.applovin.exoplayer2.i.a>> list, List<Long> list2) {
        int i10;
        com.applovin.exoplayer2.l.a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", bVar.f15708e);
        if (split.length != bVar.f15708e) {
            q.c("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(str));
            return;
        }
        long a10 = a(split[bVar.f15704a]);
        if (a10 == com.anythink.expressad.exoplayer.b.f7291b) {
            q.c("SsaDecoder", "Skipping invalid timing: ".concat(str));
            return;
        }
        long a11 = a(split[bVar.f15705b]);
        if (a11 == com.anythink.expressad.exoplayer.b.f7291b) {
            q.c("SsaDecoder", "Skipping invalid timing: ".concat(str));
            return;
        }
        Map<String, c> map = this.f15702d;
        c cVar = (map == null || (i10 = bVar.f15706c) == -1) ? null : map.get(split[i10].trim());
        String str2 = split[bVar.f15707d];
        com.applovin.exoplayer2.i.a a12 = a(c.b.b(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.a(str2), this.f15703e, this.f);
        int a13 = a(a11, list2, list);
        for (int a14 = a(a10, list2, list); a14 < a13; a14++) {
            list.get(a14).add(a12);
        }
    }

    private static long a(String str) {
        Matcher matcher = f15699a.matcher(str.trim());
        if (!matcher.matches()) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        return (Long.parseLong((String) ai.a(matcher.group(4))) * 10000) + (Long.parseLong((String) ai.a(matcher.group(3))) * 1000000) + (Long.parseLong((String) ai.a(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) ai.a(matcher.group(1))) * 60 * 60 * 1000000);
    }

    private static com.applovin.exoplayer2.i.a a(String str, c cVar, c.b bVar, float f, float f10) {
        SpannableString spannableString = new SpannableString(str);
        a.C0175a a10 = new a.C0175a().a(spannableString);
        if (cVar != null) {
            if (cVar.f15711c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f15711c.intValue()), 0, spannableString.length(), 33);
            }
            float f11 = cVar.f15712d;
            if (f11 != -3.4028235E38f && f10 != -3.4028235E38f) {
                a10.b(f11 / f10, 1);
            }
            boolean z10 = cVar.f15713e;
            if (z10 && cVar.f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f15714g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f15715h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f15727a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f15710b : -1;
        }
        a10.a(b(i10)).b(d(i10)).a(c(i10));
        PointF pointF = bVar.f15728b;
        if (pointF != null && f10 != -3.4028235E38f && f != -3.4028235E38f) {
            a10.a(pointF.x / f);
            a10.a(bVar.f15728b.y / f10, 0);
        } else {
            a10.a(e(a10.c()));
            a10.a(e(a10.b()), 0);
        }
        return a10.e();
    }

    private static int a(long j10, List<Long> list, List<List<com.applovin.exoplayer2.i.a>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (list.get(size).longValue() == j10) {
                return size;
            }
            if (list.get(size).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }
}
