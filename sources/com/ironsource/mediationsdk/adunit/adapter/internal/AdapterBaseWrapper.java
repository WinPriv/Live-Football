package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.mediationsdk.model.NetworkSettings;

/* loaded from: classes2.dex */
public class AdapterBaseWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final AdapterBaseInterface f25122a;

    /* renamed from: b, reason: collision with root package name */
    public final NetworkSettings f25123b;

    public AdapterBaseWrapper(AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        this.f25122a = adapterBaseInterface;
        this.f25123b = networkSettings;
    }

    public AdapterBaseInterface getAdapterBaseInterface() {
        return this.f25122a;
    }

    public NetworkSettings getSettings() {
        return this.f25123b;
    }
}
