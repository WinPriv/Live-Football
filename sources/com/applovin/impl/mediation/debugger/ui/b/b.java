package com.applovin.impl.mediation.debugger.ui.b;

import a3.l;
import android.content.Context;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.debugger.a;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class b extends d implements AppLovinCommunicatorSubscriber, a.InterfaceC0206a {

    /* renamed from: a, reason: collision with root package name */
    private p f18076a;

    /* renamed from: b, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.a> f18077b;

    /* renamed from: d, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.a> f18078d;

    /* renamed from: e, reason: collision with root package name */
    private String f18079e;
    private String f;

    /* renamed from: g, reason: collision with root package name */
    private String f18080g;

    /* renamed from: h, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.b.b f18081h;

    /* renamed from: i, reason: collision with root package name */
    private final StringBuilder f18082i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f18083j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18084k;

    /* renamed from: l, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.c.b> f18085l;

    /* renamed from: m, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.c.b> f18086m;

    /* renamed from: n, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.c.b> f18087n;
    private List<com.applovin.impl.mediation.debugger.b.a.d> o;

    /* renamed from: p, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.d> f18088p;

    /* renamed from: q, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.c.b> f18089q;

    /* renamed from: r, reason: collision with root package name */
    private List<c> f18090r;

    /* renamed from: s, reason: collision with root package name */
    private List<c> f18091s;

    /* renamed from: t, reason: collision with root package name */
    private List<c> f18092t;

    /* renamed from: u, reason: collision with root package name */
    private List<c> f18093u;

    /* renamed from: v, reason: collision with root package name */
    private List<c> f18094v;

    /* renamed from: w, reason: collision with root package name */
    private List<c> f18095w;

    /* renamed from: x, reason: collision with root package name */
    private List<c> f18096x;

    /* loaded from: classes.dex */
    public enum a {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.b.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0213b {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public b(Context context) {
        super(context);
        this.f18082i = new StringBuilder("");
        this.f18083j = new AtomicBoolean();
        this.f18084k = false;
        this.f18085l = new ArrayList();
        this.f18086m = new ArrayList();
        this.f18087n = new ArrayList();
        this.o = new ArrayList();
        this.f18088p = new ArrayList();
        this.f18089q = new ArrayList();
        this.f18090r = new ArrayList();
        this.f18091s = new ArrayList();
        this.f18092t = new ArrayList();
        this.f18093u = new ArrayList();
        this.f18094v = new ArrayList();
        this.f18095w = new ArrayList();
        this.f18096x = new ArrayList();
    }

    private void o() {
        String str;
        Map<String, String> metaData;
        StringBuilder sb2 = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb2.append("\n========== APP INFO ==========");
        sb2.append("\nDev Build - " + Utils.isPubInDebugMode(this.f18168c, this.f18076a));
        if (this.f18076a.av().a()) {
            str = "enabled";
        } else {
            str = "disabled";
        }
        sb2.append("\nTest Mode - ".concat(str));
        if (this.f18076a.S() != null) {
            sb2.append("\nTarget SDK - " + this.f18076a.Q().B().j());
        } else {
            sb2.append("\nTarget SDK - " + this.f18076a.R().h().get("target_sdk"));
        }
        sb2.append("\n========== MAX ==========");
        String str2 = AppLovinSdk.VERSION;
        String str3 = (String) this.f18076a.a(com.applovin.impl.sdk.c.b.dT);
        String a10 = g.a();
        sb2.append("\nSDK Version - " + str2);
        StringBuilder sb3 = new StringBuilder("\nPlugin Version - ");
        String str4 = "None";
        if (!StringUtils.isValidString(str3)) {
            str3 = "None";
        }
        sb3.append(str3);
        sb2.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder("\nAd Review Version - ");
        if (!StringUtils.isValidString(a10)) {
            a10 = "Disabled";
        }
        sb4.append(a10);
        sb2.append(sb4.toString());
        if (this.f18076a.g() && (metaData = Utils.getMetaData(this.f18076a.C())) != null) {
            String str5 = metaData.get("UnityVersion");
            StringBuilder sb5 = new StringBuilder("\nUnity Version - ");
            if (StringUtils.isValidString(str5)) {
                str4 = str5;
            }
            sb5.append(str4);
            sb2.append(sb5.toString());
        }
        sb2.append("\n========== PRIVACY ==========");
        sb2.append(com.applovin.impl.b.a.a(this.f18168c));
        if (this.f18076a.ae().b()) {
            sb2.append(this.f18076a.ae().i());
        }
        sb2.append("\n========== NETWORKS ==========");
        Iterator<com.applovin.impl.mediation.debugger.b.c.b> it = this.f18086m.iterator();
        while (it.hasNext()) {
            a(sb2, it.next().z());
        }
        Iterator<com.applovin.impl.mediation.debugger.b.c.b> it2 = this.f18085l.iterator();
        while (it2.hasNext()) {
            a(sb2, it2.next().z());
        }
        sb2.append("\n========== AD UNITS ==========");
        Iterator<com.applovin.impl.mediation.debugger.b.a.a> it3 = this.f18077b.iterator();
        while (it3.hasNext()) {
            a(sb2, it3.next().f());
        }
        sb2.append("\n========== END ==========");
        y.f("MediationDebuggerListAdapter", sb2.toString());
        this.f18082i.append(sb2.toString());
    }

    private List<c> p() {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList(5);
        try {
            str = this.f18168c.getPackageManager().getPackageInfo(this.f18168c.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(c.p().a("Package Name").b(this.f18168c.getPackageName()).a());
        c.a a10 = c.p().a("App Version");
        String str3 = "None";
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(a10.b(str).a());
        arrayList.add(c.p().a("OS").b(Utils.getAndroidOSInfo()).a());
        c.a a11 = c.p().a("Account");
        if (!StringUtils.isValidString(this.f18080g)) {
            str2 = "None";
        } else {
            str2 = this.f18080g;
        }
        arrayList.add(a11.b(str2).a());
        c.a a12 = c.p().a("Mediation Provider");
        if (StringUtils.isValidString(this.f18076a.s())) {
            str3 = this.f18076a.s();
        }
        arrayList.add(a12.b(str3).a());
        arrayList.add(c.p().a("OM SDK Version").b(this.f18076a.ag().c()).a());
        arrayList.add(b(p.A()));
        return arrayList;
    }

    private List<c> q() {
        Map<String, String> metaData;
        String str;
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(c.p().a("SDK Version").b(AppLovinSdk.VERSION).a());
        String str2 = (String) this.f18076a.a(com.applovin.impl.sdk.c.b.dT);
        c.a a10 = c.p().a("Plugin Version");
        String str3 = "None";
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        arrayList.add(a10.b(str2).a());
        c.a a11 = c.p().a("Ad Review Version");
        String a12 = g.a();
        if (StringUtils.isValidString(a12)) {
            String b10 = g.b();
            if (StringUtils.isValidString(b10)) {
                if (b10.equals(this.f18076a.B())) {
                    a11.b(a12);
                } else {
                    StringBuilder sb2 = new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your ");
                    if (this.f18076a.g()) {
                        str = "SDK key is downloaded";
                    } else {
                        str = "Gradle plugin snippet is integrated";
                    }
                    a(a11, l.p(sb2, str, " from the correct account."));
                }
            } else {
                a11.b(a12);
            }
        } else {
            a(a11, "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.");
        }
        arrayList.add(a11.a());
        if (this.f18076a.g() && (metaData = Utils.getMetaData(this.f18076a.C())) != null) {
            String str4 = metaData.get("UnityVersion");
            if (StringUtils.isValidString(str4)) {
                str3 = str4;
            }
            arrayList.add(b("Unity Version", str3));
        }
        return arrayList;
    }

    private List<c> r() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(com.applovin.impl.b.a.a(), true, this.f18168c));
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(com.applovin.impl.b.a.b(), false, this.f18168c));
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(com.applovin.impl.b.a.c(), true, this.f18168c));
        return arrayList;
    }

    private List<c> s() {
        return a((String) null, (String) null);
    }

    public boolean a() {
        return this.f18083j.get();
    }

    public boolean b() {
        return this.f18084k;
    }

    public p c() {
        return this.f18076a;
    }

    public List<com.applovin.impl.mediation.debugger.b.a.a> d() {
        return this.f18077b;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int e() {
        return EnumC0213b.COUNT.ordinal();
    }

    public List<com.applovin.impl.mediation.debugger.b.a.a> f() {
        return this.f18078d;
    }

    public String g() {
        return this.f18079e;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.f;
    }

    public List<com.applovin.impl.mediation.debugger.b.a.d> i() {
        return this.o;
    }

    public List<com.applovin.impl.mediation.debugger.b.a.d> j() {
        return this.f18088p;
    }

    public List<com.applovin.impl.mediation.debugger.b.c.b> k() {
        return this.f18089q;
    }

    public String l() {
        return this.f18082i.toString();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f18092t = r();
            m();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f18094v = d(this.f18085l);
            this.f18095w = d(this.f18086m);
            m();
        } else if ("live_network_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f18093u = a(appLovinCommunicatorMessage.getMessageData().getString("live_network", null), (String) null);
            m();
        } else if ("test_mode_network_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f18093u = a((String) null, appLovinCommunicatorMessage.getMessageData().getString("test_mode_network", null));
            m();
        }
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f18083j.get() + "}";
    }

    private List<c> d(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<com.applovin.impl.mediation.debugger.b.c.b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(it.next(), this.f18168c));
        }
        return arrayList;
    }

    public void a(boolean z10) {
        this.f18084k = z10;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public c b(int i10) {
        if (i10 == EnumC0213b.APP_INFO.ordinal()) {
            return new e("APP INFO");
        }
        if (i10 == EnumC0213b.MAX.ordinal()) {
            return new e("MAX");
        }
        if (i10 == EnumC0213b.PRIVACY.ordinal()) {
            return new e("PRIVACY");
        }
        if (i10 == EnumC0213b.ADS.ordinal()) {
            return new e("ADS");
        }
        if (i10 == EnumC0213b.INCOMPLETE_NETWORKS.ordinal()) {
            return new e("INCOMPLETE INTEGRATIONS");
        }
        if (i10 == EnumC0213b.COMPLETED_NETWORKS.ordinal()) {
            return new e("COMPLETED INTEGRATIONS");
        }
        return new e("MISSING INTEGRATIONS");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public List<c> c(int i10) {
        if (i10 == EnumC0213b.APP_INFO.ordinal()) {
            return this.f18090r;
        }
        if (i10 == EnumC0213b.MAX.ordinal()) {
            return this.f18091s;
        }
        if (i10 == EnumC0213b.PRIVACY.ordinal()) {
            return this.f18092t;
        }
        if (i10 == EnumC0213b.ADS.ordinal()) {
            return this.f18093u;
        }
        if (i10 == EnumC0213b.INCOMPLETE_NETWORKS.ordinal()) {
            return this.f18094v;
        }
        if (i10 == EnumC0213b.COMPLETED_NETWORKS.ordinal()) {
            return this.f18095w;
        }
        return this.f18096x;
    }

    public void a(List<com.applovin.impl.mediation.debugger.b.c.b> list, List<com.applovin.impl.mediation.debugger.b.a.a> list2, List<com.applovin.impl.mediation.debugger.b.a.a> list3, com.applovin.impl.mediation.debugger.b.b.b bVar, String str, String str2, String str3, p pVar) {
        this.f18076a = pVar;
        this.f18077b = list2;
        this.f18078d = list3;
        this.f18081h = bVar;
        this.f18079e = str;
        this.f = str2;
        this.f18080g = str3;
        if (list != null && this.f18083j.compareAndSet(false, true)) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("MediationDebuggerListAdapter", "Populating networks...");
            }
            a(list);
            b(list2);
            c(this.f18086m);
            this.f18090r.addAll(p());
            this.f18091s.addAll(q());
            this.f18092t.addAll(r());
            this.f18093u.addAll(s());
            this.f18094v = d(this.f18085l);
            this.f18095w = d(this.f18086m);
            this.f18096x = d(this.f18087n);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_network_updated");
            arrayList.add("test_mode_network_updated");
            AppLovinCommunicator.getInstance(this.f18168c).subscribe(this, arrayList);
            o();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.notifyDataSetChanged();
            }
        });
    }

    private void b(List<com.applovin.impl.mediation.debugger.b.a.a> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<com.applovin.impl.mediation.debugger.b.a.a> it = list.iterator();
        while (it.hasNext()) {
            com.applovin.impl.mediation.debugger.b.a.c e10 = it.next().e();
            Iterator<com.applovin.impl.mediation.debugger.b.a.b> it2 = e10.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(it2.next().a());
            }
            Iterator<com.applovin.impl.mediation.debugger.b.a.b> it3 = e10.b().iterator();
            while (it3.hasNext()) {
                hashSet2.add(it3.next().a());
            }
        }
        this.o = new ArrayList(hashSet);
        this.f18088p = new ArrayList(hashSet2);
        Collections.sort(this.o);
        Collections.sort(this.f18088p);
    }

    private void c(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        for (com.applovin.impl.mediation.debugger.b.c.b bVar : list) {
            if (bVar.c() == b.EnumC0208b.READY) {
                this.f18089q.add(bVar);
            }
        }
    }

    private c c(boolean z10) {
        return c.p().a("app-ads.txt").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).c(com.applovin.impl.sdk.utils.g.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f18168c)).a(false).a();
    }

    private c b(String str, String str2) {
        c.a a10 = c.p().a(str);
        if (StringUtils.isValidString(str2)) {
            a10.b(str2);
        } else {
            a10.a(R.drawable.applovin_ic_x_mark);
            a10.c(com.applovin.impl.sdk.utils.g.a(R.color.applovin_sdk_xmarkColor, this.f18168c));
        }
        return a10.a();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int a(int i10) {
        if (i10 == EnumC0213b.APP_INFO.ordinal()) {
            return this.f18090r.size();
        }
        if (i10 == EnumC0213b.MAX.ordinal()) {
            return this.f18091s.size();
        }
        if (i10 == EnumC0213b.PRIVACY.ordinal()) {
            return this.f18092t.size();
        }
        if (i10 == EnumC0213b.ADS.ordinal()) {
            return this.f18093u.size();
        }
        if (i10 == EnumC0213b.INCOMPLETE_NETWORKS.ordinal()) {
            return this.f18094v.size();
        }
        if (i10 == EnumC0213b.COMPLETED_NETWORKS.ordinal()) {
            return this.f18095w.size();
        }
        return this.f18096x.size();
    }

    private c b(String str) {
        c.a p10 = c.p();
        if (this.f18076a.av().a()) {
            p10.a(this.f18168c);
        }
        c.a a10 = p10.a((StringUtils.isValidString(str) ? "" : "Select ").concat("Test Mode Network"));
        if (!this.f18076a.av().a()) {
            str = "Enable";
        }
        return a10.b(str).b(-16776961).d("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private c b(boolean z10) {
        return c.p().a("Java 8").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).c(com.applovin.impl.sdk.utils.g.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f18168c)).c("Upgrade to Java 8").d("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://dash.applovin.com/documentation/mediation/android/getting-started/integration").a(!z10).a();
    }

    @Override // com.applovin.impl.mediation.debugger.a.InterfaceC0206a
    public void a(com.applovin.impl.mediation.debugger.b.b.a aVar) {
        List<com.applovin.impl.mediation.debugger.b.b.b> list = aVar.a().get(this.f18081h.a());
        this.f18091s.add(c(list != null ? list.contains(this.f18081h) : false));
        m();
    }

    @Override // com.applovin.impl.mediation.debugger.a.InterfaceC0206a
    public void a(a.b bVar) {
        if (bVar == a.b.DEVELOPER_URI_NOT_FOUND) {
            this.f18076a.L();
            if (y.a()) {
                this.f18076a.L().b("MediationDebuggerListAdapter", "Developer URI was not found; app-ads.txt row will not show on the mediation debugger");
                return;
            }
            return;
        }
        this.f18091s.add(c(false));
        m();
    }

    private void a(StringBuilder sb2, String str) {
        String sb3 = sb2.toString();
        if (str.length() + sb3.length() >= ((Integer) this.f18076a.a(com.applovin.impl.sdk.c.b.ar)).intValue()) {
            y.f("MediationDebuggerListAdapter", sb3);
            this.f18082i.append(sb3);
            sb2.setLength(1);
        }
        sb2.append(str);
    }

    private void a(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        for (com.applovin.impl.mediation.debugger.b.c.b bVar : list) {
            if (!bVar.g()) {
                if (bVar.a() != b.a.INCOMPLETE_INTEGRATION && bVar.a() != b.a.INVALID_INTEGRATION) {
                    if (bVar.a() == b.a.COMPLETE) {
                        this.f18086m.add(bVar);
                    } else if (bVar.a() == b.a.MISSING) {
                        this.f18087n.add(bVar);
                    }
                } else {
                    this.f18085l.add(bVar);
                }
            }
        }
    }

    private List<c> a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(c.p().a("View Ad Units (" + this.f18077b.size() + ")").a(this.f18168c).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f18078d.isEmpty()) {
            arrayList.add(c.p().a("Selective Init Ad Units (" + this.f18078d.size() + ")").a(this.f18168c).a(true).a());
        }
        return arrayList;
    }

    private void a(c.a aVar, String str) {
        aVar.c("MAX Ad Review").d(str).a(R.drawable.applovin_ic_x_mark).c(com.applovin.impl.sdk.utils.g.a(R.color.applovin_sdk_xmarkColor, this.f18168c)).a(true);
    }

    private c a(String str) {
        c.a p10 = c.p();
        if (!this.f18076a.av().a()) {
            p10.a(this.f18168c);
        }
        c.a a10 = p10.a((StringUtils.isValidString(str) ? "" : "Select ").concat("Live Network"));
        if (this.f18076a.av().a()) {
            str = "Enable";
        }
        return a10.b(str).b(-16776961).d("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }
}
