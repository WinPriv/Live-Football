package com.applovin.impl.mediation.debugger.c;

import a3.k;
import android.text.TextUtils;
import com.applovin.impl.mediation.debugger.a;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class b extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f18001a;

    /* loaded from: classes.dex */
    public interface a {
        void a(a.b bVar);

        void a(String str);
    }

    public b(p pVar, a aVar) {
        super("TaskFetchDeveloperUri", pVar);
        this.f18001a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String valueOf;
        if (this.f.S() != null) {
            valueOf = String.valueOf(this.f.Q().B().d());
        } else {
            valueOf = String.valueOf(this.f.R().h().get("package_name"));
        }
        if (y.a()) {
            this.f18839h.b(this.f18838g, "Looking up developer URI for package name: ".concat(valueOf));
        }
        this.f.M().a((com.applovin.impl.sdk.e.a) new u<String>(com.applovin.impl.sdk.network.c.a(this.f).b("GET").a("https://play.google.com/store/apps/details?id=".concat(valueOf)).a((c.a) "").c(false).a(), this.f) { // from class: com.applovin.impl.mediation.debugger.c.b.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(String str, int i10) {
                if (TextUtils.isEmpty(str)) {
                    if (y.a()) {
                        this.f18839h.e(this.f18838g, "No developer URI found - response is empty");
                    }
                    b.this.f18001a.a(a.b.DEVELOPER_URI_NOT_FOUND);
                }
                Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").+?(?=\">)").matcher(str);
                if (matcher.find()) {
                    String group = matcher.group();
                    if (y.a()) {
                        k.t("Found developer URI: ", group, this.f18839h, this.f18838g);
                    }
                    b.this.f18001a.a(group);
                    return;
                }
                if (y.a()) {
                    this.f18839h.e(this.f18838g, "Unable to find developer URI from the Play Store listing metadata");
                }
                b.this.f18001a.a(a.b.DEVELOPER_URI_NOT_FOUND);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, String str2) {
                if (y.a()) {
                    this.f18839h.e(this.f18838g, "Unable to fetch developer URI due to: " + str + ", and received error code: " + i10);
                }
                b.this.f18001a.a(a.b.DEVELOPER_URI_NOT_FOUND);
            }
        });
    }
}
