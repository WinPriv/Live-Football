package ka;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.hihonor.common.grs.HihonorGrsApi;
import com.hihonor.common.grs.HihonorGrsBaseInfo;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.ppskit.utils.ServerConfig;

/* loaded from: classes2.dex */
public final class f extends z6.f implements m {

    /* renamed from: t, reason: collision with root package name */
    public final Context f31149t;

    /* renamed from: u, reason: collision with root package name */
    public final HihonorGrsBaseInfo f31150u;

    public f(Context context) {
        super(5);
        this.f31149t = context.getApplicationContext();
        this.f31150u = new HihonorGrsBaseInfo();
    }

    public static HihonorGrsBaseInfo s(HihonorGrsBaseInfo hihonorGrsBaseInfo) {
        HihonorGrsBaseInfo hihonorGrsBaseInfo2 = new HihonorGrsBaseInfo();
        hihonorGrsBaseInfo2.setAndroidVersion(z6.f.b(hihonorGrsBaseInfo.getAndroidVersion()));
        hihonorGrsBaseInfo2.setAppName(z6.f.b(hihonorGrsBaseInfo.getAppName()));
        hihonorGrsBaseInfo2.setDeviceModel(z6.f.b(hihonorGrsBaseInfo.getDeviceModel()));
        hihonorGrsBaseInfo2.setIssueCountry(z6.f.b(hihonorGrsBaseInfo.getIssueCountry()));
        hihonorGrsBaseInfo2.setRegCountry(z6.f.b(hihonorGrsBaseInfo.getRegCountry()));
        hihonorGrsBaseInfo2.setRomVersion(z6.f.b(hihonorGrsBaseInfo.getRomVersion()));
        hihonorGrsBaseInfo2.setSerCountry(z6.f.b(hihonorGrsBaseInfo.getSerCountry()));
        hihonorGrsBaseInfo2.setUid(z6.f.b(hihonorGrsBaseInfo.getUid()));
        hihonorGrsBaseInfo2.setVersionName(z6.f.b(hihonorGrsBaseInfo.getVersionName()));
        return hihonorGrsBaseInfo2;
    }

    public static String t(Context context, HihonorGrsBaseInfo hihonorGrsBaseInfo, String str, String str2) {
        StringBuilder o = a3.k.o("Query GRS service: ", str, ", key: ", str2, ", params: ");
        o.append(u(hihonorGrsBaseInfo));
        n7.e("HonorGrsImpl", o.toString());
        if (TextUtils.isEmpty(hihonorGrsBaseInfo.getAppName()) && !Cif.a(context).d()) {
            n7.g("HonorGrsImpl", "app name is empty and it's overseas");
            return "";
        }
        if (!TextUtils.isEmpty(hihonorGrsBaseInfo.getAppName())) {
            HihonorGrsApi.grsSdkInit(context, hihonorGrsBaseInfo);
        }
        String a10 = new jc.a(context, 1).a(str, str2);
        if (TextUtils.isEmpty(a10)) {
            n7.i("HonorGrsImpl", "Query GRS returns a null or an empty.");
            return "";
        }
        n7.e("HonorGrsImpl", "Query GRS success, url: " + androidx.transition.n.u(a10));
        return a10;
    }

    public static String u(HihonorGrsBaseInfo hihonorGrsBaseInfo) {
        return "AppName: " + hihonorGrsBaseInfo.getAppName() + ", AndroidVersion: " + hihonorGrsBaseInfo.getAndroidVersion() + ", DeviceModel   : " + hihonorGrsBaseInfo.getDeviceModel() + ", IssueCountry  : " + hihonorGrsBaseInfo.getIssueCountry() + ", RegCountry    : " + hihonorGrsBaseInfo.getRegCountry() + ", RomVersion    : " + hihonorGrsBaseInfo.getRomVersion() + ", SerCountry    : " + hihonorGrsBaseInfo.getSerCountry() + ", VersionName   : " + hihonorGrsBaseInfo.getVersionName();
    }

    @Override // ka.m
    public final String a() {
        String str = ServerConfig.f22801b;
        boolean equalsIgnoreCase = "CN".equalsIgnoreCase(str);
        n7.c("HonorGrsImpl", "init country code: %s ", str);
        return (Cif.c(this.f31149t) || !equalsIgnoreCase) ? (TextUtils.isEmpty(str) || CountryCodeBean.COUNTRYCODE_OVERSEAS.equalsIgnoreCase(str)) ? new CountryCodeBean(this.f31149t).a() : str : str;
    }

    @Override // ka.m
    public final String a(Context context, String str, String str2, String str3, String str4) {
        String e10 = Cif.a(context).e();
        if (!androidx.activity.n.k0()) {
            return "";
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException("must not be called on the UI thread");
        }
        if (str4 != null) {
            String str5 = Build.VERSION.RELEASE;
            HihonorGrsBaseInfo hihonorGrsBaseInfo = this.f31150u;
            hihonorGrsBaseInfo.setAndroidVersion(str5);
            hihonorGrsBaseInfo.setDeviceModel(Build.MODEL);
            if (TextUtils.isEmpty(e10)) {
                e10 = Cif.a(context).i();
            }
            hihonorGrsBaseInfo.setRomVersion(e10);
            hihonorGrsBaseInfo.setAppName(str);
            hihonorGrsBaseInfo.setSerCountry(str2);
            hihonorGrsBaseInfo.setVersionName(com.huawei.openalliance.ad.ppskit.utils.o2.k(context, context.getPackageName()));
            if (Looper.myLooper() != Looper.getMainLooper()) {
                return t(context, s(hihonorGrsBaseInfo), str3, str4);
            }
            throw new IllegalThreadStateException("must not be called on the UI thread");
        }
        throw new IllegalArgumentException("service, key must not be null");
    }

    @Override // ka.m
    public final String a(String str, String str2) {
        return HihonorGrsApi.synGetGrsUrl(str, str2);
    }
}
