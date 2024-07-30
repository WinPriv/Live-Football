package ib;

import android.content.Context;
import com.hamkho.livefoot.R;
import com.huawei.hms.account.sdk.AccountKitInnerApi;
import com.huawei.hms.account.sdk.callback.CloudAccountInnerCallback;
import com.huawei.hms.account.sdk.entity.SignInBackendReq;
import com.huawei.hms.account.sdk.entity.SignInOptions;
import com.huawei.hms.account.sdk.entity.SignInResult;
import com.huawei.hms.account.sdk.internal.AccountKitInnerApiHelper;
import com.huawei.hms.core.common.CoreApiClient;
import com.huawei.openalliance.ad.ppskit.beans.server.OaidPortraitReq;
import com.huawei.openalliance.ad.ppskit.handlers.h0;
import java.util.Set;
import ka.n7;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29515a;

    /* renamed from: b, reason: collision with root package name */
    public final OaidPortraitReq f29516b;

    /* loaded from: classes2.dex */
    public class a implements CloudAccountInnerCallback<SignInResult> {
    }

    public u(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f29515a = applicationContext;
        this.f29516b = new OaidPortraitReq();
        h0.a(applicationContext);
    }

    public final void a() {
        Context context = this.f29515a;
        try {
            AccountKitInnerApi api = AccountKitInnerApiHelper.getApi(CoreApiClient.getInstance().getContext(), "PPS");
            SignInOptions build = new SignInOptions.Builder().requestAccessToken().requestCountryCode().requestUid().build();
            Set scopes = build.getScopes();
            scopes.add(context.getString(R.string.hiad_account_list_scope));
            scopes.add(context.getString(R.string.hiad_device_list_scope));
            api.signInBackend(new SignInBackendReq(CoreApiClient.getInstance().getAppID(), CoreApiClient.getInstance().getPackageName(), build), new a());
        } catch (Throwable unused) {
            n7.g("OaidPortraitRequester", "load access token error.");
        }
    }
}
