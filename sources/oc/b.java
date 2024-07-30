package oc;

import java.util.HashMap;
import java.util.Random;
import org.json.JSONObject;
import sc.c;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static b f33813b;

    /* renamed from: a, reason: collision with root package name */
    public HashMap f33814a;

    public static b a() {
        if (f33813b == null) {
            f33813b = new b();
        }
        return f33813b;
    }

    public final synchronized void b(int i10, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        int i11;
        sc.a b10 = c.a(jc.b.a().f30202a).b();
        if (b10 == null) {
            return;
        }
        lc.b bVar = b10.f35308d.get(str);
        if (bVar != null) {
            i11 = bVar.f32597b;
            int i12 = bVar.f32598c;
            if (i11 == 0 && i12 == 0) {
                i11 = 0;
            } else if (i11 != i12) {
                i11 += new Random().nextInt(i12 - i11);
            }
        } else {
            i11 = 5000;
        }
        jc.b.a().f30203b.postDelayed(new a(this, str, jSONObject, jSONObject2, i10), i11);
    }

    public final void c(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            jSONObject2.put("sdk_time", System.currentTimeMillis());
            jSONObject2.put("type", 17);
            jSONObject2.put("setting_id", str2);
        } catch (Throwable unused) {
        }
        b(3, str, jSONObject, jSONObject2);
    }
}
