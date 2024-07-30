package t8;

import android.app.Activity;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;

/* compiled from: AdsManager.java */
/* loaded from: classes2.dex */
public final class j implements AppLovinSdk.SdkInitializationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f35588a;

    public j(Activity activity) {
        this.f35588a = activity;
    }

    @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
    public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        a.c(this.f35588a);
    }
}
