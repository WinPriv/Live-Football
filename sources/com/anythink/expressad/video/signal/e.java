package com.anythink.expressad.video.signal;

/* loaded from: classes.dex */
public interface e extends f {
    public static final int d_ = -1;
    public static final int e_ = 1;
    public static final int f_ = 2;
    public static final int g_ = 1;
    public static final int h_ = 2;
    public static final int i_ = 3;
    public static final int j_ = 4;
    public static final int k_ = 5;
    public static final int l_ = 100;

    void configurationChanged(int i10, int i11, int i12);

    boolean endCardShowing();

    void handlerPlayableException(String str);

    void hideAlertWebview();

    void ivRewardAdsWithoutVideo(String str);

    boolean miniCardLoaded();

    boolean miniCardShowing();

    void readyStatus(int i10);

    void resizeMiniCard(int i10, int i11, int i12);

    boolean showAlertWebView();

    void showEndcard(int i10);

    void showMiniCard(int i10, int i11, int i12, int i13, int i14);

    void showPlayableView();

    void showVideoClickView(int i10);

    void showVideoEndCover();
}
