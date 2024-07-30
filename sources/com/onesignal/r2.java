package com.onesignal;

import com.onesignal.e3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* compiled from: OSSessionManager.java */
/* loaded from: classes2.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final a4.l f27007a;

    /* renamed from: b, reason: collision with root package name */
    public final a f27008b;

    /* renamed from: c, reason: collision with root package name */
    public final s1 f27009c;

    /* compiled from: OSSessionManager.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public r2(e3.b bVar, a4.l lVar, c3 c3Var) {
        this.f27008b = bVar;
        this.f27007a = lVar;
        this.f27009c = c3Var;
    }

    public final void a(e3.m mVar, String str) {
        ac.a aVar;
        bc.a aVar2;
        boolean z10;
        boolean z11;
        c3 c3Var = (c3) this.f27009c;
        c3Var.c("OneSignal SessionManager attemptSessionUpgrade with entryAction: " + mVar);
        a4.l lVar = this.f27007a;
        lVar.getClass();
        zc.d.d(mVar, "entryAction");
        if (mVar.equals(e3.m.NOTIFICATION_CLICK)) {
            aVar = lVar.d();
        } else {
            aVar = null;
        }
        ArrayList b10 = lVar.b(mVar);
        ArrayList arrayList = new ArrayList();
        if (aVar != null) {
            aVar2 = aVar.e();
            bc.b bVar = bc.b.DIRECT;
            if (str == null) {
                str = aVar.f403c;
            }
            z10 = e(aVar, bVar, str, null);
        } else {
            aVar2 = null;
            z10 = false;
        }
        if (z10) {
            c3Var.c("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: " + b10);
            arrayList.add(aVar2);
            Iterator it = b10.iterator();
            while (it.hasNext()) {
                ac.a aVar3 = (ac.a) it.next();
                if (aVar3.f401a.p()) {
                    arrayList.add(aVar3.e());
                    aVar3.l();
                }
            }
        }
        c3Var.c("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        Iterator it2 = b10.iterator();
        while (it2.hasNext()) {
            ac.a aVar4 = (ac.a) it2.next();
            bc.b bVar2 = aVar4.f401a;
            bVar2.getClass();
            if (bVar2 == bc.b.UNATTRIBUTED) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                JSONArray j10 = aVar4.j();
                if (j10.length() > 0 && !mVar.equals(e3.m.APP_CLOSE)) {
                    bc.a e10 = aVar4.e();
                    if (e(aVar4, bc.b.INDIRECT, null, j10)) {
                        arrayList.add(e10);
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("Trackers after update attempt: ");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(lVar.d());
        arrayList2.add(lVar.c());
        sb2.append(arrayList2.toString());
        e3.b(6, sb2.toString(), null);
        d(arrayList);
    }

    public final ArrayList b() {
        Collection values = ((ConcurrentHashMap) this.f27007a.f259t).values();
        zc.d.c(values, "trackers.values");
        Collection collection = values;
        ArrayList arrayList = new ArrayList(vc.b.N0(collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((ac.a) it.next()).e());
        }
        return arrayList;
    }

    public final void c(String str) {
        ((c3) this.f27009c).c(s.f.b("OneSignal SessionManager onInAppMessageReceived messageId: ", str));
        ac.a c10 = this.f27007a.c();
        c10.n(str);
        c10.l();
    }

    public final void d(ArrayList arrayList) {
        ((c3) this.f27009c).c("OneSignal SessionManager sendSessionEndingWithInfluences with influences: " + arrayList);
        if (arrayList.size() > 0) {
            new Thread(new q2(this, arrayList), "OS_END_CURRENT_SESSION").start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r0 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(ac.a r8, bc.b r9, java.lang.String r10, org.json.JSONArray r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.r2.e(ac.a, bc.b, java.lang.String, org.json.JSONArray):boolean");
    }
}
