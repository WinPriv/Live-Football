package com.ironsource.sdk.g;

/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public String f26468a;

    /* renamed from: b, reason: collision with root package name */
    public String f26469b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26470c;

    public a(String str) {
        super(str);
        boolean z10;
        if (a("type")) {
            d("type");
        }
        if (a("numOfAdUnits")) {
            this.f26469b = d("numOfAdUnits");
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26470c = z10;
        if (a("firstCampaignCredits")) {
            d("firstCampaignCredits");
        }
        if (a("totalNumberCredits")) {
            d("totalNumberCredits");
        }
        if (a("productType")) {
            this.f26468a = d("productType");
        }
    }
}
