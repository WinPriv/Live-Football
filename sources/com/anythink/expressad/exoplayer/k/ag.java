package com.anythink.expressad.exoplayer.k;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ag {
    private ag() {
    }

    private static boolean a(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    private static boolean b(XmlPullParser xmlPullParser, String str) {
        return b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    private static boolean c(XmlPullParser xmlPullParser, String str) {
        if (b(xmlPullParser) && a(xmlPullParser.getName()).equals(str)) {
            return true;
        }
        return false;
    }

    private static String d(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    private static String e(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (a(xmlPullParser.getAttributeName(i10)).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    private static String a(String str) {
        int indexOf = str.indexOf(58);
        return indexOf == -1 ? str : str.substring(indexOf + 1);
    }

    private static boolean b(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    private static boolean a(XmlPullParser xmlPullParser, String str) {
        return (xmlPullParser.getEventType() == 3) && xmlPullParser.getName().equals(str);
    }
}
