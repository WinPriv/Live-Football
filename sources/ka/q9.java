package ka;

import android.content.Context;
import android.text.TextUtils;
import com.hamkho.livefoot.R;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class q9 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f31672a;

    static {
        HashMap hashMap = new HashMap();
        f31672a = hashMap;
        a3.l.v(R.string.hiad_installAuthServer, hashMap, "installAuthServer", R.string.hiad_analyticsServer, "analyticsServer", R.string.hiad_kitConfigServer, "kitConfigServer", R.string.hiad_consentConfigServer, "consentConfigServer");
        a3.l.v(R.string.hiad_consentSyncServer, hashMap, "consentSync", R.string.hiad_appDataServer, "appDataServer", R.string.hiad_adxServer, "adxServer", R.string.hiad_eventServer, "eventServer");
        a3.l.v(R.string.hiad_configServer, hashMap, "configServer", R.string.hiad_exSplashConfig, "exSplashConfig", R.string.hiad_appInsListConfigServer, "appInsListConfigServer", R.string.hiad_permissionServer, "permissionServer");
        a3.l.v(R.string.haid_complain_h5_server, hashMap, "complainH5Server", R.string.hiad_analyticsServerTv, "analyticsServerTv", R.string.hiad_kitConfigServerTv, "kitConfigServerTv", R.string.hiad_adxServerTv, "adxServerTv");
        hashMap.put("eventServerTv", Integer.valueOf(R.string.hiad_eventServerTv));
        hashMap.put("configServerTv", Integer.valueOf(R.string.hiad_configServerTv));
    }

    public static String a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            HashMap hashMap = f31672a;
            if (hashMap.containsKey(str) && Cif.a(context).d()) {
                StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
                j10.append(com.huawei.openalliance.ad.ppskit.utils.y1.i(context));
                if (hashMap.containsKey(j10.toString())) {
                    StringBuilder j11 = com.ironsource.adapters.facebook.a.j(str);
                    j11.append(com.huawei.openalliance.ad.ppskit.utils.y1.i(context));
                    str = j11.toString();
                }
                return context.getString(((Integer) hashMap.get(str)).intValue());
            }
            return "";
        }
        return "";
    }
}
