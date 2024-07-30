package ka;

import android.text.TextUtils;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import ka.c9;

/* loaded from: classes2.dex */
public final class b9 implements d9 {

    /* renamed from: a, reason: collision with root package name */
    public final HttpClient f30978a = new HttpClient.Builder().callTimeout(8).connectTimeout(5000).readTimeout(30000).build();

    public final Request a(a4.j jVar) {
        androidx.transition.r g6 = jVar.g();
        Request.Builder newRequest = this.f30978a.newRequest();
        newRequest.url(jVar.b()).method("GET");
        if (g6 != null) {
            for (String str : g6.e()) {
                String d10 = g6.d(str);
                if (!TextUtils.isEmpty(d10)) {
                    newRequest.addHeader(str, d10);
                }
            }
        }
        return newRequest.build();
    }

    public final void b(a4.j jVar, c9.a aVar) {
        this.f30978a.newSubmit(a(jVar)).enqueue(new a9());
    }
}
