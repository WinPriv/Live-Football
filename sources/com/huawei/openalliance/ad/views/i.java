package com.huawei.openalliance.ad.views;

import android.view.MotionEvent;
import android.view.View;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fs;

/* loaded from: classes2.dex */
public final class i implements View.OnTouchListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSSkipButton f24144s;

    public i(PPSSkipButton pPSSkipButton) {
        this.f24144s = pPSSkipButton;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        fs fsVar;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (motionEvent.getAction() == 0) {
            if (ex.Code()) {
                int i10 = PPSSkipButton.I;
                ex.Code("PPSSkipButton", "touch down skipAdButton x=%f, y=%f", Float.valueOf(rawX), Float.valueOf(rawY));
            }
            PPSSkipButton pPSSkipButton = this.f24144s;
            if (!pPSSkipButton.H && (fsVar = pPSSkipButton.f23941z) != null) {
                pPSSkipButton.H = true;
                fsVar.Code((int) rawX, (int) rawY);
            }
        }
        return true;
    }
}
