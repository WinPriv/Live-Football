package y5;

import a3.k;
import android.text.Layout;
import com.anythink.core.common.t;
import com.anythink.expressad.foundation.d.c;
import d6.g0;
import d6.p;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import r5.i;

/* compiled from: TtmlDecoder.java */
/* loaded from: classes2.dex */
public final class c extends r5.f {

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f36711n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f36712p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f36713q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f36714r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f36715s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f36716t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u, reason: collision with root package name */
    public static final b f36717u = new b(30.0f, 1, 1);

    /* renamed from: v, reason: collision with root package name */
    public static final a f36718v = new a(15);

    /* renamed from: m, reason: collision with root package name */
    public final XmlPullParserFactory f36719m;

    /* compiled from: TtmlDecoder.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f36720a;

        public a(int i10) {
            this.f36720a = i10;
        }
    }

    /* compiled from: TtmlDecoder.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f36721a;

        /* renamed from: b, reason: collision with root package name */
        public final int f36722b;

        /* renamed from: c, reason: collision with root package name */
        public final int f36723c;

        public b(float f, int i10, int i11) {
            this.f36721a = f;
            this.f36722b = i10;
            this.f36723c = i11;
        }
    }

    /* compiled from: TtmlDecoder.java */
    /* renamed from: y5.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0512c {

        /* renamed from: a, reason: collision with root package name */
        public final int f36724a;

        /* renamed from: b, reason: collision with root package name */
        public final int f36725b;

        public C0512c(int i10, int i11) {
            this.f36724a = i10;
            this.f36725b = i11;
        }
    }

    public c() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f36719m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static f h(f fVar) {
        if (fVar == null) {
            return new f();
        }
        return fVar;
    }

    public static boolean i(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals(com.anythink.core.common.g.c.W) && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals(c.C0119c.f9528e) && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static Layout.Alignment j(String str) {
        String c10 = i7.g.c(str);
        c10.getClass();
        char c11 = 65535;
        switch (c10.hashCode()) {
            case -1364013995:
                if (c10.equals("center")) {
                    c11 = 0;
                    break;
                }
                break;
            case 100571:
                if (c10.equals("end")) {
                    c11 = 1;
                    break;
                }
                break;
            case 3317767:
                if (c10.equals("left")) {
                    c11 = 2;
                    break;
                }
                break;
            case 108511772:
                if (c10.equals("right")) {
                    c11 = 3;
                    break;
                }
                break;
            case 109757538:
                if (c10.equals("start")) {
                    c11 = 4;
                    break;
                }
                break;
        }
        switch (c11) {
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

    public static a k(XmlPullParser xmlPullParser, a aVar) throws i {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f36716t.matcher(attributeValue);
        if (!matcher.matches()) {
            p.f("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt2);
            }
            throw new i("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            p.f("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
    }

    public static void l(String str, f fVar) throws i {
        Matcher matcher;
        int i10 = g0.f27302a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f36712p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            p.f("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new i(com.ironsource.adapters.facebook.a.i(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            group.hashCode();
            char c10 = 65535;
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    fVar.f36755j = 3;
                    break;
                case 1:
                    fVar.f36755j = 2;
                    break;
                case 2:
                    fVar.f36755j = 1;
                    break;
                default:
                    throw new i(k.l("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            fVar.f36756k = Float.parseFloat(group2);
            return;
        }
        throw new i(k.l("Invalid expression for fontSize: '", str, "'."));
    }

    public static b m(XmlPullParser xmlPullParser) throws i {
        int i10;
        float f;
        int i11;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i12 = g0.f27302a;
            if (attributeValue2.split(" ", -1).length == 2) {
                f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new i("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f = 1.0f;
        }
        b bVar = f36717u;
        int i13 = bVar.f36722b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i13 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        } else {
            i11 = bVar.f36723c;
        }
        return new b(i10 * f, i13, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0229, code lost:
    
        if (d6.a.m(r20, "metadata") != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022b, code lost:
    
        r20.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0234, code lost:
    
        if (d6.a.m(r20, com.anythink.expressad.foundation.d.c.C0119c.f9528e) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0236, code lost:
    
        r6 = d6.a.g(r20, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x023a, code lost:
    
        if (r6 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023c, code lost:
    
        r25.put(r6, r20.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x024c, code lost:
    
        if (d6.a.k(r20, "metadata") == false) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, y5.c.a r22, y5.c.C0512c r23, java.util.HashMap r24, java.util.HashMap r25) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.n(org.xmlpull.v1.XmlPullParser, java.util.HashMap, y5.c$a, y5.c$c, java.util.HashMap, java.util.HashMap):void");
    }

    public static d o(XmlPullParser xmlPullParser, d dVar, HashMap hashMap, b bVar) throws i {
        long j10;
        long j11;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        f p10 = p(xmlPullParser, null);
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
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                if (c10 == 5 && attributeValue.startsWith("#")) {
                                    str = attributeValue.substring(1);
                                }
                            } else {
                                String trim = attributeValue.trim();
                                if (trim.isEmpty()) {
                                    split = new String[0];
                                } else {
                                    int i11 = g0.f27302a;
                                    split = trim.split("\\s+", -1);
                                }
                                if (split.length > 0) {
                                    strArr = split;
                                }
                            }
                        } else {
                            j12 = q(attributeValue, bVar);
                        }
                    } else {
                        j13 = q(attributeValue, bVar);
                    }
                } else {
                    j14 = q(attributeValue, bVar);
                }
            } else if (hashMap.containsKey(attributeValue)) {
                str2 = attributeValue;
            }
        }
        if (dVar != null) {
            long j15 = dVar.f36729d;
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
        if (j13 == j10) {
            if (j14 != j10) {
                j11 = j12 + j14;
            } else if (dVar != null) {
                long j16 = dVar.f36730e;
                if (j16 != j10) {
                    j11 = j16;
                }
            }
            return new d(xmlPullParser.getName(), null, j12, j11, p10, strArr, str2, str, dVar);
        }
        j11 = j13;
        return new d(xmlPullParser.getName(), null, j12, j11, p10, strArr, str2, str, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x037f, code lost:
    
        switch(r4) {
            case 0: goto L232;
            case 1: goto L231;
            case 2: goto L230;
            case 3: goto L229;
            case 4: goto L232;
            case 5: goto L229;
            default: goto L306;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0384, code lost:
    
        r15 = h(r15);
        r15.f36758m = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x038c, code lost:
    
        r15 = h(r15);
        r15.f36758m = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0394, code lost:
    
        r15 = h(r15);
        r15.f36758m = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x039c, code lost:
    
        r15 = h(r15);
        r15.f36758m = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0405, code lost:
    
        switch(r4) {
            case 0: goto L261;
            case 1: goto L260;
            case 2: goto L259;
            case 3: goto L258;
            default: goto L307;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0409, code lost:
    
        r15 = h(r15);
        r15.f = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0410, code lost:
    
        r15 = h(r15);
        r15.f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0417, code lost:
    
        r15 = h(r15);
        r15.f36752g = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x041e, code lost:
    
        r15 = h(r15);
        r15.f36752g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ea, code lost:
    
        if (r3.equals("auto") != false) goto L131;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static y5.f p(org.xmlpull.v1.XmlPullParser r14, y5.f r15) {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.p(org.xmlpull.v1.XmlPullParser, y5.f):y5.f");
    }

    public static long q(String str, b bVar) throws i {
        double d10;
        double d11;
        double d12;
        double d13;
        Matcher matcher = f36711n.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * com.anythink.expressad.d.a.b.P;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            double d14 = 0.0d;
            if (group2 != null) {
                d12 = Double.parseDouble(group2);
            } else {
                d12 = 0.0d;
            }
            double d15 = parseLong3 + d12;
            String group3 = matcher.group(5);
            if (group3 != null) {
                d13 = ((float) Long.parseLong(group3)) / bVar.f36721a;
            } else {
                d13 = 0.0d;
            }
            double d16 = d15 + d13;
            if (matcher.group(6) != null) {
                d14 = (Long.parseLong(r13) / bVar.f36722b) / bVar.f36721a;
            }
            return (long) ((d16 + d14) * 1000000.0d);
        }
        Matcher matcher2 = o.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            double parseDouble = Double.parseDouble(group4);
            String group5 = matcher2.group(2);
            group5.getClass();
            group5.hashCode();
            char c10 = 65535;
            switch (group5.hashCode()) {
                case 102:
                    if (group5.equals("f")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 104:
                    if (group5.equals("h")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109:
                    if (group5.equals(com.anythink.expressad.d.a.b.dH)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 116:
                    if (group5.equals(t.f6511a)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3494:
                    if (group5.equals("ms")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    d10 = bVar.f36721a;
                    parseDouble /= d10;
                    break;
                case 1:
                    d11 = 3600.0d;
                    break;
                case 2:
                    d11 = 60.0d;
                    break;
                case 3:
                    d10 = bVar.f36723c;
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
        throw new i(s.f.b("Malformed time expression: ", str));
    }

    public static C0512c r(XmlPullParser xmlPullParser) {
        String g6 = d6.a.g(xmlPullParser, "extent");
        if (g6 == null) {
            return null;
        }
        Matcher matcher = f36715s.matcher(g6);
        if (!matcher.matches()) {
            p.f("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(g6));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new C0512c(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            p.f("TtmlDecoder", "Ignoring malformed tts extent: ".concat(g6));
            return null;
        }
    }

    @Override // r5.f
    public final r5.g g(byte[] bArr, int i10, boolean z10) throws i {
        a aVar;
        b bVar;
        try {
            XmlPullParser newPullParser = this.f36719m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C0512c c0512c = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f36717u;
            a aVar2 = f36718v;
            int i11 = 0;
            g gVar = null;
            a aVar3 = aVar2;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = m(newPullParser);
                            aVar3 = k(newPullParser, aVar2);
                            c0512c = r(newPullParser);
                        }
                        a aVar4 = aVar3;
                        C0512c c0512c2 = c0512c;
                        b bVar3 = bVar2;
                        if (!i(name)) {
                            p.e("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i11++;
                            aVar = aVar4;
                            bVar = bVar3;
                        } else if ("head".equals(name)) {
                            aVar = aVar4;
                            bVar = bVar3;
                            n(newPullParser, hashMap, aVar4, c0512c2, hashMap2, hashMap3);
                        } else {
                            aVar = aVar4;
                            bVar = bVar3;
                            try {
                                d o6 = o(newPullParser, dVar, hashMap2, bVar);
                                arrayDeque.push(o6);
                                if (dVar != null) {
                                    if (dVar.f36737m == null) {
                                        dVar.f36737m = new ArrayList();
                                    }
                                    dVar.f36737m.add(o6);
                                }
                            } catch (i e10) {
                                p.g("TtmlDecoder", "Suppressing parser error", e10);
                                i11++;
                            }
                        }
                        aVar3 = aVar;
                        bVar2 = bVar;
                        c0512c = c0512c2;
                    } else if (eventType == 4) {
                        dVar.getClass();
                        d a10 = d.a(newPullParser.getText());
                        if (dVar.f36737m == null) {
                            dVar.f36737m = new ArrayList();
                        }
                        dVar.f36737m.add(a10);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            d dVar2 = (d) arrayDeque.peek();
                            dVar2.getClass();
                            gVar = new g(dVar2, hashMap, hashMap2, hashMap3);
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
            if (gVar != null) {
                return gVar;
            }
            throw new i("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new i("Unable to decode source", e12);
        }
    }
}
