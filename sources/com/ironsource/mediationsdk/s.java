package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.a;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet<ImpressionDataListener> f25807a;

    /* renamed from: b, reason: collision with root package name */
    public final a f25808b = new a();

    /* renamed from: c, reason: collision with root package name */
    public IronSourceSegment f25809c;

    /* renamed from: d, reason: collision with root package name */
    public AdInfo f25810d;

    public s(HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        this.f25807a = new HashSet<>();
        this.f25807a = hashSet;
        this.f25809c = ironSourceSegment;
    }

    public static String d() {
        return "fallback_" + System.currentTimeMillis();
    }

    public final void a(IronSourceSegment ironSourceSegment) {
        this.f25809c = ironSourceSegment;
    }

    public final void a_() {
        this.f25810d = null;
    }

    public final void b(com.ironsource.mediationsdk.c.b bVar, String str) {
        if (bVar == null) {
            IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
            return;
        }
        ImpressionData b10 = bVar.b(str);
        if (b10 != null) {
            Iterator<ImpressionDataListener> it = this.f25807a.iterator();
            while (it.hasNext()) {
                ImpressionDataListener next = it.next();
                IronLog.CALLBACK.info("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + b10);
                next.onImpressionSuccess(b10);
            }
        }
    }

    public final void c(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        boolean z10 = false;
        if (jSONObject != null) {
            z10 = jSONObject.optBoolean("isAdUnitCapped", false);
        }
        this.f25808b.a(ad_unit, z10);
    }

    public final void a(ImpressionData impressionData) {
        if (impressionData != null) {
            this.f25810d = new AdInfo(impressionData);
        }
    }

    public final void b() {
        synchronized (this) {
            this.f25807a.clear();
        }
    }

    public final void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f25807a.add(impressionDataListener);
        }
    }

    public final void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f25807a.remove(impressionDataListener);
        }
    }
}
