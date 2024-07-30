package com.applovin.impl.mediation.debugger.ui.c;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b extends d {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.c.b f18116a;

    /* renamed from: b, reason: collision with root package name */
    private List<c> f18117b;

    /* renamed from: d, reason: collision with root package name */
    private final List<c> f18118d;

    /* renamed from: e, reason: collision with root package name */
    private final List<c> f18119e;
    private final List<c> f;

    /* renamed from: g, reason: collision with root package name */
    private final List<c> f18120g;

    /* renamed from: h, reason: collision with root package name */
    private SpannedString f18121h;

    /* loaded from: classes.dex */
    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    public b(com.applovin.impl.mediation.debugger.b.c.b bVar, Context context) {
        super(context);
        this.f18116a = bVar;
        if (bVar.a() == b.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f18121h = new SpannedString(spannableString);
        } else {
            this.f18121h = new SpannedString("");
        }
        this.f18117b = c();
        this.f18118d = a(bVar.r());
        this.f18119e = a(bVar.u());
        this.f = b(bVar.s());
        this.f18120g = h();
        notifyDataSetChanged();
    }

    private c d() {
        c.a b10 = c.p().a("SDK").b(this.f18116a.j());
        if (TextUtils.isEmpty(this.f18116a.j())) {
            b10.a(a(this.f18116a.d())).c(c(this.f18116a.d()));
        }
        return b10.a();
    }

    private c f() {
        c.a b10 = c.p().a("Adapter").b(this.f18116a.k());
        if (TextUtils.isEmpty(this.f18116a.k())) {
            b10.a(a(this.f18116a.e())).c(c(this.f18116a.e()));
        }
        return b10.a();
    }

    private c g() {
        return c.p().a("Initialization Status").b(e(this.f18116a.b())).a(false).a();
    }

    private List<c> h() {
        boolean z10;
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f18116a.w())) {
            arrayList.add(c.a(c.b.DETAIL).a(this.f18116a.w()).a());
        }
        if (this.f18116a.c() == b.EnumC0208b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f18116a.n() != null) {
            arrayList.add(c(this.f18116a.n()));
        }
        if (this.f18116a.x()) {
            if (!AppLovinPrivacySettings.isAgeRestrictedUser(this.f18168c) && AppLovinPrivacySettings.isAgeRestrictedUserSet(this.f18168c)) {
                z10 = true;
            } else {
                z10 = false;
            }
            arrayList.add(a("Not an Age Restricted User", "Test mode requires Age Restricted User (COPPA) to be set to false.", z10, false));
        }
        arrayList.add(a(this.f18116a.c()));
        return arrayList;
    }

    public com.applovin.impl.mediation.debugger.b.c.b a() {
        return this.f18116a;
    }

    public void b() {
        this.f18117b = c();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public List<c> c(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return this.f18117b;
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return this.f18118d;
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return this.f18119e;
        }
        if (i10 == a.DEPENDENCIES.ordinal()) {
            return this.f;
        }
        return this.f18120g;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int e() {
        return a.COUNT.ordinal();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    private String e(int i10) {
        return (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i10 || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i10 || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i10) ? "Initialized" : MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i10 ? "Failure" : MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i10 ? "Initializing..." : "Not Initialized";
    }

    public boolean a(com.applovin.impl.mediation.debugger.ui.d.a aVar) {
        return aVar.a() == a.TEST_ADS.ordinal() && aVar.b() == this.f18120g.size() - 1;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public c b(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return new e("INTEGRATIONS");
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return new e("PERMISSIONS");
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return new e("CONFIGURATION");
        }
        if (i10 == a.DEPENDENCIES.ordinal()) {
            return new e("DEPENDENCIES");
        }
        return new e("TEST ADS");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int a(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return this.f18117b.size();
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return this.f18118d.size();
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return this.f18119e.size();
        }
        if (i10 == a.DEPENDENCIES.ordinal()) {
            return this.f.size();
        }
        return this.f18120g.size();
    }

    private int d(boolean z10) {
        return g.a(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f18168c);
    }

    private List<c> c() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(d());
        arrayList.add(f());
        arrayList.add(g());
        return arrayList;
    }

    private List<c> b(List<com.applovin.impl.mediation.debugger.b.c.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (com.applovin.impl.mediation.debugger.b.c.a aVar : list) {
                arrayList.add(a(aVar.a(), aVar.b(), aVar.c(), true));
            }
        }
        return arrayList;
    }

    private List<c> a(List<com.applovin.impl.mediation.debugger.b.c.d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (com.applovin.impl.mediation.debugger.b.c.d dVar : list) {
                arrayList.add(a(dVar.a(), dVar.b(), dVar.c(), true));
            }
        }
        return arrayList;
    }

    private c c(List<String> list) {
        return c.p().a("Region/VPN Required").b(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private int b(boolean z10) {
        return z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private int c(boolean z10) {
        return g.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f18168c);
    }

    private List<c> a(com.applovin.impl.mediation.debugger.b.c.c cVar) {
        ArrayList arrayList = new ArrayList(1);
        if (cVar.a()) {
            arrayList.add(a("Cleartext Traffic", cVar.c(), cVar.b(), false));
        }
        if (this.f18116a.t()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://dash.applovin.com/documentation/mediation/android/getting-started/integration", p.A(), true));
        }
        return arrayList;
    }

    private c a(b.EnumC0208b enumC0208b) {
        c.a p10 = c.p();
        if (enumC0208b == b.EnumC0208b.READY) {
            p10.a(this.f18168c);
        }
        return p10.a("Test Mode").b(enumC0208b.a()).b(enumC0208b.b()).c("Restart Required").d(enumC0208b.c()).a(true).a();
    }

    private c a(String str, String str2, boolean z10, boolean z11) {
        return c.a(z10 ? c.b.RIGHT_DETAIL : c.b.DETAIL).a(str).b(z10 ? null : this.f18121h).c("Instructions").d(str2).a(z10 ? R.drawable.applovin_ic_check_mark_bordered : b(z11)).c(z10 ? g.a(R.color.applovin_sdk_checkmarkColor, this.f18168c) : d(z11)).a(!z10).a();
    }

    private int a(boolean z10) {
        return z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }
}
