package gb;

import android.content.Context;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.beans.inner.SourceParam;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class u0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SourceParam f28632s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f28633t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f28634u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f28635v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f28636w;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            u0 u0Var = u0.this;
            Context context = u0Var.f28634u;
            SourceParam sourceParam = u0Var.f28632s;
            String str = u0Var.f28635v;
            String str2 = u0Var.f28636w;
            byte[] bArr = w0.f28642a;
            if (!p.a(sourceParam.a())) {
                w0.a(sourceParam.a());
                w0.m(context, 2, sourceParam, "fromNet url is not http | " + sourceParam.f());
                return;
            }
            ex.V("ImageUtil", "loadImageFromNet");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("content_id", str);
                jSONObject.put("slotid", str2);
                jSONObject.put("content", b.p(sourceParam));
                ha.i.e(context).d(com.huawei.openalliance.ad.constant.s.L, jSONObject.toString(), new v0(sourceParam, context), String.class);
            } catch (JSONException unused) {
                ex.I("ImageUtil", "loadImageInfo jsonex");
            }
        }
    }

    public u0(Context context, SourceParam sourceParam, j jVar, String str, String str2) {
        this.f28632s = sourceParam;
        this.f28633t = jVar;
        this.f28634u = context;
        this.f28635v = str;
        this.f28636w = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String a10;
        boolean containsKey;
        byte[] bArr = w0.f28642a;
        synchronized (bArr) {
            a10 = this.f28632s.a();
            synchronized (bArr) {
                containsKey = w0.f28643b.containsKey(a10);
            }
        }
        if (containsKey) {
            w0.h(a10, this.f28633t);
            return;
        }
        w0.h(a10, this.f28633t);
        if (!w0.i(this.f28634u, this.f28632s, this.f28632s.a(), this.f28632s.a())) {
            c0.d(new a());
        }
    }
}
