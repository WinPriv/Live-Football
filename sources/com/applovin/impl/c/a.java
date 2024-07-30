package com.applovin.impl.c;

import android.net.Uri;
import com.applovin.impl.c.n;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.ad.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f17357a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17358b;

    /* renamed from: c, reason: collision with root package name */
    private final j f17359c;

    /* renamed from: d, reason: collision with root package name */
    private final long f17360d;

    /* renamed from: e, reason: collision with root package name */
    private final n f17361e;
    private final d f;

    /* renamed from: g, reason: collision with root package name */
    private final String f17362g;

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.c.c f17363h;

    /* renamed from: i, reason: collision with root package name */
    private final com.applovin.impl.sdk.a.g f17364i;

    /* renamed from: j, reason: collision with root package name */
    private final Set<k> f17365j;

    /* renamed from: k, reason: collision with root package name */
    private final Set<k> f17366k;

    /* renamed from: com.applovin.impl.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0199a {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f17367a;

        /* renamed from: b, reason: collision with root package name */
        private JSONObject f17368b;

        /* renamed from: c, reason: collision with root package name */
        private com.applovin.impl.sdk.ad.b f17369c;

        /* renamed from: d, reason: collision with root package name */
        private p f17370d;

        /* renamed from: e, reason: collision with root package name */
        private long f17371e;
        private String f;

        /* renamed from: g, reason: collision with root package name */
        private String f17372g;

        /* renamed from: h, reason: collision with root package name */
        private j f17373h;

        /* renamed from: i, reason: collision with root package name */
        private n f17374i;

        /* renamed from: j, reason: collision with root package name */
        private d f17375j;

        /* renamed from: k, reason: collision with root package name */
        private com.applovin.impl.c.c f17376k;

        /* renamed from: l, reason: collision with root package name */
        private Set<k> f17377l;

        /* renamed from: m, reason: collision with root package name */
        private Set<k> f17378m;

        public C0199a a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f17367a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public C0199a b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f17368b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public C0199a a(com.applovin.impl.sdk.ad.b bVar) {
            this.f17369c = bVar;
            return this;
        }

        public C0199a b(String str) {
            this.f17372g = str;
            return this;
        }

        public C0199a a(p pVar) {
            if (pVar != null) {
                this.f17370d = pVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public C0199a b(Set<k> set) {
            this.f17378m = set;
            return this;
        }

        public C0199a a(String str) {
            this.f = str;
            return this;
        }

        public C0199a a(j jVar) {
            this.f17373h = jVar;
            return this;
        }

        public C0199a a(n nVar) {
            this.f17374i = nVar;
            return this;
        }

        public C0199a a(d dVar) {
            this.f17375j = dVar;
            return this;
        }

        public C0199a a(com.applovin.impl.c.c cVar) {
            this.f17376k = cVar;
            return this;
        }

        public C0199a a(Set<k> set) {
            this.f17377l = set;
            return this;
        }

        public C0199a a(long j10) {
            this.f17371e = j10;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        COMPANION_AD,
        VIDEO
    }

    /* loaded from: classes.dex */
    public enum c {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private String aZ() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject == null) {
            return null;
        }
        return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
    }

    private n.a ba() {
        n.a[] values = n.a.values();
        int intValue = ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.eN)).intValue();
        if (intValue >= 0 && intValue < values.length) {
            return values[intValue];
        }
        return n.a.UNSPECIFIED;
    }

    private Set<k> bb() {
        n nVar = this.f17361e;
        if (nVar != null) {
            return nVar.d();
        }
        return Collections.emptySet();
    }

    private Set<k> bc() {
        d dVar = this.f;
        if (dVar != null) {
            return dVar.c();
        }
        return Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.ad.e
    public boolean E() {
        if (getBooleanFromAdObject("video_clickable", Boolean.FALSE) && j() != null) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public void a() {
    }

    public n aO() {
        return this.f17361e;
    }

    public o aP() {
        n nVar = this.f17361e;
        if (nVar != null) {
            return nVar.a(ba());
        }
        return null;
    }

    public d aQ() {
        return this.f;
    }

    public g aR() {
        n nVar = this.f17361e;
        if (nVar != null) {
            return nVar.f();
        }
        return null;
    }

    public boolean aS() {
        if (aR() != null) {
            return true;
        }
        return false;
    }

    public boolean aT() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public String aU() {
        return getStringFromAdObject("html_template", "");
    }

    public Uri aV() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", null);
        if (!StringUtils.isValidString(stringFromAdObject)) {
            return null;
        }
        return Uri.parse(stringFromAdObject);
    }

    public boolean aW() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean aX() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public com.applovin.impl.c.c aY() {
        return this.f17363h;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public List<com.applovin.impl.sdk.d.a> at() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("vimp_urls", this.adObject, getClCode(), null, aZ(), au(), z(), this.sdk);
        }
        return postbacks;
    }

    public void b() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    public boolean c() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.e
    public String d() {
        return this.f17362g;
    }

    public boolean e() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a) || !super.equals(obj)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f17357a;
        if (str == null ? aVar.f17357a != null : !str.equals(aVar.f17357a)) {
            return false;
        }
        String str2 = this.f17358b;
        if (str2 == null ? aVar.f17358b != null : !str2.equals(aVar.f17358b)) {
            return false;
        }
        j jVar = this.f17359c;
        if (jVar == null ? aVar.f17359c != null : !jVar.equals(aVar.f17359c)) {
            return false;
        }
        n nVar = this.f17361e;
        if (nVar == null ? aVar.f17361e != null : !nVar.equals(aVar.f17361e)) {
            return false;
        }
        d dVar = this.f;
        if (dVar == null ? aVar.f != null : !dVar.equals(aVar.f)) {
            return false;
        }
        com.applovin.impl.c.c cVar = this.f17363h;
        if (cVar == null ? aVar.f17363h != null : !cVar.equals(aVar.f17363h)) {
            return false;
        }
        Set<k> set = this.f17365j;
        if (set == null ? aVar.f17365j != null : !set.equals(aVar.f17365j)) {
            return false;
        }
        Set<k> set2 = this.f17366k;
        Set<k> set3 = aVar.f17366k;
        if (set2 != null) {
            return set2.equals(set3);
        }
        if (set3 == null) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public boolean f() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.sdk.a.g o() {
        return this.f17364i;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f17360d;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri h() {
        o aP = aP();
        if (aP != null) {
            return aP.b();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List<o> a10;
        n nVar = this.f17361e;
        if (nVar == null || (a10 = nVar.a()) == null || a10.size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int hashCode = super.hashCode() * 31;
        String str = this.f17357a;
        int i17 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i18 = (hashCode + i10) * 31;
        String str2 = this.f17358b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i19 = (i18 + i11) * 31;
        j jVar = this.f17359c;
        if (jVar != null) {
            i12 = jVar.hashCode();
        } else {
            i12 = 0;
        }
        int i20 = (i19 + i12) * 31;
        n nVar = this.f17361e;
        if (nVar != null) {
            i13 = nVar.hashCode();
        } else {
            i13 = 0;
        }
        int i21 = (i20 + i13) * 31;
        d dVar = this.f;
        if (dVar != null) {
            i14 = dVar.hashCode();
        } else {
            i14 = 0;
        }
        int i22 = (i21 + i14) * 31;
        com.applovin.impl.c.c cVar = this.f17363h;
        if (cVar != null) {
            i15 = cVar.hashCode();
        } else {
            i15 = 0;
        }
        int i23 = (i22 + i15) * 31;
        Set<k> set = this.f17365j;
        if (set != null) {
            i16 = set.hashCode();
        } else {
            i16 = 0;
        }
        int i24 = (i23 + i16) * 31;
        Set<k> set2 = this.f17366k;
        if (set2 != null) {
            i17 = set2.hashCode();
        }
        return i24 + i17;
    }

    public long i() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    @Override // com.applovin.impl.sdk.ad.e, com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        if (getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f17363h != null) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri j() {
        n nVar = this.f17361e;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri k() {
        return j();
    }

    public b l() {
        if ("companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad"))) {
            return b.COMPANION_AD;
        }
        return b.VIDEO;
    }

    public boolean m() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public j n() {
        return this.f17359c;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.f17357a + "', adDescription='" + this.f17358b + "', systemInfo=" + this.f17359c + ", videoCreative=" + this.f17361e + ", companionAd=" + this.f + ", adVerifications=" + this.f17363h + ", impressionTrackers=" + this.f17365j + ", errorTrackers=" + this.f17366k + '}';
    }

    private a(C0199a c0199a) {
        super(c0199a.f17367a, c0199a.f17368b, c0199a.f17369c, c0199a.f17370d);
        this.f17357a = c0199a.f;
        this.f17359c = c0199a.f17373h;
        this.f17358b = c0199a.f17372g;
        this.f17361e = c0199a.f17374i;
        this.f = c0199a.f17375j;
        this.f17363h = c0199a.f17376k;
        this.f17365j = c0199a.f17377l;
        this.f17366k = c0199a.f17378m;
        this.f17364i = new com.applovin.impl.sdk.a.g(this);
        Uri h10 = h();
        if (h10 != null) {
            this.f17362g = h10.toString();
        } else {
            this.f17362g = "";
        }
        this.f17360d = c0199a.f17371e;
    }

    public void a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public Set<k> a(c cVar, String str) {
        return a(cVar, new String[]{str});
    }

    public Set<k> a(c cVar, String[] strArr) {
        this.sdk.L();
        if (y.a()) {
            this.sdk.L().b("VastAd", "Retrieving trackers of type '" + cVar + "' and events '" + strArr + "'...");
        }
        if (cVar == c.IMPRESSION) {
            return this.f17365j;
        }
        if (cVar == c.VIDEO_CLICK) {
            return bb();
        }
        if (cVar == c.COMPANION_CLICK) {
            return bc();
        }
        if (cVar == c.VIDEO) {
            return a(b.VIDEO, strArr);
        }
        if (cVar == c.COMPANION) {
            return a(b.COMPANION_AD, strArr);
        }
        if (cVar == c.INDUSTRY_ICON_CLICK) {
            return aR().e();
        }
        if (cVar == c.INDUSTRY_ICON_IMPRESSION) {
            return aR().f();
        }
        if (cVar == c.ERROR) {
            return this.f17366k;
        }
        this.sdk.L();
        if (y.a()) {
            this.sdk.L().e("VastAd", "Failed to retrieve trackers of invalid type '" + cVar + "' and events '" + strArr + "'");
        }
        return Collections.emptySet();
    }

    private Set<k> a(b bVar, String[] strArr) {
        Map<String, Set<k>> d10;
        d dVar;
        n nVar;
        if (strArr != null && strArr.length > 0) {
            if (bVar == b.VIDEO && (nVar = this.f17361e) != null) {
                d10 = nVar.e();
            } else {
                d10 = (bVar != b.COMPANION_AD || (dVar = this.f) == null) ? null : dVar.d();
            }
            HashSet hashSet = new HashSet();
            if (d10 != null && !d10.isEmpty()) {
                for (String str : strArr) {
                    if (d10.containsKey(str)) {
                        hashSet.addAll(d10.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }
}
