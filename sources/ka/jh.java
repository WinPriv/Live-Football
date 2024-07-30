package ka;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.vast.Impression;
import com.huawei.openalliance.ad.ppskit.beans.vast.VastContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import ka.eh;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class jh implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f31345a;

    /* renamed from: b, reason: collision with root package name */
    public final VastContent f31346b;

    /* renamed from: c, reason: collision with root package name */
    public final XmlPullParser f31347c;

    public jh(String str, VastContent vastContent, XmlPullParser xmlPullParser) {
        this.f31345a = str;
        this.f31346b = vastContent;
        this.f31347c = xmlPullParser;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // ka.eh.a
    public final void a() {
        VastContent vastContent;
        char c10;
        XmlPullParser xmlPullParser = this.f31347c;
        if (xmlPullParser != null && (vastContent = this.f31346b) != null) {
            String str = this.f31345a;
            if (!TextUtils.isEmpty(str)) {
                if (n7.d()) {
                    n7.c("InlineHandle", "handle: %s", str);
                }
                str.getClass();
                switch (str.hashCode()) {
                    case -1692490108:
                        if (str.equals("Creatives")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1633884078:
                        if (str.equals("AdSystem")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -56677412:
                        if (str.equals("Description")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 501930965:
                        if (str.equals("AdTitle")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2065545547:
                        if (str.equals("Advertiser")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2114088489:
                        if (str.equals("Impression")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    if (c10 != 5) {
                                        n7.f("InlineHandle", "unsupported tag: %s", str);
                                        return;
                                    } else {
                                        vastContent.a(new Impression(xmlPullParser.getAttributeValue(null, "id"), eh.a(xmlPullParser)));
                                        return;
                                    }
                                }
                                vastContent.l(eh.a(xmlPullParser));
                                return;
                            }
                            vastContent.h(eh.a(xmlPullParser));
                            return;
                        }
                        vastContent.j(eh.a(xmlPullParser));
                        return;
                    }
                    String attributeValue = xmlPullParser.getAttributeValue(null, "version");
                    vastContent.e(eh.a(xmlPullParser));
                    vastContent.f(attributeValue);
                    return;
                }
                n7.e("ParseUtil", "read creatives");
                xmlPullParser.require(2, null, "Creatives");
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                hashMap.put("Creative", new ih(vastContent, xmlPullParser, arrayList));
                eh.e(Collections.singletonList("Creative"), hashMap, xmlPullParser);
                vastContent.d(arrayList);
            }
        }
    }
}
