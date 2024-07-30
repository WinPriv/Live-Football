package com.vungle.warren.ui.view;

import android.content.Context;
import android.view.MotionEvent;
import com.vungle.warren.ui.CloseDelegate;
import com.vungle.warren.ui.OrientationDelegate;
import com.vungle.warren.ui.contract.WebAdContract;

/* loaded from: classes2.dex */
public class MRAIDAdView extends BaseAdView<WebAdContract.WebAdPresenter> implements WebAdContract.WebAdView {
    private OnViewTouchListener onViewTouchListener;
    private WebAdContract.WebAdPresenter presenter;

    public MRAIDAdView(Context context, FullAdWidget fullAdWidget, OrientationDelegate orientationDelegate, CloseDelegate closeDelegate) {
        super(context, fullAdWidget, orientationDelegate, closeDelegate);
        this.onViewTouchListener = new OnViewTouchListener() { // from class: com.vungle.warren.ui.view.MRAIDAdView.1
            @Override // com.vungle.warren.ui.view.OnViewTouchListener
            public boolean onTouch(MotionEvent motionEvent) {
                if (MRAIDAdView.this.presenter != null) {
                    MRAIDAdView.this.presenter.onViewTouched(motionEvent);
                    return false;
                }
                return false;
            }
        };
        attachListeners();
    }

    private void attachListeners() {
        this.view.setOnViewTouchListener(this.onViewTouchListener);
    }

    @Override // com.vungle.warren.ui.contract.WebAdContract.WebAdView
    public void setVisibility(boolean z10) {
        int i10;
        FullAdWidget fullAdWidget = this.view;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        fullAdWidget.setVisibility(i10);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showWebsite(String str) {
        this.view.showWebsite(str);
    }

    @Override // com.vungle.warren.ui.contract.WebAdContract.WebAdView
    public void updateWindow() {
        this.view.updateWindow();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setPresenter(WebAdContract.WebAdPresenter webAdPresenter) {
        this.presenter = webAdPresenter;
    }
}
