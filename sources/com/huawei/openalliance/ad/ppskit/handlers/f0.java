package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecordV3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ka.n7;
import ka.u4;

/* loaded from: classes2.dex */
public final class f0 extends e0 {

    /* renamed from: d, reason: collision with root package name */
    public static f0 f22535d;

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f22536e = new byte[0];

    public f0(Context context) {
        super(context);
    }

    public static f0 E(Context context) {
        f0 f0Var;
        synchronized (f22536e) {
            if (f22535d == null) {
                f22535d = new f0(context);
            }
            f0Var = f22535d;
        }
        return f0Var;
    }

    @Override // com.huawei.openalliance.ad.ppskit.handlers.e0
    public final Class<? extends pa.a> B() {
        return ContentRecordV3.class;
    }

    public final void F(String str, String str2, String str3, String str4, String str5) {
        n7.c("ContentRecordV3Dao", "deleteContentByIds, pkgName = %s, contentId= %s, templateId= %s, slotId= %s, reason: %s", str, str2, str3, str4, str5);
        j(ContentRecordV3.class, 56, new String[]{str, str2, str3, str4});
        new p(this.f22513b).o(str, str2, str3, str5);
    }

    @Override // com.huawei.openalliance.ad.ppskit.handlers.e0, ka.h6
    public final ArrayList a(int i10) {
        Cursor cursor;
        Cursor rawQuery;
        String j10 = a3.l.j("SELECT ContentRecordV3.*,ContentTemplateRecord.assets From ContentRecordV3 INNER JOIN ContentTemplateRecord ON ContentRecordV3.adType = ", i10, " AND ContentTemplateRecord.contentId = ContentRecordV3.contentId AND ContentTemplateRecord.templateId = ContentRecordV3.templateId;");
        ArrayList arrayList = new ArrayList();
        u4 u4Var = null;
        try {
            u4 m10 = m();
            try {
                synchronized (m10) {
                    rawQuery = m10.getReadableDatabase().rawQuery(j10, null);
                }
                if (rawQuery != null) {
                    while (rawQuery.moveToNext()) {
                        try {
                            try {
                                pa.a aVar = (pa.a) ContentRecord.class.newInstance();
                                aVar.m(rawQuery);
                                arrayList.add(aVar);
                            } catch (Throwable th) {
                                n7.i("AdsDao", "query:" + th.getClass().getSimpleName());
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            u4Var = rawQuery;
                            cursor = u4Var;
                            u4Var = m10;
                            try {
                                n7.j("AdsDao", "query db exception: %s", th.getClass().getSimpleName());
                                return arrayList;
                            } finally {
                                f(cursor);
                                c0.g(u4Var);
                            }
                        }
                    }
                }
                f(rawQuery);
                c0.g(m10);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
        return arrayList;
    }

    @Override // com.huawei.openalliance.ad.ppskit.handlers.e0, ka.h6
    public final void b(ContentRecord contentRecord, ArrayList arrayList) {
        if (contentRecord == null) {
            return;
        }
        ContentValues l10 = contentRecord.l(this.f22513b);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l10.remove((String) it.next());
        }
        l(ContentRecordV3.class, l10, 56, new String[]{contentRecord.h1(), contentRecord.h(), contentRecord.Z0(), contentRecord.p2()});
    }

    @Override // com.huawei.openalliance.ad.ppskit.handlers.e0, ka.h6
    public final ContentRecord c(long j10, String str, String str2, String str3, String str4) {
        ArrayList h10 = h(ContentRecordV3.class, null, 60, new String[]{str, str2, str3, str4, String.valueOf(j10), String.valueOf(j10)}, "priority asc, displayCount asc, updateTime desc", String.valueOf(4));
        if (!androidx.transition.n.M(h10)) {
            return (ContentRecord) h10.get(0);
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.ppskit.handlers.e0
    public final ArrayList p(int i10, long j10) {
        HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
        return h(ContentRecordV3.class, new String[]{"appPkgName", "contentId", "slotId", "templateId"}, 19, new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)}, null, null);
    }

    @Override // com.huawei.openalliance.ad.ppskit.handlers.e0, ka.h6
    public final void a(String str, String str2, String str3, String str4) {
        F(str, str2, str3, str4, "media not valid");
    }
}
