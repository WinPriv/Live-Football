package d6;

import android.media.MediaFormat;
import android.net.Uri;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Assertions.java */
/* loaded from: classes2.dex */
public final class a {
    @Pure
    public static void a(boolean z10) {
        if (z10) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    public static void b(boolean z10, String str) {
        if (z10) {
        } else {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    @Pure
    public static void c(int i10, int i11) {
        if (i10 >= 0 && i10 < i11) {
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Pure
    public static void d(boolean z10) {
        if (z10) {
        } else {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static void e(Object obj) {
        if (obj != null) {
        } else {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static void f(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static String g(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0195, code lost:
    
        if (r0.equals("video/mp2t") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int h(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.a.h(java.lang.String):int");
    }

    public static int i(Map map) {
        String str;
        List list = (List) map.get("Content-Type");
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
        } else {
            str = null;
        }
        return h(str);
    }

    public static int j(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                    if (!lastPathSegment.endsWith(".avi")) {
                                                        return -1;
                                                    }
                                                    return 16;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }

    public static boolean k(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        boolean z10;
        if (xmlPullParser.getEventType() == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean l(XmlPullParser xmlPullParser) throws XmlPullParserException {
        if (xmlPullParser.getEventType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean m(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (l(xmlPullParser) && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static void n(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void o(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(a3.l.i("csd-", i10), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }
}
