package com.ironsource.mediationsdk.a;

import a3.l;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.openalliance.ad.ppskit.db.bean.EventMonitorRecord;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.s;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class b {
    public f A;
    public s B;

    /* renamed from: a, reason: collision with root package name */
    public boolean f25027a;

    /* renamed from: d, reason: collision with root package name */
    public com.ironsource.b.a f25030d;

    /* renamed from: e, reason: collision with root package name */
    public rb.a f25031e;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList<com.ironsource.mediationsdk.a.c> f25032g;

    /* renamed from: h, reason: collision with root package name */
    public int f25033h;

    /* renamed from: i, reason: collision with root package name */
    public String f25034i;

    /* renamed from: j, reason: collision with root package name */
    public Context f25035j;

    /* renamed from: n, reason: collision with root package name */
    public int[] f25039n;
    public int[] o;

    /* renamed from: q, reason: collision with root package name */
    public int[] f25041q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f25042r;

    /* renamed from: u, reason: collision with root package name */
    public int f25045u;

    /* renamed from: v, reason: collision with root package name */
    public IronSourceSegment f25046v;

    /* renamed from: x, reason: collision with root package name */
    public String f25047x;
    public String y;

    /* renamed from: z, reason: collision with root package name */
    public HashSet f25048z;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25028b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25029c = false;
    public boolean f = true;

    /* renamed from: k, reason: collision with root package name */
    public int f25036k = 100;

    /* renamed from: l, reason: collision with root package name */
    public int f25037l = 5000;

    /* renamed from: m, reason: collision with root package name */
    public int f25038m = 1;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f25043s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f25044t = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public String f25040p = "";
    public final Object C = new Object();

    /* loaded from: classes2.dex */
    public enum a {
        NOT_SUPPORTED(-1),
        OFFERWALL(1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        BANNER(8);


        /* renamed from: s, reason: collision with root package name */
        public final int f25055s;

        a(int i10) {
            this.f25055s = i10;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0327b implements Runnable {
        public RunnableC0327b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            synchronized (bVar.C) {
                bVar.f25030d.a(bVar.f25032g, bVar.y);
                bVar.f25032g.clear();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.mediationsdk.a.c f25057s;

        public c(com.ironsource.mediationsdk.a.c cVar) {
            this.f25057s = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            boolean z11;
            boolean contains;
            boolean z12;
            boolean z13;
            boolean j10;
            boolean z14;
            boolean has;
            boolean z15;
            boolean z16;
            int a10;
            com.ironsource.mediationsdk.a.c cVar = this.f25057s;
            if (cVar != null) {
                b bVar = b.this;
                if (bVar.f) {
                    cVar.a("eventSessionId", bVar.f25034i);
                    String connectionType = IronSourceUtils.getConnectionType(b.this.f25035j);
                    if (b.this.n(this.f25057s)) {
                        this.f25057s.a("connectionType", connectionType);
                    }
                    b bVar2 = b.this;
                    com.ironsource.mediationsdk.a.c cVar2 = this.f25057s;
                    synchronized (bVar2) {
                        z10 = true;
                        if (!connectionType.equalsIgnoreCase("none")) {
                            contains = false;
                        } else {
                            int[] iArr = bVar2.f25042r;
                            if (iArr != null && iArr.length > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                contains = b.e(cVar2.a(), bVar2.f25042r);
                            } else {
                                contains = bVar2.f25048z.contains(Integer.valueOf(cVar2.a()));
                            }
                        }
                    }
                    if (contains) {
                        com.ironsource.mediationsdk.a.c cVar3 = this.f25057s;
                        synchronized (b.this) {
                            a10 = cVar3.a() + com.anythink.expressad.foundation.g.a.bM;
                        }
                        cVar3.a(a10);
                    }
                    int k10 = b.k(this.f25057s.a());
                    if (k10 != a.NOT_SUPPORTED.f25055s) {
                        this.f25057s.a("adUnit", Integer.valueOf(k10));
                    }
                    b.c(this.f25057s, "reason");
                    b.c(this.f25057s, IronSourceConstants.EVENTS_EXT1);
                    if (!b.this.f25044t.isEmpty()) {
                        for (Map.Entry entry : b.this.f25044t.entrySet()) {
                            if (!this.f25057s.d().has((String) entry.getKey()) && entry.getKey() != EventMonitorRecord.EVENT_ID && entry.getKey() != "timestamp") {
                                this.f25057s.a((String) entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    b bVar3 = b.this;
                    com.ironsource.mediationsdk.a.c cVar4 = this.f25057s;
                    if (cVar4 != null) {
                        int[] iArr2 = bVar3.f25039n;
                        if (iArr2 != null && iArr2.length > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            z12 = !b.e(cVar4.a(), bVar3.f25039n);
                        } else {
                            int[] iArr3 = bVar3.o;
                            if (iArr3 != null && iArr3.length > 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                z12 = b.e(cVar4.a(), bVar3.o);
                            } else {
                                z12 = true;
                            }
                        }
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        if (b.this.m(this.f25057s)) {
                            JSONObject d10 = this.f25057s.d();
                            if (d10 == null) {
                                has = false;
                            } else {
                                has = d10.has(IronSourceConstants.KEY_SESSION_DEPTH);
                            }
                            if (!has) {
                                this.f25057s.a(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b.this.l(this.f25057s)));
                            }
                        }
                        if (!TextUtils.isEmpty(b.this.h(this.f25057s.a())) && b.this.g(this.f25057s)) {
                            com.ironsource.mediationsdk.a.c cVar5 = this.f25057s;
                            cVar5.a("placement", b.this.h(cVar5.a()));
                        }
                        long firstSessionTimestamp = IronSourceUtils.getFirstSessionTimestamp(b.this.f25035j);
                        if (firstSessionTimestamp != -1) {
                            this.f25057s.a(IronSourceConstants.FIRST_SESSION_TIMESTAMP, Long.valueOf(firstSessionTimestamp));
                        }
                        try {
                            IronLog.EVENT.verbose(("{\"eventId\":" + this.f25057s.a() + ",\"timestamp\":" + this.f25057s.b() + "," + this.f25057s.c().substring(1)).replace(",", "\n"));
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        b.this.f25032g.add(this.f25057s);
                        b.this.f25033h++;
                    }
                    b bVar4 = b.this;
                    int[] iArr4 = bVar4.f25041q;
                    if (iArr4 != null && iArr4.length > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        int a11 = this.f25057s.a();
                        int[] iArr5 = b.this.f25041q;
                        bVar4.getClass();
                        j10 = b.e(a11, iArr5);
                    } else {
                        j10 = bVar4.j(this.f25057s);
                    }
                    b bVar5 = b.this;
                    if (!bVar5.f25028b && j10) {
                        bVar5.f25028b = true;
                    }
                    if (bVar5.f25030d != null) {
                        if ((bVar5.f25033h >= bVar5.f25036k || bVar5.f25028b) && bVar5.f25027a) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            bVar5.i();
                            return;
                        }
                        ArrayList<com.ironsource.mediationsdk.a.c> arrayList = bVar5.f25032g;
                        if (arrayList == null || arrayList.size() < bVar5.f25038m) {
                            z10 = false;
                        }
                        if (z10 || j10) {
                            b bVar6 = b.this;
                            synchronized (bVar6.C) {
                                bVar6.f25030d.a(bVar6.f25032g, bVar6.y);
                                bVar6.f25032g.clear();
                            }
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements com.ironsource.b.c {

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ boolean f25060s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ ArrayList f25061t;

            public a(boolean z10, ArrayList arrayList) {
                this.f25060s = z10;
                this.f25061t = arrayList;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10 = this.f25060s;
                d dVar = d.this;
                if (z10) {
                    b bVar = b.this;
                    ArrayList<com.ironsource.mediationsdk.a.c> a10 = bVar.f25030d.a(bVar.y);
                    b.this.f25033h = b.this.f25032g.size() + a10.size();
                    return;
                }
                IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                b.this.d(this.f25061t);
            }
        }

        public d() {
        }

        @Override // com.ironsource.b.c
        public final synchronized void a(ArrayList<com.ironsource.mediationsdk.a.c> arrayList, boolean z10) {
            f fVar = b.this.A;
            fVar.f25063s.post(new a(z10, arrayList));
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Comparator<com.ironsource.mediationsdk.a.c> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.ironsource.mediationsdk.a.c cVar, com.ironsource.mediationsdk.a.c cVar2) {
            if (cVar.b() >= cVar2.b()) {
                return 1;
            }
            return -1;
        }
    }

    /* loaded from: classes2.dex */
    public class f extends HandlerThread {

        /* renamed from: s, reason: collision with root package name */
        public Handler f25063s;

        public f(String str) {
            super(str);
        }
    }

    public static /* synthetic */ void c(com.ironsource.mediationsdk.a.c cVar, String str) {
        JSONObject d10 = cVar.d();
        if (d10 == null || !d10.has(str)) {
            return;
        }
        try {
            String optString = d10.optString(str, null);
            if (optString != null) {
                cVar.a(str, optString.substring(0, Math.min(optString.length(), 1024)));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean e(int i10, int[] iArr) {
        boolean z10;
        if (iArr != null && iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    public static int k(int i10) {
        a aVar;
        int i11 = a.NOT_SUPPORTED.f25055s;
        if (i10 != 15 && (i10 < 300 || i10 >= 400)) {
            if ((i10 >= 1000 && i10 < 2000) || (i10 >= 91000 && i10 < 92000)) {
                aVar = a.REWARDED_VIDEO;
            } else if ((i10 >= 2000 && i10 < 3000) || (i10 >= 92000 && i10 < 93000)) {
                aVar = a.INTERSTITIAL;
            } else if ((i10 >= 3000 && i10 < 4000) || (i10 >= 93000 && i10 < 94000)) {
                aVar = a.BANNER;
            } else {
                return i11;
            }
        } else {
            aVar = a.OFFERWALL;
        }
        return aVar.f25055s;
    }

    public final ArrayList<com.ironsource.mediationsdk.a.c> a(ArrayList<com.ironsource.mediationsdk.a.c> arrayList, ArrayList<com.ironsource.mediationsdk.a.c> arrayList2, int i10) {
        ArrayList<com.ironsource.mediationsdk.a.c> arrayList3 = new ArrayList<>();
        try {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            Collections.sort(arrayList4, new e());
            if (arrayList4.size() <= i10) {
                arrayList3.addAll(arrayList4);
            } else {
                arrayList3.addAll(arrayList4.subList(0, i10));
                this.f25030d.a(arrayList4.subList(i10, arrayList4.size()), this.y);
            }
        } catch (Exception e10) {
            IronLog.INTERNAL.error("CombinedEventList exception: " + e10.getMessage());
        }
        return arrayList3;
    }

    public final void b() {
        this.f25032g = new ArrayList<>();
        this.f25033h = 0;
        this.f25031e = com.ironsource.mediationsdk.a.c.b(this.f25045u, this.f25047x);
        f fVar = new f(l.p(new StringBuilder(), this.y, "EventThread"));
        this.A = fVar;
        fVar.start();
        f fVar2 = this.A;
        fVar2.f25063s = new Handler(fVar2.getLooper());
        this.f25034i = IronSourceUtils.getSessionId();
        this.f25048z = new HashSet();
        f();
    }

    public void d(ArrayList<com.ironsource.mediationsdk.a.c> arrayList) {
        if (arrayList != null) {
            synchronized (this.C) {
                this.f25030d.a(arrayList, this.y);
                this.f25033h = this.f25030d.a(this.y).size() + this.f25032g.size();
            }
        }
    }

    public abstract boolean g(com.ironsource.mediationsdk.a.c cVar);

    public abstract String h(int i10);

    public final void i() {
        ArrayList<com.ironsource.mediationsdk.a.c> a10;
        String str;
        this.f25028b = false;
        synchronized (this.C) {
            a10 = a(this.f25032g, this.f25030d.a(this.y), this.f25037l);
            if (a10.size() > 0) {
                this.f25032g.clear();
                this.f25030d.b(this.y);
            }
        }
        if (a10.size() > 0) {
            this.f25033h = 0;
            JSONObject b10 = com.ironsource.mediationsdk.sdk.e.a().b();
            try {
                try {
                    IronSourceSegment ironSourceSegment = this.f25046v;
                    if (ironSourceSegment != null) {
                        if (ironSourceSegment.getAge() > 0) {
                            b10.put("age", this.f25046v.getAge());
                        }
                        if (!TextUtils.isEmpty(this.f25046v.getGender())) {
                            b10.put(IronSourceSegment.GENDER, this.f25046v.getGender());
                        }
                        if (this.f25046v.getLevel() > 0) {
                            b10.put(IronSourceSegment.LEVEL, this.f25046v.getLevel());
                        }
                        if (this.f25046v.getIsPaying() != null) {
                            b10.put(IronSourceSegment.PAYING, this.f25046v.getIsPaying().get());
                        }
                        if (this.f25046v.getIapt() > 0.0d) {
                            b10.put(IronSourceSegment.IAPT, this.f25046v.getIapt());
                        }
                        if (this.f25046v.getUcd() > 0) {
                            b10.put(IronSourceSegment.USER_CREATION_DATE, this.f25046v.getUcd());
                        }
                    }
                    s sVar = this.B;
                    if (sVar != null) {
                        String str2 = sVar.f25733b;
                        if (!TextUtils.isEmpty(str2)) {
                            b10.put("segmentId", str2);
                        }
                        JSONObject jSONObject = this.B.f25734c;
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            b10.put(next, jSONObject.get(next));
                        }
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            String str3 = this.f25040p;
            if (!TextUtils.isEmpty(str3)) {
                b10.put("abt", str3);
            }
            String str4 = L.a().o;
            if (!TextUtils.isEmpty(str4)) {
                b10.put("mt", str4);
            }
            HashMap hashMap = this.f25043s;
            if (!hashMap.isEmpty()) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (!b10.has((String) entry.getKey())) {
                        b10.put((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            JSONObject a11 = new com.ironsource.environment.b.b().a();
            Iterator<String> keys2 = a11.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                b10.put(next2, a11.get(next2));
            }
            String a12 = this.f25031e.a(a10, b10);
            if (TextUtils.isEmpty(a12)) {
                IronLog.INTERNAL.error("Failed to parse events. Saving them back to storage.");
                d(a10);
                return;
            }
            if (this.f25029c) {
                try {
                    a12 = Base64.encodeToString(a.AnonymousClass1.b(a12), 0);
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            d dVar = new d();
            rb.a aVar = this.f25031e;
            if (TextUtils.isEmpty(aVar.f34989c)) {
                str = aVar.b();
            } else {
                str = aVar.f34989c;
            }
            com.ironsource.environment.e.c.f24668a.c(new com.ironsource.b.b(dVar, a12, str, a10));
        }
    }

    public abstract boolean j(com.ironsource.mediationsdk.a.c cVar);

    public abstract int l(com.ironsource.mediationsdk.a.c cVar);

    public boolean m(com.ironsource.mediationsdk.a.c cVar) {
        if (cVar.a() != 14 && cVar.a() != 114 && cVar.a() != 514 && cVar.a() != 140 && cVar.a() != 40 && cVar.a() != 41 && cVar.a() != 50 && cVar.a() != 51 && cVar.a() != 52) {
            return true;
        }
        return false;
    }

    public boolean n(com.ironsource.mediationsdk.a.c cVar) {
        if (cVar.a() != 40 && cVar.a() != 41 && cVar.a() != 50 && cVar.a() != 51 && cVar.a() != 52) {
            return true;
        }
        return false;
    }

    public final void a(int i10) {
        if (i10 > 0) {
            this.f25038m = i10;
        }
    }

    public final void c() {
        i();
    }

    public final void d(int[] iArr, Context context) {
        this.f25042r = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.y, iArr);
    }

    public final synchronized void a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.y, this.f25047x);
        this.f25047x = defaultEventsFormatterType;
        rb.a aVar = this.f25031e;
        if (aVar == null || !aVar.c().equals(defaultEventsFormatterType)) {
            this.f25031e = com.ironsource.mediationsdk.a.c.b(this.f25045u, defaultEventsFormatterType);
        }
        this.f25031e.f34989c = IronSourceUtils.getDefaultEventsURL(context, this.y, null);
        this.f25030d = com.ironsource.b.a.a(context, "supersonic_sdk.db", 5);
        f fVar = this.A;
        fVar.f25063s.post(new RunnableC0327b());
        this.f25039n = IronSourceUtils.getDefaultOptOutEvents(context, this.y);
        this.o = IronSourceUtils.getDefaultOptInEvents(context, this.y);
        this.f25041q = IronSourceUtils.getDefaultTriggerEvents(context, this.y);
        this.f25042r = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.y);
        this.f25046v = ironSourceSegment;
        this.f25035j = context;
    }

    public final void c(int i10) {
        if (i10 > 0) {
            this.f25037l = i10;
        }
    }

    public final void c(int[] iArr, Context context) {
        this.f25041q = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.y, iArr);
    }

    public final void b(int i10) {
        if (i10 > 0) {
            this.f25036k = i10;
        }
    }

    public final synchronized void b(com.ironsource.mediationsdk.a.c cVar) {
        f fVar = this.A;
        fVar.f25063s.post(new c(cVar));
    }

    public final synchronized void a(s sVar) {
        this.B = sVar;
    }

    public final void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        rb.a aVar = this.f25031e;
        if (aVar != null) {
            aVar.f34989c = str;
        }
        IronSourceUtils.saveDefaultEventsURL(context, this.y, str);
    }

    public final void a(Map<String, String> map) {
        this.f25043s.putAll(map);
    }

    public final void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f25047x = str;
        IronSourceUtils.saveDefaultEventsFormatterType(context, this.y, str);
        rb.a aVar = this.f25031e;
        if (aVar == null || !aVar.c().equals(str)) {
            this.f25031e = com.ironsource.mediationsdk.a.c.b(this.f25045u, str);
        }
    }

    public static void a(Map<String, Object> map, int i10, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i10));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    public final void b(Map<String, String> map) {
        this.f25044t.putAll(map);
    }

    public final void a(int[] iArr, Context context) {
        this.f25039n = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.y, iArr);
    }

    public final void b(int[] iArr, Context context) {
        this.o = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.y, iArr);
    }

    public void f() {
    }
}
