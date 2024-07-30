package com.applovin.impl.mediation.debugger.c;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.mediation.debugger.a;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f17998a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0209a f17999b;

    /* renamed from: com.applovin.impl.mediation.debugger.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0209a {
        void b(a.b bVar);

        void b(String str);
    }

    public a(p pVar, String str, InterfaceC0209a interfaceC0209a) {
        super("TaskFetchAppAdsContent", pVar);
        this.f17998a = str;
        this.f17999b = interfaceC0209a;
    }

    @Override // java.lang.Runnable
    public void run() {
        Uri parse = Uri.parse(this.f17998a);
        Uri build = new Uri.Builder().scheme("https").authority(parse.getAuthority()).appendPath("app-ads.txt").build();
        Uri build2 = new Uri.Builder().scheme("http").authority(parse.getAuthority()).appendPath("app-ads.txt").build();
        if (y.a()) {
            this.f18839h.b(this.f18838g, "Looking up app-ads.txt at " + build);
        }
        this.f.M().a((com.applovin.impl.sdk.e.a) new u<String>(com.applovin.impl.sdk.network.c.a(this.f).b("GET").a(build.toString()).c(build2.toString()).a((c.a) "").c(false).a(), this.f) { // from class: com.applovin.impl.mediation.debugger.c.a.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(String str, int i10) {
                if (TextUtils.isEmpty(str)) {
                    if (y.a()) {
                        this.f18839h.e(this.f18838g, "No app-ads.txt found");
                    }
                    a.this.f17999b.b(a.b.APPADSTXT_NOT_FOUND);
                } else {
                    if (y.a()) {
                        this.f18839h.b(this.f18838g, "Found app-ads.txt");
                    }
                    a.this.f17999b.b(str);
                }
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, String str2) {
                if (y.a()) {
                    this.f18839h.e(this.f18838g, "Unable to fetch app-ads.txt due to: " + str + ", and received error code: " + i10);
                }
                a.this.f17999b.b(a.b.APPADSTXT_NOT_FOUND);
            }
        });
    }
}
