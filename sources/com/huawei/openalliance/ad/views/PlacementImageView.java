package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fj;
import com.huawei.hms.ads.fl;
import com.huawei.hms.ads.il;
import com.huawei.hms.ads.kd;

/* loaded from: classes2.dex */
public class PlacementImageView extends PlacementMediaView implements kd {

    /* renamed from: q0, reason: collision with root package name */
    public ImageView f24026q0;

    /* renamed from: r0, reason: collision with root package name */
    public com.huawei.openalliance.ad.inter.data.l f24027r0;

    /* renamed from: s0, reason: collision with root package name */
    public il f24028s0;

    /* renamed from: t0, reason: collision with root package name */
    public fl f24029t0;

    public PlacementImageView(Context context) {
        super(context);
        this.f24028s0 = new il(getContext(), this);
        this.f24026q0 = new ImageView(context);
        addView(this.f24026q0, new RelativeLayout.LayoutParams(-1, -1));
        this.f24026q0.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void B() {
        fl flVar = this.f24029t0;
        if (flVar != null) {
            flVar.V();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void Code() {
        this.f24026q0.setImageDrawable(null);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void I() {
        fl flVar = this.f24029t0;
        if (flVar != null) {
            flVar.Code();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void V() {
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView, com.huawei.hms.ads.km
    public final void destroyView() {
        this.f24026q0.setImageDrawable(null);
        super.destroyView();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public ImageView getLastFrame() {
        return this.f24026q0;
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public ia.b getMediaState() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void setPlacementAd(com.huawei.openalliance.ad.inter.data.f fVar) {
        super.setPlacementAd(fVar);
        ex.Code("PlacementImageView", "setPlacementAd");
        com.huawei.openalliance.ad.inter.data.k kVar = this.y;
        if (kVar != null) {
            com.huawei.openalliance.ad.inter.data.l S = kVar.S();
            this.f24027r0 = S;
            if (!"video/mp4".equals(S.f22282s)) {
                this.f24028s0.Code(this.y);
                this.f24038k0 = this.f24027r0.p();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void Code(int i10) {
        this.f24026q0.setImageDrawable(null);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void V(fl flVar) {
        this.f24029t0 = null;
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void Code(fl flVar) {
        this.f24029t0 = flVar;
    }

    @Override // com.huawei.hms.ads.kd
    public final void Code(com.huawei.openalliance.ad.inter.data.l lVar, Drawable drawable) {
        this.f24040m0 = true;
        if (lVar == null || drawable == null) {
            this.f24041n0 = false;
        } else {
            com.huawei.openalliance.ad.inter.data.l lVar2 = this.f24027r0;
            if (lVar2 != null && TextUtils.equals(lVar.f22283t, lVar2.f22283t)) {
                this.f24041n0 = true;
                this.f24026q0.setImageDrawable(drawable);
            }
        }
        if (this.f24042o0) {
            f(true);
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void setMediaPlayerReleaseListener(fj fjVar) {
    }
}
