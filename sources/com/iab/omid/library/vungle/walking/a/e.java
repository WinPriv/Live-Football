package com.iab.omid.library.vungle.walking.a;

import com.iab.omid.library.vungle.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e extends a {
    public e(b.InterfaceC0316b interfaceC0316b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0316b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.vungle.b.a a10 = com.iab.omid.library.vungle.b.a.a();
        if (a10 != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : a10.b()) {
                if (((a) this).f24560a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f24562c);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f24561b.toString();
    }

    @Override // com.iab.omid.library.vungle.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
