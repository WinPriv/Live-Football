package com.anythink.network.adx;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.d.h;
import com.anythink.basead.e.a;
import com.anythink.basead.e.e;
import com.anythink.basead.ui.BaseMediaAdView;
import com.anythink.basead.ui.OwnNativeAdView;
import com.anythink.core.common.d.b;
import com.anythink.core.common.d.c;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import java.util.List;

/* loaded from: classes.dex */
public class AdxATNativeAd extends CustomNativeAd {

    /* renamed from: a, reason: collision with root package name */
    h f12617a;

    /* renamed from: b, reason: collision with root package name */
    Context f12618b;

    /* renamed from: c, reason: collision with root package name */
    boolean f12619c;

    /* renamed from: d, reason: collision with root package name */
    boolean f12620d;

    /* renamed from: e, reason: collision with root package name */
    View f12621e;

    public AdxATNativeAd(final Context context, h hVar, boolean z10, boolean z11) {
        this.f12618b = context.getApplicationContext();
        this.f12617a = hVar;
        hVar.a(new e(hVar.a()) { // from class: com.anythink.network.adx.AdxATNativeAd.1
            @Override // com.anythink.basead.e.a
            public final void onAdClick(int i10) {
                com.anythink.core.common.e.e detail = AdxATNativeAd.this.getDetail();
                if (detail != null) {
                    detail.x(i10);
                }
                AdxATNativeAd.this.notifyAdClicked();
                if (AdxATNativeAd.this.f12617a.a().n() == 67) {
                    if (AdxATNativeAd.this.f12617a.a(true, false)) {
                        c.a(context).a(AdxATNativeAd.this.f12617a.a().p(), 1, 0);
                    }
                    if (AdxATNativeAd.this.f12617a.a(false, false)) {
                        b.a(context).a(AdxATNativeAd.this.f12617a.a().p(), 1, 0);
                    }
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdClosed() {
                AdxATNativeAd.this.notifyAdDislikeClick();
            }

            @Override // com.anythink.basead.e.e, com.anythink.basead.e.a
            public final void onAdShow() {
                super.onAdShow();
                AdxATNativeAd.this.notifyAdImpression();
                if (AdxATNativeAd.this.f12617a.a().n() == 67) {
                    if (AdxATNativeAd.this.f12617a.a(true, true)) {
                        c.a(context).a(AdxATNativeAd.this.f12617a.a().p(), 0, 1);
                    }
                    if (AdxATNativeAd.this.f12617a.a(false, true)) {
                        b.a(context).a(AdxATNativeAd.this.f12617a.a().p(), 0, 1);
                    }
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onDeeplinkCallback(boolean z12) {
                AdxATNativeAd.this.notifyDeeplinkCallback(z12);
            }

            @Override // com.anythink.basead.e.a
            public final void onShowFailed(com.anythink.basead.c.e eVar) {
            }
        });
        this.f12619c = z10;
        this.f12620d = z11;
        if (!z10 && !this.f12617a.h()) {
            setNetworkInfoMap(com.anythink.basead.b.a(this.f12617a.a()));
            setAdChoiceIconUrl(this.f12617a.g());
            setTitle(this.f12617a.b());
            setDescriptionText(this.f12617a.c());
            setIconImageUrl(this.f12617a.e());
            setMainImageUrl(this.f12617a.f());
            setCallToActionText(this.f12617a.d());
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void clear(View view) {
        h hVar = this.f12617a;
        if (hVar != null) {
            hVar.i();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        h hVar = this.f12617a;
        if (hVar != null) {
            hVar.a((a) null);
            this.f12617a.j();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.f12621e == null) {
            this.f12621e = this.f12617a.a(this.f12618b, this.f12619c, this.f12620d, new BaseMediaAdView.a() { // from class: com.anythink.network.adx.AdxATNativeAd.2
                @Override // com.anythink.basead.ui.BaseMediaAdView.a
                public final void onClickCloseView() {
                    AdxATNativeAd.this.notifyAdDislikeClick();
                }
            });
        }
        return this.f12621e;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        if (this.f12617a != null && !this.f12619c) {
            return new OwnNativeAdView(this.f12618b);
        }
        return null;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public boolean isNativeExpress() {
        if (!this.f12619c && !this.f12617a.h()) {
            return false;
        }
        return true;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void onPause() {
        h hVar = this.f12617a;
        if (hVar != null) {
            hVar.l();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void onResume() {
        h hVar = this.f12617a;
        if (hVar != null) {
            hVar.k();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        this.f12617a.k();
        if (!this.f12619c && this.f12617a != null) {
            List<View> clickViewList = aTNativePrepareInfo.getClickViewList();
            if (clickViewList != null && clickViewList.size() > 0) {
                this.f12617a.a(view, clickViewList);
            } else {
                this.f12617a.a(view);
            }
        }
    }
}
