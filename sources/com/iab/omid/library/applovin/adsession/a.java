package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends AdSession {

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f24232l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f24233a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f24234b;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f24236d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f24237e;

    /* renamed from: i, reason: collision with root package name */
    private boolean f24240i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f24241j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f24242k;

    /* renamed from: c, reason: collision with root package name */
    private final List<e> f24235c = new ArrayList();
    private boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f24238g = false;

    /* renamed from: h, reason: collision with root package name */
    private final String f24239h = UUID.randomUUID().toString();

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        AdSessionStatePublisher aVar;
        this.f24234b = adSessionConfiguration;
        this.f24233a = adSessionContext;
        d(null);
        if (adSessionContext.getAdSessionContextType() != AdSessionContextType.HTML && adSessionContext.getAdSessionContextType() != AdSessionContextType.JAVASCRIPT) {
            aVar = new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        } else {
            aVar = new com.iab.omid.library.applovin.publisher.a(adSessionContext.getWebView());
        }
        this.f24237e = aVar;
        this.f24237e.i();
        c.c().a(this);
        this.f24237e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f24240i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private e b(View view) {
        for (e eVar : this.f24235c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f24238g) {
            return;
        }
        a(view);
        a(str);
        if (b(view) == null) {
            this.f24235c.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public View c() {
        return this.f24236d.get();
    }

    public List<e> d() {
        return this.f24235c;
    }

    public boolean e() {
        if (this.f24242k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f24238g) {
            g.a(errorType, "Error type is null");
            g.a(str, "Message is null");
            getAdSessionStatePublisher().a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public boolean f() {
        if (this.f && !this.f24238g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f24238g) {
            return;
        }
        this.f24236d.clear();
        removeAllFriendlyObstructions();
        this.f24238g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f24237e = null;
        this.f24242k = null;
    }

    public boolean g() {
        return this.f24238g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public String getAdSessionId() {
        return this.f24239h;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f24237e;
    }

    public boolean h() {
        return this.f24234b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f24234b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f24240i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f24241j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f24238g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        d(view);
        getAdSessionStatePublisher().a();
        c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f24238g) {
            return;
        }
        this.f24235c.clear();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f24238g) {
            return;
        }
        a(view);
        e b10 = b(view);
        if (b10 != null) {
            this.f24235c.remove(b10);
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f24242k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f) {
            return;
        }
        this.f = true;
        c.c().c(this);
        this.f24237e.a(h.c().b());
        this.f24237e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f24237e.a(this, this.f24233a);
    }

    private static void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void b() {
        if (this.f24241j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void c(View view) {
        Collection<a> b10 = c.c().b();
        if (b10 == null || b10.isEmpty()) {
            return;
        }
        for (a aVar : b10) {
            if (aVar != this && aVar.c() == view) {
                aVar.f24236d.clear();
            }
        }
    }

    private void d(View view) {
        this.f24236d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f24232l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    public void a(List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.applovin.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f24242k.onPossibleObstructionsDetected(this.f24239h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f24241j = true;
    }
}
