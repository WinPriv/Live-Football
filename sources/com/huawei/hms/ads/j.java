package com.huawei.hms.ads;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.huawei.hms.ads.RequestOptions;
import com.huawei.hms.ads.data.SearchInfo;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class j implements q {
    private static final String Code = "AdRequestMediator";
    private String B;
    private String C;
    private String D;
    private String F;
    private int I;
    private App L;
    private boolean S;
    private final HashSet<String> V = new HashSet<>();
    private Location Z;

    /* renamed from: a, reason: collision with root package name */
    private RequestOptions.Builder f21721a;

    /* renamed from: b, reason: collision with root package name */
    private List<Integer> f21722b;

    /* renamed from: c, reason: collision with root package name */
    private String f21723c;

    /* renamed from: d, reason: collision with root package name */
    private SearchInfo f21724d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21725e;

    @Override // com.huawei.hms.ads.q
    public Location B() {
        return this.Z;
    }

    @Override // com.huawei.hms.ads.q
    public RequestOptions C() {
        RequestOptions.Builder builder = this.f21721a;
        if (builder != null) {
            return builder.build();
        }
        return null;
    }

    @Override // com.huawei.hms.ads.q
    public String Code() {
        return this.B;
    }

    @Override // com.huawei.hms.ads.q
    public String D() {
        return this.D;
    }

    @Override // com.huawei.hms.ads.q
    public String F() {
        return this.F;
    }

    @Override // com.huawei.hms.ads.q
    public int I() {
        return this.I;
    }

    @Override // com.huawei.hms.ads.q
    public List<Integer> L() {
        return this.f21722b;
    }

    @Override // com.huawei.hms.ads.q
    public void S(String str) {
        if (str == null || "".equals(str)) {
            return;
        }
        if (!"W".equals(str) && !"PI".equals(str) && !"J".equals(str) && !"A".equals(str)) {
            ex.V(Code, "Invalid value  setAdContentClassification: ".concat(str));
            return;
        }
        if (this.f21721a == null) {
            this.f21721a = new RequestOptions.Builder();
        }
        this.f21721a.setAdContentClassification(str);
    }

    @Override // com.huawei.hms.ads.q
    public String V() {
        return this.C;
    }

    @Override // com.huawei.hms.ads.q
    public Set<String> Z() {
        return this.V;
    }

    @Override // com.huawei.hms.ads.q
    public String a() {
        return this.f21723c;
    }

    @Override // com.huawei.hms.ads.q
    public boolean b() {
        return this.f21725e;
    }

    @Override // com.huawei.hms.ads.q
    public void B(Integer num) {
        if (num == null || num.intValue() == -1 || num.intValue() == 0 || num.intValue() == 1) {
            if (this.f21721a == null) {
                this.f21721a = new RequestOptions.Builder();
            }
            this.f21721a.setTagForUnderAgeOfPromise(num);
        } else {
            ex.V(Code, "Invalid value setTagForUnderAgeOfPromise: " + num);
        }
    }

    @Override // com.huawei.hms.ads.q
    public void C(Integer num) {
        if (num != null && num.intValue() != 0 && 1 != num.intValue()) {
            ex.Z(Code, "Invalid value passed to setSupportFa: " + num);
        } else {
            if (this.f21721a == null) {
                this.f21721a = new RequestOptions.Builder();
            }
            if (num == null) {
                this.f21721a.setSupportFa(null);
            } else {
                this.f21721a.setSupportFa(Boolean.valueOf(num.intValue() == 1));
            }
        }
    }

    @Override // com.huawei.hms.ads.q
    public void Code(int i10) {
        this.I = i10;
    }

    @Override // com.huawei.hms.ads.q
    public void D(String str) {
        if (this.f21721a == null) {
            this.f21721a = new RequestOptions.Builder();
        }
        this.f21721a.setSearchTerm(str);
    }

    @Override // com.huawei.hms.ads.q
    public void F(String str) {
        this.F = str;
    }

    @Override // com.huawei.hms.ads.q
    public void I(Integer num) {
        if (num == null || 1 == num.intValue() || num.intValue() == 0) {
            if (this.f21721a == null) {
                this.f21721a = new RequestOptions.Builder();
            }
            this.f21721a.setHwNonPersonalizedAd(num);
        } else {
            ex.Z(Code, "Invalid value passed to setHwNonPersonalizedAd: " + num);
        }
    }

    @Override // com.huawei.hms.ads.q
    public void L(String str) {
        if (this.f21721a == null) {
            this.f21721a = new RequestOptions.Builder();
        }
        this.f21721a.setConsent(str);
    }

    @Override // com.huawei.hms.ads.q
    public boolean S() {
        return this.S;
    }

    @Override // com.huawei.hms.ads.q
    public void V(Integer num) {
        if (num == null || 1 == num.intValue() || num.intValue() == 0) {
            if (this.f21721a == null) {
                this.f21721a = new RequestOptions.Builder();
            }
            this.f21721a.setNonPersonalizedAd(num);
        } else {
            ex.Z(Code, "Invalid value passed to setNonPersonalizedAd: " + num);
        }
    }

    @Override // com.huawei.hms.ads.q
    public void Z(Integer num) {
        if (num == null || 1 == num.intValue() || num.intValue() == 0) {
            if (this.f21721a == null) {
                this.f21721a = new RequestOptions.Builder();
            }
            this.f21721a.setThirdNonPersonalizedAd(num);
        } else {
            ex.Z(Code, "Invalid value passed to setThirdNonPersonalizedAd: " + num);
        }
    }

    @Override // com.huawei.hms.ads.q
    public void a(String str) {
        this.f21723c = str;
    }

    @Override // com.huawei.hms.ads.q
    public void B(String str) {
        if (TextUtils.isEmpty(str)) {
            ex.V(Code, "Invalid value passed to setAppLang");
            return;
        }
        if (this.f21721a == null) {
            this.f21721a = new RequestOptions.Builder();
        }
        this.f21721a.setAppLang(str);
    }

    @Override // com.huawei.hms.ads.q
    public void C(String str) {
        if (TextUtils.isEmpty(str)) {
            ex.V(Code, "Invalid value passed to setAppCountry");
            return;
        }
        if (this.f21721a == null) {
            this.f21721a = new RequestOptions.Builder();
        }
        this.f21721a.setAppCountry(str);
    }

    @Override // com.huawei.hms.ads.q
    public void Code(Location location) {
        this.Z = location;
    }

    @Override // com.huawei.hms.ads.q
    public void I(String str) {
        this.B = str;
    }

    @Override // com.huawei.hms.ads.q
    public void V(String str) {
        this.D = str;
    }

    @Override // com.huawei.hms.ads.q
    public void Z(String str) {
        this.C = str;
    }

    @Override // com.huawei.hms.ads.q
    public void Code(App app) {
        if (app == null) {
            ex.V(Code, "Invalid appInfo");
            return;
        }
        if (this.f21721a == null) {
            this.f21721a = new RequestOptions.Builder();
        }
        this.f21721a.setApp(app);
    }

    @Override // com.huawei.hms.ads.q
    public void I(boolean z10) {
        this.f21725e = z10;
    }

    @Override // com.huawei.hms.ads.q
    public void V(boolean z10) {
        if (this.f21721a == null) {
            this.f21721a = new RequestOptions.Builder();
        }
        this.f21721a.setRequestLocation(Boolean.valueOf(z10));
    }

    @Override // com.huawei.hms.ads.q
    public void Code(SearchInfo searchInfo) {
        if (this.f21721a == null) {
            this.f21721a = new RequestOptions.Builder();
        }
        this.f21721a.setSearchInfo(searchInfo);
    }

    @Override // com.huawei.hms.ads.q
    public void Code(Integer num) {
        if (num == null || num.intValue() == -1 || num.intValue() == 0 || num.intValue() == 1) {
            if (this.f21721a == null) {
                this.f21721a = new RequestOptions.Builder();
            }
            this.f21721a.setTagForChildProtection(num);
        } else {
            ex.V(Code, "Invalid value setTagForChildProtection: " + num);
        }
    }

    @Override // com.huawei.hms.ads.q
    public void Code(String str) {
        this.V.add(str);
    }

    @Override // com.huawei.hms.ads.q
    public void Code(List<Integer> list) {
        this.f21722b = list;
    }

    @Override // com.huawei.hms.ads.q
    public void Code(boolean z10) {
        this.S = z10;
    }

    @Override // com.huawei.hms.ads.q
    public boolean Code(Context context) {
        return false;
    }
}
