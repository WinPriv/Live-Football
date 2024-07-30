package com.anythink.core.b;

import android.os.SystemClock;
import android.util.Log;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.l;
import com.anythink.core.common.e.m;
import com.anythink.core.common.k.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: a, reason: collision with root package name */
    private String f4649a;

    /* renamed from: b, reason: collision with root package name */
    private long f4650b;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.b.b.a f4651c;

    public h(com.anythink.core.common.e.a aVar) {
        super(aVar);
        this.f4649a = "IH Bidding";
    }

    private static void b(ai aiVar, String str, long j10, int i10) {
        d.a(aiVar, str, j10, i10);
    }

    @Override // com.anythink.core.b.d
    public final void a(ai aiVar, l lVar, long j10) {
    }

    private void b(ai aiVar) {
        m mVar = new m(true, aiVar.x(), aiVar.y(), "", "", "", "");
        mVar.f = System.currentTimeMillis() + aiVar.n();
        mVar.f5694e = aiVar.n();
        com.anythink.core.common.e.a aVar = this.f4607d;
        if (aVar != null) {
            mVar.b(aVar.f5389c);
        }
        a(aiVar, mVar);
    }

    @Override // com.anythink.core.b.d
    public final void a(final com.anythink.core.b.b.a aVar) {
        this.f4651c = aVar;
        this.f4650b = SystemClock.elapsedRealtime();
        List<ai> list = this.f4607d.f5394i;
        if (this.f4608e) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("Start IH Bidding List", d.a(list));
            } catch (Exception unused) {
            }
            n.a(n.f6219a, jSONObject.toString(), false);
        }
        if (f.a().b() == null) {
            Iterator<ai> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ATBaseAdAdapter a10 = com.anythink.core.common.k.i.a(it.next());
                if (a10 != null) {
                    MediationBidManager bidManager = a10.getBidManager();
                    if (bidManager != null) {
                        f.a().a(bidManager);
                    }
                }
            }
        }
        MediationBidManager b10 = f.a().b();
        if (b10 == null) {
            Log.i(n.f6219a, "No BidManager.");
            a((List<ai>) null, -9);
        } else {
            b10.setBidRequestUrl(this.f4607d.o);
            b10.startBid(this.f4607d, new MediationBidManager.BidListener() { // from class: com.anythink.core.b.h.1
                @Override // com.anythink.core.api.MediationBidManager.BidListener
                public final void onBidStart(ai aiVar, ATBaseAdAdapter aTBaseAdAdapter) {
                    com.anythink.core.b.b.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(aiVar, aTBaseAdAdapter);
                    }
                }

                @Override // com.anythink.core.api.MediationBidManager.BidListener
                public final void onBidSuccess(List<ai> list2) {
                    h.this.a(list2, -1);
                }

                @Override // com.anythink.core.api.MediationBidManager.BidListener
                public final void onBidFail(String str) {
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(List<ai> list, int i10) {
        if (this.f.get()) {
            return;
        }
        this.f.set(true);
        List<ai> arrayList = list == null ? new ArrayList<>() : list;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f4650b;
        ArrayList arrayList2 = new ArrayList();
        Iterator<ai> it = this.f4607d.f5394i.iterator();
        while (true) {
            boolean z10 = false;
            if (!it.hasNext()) {
                break;
            }
            ai next = it.next();
            Iterator<ai> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ai next2 = it2.next();
                if (next.t().equals(next2.t())) {
                    next2.a(elapsedRealtime);
                    next2.g(0);
                    m mVar = new m(true, next2.x(), next2.y(), "", "", "", "");
                    mVar.f = next2.n() + System.currentTimeMillis();
                    mVar.f5694e = next2.n();
                    com.anythink.core.common.e.a aVar = this.f4607d;
                    if (aVar != null) {
                        mVar.b(aVar.f5389c);
                    }
                    a(next2, mVar);
                    z10 = true;
                }
            }
            if (!z10) {
                if (MediationBidManager.NO_BID_TOKEN_ERROR.equals(next.z())) {
                    b(next, "No Bid Info.", 0L, -2);
                } else {
                    b(next, "No Bid Info.", elapsedRealtime, i10);
                }
                if (a(next, "No Bid Info.", i10)) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
        }
        if (this.f4608e) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("IH Bidding Success List", d.a(arrayList));
                jSONObject.put("IH Bidding Fail List", d.a(arrayList2));
            } catch (Exception unused) {
            }
            n.a(this.f4649a, jSONObject.toString(), false);
        }
        this.f.set(true);
        com.anythink.core.b.b.a aVar2 = this.f4651c;
        if (aVar2 != null) {
            aVar2.a(arrayList, arrayList2);
        }
    }

    @Override // com.anythink.core.b.d
    public final void a() {
        a((List<ai>) null, -3);
    }
}
