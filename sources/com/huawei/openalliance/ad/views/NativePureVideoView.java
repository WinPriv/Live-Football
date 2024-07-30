package com.huawei.openalliance.ad.views;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jt;
import com.huawei.hms.ads.jy;
import com.huawei.hms.ads.km;

/* loaded from: classes2.dex */
public class NativePureVideoView extends NativeMediaView implements jt, km {

    /* renamed from: g0, reason: collision with root package name */
    public jy f23714g0;

    private String getTAG() {
        return "NativePureVideoView_" + hashCode();
    }

    @Override // com.huawei.hms.ads.jt
    public final void Code(long j10) {
        throw null;
    }

    @Override // com.huawei.hms.ads.jt
    public final void S() {
        throw null;
    }

    @Override // com.huawei.hms.ads.km
    public final void destroyView() {
        throw null;
    }

    public ia.b getCurrentState() {
        throw null;
    }

    public ImageView getPreviewImageView() {
        return null;
    }

    @Override // com.huawei.hms.ads.km
    public final void pauseView() {
        throw null;
    }

    @Override // com.huawei.hms.ads.km
    public final void resumeView() {
        this.y = false;
        throw null;
    }

    public void setAudioFocusType(int i10) {
        throw null;
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView, com.huawei.hms.ads.jt
    public void setNativeAd(com.huawei.openalliance.ad.inter.data.e eVar) {
        throw null;
    }

    @Override // com.huawei.hms.ads.jt
    public void setPpsNativeView(jy jyVar) {
        this.f23714g0 = jyVar;
    }

    public void setPreferStartPlayTime(int i10) {
        throw null;
    }

    public void setStandalone(boolean z10) {
        throw null;
    }

    @Override // com.huawei.hms.ads.jt
    public final void Code(com.huawei.openalliance.ad.inter.data.h hVar, Drawable drawable) {
    }

    @Override // com.huawei.hms.ads.jt
    public final void Code(com.huawei.openalliance.ad.inter.data.p pVar, boolean z10) {
        ex.V("NativePureVideoView", "onCheckVideoHashResult sucess: %s", Boolean.valueOf(z10));
    }

    @Override // com.huawei.hms.ads.jt
    public final void Code(String str) {
        throw null;
    }
}
