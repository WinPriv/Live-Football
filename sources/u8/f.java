package u8;

import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.AdError;
import com.anythink.nativead.api.ATNativeAdView;

/* compiled from: MainActivity.java */
/* loaded from: classes2.dex */
public final class f implements ATAdSourceStatusListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ATNativeAdView f35800a;

    public f(ATNativeAdView aTNativeAdView) {
        this.f35800a = aTNativeAdView;
    }

    @Override // com.anythink.core.api.ATAdSourceStatusListener
    public final void onAdSourceBiddingFilled(ATAdInfo aTAdInfo) {
        this.f35800a.setVisibility(0);
    }

    @Override // com.anythink.core.api.ATAdSourceStatusListener
    public final void onAdSourceLoadFilled(ATAdInfo aTAdInfo) {
        this.f35800a.setVisibility(0);
    }

    @Override // com.anythink.core.api.ATAdSourceStatusListener
    public final void onAdSourceAttempt(ATAdInfo aTAdInfo) {
    }

    @Override // com.anythink.core.api.ATAdSourceStatusListener
    public final void onAdSourceBiddingAttempt(ATAdInfo aTAdInfo) {
    }

    @Override // com.anythink.core.api.ATAdSourceStatusListener
    public final void onAdSourceBiddingFail(ATAdInfo aTAdInfo, AdError adError) {
    }

    @Override // com.anythink.core.api.ATAdSourceStatusListener
    public final void onAdSourceLoadFail(ATAdInfo aTAdInfo, AdError adError) {
    }
}
