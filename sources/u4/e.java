package u4;

import j7.j0;
import j7.v1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u4.b;

/* compiled from: XmpMotionPhotoDescriptionParser.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f35777a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f35778b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f35779c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r9 == (-1)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static u4.b a(java.lang.String r23) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.e.a(java.lang.String):u4.b");
    }

    public static v1 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j10;
        long j11;
        j0.b bVar = j0.f30006t;
        j0.a aVar = new j0.a();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (d6.a.m(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String g6 = d6.a.g(xmlPullParser, concat3);
                String g10 = d6.a.g(xmlPullParser, concat4);
                String g11 = d6.a.g(xmlPullParser, concat5);
                String g12 = d6.a.g(xmlPullParser, concat6);
                if (g6 != null && g10 != null) {
                    if (g11 != null) {
                        j10 = Long.parseLong(g11);
                    } else {
                        j10 = 0;
                    }
                    if (g12 != null) {
                        j11 = Long.parseLong(g12);
                    } else {
                        j11 = 0;
                    }
                    aVar.b(new b.a(g6, j10, j11));
                } else {
                    return v1.f30113w;
                }
            }
        } while (!d6.a.k(xmlPullParser, concat2));
        return aVar.e();
    }
}
