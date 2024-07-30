package ka;

import com.huawei.openalliance.ad.ppskit.beans.vast.Creative;
import com.huawei.openalliance.ad.ppskit.beans.vast.LinearCreative;
import com.huawei.openalliance.ad.ppskit.beans.vast.NonLinearAds;
import com.huawei.openalliance.ad.ppskit.beans.vast.VastContent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ka.eh;
import ka.ug;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class ih implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final VastContent f31299a;

    /* renamed from: b, reason: collision with root package name */
    public final XmlPullParser f31300b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Creative> f31301c;

    /* loaded from: classes2.dex */
    public static class a implements eh.a {

        /* renamed from: a, reason: collision with root package name */
        public final XmlPullParser f31302a;

        /* renamed from: b, reason: collision with root package name */
        public final Creative f31303b;

        /* renamed from: c, reason: collision with root package name */
        public final VastContent f31304c;

        public a(XmlPullParser xmlPullParser, VastContent vastContent, Creative creative) {
            this.f31302a = xmlPullParser;
            this.f31304c = vastContent;
            this.f31303b = creative;
        }

        @Override // ka.eh.a
        public final void a() {
            VastContent vastContent;
            List asList;
            Creative creative = this.f31303b;
            if (creative == null) {
                return;
            }
            LinearCreative linearCreative = new LinearCreative();
            ug ugVar = (ug) fh.f31193c.get(fh.f31191a);
            ugVar.getClass();
            XmlPullParser xmlPullParser = this.f31302a;
            if (xmlPullParser != null && (vastContent = this.f31304c) != null) {
                n7.b("BaseLinearParser", "start read linear creative");
                xmlPullParser.require(2, null, "Linear");
                HashMap hashMap = new HashMap();
                hashMap.put("Duration", new ug.a(linearCreative, xmlPullParser));
                hashMap.put("MediaFiles", new ug.d(linearCreative, xmlPullParser));
                hashMap.put("VideoClicks", new ug.f(linearCreative, xmlPullParser));
                hashMap.put("TrackingEvents", new ug.c(linearCreative, xmlPullParser));
                ugVar.b(linearCreative, xmlPullParser, hashMap);
                if (vastContent.o().booleanValue()) {
                    asList = Collections.emptyList();
                } else {
                    asList = Arrays.asList("Duration", "MediaFiles");
                }
                eh.e(asList, hashMap, xmlPullParser);
                n7.b("BaseLinearParser", "read linear creative finish");
            }
            creative.a(linearCreative);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements eh.a {

        /* renamed from: a, reason: collision with root package name */
        public final XmlPullParser f31305a;

        /* renamed from: b, reason: collision with root package name */
        public final Creative f31306b;

        public b(XmlPullParser xmlPullParser, Creative creative) {
            this.f31305a = xmlPullParser;
            this.f31306b = creative;
        }

        @Override // ka.eh.a
        public final void a() {
            Creative creative = this.f31306b;
            if (creative == null) {
                return;
            }
            NonLinearAds nonLinearAds = new NonLinearAds();
            yg ygVar = (yg) fh.f31194d.get(fh.f31191a);
            ygVar.getClass();
            XmlPullParser xmlPullParser = this.f31305a;
            if (xmlPullParser != null) {
                n7.e("BaseNonLinearParser", "read nonlinearAds start");
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                hashMap.put("NonLinear", new vg(ygVar, arrayList, xmlPullParser));
                hashMap.put("TrackingEvents", new wg(ygVar, nonLinearAds, xmlPullParser));
                eh.e(Collections.singletonList("NonLinear"), hashMap, xmlPullParser);
                n7.c("BaseNonLinearParser", "nonLinearAds setNonLinears: %s", com.huawei.openalliance.ad.ppskit.utils.y0.q(null, arrayList));
                nonLinearAds.a(arrayList);
            }
            creative.b(nonLinearAds);
        }
    }

    public ih(VastContent vastContent, XmlPullParser xmlPullParser, ArrayList arrayList) {
        this.f31299a = vastContent;
        this.f31300b = xmlPullParser;
        this.f31301c = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ka.eh.a
    public final void a() {
        VastContent vastContent;
        List<Creative> list = this.f31301c;
        if (list != null) {
            XmlPullParser xmlPullParser = this.f31300b;
            Integer num = null;
            if (xmlPullParser != null && (vastContent = this.f31299a) != null) {
                n7.c("CreativeTagHandle", "start read creative, ad id: %s", vastContent.b());
                xmlPullParser.require(2, null, "Creative");
                String attributeValue = xmlPullParser.getAttributeValue(null, "AdID");
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "id");
                if (attributeValue2 == null) {
                    attributeValue2 = a0.a.l0();
                }
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "sequence");
                if (attributeValue3 != null) {
                    num = Integer.valueOf(attributeValue3);
                }
                Creative creative = new Creative(attributeValue2, num, attributeValue);
                HashMap hashMap = new HashMap();
                hashMap.put("Linear", new a(xmlPullParser, vastContent, creative));
                hashMap.put("NonLinearAds", new b(xmlPullParser, creative));
                eh.e(Arrays.asList("Linear", "NonLinearAds"), hashMap, xmlPullParser);
                num = creative;
            }
            list.add(num);
        }
    }
}
