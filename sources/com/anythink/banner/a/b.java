package com.anythink.banner.a;

import android.content.Context;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.banner.unitgroup.api.CustomBannerEventListener;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.g;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class b implements CustomBannerEventListener {

    /* renamed from: a, reason: collision with root package name */
    WeakReference<e> f3510a;

    /* renamed from: b, reason: collision with root package name */
    CustomBannerAdapter f3511b;

    /* renamed from: c, reason: collision with root package name */
    boolean f3512c;

    public b(e eVar, CustomBannerAdapter customBannerAdapter, boolean z10) {
        this.f3512c = false;
        this.f3510a = new WeakReference<>(eVar);
        this.f3511b = customBannerAdapter;
        this.f3512c = z10;
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdClicked() {
        CustomBannerAdapter customBannerAdapter = this.f3511b;
        if (customBannerAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customBannerAdapter.getTrackingInfo();
            com.anythink.core.common.j.a.a(n.a().g()).a(6, trackingInfo);
            g.a(trackingInfo, g.i.f5077d, g.i.f, "");
            e eVar = this.f3510a.get();
            if (eVar != null) {
                eVar.onBannerClicked(this.f3511b);
            }
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdClose() {
        if (this.f3511b != null) {
            e eVar = this.f3510a.get();
            if (eVar != null) {
                eVar.onBannerClose(this.f3511b);
            }
            com.anythink.core.common.e.e trackingInfo = this.f3511b.getTrackingInfo();
            com.anythink.core.common.k.g.a(trackingInfo, g.i.f5078e, g.i.f, "");
            if (trackingInfo != null) {
                com.anythink.core.common.j.c.a(trackingInfo, false);
            }
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdShow() {
        if (this.f3511b != null) {
            e eVar = this.f3510a.get();
            if (eVar != null) {
                eVar.onBannerShow(this.f3511b, this.f3512c);
            }
            com.anythink.core.common.e.e trackingInfo = this.f3511b.getTrackingInfo();
            com.anythink.core.common.k.g.a(trackingInfo, g.i.f5076c, g.i.f, "");
            com.anythink.core.common.j.a.a(n.a().g()).a(4, trackingInfo, this.f3511b.getUnitGroupInfo());
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onDeeplinkCallback(boolean z10) {
        e eVar = this.f3510a.get();
        if (eVar != null) {
            eVar.onDeeplinkCallback(this.f3511b, z10);
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        e eVar = this.f3510a.get();
        if (eVar != null) {
            eVar.onDownloadConfirm(context, this.f3511b, aTNetworkConfirmInfo);
        }
    }
}
