package com.anythink.expressad.video.signal;

/* loaded from: classes.dex */
public interface j {
    public static final int m_ = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f12295n = 2;
    public static final int n_ = 2;
    public static final int o = 1;
    public static final int o_ = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f12296p = 2;
    public static final int p_ = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f12297q = 0;
    public static final int q_ = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f12298r = 1;
    public static final int r_ = 0;
    public static final int s_ = 1;
    public static final int t_ = 1;
    public static final int u_ = 2;
    public static final int v_ = 1;
    public static final int w_ = 2;
    public static final int x_ = -1;
    public static final int y_ = 1;

    void alertWebViewShowed();

    void closeVideoOperate(int i10, int i11);

    void dismissAllAlert();

    int getBorderViewHeight();

    int getBorderViewLeft();

    int getBorderViewRadius();

    int getBorderViewTop();

    int getBorderViewWidth();

    String getCurrentProgress();

    void hideAlertView(int i10);

    boolean isH5Canvas();

    void notifyCloseBtn(int i10);

    void progressBarOperate(int i10);

    void progressOperate(int i10, int i11);

    void setCover(boolean z10);

    void setInstallDialogState(boolean z10);

    void setMiniEndCardState(boolean z10);

    void setScaleFitXY(int i10);

    void setVisible(int i10);

    void showAlertView();

    void showIVRewardAlertView(String str);

    void showVideoLocation(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

    void soundOperate(int i10, int i11);

    void soundOperate(int i10, int i11, String str);

    void videoOperate(int i10);
}
