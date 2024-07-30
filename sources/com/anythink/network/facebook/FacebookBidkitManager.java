package com.anythink.network.facebook;

import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.common.e.a;
import com.anythink.core.common.e.ah;
import com.facebook.biddingkit.bridge.BiddingKit;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FacebookBidkitManager extends MediationBidManager {

    /* renamed from: d, reason: collision with root package name */
    private static volatile FacebookBidkitManager f12726d;

    /* renamed from: a, reason: collision with root package name */
    boolean f12727a;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, FacebookBidkitAuction> f12728b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    ConcurrentHashMap<String, FacebookBidkitAuction> f12729c = new ConcurrentHashMap<>();

    private FacebookBidkitManager() {
    }

    private void a(a aVar, MediationBidManager.BidListener bidListener) {
        try {
            if (!this.f12727a) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("timeout_ms", aVar.f);
                    jSONObject.put("auction", jSONObject2);
                } catch (Throwable unused) {
                }
                BiddingKit.init(aVar.f5387a.getApplicationContext(), jSONObject.toString());
                this.f12727a = true;
            }
            FacebookBidkitAuction facebookBidkitAuction = new FacebookBidkitAuction(aVar);
            this.f12729c.put(facebookBidkitAuction.toString(), facebookBidkitAuction);
            facebookBidkitAuction.startBidding(this.mRequestUrl, new AnonymousClass2(bidListener, facebookBidkitAuction, aVar));
        } catch (Throwable th) {
            if (bidListener != null) {
                bidListener.onBidFail(th.getMessage());
            }
        }
    }

    public static FacebookBidkitManager getInstance() {
        if (f12726d == null) {
            synchronized (FacebookBidkitManager.class) {
                if (f12726d == null) {
                    f12726d = new FacebookBidkitManager();
                }
            }
        }
        return f12726d;
    }

    public void notifyWinnerDisplay(String str, ah ahVar) {
        try {
            FacebookBidkitAuction facebookBidkitAuction = this.f12728b.get(str);
            if (facebookBidkitAuction != null) {
                facebookBidkitAuction.a(ahVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.api.MediationBidManager
    public void startBid(final a aVar, final MediationBidManager.BidListener bidListener) {
        new Thread(new Runnable() { // from class: com.anythink.network.facebook.FacebookBidkitManager.1
            @Override // java.lang.Runnable
            public final void run() {
                FacebookBidkitManager.a(FacebookBidkitManager.this, aVar, bidListener);
            }
        }).start();
    }

    public static /* synthetic */ void a(FacebookBidkitManager facebookBidkitManager, a aVar, MediationBidManager.BidListener bidListener) {
        try {
            if (!facebookBidkitManager.f12727a) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("timeout_ms", aVar.f);
                    jSONObject.put("auction", jSONObject2);
                } catch (Throwable unused) {
                }
                BiddingKit.init(aVar.f5387a.getApplicationContext(), jSONObject.toString());
                facebookBidkitManager.f12727a = true;
            }
            FacebookBidkitAuction facebookBidkitAuction = new FacebookBidkitAuction(aVar);
            facebookBidkitManager.f12729c.put(facebookBidkitAuction.toString(), facebookBidkitAuction);
            facebookBidkitAuction.startBidding(facebookBidkitManager.mRequestUrl, new AnonymousClass2(bidListener, facebookBidkitAuction, aVar));
        } catch (Throwable th) {
            if (bidListener != null) {
                bidListener.onBidFail(th.getMessage());
            }
        }
    }

    /* renamed from: com.anythink.network.facebook.FacebookBidkitManager$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements MediationBidManager.BidListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediationBidManager.BidListener f12733a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FacebookBidkitAuction f12734b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f12735c;

        public AnonymousClass2(MediationBidManager.BidListener bidListener, FacebookBidkitAuction facebookBidkitAuction, a aVar) {
            this.f12733a = bidListener;
            this.f12734b = facebookBidkitAuction;
            this.f12735c = aVar;
        }

        public final void onBidStart(ah ahVar, ATBaseAdAdapter aTBaseAdAdapter) {
            MediationBidManager.BidListener bidListener = this.f12733a;
            if (bidListener != null) {
                bidListener.onBidStart(ahVar, aTBaseAdAdapter);
            }
        }

        @Override // com.anythink.core.api.MediationBidManager.BidListener
        public final void onBidSuccess(List<ah> list) {
            FacebookBidkitManager.this.f12729c.remove(this.f12734b);
            FacebookBidkitManager.this.f12728b.put(this.f12735c.f5390d, this.f12734b);
            MediationBidManager.BidListener bidListener = this.f12733a;
            if (bidListener != null) {
                bidListener.onBidSuccess(list);
            }
        }

        @Override // com.anythink.core.api.MediationBidManager.BidListener
        public final void onBidFail(String str) {
        }
    }
}
