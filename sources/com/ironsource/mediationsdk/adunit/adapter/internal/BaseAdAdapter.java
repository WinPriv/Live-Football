package com.ironsource.mediationsdk.adunit.adapter.internal;

import android.app.Activity;
import com.ironsource.mediationsdk.C1416d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* loaded from: classes2.dex */
public abstract class BaseAdAdapter<NetworkAdapter extends AdapterBaseInterface, Listener> {

    /* renamed from: a, reason: collision with root package name */
    public final IronSource.AD_UNIT f25124a;

    /* renamed from: b, reason: collision with root package name */
    public final NetworkSettings f25125b;

    public BaseAdAdapter(IronSource.AD_UNIT ad_unit, NetworkSettings networkSettings) {
        this.f25124a = ad_unit;
        this.f25125b = networkSettings;
    }

    public NetworkAdapter getNetworkAdapter() {
        NetworkAdapter networkadapter = (NetworkAdapter) C1416d.a().a(this.f25125b, this.f25124a);
        if (networkadapter != null) {
            return networkadapter;
        }
        return null;
    }

    public abstract void loadAd(AdData adData, Activity activity, Listener listener);

    public void releaseMemory() {
    }
}
