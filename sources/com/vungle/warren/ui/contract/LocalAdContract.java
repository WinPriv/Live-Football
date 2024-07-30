package com.vungle.warren.ui.contract;

import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.presenter.LocalAdPresenter;
import java.io.File;

/* loaded from: classes2.dex */
public interface LocalAdContract {

    /* loaded from: classes2.dex */
    public interface LocalPresenter extends AdContract.AdvertisementPresenter<LocalView> {
        void onDownload();

        boolean onMediaError(String str);

        void onMute(boolean z10);

        void onPrivacy();

        void onProgressUpdate(int i10, float f);

        void onVideoStart(int i10, float f);
    }

    /* loaded from: classes2.dex */
    public interface LocalView extends AdContract.AdView<LocalAdPresenter> {
        int getVideoPosition();

        boolean isDialogVisible();

        boolean isVideoPlaying();

        void pauseVideo();

        void playVideo(File file, boolean z10, int i10);

        void showCTAOverlay(boolean z10, boolean z11);
    }
}
