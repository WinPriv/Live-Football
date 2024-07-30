package ka;

import com.huawei.openalliance.ad.ppskit.beans.vast.NonLinearAds;
import java.util.Collections;
import java.util.HashMap;
import ka.eh;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class wg implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NonLinearAds f32143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f32144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yg f32145c;

    public wg(yg ygVar, NonLinearAds nonLinearAds, XmlPullParser xmlPullParser) {
        this.f32145c = ygVar;
        this.f32143a = nonLinearAds;
        this.f32144b = xmlPullParser;
    }

    @Override // ka.eh.a
    public final void a() {
        yg ygVar = this.f32145c;
        ygVar.getClass();
        XmlPullParser xmlPullParser = this.f32144b;
        HashMap hashMap = null;
        if (xmlPullParser != null) {
            n7.e("BaseNonLinearParser", "start read tracking events");
            xmlPullParser.require(2, null, "TrackingEvents");
            hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("Tracking", new xg(ygVar, xmlPullParser, hashMap));
            eh.e(Collections.emptyList(), hashMap2, xmlPullParser);
            if (n7.d()) {
                n7.c("BaseNonLinearParser", "read tracking events finish, trackingEvents: %s", hashMap);
            }
        }
        this.f32143a.b(hashMap);
    }
}
