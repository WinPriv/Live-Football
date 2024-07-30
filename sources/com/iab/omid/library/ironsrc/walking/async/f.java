package com.iab.omid.library.ironsrc.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f extends a {
    public f(b.InterfaceC0313b interfaceC0313b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0313b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.ironsrc.internal.c c10 = com.iab.omid.library.ironsrc.internal.c.c();
        if (c10 != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : c10.b()) {
                if (this.f24452c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f24454e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.ironsrc.utils.c.h(this.f24453d, this.f24456b.a())) {
            return null;
        }
        this.f24456b.a(this.f24453d);
        return this.f24453d.toString();
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
