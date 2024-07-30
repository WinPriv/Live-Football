package ka;

import com.huawei.openalliance.ad.ppskit.beans.vast.Tracking;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ka.eh;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class xg implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f32198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f32199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yg f32200c;

    public xg(yg ygVar, XmlPullParser xmlPullParser, HashMap hashMap) {
        this.f32200c = ygVar;
        this.f32198a = xmlPullParser;
        this.f32199b = hashMap;
    }

    @Override // ka.eh.a
    public final void a() {
        XmlPullParser xmlPullParser = this.f32198a;
        String attributeValue = xmlPullParser.getAttributeValue(null, "event");
        String a10 = eh.a(xmlPullParser);
        if (this.f32200c.a().contains(attributeValue)) {
            Map map = this.f32199b;
            if (map.get(attributeValue) == null) {
                map.put(attributeValue, new ArrayList());
            }
            ((List) map.get(attributeValue)).add(new Tracking(a10, attributeValue));
        }
    }
}
