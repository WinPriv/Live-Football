package com.applovin.exoplayer2.e.d;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.e.d.b;
import com.applovin.exoplayer2.l.aj;
import com.applovin.exoplayer2.l.q;
import com.huawei.openalliance.ad.constant.be;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f14195a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f14196b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f14197c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b a(String str) throws IOException {
        try {
            return b(str);
        } catch (ai | NumberFormatException | XmlPullParserException unused) {
            q.c("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static b b(String str) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (aj.b(newPullParser, "x:xmpmeta")) {
            s<b.a> g6 = s.g();
            long j10 = com.anythink.expressad.exoplayer.b.f7291b;
            do {
                newPullParser.next();
                if (aj.b(newPullParser, "rdf:Description")) {
                    if (!a(newPullParser)) {
                        return null;
                    }
                    j10 = b(newPullParser);
                    g6 = c(newPullParser);
                } else if (aj.b(newPullParser, "Container:Directory")) {
                    g6 = a(newPullParser, "Container", "Item");
                } else if (aj.b(newPullParser, "GContainer:Directory")) {
                    g6 = a(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!aj.a(newPullParser, "x:xmpmeta"));
            if (g6.isEmpty()) {
                return null;
            }
            return new b(j10, g6);
        }
        throw ai.b("Couldn't find xmp metadata", null);
    }

    private static s<b.a> c(XmlPullParser xmlPullParser) {
        for (String str : f14197c) {
            String c10 = aj.c(xmlPullParser, str);
            if (c10 != null) {
                return s.a(new b.a(be.V, "Primary", 0L, 0L), new b.a("video/mp4", "MotionPhoto", Long.parseLong(c10), 0L));
            }
        }
        return s.g();
    }

    private static boolean a(XmlPullParser xmlPullParser) {
        for (String str : f14195a) {
            String c10 = aj.c(xmlPullParser, str);
            if (c10 != null) {
                return Integer.parseInt(c10) == 1;
            }
        }
        return false;
    }

    private static s<b.a> a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        s.a i10 = s.i();
        String h10 = com.ironsource.adapters.facebook.a.h(str, ":Item");
        String h11 = com.ironsource.adapters.facebook.a.h(str, ":Directory");
        do {
            xmlPullParser.next();
            if (aj.b(xmlPullParser, h10)) {
                String h12 = com.ironsource.adapters.facebook.a.h(str2, ":Mime");
                String h13 = com.ironsource.adapters.facebook.a.h(str2, ":Semantic");
                String h14 = com.ironsource.adapters.facebook.a.h(str2, ":Length");
                String h15 = com.ironsource.adapters.facebook.a.h(str2, ":Padding");
                String c10 = aj.c(xmlPullParser, h12);
                String c11 = aj.c(xmlPullParser, h13);
                String c12 = aj.c(xmlPullParser, h14);
                String c13 = aj.c(xmlPullParser, h15);
                if (c10 != null && c11 != null) {
                    i10.a(new b.a(c10, c11, c12 != null ? Long.parseLong(c12) : 0L, c13 != null ? Long.parseLong(c13) : 0L));
                } else {
                    return s.g();
                }
            }
        } while (!aj.a(xmlPullParser, h11));
        return i10.a();
    }

    private static long b(XmlPullParser xmlPullParser) {
        for (String str : f14196b) {
            String c10 = aj.c(xmlPullParser, str);
            if (c10 != null) {
                long parseLong = Long.parseLong(c10);
                return parseLong == -1 ? com.anythink.expressad.exoplayer.b.f7291b : parseLong;
            }
        }
        return com.anythink.expressad.exoplayer.b.f7291b;
    }
}
