package ka;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.vast.NonLinear;
import ka.eh;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class kh implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f31395a;

    /* renamed from: b, reason: collision with root package name */
    public final XmlPullParser f31396b;

    /* renamed from: c, reason: collision with root package name */
    public final NonLinear f31397c;

    public kh(String str, NonLinear nonLinear, XmlPullParser xmlPullParser) {
        this.f31395a = str;
        this.f31397c = nonLinear;
        this.f31396b = xmlPullParser;
    }

    @Override // ka.eh.a
    public final void a() {
        XmlPullParser xmlPullParser;
        NonLinear nonLinear = this.f31397c;
        if (nonLinear != null && (xmlPullParser = this.f31396b) != null) {
            String str = this.f31395a;
            if (!TextUtils.isEmpty(str)) {
                n7.f("NonLinearTagHandle", "handle: %s", str);
                str.getClass();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -375340334:
                        if (str.equals("IFrameResource")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 482633071:
                        if (str.equals("NonLinearClickThrough")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 676623548:
                        if (str.equals("StaticResource")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1928285401:
                        if (str.equals("HTMLResource")) {
                            c10 = 3;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        nonLinear.f(eh.a(xmlPullParser));
                        return;
                    case 1:
                        nonLinear.i(eh.a(xmlPullParser));
                        return;
                    case 2:
                        nonLinear.b(eh.f(xmlPullParser));
                        return;
                    case 3:
                        nonLinear.h(eh.a(xmlPullParser));
                        return;
                    default:
                        n7.f("NonLinearTagHandle", "unsupported tag: %s", str);
                        return;
                }
            }
        }
    }
}
