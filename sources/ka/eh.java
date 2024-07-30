package ka;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.vast.StaticResource;
import com.huawei.openalliance.ad.ppskit.beans.vast.VastContent;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class eh {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f31145a = Arrays.asList("AdSystem", "AdTitle", "Advertiser", "Description", "Impression", "Creatives");

    /* renamed from: b, reason: collision with root package name */
    public static final List<String> f31146b = Arrays.asList("AdSystem", "AdTitle", "Advertiser", "Description", "Impression", "Creatives");

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public static String a(XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) {
            return null;
        }
        if (xmlPullParser.next() == 4) {
            String trim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
            return trim;
        }
        return "";
    }

    public static String b(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (com.huawei.openalliance.ad.ppskit.utils.y1.h(attributeValue)) {
            n7.h("ParseUtil", "missing required attribute: %s ", str);
            return null;
        }
        return attributeValue;
    }

    public static SimpleDateFormat c(boolean z10) {
        SimpleDateFormat simpleDateFormat;
        if (z10) {
            simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.ENGLISH);
        } else {
            simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        }
        simpleDateFormat.setTimeZone(oa.a.f33784a);
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static void d(XmlPullParser xmlPullParser, VastContent vastContent, String str, List<String> list) {
        if (xmlPullParser != null && vastContent != null) {
            xmlPullParser.require(2, null, str);
            HashMap hashMap = new HashMap();
            for (String str2 : f31145a) {
                hashMap.put(str2, new jh(str2, vastContent, xmlPullParser));
            }
            e(list, hashMap, xmlPullParser);
        }
    }

    public static void e(List list, HashMap hashMap, XmlPullParser xmlPullParser) {
        if (xmlPullParser != null && list != null) {
            ArrayList arrayList = new ArrayList(list);
            while (xmlPullParser.next() != 3) {
                int i10 = 1;
                if (xmlPullParser.getEventType() != 1) {
                    if (xmlPullParser.getEventType() == 2) {
                        String name = xmlPullParser.getName();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext() && !((String) it.next()).equalsIgnoreCase(name)) {
                        }
                        if (hashMap.containsKey(name)) {
                            a aVar = (a) hashMap.get(name);
                            if (aVar != null) {
                                aVar.a();
                            }
                        } else if (xmlPullParser.getEventType() == 2) {
                            while (i10 != 0) {
                                int next = xmlPullParser.next();
                                if (next != 2) {
                                    if (next == 3) {
                                        i10--;
                                    }
                                } else {
                                    i10++;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public static StaticResource f(XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) {
            return null;
        }
        n7.b("ParseUtil", "start read static resource");
        StaticResource staticResource = new StaticResource();
        staticResource.b(b(xmlPullParser, ContentRecord.CREATIVE_TYPE));
        staticResource.d(a(xmlPullParser));
        n7.b("ParseUtil", "read static resource finish");
        return staticResource;
    }
}
