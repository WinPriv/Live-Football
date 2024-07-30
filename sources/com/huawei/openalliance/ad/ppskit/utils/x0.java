package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ka.n7;

/* loaded from: classes2.dex */
public final class x0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f23055s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f23056t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f23057u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f23058v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f23059w;

    public x0(Context context, int i10, List list, String str, long j10) {
        this.f23055s = context;
        this.f23056t = i10;
        this.f23057u = list;
        this.f23058v = str;
        this.f23059w = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Context context = this.f23055s;
        Context applicationContext = context.getApplicationContext();
        com.huawei.openalliance.ad.ppskit.handlers.e0 e0Var = new com.huawei.openalliance.ad.ppskit.handlers.e0(context);
        List<String> list = this.f23057u;
        boolean M = androidx.transition.n.M(list);
        char c10 = 1;
        char c11 = 0;
        int i11 = 2;
        long j10 = this.f23059w;
        String str = this.f23058v;
        if (M) {
            n7.e("ContentProcessor", "invalidContentIds is empty");
        } else {
            for (String str2 : list) {
                if (str2 != null) {
                    if (!TextUtils.isEmpty(str2)) {
                        String[] strArr = new String[i11];
                        strArr[c11] = str;
                        strArr[c10] = str2;
                        String str3 = str;
                        long j11 = j10;
                        ArrayList h10 = e0Var.h(ContentRecord.class, null, 6, strArr, null, null);
                        if (!androidx.transition.n.M(h10)) {
                            Iterator it = h10.iterator();
                            while (it.hasNext()) {
                                ContentRecord contentRecord = (ContentRecord) it.next();
                                if (contentRecord != null) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(ContentRecord.INVALID_TIME);
                                    contentRecord.Z1(j11);
                                    e0Var.s(contentRecord, contentRecord.h(), arrayList);
                                }
                            }
                        }
                        str = str3;
                        j10 = j11;
                        c10 = 1;
                        c11 = 0;
                        i11 = 2;
                    }
                } else {
                    c10 = 1;
                }
            }
        }
        String str4 = str;
        long j12 = j10;
        long H = com.huawei.openalliance.ad.ppskit.handlers.l.d(context).H(str4);
        HashMap hashMap = d0.f22830a;
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it2 = e0Var.h(ContentRecord.class, new String[]{"appPkgName", "contentId", "slotId"}, 20, new String[]{String.valueOf(currentTimeMillis - H), String.valueOf(currentTimeMillis - 3600000)}, null, null).iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i10 = this.f23056t;
            if (!hasNext) {
                break;
            }
            ContentRecord contentRecord2 = (ContentRecord) it2.next();
            if (contentRecord2 == null) {
                n7.i("ContentProcessor", "fail to delete content, content is null");
            } else {
                String m32 = contentRecord2.m3();
                if ((1 == i10 || i10 == 18) && !y1.h(m32)) {
                    x.e(applicationContext, m32);
                }
                e0Var.y(contentRecord2.h1(), contentRecord2.h(), contentRecord2.p2(), "deleteExpireAndInvalidInsreContents");
            }
        }
        com.huawei.openalliance.ad.ppskit.handlers.e0 e0Var2 = new com.huawei.openalliance.ad.ppskit.handlers.e0(context);
        long w10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context).w(str4);
        ArrayList h11 = e0Var2.h(ContentRecord.class, null, 46, new String[]{str4, String.valueOf(i10), String.valueOf(System.currentTimeMillis() - w10)}, null, null);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ContentRecord.INVALID_TIME);
        if (!androidx.transition.n.M(h11)) {
            Iterator it3 = h11.iterator();
            while (it3.hasNext()) {
                ContentRecord contentRecord3 = (ContentRecord) it3.next();
                if (contentRecord3 != null) {
                    n7.f("InvalidContentsUtil", "set invalidTime to overdue content: %s, period: %s", contentRecord3.h(), Long.valueOf(w10));
                    contentRecord3.Z1(j12);
                    e0Var2.t(contentRecord3, arrayList2);
                }
            }
        }
    }
}
