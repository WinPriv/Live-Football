package com.vungle.warren.ui.contract;

import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.presenter.NativeAdPresenter;

/* loaded from: classes2.dex */
public interface NativeAdContract {

    /* loaded from: classes2.dex */
    public interface NativePresenter extends AdContract.AdvertisementPresenter<NativeView> {
        void onDownload();

        void onPrivacy();

        void onProgressUpdate(int i10, float f);

        void setAdVisibility(boolean z10);
    }

    /* loaded from: classes2.dex */
    public interface NativeView extends AdContract.AdView<NativeAdPresenter> {
        boolean isDialogVisible();
    }
}
