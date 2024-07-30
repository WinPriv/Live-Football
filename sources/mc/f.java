package mc;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.b.g;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import n0.v0;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes2.dex */
public final class f extends b {

    /* renamed from: b, reason: collision with root package name */
    public final Context f33028b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33029c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f33030d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f33031e;

    public f(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f33028b = context;
        this.f33029c = str;
        this.f33030d = jSONObject;
        this.f33031e = jSONObject2;
    }

    @Override // mc.b
    public final String b(String str) {
        return str.trim();
    }

    @Override // mc.b
    public final String c() {
        lc.b bVar = sc.c.a(this.f33028b).b().f35308d.get(this.f33029c);
        if (ic.a.f29536a == null) {
            synchronized (ic.a.class) {
                if (ic.a.f29536a == null) {
                    ic.a.f29536a = new ic.a();
                }
            }
        }
        sc.a c10 = sc.c.c(jc.b.a().f30202a);
        String str = "https://pitk.birdgesdk.com/v1/ptk";
        if (c10 != null) {
            String str2 = c10.f35319q;
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
        }
        if (bVar != null) {
            return bVar.f32596a;
        }
        return str;
    }

    @Override // mc.b
    public final HashMap d() {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpConnection.CONTENT_ENCODING, com.anythink.expressad.foundation.g.f.g.c.f10012d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // mc.b
    public final byte[] e() {
        String g6 = g();
        if (g6 != null && g6.length() != 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(g6.getBytes(com.anythink.expressad.foundation.g.a.bN));
                gZIPOutputStream.close();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    @Override // mc.b
    public final JSONObject f() {
        JSONObject jSONObject = this.f33030d;
        if (jSONObject == null) {
            return super.f();
        }
        return jSONObject;
    }

    @Override // mc.b
    public final String g() {
        JSONObject jSONObject = new JSONObject();
        String c10 = pc.d.c(f().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f33031e);
        String c11 = pc.d.c(jSONArray.toString());
        String b10 = v0.b("d_version=1.0&dt=" + c11 + "&cm=" + c10);
        try {
            jSONObject.put("cm", c10);
            jSONObject.put("dt", c11);
            jSONObject.put("d_version", g.c.f5034a);
            jSONObject.put("d_sign", b10);
            jSONObject.put("pl_c", "2");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // mc.b
    public final boolean h() {
        return false;
    }
}
