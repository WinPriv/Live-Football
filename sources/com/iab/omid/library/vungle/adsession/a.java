package com.iab.omid.library.vungle.adsession;

import android.view.View;
import com.iab.omid.library.vungle.b.c;
import com.iab.omid.library.vungle.b.f;
import com.iab.omid.library.vungle.d.e;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import com.iab.omid.library.vungle.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f24473a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionContext f24474b;

    /* renamed from: c, reason: collision with root package name */
    private final AdSessionConfiguration f24475c;

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.vungle.e.a f24477e;
    private AdSessionStatePublisher f;

    /* renamed from: j, reason: collision with root package name */
    private boolean f24481j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f24482k;

    /* renamed from: d, reason: collision with root package name */
    private final List<c> f24476d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private boolean f24478g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f24479h = false;

    /* renamed from: i, reason: collision with root package name */
    private final String f24480i = UUID.randomUUID().toString();

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        AdSessionStatePublisher aVar;
        this.f24475c = adSessionConfiguration;
        this.f24474b = adSessionContext;
        c(null);
        if (adSessionContext.getAdSessionContextType() != AdSessionContextType.HTML && adSessionContext.getAdSessionContextType() != AdSessionContextType.JAVASCRIPT) {
            aVar = new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        } else {
            aVar = new com.iab.omid.library.vungle.publisher.a(adSessionContext.getWebView());
        }
        this.f = aVar;
        this.f.a();
        com.iab.omid.library.vungle.b.a.a().a(this);
        this.f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c cVar : this.f24476d) {
            if (cVar.a().get() == view) {
                return cVar;
            }
        }
        return null;
    }

    private void j() {
        if (!this.f24481j) {
        } else {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void k() {
        if (!this.f24482k) {
        } else {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f24479h) {
            return;
        }
        b(view);
        a(str);
        if (a(view) == null) {
            this.f24476d.add(new c(view, friendlyObstructionPurpose, str));
        }
    }

    public void b() {
        j();
        getAdSessionStatePublisher().g();
        this.f24481j = true;
    }

    public void c() {
        k();
        getAdSessionStatePublisher().h();
        this.f24482k = true;
    }

    public View d() {
        return this.f24477e.get();
    }

    public boolean e() {
        if (this.f24478g && !this.f24479h) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f24479h) {
            e.a(errorType, "Error type is null");
            e.a(str, "Message is null");
            getAdSessionStatePublisher().a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public boolean f() {
        return this.f24478g;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void finish() {
        if (this.f24479h) {
            return;
        }
        this.f24477e.clear();
        removeAllFriendlyObstructions();
        this.f24479h = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.vungle.b.a.a().c(this);
        getAdSessionStatePublisher().b();
        this.f = null;
    }

    public boolean g() {
        return this.f24479h;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public String getAdSessionId() {
        return this.f24480i;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f;
    }

    public boolean h() {
        return this.f24475c.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f24475c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f24479h) {
            return;
        }
        e.a(view, "AdView is null");
        if (d() == view) {
            return;
        }
        c(view);
        getAdSessionStatePublisher().i();
        d(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f24479h) {
            return;
        }
        this.f24476d.clear();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f24479h) {
            return;
        }
        b(view);
        c a10 = a(view);
        if (a10 != null) {
            this.f24476d.remove(a10);
        }
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void start() {
        if (this.f24478g) {
            return;
        }
        this.f24478g = true;
        com.iab.omid.library.vungle.b.a.a().b(this);
        this.f.a(f.a().d());
        this.f.a(this, this.f24474b);
    }

    private static void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void c(View view) {
        this.f24477e = new com.iab.omid.library.vungle.e.a(view);
    }

    private void d(View view) {
        Collection<a> b10 = com.iab.omid.library.vungle.b.a.a().b();
        if (b10 == null || b10.isEmpty()) {
            return;
        }
        for (a aVar : b10) {
            if (aVar != this && aVar.d() == view) {
                aVar.f24477e.clear();
            }
        }
    }

    public List<c> a() {
        return this.f24476d;
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f24473a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    public void a(JSONObject jSONObject) {
        k();
        getAdSessionStatePublisher().a(jSONObject);
        this.f24482k = true;
    }
}
