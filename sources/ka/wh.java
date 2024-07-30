package ka;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;
import ka.hg;

/* loaded from: classes2.dex */
public final class wh implements hg.a {

    /* renamed from: a, reason: collision with root package name */
    public final EventRecord f32146a;

    public wh(EventRecord eventRecord) {
        this.f32146a = eventRecord;
    }

    @Override // ka.hg.a
    public final String a(String str) {
        EventRecord eventRecord;
        boolean z10;
        if (!TextUtils.isEmpty(str) && (eventRecord = this.f32146a) != null) {
            if (!"click".equals(eventRecord.i())) {
                n7.c("appsFlyer", "event type not match %s", eventRecord.i());
                return str;
            }
            String F0 = eventRecord.F0();
            if (!"app".equals(F0) && !com.huawei.openalliance.ad.constant.v.Z.equals(F0) && !"download".equals(F0)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                n7.c("appsFlyer", "click destination not match app or harmonyApp or download, is %s", F0);
                return str;
            }
            if (str.indexOf("af_engagement_type") == -1) {
                n7.b("appsFlyer", "af key not exist");
                return str;
            }
            if (str.indexOf("click_to_store") == -1) {
                n7.b("appsFlyer", "af value replacement not exist");
                return str;
            }
            return str.replace("click_to_store", "click_to_download");
        }
        n7.b("appsFlyer", "invalid para");
        return str;
    }
}
