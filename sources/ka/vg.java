package ka;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.vast.NonLinear;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ka.eh;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class vg implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f32030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f32031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yg f32032c;

    public vg(yg ygVar, ArrayList arrayList, XmlPullParser xmlPullParser) {
        this.f32032c = ygVar;
        this.f32030a = arrayList;
        this.f32031b = xmlPullParser;
    }

    @Override // ka.eh.a
    public final void a() {
        yg ygVar = this.f32032c;
        ygVar.getClass();
        XmlPullParser xmlPullParser = this.f32031b;
        NonLinear nonLinear = null;
        if (xmlPullParser != null) {
            xmlPullParser.require(2, null, "NonLinear");
            n7.e("BaseNonLinearParser", "readNonLinear");
            NonLinear nonLinear2 = new NonLinear();
            nonLinear2.c(xmlPullParser.getAttributeValue(null, "id"));
            String attributeValue = xmlPullParser.getAttributeValue(null, ContentRecord.HEIGHT);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, ContentRecord.WIDTH);
            if (!TextUtils.isEmpty(attributeValue2) && !TextUtils.isEmpty(attributeValue)) {
                nonLinear2.a(com.huawei.openalliance.ad.ppskit.utils.y1.q(attributeValue).intValue());
                nonLinear2.e(com.huawei.openalliance.ad.ppskit.utils.y1.q(attributeValue2).intValue());
                HashMap hashMap = new HashMap();
                for (String str : yg.f32232a) {
                    hashMap.put(str, new kh(str, nonLinear2, xmlPullParser));
                }
                ArrayList arrayList = new ArrayList();
                ygVar.b();
                eh.e(Collections.emptyList(), hashMap, xmlPullParser);
                nonLinear2.g(arrayList);
                if (n7.d()) {
                    n7.c("BaseNonLinearParser", "readNonlinear finish, nonLinear: %s", com.huawei.openalliance.ad.ppskit.utils.y0.q(null, nonLinear2));
                }
                nonLinear = nonLinear2;
            } else {
                n7.g("BaseNonLinearParser", "missing required attribute.");
            }
        }
        this.f32030a.add(nonLinear);
    }
}
