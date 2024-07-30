package ka;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j3 extends a3 {
    public j3() {
        super("getDownloadStatus");
    }

    @Override // ka.y, ka.b2
    public final String a(Context context, String str, String str2, String str3) {
        String string = new JSONObject(str3).getString("content");
        n7.c("QueryDownloadTaskCmd", " QueryDownloadTaskCmd content=%s", string);
        ra.g.j(context).getClass();
        return null;
    }
}
