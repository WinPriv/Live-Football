package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.net.http.Response;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class fd implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f31178s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31179t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f31180u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f31181v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f31182w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f31183x;
    public final /* synthetic */ Response y;

    public fd(Context context, String str, String str2, String str3, List list, int i10, Response response) {
        this.f31178s = context;
        this.f31179t = str;
        this.f31180u = str2;
        this.f31181v = str3;
        this.f31182w = list;
        this.f31183x = i10;
        this.y = response;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        Throwable E;
        u uVar = new u(this.f31178s);
        uVar.f31723b = this.f31179t;
        String str3 = this.f31180u;
        String str4 = this.f31181v;
        int i10 = this.f31183x;
        Response response = this.y;
        int i11 = -1;
        if (response != null && (E = response.E()) != null) {
            str = E.getClass().getSimpleName();
            str2 = E.getMessage();
            if (E instanceof SSLHandshakeException) {
                i11 = 10000;
            } else if (E instanceof SocketTimeoutException) {
                i11 = 10001;
            } else if (E instanceof ConnectException) {
                i11 = 10002;
            } else if (E instanceof UnknownHostException) {
                i11 = 10003;
            } else if (E instanceof JSONException) {
                i11 = 10004;
            }
        } else {
            str = null;
            str2 = "unknown";
        }
        int i12 = i11;
        String str5 = str;
        String str6 = str2;
        for (String str7 : this.f31182w) {
            if (!TextUtils.isEmpty(str7)) {
                uVar.n(str3, str4, str7, str5, i10, i12, str6);
            }
        }
    }
}
