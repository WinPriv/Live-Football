package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.SlotTemplate;
import com.huawei.openalliance.ad.ppskit.beans.metadata.SlotTemplateRsp;
import com.huawei.openalliance.ad.ppskit.beans.metadata.TemplateConfig;
import com.huawei.openalliance.ad.ppskit.db.bean.TemplateStyleRecord;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ka.n7;
import ka.q6;
import ka.u4;

/* loaded from: classes2.dex */
public final class q extends z implements q6 {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f22616c = new byte[0];

    public q(Context context) {
        super(context);
    }

    public static boolean s(String str, Map map) {
        n7.c("TemplateConfigDao", "tag: %s, unsupportedTags： %s", str, map);
        Map map2 = (Map) y0.o(null, str, Map.class, Integer.class);
        if (a0.a.e0(map2)) {
            n7.b("TemplateConfigDao", "tag is null");
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            n7.c("TemplateConfigDao", "unsupportedTag: %s, templateTags: %s", entry, map2);
            Integer num = (Integer) entry.getValue();
            if (num != null && num.intValue() >= -1 && num.intValue() <= 9) {
                if (num.intValue() == -1) {
                    return true;
                }
                if (map2.containsKey(entry.getKey()) && num.equals(map2.get(entry.getKey()))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ArrayList n(Map map, int i10, String str) {
        boolean z10;
        ArrayList<TemplateStyleRecord> h10;
        u4 u4Var;
        Cursor rawQuery;
        Cursor cursor = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (a0.a.e0(map)) {
            n7.b("TemplateConfigDao", "unsupportedTags is empty");
            String str2 = "SELECT templateId FROM TemplateStyleRecord WHERE slotId = \"" + str + "\" and tmpType = " + i10 + com.huawei.openalliance.ad.constant.w.aG;
            arrayList = new ArrayList();
            try {
                u4Var = m();
                try {
                    synchronized (u4Var) {
                        rawQuery = u4Var.getReadableDatabase().rawQuery(str2, null);
                    }
                    if (rawQuery != null) {
                        while (rawQuery.moveToNext()) {
                            try {
                                try {
                                    arrayList.add(rawQuery.getString(rawQuery.getColumnIndex("templateId")));
                                } catch (Exception unused) {
                                    n7.i("AdsDao", "query exception");
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor = rawQuery;
                                try {
                                    n7.j("AdsDao", "query db exception: %s", th.getClass().getSimpleName());
                                    f(cursor);
                                    c0.g(u4Var);
                                    return arrayList;
                                } catch (Throwable th2) {
                                    f(cursor);
                                    c0.g(u4Var);
                                    throw th2;
                                }
                            }
                        }
                    }
                    f(rawQuery);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                u4Var = null;
            }
            c0.g(u4Var);
        } else {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                h10 = h(TemplateStyleRecord.class, null, 53, new String[]{str}, null, null);
            } else {
                h10 = h(TemplateStyleRecord.class, null, 52, new String[]{str}, null, null);
            }
            if (!androidx.transition.n.M(h10)) {
                for (TemplateStyleRecord templateStyleRecord : h10) {
                    if (templateStyleRecord != null && !s(templateStyleRecord.E(), map) && !TextUtils.isEmpty(templateStyleRecord.c())) {
                        arrayList.add(templateStyleRecord.c());
                    }
                }
            }
        }
        return arrayList;
    }

    public final void o(TemplateStyleRecord templateStyleRecord) {
        TemplateStyleRecord r10 = r(templateStyleRecord.A(), templateStyleRecord.c());
        Context context = this.f22513b;
        if (r10 != null) {
            l(TemplateStyleRecord.class, templateStyleRecord.l(context), 50, new String[]{templateStyleRecord.A(), templateStyleRecord.c()});
        } else {
            d(TemplateStyleRecord.class, templateStyleRecord.l(context));
        }
    }

    public final void p(String str, List<SlotTemplateRsp> list, List<String> list2, boolean z10) {
        TemplateStyleRecord templateStyleRecord;
        if (androidx.transition.n.M(list)) {
            n7.e("TemplateConfigDao", "slotTemplateRsps is empty");
            return;
        }
        synchronized (f22616c) {
            n7.c("TemplateConfigDao", "blackIdList = %s", list2);
            for (SlotTemplateRsp slotTemplateRsp : list) {
                if (slotTemplateRsp != null && !androidx.transition.n.M(slotTemplateRsp.c())) {
                    String a10 = slotTemplateRsp.a();
                    List<String> c10 = slotTemplateRsp.c();
                    if (!androidx.transition.n.M(c10)) {
                        Iterator<String> it = c10.iterator();
                        while (it.hasNext()) {
                            j(TemplateStyleRecord.class, 50, new String[]{a10, it.next()});
                        }
                    }
                }
                if (slotTemplateRsp != null && !androidx.transition.n.M(slotTemplateRsp.b())) {
                    for (TemplateConfig templateConfig : slotTemplateRsp.b()) {
                        if (templateConfig != null && !TextUtils.isEmpty(templateConfig.a()) && (androidx.transition.n.M(list2) || !list2.contains(templateConfig.a()))) {
                            if (z10) {
                                templateStyleRecord = new TemplateStyleRecord(str, slotTemplateRsp.a(), templateConfig, 0);
                            } else {
                                templateStyleRecord = new TemplateStyleRecord(str, slotTemplateRsp.a(), templateConfig);
                            }
                            o(templateStyleRecord);
                        }
                    }
                }
            }
            if (!androidx.transition.n.M(list2)) {
                Iterator<String> it2 = list2.iterator();
                while (it2.hasNext()) {
                    j(TemplateStyleRecord.class, 51, new String[]{str, it2.next()});
                }
            }
        }
    }

    public final ArrayList q(int i10, String[] strArr) {
        ArrayList h10 = h(TemplateStyleRecord.class, null, i10, strArr, null, null);
        if (androidx.transition.n.M(h10)) {
            return new ArrayList();
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = h10.iterator();
        while (it.hasNext()) {
            TemplateStyleRecord templateStyleRecord = (TemplateStyleRecord) it.next();
            if (templateStyleRecord != null) {
                String A = templateStyleRecord.A();
                List list = (List) concurrentHashMap.get(A);
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(new TemplateConfig(templateStyleRecord.c(), templateStyleRecord.C()));
                concurrentHashMap.put(A, list);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            arrayList.add(new SlotTemplate((String) entry.getKey(), (List) entry.getValue()));
        }
        return arrayList;
    }

    public final TemplateStyleRecord r(String str, String str2) {
        ArrayList h10 = h(TemplateStyleRecord.class, null, 50, new String[]{str, str2}, null, null);
        if (androidx.transition.n.M(h10)) {
            n7.b("TemplateConfigDao", "no style");
            return null;
        }
        return (TemplateStyleRecord) h10.get(0);
    }
}
