package com.applovin.mediation.hybridAds;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.sdk.p;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;

/* loaded from: classes.dex */
public class MaxHybridMRecAdActivity extends b {

    /* renamed from: c, reason: collision with root package name */
    private View f19598c;

    public void a(com.applovin.impl.mediation.a.c cVar, View view, p pVar, MaxAdapterListener maxAdapterListener) {
        super.a(cVar, pVar, maxAdapterListener);
        this.f19598c = view;
    }

    @Override // com.applovin.mediation.hybridAds.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ViewGroup) findViewById(R.id.content)).addView(this.f19598c);
        this.f19603a.bringToFront();
    }
}
