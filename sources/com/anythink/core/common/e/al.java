package com.anythink.core.common.e;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class al {

    /* renamed from: e, reason: collision with root package name */
    static final String f5519e = "reqId";
    static final String f = "reqDatetime";

    /* renamed from: g, reason: collision with root package name */
    static final String f5520g = "fillOffers";

    /* renamed from: h, reason: collision with root package name */
    static final String f5521h = "bidResps";

    /* renamed from: i, reason: collision with root package name */
    static final String f5522i = "adSourceId";

    /* renamed from: j, reason: collision with root package name */
    static final String f5523j = "price";

    /* renamed from: k, reason: collision with root package name */
    static final String f5524k = "networkFirmId";

    /* renamed from: l, reason: collision with root package name */
    static final String f5525l = "demandType";

    /* renamed from: m, reason: collision with root package name */
    static final String f5526m = "tp_bid_id";

    /* renamed from: a, reason: collision with root package name */
    String f5527a;

    /* renamed from: b, reason: collision with root package name */
    long f5528b;

    /* renamed from: c, reason: collision with root package name */
    List<a> f5529c = new ArrayList(3);

    /* renamed from: d, reason: collision with root package name */
    List<a> f5530d = new ArrayList(3);

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f5532a;

        /* renamed from: b, reason: collision with root package name */
        public String f5533b;

        /* renamed from: c, reason: collision with root package name */
        public int f5534c;

        /* renamed from: d, reason: collision with root package name */
        public double f5535d;

        /* renamed from: e, reason: collision with root package name */
        public String f5536e;

        public a() {
        }

        public final synchronized JSONObject a() {
            JSONObject jSONObject;
            jSONObject = new JSONObject();
            try {
                jSONObject.put(al.f5522i, this.f5533b);
                jSONObject.put(al.f5523j, this.f5535d);
                jSONObject.put(al.f5524k, this.f5534c);
                jSONObject.put(al.f5525l, this.f5532a);
                jSONObject.put(al.f5526m, this.f5536e);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return jSONObject;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        
            if (r1 != 8) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(com.anythink.core.common.e.ai r7) {
            /*
                r6 = this;
                r6.<init>()
                java.lang.String r0 = r7.t()
                r6.f5533b = r0
                com.anythink.core.b.f r0 = com.anythink.core.b.f.a()
                com.anythink.core.common.e.m r0 = r0.a(r7)
                if (r0 == 0) goto L29
                boolean r1 = r7.aa()
                if (r1 == 0) goto L1e
                double r1 = r0.o
                r6.f5535d = r1
                goto L2f
            L1e:
                boolean r1 = r7.j()
                if (r1 == 0) goto L2f
                double r1 = r0.price
                r6.f5535d = r1
                goto L2f
            L29:
                double r1 = r7.x()
                r6.f5535d = r1
            L2f:
                int r1 = r7.c()
                r6.f5534c = r1
                int r1 = r7.l()
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L58
                if (r1 == r2) goto L55
                r4 = 3
                if (r1 == r3) goto L52
                r5 = 4
                if (r1 == r4) goto L4f
                if (r1 == r5) goto L55
                r4 = 7
                if (r1 == r4) goto L55
                r4 = 8
                if (r1 == r4) goto L58
                goto L5a
            L4f:
                r6.f5532a = r5
                goto L5a
            L52:
                r6.f5532a = r4
                goto L5a
            L55:
                r6.f5532a = r3
                goto L5a
            L58:
                r6.f5532a = r2
            L5a:
                r1 = 35
                int r7 = r7.c()
                if (r1 != r7) goto L64
                r6.f5532a = r3
            L64:
                if (r0 == 0) goto L69
                java.lang.String r7 = r0.f5695g
                goto L6b
            L69:
                java.lang.String r7 = ""
            L6b:
                r6.f5536e = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.al.a.<init>(com.anythink.core.common.e.ai):void");
        }
    }

    private synchronized long c() {
        return this.f5528b;
    }

    private synchronized JSONArray d() {
        return c(this.f5529c);
    }

    private synchronized JSONArray e() {
        return c(this.f5530d);
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put(f5519e, this.f5527a);
            jSONObject.put(f, this.f5528b);
            jSONObject.put(f5520g, d());
            jSONObject.put(f5521h, e());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public final synchronized void b(String str) {
        this.f5527a = str;
    }

    private synchronized List<a> c(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    a aVar = new a();
                    JSONObject jSONObject = new JSONObject(jSONArray.optString(i10));
                    aVar.f5533b = jSONObject.getString(f5522i);
                    aVar.f5535d = jSONObject.getDouble(f5523j);
                    aVar.f5534c = jSONObject.getInt(f5524k);
                    aVar.f5532a = jSONObject.getInt(f5525l);
                    if (jSONObject.has(f5526m)) {
                        aVar.f5536e = jSONObject.getString(f5526m);
                    }
                    arrayList.add(aVar);
                }
                Collections.sort(arrayList, new Comparator<a>() { // from class: com.anythink.core.common.e.al.1
                    private static int a(a aVar2, a aVar3) {
                        double d10 = aVar2.f5535d;
                        double d11 = aVar3.f5535d;
                        if (d10 > d11) {
                            return -1;
                        }
                        if (d10 == d11) {
                            return 0;
                        }
                        return 1;
                    }

                    @Override // java.util.Comparator
                    public final /* bridge */ /* synthetic */ int compare(a aVar2, a aVar3) {
                        double d10 = aVar2.f5535d;
                        double d11 = aVar3.f5535d;
                        if (d10 > d11) {
                            return -1;
                        }
                        if (d10 == d11) {
                            return 0;
                        }
                        return 1;
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    private synchronized void b(List<a> list) {
        this.f5530d = list;
    }

    public final synchronized String b() {
        return this.f5527a;
    }

    public final synchronized void b(a aVar) {
        a(this.f5530d, aVar);
    }

    public static al a(String str) {
        al alVar = new al();
        try {
            JSONObject jSONObject = new JSONObject(str);
            alVar.b(jSONObject.getString(f5519e));
            alVar.a(jSONObject.getLong(f));
            alVar.a(alVar.c(jSONObject.getString(f5520g)));
            alVar.b(alVar.c(jSONObject.getString(f5521h)));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return alVar;
    }

    public final synchronized void a(long j10) {
        this.f5528b = j10;
    }

    private synchronized void a(List<a> list) {
        this.f5529c = list;
    }

    private synchronized JSONArray c(List<a> list) {
        JSONArray jSONArray;
        jSONArray = new JSONArray();
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(it.next().a());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return jSONArray;
    }

    public final synchronized void a(a aVar) {
        a(this.f5529c, aVar);
    }

    private synchronized void a(List<a> list, a aVar) {
        if (aVar != null) {
            if (list.size() == 0) {
                list.add(aVar);
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    i10 = -1;
                    break;
                } else if (aVar.f5535d > list.get(i10).f5535d) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 != -1) {
                list.add(i10, aVar);
                return;
            }
            list.add(aVar);
        }
    }
}
