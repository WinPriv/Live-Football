package ic;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b implements pc.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29538b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sc.a f29539c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f29541e;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ lc.a f29542s;

        public a(lc.a aVar) {
            this.f29542s = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject jSONObject;
            try {
                JSONObject jSONObject2 = new JSONObject(b.this.f29538b);
                lc.a aVar = this.f29542s;
                if (aVar != null && (jSONObject = aVar.f32592a) != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject.optString(next));
                    }
                    jSONObject2.put("setting_id", b.this.f29539c.f35305a);
                } else if (aVar != null && aVar.f32593b != null) {
                    jSONObject2.put("type", 10001);
                    jSONObject2.put("i_t", this.f29542s.f32593b.f32594a);
                    if (!TextUtils.isEmpty(this.f29542s.f32593b.f32595b)) {
                        jSONObject2.put("i_al", pc.d.b(this.f29542s.f32593b.f32595b.getBytes()));
                    }
                } else {
                    int i10 = b.this.f29537a;
                    if (i10 != 18 && i10 != 19 && i10 != 20) {
                        return;
                    }
                }
                oc.b a10 = oc.b.a();
                String str = b.this.f29540d;
                JSONObject jSONObject3 = new JSONObject(b.this.f29541e);
                synchronized (a10) {
                    a10.b(1, str, jSONObject3, jSONObject2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public b(int i10, String str, sc.a aVar, String str2, String str3) {
        this.f29537a = i10;
        this.f29538b = str;
        this.f29539c = aVar;
        this.f29540d = str2;
        this.f29541e = str3;
    }

    public final void a(lc.a aVar) {
        int i10;
        if (aVar == null && (i10 = this.f29537a) != 18 && i10 != 19 && i10 != 20) {
            return;
        }
        jc.b.a();
        rc.b.a().b(new a(aVar));
    }
}
