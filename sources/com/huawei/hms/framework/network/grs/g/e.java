package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e {

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f21888a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f21889b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONArray f21890c;

        public a(long j10, ArrayList arrayList, JSONArray jSONArray) {
            this.f21888a = j10;
            this.f21889b = arrayList;
            this.f21890c = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            com.huawei.hms.framework.network.grs.g.j.a aVar = new com.huawei.hms.framework.network.grs.g.j.a();
            aVar.put("total_time", this.f21888a);
            Iterator it = this.f21889b.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.o() || dVar.m()) {
                    aVar.put(e.b(dVar));
                    it.remove();
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            if (!z10 && this.f21889b.size() > 0) {
                ArrayList arrayList = this.f21889b;
                d dVar2 = (d) arrayList.get(arrayList.size() - 1);
                aVar.put(e.b(dVar2));
                this.f21889b.remove(dVar2);
            }
            if (this.f21889b.size() > 0) {
                Iterator it2 = this.f21889b.iterator();
                while (it2.hasNext()) {
                    this.f21890c.put(new JSONObject(e.b((d) it2.next())));
                }
            }
            if (this.f21890c.length() > 0) {
                aVar.put("failed_info", this.f21890c.toString());
            }
            Logger.d("HaReportHelper", "grssdk report data to aiops is: %s", new JSONObject(aVar.get()));
            HianalyticsHelper.getInstance().onEvent(aVar.get(), "grs_request");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LinkedHashMap<String, String> b(d dVar) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        Exception d10 = dVar.d();
        if (d10 != null) {
            linkedHashMapPack.put("error_code", ExceptionCode.getErrorCodeFromException(d10));
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, d10.getClass().getSimpleName());
            linkedHashMapPack.put(CrashHianalyticsData.MESSAGE, StringUtils.anonymizeMessage(d10.getMessage()));
        } else {
            linkedHashMapPack.put("error_code", dVar.b());
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, dVar.c());
        }
        try {
            linkedHashMapPack.put("domain", new URL(dVar.l()).getHost());
        } catch (MalformedURLException e10) {
            Logger.w("HaReportHelper", "report host MalformedURLException", e10);
        }
        linkedHashMapPack.put("req_start_time", dVar.h());
        linkedHashMapPack.put("req_end_time", dVar.g());
        linkedHashMapPack.put("req_total_time", dVar.i());
        return linkedHashMapPack.getAll();
    }

    public static void a(ArrayList<d> arrayList, long j10, JSONArray jSONArray, Context context) {
        if (context == null || arrayList == null || arrayList.size() <= 0 || !HianalyticsHelper.getInstance().isEnableReportNoSeed(context)) {
            return;
        }
        HianalyticsHelper.getInstance().getReportExecutor().submit(new a(j10, arrayList, jSONArray));
    }
}
