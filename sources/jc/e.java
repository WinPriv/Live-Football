package jc;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;
import pc.g;

/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f30217s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f30218t;

    public e(b bVar, String str) {
        this.f30218t = bVar;
        this.f30217s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.f30218t;
        g.a(bVar.f30202a, "P_CE_PE", "");
        String str = this.f30217s;
        HashMap hashMap = pc.d.f34495a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("k");
            String optString2 = jSONObject.optString("v");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                pc.d.f34499e = optString;
                pc.d.f = optString2;
                for (int i10 = 0; i10 < pc.d.f34499e.length(); i10++) {
                    pc.d.f34496b.put(Character.valueOf(pc.d.f.charAt(i10)), Character.valueOf(pc.d.f34499e.charAt(i10)));
                }
                for (int i11 = 0; i11 < pc.d.f34499e.length(); i11++) {
                    pc.d.f34495a.put(Character.valueOf(pc.d.f34499e.charAt(i11)), Character.valueOf(pc.d.f.charAt(i11)));
                }
            }
        } catch (Throwable unused) {
        }
        Context context = bVar.f30202a;
        d dVar = new d(bVar, sc.c.a(context).b());
        if (Looper.getMainLooper() == Looper.myLooper()) {
            dVar.run();
        } else {
            bVar.f30203b.post(dVar);
        }
        rc.b.a().b(new c(bVar, context));
    }
}
