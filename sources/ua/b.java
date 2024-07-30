package ua;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdSource;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.ImageInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f35819a;

    /* renamed from: b, reason: collision with root package name */
    public final AdContentData f35820b;

    /* renamed from: c, reason: collision with root package name */
    public String f35821c;

    /* renamed from: d, reason: collision with root package name */
    public List<AdSource> f35822d;

    /* renamed from: e, reason: collision with root package name */
    public String f35823e;
    public AppInfo f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35824g;

    /* renamed from: h, reason: collision with root package name */
    public VideoInfo f35825h;

    /* renamed from: i, reason: collision with root package name */
    public String f35826i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f35827j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f35828k;

    /* renamed from: l, reason: collision with root package name */
    public long f35829l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f35830m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35831n;
    public String o;

    /* renamed from: p, reason: collision with root package name */
    public final String f35832p;

    /* renamed from: q, reason: collision with root package name */
    public int f35833q;

    /* renamed from: r, reason: collision with root package name */
    public String f35834r;

    /* renamed from: s, reason: collision with root package name */
    public String f35835s;

    /* renamed from: t, reason: collision with root package name */
    public String f35836t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f35837u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f35838v;

    public b(AdContentData adContentData, String str) {
        String uuid = UUID.randomUUID().toString();
        this.f35819a = uuid;
        this.f35824g = false;
        this.f35829l = -1L;
        this.f35830m = false;
        this.f35831n = false;
        this.f35833q = 1;
        this.f35838v = true;
        this.f35820b = adContentData;
        this.f35832p = str;
        if (adContentData != null) {
            adContentData.J(uuid);
        }
    }

    public static ArrayList e(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new ImageInfo((com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo) it.next()));
            }
        }
        return arrayList;
    }

    public final VideoInfo a() {
        MetaData g6;
        if (this.f35825h == null && (g6 = g()) != null) {
            this.f35825h = new VideoInfo(g6.K());
        }
        return this.f35825h;
    }

    public final int b() {
        AdContentData adContentData = this.f35820b;
        if (adContentData != null) {
            return adContentData.M();
        }
        return 2;
    }

    public final String c() {
        MetaData g6;
        if (this.f35826i == null && (g6 = g()) != null) {
            this.f35826i = y1.p(g6.c());
        }
        return this.f35826i;
    }

    public final long d() {
        MetaData g6;
        if (this.f35829l < 0 && (g6 = g()) != null) {
            this.f35829l = g6.r0();
        }
        return this.f35829l;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        String f = f();
        if (!(obj instanceof b) || f == null) {
            return false;
        }
        return TextUtils.equals(f, ((b) obj).f());
    }

    public final String f() {
        AdContentData adContentData = this.f35820b;
        if (adContentData != null) {
            return adContentData.B();
        }
        return null;
    }

    public final MetaData g() {
        AdContentData adContentData = this.f35820b;
        if (adContentData != null) {
            return adContentData.x();
        }
        return null;
    }

    public final long h() {
        MetaData g6 = g();
        if (g6 != null) {
            return g6.b0();
        }
        return 500L;
    }

    public final int hashCode() {
        int i10;
        String f = f();
        if (f != null) {
            i10 = f.hashCode();
        } else {
            i10 = -1;
        }
        return i10 & super.hashCode();
    }

    public final AppInfo i() {
        MetaData g6;
        ApkInfo k02;
        String str;
        if (this.f == null && (g6 = g()) != null && (k02 = g6.k0()) != null) {
            AppInfo appInfo = new AppInfo(k02);
            MetaData g10 = g();
            if (g10 != null) {
                str = g10.g0();
            } else {
                str = "";
            }
            appInfo.J(str);
            appInfo.c0(this.f35819a);
            appInfo.I(g6.p());
            this.f = appInfo;
        }
        return this.f;
    }
}
