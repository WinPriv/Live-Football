package n5;

import android.net.Uri;
import android.text.TextUtils;
import c6.d0;
import com.anythink.core.common.t;
import com.anythink.expressad.exoplayer.k.o;
import com.anythink.expressad.foundation.d.c;
import com.google.android.exoplayer2.drm.DrmInitData;
import d6.e0;
import d6.g0;
import j7.i1;
import j7.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.i0;
import k4.z0;
import n5.k;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: DashManifestParser.java */
/* loaded from: classes2.dex */
public final class d extends DefaultHandler implements d0.a<c> {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f33366b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f33367c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f33368d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f33369e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f33370a;

    /* compiled from: DashManifestParser.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final i0 f33371a;

        /* renamed from: b, reason: collision with root package name */
        public final j0<b> f33372b;

        /* renamed from: c, reason: collision with root package name */
        public final k f33373c;

        /* renamed from: d, reason: collision with root package name */
        public final String f33374d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList<DrmInitData.SchemeData> f33375e;
        public final ArrayList<e> f;

        /* renamed from: g, reason: collision with root package name */
        public final long f33376g = -1;

        /* renamed from: h, reason: collision with root package name */
        public final List<e> f33377h;

        /* renamed from: i, reason: collision with root package name */
        public final List<e> f33378i;

        public a(i0 i0Var, List list, k kVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f33371a = i0Var;
            this.f33372b = j0.C(list);
            this.f33373c = kVar;
            this.f33374d = str;
            this.f33375e = arrayList;
            this.f = arrayList2;
            this.f33377h = arrayList3;
            this.f33378i = arrayList4;
        }
    }

    public d() {
        try {
            this.f33370a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static long b(ArrayList arrayList, long j10, long j11, int i10, long j12) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            int i12 = g0.f27302a;
            i11 = (int) ((((j12 - j10) + j11) - 1) / j11);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            arrayList.add(new k.d(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    public static void c(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        boolean z10;
        if (!d6.a.l(xmlPullParser)) {
            return;
        }
        int i10 = 1;
        while (i10 != 0) {
            xmlPullParser.next();
            if (d6.a.l(xmlPullParser)) {
                i10++;
            } else {
                if (xmlPullParser.getEventType() == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        if (r0 == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d4, code lost:
    
        if (r0.equals("4000") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
    
        if (r0 < 33) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(org.xmlpull.v1.XmlPullParser r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.d.d(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long e(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public static ArrayList f(XmlPullParser xmlPullParser, List list, boolean z10) throws XmlPullParserException, IOException {
        int i10;
        int i11;
        boolean z11;
        String str;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else if (z10) {
            i10 = 1;
        } else {
            i10 = Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        if (attributeValue2 != null) {
            i11 = Integer.parseInt(attributeValue2);
        } else {
            i11 = 1;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                c(xmlPullParser);
            }
        } while (!d6.a.k(xmlPullParser, "BaseURL"));
        if (str2 != null && e0.a(str2)[0] != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (attributeValue3 == null) {
                attributeValue3 = str2;
            }
            return i1.b(new b(i10, i11, str2, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            b bVar = (b) list.get(i12);
            String c10 = e0.c(bVar.f33350a, str2);
            if (attributeValue3 == null) {
                str = c10;
            } else {
                str = attributeValue3;
            }
            if (z10) {
                i10 = bVar.f33352c;
                i11 = bVar.f33353d;
                str = bVar.f33351b;
            }
            arrayList.add(new b(i10, i11, c10, str));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair g(org.xmlpull.v1.XmlPullParser r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.d.g(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int h(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (!TextUtils.isEmpty(attributeValue)) {
            if (o.f9069b.equals(attributeValue)) {
                return 1;
            }
            if ("video".equals(attributeValue)) {
                return 2;
            }
            if (o.f9070c.equals(attributeValue)) {
                return 3;
            }
            if (c.C0119c.f9528e.equals(attributeValue)) {
                return 4;
            }
        }
        return -1;
    }

    public static e i(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        if (attributeValue3 != null) {
            str2 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!d6.a.k(xmlPullParser, str));
        return new e(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j10) {
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        Matcher matcher = g0.f27308h.matcher(attributeValue);
        if (matcher.matches()) {
            boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d15 = 0.0d;
            if (group != null) {
                d10 = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d10 = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d11 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d11 = 0.0d;
            }
            double d16 = d10 + d11;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d12 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d12 = 0.0d;
            }
            double d17 = d16 + d12;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d13 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d13 = 0.0d;
            }
            double d18 = d17 + d13;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d14 = Double.parseDouble(group5) * 60.0d;
            } else {
                d14 = 0.0d;
            }
            double d19 = d18 + d14;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d15 = Double.parseDouble(group6);
            }
            long j11 = (long) ((d19 + d15) * 1000.0d);
            if (isEmpty) {
                return -j11;
            }
            return j11;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static float k(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f33366b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                if (!TextUtils.isEmpty(matcher.group(2))) {
                    return parseInt / Integer.parseInt(r2);
                }
                return parseInt;
            }
            return f;
        }
        return f;
    }

    public static int l(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Integer.parseInt(attributeValue);
        }
        return i10;
    }

    public static long m(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Long.parseLong(attributeValue);
        }
        return j10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0885, code lost:
    
        if (com.anythink.expressad.exoplayer.k.o.B.equals(r0) != false) goto L275;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:622:0x0f49. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0e45 A[LOOP:5: B:154:0x038f->B:163:0x0e45, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0cd3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0db2 A[LOOP:9: B:194:0x0d80->B:208:0x0db2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0dae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0b56 A[LOOP:11: B:310:0x059e->B:318:0x0b56, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0b2b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x11e8 A[LOOP:1: B:34:0x00d3->B:44:0x11e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0afc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x11ad A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n5.c n(org.xmlpull.v1.XmlPullParser r152, android.net.Uri r153) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 4646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.d.n(org.xmlpull.v1.XmlPullParser, android.net.Uri):n5.c");
    }

    public static i o(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j10 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j11 = (Long.parseLong(split[1]) - j10) + 1;
                return new i(attributeValue, j10, j11);
            }
        } else {
            j10 = 0;
        }
        j11 = -1;
        return new i(attributeValue, j10, j11);
    }

    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c10 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
            case 5:
                return 128;
            case 1:
                return 512;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case '\b':
                return 256;
            case '\t':
                return 64;
            case '\n':
                return 8;
            case 11:
                return 32;
            case '\f':
                return 4;
            default:
                return 0;
        }
    }

    public static int q(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i7.g.b("http://dashif.org/guidelines/trickmode", ((e) arrayList.get(i11)).f33379a)) {
                i10 |= 16384;
            }
        }
        return i10;
    }

    public static k.e r(XmlPullParser xmlPullParser, k.e eVar) throws XmlPullParserException, IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        if (eVar != null) {
            j10 = eVar.f33408b;
        } else {
            j10 = 1;
        }
        long m10 = m(xmlPullParser, "timescale", j10);
        long j15 = 0;
        if (eVar != null) {
            j11 = eVar.f33409c;
        } else {
            j11 = 0;
        }
        long m11 = m(xmlPullParser, "presentationTimeOffset", j11);
        if (eVar != null) {
            j12 = eVar.f33421d;
        } else {
            j12 = 0;
        }
        if (eVar != null) {
            j15 = eVar.f33422e;
        }
        i iVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j13 = (Long.parseLong(split[1]) - parseLong) + 1;
            j14 = parseLong;
        } else {
            j13 = j15;
            j14 = j12;
        }
        if (eVar != null) {
            iVar = eVar.f33407a;
        }
        do {
            xmlPullParser.next();
            if (d6.a.m(xmlPullParser, "Initialization")) {
                iVar = o(xmlPullParser, "sourceURL", "range");
            } else {
                c(xmlPullParser);
            }
        } while (!d6.a.k(xmlPullParser, "SegmentBase"));
        return new k.e(iVar, m10, m11, j14, j13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k.b s(XmlPullParser xmlPullParser, k.b bVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        List list;
        long j20 = 1;
        if (bVar != null) {
            j15 = bVar.f33408b;
        } else {
            j15 = 1;
        }
        long m10 = m(xmlPullParser, "timescale", j15);
        if (bVar != null) {
            j16 = bVar.f33409c;
        } else {
            j16 = 0;
        }
        long m11 = m(xmlPullParser, "presentationTimeOffset", j16);
        if (bVar != null) {
            j17 = bVar.f33411e;
        } else {
            j17 = -9223372036854775807L;
        }
        long m12 = m(xmlPullParser, "duration", j17);
        if (bVar != null) {
            j20 = bVar.f33410d;
        }
        long m13 = m(xmlPullParser, "startNumber", j20);
        if (j13 == com.anythink.expressad.exoplayer.b.f7291b) {
            j18 = j12;
        } else {
            j18 = j13;
        }
        if (j18 == Long.MAX_VALUE) {
            j19 = -9223372036854775807L;
        } else {
            j19 = j18;
        }
        List list2 = null;
        i iVar = null;
        List list3 = null;
        do {
            xmlPullParser.next();
            if (d6.a.m(xmlPullParser, "Initialization")) {
                iVar = o(xmlPullParser, "sourceURL", "range");
            } else if (d6.a.m(xmlPullParser, "SegmentTimeline")) {
                list3 = u(xmlPullParser, m10, j11);
            } else if (d6.a.m(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(o(xmlPullParser, "media", "mediaRange"));
            } else {
                c(xmlPullParser);
            }
        } while (!d6.a.k(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (iVar == null) {
                iVar = bVar.f33407a;
            }
            if (list3 == null) {
                list3 = bVar.f;
            }
            if (list2 == null) {
                list = bVar.f33415j;
                return new k.b(iVar, m10, m11, m13, m12, list3, j19, list, g0.J(j14), g0.J(j10));
            }
        }
        list = list2;
        return new k.b(iVar, m10, m11, m13, m12, list3, j19, list, g0.J(j14), g0.J(j10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k.c t(XmlPullParser xmlPullParser, k.c cVar, List list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        m mVar;
        m mVar2;
        i iVar;
        List list2;
        long j21 = 1;
        if (cVar != null) {
            j15 = cVar.f33408b;
        } else {
            j15 = 1;
        }
        long m10 = m(xmlPullParser, "timescale", j15);
        if (cVar != null) {
            j16 = cVar.f33409c;
        } else {
            j16 = 0;
        }
        long m11 = m(xmlPullParser, "presentationTimeOffset", j16);
        if (cVar != null) {
            j17 = cVar.f33411e;
        } else {
            j17 = -9223372036854775807L;
        }
        long m12 = m(xmlPullParser, "duration", j17);
        if (cVar != null) {
            j21 = cVar.f33410d;
        }
        long m13 = m(xmlPullParser, "startNumber", j21);
        int i10 = 0;
        while (true) {
            if (i10 < list.size()) {
                e eVar = (e) list.get(i10);
                if (i7.g.b("http://dashif.org/guidelines/last-segment-number", eVar.f33379a)) {
                    j18 = Long.parseLong(eVar.f33380b);
                    break;
                }
                i10++;
            } else {
                j18 = -1;
                break;
            }
        }
        long j22 = j18;
        if (j13 == com.anythink.expressad.exoplayer.b.f7291b) {
            j19 = j12;
        } else {
            j19 = j13;
        }
        if (j19 == Long.MAX_VALUE) {
            j20 = -9223372036854775807L;
        } else {
            j20 = j19;
        }
        i iVar2 = null;
        if (cVar != null) {
            mVar = cVar.f33417k;
        } else {
            mVar = null;
        }
        m v3 = v(xmlPullParser, "media", mVar);
        if (cVar != null) {
            mVar2 = cVar.f33416j;
        } else {
            mVar2 = null;
        }
        m v10 = v(xmlPullParser, "initialization", mVar2);
        List list3 = null;
        do {
            xmlPullParser.next();
            if (d6.a.m(xmlPullParser, "Initialization")) {
                iVar2 = o(xmlPullParser, "sourceURL", "range");
            } else if (d6.a.m(xmlPullParser, "SegmentTimeline")) {
                list3 = u(xmlPullParser, m10, j11);
            } else {
                c(xmlPullParser);
            }
        } while (!d6.a.k(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (iVar2 == null) {
                iVar2 = cVar.f33407a;
            }
            if (list3 == null) {
                list2 = cVar.f;
                iVar = iVar2;
                return new k.c(iVar, m10, m11, m13, j22, m12, list2, j20, v10, v3, g0.J(j14), g0.J(j10));
            }
        }
        iVar = iVar2;
        list2 = list3;
        return new k.c(iVar, m10, m11, m13, j22, m12, list2, j20, v10, v3, g0.J(j14), g0.J(j10));
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (d6.a.m(xmlPullParser, "S")) {
                long m10 = m(xmlPullParser, t.f6511a, com.anythink.expressad.exoplayer.b.f7291b);
                if (z10) {
                    j12 = b(arrayList, j12, j13, i10, m10);
                }
                if (m10 == com.anythink.expressad.exoplayer.b.f7291b) {
                    m10 = j12;
                }
                long m11 = m(xmlPullParser, "d", com.anythink.expressad.exoplayer.b.f7291b);
                i10 = l(xmlPullParser, "r", 0);
                z10 = true;
                j13 = m11;
                j12 = m10;
            } else {
                c(xmlPullParser);
            }
        } while (!d6.a.k(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            b(arrayList, j12, j13, i10, g0.P(j11, j10, 1000L));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00c6. Please report as an issue. */
    public static m v(XmlPullParser xmlPullParser, String str, m mVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            String[] strArr = new String[5];
            int[] iArr = new int[4];
            String[] strArr2 = new String[4];
            strArr[0] = "";
            int i10 = 0;
            int i11 = 0;
            while (i10 < attributeValue.length()) {
                int indexOf = attributeValue.indexOf("$", i10);
                if (indexOf == -1) {
                    strArr[i11] = strArr[i11] + attributeValue.substring(i10);
                    i10 = attributeValue.length();
                } else if (indexOf != i10) {
                    strArr[i11] = strArr[i11] + attributeValue.substring(i10, indexOf);
                    i10 = indexOf;
                } else if (attributeValue.startsWith("$$", i10)) {
                    strArr[i11] = a3.l.p(new StringBuilder(), strArr[i11], "$");
                    i10 += 2;
                } else {
                    int i12 = i10 + 1;
                    int indexOf2 = attributeValue.indexOf("$", i12);
                    String substring = attributeValue.substring(i12, indexOf2);
                    if (substring.equals("RepresentationID")) {
                        iArr[i11] = 1;
                    } else {
                        int indexOf3 = substring.indexOf("%0");
                        if (indexOf3 != -1) {
                            str2 = substring.substring(indexOf3);
                            if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                                str2 = str2.concat("d");
                            }
                            substring = substring.substring(0, indexOf3);
                        } else {
                            str2 = "%01d";
                        }
                        substring.getClass();
                        substring.hashCode();
                        char c10 = 65535;
                        switch (substring.hashCode()) {
                            case -1950496919:
                                if (substring.equals("Number")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case 2606829:
                                if (substring.equals("Time")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 38199441:
                                if (substring.equals("Bandwidth")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c10) {
                            case 0:
                                iArr[i11] = 2;
                                break;
                            case 1:
                                iArr[i11] = 4;
                                break;
                            case 2:
                                iArr[i11] = 3;
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                        }
                        strArr2[i11] = str2;
                    }
                    i11++;
                    strArr[i11] = "";
                    i10 = indexOf2 + 1;
                }
            }
            return new m(strArr, iArr, strArr2, i11);
        }
        return mVar;
    }

    @Override // c6.d0.a
    public final Object a(Uri uri, c6.l lVar) throws IOException {
        try {
            XmlPullParser newPullParser = this.f33370a.newPullParser();
            newPullParser.setInput(lVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return n(newPullParser, uri);
            }
            throw z0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw z0.b(null, e10);
        }
    }
}
