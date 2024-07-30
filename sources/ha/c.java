package ha;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.transition.n;
import com.huawei.hms.ads.ec;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.ipc.CallResult;
import gb.r0;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static c f28796c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f28797d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static final Uri f28798e = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/pps/api/call").build();

    /* renamed from: a, reason: collision with root package name */
    public volatile Uri f28799a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f28800b;

    public c(Context context) {
        this.f28800b = context.getApplicationContext();
    }

    public static c c(Context context) {
        c cVar;
        synchronized (f28797d) {
            if (f28796c == null) {
                f28796c = new c(context);
            }
            cVar = f28796c;
        }
        return cVar;
    }

    public final Uri a(boolean z10) {
        if (z10) {
            return f28798e;
        }
        int t10 = ec.Code(this.f28800b).t();
        ex.V("ApiCallManager", "ads selection:" + t10);
        if (r0.k(this.f28800b) && (t10 == 0 || t10 == 2)) {
            return f28798e;
        }
        if (r0.f()) {
            if (this.f28799a == null) {
                this.f28799a = new Uri.Builder().scheme("content").authority(this.f28800b.getPackageName() + ".pps.innerapiprovider").path("/pps/api/call").build();
            }
            return this.f28799a;
        }
        return f28798e;
    }

    public final CallResult b(Class cls, String str, String str2, boolean z10) {
        CallResult callResult = new CallResult();
        Cursor cursor = null;
        try {
            try {
                ex.V("ApiCallManager", "call remote method: %s", str);
                if (ex.Code()) {
                    ex.Code("ApiCallManager", "paramContent: %s", n.e(str2));
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sdk_version", "13.4.65.300");
                jSONObject.put("content", str2);
                cursor = this.f28800b.getContentResolver().query(a(z10), null, null, new String[]{str, jSONObject.toString()}, null);
                if (cursor != null && cursor.moveToFirst()) {
                    int i10 = cursor.getInt(cursor.getColumnIndexOrThrow("code"));
                    callResult.setCode(i10);
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("content"));
                    ex.Code("ApiCallManager", "call: %s code: %s result: %s", str, Integer.valueOf(i10), string);
                    if (i10 == 200) {
                        callResult.setData(n.c(cls, string));
                    } else {
                        callResult.setMsg(string);
                    }
                }
            } catch (IllegalArgumentException e10) {
                e = e10;
                ex.I("ApiCallManager", "callRemote IllegalArgumentException");
                callResult.setCode(-1);
                callResult.setMsg(e.getMessage());
                n.g(cursor);
                ex.V("ApiCallManager", "call %s code: %s msg: %s", str, Integer.valueOf(callResult.getCode()), callResult.getMsg());
                return callResult;
            } catch (Throwable th) {
                e = th;
                ex.I("ApiCallManager", "callRemote ".concat(e.getClass().getSimpleName()));
                callResult.setCode(-1);
                callResult.setMsg(e.getMessage());
                n.g(cursor);
                ex.V("ApiCallManager", "call %s code: %s msg: %s", str, Integer.valueOf(callResult.getCode()), callResult.getMsg());
                return callResult;
            }
            n.g(cursor);
            ex.V("ApiCallManager", "call %s code: %s msg: %s", str, Integer.valueOf(callResult.getCode()), callResult.getMsg());
            return callResult;
        } catch (Throwable th2) {
            n.g(null);
            throw th2;
        }
    }
}
