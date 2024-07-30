package com.vungle.warren.model;

import com.huawei.openalliance.ad.constant.av;
import com.vungle.warren.model.token.Consent;
import com.vungle.warren.model.token.Device;
import com.vungle.warren.model.token.Request;
import n8.b;

/* loaded from: classes2.dex */
public class BidTokenV3 {

    @b(av.O)
    private Consent consent;

    @b("device")
    private Device device;

    @b("request")
    private Request request;

    public BidTokenV3(Device device, Request request, Consent consent) {
        this.device = device;
        this.request = request;
        this.consent = consent;
    }

    public Consent getConsent() {
        return this.consent;
    }

    public Device getDevice() {
        return this.device;
    }

    public Request getRequest() {
        return this.request;
    }
}
