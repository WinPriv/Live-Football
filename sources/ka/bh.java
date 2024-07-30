package ka;

import com.huawei.openalliance.ad.constant.cp;
import com.huawei.openalliance.ad.ppskit.beans.vast.LinearCreative;
import com.huawei.openalliance.ad.ppskit.beans.vast.VastIcon;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import ka.eh;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class bh extends ug {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f30998a = new HashSet(Arrays.asList("creativeView", "start", cp.V, "midpoint", cp.Z, "complete", "mute", "unmute", com.anythink.expressad.foundation.d.c.f9459cb, "resume", "closeLinear", cp.F, "progress"));

    /* loaded from: classes2.dex */
    public static class a implements eh.a {

        /* renamed from: a, reason: collision with root package name */
        public final LinearCreative f30999a;

        /* renamed from: b, reason: collision with root package name */
        public final XmlPullParser f31000b;

        public a(LinearCreative linearCreative, XmlPullParser xmlPullParser) {
            this.f30999a = linearCreative;
            this.f31000b = xmlPullParser;
        }

        @Override // ka.eh.a
        public final void a() {
            LinearCreative linearCreative = this.f30999a;
            if (linearCreative != null) {
                XmlPullParser xmlPullParser = this.f31000b;
                ArrayList arrayList = null;
                if (xmlPullParser != null) {
                    n7.b("Linear30Parser", "start read icons");
                    xmlPullParser.require(2, null, "Icons");
                    arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    hashMap.put("Icon", new b(arrayList, xmlPullParser));
                    eh.e(Collections.emptyList(), hashMap, xmlPullParser);
                    n7.b("Linear30Parser", "read icons finish");
                }
                linearCreative.g(arrayList);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements eh.a {

        /* renamed from: a, reason: collision with root package name */
        public final List<VastIcon> f31001a;

        /* renamed from: b, reason: collision with root package name */
        public final XmlPullParser f31002b;

        /* loaded from: classes2.dex */
        public static class a implements eh.a {

            /* renamed from: a, reason: collision with root package name */
            public final VastIcon f31003a;

            /* renamed from: b, reason: collision with root package name */
            public final XmlPullParser f31004b;

            public a(VastIcon vastIcon, XmlPullParser xmlPullParser) {
                this.f31003a = vastIcon;
                this.f31004b = xmlPullParser;
            }

            @Override // ka.eh.a
            public final void a() {
                VastIcon vastIcon = this.f31003a;
                if (vastIcon != null) {
                    vastIcon.j(eh.a(this.f31004b));
                }
            }
        }

        /* renamed from: ka.bh$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0421b implements eh.a {

            /* renamed from: a, reason: collision with root package name */
            public final VastIcon f31005a;

            /* renamed from: b, reason: collision with root package name */
            public final XmlPullParser f31006b;

            public C0421b(VastIcon vastIcon, XmlPullParser xmlPullParser) {
                this.f31005a = vastIcon;
                this.f31006b = xmlPullParser;
            }

            @Override // ka.eh.a
            public final void a() {
                VastIcon vastIcon = this.f31005a;
                if (vastIcon != null) {
                    vastIcon.i(eh.a(this.f31006b));
                }
            }
        }

        /* loaded from: classes2.dex */
        public static class c implements eh.a {

            /* renamed from: a, reason: collision with root package name */
            public final VastIcon f31007a;

            /* renamed from: b, reason: collision with root package name */
            public final XmlPullParser f31008b;

            public c(VastIcon vastIcon, XmlPullParser xmlPullParser) {
                this.f31007a = vastIcon;
                this.f31008b = xmlPullParser;
            }

            @Override // ka.eh.a
            public final void a() {
                VastIcon vastIcon = this.f31007a;
                if (vastIcon != null) {
                    vastIcon.b(eh.f(this.f31008b));
                }
            }
        }

        public b(ArrayList arrayList, XmlPullParser xmlPullParser) {
            this.f31001a = arrayList;
            this.f31002b = xmlPullParser;
        }

        @Override // ka.eh.a
        public final void a() {
            List<VastIcon> list = this.f31001a;
            if (list != null) {
                XmlPullParser xmlPullParser = this.f31002b;
                VastIcon vastIcon = null;
                if (xmlPullParser != null) {
                    n7.b("Linear30Parser", "start read icon");
                    xmlPullParser.require(2, null, "Icon");
                    VastIcon vastIcon2 = new VastIcon();
                    String attributeValue = xmlPullParser.getAttributeValue(null, "program");
                    if (attributeValue != null) {
                        vastIcon2.c(attributeValue);
                    }
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, ContentRecord.WIDTH);
                    String attributeValue3 = xmlPullParser.getAttributeValue(null, ContentRecord.HEIGHT);
                    if (attributeValue2 != null && attributeValue3 != null) {
                        vastIcon2.e(Integer.parseInt(attributeValue2));
                        vastIcon2.a(Integer.parseInt(attributeValue3));
                        vastIcon2.f(eh.b(xmlPullParser, "xPosition"));
                        vastIcon2.h(eh.b(xmlPullParser, "yPosition"));
                        HashMap hashMap = new HashMap();
                        hashMap.put("StaticResource", new c(vastIcon2, xmlPullParser));
                        hashMap.put("IFrameResource", new C0421b(vastIcon2, xmlPullParser));
                        hashMap.put("HTMLResource", new a(vastIcon2, xmlPullParser));
                        eh.e(Collections.emptyList(), hashMap, xmlPullParser);
                        n7.c("Linear30Parser", "read icon finish, icon: %s", vastIcon2);
                        vastIcon = vastIcon2;
                    } else {
                        n7.g("Linear30Parser", "icon width or height is missing.");
                    }
                }
                list.add(vastIcon);
            }
        }
    }

    @Override // ka.ug
    public final HashSet a() {
        return this.f30998a;
    }

    @Override // ka.ug
    public final void b(LinearCreative linearCreative, XmlPullParser xmlPullParser, HashMap hashMap) {
        hashMap.put("Icons", new a(linearCreative, xmlPullParser));
    }
}
