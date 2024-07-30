package ua;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdSource;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f35808a;

    /* renamed from: b, reason: collision with root package name */
    public final AdContentData f35809b;

    /* renamed from: c, reason: collision with root package name */
    public String f35810c;

    /* renamed from: d, reason: collision with root package name */
    public String f35811d;

    /* renamed from: e, reason: collision with root package name */
    public AppInfo f35812e;
    public VideoInfo f;

    /* renamed from: g, reason: collision with root package name */
    public String f35813g;

    /* renamed from: h, reason: collision with root package name */
    public long f35814h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f35815i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f35816j;

    /* renamed from: k, reason: collision with root package name */
    public List<AdSource> f35817k;

    /* renamed from: l, reason: collision with root package name */
    public String f35818l;

    public a(AdContentData adContentData) {
        String uuid = UUID.randomUUID().toString();
        this.f35808a = uuid;
        this.f35814h = -1L;
        this.f35815i = false;
        this.f35816j = false;
        this.f35809b = adContentData;
        if (adContentData != null) {
            adContentData.J(uuid);
        }
    }

    public final AppInfo a() {
        MetaData c10;
        ApkInfo k02;
        String str;
        if (this.f35812e == null && (c10 = c()) != null && (k02 = c10.k0()) != null) {
            AppInfo appInfo = new AppInfo(k02);
            MetaData c11 = c();
            if (c11 != null) {
                str = c11.g0();
            } else {
                str = "";
            }
            appInfo.J(str);
            appInfo.c0(this.f35808a);
            appInfo.I(c10.p());
            this.f35812e = appInfo;
        }
        return this.f35812e;
    }

    public final VideoInfo b() {
        MetaData c10;
        if (this.f == null && (c10 = c()) != null) {
            this.f = new VideoInfo(c10.K());
        }
        return this.f;
    }

    public final MetaData c() {
        AdContentData adContentData = this.f35809b;
        if (adContentData != null) {
            return adContentData.x();
        }
        return null;
    }

    public final long d() {
        MetaData c10 = c();
        if (c10 != null) {
            return c10.b0();
        }
        return 500L;
    }

    public final boolean equals(Object obj) {
        String str;
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj.hashCode() == hashCode()) {
            return true;
        }
        String str2 = null;
        AdContentData adContentData = this.f35809b;
        if (adContentData != null) {
            str = adContentData.B();
        } else {
            str = null;
        }
        if (str == null) {
            return false;
        }
        AdContentData adContentData2 = ((a) obj).f35809b;
        if (adContentData2 != null) {
            str2 = adContentData2.B();
        }
        return TextUtils.equals(str, str2);
    }

    public final int hashCode() {
        String str;
        int i10;
        AdContentData adContentData = this.f35809b;
        if (adContentData != null) {
            str = adContentData.B();
        } else {
            str = null;
        }
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = -1;
        }
        return i10 & super.hashCode();
    }
}
