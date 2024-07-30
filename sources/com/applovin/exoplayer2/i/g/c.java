package com.applovin.exoplayer2.i.g;

import a3.k;
import a3.l;
import android.text.Layout;
import com.anythink.core.common.t;
import com.anythink.expressad.foundation.d.c;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.aj;
import com.applovin.exoplayer2.l.q;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class c extends com.applovin.exoplayer2.i.d {

    /* renamed from: j, reason: collision with root package name */
    private final XmlPullParserFactory f15752j;

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f15746c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f15747d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f15748e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    static final Pattern f15744a = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: b, reason: collision with root package name */
    static final Pattern f15745b = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern f = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f15749g = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: h, reason: collision with root package name */
    private static final b f15750h = new b(30.0f, 1, 1);

    /* renamed from: i, reason: collision with root package name */
    private static final a f15751i = new a(32, 15);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int f15753a;

        /* renamed from: b, reason: collision with root package name */
        final int f15754b;

        public a(int i10, int i11) {
            this.f15753a = i10;
            this.f15754b = i11;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final float f15755a;

        /* renamed from: b, reason: collision with root package name */
        final int f15756b;

        /* renamed from: c, reason: collision with root package name */
        final int f15757c;

        public b(float f, int i10, int i11) {
            this.f15755a = f;
            this.f15756b = i10;
            this.f15757c = i11;
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.g.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0181c {

        /* renamed from: a, reason: collision with root package name */
        final int f15758a;

        /* renamed from: b, reason: collision with root package name */
        final int f15759b;

        public C0181c(int i10, int i11) {
            this.f15758a = i10;
            this.f15759b = i11;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f15752j = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static C0181c b(XmlPullParser xmlPullParser) {
        String c10 = aj.c(xmlPullParser, "extent");
        if (c10 == null) {
            return null;
        }
        Matcher matcher = f.matcher(c10);
        if (!matcher.matches()) {
            q.c("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(c10));
            return null;
        }
        try {
            return new C0181c(Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher.group(1))), Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher.group(2))));
        } catch (NumberFormatException unused) {
            q.c("TtmlDecoder", "Ignoring malformed tts extent: ".concat(c10));
            return null;
        }
    }

    private static boolean c(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals(com.anythink.core.common.g.c.W) && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals(c.C0119c.f9528e) && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    private static float d(String str) {
        Matcher matcher = f15744a.matcher(str);
        if (!matcher.matches()) {
            l.D("Invalid value for shear: ", str, "TtmlDecoder");
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            q.b("TtmlDecoder", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    @Override // com.applovin.exoplayer2.i.d
    public com.applovin.exoplayer2.i.f a(byte[] bArr, int i10, boolean z10) throws com.applovin.exoplayer2.i.h {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f15752j.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e(""));
            C0181c c0181c = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f15750h;
            a aVar = f15751i;
            int i11 = 0;
            h hVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = a(newPullParser);
                            aVar = a(newPullParser, f15751i);
                            c0181c = b(newPullParser);
                        }
                        C0181c c0181c2 = c0181c;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (c(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                a(newPullParser, hashMap, aVar2, c0181c2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    d a10 = a(newPullParser, dVar, hashMap2, bVar);
                                    arrayDeque.push(a10);
                                    if (dVar != null) {
                                        dVar.a(a10);
                                    }
                                } catch (com.applovin.exoplayer2.i.h e10) {
                                    q.b("TtmlDecoder", "Suppressing parser error", e10);
                                    i11++;
                                }
                            }
                            bVar2 = bVar;
                        } else {
                            q.b("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i11++;
                            bVar2 = bVar3;
                        }
                        c0181c = c0181c2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((d) com.applovin.exoplayer2.l.a.b(dVar)).a(d.a(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            hVar = new h((d) com.applovin.exoplayer2.l.a.b((d) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new com.applovin.exoplayer2.i.h("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new com.applovin.exoplayer2.i.h("Unable to decode source", e12);
        }
    }

    private static Layout.Alignment b(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        char c10 = 65535;
        switch (lowerCase.hashCode()) {
            case -1364013995:
                if (lowerCase.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (lowerCase.equals("end")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3317767:
                if (lowerCase.equals("left")) {
                    c10 = 2;
                    break;
                }
                break;
            case 108511772:
                if (lowerCase.equals("right")) {
                    c10 = 3;
                    break;
                }
                break;
            case 109757538:
                if (lowerCase.equals("start")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static b a(XmlPullParser xmlPullParser) throws com.applovin.exoplayer2.i.h {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (ai.a(attributeValue2, " ").length == 2) {
                f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new com.applovin.exoplayer2.i.h("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f10 = 1.0f;
        }
        b bVar = f15750h;
        int i10 = bVar.f15756b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = bVar.f15757c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f10, i10, i11);
    }

    private static a a(XmlPullParser xmlPullParser, a aVar) throws com.applovin.exoplayer2.i.h {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f15749g.matcher(attributeValue);
        if (!matcher.matches()) {
            q.c("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            throw new com.applovin.exoplayer2.i.h("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            q.c("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
    }

    private static Map<String, g> a(XmlPullParser xmlPullParser, Map<String, g> map, a aVar, C0181c c0181c, Map<String, e> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (aj.b(xmlPullParser, "style")) {
                String c10 = aj.c(xmlPullParser, "style");
                g a10 = a(xmlPullParser, new g());
                if (c10 != null) {
                    for (String str : a(c10)) {
                        a10.a(map.get(str));
                    }
                }
                String j10 = a10.j();
                if (j10 != null) {
                    map.put(j10, a10);
                }
            } else if (aj.b(xmlPullParser, "region")) {
                e a11 = a(xmlPullParser, aVar, c0181c);
                if (a11 != null) {
                    map2.put(a11.f15772a, a11);
                }
            } else if (aj.b(xmlPullParser, "metadata")) {
                a(xmlPullParser, map3);
            }
        } while (!aj.a(xmlPullParser, "head"));
        return map;
    }

    private static void a(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        String c10;
        do {
            xmlPullParser.next();
            if (aj.b(xmlPullParser, c.C0119c.f9528e) && (c10 = aj.c(xmlPullParser, "id")) != null) {
                map.put(c10, xmlPullParser.nextText());
            }
        } while (!aj.a(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017d, code lost:
    
        if (r0.equals("tb") == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.exoplayer2.i.g.e a(org.xmlpull.v1.XmlPullParser r17, com.applovin.exoplayer2.i.g.c.a r18, com.applovin.exoplayer2.i.g.c.C0181c r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.g.c.a(org.xmlpull.v1.XmlPullParser, com.applovin.exoplayer2.i.g.c$a, com.applovin.exoplayer2.i.g.c$c):com.applovin.exoplayer2.i.g.e");
    }

    private static String[] a(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : ai.a(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0283, code lost:
    
        switch(r4) {
            case 0: goto L159;
            case 1: goto L158;
            case 2: goto L157;
            case 3: goto L156;
            default: goto L203;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0287, code lost:
    
        r13 = a(r13).a(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0290, code lost:
    
        r13 = a(r13).a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0299, code lost:
    
        r13 = a(r13).b(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a2, code lost:
    
        r13 = a(r13).b(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00a0, code lost:
    
        if (r4.equals("id") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f2, code lost:
    
        switch(r4) {
            case 0: goto L130;
            case 1: goto L129;
            case 2: goto L128;
            case 3: goto L127;
            case 4: goto L130;
            case 5: goto L127;
            default: goto L202;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f7, code lost:
    
        r13 = a(r13).c(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0201, code lost:
    
        r13 = a(r13).c(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020b, code lost:
    
        r13 = a(r13).c(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0215, code lost:
    
        r13 = a(r13).c(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.exoplayer2.i.g.g a(org.xmlpull.v1.XmlPullParser r12, com.applovin.exoplayer2.i.g.g r13) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.g.c.a(org.xmlpull.v1.XmlPullParser, com.applovin.exoplayer2.i.g.g):com.applovin.exoplayer2.i.g.g");
    }

    private static g a(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static d a(XmlPullParser xmlPullParser, d dVar, Map<String, e> map, b bVar) throws com.applovin.exoplayer2.i.h {
        long j10;
        long j11;
        char c10;
        int attributeCount = xmlPullParser.getAttributeCount();
        g a10 = a(xmlPullParser, (g) null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j12 = com.anythink.expressad.exoplayer.b.f7291b;
        long j13 = com.anythink.expressad.exoplayer.b.f7291b;
        long j14 = com.anythink.expressad.exoplayer.b.f7291b;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j14 = a(attributeValue, bVar);
                    break;
                case 2:
                    j13 = a(attributeValue, bVar);
                    break;
                case 3:
                    j12 = a(attributeValue, bVar);
                    break;
                case 4:
                    String[] a11 = a(attributeValue);
                    if (a11.length > 0) {
                        strArr = a11;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (dVar != null) {
            long j15 = dVar.f15763d;
            j10 = com.anythink.expressad.exoplayer.b.f7291b;
            if (j15 != com.anythink.expressad.exoplayer.b.f7291b) {
                if (j12 != com.anythink.expressad.exoplayer.b.f7291b) {
                    j12 += j15;
                }
                if (j13 != com.anythink.expressad.exoplayer.b.f7291b) {
                    j13 += j15;
                }
            }
        } else {
            j10 = com.anythink.expressad.exoplayer.b.f7291b;
        }
        long j16 = j12;
        if (j13 == j10) {
            if (j14 != j10) {
                j11 = j16 + j14;
            } else if (dVar != null) {
                long j17 = dVar.f15764e;
                if (j17 != j10) {
                    j11 = j17;
                }
            }
            return d.a(xmlPullParser.getName(), j16, j11, a10, strArr, str2, str, dVar);
        }
        j11 = j13;
        return d.a(xmlPullParser.getName(), j16, j11, a10, strArr, str2, str, dVar);
    }

    private static void a(String str, g gVar) throws com.applovin.exoplayer2.i.h {
        Matcher matcher;
        String[] a10 = ai.a(str, "\\s+");
        if (a10.length == 1) {
            matcher = f15748e.matcher(str);
        } else if (a10.length == 2) {
            matcher = f15748e.matcher(a10[1]);
            q.c("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new com.applovin.exoplayer2.i.h(com.ironsource.adapters.facebook.a.i(new StringBuilder("Invalid number of entries for fontSize: "), a10.length, "."));
        }
        if (matcher.matches()) {
            String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(3));
            str2.getClass();
            str2.hashCode();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    gVar.e(3);
                    break;
                case 1:
                    gVar.e(2);
                    break;
                case 2:
                    gVar.e(1);
                    break;
                default:
                    throw new com.applovin.exoplayer2.i.h(k.l("Invalid unit for fontSize: '", str2, "'."));
            }
            gVar.b(Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher.group(1))));
            return;
        }
        throw new com.applovin.exoplayer2.i.h(k.l("Invalid expression for fontSize: '", str, "'."));
    }

    private static long a(String str, b bVar) throws com.applovin.exoplayer2.i.h {
        double d10;
        double d11;
        Matcher matcher = f15746c.matcher(str);
        if (matcher.matches()) {
            double parseLong = (Long.parseLong((String) com.applovin.exoplayer2.l.a.b(matcher.group(1))) * com.anythink.expressad.d.a.b.P) + (Long.parseLong((String) com.applovin.exoplayer2.l.a.b(matcher.group(2))) * 60) + Long.parseLong((String) com.applovin.exoplayer2.l.a.b(matcher.group(3)));
            String group = matcher.group(4);
            return (long) ((parseLong + (group != null ? Double.parseDouble(group) : 0.0d) + (matcher.group(5) != null ? ((float) Long.parseLong(r13)) / bVar.f15755a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / bVar.f15756b) / bVar.f15755a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f15747d.matcher(str);
        if (matcher2.matches()) {
            double parseDouble = Double.parseDouble((String) com.applovin.exoplayer2.l.a.b(matcher2.group(1)));
            String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher2.group(2));
            str2.getClass();
            str2.hashCode();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case 102:
                    if (str2.equals("f")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 104:
                    if (str2.equals("h")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109:
                    if (str2.equals(com.anythink.expressad.d.a.b.dH)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 116:
                    if (str2.equals(t.f6511a)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3494:
                    if (str2.equals("ms")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    d10 = bVar.f15755a;
                    parseDouble /= d10;
                    break;
                case 1:
                    d11 = 3600.0d;
                    break;
                case 2:
                    d11 = 60.0d;
                    break;
                case 3:
                    d10 = bVar.f15757c;
                    parseDouble /= d10;
                    break;
                case 4:
                    d10 = 1000.0d;
                    parseDouble /= d10;
                    break;
            }
            parseDouble *= d11;
            return (long) (parseDouble * 1000000.0d);
        }
        throw new com.applovin.exoplayer2.i.h(s.f.b("Malformed time expression: ", str));
    }
}
