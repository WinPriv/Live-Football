package com.applovin.mediation.hybridAds;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.r;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.hybridAds.a;

/* loaded from: classes.dex */
public class b extends Activity implements a.InterfaceC0226a {

    /* renamed from: a, reason: collision with root package name */
    protected a f19603a;

    /* renamed from: b, reason: collision with root package name */
    protected c f19604b = new c(null);

    /* renamed from: c, reason: collision with root package name */
    private p f19605c;

    /* renamed from: d, reason: collision with root package name */
    private MaxAdapterListener f19606d;

    public void a(com.applovin.impl.mediation.a.c cVar, p pVar, MaxAdapterListener maxAdapterListener) {
        this.f19605c = pVar;
        this.f19606d = maxAdapterListener;
        this.f19604b = cVar.p();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z10 = true;
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(com.anythink.expressad.exoplayer.b.f7294bc);
        getWindow().addFlags(128);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        viewGroup.setBackgroundColor(this.f19604b.a());
        p pVar = this.f19605c;
        if (pVar != null) {
            z10 = ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cR)).booleanValue();
        }
        com.applovin.impl.sdk.utils.b.a(z10, this);
        a aVar = new a(this.f19604b, this);
        this.f19603a = aVar;
        aVar.setListener(this);
        this.f19603a.setVisibility(4);
        viewGroup.addView(this.f19603a);
        r.a(this.f19603a, this.f19604b.f());
        MaxAdapterListener maxAdapterListener = this.f19606d;
        if (maxAdapterListener == null) {
            return;
        }
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayed();
        } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayed();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        MaxAdapterListener maxAdapterListener = this.f19606d;
        if (maxAdapterListener != null) {
            if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
                ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdHidden();
            } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdHidden();
            }
        }
        super.onDestroy();
    }

    @Override // com.applovin.mediation.hybridAds.a.InterfaceC0226a
    public void a(a aVar) {
        if (isFinishing()) {
            return;
        }
        finish();
    }
}
