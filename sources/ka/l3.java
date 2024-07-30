package ka;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l3 extends a3 {
    public l3() {
        super("setAutoOpen");
    }

    @Override // ka.y, ka.b2
    public final String a(Context context, String str, String str2, String str3) {
        new JSONObject(str3).getBoolean("auto_open");
        ra.g.j(context).f34954g.getClass();
        return null;
    }
}
