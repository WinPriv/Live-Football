package com.anythink.network.onlineapi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.b;
import com.anythink.basead.d.h;
import com.anythink.basead.e.a;
import com.anythink.basead.ui.OwnNativeAdView;
import com.anythink.core.common.e.e;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import java.util.List;

/* loaded from: classes.dex */
public class OnlineApiATNativeAd extends CustomNativeAd {

    /* renamed from: a, reason: collision with root package name */
    h f12794a;

    /* renamed from: b, reason: collision with root package name */
    Context f12795b;

    /* renamed from: c, reason: collision with root package name */
    View f12796c;

    public OnlineApiATNativeAd(Context context, h hVar) {
        this.f12795b = context.getApplicationContext();
        this.f12794a = hVar;
        hVar.a(new a() { // from class: com.anythink.network.onlineapi.OnlineApiATNativeAd.1
            @Override // com.anythink.basead.e.a
            public final void onAdClick(int i10) {
                e detail = OnlineApiATNativeAd.this.getDetail();
                if (detail != null) {
                    detail.x(i10);
                }
                OnlineApiATNativeAd.this.notifyAdClicked();
            }

            @Override // com.anythink.basead.e.a
            public final void onAdShow() {
                OnlineApiATNativeAd.this.notifyAdImpression();
            }

            @Override // com.anythink.basead.e.a
            public final void onDeeplinkCallback(boolean z10) {
                OnlineApiATNativeAd.this.notifyDeeplinkCallback(z10);
            }

            @Override // com.anythink.basead.e.a
            public final void onAdClosed() {
            }

            @Override // com.anythink.basead.e.a
            public final void onShowFailed(com.anythink.basead.c.e eVar) {
            }
        });
        setNetworkInfoMap(b.a(this.f12794a.a()));
        setAdChoiceIconUrl(this.f12794a.g());
        setTitle(this.f12794a.b());
        setDescriptionText(this.f12794a.c());
        setIconImageUrl(this.f12794a.e());
        setMainImageUrl(this.f12794a.f());
        setCallToActionText(this.f12794a.d());
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void clear(View view) {
        h hVar = this.f12794a;
        if (hVar != null) {
            hVar.i();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        h hVar = this.f12794a;
        if (hVar != null) {
            hVar.a((a) null);
            this.f12794a.j();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.f12796c == null) {
            this.f12796c = this.f12794a.a(this.f12795b, false, false, null);
        }
        return this.f12796c;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        if (this.f12794a != null) {
            return new OwnNativeAdView(this.f12795b);
        }
        return null;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.f12794a != null) {
            List<View> clickViewList = aTNativePrepareInfo.getClickViewList();
            if (clickViewList != null && clickViewList.size() > 0) {
                this.f12794a.a(view, clickViewList);
            } else {
                this.f12794a.a(view);
            }
        }
    }
}
