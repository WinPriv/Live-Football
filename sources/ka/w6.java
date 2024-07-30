package ka;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class w6 {

    /* renamed from: c, reason: collision with root package name */
    public static w6 f32071c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f32072d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static final Uri f32073e = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/pps/api/call").build();

    /* renamed from: a, reason: collision with root package name */
    public volatile Uri f32074a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f32075b;

    public w6(Context context) {
        this.f32075b = context.getApplicationContext();
    }

    public static w6 b(Context context) {
        w6 w6Var;
        synchronized (f32072d) {
            if (f32071c == null) {
                f32071c = new w6(context);
            }
            w6Var = f32071c;
        }
        return w6Var;
    }

    public final Uri a(boolean z10) {
        if (z10) {
            return f32073e;
        }
        if (com.huawei.openalliance.ad.ppskit.utils.d0.m(this.f32075b)) {
            return f32073e;
        }
        if (this.f32074a == null) {
            this.f32074a = new Uri.Builder().scheme("content").authority(this.f32075b.getPackageName() + ".pps.innerapiprovider").path("/pps/api/call").build();
        }
        return this.f32074a;
    }

    public final y6 c(Class cls, String str, String str2, boolean z10) {
        y6 y6Var = new y6(0);
        Cursor cursor = null;
        try {
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sdk_version", "3.4.65.300");
                    jSONObject.put("content", str2);
                    cursor = this.f32075b.getContentResolver().query(a(z10), null, null, new String[]{str, jSONObject.toString()}, null);
                    if (cursor != null && cursor.moveToFirst()) {
                        int i10 = cursor.getInt(cursor.getColumnIndexOrThrow("code"));
                        y6Var.f32210b = i10;
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("content"));
                        if (n7.d()) {
                            n7.c("ApiCallManager", "call: %s code: %s result: %s", str, Integer.valueOf(i10), string);
                        }
                        if (i10 == 200) {
                            y6Var.f32211c = androidx.transition.n.r(cls, string);
                        } else {
                            y6Var.f32209a = string;
                        }
                    }
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    n7.g("ApiCallManager", "callRemote IllegalArgumentException");
                    y6Var.f32210b = -1;
                    y6Var.f32209a = e.getMessage();
                    androidx.transition.n.D(cursor);
                    n7.f("ApiCallManager", "call %s code: %s msg: %s", str, Integer.valueOf(y6Var.f32210b), y6Var.f32209a);
                    return y6Var;
                }
            } catch (Throwable th) {
                e = th;
                n7.g("ApiCallManager", "callRemote ".concat(e.getClass().getSimpleName()));
                y6Var.f32210b = -1;
                y6Var.f32209a = e.getMessage();
                androidx.transition.n.D(cursor);
                n7.f("ApiCallManager", "call %s code: %s msg: %s", str, Integer.valueOf(y6Var.f32210b), y6Var.f32209a);
                return y6Var;
            }
            androidx.transition.n.D(cursor);
            n7.f("ApiCallManager", "call %s code: %s msg: %s", str, Integer.valueOf(y6Var.f32210b), y6Var.f32209a);
            return y6Var;
        } catch (Throwable th2) {
            androidx.transition.n.D(null);
            throw th2;
        }
    }
}
