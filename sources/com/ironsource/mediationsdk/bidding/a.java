package com.ironsource.mediationsdk.bidding;

import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.f;
import com.ironsource.sdk.a.e;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a implements Callable<e> {

    /* renamed from: a, reason: collision with root package name */
    public final int f25355a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25356b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f25357c;

    /* renamed from: d, reason: collision with root package name */
    public final AdapterBidderInterface f25358d;

    /* renamed from: com.ironsource.mediationsdk.bidding.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0330a implements BiddingDataCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f25359a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f25360b;

        public C0330a(f fVar, ArrayBlockingQueue arrayBlockingQueue) {
            this.f25359a = fVar;
            this.f25360b = arrayBlockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public final void onFailure(String str) {
            a aVar = a.this;
            this.f25360b.add(new e(aVar.f25355a, aVar.f25356b, null, f.a(this.f25359a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public final void onSuccess(Map<String, Object> map) {
            a aVar = a.this;
            this.f25360b.add(new e(aVar.f25355a, aVar.f25356b, map, f.a(this.f25359a), null));
        }
    }

    public a(int i10, String str, JSONObject jSONObject, AdapterBidderInterface adapterBidderInterface) {
        this.f25355a = i10;
        this.f25356b = str;
        this.f25357c = jSONObject;
        this.f25358d = adapterBidderInterface;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ e call() {
        f fVar = new f();
        IronLog.INTERNAL.verbose(this.f25356b + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        this.f25358d.collectBiddingData(this.f25357c, new C0330a(fVar, arrayBlockingQueue));
        return (e) arrayBlockingQueue.take();
    }
}
