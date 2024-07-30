package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinUserService;

/* loaded from: classes.dex */
public class UserServiceImpl implements AppLovinUserService {

    /* renamed from: a, reason: collision with root package name */
    private final p f18475a;

    public UserServiceImpl(p pVar) {
        this.f18475a = pVar;
    }

    @Override // com.applovin.sdk.AppLovinUserService
    public void preloadConsentDialog() {
        this.f18475a.T().c();
    }

    @Override // com.applovin.sdk.AppLovinUserService
    public void showConsentDialog(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        this.f18475a.T().a(activity, onConsentDialogDismissListener);
    }

    public String toString() {
        return "UserService{}";
    }
}
