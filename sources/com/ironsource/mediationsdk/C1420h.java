package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.Pair;
import com.anythink.core.api.ATAdConst;
import com.huawei.hms.ads.ep;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1420h {

    /* renamed from: a, reason: collision with root package name */
    public final i f25445a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25446b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25447c;

    /* renamed from: d, reason: collision with root package name */
    public final com.ironsource.mediationsdk.utils.c f25448d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1419g f25449e;
    public ISBannerSize f;

    /* renamed from: com.ironsource.mediationsdk.h$a */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {
        public long A;
        public int B;
        public int D;
        public final URL G;
        public final JSONObject H;
        public final boolean I;
        public final int J;
        public final long K;
        public final boolean L;
        public final boolean M;
        public final int N;

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<InterfaceC1419g> f25450s;

        /* renamed from: t, reason: collision with root package name */
        public int f25451t;

        /* renamed from: u, reason: collision with root package name */
        public String f25452u;

        /* renamed from: v, reason: collision with root package name */
        public String f25453v;

        /* renamed from: w, reason: collision with root package name */
        public ArrayList f25454w;

        /* renamed from: x, reason: collision with root package name */
        public com.ironsource.mediationsdk.c.b f25455x;
        public JSONObject y;

        /* renamed from: z, reason: collision with root package name */
        public JSONObject f25456z;
        public String C = "other";
        public String E = "";
        public int F = 0;

        public a(InterfaceC1419g interfaceC1419g, URL url, JSONObject jSONObject, boolean z10, int i10, long j10, boolean z11, boolean z12, int i11) {
            this.f25450s = new WeakReference<>(interfaceC1419g);
            this.G = url;
            this.H = jSONObject;
            this.I = z10;
            this.J = i10;
            this.K = j10;
            this.L = z11;
            this.M = z12;
            this.N = i11;
        }

        public static String a(HttpURLConnection httpURLConnection) {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb2.toString();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:78:0x036f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0370  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0302  */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v38 */
        /* JADX WARN: Type inference failed for: r2v41 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v26 */
        /* JADX WARN: Type inference failed for: r3v28, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v31 */
        /* JADX WARN: Type inference failed for: r3v32 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v4, types: [int, boolean] */
        /* JADX WARN: Type inference failed for: r7v8 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 927
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C1420h.a.run():void");
        }
    }

    public C1420h(i iVar) {
        this.f25445a = iVar;
    }

    public final JSONObject a(Context context, Map<String, Object> map, List<String> list, C1421j c1421j, int i10, boolean z10, IronSourceSegment ironSourceSegment) {
        new JSONObject();
        com.ironsource.mediationsdk.utils.p pVar = L.a().f24865r.f25936c.f25678e.f25639c;
        JSONObject jSONObject = new JSONObject();
        if (ironSourceSegment == null) {
            jSONObject = null;
        } else {
            Vector<Pair<String, String>> a10 = ironSourceSegment.a();
            for (int i11 = 0; i11 < a10.size(); i11++) {
                try {
                    jSONObject.put((String) a10.get(i11).first, a10.get(i11).second);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    IronLog.INTERNAL.error("exception " + e10.getMessage());
                }
            }
        }
        JSONObject jSONObject2 = jSONObject;
        boolean z11 = pVar.f25957d;
        C1418f a11 = C1418f.a();
        if (z11) {
            return a11.f(this.f25446b, z10, map, list, c1421j, i10, this.f, jSONObject2);
        }
        JSONObject c10 = a11.c(context, map, list, c1421j, i10, this.f25447c, this.f25448d, this.f, jSONObject2);
        c10.put("adUnit", this.f25446b);
        c10.put("doNotEncryptResponse", z10 ? ep.V : ep.Code);
        return c10;
    }

    @Deprecated
    public C1420h(String str, com.ironsource.mediationsdk.utils.c cVar, InterfaceC1419g interfaceC1419g) {
        this.f25446b = str;
        this.f25448d = cVar;
        this.f25449e = interfaceC1419g;
        this.f25447c = IronSourceUtils.getSessionId();
    }

    @Deprecated
    public final void a(Context context, Map<String, Object> map, List<String> list, C1421j c1421j, int i10, IronSourceSegment ironSourceSegment) {
        com.ironsource.mediationsdk.utils.c cVar = this.f25448d;
        try {
            boolean z10 = true;
            if (IronSourceUtils.getSerr() != 1) {
                z10 = false;
            }
            boolean z11 = z10;
            com.ironsource.environment.e.c.f24668a.c(new a(this.f25449e, new URL(cVar.f25891d), a(context, map, list, c1421j, i10, z11, ironSourceSegment), z11, cVar.f, cVar.f25895i, cVar.f25902q, cVar.f25903r, cVar.f25904s));
        } catch (Exception e10) {
            IronLog.INTERNAL.error("execute auction exception " + e10.getMessage());
            this.f25449e.a(1000, e10.getMessage(), 0, "other", 0L);
        }
    }

    @Deprecated
    public final void a(Context context, Map<String, Object> map, List<String> list, C1421j c1421j, int i10, IronSourceSegment ironSourceSegment, ISBannerSize iSBannerSize) {
        this.f = iSBannerSize;
        a(context, map, list, c1421j, i10, ironSourceSegment);
    }

    public static void a(com.ironsource.mediationsdk.c.b bVar, int i10, com.ironsource.mediationsdk.c.b bVar2) {
        Iterator<String> it = bVar.g().iterator();
        while (it.hasNext()) {
            String a10 = C1418f.a().a(it.next(), i10, bVar, "", "", "");
            C1418f.a();
            C1418f.h("reportLoadSuccess", bVar.a(), a10);
        }
        if (bVar2 != null) {
            Iterator<String> it2 = bVar2.g().iterator();
            while (it2.hasNext()) {
                String a11 = C1418f.a().a(it2.next(), i10, bVar, "", ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB, "");
                C1418f.a();
                C1418f.h("reportLoadSuccess", "GenericNotifications", a11);
            }
        }
    }

    public static void a(com.ironsource.mediationsdk.c.b bVar, int i10, com.ironsource.mediationsdk.c.b bVar2, String str) {
        Iterator<String> it = bVar.e().iterator();
        while (it.hasNext()) {
            String a10 = C1418f.a().a(it.next(), i10, bVar, "", "", str);
            C1418f.a();
            C1418f.h("reportImpression", bVar.a(), a10);
        }
        if (bVar2 != null) {
            Iterator<String> it2 = bVar2.e().iterator();
            while (it2.hasNext()) {
                String a11 = C1418f.a().a(it2.next(), i10, bVar, "", ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB, str);
                C1418f.a();
                C1418f.h("reportImpression", "GenericNotifications", a11);
            }
        }
    }

    public static void a(ArrayList<String> arrayList, ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> concurrentHashMap, int i10, com.ironsource.mediationsdk.c.b bVar, com.ironsource.mediationsdk.c.b bVar2) {
        Iterator<String> it = arrayList.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(bVar2.a())) {
                z11 = i10 == 2;
                z10 = true;
            } else {
                com.ironsource.mediationsdk.c.b bVar3 = concurrentHashMap.get(next);
                String d10 = bVar3.d();
                String str = z10 ? z11 ? ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB : ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_NORMAL : "1";
                Iterator<String> it2 = bVar3.f().iterator();
                while (it2.hasNext()) {
                    String a10 = C1418f.a().a(it2.next(), i10, bVar2, d10, str, "");
                    C1418f.a();
                    C1418f.h("reportAuctionLose", bVar3.a(), a10);
                }
            }
        }
        if (bVar != null) {
            Iterator<String> it3 = bVar.f().iterator();
            while (it3.hasNext()) {
                String a11 = C1418f.a().a(it3.next(), i10, bVar2, "", ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB, "");
                C1418f.a();
                C1418f.h("reportAuctionLose", "GenericNotifications", a11);
            }
        }
    }

    public final void a(CopyOnWriteArrayList<ac> copyOnWriteArrayList, ConcurrentHashMap<String, com.ironsource.mediationsdk.c.b> concurrentHashMap, int i10, com.ironsource.mediationsdk.c.b bVar, com.ironsource.mediationsdk.c.b bVar2) {
        ArrayList arrayList = new ArrayList();
        Iterator<ac> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().k());
        }
        a((ArrayList<String>) arrayList, concurrentHashMap, i10, bVar, bVar2);
    }
}
