package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.internal.api.NativeAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5M, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5M implements NativeAdApi {
    public static String[] A02 = {"mRGpAzErj1xKeHc9WkF3Ujy7h38joZC8", "9wVKpObP8FA1o7oyYWhkpjh48o8VAcWp", "pz3BbJjT9xlHe4B2EghGg76rolJKqfV", "txN8wQ5fkL3IFh565s3Q1NMKA4RH7CNr", "KrzK51p50C2Qp4g1XOaXdDfTUeF", "0wnkiGzVks6qBKMatIgqU8hY2PaKlPy", "GWxCKnjCJrIvVlnjjEtvZJVKWYpK", "UfKYcBFUD7Ap"};
    public final NativeAd A00;
    public final NativeAdBaseApi A01;

    public C5M(NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
        C1228Sw.A0L(nativeAdBaseApi).A1Y(J8.A05);
    }

    public C5M(NativeAdBase nativeAdBase, NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
    }

    private C1228Sw A00() {
        return C1228Sw.A0L(this.A01);
    }

    @Nullable
    public final String A01() {
        return A00().A1F();
    }

    @Nullable
    public final String A02() {
        return A00().A1G();
    }

    @Nullable
    public final List<NativeAd> A03() {
        if (A00().A1H() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C1228Sw internalNativeAd : A00().A1H()) {
            arrayList.add(new NativeAd(internalNativeAd.A11(), internalNativeAd));
        }
        return arrayList;
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final NativeAd.AdCreativeType getAdCreativeType() {
        if (!TextUtils.isEmpty(A00().A1G())) {
            return NativeAd.AdCreativeType.VIDEO;
        }
        if (A00().A1H() != null && !A00().A1H().isEmpty()) {
            return NativeAd.AdCreativeType.CAROUSEL;
        }
        if (A00().getAdCoverImage() != null && !TextUtils.isEmpty(A00().getAdCoverImage().getUrl())) {
            NativeAd.AdCreativeType adCreativeType = NativeAd.AdCreativeType.IMAGE;
            String[] strArr = A02;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "AqlRmswAejgv";
            strArr2[6] = "RNgsy314kOszGsZ2llWC7eCbS6WS";
            return adCreativeType;
        }
        return NativeAd.AdCreativeType.UNKNOWN;
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final VideoAutoplayBehavior getVideoAutoplayBehavior() {
        return EnumC0975Iw.A00(A00().A18());
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView) {
        registerViewForInteraction(view, mediaView, (MediaView) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable ImageView imageView) {
        registerViewForInteraction(view, mediaView, imageView, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable ImageView imageView, @Nullable List<View> clickableViews) {
        if (imageView != null) {
            C1316Wj A11 = A00().A11();
            C1316Wj downloadContext = C5G.A02(imageView.getContext());
            downloadContext.A0F(A11);
            C1228Sw.A0j(A00().getAdIcon(), imageView, downloadContext);
        }
        registerViewForInteraction(view, mediaView, (MediaView) null, clickableViews);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable MediaView mediaView2) {
        registerViewForInteraction(view, mediaView, mediaView2, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable MediaView mediaView2, @Nullable List<View> list) {
        if (mediaView != null) {
            ((XC) mediaView.getMediaViewApi()).A0L(this.A00);
        }
        if (mediaView2 != null) {
            ((XC) mediaView2.getMediaViewApi()).A0M(this.A01, false);
        }
        if (list != null) {
            A00().A1O(view, mediaView, list);
            return;
        }
        C1228Sw A00 = A00();
        if (A02[4].length() == 7) {
            throw new RuntimeException();
        }
        A02[1] = "MBrHnoNt0t7c904xRN41qBo9Q6s9Di6J";
        A00.A1N(view, mediaView);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable List<View> clickableViews) {
        registerViewForInteraction(view, mediaView, (MediaView) null, clickableViews);
    }
}
