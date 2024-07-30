package com.anythink.core.activity;

import android.app.Activity;
import android.os.Bundle;
import com.anythink.core.activity.component.PrivacyPolicyView;
import com.anythink.core.api.ATGDPRAuthCallback;
import com.anythink.core.common.i;

/* loaded from: classes.dex */
public class AnyThinkGdprAuthActivity extends Activity {
    public static ATGDPRAuthCallback mCallback;

    /* renamed from: a, reason: collision with root package name */
    String f4517a;

    /* renamed from: b, reason: collision with root package name */
    PrivacyPolicyView f4518b;

    /* renamed from: c, reason: collision with root package name */
    boolean f4519c = false;

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f4519c) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i.a();
        this.f4517a = i.l();
        if (getResources().getConfiguration().orientation == 2) {
            setRequestedOrientation(6);
        } else {
            setRequestedOrientation(7);
        }
        try {
            PrivacyPolicyView privacyPolicyView = new PrivacyPolicyView(this);
            this.f4518b = privacyPolicyView;
            privacyPolicyView.setResultCallbackListener(new PrivacyPolicyView.a() { // from class: com.anythink.core.activity.AnyThinkGdprAuthActivity.1
                @Override // com.anythink.core.activity.component.PrivacyPolicyView.a
                public final void onLevelSelect(int i10) {
                    ATGDPRAuthCallback aTGDPRAuthCallback = AnyThinkGdprAuthActivity.mCallback;
                    if (aTGDPRAuthCallback != null) {
                        aTGDPRAuthCallback.onAuthResult(i10);
                        AnyThinkGdprAuthActivity.mCallback = null;
                    }
                    AnyThinkGdprAuthActivity.this.finish();
                }

                @Override // com.anythink.core.activity.component.PrivacyPolicyView.a
                public final void onPageLoadFail() {
                    AnyThinkGdprAuthActivity.this.f4519c = true;
                    ATGDPRAuthCallback aTGDPRAuthCallback = AnyThinkGdprAuthActivity.mCallback;
                    if (aTGDPRAuthCallback != null) {
                        aTGDPRAuthCallback.onPageLoadFail();
                    }
                }

                @Override // com.anythink.core.activity.component.PrivacyPolicyView.a
                public final void onPageLoadSuccess() {
                    AnyThinkGdprAuthActivity.this.f4519c = false;
                }
            });
            setContentView(this.f4518b);
            this.f4518b.loadPolicyUrl(this.f4517a);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        PrivacyPolicyView privacyPolicyView = this.f4518b;
        if (privacyPolicyView != null) {
            privacyPolicyView.destory();
        }
        mCallback = null;
        super.onDestroy();
    }
}
