package ka;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class g6 {

    /* renamed from: e, reason: collision with root package name */
    public static g6 f31203e;
    public static final byte[] f = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f31204a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f31205b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f31206c;

    /* renamed from: d, reason: collision with root package name */
    public final jc.a f31207d;

    public g6(Context context) {
        HashMap hashMap = new HashMap();
        this.f31204a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f31205b = hashMap2;
        this.f31206c = context.getApplicationContext();
        this.f31207d = new jc.a(context.getApplicationContext(), 1);
        hashMap.put("adxServer", "adxBaseUrl");
        hashMap.put("installAuthServer", "adxBaseUrl");
        hashMap.put("analyticsServer", "esBaseUrl");
        hashMap.put("appDataServer", "esBaseUrl");
        hashMap.put("eventServer", "esBaseUrl");
        hashMap.put("oaidPortrait", "esBaseUrl");
        hashMap.put("configServer", "sdkServerBaseUrl");
        hashMap.put("consentConfigServer", "sdkServerBaseUrl");
        hashMap.put("kitConfigServer", "sdkServerBaseUrl");
        hashMap.put("exSplashConfig", "sdkServerBaseUrl");
        hashMap.put("permissionServer", "adxBaseUrl");
        hashMap.put("appInsListConfigServer", "sdkServerBaseUrl");
        hashMap.put("consentSync", "esBaseUrl");
        hashMap.put("amsServer", "amsServer");
        hashMap.put("h5Server", "h5Server");
        hashMap.put("adxServerTv", "adxBaseUrlTv");
        hashMap.put("analyticsServerTv", "esBaseUrlTv");
        hashMap.put("eventServerTv", "esBaseUrlTv");
        hashMap.put("configServerTv", "sdkServerBaseUrlTv");
        hashMap.put("kitConfigServerTv", "sdkServerBaseUrlTv");
        hashMap.put("amsServerTv", "amsServerTv");
        hashMap.put("h5ServerTv", "h5ServerTv");
        hashMap.put("complainH5Server", "complainH5ServerBaseUrl");
        hashMap.put("privacyCenterServer", "privacyCenterServer");
        hashMap2.put("adxServer", "/result.ad");
        hashMap2.put("installAuthServer", "/installAuth");
        hashMap2.put("analyticsServer", "/contserver/reportException/action");
        hashMap2.put("appDataServer", "/contserver/reportAppData");
        hashMap2.put("eventServer", "/contserver/newcontent/action");
        hashMap2.put("oaidPortrait", "/contserver/queryUserProfileInfo");
        hashMap2.put("configServer", "/sdkserver/query");
        hashMap2.put("consentConfigServer", "/sdkserver/consentlookup");
        hashMap2.put("kitConfigServer", "/sdkserver/ppsKitConfig");
        hashMap2.put("appInsListConfigServer", "/sdkserver/appInsListConfig");
        hashMap2.put("exSplashConfig", "/sdkserver/exSplashConfig");
        hashMap2.put("permissionServer", "/queryPermission");
        hashMap2.put("consentSync", "/contserver/syncConsent");
        hashMap2.put("complainH5Server", "?lang=");
        hashMap2.put("adxServerTv", "/result.ad");
        hashMap2.put("analyticsServerTv", "/contserver/reportException/action");
        hashMap2.put("eventServerTv", "/contserver/newcontent/action");
        hashMap2.put("configServerTv", "/sdkserver/query");
        hashMap2.put("kitConfigServerTv", "/sdkserver/ppsKitConfig");
    }

    public final String a(String str) {
        this.f31207d.getClass();
        return ((String) this.f31204a.get(str)) + com.huawei.openalliance.ad.ppskit.utils.y1.i(this.f31206c);
    }

    public final String b(String str) {
        this.f31207d.getClass();
        HashMap hashMap = this.f31205b;
        if (TextUtils.isEmpty((CharSequence) hashMap.get(str))) {
            return "";
        }
        return (String) hashMap.get(str);
    }
}
