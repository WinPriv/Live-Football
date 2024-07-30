package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Pd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC1132Pd {
    void A7s();

    boolean A83();

    boolean A84();

    boolean A8Y();

    void ACz(boolean z10, int i10);

    void AEi(int i10);

    void AEn(EnumC1121Os enumC1121Os, int i10);

    void AEu(int i10);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC1121Os getStartReason();

    EnumC1134Pf getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i10);

    void setBackgroundPlaybackEnabled(boolean z10);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z10);

    void setRequestedVolume(float f);

    void setVideoMPD(@Nullable String str);

    void setVideoStateChangeListener(@Nullable InterfaceC1135Pg interfaceC1135Pg);

    void setup(Uri uri);
}
