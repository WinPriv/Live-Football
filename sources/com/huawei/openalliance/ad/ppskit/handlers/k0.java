package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.OaidRecord;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import ka.n7;

/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: c, reason: collision with root package name */
    public static k0 f22579c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f22580d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f22581a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22582b = new byte[0];

    public k0(Context context) {
        this.f22581a = context.createDeviceProtectedStorageContext().getSharedPreferences("HiAd_OaidRecords", 0);
    }

    public final OaidRecord a(String str) {
        n7.c("OaidRecordSpHandler", "getOaidRecord, key:%s", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f22582b) {
            String string = this.f22581a.getString(str, "");
            if (TextUtils.isEmpty(string)) {
                n7.g("OaidRecordSpHandler", "oaid record do not exist for: " + str);
                return null;
            }
            return (OaidRecord) y0.o(null, string, OaidRecord.class, new Class[0]);
        }
    }

    public final void b(String str, OaidRecord oaidRecord) {
        n7.c("OaidRecordSpHandler", "saveOaidRecord, key:%s", str);
        if (!TextUtils.isEmpty(str)) {
            String q10 = y0.q(null, oaidRecord);
            if (TextUtils.isEmpty(q10)) {
                n7.g("OaidRecordSpHandler", "oaid record is null");
                return;
            }
            synchronized (this.f22582b) {
                SharedPreferences.Editor edit = this.f22581a.edit();
                edit.putString(str, q10);
                edit.commit();
            }
        }
    }
}
