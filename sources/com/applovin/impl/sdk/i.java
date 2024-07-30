package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinCFError;
import com.applovin.sdk.AppLovinCFService;
import com.applovin.sdk.AppLovinSdkConfiguration;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i implements AppLovinCFService {

    /* renamed from: a, reason: collision with root package name */
    private p f18984a;

    public i(p pVar) {
        this.f18984a = pVar;
    }

    @Override // com.applovin.sdk.AppLovinCFService
    public AppLovinCFService.CFType getCFType() {
        String str = (String) this.f18984a.a(com.applovin.impl.sdk.c.b.fS);
        if ("applies".equalsIgnoreCase(str)) {
            return AppLovinCFService.CFType.DETAILED;
        }
        if ("does_not_apply".equalsIgnoreCase(str)) {
            return AppLovinCFService.CFType.STANDARD;
        }
        return AppLovinCFService.CFType.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinCFService
    public void scf(Activity activity, final AppLovinCFService.OnCFCompletionCallback onCFCompletionCallback) {
        if (this.f18984a.ax().getConsentDialogState() != AppLovinSdkConfiguration.ConsentDialogState.APPLIES) {
            onCFCompletionCallback.onFlowCompleted(new AppLovinCFErrorImpl(-300, "Re-showing a consent flow is only allowed in GDPR region."));
        } else {
            this.f18984a.ae().a(true);
            this.f18984a.ae().a(activity, new AppLovinCFService.OnCFCompletionCallback() { // from class: com.applovin.impl.sdk.i.1
                @Override // com.applovin.sdk.AppLovinCFService.OnCFCompletionCallback
                public void onFlowCompleted(AppLovinCFError appLovinCFError) {
                    onCFCompletionCallback.onFlowCompleted(appLovinCFError);
                }
            });
        }
    }
}
