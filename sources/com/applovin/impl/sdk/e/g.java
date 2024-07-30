package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g extends a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.l f18859a;

    /* renamed from: b, reason: collision with root package name */
    private final AppLovinPostbackListener f18860b;

    /* renamed from: c, reason: collision with root package name */
    private final o.a f18861c;

    public g(com.applovin.impl.sdk.network.l lVar, o.a aVar, com.applovin.impl.sdk.p pVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", pVar);
        if (lVar != null) {
            this.f18859a = lVar;
            this.f18860b = appLovinPostbackListener;
            this.f18861c = aVar;
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!StringUtils.isValidString(this.f18859a.a())) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.c(this.f18838g, "Requested URL is not valid; nothing to do...");
            }
            AppLovinPostbackListener appLovinPostbackListener = this.f18860b;
            if (appLovinPostbackListener != null) {
                appLovinPostbackListener.onPostbackFailure(this.f18859a.a(), AppLovinErrorCodes.INVALID_URL);
                return;
            }
            return;
        }
        if (this.f18859a.r()) {
            AppLovinPostbackListener appLovinPostbackListener2 = new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.e.g.1
                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackFailure(String str, int i10) {
                    g.this.a();
                }

                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackSuccess(String str) {
                    if (g.this.f18860b != null) {
                        g.this.f18860b.onPostbackSuccess(g.this.f18859a.a());
                    }
                }
            };
            if (((Boolean) d().a(com.applovin.impl.sdk.c.b.fQ)).booleanValue()) {
                d().aa().a(this.f18859a, appLovinPostbackListener2);
                return;
            } else {
                com.applovin.impl.adview.d.a(this.f18859a, d(), appLovinPostbackListener2);
                return;
            }
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        u<Object> uVar = new u<Object>(this.f18859a, d()) { // from class: com.applovin.impl.sdk.e.g.2

            /* renamed from: a, reason: collision with root package name */
            final String f18863a;

            {
                this.f18863a = g.this.f18859a.a();
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(Object obj, int i10) {
                if (obj instanceof String) {
                    for (String str : this.f.b(com.applovin.impl.sdk.c.b.f18709bb)) {
                        if (str.startsWith(str)) {
                            String str2 = (String) obj;
                            if (TextUtils.isEmpty(str2)) {
                                continue;
                            } else {
                                try {
                                    JSONObject jSONObject = new JSONObject(str2);
                                    com.applovin.impl.sdk.utils.i.d(jSONObject, this.f);
                                    com.applovin.impl.sdk.utils.i.c(jSONObject, this.f);
                                    com.applovin.impl.sdk.utils.i.e(jSONObject, this.f);
                                    break;
                                } catch (JSONException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (g.this.f18860b != null) {
                    g.this.f18860b.onPostbackSuccess(this.f18863a);
                }
                if (g.this.f18859a.p()) {
                    this.f.ab().a(g.this.f18859a.q(), this.f18863a, i10, obj, null, true);
                }
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, Object obj) {
                if (com.applovin.impl.sdk.y.a()) {
                    com.applovin.impl.sdk.y yVar = this.f18839h;
                    String str2 = this.f18838g;
                    StringBuilder n10 = a3.k.n("Failed to dispatch postback. Error code: ", i10, " URL: ");
                    n10.append(this.f18863a);
                    yVar.e(str2, n10.toString());
                }
                if (g.this.f18860b != null) {
                    g.this.f18860b.onPostbackFailure(this.f18863a, i10);
                }
                if (g.this.f18859a.p()) {
                    this.f.ab().a(g.this.f18859a.q(), this.f18863a, i10, obj, str, false);
                }
            }
        };
        uVar.a(this.f18861c);
        d().M().a((a) uVar);
    }
}
