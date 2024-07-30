package com.anythink.core.b;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBiddingNotice;
import com.anythink.core.api.ATBiddingResult;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.l;
import com.anythink.core.common.e.m;
import com.anythink.core.common.k.n;
import com.anythink.core.common.k.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4537a = "a";

    /* renamed from: b, reason: collision with root package name */
    private List<ai> f4538b;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.b.b.a f4539c;

    /* renamed from: g, reason: collision with root package name */
    private long f4540g;

    public a(com.anythink.core.common.e.a aVar) {
        super(aVar);
        this.f4538b = Collections.synchronizedList(new ArrayList(this.f4607d.f5394i));
    }

    @Override // com.anythink.core.b.d
    public final void a(com.anythink.core.b.b.a aVar) {
        this.f4539c = aVar;
        List<ai> list = this.f4607d.f5394i;
        int size = list.size();
        this.f4540g = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            final ai aiVar = list.get(i10);
            ATBaseAdAdapter a10 = com.anythink.core.common.k.i.a(aiVar);
            if (a10 == null) {
                a(false, ATBiddingResult.fail(aiVar.h() + "not exist!"), aiVar, -9, (com.anythink.core.b.c.a) null);
            } else {
                try {
                    com.anythink.core.b.b.b bVar = new com.anythink.core.b.b.b(a10) { // from class: com.anythink.core.b.a.1
                        private void a(final ATBiddingResult aTBiddingResult, final com.anythink.core.b.c.a aVar2) {
                            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.b.a.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i11;
                                    if (aTBiddingResult.isSuccessWithUseType()) {
                                        i11 = 0;
                                    } else {
                                        i11 = -1;
                                    }
                                    a.this.a(aTBiddingResult.isSuccessWithUseType(), aTBiddingResult, aiVar, i11, aVar2);
                                }
                            });
                        }

                        @Override // com.anythink.core.api.ATBiddingListener
                        public final void onC2SBidResult(ATBiddingResult aTBiddingResult) {
                            ATBaseAdAdapter aTBaseAdAdapter = this.f4600c;
                            if (aTBaseAdAdapter != null) {
                                aTBaseAdAdapter.releaseLoadResource();
                            }
                            a(aTBiddingResult, null);
                        }

                        @Override // com.anythink.core.api.ATBiddingListener
                        public final void onC2SBiddingResultWithCache(ATBiddingResult aTBiddingResult, BaseAd baseAd) {
                            ATBaseAdAdapter aTBaseAdAdapter = this.f4600c;
                            if (aTBaseAdAdapter != null) {
                                aTBaseAdAdapter.releaseLoadResource();
                            }
                            a(aTBiddingResult, new com.anythink.core.b.c.a(this.f4600c, baseAd));
                        }
                    };
                    a10.getNetworkName();
                    com.anythink.core.c.d a11 = com.anythink.core.c.e.a(this.f4607d.f5387a).a(this.f4607d.f5390d);
                    com.anythink.core.common.e.a aVar2 = this.f4607d;
                    Map<String, Object> a12 = a11.a(aVar2.f5390d, aVar2.f5389c, aiVar);
                    try {
                        double a13 = aiVar.a(a11);
                        if (a13 > 0.0d) {
                            a12.put("bid_floor", Double.valueOf(a13 * a(aiVar)));
                        }
                    } catch (Throwable th) {
                        Log.w(n.f6219a, "C2S startBidRequest with exception:" + th.getMessage());
                    }
                    com.anythink.core.common.e.e N = this.f4607d.f5403s.N();
                    s.a(N, aiVar, 0, false);
                    com.anythink.core.common.k.g.a(a12, N);
                    com.anythink.core.common.e.a aVar3 = this.f4607d;
                    if (aVar3.f5405u == 8) {
                        double d10 = aVar3.f5406v;
                        a12.put(g.k.f5118j, d10 < 0.0d ? "0" : Double.valueOf(d10));
                    }
                    com.anythink.core.common.j jVar = this.f4607d.f5388b;
                    Context a14 = jVar != null ? jVar.a() : null;
                    if (a14 == null) {
                        a14 = this.f4607d.f5387a;
                    }
                    boolean internalStartBiddingRequest = a10.internalStartBiddingRequest(a14, a12, this.f4607d.f5401q, bVar);
                    aVar.a(aiVar, a10);
                    if (!internalStartBiddingRequest) {
                        a(ATBiddingResult.fail("This network don't support head bidding in current TopOn's version."), aiVar);
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    a(ATBiddingResult.fail(th2.getMessage()), aiVar);
                }
            }
        }
    }

    private void a(ai aiVar, l lVar, long j10, int i10, com.anythink.core.b.c.a aVar) {
        if (lVar.isSuccessWithUseType()) {
            aiVar.a(j10);
            aiVar.a(lVar.currency);
            aiVar.t();
            aiVar.c();
            lVar.getPrice();
            lVar.getSortPrice();
            lVar.currency.toString();
            double a10 = a(lVar.getSortPrice(), aiVar);
            if (a10 <= 0.0d) {
                Log.w(n.f6219a, "NetworkName:" + aiVar.d() + ",AdSoruceId:" + aiVar.t() + " c2s price return 0,please check network placement c2s config");
                a10 = com.anythink.core.common.k.g.a(aiVar);
            }
            m mVar = new m(true, a10, lVar.token, lVar.winNoticeUrl, lVar.loseNoticeUrl, lVar.displayNoticeUrl, "");
            mVar.f5700l = a(aiVar);
            mVar.setBiddingNotice(lVar.biddingNotice);
            mVar.f = System.currentTimeMillis() + aiVar.n();
            mVar.f5694e = aiVar.n();
            mVar.f5699k = aiVar.t();
            mVar.f5693d = aiVar.c();
            mVar.f5705r = aVar;
            mVar.f5706s = aVar != null;
            com.anythink.core.common.e.a aVar2 = this.f4607d;
            if (aVar2 != null) {
                mVar.b(aVar2.f5389c);
            }
            a(aiVar.c(), mVar, 0.0d);
            a(aiVar, mVar);
            String str = g.i.f;
            com.anythink.core.common.e.a aVar3 = this.f4607d;
            n.a(str, aVar3.f5390d, com.anythink.core.common.k.g.d(String.valueOf(aVar3.f5391e)), aiVar);
            return;
        }
        d.a(aiVar, lVar.errorMsg, j10, i10);
        String str2 = g.i.f5079g;
        com.anythink.core.common.e.a aVar4 = this.f4607d;
        n.a(str2, aVar4.f5390d, com.anythink.core.common.k.g.d(String.valueOf(aVar4.f5391e)), aiVar);
    }

    @Override // com.anythink.core.b.d
    public final void a(ai aiVar, l lVar, long j10) {
        a(aiVar, lVar, j10, -1, (com.anythink.core.b.c.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z10, ATBiddingResult aTBiddingResult, ai aiVar, int i10, com.anythink.core.b.c.a aVar) {
        boolean z11;
        ATBiddingNotice aTBiddingNotice;
        if (z10) {
            f a10 = f.a();
            String t10 = aiVar.t();
            ConcurrentHashMap<String, Integer> concurrentHashMap = a10.f4646e;
            if (concurrentHashMap != null) {
                if (concurrentHashMap.get(t10 + "_c2sfirstStatus") != null) {
                    z11 = false;
                    com.anythink.core.common.j.c.a(this.f4607d.f5390d, aiVar, z11, SystemClock.elapsedRealtime() - this.f4540g, this.f4607d);
                }
            }
            z11 = true;
            com.anythink.core.common.j.c.a(this.f4607d.f5390d, aiVar, z11, SystemClock.elapsedRealtime() - this.f4540g, this.f4607d);
        }
        f a11 = f.a();
        String t11 = aiVar.t();
        if (a11.f4646e == null) {
            a11.f4646e = new ConcurrentHashMap<>();
        }
        a11.f4646e.put(t11 + "_c2sfirstStatus", 1);
        if (this.f.get()) {
            if (aTBiddingResult != null && (aTBiddingNotice = aTBiddingResult.biddingNotice) != null) {
                aTBiddingNotice.notifyBidLoss("2", 0.0d, new HashMap(1));
            }
            return;
        }
        a(aiVar, aTBiddingResult, SystemClock.elapsedRealtime() - this.f4540g, i10, aVar);
        List<ai> synchronizedList = Collections.synchronizedList(new ArrayList(1));
        synchronizedList.add(aiVar);
        this.f4538b.remove(aiVar);
        if (this.f4538b.size() == 0) {
            this.f.set(true);
        }
        if (this.f4539c != null) {
            if (!z10 ? a(aiVar, aTBiddingResult.errorMsg, -1) : z10) {
                this.f4539c.a(synchronizedList, (List<ai>) null);
                return;
            }
            this.f4539c.a((List<ai>) null, synchronizedList);
        }
    }

    private synchronized void a(ATBiddingResult aTBiddingResult, ai aiVar) {
        a(false, aTBiddingResult, aiVar, -1, (com.anythink.core.b.c.a) null);
    }

    private static ATBiddingResult a(String str) {
        return ATBiddingResult.fail(str);
    }

    @Override // com.anythink.core.b.d
    public final synchronized void a() {
        if (!this.f.get()) {
            this.f.set(true);
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            for (ai aiVar : this.f4538b) {
                if (a(aiVar, "bid timeout", -3)) {
                    arrayList.add(aiVar);
                } else {
                    a(aiVar, ATBiddingResult.fail("bid timeout!"), SystemClock.elapsedRealtime() - this.f4540g, -3, (com.anythink.core.b.c.a) null);
                    arrayList2.add(aiVar);
                }
            }
            this.f4538b.clear();
            this.f.set(true);
            com.anythink.core.b.b.a aVar = this.f4539c;
            if (aVar != null) {
                aVar.a(arrayList, arrayList2);
            }
            this.f4539c = null;
        }
    }
}
