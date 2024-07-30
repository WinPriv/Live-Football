package ka;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c3 extends a3 {
    public c3() {
        super("continueInstall");
    }

    @Override // ka.y, ka.b2
    public final String a(Context context, String str, String str2, String str3) {
        n7.c("CmdContinueInstall", " CmdContinueInstall packageName=%s", new JSONObject(str3).getString("package_name"));
        ra.g.j(context).getClass();
        new ra.f(context);
        n7.b("AppDownloadDelegate", "installApp start");
        return null;
    }
}
