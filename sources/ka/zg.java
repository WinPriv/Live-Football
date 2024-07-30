package ka;

import com.huawei.openalliance.ad.ppskit.beans.vast.Vast;
import com.huawei.openalliance.ad.ppskit.beans.vast.VastContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ka.eh;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public abstract class zg {

    /* loaded from: classes2.dex */
    public static class a implements eh.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f32265a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f32266b;

        public a(ArrayList arrayList, XmlPullParser xmlPullParser) {
            this.f32265a = arrayList;
            this.f32266b = xmlPullParser;
        }

        @Override // ka.eh.a
        public final void a() {
            XmlPullParser xmlPullParser = this.f32266b;
            xmlPullParser.require(2, null, "Ad");
            VastContent vastContent = new VastContent();
            vastContent.c(xmlPullParser.getAttributeValue(null, "id"));
            ((zg) fh.f31192b.get(fh.f31191a)).b();
            HashMap hashMap = new HashMap();
            hashMap.put("InLine", new b(xmlPullParser, vastContent));
            hashMap.put("Wrapper", new c(xmlPullParser, vastContent));
            try {
                eh.e(Collections.emptyList(), hashMap, xmlPullParser);
            } catch (Throwable th) {
                n7.h("BaseVastParser", "attribute format error: %s", th.getClass().getSimpleName());
            }
            this.f32265a.add(vastContent);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements eh.a {

        /* renamed from: a, reason: collision with root package name */
        public final XmlPullParser f32267a;

        /* renamed from: b, reason: collision with root package name */
        public final VastContent f32268b;

        public b(XmlPullParser xmlPullParser, VastContent vastContent) {
            this.f32267a = xmlPullParser;
            this.f32268b = vastContent;
        }

        @Override // ka.eh.a
        public final void a() {
            XmlPullParser xmlPullParser;
            VastContent vastContent = this.f32268b;
            if (vastContent != null && (xmlPullParser = this.f32267a) != null) {
                n7.f("BaseVastParser", "read inline, %s", vastContent.b());
                eh.d(xmlPullParser, vastContent, "InLine", eh.f31145a);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements eh.a {

        /* renamed from: a, reason: collision with root package name */
        public final XmlPullParser f32269a;

        /* renamed from: b, reason: collision with root package name */
        public final VastContent f32270b;

        public c(XmlPullParser xmlPullParser, VastContent vastContent) {
            this.f32269a = xmlPullParser;
            this.f32270b = vastContent;
        }

        @Override // ka.eh.a
        public final void a() {
            XmlPullParser xmlPullParser;
            VastContent vastContent = this.f32270b;
            if (vastContent != null && (xmlPullParser = this.f32269a) != null) {
                n7.f("BaseVastParser", "read warpper, %s.", vastContent.b());
                eh.d(xmlPullParser, vastContent, "Wrapper", eh.f31146b);
            }
        }
    }

    public static Vast c(XmlPullParser xmlPullParser) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        hashMap.put("Ad", new a(arrayList, xmlPullParser));
        eh.e(Collections.emptyList(), hashMap, xmlPullParser);
        return new Vast(arrayList);
    }

    public abstract List<VastContent> a(XmlPullParser xmlPullParser);

    public abstract void b();
}
