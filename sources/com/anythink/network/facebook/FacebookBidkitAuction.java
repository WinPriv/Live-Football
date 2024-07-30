package com.anythink.network.facebook;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.b.i;
import com.anythink.core.common.e.ah;
import com.facebook.biddingkit.auction.Auction;
import com.facebook.biddingkit.auction.AuctionListener;
import com.facebook.biddingkit.gen.Bid;
import com.facebook.biddingkit.waterfall.Waterfall;
import com.facebook.biddingkit.waterfall.WaterfallEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FacebookBidkitAuction {

    /* renamed from: a, reason: collision with root package name */
    Context f12699a;

    /* renamed from: b, reason: collision with root package name */
    int f12700b;

    /* renamed from: c, reason: collision with root package name */
    List<ah> f12701c;

    /* renamed from: d, reason: collision with root package name */
    List<ah> f12702d;

    /* renamed from: e, reason: collision with root package name */
    ConcurrentHashMap<String, WaterfallEntry> f12703e;
    Auction f;

    /* renamed from: g, reason: collision with root package name */
    com.anythink.core.common.e.a f12704g;

    /* renamed from: h, reason: collision with root package name */
    Auction.Builder f12705h;

    /* renamed from: i, reason: collision with root package name */
    Map<String, ah> f12706i;

    /* renamed from: j, reason: collision with root package name */
    String f12707j;

    /* renamed from: k, reason: collision with root package name */
    MediationBidManager.BidListener f12708k;

    /* renamed from: l, reason: collision with root package name */
    Handler f12709l;

    /* renamed from: n, reason: collision with root package name */
    private final String f12711n = getClass().getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    Runnable f12710m = new Runnable() { // from class: com.anythink.network.facebook.FacebookBidkitAuction.1
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.network.facebook.FacebookBidkitAuction.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    FacebookBidkitAuction.a(FacebookBidkitAuction.this);
                }
            });
        }
    };

    /* loaded from: classes.dex */
    public class a implements WaterfallEntry, Comparable<a> {

        /* renamed from: b, reason: collision with root package name */
        private Bid f12721b;

        /* renamed from: c, reason: collision with root package name */
        private double f12722c;

        /* renamed from: d, reason: collision with root package name */
        private String f12723d;

        public a(Bid bid, double d10, String str) {
            this.f12721b = bid;
            this.f12722c = d10;
            this.f12723d = str;
        }

        public Bid getBid() {
            return this.f12721b;
        }

        public double getCPMCents() {
            return this.f12722c;
        }

        public String getEntryName() {
            return this.f12723d;
        }

        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            return aVar.getCPMCents() > getCPMCents() ? 1 : -1;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Waterfall {

        /* renamed from: a, reason: collision with root package name */
        SortedSet<WaterfallEntry> f12724a = new TreeSet();

        public b() {
        }

        public final Waterfall createWaterfallCopy() {
            b bVar = new b();
            Iterator<WaterfallEntry> it = this.f12724a.iterator();
            while (it.hasNext()) {
                bVar.insert(it.next());
            }
            return bVar;
        }

        public final Iterable<WaterfallEntry> entries() {
            return this.f12724a;
        }

        public final WaterfallEntry getFirst() {
            return this.f12724a.first();
        }

        public final void insert(WaterfallEntry waterfallEntry) {
            this.f12724a.add(waterfallEntry);
        }

        public final int size() {
            return this.f12724a.size();
        }

        public final void insert(Bid bid) {
            this.f12724a.add(new a(bid, bid.getPrice(), bid.getBidderName()));
        }
    }

    public FacebookBidkitAuction(com.anythink.core.common.e.a aVar) {
        this.f12699a = aVar.f5387a;
        this.f12700b = aVar.f5391e;
        this.f12701c = aVar.f5394i;
        List list = aVar.f5395j;
        if (list == null) {
            this.f12702d = new ArrayList(4);
        } else {
            this.f12702d = list;
        }
        this.f12704g = aVar;
        this.f12705h = new Auction.Builder();
        this.f12706i = new HashMap();
        this.f12709l = new Handler(Looper.getMainLooper());
    }

    public void startBidding(final String str, final MediationBidManager.BidListener bidListener) {
        this.f12707j = str;
        this.f12708k = bidListener;
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(8);
        for (ah ahVar : this.f12701c) {
            concurrentHashMap.put(ahVar.t(), ahVar);
            new i(this.f12704g).a(ahVar, new i.a() { // from class: com.anythink.network.facebook.FacebookBidkitAuction.2
                private void a(ah ahVar2, Map<String, ah> map) {
                    FacebookBidkitAuction facebookBidkitAuction;
                    Handler handler;
                    map.remove(ahVar2.t());
                    if (map.size() == 0 && (handler = (facebookBidkitAuction = FacebookBidkitAuction.this).f12709l) != null) {
                        handler.removeCallbacks(facebookBidkitAuction.f12710m);
                    }
                }

                public final void onBidTokenObtainFail(String str2, ah ahVar2) {
                    a(ahVar2, concurrentHashMap);
                    ahVar2.h(str2);
                    if (concurrentHashMap.size() == 0) {
                        FacebookBidkitAuction.this.a(str, bidListener);
                    }
                }

                public final void onBidTokenObtainStart(ah ahVar2, ATBaseAdAdapter aTBaseAdAdapter) {
                    MediationBidManager.BidListener bidListener2 = bidListener;
                    if (bidListener2 != null) {
                        bidListener2.onBidStart(ahVar2, aTBaseAdAdapter);
                    }
                }

                public final void onBidTokenObtainSuccess(ah ahVar2, JSONObject jSONObject) {
                    a(ahVar2, concurrentHashMap);
                    FacebookBidkitAuction.a(FacebookBidkitAuction.this, ahVar2, jSONObject);
                    if (concurrentHashMap.size() == 0) {
                        FacebookBidkitAuction.this.a(str, bidListener);
                    }
                }
            });
        }
        long t10 = this.f12704g.f5399n.t();
        Handler handler = this.f12709l;
        if (handler != null) {
            Runnable runnable = this.f12710m;
            if (t10 <= 0) {
                t10 = 500;
            }
            handler.postDelayed(runnable, t10);
        }
    }

    private void a() {
        a(this.f12707j, this.f12708k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final MediationBidManager.BidListener bidListener) {
        if (this.f12706i.size() == 0) {
            if (bidListener != null) {
                bidListener.onBidSuccess(new ArrayList(1));
                return;
            }
            return;
        }
        b bVar = new b();
        for (ah ahVar : this.f12702d) {
            bVar.insert(new a(null, 100.0d * ahVar.ag(), ahVar.t()));
        }
        Auction build = this.f12705h.build();
        this.f = build;
        build.startRemoteAuction(str, bVar, new AuctionListener() { // from class: com.anythink.network.facebook.FacebookBidkitAuction.3
            public final void onAuctionCompleted(Waterfall waterfall) {
                FacebookBidkitAuction facebookBidkitAuction = FacebookBidkitAuction.this;
                facebookBidkitAuction.a(facebookBidkitAuction.f12706i, waterfall, bidListener);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115 A[Catch: all -> 0x012e, TryCatch #2 {all -> 0x012e, blocks: (B:51:0x00d1, B:53:0x00d9, B:62:0x0117, B:66:0x0112, B:67:0x0115, B:68:0x00fc, B:71:0x0104), top: B:50:0x00d1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.anythink.core.common.e.ah r17, org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.network.facebook.FacebookBidkitAuction.a(com.anythink.core.common.e.ah, org.json.JSONObject):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Map<String, ah> map, Waterfall waterfall, MediationBidManager.BidListener bidListener) {
        ArrayList arrayList = new ArrayList();
        if (this.f12703e == null) {
            this.f12703e = new ConcurrentHashMap<>();
        }
        for (WaterfallEntry waterfallEntry : waterfall.entries()) {
            String entryName = waterfallEntry.getEntryName();
            Bid bid = waterfallEntry.getBid();
            if (bid != null) {
                if ("FACEBOOK_BIDDER".equals(entryName)) {
                    ah ahVar = map.get(bid.getPlacementId());
                    ahVar.g(bid.getPayload());
                    ahVar.a(bid.getPrice() / 100.0d);
                    ahVar.d(bid.getPrice() / 100.0d);
                    arrayList.add(ahVar);
                    this.f12703e.put(ahVar.t(), waterfallEntry);
                }
                if ("IRONSOURCE_BIDDER".equals(entryName)) {
                    ah ahVar2 = map.get(bid.getPlacementId());
                    ahVar2.g(bid.getPayload());
                    ahVar2.a(bid.getPrice() / 100.0d);
                    ahVar2.d(bid.getPrice() / 100.0d);
                    arrayList.add(ahVar2);
                    this.f12703e.put(ahVar2.t(), waterfallEntry);
                }
            } else {
                this.f12703e.put(waterfallEntry.getEntryName(), waterfallEntry);
            }
        }
        if (bidListener != null) {
            bidListener.onBidSuccess(arrayList);
        }
    }

    public final synchronized void a(ah ahVar) {
        WaterfallEntry waterfallEntry;
        ConcurrentHashMap<String, WaterfallEntry> concurrentHashMap = this.f12703e;
        if (concurrentHashMap != null && (waterfallEntry = concurrentHashMap.get(ahVar.t())) != null && this.f != null) {
            if (ATSDK.isNetworkLogDebug()) {
                Log.i(this.f12711n, "notifyWinnerDisplay:" + waterfallEntry.getEntryName());
            }
            this.f.notifyDisplayWinner(waterfallEntry);
        }
    }

    public static /* synthetic */ void a(FacebookBidkitAuction facebookBidkitAuction) {
        facebookBidkitAuction.a(facebookBidkitAuction.f12707j, facebookBidkitAuction.f12708k);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115 A[Catch: all -> 0x012e, TryCatch #2 {all -> 0x012e, blocks: (B:51:0x00d1, B:53:0x00d9, B:62:0x0117, B:66:0x0112, B:67:0x0115, B:68:0x00fc, B:71:0x0104), top: B:50:0x00d1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.anythink.network.facebook.FacebookBidkitAuction r16, com.anythink.core.common.e.ah r17, org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.network.facebook.FacebookBidkitAuction.a(com.anythink.network.facebook.FacebookBidkitAuction, com.anythink.core.common.e.ah, org.json.JSONObject):void");
    }
}
