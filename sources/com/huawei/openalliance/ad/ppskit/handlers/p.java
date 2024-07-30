package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.MgtApkInfo;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentTemplateRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.MgtCertRecord;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.n6;
import ka.n7;

/* loaded from: classes2.dex */
public final class p extends z implements n6 {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f22613c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f22614d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f22615e = new byte[0];

    public /* synthetic */ p(Context context) {
        super(context);
    }

    public ContentTemplateRecord n(String str, String str2, String str3) {
        ArrayList h10 = h(ContentTemplateRecord.class, null, 57, new String[]{str, str2, str3}, null, null);
        if (!h10.isEmpty()) {
            return (ContentTemplateRecord) h10.get(0);
        }
        return null;
    }

    public void o(String str, String str2, String str3, String str4) {
        n7.f("ContentTemplateRecordDao", "deleteContentByIds ids: %s %s, reason: %s", str2, str3, str4);
        j(ContentTemplateRecord.class, 57, new String[]{str, str2, str3});
    }

    public void p(List list) {
        n7.e("MgtCertRecordDao", "insertContents");
        if (androidx.transition.n.M(list)) {
            n7.e("MgtCertRecordDao", "insertContents, apkInfos is null, delete all");
            j(MgtCertRecord.class, 0, null);
            return;
        }
        synchronized (f22615e) {
            j(MgtCertRecord.class, 0, null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MgtApkInfo mgtApkInfo = (MgtApkInfo) it.next();
                if (mgtApkInfo != null && !y1.h(mgtApkInfo.a()) && !androidx.transition.n.M(mgtApkInfo.b())) {
                    d(MgtCertRecord.class, new MgtCertRecord(mgtApkInfo.a(), mgtApkInfo.b()).l(this.f22513b));
                }
            }
        }
    }
}
