package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentResource;
import com.huawei.openalliance.ad.ppskit.db.bean.EventMonitorRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.n7;
import ka.u4;
import ka.w4;

/* loaded from: classes2.dex */
public final class s extends z {

    /* renamed from: c, reason: collision with root package name */
    public static s f22621c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f22622d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f22623e = new byte[0];

    public /* synthetic */ s(Context context) {
        super(context);
    }

    public static s n(Context context) {
        s sVar;
        synchronized (f22623e) {
            if (f22621c == null) {
                f22621c = new s(context);
            }
            sVar = f22621c;
        }
        return sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x008a, TryCatch #0 {, blocks: (B:8:0x000c, B:10:0x0016, B:11:0x001d, B:13:0x001f, B:15:0x002d, B:18:0x0034, B:19:0x004f, B:21:0x0055, B:22:0x0088, B:24:0x0077, B:25:0x004a), top: B:7:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[Catch: all -> 0x008a, TryCatch #0 {, blocks: (B:8:0x000c, B:10:0x0016, B:11:0x001d, B:13:0x001f, B:15:0x002d, B:18:0x0034, B:19:0x004f, B:21:0x0055, B:22:0x0088, B:24:0x0077, B:25:0x004a), top: B:7:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(com.huawei.openalliance.ad.ppskit.db.bean.ContentResource r17, java.lang.String r18) {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            java.lang.String r9 = "resource is exist, contentId:"
            if (r0 != 0) goto L9
            return
        L9:
            byte[] r10 = com.huawei.openalliance.ad.ppskit.handlers.s.f22622d
            monitor-enter(r10)
            java.lang.String r11 = r17.c()     // Catch: java.lang.Throwable -> L8a
            boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L1f
            java.lang.String r0 = "ContentResourceDao"
            java.lang.String r1 = "insertContent - content id is empty"
            ka.n7.e(r0, r1)     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L8a
            return
        L1f:
            java.lang.String r1 = r17.a()     // Catch: java.lang.Throwable -> L8a
            boolean r2 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L8a
            r12 = 2
            r13 = 1
            r14 = 0
            r15 = 3
            if (r2 != 0) goto L4a
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L34
            goto L4a
        L34:
            java.lang.Class<com.huawei.openalliance.ad.ppskit.db.bean.ContentResource> r2 = com.huawei.openalliance.ad.ppskit.db.bean.ContentResource.class
            r3 = 0
            r4 = 42
            java.lang.String[] r5 = new java.lang.String[r15]     // Catch: java.lang.Throwable -> L8a
            r5[r14] = r1     // Catch: java.lang.Throwable -> L8a
            r5[r13] = r11     // Catch: java.lang.Throwable -> L8a
            r5[r12] = r18     // Catch: java.lang.Throwable -> L8a
            r6 = 0
            r7 = 0
            r1 = r16
            java.util.ArrayList r1 = r1.h(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8a
            goto L4f
        L4a:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8a
            r1.<init>()     // Catch: java.lang.Throwable -> L8a
        L4f:
            boolean r1 = androidx.transition.n.M(r1)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L77
            java.lang.String r1 = "ContentResourceDao"
            java.lang.String r2 = "insert contentid: %s fileName: %s cacheType: %s"
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L8a
            r3[r14] = r11     // Catch: java.lang.Throwable -> L8a
            java.lang.String r4 = r17.a()     // Catch: java.lang.Throwable -> L8a
            r3[r13] = r4     // Catch: java.lang.Throwable -> L8a
            r3[r12] = r18     // Catch: java.lang.Throwable -> L8a
            ka.n7.c(r1, r2, r3)     // Catch: java.lang.Throwable -> L8a
            r17.M(r18)     // Catch: java.lang.Throwable -> L8a
            java.lang.Class<com.huawei.openalliance.ad.ppskit.db.bean.ContentResource> r1 = com.huawei.openalliance.ad.ppskit.db.bean.ContentResource.class
            android.content.Context r2 = r8.f22513b     // Catch: java.lang.Throwable -> L8a
            android.content.ContentValues r0 = r0.l(r2)     // Catch: java.lang.Throwable -> L8a
            r8.d(r1, r0)     // Catch: java.lang.Throwable -> L8a
            goto L88
        L77:
            java.lang.String r0 = "ContentResourceDao"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L8a
            r1.append(r11)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L8a
            ka.n7.e(r0, r1)     // Catch: java.lang.Throwable -> L8a
        L88:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L8a
            return
        L8a:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L8a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.handlers.s.o(com.huawei.openalliance.ad.ppskit.db.bean.ContentResource, java.lang.String):void");
    }

    public void p(EventMonitorRecord eventMonitorRecord, int i10) {
        d(EventMonitorRecord.class, eventMonitorRecord.l(this.f22513b));
        ArrayList arrayList = new ArrayList();
        ArrayList h10 = h(EventMonitorRecord.class, new String[]{EventMonitorRecord.EVENT_ID}, 0, null, "addTime asc", null);
        if (!androidx.transition.n.M(h10)) {
            Iterator it = h10.iterator();
            while (it.hasNext()) {
                arrayList.add(((EventMonitorRecord) it.next()).d());
            }
        }
        n7.c("EventDao", "delete over: size:%s, limit:%s", Integer.valueOf(arrayList.size()), Integer.valueOf(i10));
        int size = arrayList.size() - i10;
        if (size > 0) {
            i(EventMonitorRecord.class, 47, arrayList.subList(0, size));
        }
    }

    public void q(String str, int i10, String str2) {
        if (TextUtils.isEmpty(str)) {
            n7.i("ContentResourceDao", "contentId is null, can't update prio");
            return;
        }
        synchronized (f22622d) {
            List t10 = t(str);
            if (!androidx.transition.n.M(t10)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) t10).iterator();
                while (it.hasNext()) {
                    ContentResource contentResource = (ContentResource) it.next();
                    if (n7.d()) {
                        n7.c("ContentResourceDao", "contentResource fileName: %s contentId: %s oldPrio: %s newPrio: %s cacheType: %s", contentResource.a(), contentResource.c(), Integer.valueOf(contentResource.K()), Integer.valueOf(i10), str2);
                    }
                    ArrayList r10 = r(contentResource.a(), str2);
                    if (!androidx.transition.n.M(r10)) {
                        Iterator it2 = r10.iterator();
                        while (it2.hasNext()) {
                            ContentResource contentResource2 = (ContentResource) it2.next();
                            if (i10 != contentResource.K()) {
                                contentResource2.D(i10);
                                arrayList.add(contentResource2);
                            }
                        }
                    } else {
                        n7.e("ContentResourceDao", "contentResourcesByName is empty");
                    }
                }
                s(arrayList);
            } else {
                n7.e("ContentResourceDao", "contentResources is empty");
            }
        }
    }

    public ArrayList r(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return h(ContentResource.class, null, 39, new String[]{str, str2}, null, null);
    }

    public void s(List list) {
        if (androidx.transition.n.M(list)) {
            return;
        }
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ContentResource contentResource = (ContentResource) it.next();
            if (contentResource != null) {
                arrayList2.add(new w4("ContentResource", null, null, "fileName = ? and contentId = ? and cacheType = ?", new String[]{contentResource.a(), contentResource.c(), contentResource.X()}, contentResource.l(this.f22513b)));
            }
        }
        u4 m10 = m();
        try {
            m10.h(arrayList2);
        } finally {
            c0.g(m10);
        }
    }

    public List t(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return h(ContentResource.class, null, 41, new String[]{str}, null, null);
    }
}
