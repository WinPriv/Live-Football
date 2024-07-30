package com.anythink.network.myoffer;

import android.content.Context;
import android.view.View;
import com.anythink.basead.b;
import com.anythink.basead.e.a;
import com.anythink.basead.f.e;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import java.util.List;

/* loaded from: classes.dex */
public class MyOfferATNativeAd extends CustomNativeAd {

    /* renamed from: a, reason: collision with root package name */
    e f12757a;

    /* renamed from: b, reason: collision with root package name */
    Context f12758b;

    /* renamed from: c, reason: collision with root package name */
    View f12759c;

    public MyOfferATNativeAd(Context context, e eVar) {
        this.f12758b = context.getApplicationContext();
        this.f12757a = eVar;
        eVar.a(new a() { // from class: com.anythink.network.myoffer.MyOfferATNativeAd.1
            @Override // com.anythink.basead.e.a
            public final void onAdClick(int i10) {
                com.anythink.core.common.e.e detail = MyOfferATNativeAd.this.getDetail();
                if (detail != null) {
                    detail.x(i10);
                }
                MyOfferATNativeAd.this.notifyAdClicked();
            }

            @Override // com.anythink.basead.e.a
            public final void onAdShow() {
                MyOfferATNativeAd.this.notifyAdImpression();
            }

            @Override // com.anythink.basead.e.a
            public final void onAdClosed() {
            }

            @Override // com.anythink.basead.e.a
            public final void onDeeplinkCallback(boolean z10) {
            }

            @Override // com.anythink.basead.e.a
            public final void onShowFailed(com.anythink.basead.c.e eVar2) {
            }
        });
        setNetworkInfoMap(b.a(this.f12757a.e()));
        setAdChoiceIconUrl(this.f12757a.j());
        setTitle(this.f12757a.b());
        setDescriptionText(this.f12757a.f());
        setIconImageUrl(this.f12757a.h());
        setMainImageUrl(this.f12757a.i());
        setCallToActionText(this.f12757a.g());
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void clear(View view) {
        e eVar = this.f12757a;
        if (eVar != null) {
            eVar.l();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        e eVar = this.f12757a;
        if (eVar != null) {
            eVar.a((a) null);
            this.f12757a.m();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.f12759c == null) {
            this.f12759c = e.k();
        }
        return this.f12759c;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.f12757a != null) {
            List<View> clickViewList = aTNativePrepareInfo.getClickViewList();
            if (clickViewList != null && clickViewList.size() > 0) {
                this.f12757a.a(view, clickViewList);
            } else {
                this.f12757a.a(view);
            }
        }
    }
}
