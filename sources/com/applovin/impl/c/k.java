package com.applovin.impl.c;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import com.huawei.openalliance.ad.constant.cp;
import com.huawei.openalliance.ad.constant.w;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private String f17439a;

    /* renamed from: b, reason: collision with root package name */
    private String f17440b;

    /* renamed from: c, reason: collision with root package name */
    private String f17441c;

    /* renamed from: d, reason: collision with root package name */
    private long f17442d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f17443e = -1;

    private k() {
    }

    public static k a(t tVar, e eVar, p pVar) {
        List<String> explode;
        int size;
        long seconds;
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (pVar != null) {
            try {
                String c10 = tVar.c();
                if (StringUtils.isValidString(c10)) {
                    k kVar = new k();
                    kVar.f17441c = c10;
                    kVar.f17439a = tVar.b().get("id");
                    kVar.f17440b = tVar.b().get("event");
                    kVar.f17443e = a(kVar.a(), eVar);
                    String str = tVar.b().get("offset");
                    if (StringUtils.isValidString(str)) {
                        String trim = str.trim();
                        if (trim.contains("%")) {
                            kVar.f17443e = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                        } else if (trim.contains(w.bE) && (size = (explode = CollectionUtils.explode(trim, w.bE)).size()) > 0) {
                            int i10 = size - 1;
                            long j10 = 0;
                            for (int i11 = i10; i11 >= 0; i11--) {
                                String str2 = explode.get(i11);
                                if (StringUtils.isNumeric(str2)) {
                                    int parseInt = Integer.parseInt(str2);
                                    if (i11 == i10) {
                                        seconds = parseInt;
                                    } else if (i11 == size - 2) {
                                        seconds = TimeUnit.MINUTES.toSeconds(parseInt);
                                    } else if (i11 == size - 3) {
                                        seconds = TimeUnit.HOURS.toSeconds(parseInt);
                                    }
                                    j10 += seconds;
                                }
                            }
                            kVar.f17442d = j10;
                            kVar.f17443e = -1;
                        }
                    }
                    return kVar;
                }
                pVar.L();
                if (!y.a()) {
                    return null;
                }
                pVar.L().e("VastTracker", "Unable to create tracker. Could not find URL.");
                return null;
            } catch (Throwable th) {
                pVar.L();
                if (!y.a()) {
                    return null;
                }
                pVar.L().b("VastTracker", "Error occurred while initializing", th);
                return null;
            }
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public String b() {
        return this.f17441c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f17442d != kVar.f17442d || this.f17443e != kVar.f17443e) {
            return false;
        }
        String str = this.f17439a;
        if (str == null ? kVar.f17439a != null : !str.equals(kVar.f17439a)) {
            return false;
        }
        String str2 = this.f17440b;
        if (str2 == null ? kVar.f17440b != null : !str2.equals(kVar.f17440b)) {
            return false;
        }
        return this.f17441c.equals(kVar.f17441c);
    }

    public int hashCode() {
        int i10;
        String str = this.f17439a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f17440b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        int b10 = e0.i.b(this.f17441c, (i12 + i11) * 31, 31);
        long j10 = this.f17442d;
        return ((b10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f17443e;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f17439a + "', event='" + this.f17440b + "', uriString='" + this.f17441c + "', offsetSeconds=" + this.f17442d + ", offsetPercent=" + this.f17443e + '}';
    }

    private static int a(String str, e eVar) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if (cp.V.equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if (cp.Z.equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (eVar != null) {
            return eVar.h();
        }
        return 95;
    }

    public String a() {
        return this.f17440b;
    }

    public boolean a(long j10, int i10) {
        long j11 = this.f17442d;
        boolean z10 = j11 >= 0;
        boolean z11 = j10 >= j11;
        int i11 = this.f17443e;
        boolean z12 = i11 >= 0;
        boolean z13 = i10 >= i11;
        if (z10 && z11) {
            return true;
        }
        return z12 && z13;
    }
}
