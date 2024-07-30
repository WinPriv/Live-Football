package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import com.iab.omid.library.ironsrc.internal.c;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.internal.h;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.b;
import com.iab.omid.library.ironsrc.utils.g;
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
    private static final Pattern f24350l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f24351a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f24352b;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.weakreference.a f24354d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f24355e;

    /* renamed from: i, reason: collision with root package name */
    private boolean f24358i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f24359j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f24360k;

    /* renamed from: c, reason: collision with root package name */
    private final List<e> f24353c = new ArrayList();
    private boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f24356g = false;

    /* renamed from: h, reason: collision with root package name */
    private final String f24357h = UUID.randomUUID().toString();

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        AdSessionStatePublisher aVar;
        this.f24352b = adSessionConfiguration;
        this.f24351a = adSessionContext;
        d(null);
        if (adSessionContext.getAdSessionContextType() != AdSessionContextType.HTML && adSessionContext.getAdSessionContextType() != AdSessionContextType.JAVASCRIPT) {
            aVar = new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        } else {
            aVar = new com.iab.omid.library.ironsrc.publisher.a(adSessionContext.getWebView());
        }
        this.f24355e = aVar;
        this.f24355e.i();
        c.c().a(this);
        this.f24355e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f24358i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private e b(View view) {
        for (e eVar : this.f24353c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f24356g) {
            return;
        }
        a(view);
        a(str);
        if (b(view) == null) {
            this.f24353c.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public View c() {
        return this.f24354d.get();
    }

    public List<e> d() {
        return this.f24353c;
    }

    public boolean e() {
        if (this.f24360k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f24356g) {
            g.a(errorType, "Error type is null");
            g.a(str, "Message is null");
            getAdSessionStatePublisher().a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public boolean f() {
        if (this.f && !this.f24356g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void finish() {
        if (this.f24356g) {
            return;
        }
        this.f24354d.clear();
        removeAllFriendlyObstructions();
        this.f24356g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f24355e = null;
        this.f24360k = null;
    }

    public boolean g() {
        return this.f24356g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public String getAdSessionId() {
        return this.f24357h;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f24355e;
    }

    public boolean h() {
        return this.f24352b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f24352b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f24358i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f24359j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f24356g) {
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

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f24356g) {
            return;
        }
        this.f24353c.clear();
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f24356g) {
            return;
        }
        a(view);
        e b10 = b(view);
        if (b10 != null) {
            this.f24353c.remove(b10);
        }
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f24360k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void start() {
        if (this.f) {
            return;
        }
        this.f = true;
        c.c().c(this);
        this.f24355e.a(h.c().b());
        this.f24355e.a(com.iab.omid.library.ironsrc.internal.a.a().b());
        this.f24355e.a(this, this.f24351a);
    }

    private static void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void b() {
        if (this.f24359j) {
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
                aVar.f24354d.clear();
            }
        }
    }

    private void d(View view) {
        this.f24354d = new com.iab.omid.library.ironsrc.weakreference.a(view);
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f24350l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    public void a(List<com.iab.omid.library.ironsrc.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.ironsrc.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f24360k.onPossibleObstructionsDetected(this.f24357h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f24359j = true;
    }
}
