package com.ironsource.sdk.controller;

import android.os.Bundle;
import com.ironsource.sdk.utils.Logger;

/* loaded from: classes2.dex */
public class InterstitialActivity extends ControllerActivity {
    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i("InterstitialActivity", "onCreate");
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        Logger.i("InterstitialActivity", "onPause");
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Logger.i("InterstitialActivity", "onResume");
    }
}
