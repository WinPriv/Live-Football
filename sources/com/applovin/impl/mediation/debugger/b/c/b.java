package com.applovin.impl.mediation.debugger.b.c;

import android.text.TextUtils;
import com.anythink.core.common.l;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements AppLovinCommunicatorSubscriber, Comparable<b> {
    private final Map<MaxAdFormat, String> A;
    private final boolean B;
    private final String C;
    private final Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.b> D;

    /* renamed from: a, reason: collision with root package name */
    private final p f17955a;

    /* renamed from: b, reason: collision with root package name */
    private final a f17956b;

    /* renamed from: c, reason: collision with root package name */
    private int f17957c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f17958d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f17959e;
    private final boolean f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f17960g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f17961h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f17962i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f17963j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f17964k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f17965l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f17966m;

    /* renamed from: n, reason: collision with root package name */
    private final String f17967n;
    private final String o;

    /* renamed from: p, reason: collision with root package name */
    private final String f17968p;

    /* renamed from: q, reason: collision with root package name */
    private String f17969q;

    /* renamed from: r, reason: collision with root package name */
    private final String f17970r;

    /* renamed from: s, reason: collision with root package name */
    private final String f17971s;

    /* renamed from: t, reason: collision with root package name */
    private final String f17972t;

    /* renamed from: u, reason: collision with root package name */
    private final int f17973u;

    /* renamed from: v, reason: collision with root package name */
    private final List<MaxAdFormat> f17974v;

    /* renamed from: w, reason: collision with root package name */
    private final List<d> f17975w;

    /* renamed from: x, reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.b.c.a> f17976x;
    private final List<String> y;

    /* renamed from: z, reason: collision with root package name */
    private final c f17977z;

    /* loaded from: classes.dex */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* renamed from: e, reason: collision with root package name */
        private final String f17982e;

        a(String str) {
            this.f17982e = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.f17982e;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.b.c.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0208b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");

        private final String f;

        /* renamed from: g, reason: collision with root package name */
        private final int f17989g;

        /* renamed from: h, reason: collision with root package name */
        private final String f17990h;

        EnumC0208b(String str, int i10, String str2) {
            this.f = str;
            this.f17989g = i10;
            this.f17990h = str2;
        }

        public String a() {
            return this.f;
        }

        public int b() {
            return this.f17989g;
        }

        public String c() {
            return this.f17990h;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(org.json.JSONObject r19, com.applovin.impl.sdk.p r20) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.b.c.b.<init>(org.json.JSONObject, com.applovin.impl.sdk.p):void");
    }

    private a D() {
        a aVar;
        if (this.f17958d) {
            if (this.f17959e) {
                aVar = a.COMPLETE;
            } else if (this.f17960g) {
                aVar = a.MISSING;
            } else {
                aVar = a.INCOMPLETE_INTEGRATION;
            }
        } else if (this.f17959e) {
            aVar = a.INCOMPLETE_INTEGRATION;
        } else {
            aVar = a.MISSING;
        }
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator<d> it = this.f17975w.iterator();
        while (it.hasNext()) {
            if (!it.next().c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator<com.applovin.impl.mediation.debugger.b.c.a> it2 = this.f17976x.iterator();
        while (it2.hasNext()) {
            if (!it2.next().c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        if (this.f17966m && !p.A()) {
            return a.INVALID_INTEGRATION;
        }
        if (this.f17977z.a() && !this.f17977z.b()) {
            return a.INCOMPLETE_INTEGRATION;
        }
        return aVar;
    }

    public boolean A() {
        return this.B;
    }

    public String B() {
        return this.C;
    }

    public Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.b> C() {
        return this.D;
    }

    public a a() {
        return this.f17956b;
    }

    public int b() {
        return this.f17957c;
    }

    public EnumC0208b c() {
        if (!this.f17961h) {
            return EnumC0208b.NOT_SUPPORTED;
        }
        a aVar = this.f17956b;
        if (aVar != a.COMPLETE && (aVar != a.INCOMPLETE_INTEGRATION || !d() || !e())) {
            return EnumC0208b.INVALID_INTEGRATION;
        }
        if (!this.f17955a.av().a()) {
            return EnumC0208b.DISABLED;
        }
        if (this.f17962i && (this.f17957c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f17957c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) {
            return EnumC0208b.NOT_INITIALIZED;
        }
        return EnumC0208b.READY;
    }

    public boolean d() {
        return this.f17958d;
    }

    public boolean e() {
        return this.f17959e;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        if (this.f17956b == a.MISSING && this.f17963j) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public String h() {
        return this.f17967n;
    }

    public String i() {
        return this.o;
    }

    public String j() {
        return this.f17969q;
    }

    public String k() {
        return this.f17970r;
    }

    public String l() {
        return this.f17971s;
    }

    public String m() {
        return this.f17968p;
    }

    public List<String> n() {
        return this.y;
    }

    public int o() {
        return this.f17973u;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString(l.f6263z, "");
        if (this.f17968p.equals(string)) {
            this.f17957c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter b10 = com.applovin.impl.mediation.d.c.b(string, this.f17955a);
            if (b10 != null && !this.f17969q.equals(b10.getSdkVersion())) {
                this.f17969q = b10.getSdkVersion();
                this.f17955a.ab().a(this.f17969q, string);
            }
        }
    }

    public List<MaxAdFormat> p() {
        return this.f17974v;
    }

    public boolean q() {
        return this.f17964k;
    }

    public List<d> r() {
        return this.f17975w;
    }

    public List<com.applovin.impl.mediation.debugger.b.c.a> s() {
        return this.f17976x;
    }

    public boolean t() {
        return this.f17966m;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MediatedNetwork{name=");
        sb2.append(this.f17967n);
        sb2.append(", displayName=");
        sb2.append(this.o);
        sb2.append(", sdkAvailable=");
        sb2.append(this.f17958d);
        sb2.append(", sdkVersion=");
        sb2.append(this.f17969q);
        sb2.append(", adapterAvailable=");
        sb2.append(this.f17959e);
        sb2.append(", adapterVersion=");
        return a3.l.p(sb2, this.f17970r, "}");
    }

    public final c u() {
        return this.f17977z;
    }

    public Map<MaxAdFormat, String> v() {
        return this.A;
    }

    public String w() {
        return this.f17972t;
    }

    public boolean x() {
        return this.f17965l;
    }

    public final p y() {
        return this.f17955a;
    }

    public final String z() {
        String str;
        StringBuilder sb2 = new StringBuilder("\n---------- ");
        sb2.append(this.f17967n);
        sb2.append(" ----------\nStatus  - ");
        sb2.append(this.f17956b.a());
        sb2.append("\nSDK     - ");
        String str2 = "UNAVAILABLE";
        if (!this.f17958d || TextUtils.isEmpty(this.f17969q)) {
            str = "UNAVAILABLE";
        } else {
            str = this.f17969q;
        }
        sb2.append(str);
        sb2.append("\nAdapter - ");
        if (this.f17959e && !TextUtils.isEmpty(this.f17970r)) {
            str2 = this.f17970r;
        }
        sb2.append(str2);
        if (this.f17977z.a() && !this.f17977z.b()) {
            sb2.append("\n* ");
            sb2.append(this.f17977z.c());
        }
        for (d dVar : r()) {
            if (!dVar.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(dVar.a());
                sb2.append(": ");
                sb2.append(dVar.b());
            }
        }
        for (com.applovin.impl.mediation.debugger.b.c.a aVar : s()) {
            if (!aVar.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(aVar.a());
                sb2.append(": ");
                sb2.append(aVar.b());
            }
        }
        return sb2.toString();
    }

    private List<MaxAdFormat> a(MaxAdapter maxAdapter) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxRewardedInterstitialAdapter) {
            arrayList.add(MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            arrayList.add(MaxAdFormat.MREC);
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List<d> a(JSONObject jSONObject, p pVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f17968p.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            d dVar = new d("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", p.y());
            if (dVar.c()) {
                arrayList.add(dVar);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new d(next, jSONObject2.getString(next), p.y()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List<String> a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List<com.applovin.impl.mediation.debugger.b.c.a> a(JSONObject jSONObject, String str, p pVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray2.length() + jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new com.applovin.impl.mediation.debugger.b.c.a(jSONObject2, pVar));
            }
        }
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null);
            if (jSONObject3 != null && com.applovin.impl.mediation.debugger.b.c.a.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new com.applovin.impl.mediation.debugger.b.c.a(jSONObject3, pVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        return this.o.compareToIgnoreCase(bVar.o);
    }
}
