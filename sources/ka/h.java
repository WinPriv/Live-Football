package ka;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsApi;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.ppskit.utils.ServerConfig;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class h extends z6.f implements m {

    /* renamed from: t, reason: collision with root package name */
    public final Context f31228t;

    public h(Context context) {
        super(5);
        new GrsBaseInfo();
        this.f31228t = context.getApplicationContext();
    }

    @Override // ka.m
    public final String a() {
        String str = ServerConfig.f22801b;
        boolean equalsIgnoreCase = "CN".equalsIgnoreCase(str);
        n7.c("HwGrsImpl", "init country code: %s ", str);
        if ((Cif.c(this.f31228t) || !equalsIgnoreCase) && (TextUtils.isEmpty(str) || CountryCodeBean.COUNTRYCODE_OVERSEAS.equalsIgnoreCase(str))) {
            str = new CountryCodeBean(this.f31228t).a();
        }
        return str.toUpperCase(Locale.ENGLISH);
    }

    @Override // ka.m
    public final String a(Context context, String str, String str2, String str3, String str4) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException("must not be called on the UI thread");
        }
        if (str4 != null) {
            GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
            grsBaseInfo.setAndroidVersion(Build.VERSION.RELEASE);
            grsBaseInfo.setDeviceModel(Build.MODEL);
            grsBaseInfo.setRomVersion(Cif.a(context).e());
            grsBaseInfo.setAppName(str);
            grsBaseInfo.setSerCountry(str2);
            grsBaseInfo.setVersionName(com.huawei.openalliance.ad.ppskit.utils.o2.k(context, context.getPackageName()));
            if (Looper.myLooper() != Looper.getMainLooper()) {
                GrsBaseInfo grsBaseInfo2 = new GrsBaseInfo();
                grsBaseInfo2.setAndroidVersion(z6.f.b(grsBaseInfo.getAndroidVersion()));
                grsBaseInfo2.setAppName(z6.f.b(grsBaseInfo.getAppName()));
                grsBaseInfo2.setDeviceModel(z6.f.b(grsBaseInfo.getDeviceModel()));
                grsBaseInfo2.setIssueCountry(z6.f.b(grsBaseInfo.getIssueCountry()));
                grsBaseInfo2.setRegCountry(z6.f.b(grsBaseInfo.getRegCountry()));
                grsBaseInfo2.setRomVersion(z6.f.b(grsBaseInfo.getRomVersion()));
                grsBaseInfo2.setSerCountry(z6.f.b(grsBaseInfo.getSerCountry()));
                grsBaseInfo2.setUid(z6.f.b(grsBaseInfo.getUid()));
                grsBaseInfo2.setVersionName(z6.f.b(grsBaseInfo.getVersionName()));
                n7.c("HwGrsImpl", "Query GRS service: %s, key: %s, params: %s", str3, str4, "AppName: " + grsBaseInfo2.getAppName() + ", AndroidVersion: " + grsBaseInfo2.getAndroidVersion() + ", DeviceModel   : " + grsBaseInfo2.getDeviceModel() + ", IssueCountry  : " + grsBaseInfo2.getIssueCountry() + ", RegCountry    : " + grsBaseInfo2.getRegCountry() + ", RomVersion    : " + grsBaseInfo2.getRomVersion() + ", SerCountry    : " + grsBaseInfo2.getSerCountry() + ", VersionName   : " + grsBaseInfo2.getVersionName());
                if (!TextUtils.isEmpty(grsBaseInfo2.getAppName()) || Cif.a(context).d()) {
                    if (!TextUtils.isEmpty(grsBaseInfo2.getAppName())) {
                        GrsApi.grsSdkInit(context, grsBaseInfo2);
                    }
                    String a10 = a0.a.K(context.getApplicationContext().createDeviceProtectedStorageContext()).a(str3, str4);
                    if (!TextUtils.isEmpty(a10)) {
                        n7.c("HwGrsImpl", "Query GRS success, url: %s", com.huawei.openalliance.ad.ppskit.utils.y1.j(a10));
                        return a10;
                    }
                    n7.i("HwGrsImpl", "Query GRS returns a null or an empty.");
                } else {
                    n7.g("HwGrsImpl", "app name is empty and it's overseas");
                }
                return "";
            }
            throw new IllegalThreadStateException("must not be called on the UI thread");
        }
        throw new IllegalArgumentException("service, key must not be null");
    }

    @Override // ka.m
    public final String a(String str, String str2) {
        return GrsApi.synGetGrsUrl(str, str2);
    }
}
