package e0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import com.huawei.openalliance.ad.constant.ag;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FontResourcesParserCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final C0365d[] f27621a;

        public c(C0365d[] c0365dArr) {
            this.f27621a = c0365dArr;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: e0.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0365d {

        /* renamed from: a, reason: collision with root package name */
        public final String f27622a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27623b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f27624c;

        /* renamed from: d, reason: collision with root package name */
        public final String f27625d;

        /* renamed from: e, reason: collision with root package name */
        public final int f27626e;
        public final int f;

        public C0365d(int i10, int i11, int i12, String str, String str2, boolean z10) {
            this.f27622a = str;
            this.f27623b = i10;
            this.f27624c = z10;
            this.f27625d = str2;
            this.f27626e = i11;
            this.f = i12;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final k0.f f27627a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27628b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27629c;

        /* renamed from: d, reason: collision with root package name */
        public final String f27630d;

        public e(k0.f fVar, int i10, int i11, String str) {
            this.f27627a = fVar;
            this.f27629c = i10;
            this.f27628b = i11;
            this.f27630d = str;
        }
    }

    public static b a(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        int i10;
        boolean z10;
        int i11;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), a0.a.f24t);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        c(xmlResourceParser);
                    }
                    return new e(new k0.f(string, string2, string3, b(resources, resourceId)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), a0.a.f26u);
                            int i12 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i12 = 1;
                            }
                            int i13 = obtainAttributes2.getInt(i12, ag.f21998i);
                            if (obtainAttributes2.hasValue(6)) {
                                i10 = 6;
                            } else {
                                i10 = 2;
                            }
                            if (1 == obtainAttributes2.getInt(i10, 0)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int i14 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i14 = 3;
                            }
                            int i15 = 7;
                            if (!obtainAttributes2.hasValue(7)) {
                                i15 = 4;
                            }
                            String string5 = obtainAttributes2.getString(i15);
                            int i16 = obtainAttributes2.getInt(i14, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                i11 = 5;
                            } else {
                                i11 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i11, 0);
                            String string6 = obtainAttributes2.getString(i11);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                c(xmlResourceParser);
                            }
                            arrayList.add(new C0365d(i13, i16, resourceId2, string6, string5, z10));
                        } else {
                            c(xmlResourceParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new c((C0365d[]) arrayList.toArray(new C0365d[0]));
                }
            } else {
                c(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a.a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlResourceParser.next();
            if (next != 2) {
                if (next == 3) {
                    i10--;
                }
            } else {
                i10++;
            }
        }
    }
}
