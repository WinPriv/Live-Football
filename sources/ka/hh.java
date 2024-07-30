package ka;

import com.huawei.openalliance.ad.ppskit.beans.vast.VastContent;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class hh extends zg {
    @Override // ka.zg
    public final List<VastContent> a(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        try {
            return zg.c(xmlPullParser).a();
        } catch (Throwable th) {
            n7.h("Vast30Parser", "read vast content error: %s", th.getClass().getSimpleName());
            return arrayList;
        }
    }

    @Override // ka.zg
    public final void b() {
    }
}
