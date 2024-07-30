package com.huawei.hms.ads.nativead;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.ads.AppDownloadButton;
import com.huawei.hms.ads.ChoicesView;
import com.huawei.hms.ads.VideoOperator;
import com.huawei.hms.ads.annotation.GlobalApi;
import com.huawei.hms.ads.bw;
import com.huawei.hms.ads.js;
import com.huawei.openalliance.ad.inter.data.e;
import com.huawei.openalliance.ad.inter.data.j;
import com.huawei.openalliance.ad.views.NativeVideoView;
import com.huawei.openalliance.ad.views.NativeWindowImageView;
import com.huawei.openalliance.ad.views.PPSNativeView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@GlobalApi
/* loaded from: classes2.dex */
public class NativeView extends PPSNativeView implements INativeView {
    private View B;
    private View C;
    private View D;
    private View F;
    private ChoicesView I;
    private View L;
    private View S;
    private final Map<String, View> V;

    /* renamed from: a, reason: collision with root package name */
    private MediaView f21768a;

    /* renamed from: b, reason: collision with root package name */
    private View f21769b;

    /* renamed from: c, reason: collision with root package name */
    private View f21770c;

    /* renamed from: d, reason: collision with root package name */
    private View f21771d;

    /* renamed from: e, reason: collision with root package name */
    private bw f21772e;

    @GlobalApi
    public NativeView(Context context) {
        super(context);
        this.V = new HashMap();
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public void destroy() {
        this.V.clear();
        bw bwVar = this.f21772e;
        if (bwVar != null) {
            bwVar.destroy();
        }
        MediaView mediaView = this.f21768a;
        if (mediaView != null) {
            mediaView.Code();
        }
        super.B();
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public View getAdSourceView() {
        return this.V.get("5");
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public View getCallToActionView() {
        return this.V.get("2");
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public ChoicesView getChoicesView() {
        View view = this.V.get(NativeAdAssetNames.CHOICES_CONTAINER);
        if (view instanceof ChoicesView) {
            return (ChoicesView) view;
        }
        return null;
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public View getDescriptionView() {
        return this.V.get("4");
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public View getIconView() {
        return this.V.get("3");
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public View getImageView() {
        return this.V.get("8");
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public View getMarketView() {
        return this.V.get("6");
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public MediaView getMediaView() {
        View view = this.V.get("10");
        if (view instanceof MediaView) {
            return (MediaView) view;
        }
        return null;
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public View getPriceView() {
        return this.V.get("7");
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public View getRatingView() {
        return this.V.get("9");
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public View getTitleView() {
        return this.V.get("1");
    }

    @Override // com.huawei.openalliance.ad.views.PPSNativeView
    public void gotoWhyThisAdPage() {
        super.gotoWhyThisAdPage();
    }

    @Override // com.huawei.openalliance.ad.views.PPSNativeView
    @GlobalApi
    public void hideAdvertiserInfoDialog() {
        super.hideAdvertiserInfoDialog();
    }

    @Override // com.huawei.openalliance.ad.views.PPSNativeView, com.huawei.hms.ads.nativead.INativeView
    @GlobalApi
    public void onViewUpdate() {
        super.onViewUpdate();
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public boolean register(AppDownloadButton appDownloadButton) {
        return super.Code((js) appDownloadButton);
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public void setAdSourceView(View view) {
        this.B = view;
        this.V.put("5", view);
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public void setCallToActionView(View view) {
        this.S = view;
        this.V.put("2", view);
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public void setChoicesView(ChoicesView choicesView) {
        this.I = choicesView;
        this.V.put(NativeAdAssetNames.CHOICES_CONTAINER, choicesView);
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public void setDescriptionView(View view) {
        this.C = view;
        this.V.put("4", view);
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public void setIconView(View view) {
        this.D = view;
        this.V.put("3", view);
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public void setImageView(View view) {
        this.L = view;
        this.V.put("8", view);
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public void setMarketView(View view) {
        this.f21771d = view;
        this.V.put("6", view);
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public void setMediaView(MediaView mediaView) {
        this.f21768a = mediaView;
        this.V.put("10", mediaView);
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public void setNativeAd(NativeAd nativeAd) {
        View view;
        NativeAdConfiguration nativeAdConfiguration;
        if (nativeAd instanceof bw) {
            bw bwVar = (bw) nativeAd;
            this.f21772e = bwVar;
            bwVar.Code(this);
            setIsCustomDislikeThisAdEnabled(nativeAd.isCustomDislikeThisAdEnabled());
            MediaView mediaView = this.f21768a;
            if (mediaView != null) {
                b mediaViewAdapter = mediaView.getMediaViewAdapter();
                mediaViewAdapter.Code(nativeAd);
                view = mediaViewAdapter.B();
                VideoOperator videoOperator = this.f21772e.getVideoOperator();
                if (videoOperator instanceof c) {
                    ((c) videoOperator).Code(this.f21768a);
                }
            } else {
                view = null;
            }
            e Code = this.f21772e.Code();
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            View callToActionView = getCallToActionView();
            if (callToActionView != null && callToActionView.isEnabled()) {
                arrayList.add(callToActionView);
            }
            if ((Code instanceof j) && (nativeAdConfiguration = ((j) Code).J) != null) {
                setChoiceViewPosition(nativeAdConfiguration.getChoicesPosition());
            }
            if (view instanceof NativeWindowImageView) {
                Code(Code, arrayList, (NativeWindowImageView) view);
            } else {
                if (view instanceof NativeVideoView) {
                    NativeVideoView nativeVideoView = (NativeVideoView) view;
                    arrayList.add(nativeVideoView.getPreviewImageView());
                    Code(Code, arrayList, nativeVideoView);
                    return;
                }
                Code(Code, arrayList);
            }
        }
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public void setPriceView(View view) {
        this.f21769b = view;
        this.V.put("7", view);
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public void setRatingView(View view) {
        this.f21770c = view;
        this.V.put("9", view);
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public void setTitleView(View view) {
        this.F = view;
        this.V.put("1", view);
    }

    @Override // com.huawei.openalliance.ad.views.PPSNativeView
    @GlobalApi
    public void showAdvertiserInfoDialog(View view, boolean z10) {
        super.showAdvertiserInfoDialog(view, z10);
    }

    @Override // com.huawei.openalliance.ad.views.PPSNativeView
    public void showFeedback(View view) {
        super.showFeedback(view);
    }

    @Override // com.huawei.hms.ads.nativead.INativeView
    public void unregister(AppDownloadButton appDownloadButton) {
        super.V((js) appDownloadButton);
    }

    @GlobalApi
    public NativeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V = new HashMap();
    }

    @GlobalApi
    public NativeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.V = new HashMap();
    }

    @GlobalApi
    @SuppressLint({"NewApi"})
    public NativeView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.V = new HashMap();
    }
}
