package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.provider.InnerApiProvider;
import com.huawei.openalliance.ad.ppskit.provider.a;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import za.c;

/* loaded from: classes2.dex */
public final class d3 extends y {
    public d3() {
        super(com.huawei.openalliance.ad.constant.s.L);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        String C;
        ContentRecord l10;
        JSONObject jSONObject = new JSONObject(str3);
        String optString = jSONObject.optString("content_id");
        String optString2 = jSONObject.optString("content");
        String optString3 = jSONObject.optString("slotid");
        SourceParam sourceParam = (SourceParam) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, optString2, SourceParam.class, new Class[0]);
        if (!TextUtils.isEmpty(optString) && (l10 = j7.r.l(context, str, optString, optString3)) != null) {
            sourceParam.e(l10);
        }
        sourceParam.g(Long.valueOf(System.currentTimeMillis()));
        if (sourceParam.r() != null) {
            za.c cVar = new za.c(context, sourceParam);
            if (TextUtils.isEmpty(sourceParam.C())) {
                C = "normal";
            } else {
                C = sourceParam.C();
            }
            String r10 = sourceParam.r();
            a aVar2 = new a(aVar, context, C);
            synchronized (za.c.class) {
                if (!TextUtils.isEmpty(r10)) {
                    ConcurrentHashMap concurrentHashMap = za.c.f37349i;
                    Set set = (Set) concurrentHashMap.get(r10);
                    if (set == null) {
                        set = new HashSet();
                        concurrentHashMap.put(r10, set);
                    }
                    set.add(aVar2);
                }
            }
            cVar.e();
        }
    }

    /* loaded from: classes2.dex */
    public class a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.huawei.android.hms.ppskit.a f31083a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f31084b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f31085c;

        public a(com.huawei.android.hms.ppskit.a aVar, Context context, String str) {
            this.f31083a = aVar;
            this.f31084b = context;
            this.f31085c = str;
        }

        @Override // za.c.a
        public final void a() {
            y.d(this.f31083a, d3.this.f32203a, -1, "");
        }

        @Override // za.c.a
        public final void a(String str) {
            String[] strArr = InnerApiProvider.f22792v;
            String b10 = a.b.b(this.f31084b, str, this.f31085c);
            y.d(this.f31083a, d3.this.f32203a, 200, b10);
        }
    }
}
