package com.anythink.expressad.foundation.webview;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10259a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final int f10260b = 5;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10261c = 6;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10262d = 7;

    /* renamed from: e, reason: collision with root package name */
    public static final int f10263e = 8;

    /* renamed from: com.anythink.expressad.foundation.webview.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0125a {
        void a();

        void b();
    }

    Drawable getBackground();

    ViewGroup.LayoutParams getLayoutParams();

    float getProgress();

    int getVisibility();

    void initResource(boolean z10);

    void onThemeChange();

    void setBackgroundColor(int i10);

    void setBackgroundDrawable(Drawable drawable);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setPaused(boolean z10);

    void setProgress(float f, boolean z10);

    void setProgressBarListener(InterfaceC0125a interfaceC0125a);

    void setProgressState(int i10);

    void setVisibility(int i10);

    void setVisible(boolean z10);

    void startEndAnimation();
}
