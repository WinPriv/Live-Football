package com.anythink.core.b;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.k.s;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static String f4654a = "i";

    /* renamed from: b, reason: collision with root package name */
    com.anythink.core.common.e.a f4655b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f4656c;

    /* renamed from: d, reason: collision with root package name */
    a f4657d;

    /* renamed from: com.anythink.core.b.i$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATBaseAdAdapter f4658a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ai f4659b;

        public AnonymousClass1(ATBaseAdAdapter aTBaseAdAdapter, ai aiVar) {
            this.f4658a = aTBaseAdAdapter;
            this.f4659b = aiVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.a(i.this, this.f4658a, this.f4659b);
        }
    }

    /* renamed from: com.anythink.core.b.i$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements ATBidRequestInfoListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ai f4661a;

        public AnonymousClass2(ai aiVar) {
            this.f4661a = aiVar;
        }

        @Override // com.anythink.core.api.ATBidRequestInfoListener
        public final void onFailed(String str) {
            a aVar = i.this.f4657d;
            if (aVar != null) {
                aVar.a(str, this.f4661a);
            }
        }

        @Override // com.anythink.core.api.ATBidRequestInfoListener
        public final void onSuccess(ATBidRequestInfo aTBidRequestInfo) {
            i.a(i.this, this.f4661a, aTBidRequestInfo);
        }
    }

    /* renamed from: com.anythink.core.b.i$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATBidRequestInfo f4663a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ai f4664b;

        public AnonymousClass3(ATBidRequestInfo aTBidRequestInfo, ai aiVar) {
            this.f4663a = aTBidRequestInfo;
            this.f4664b = aiVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject requestJSONObject;
            try {
                ATBidRequestInfo aTBidRequestInfo = this.f4663a;
                if (aTBidRequestInfo != null && (requestJSONObject = aTBidRequestInfo.toRequestJSONObject()) != null) {
                    ATBidRequestInfo.fillBaseCommonParams(requestJSONObject, String.valueOf(i.this.f4655b.f5391e), i.this.f4655b.f5399n, this.f4664b);
                    if (this.f4664b.l() == 3) {
                        try {
                            requestJSONObject.put("unit_id", this.f4664b.t());
                            requestJSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.EXCLUDE_OFFER, n.a().l());
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    a aVar = i.this.f4657d;
                    if (aVar != null) {
                        aVar.a(this.f4664b, requestJSONObject);
                        return;
                    }
                    return;
                }
                a aVar2 = i.this.f4657d;
                if (aVar2 != null) {
                    aVar2.a(ATBidRequestInfo.RETURN_PARAMS_ERROR_TYPE, this.f4664b);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                a aVar3 = i.this.f4657d;
                if (aVar3 != null) {
                    aVar3.a(th2.getMessage(), this.f4664b);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(ai aiVar, ATBaseAdAdapter aTBaseAdAdapter);

        void a(ai aiVar, JSONObject jSONObject);

        void a(String str, ai aiVar);
    }

    public i(com.anythink.core.common.e.a aVar) {
        this.f4655b = aVar;
        this.f4656c = aVar.f5401q;
    }

    private void a(ai aiVar, a aVar) {
        this.f4657d = aVar;
        ATBaseAdAdapter a10 = com.anythink.core.common.k.i.a(aiVar);
        if (a10 == null) {
            aVar.a(ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE, aiVar);
        } else {
            com.anythink.core.common.k.b.a.a().a(new AnonymousClass1(a10, aiVar));
        }
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter, ai aiVar) {
        try {
            com.anythink.core.common.e.a aVar = this.f4655b;
            Map<String, Object> a10 = aVar.f5399n.a(aVar.f5390d, aVar.f5389c, aiVar);
            com.anythink.core.common.e.e N = this.f4655b.f5403s.N();
            s.a(N, aiVar, 0, false);
            com.anythink.core.common.k.g.a(a10, N);
            aTBaseAdAdapter.getBidRequestInfo(this.f4655b.f5387a, a10, this.f4656c, new AnonymousClass2(aiVar));
            a aVar2 = this.f4657d;
            if (aVar2 != null) {
                aVar2.a(aiVar, aTBaseAdAdapter);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            a aVar3 = this.f4657d;
            if (aVar3 != null) {
                aVar3.a(th.getMessage(), aiVar);
            }
        }
    }

    private void a(ai aiVar, ATBidRequestInfo aTBidRequestInfo) {
        com.anythink.core.common.k.b.a.a().a(new AnonymousClass3(aTBidRequestInfo, aiVar));
    }

    public static /* synthetic */ void a(i iVar, ATBaseAdAdapter aTBaseAdAdapter, ai aiVar) {
        try {
            com.anythink.core.common.e.a aVar = iVar.f4655b;
            Map<String, Object> a10 = aVar.f5399n.a(aVar.f5390d, aVar.f5389c, aiVar);
            com.anythink.core.common.e.e N = iVar.f4655b.f5403s.N();
            s.a(N, aiVar, 0, false);
            com.anythink.core.common.k.g.a(a10, N);
            aTBaseAdAdapter.getBidRequestInfo(iVar.f4655b.f5387a, a10, iVar.f4656c, new AnonymousClass2(aiVar));
            a aVar2 = iVar.f4657d;
            if (aVar2 != null) {
                aVar2.a(aiVar, aTBaseAdAdapter);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            a aVar3 = iVar.f4657d;
            if (aVar3 != null) {
                aVar3.a(th.getMessage(), aiVar);
            }
        }
    }

    public static /* synthetic */ void a(i iVar, ai aiVar, ATBidRequestInfo aTBidRequestInfo) {
        com.anythink.core.common.k.b.a.a().a(new AnonymousClass3(aTBidRequestInfo, aiVar));
    }
}
