package com.applovin.impl.c;

import android.net.Uri;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private int f17395a;

    /* renamed from: b, reason: collision with root package name */
    private int f17396b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f17397c;

    /* renamed from: d, reason: collision with root package name */
    private i f17398d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<k> f17399e = new HashSet();
    private final Map<String, Set<k>> f = CollectionUtils.map();

    private d() {
    }

    public static d a(t tVar, d dVar, e eVar, p pVar) {
        t b10;
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (pVar != null) {
            if (dVar == null) {
                try {
                    dVar = new d();
                } catch (Throwable th) {
                    pVar.L();
                    if (!y.a()) {
                        return null;
                    }
                    pVar.L().b("VastCompanionAd", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (dVar.f17395a == 0 && dVar.f17396b == 0) {
                int parseInt = StringUtils.parseInt(tVar.b().get(ContentRecord.WIDTH));
                int parseInt2 = StringUtils.parseInt(tVar.b().get(ContentRecord.HEIGHT));
                if (parseInt > 0 && parseInt2 > 0) {
                    dVar.f17395a = parseInt;
                    dVar.f17396b = parseInt2;
                }
            }
            dVar.f17398d = i.a(tVar, dVar.f17398d, pVar);
            if (dVar.f17397c == null && (b10 = tVar.b("CompanionClickThrough")) != null) {
                String c10 = b10.c();
                if (StringUtils.isValidString(c10)) {
                    dVar.f17397c = Uri.parse(c10);
                }
            }
            m.a(tVar.a("CompanionClickTracking"), dVar.f17399e, eVar, pVar);
            m.a(tVar, dVar.f, eVar, pVar);
            return dVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public i b() {
        return this.f17398d;
    }

    public Set<k> c() {
        return this.f17399e;
    }

    public Map<String, Set<k>> d() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f17395a != dVar.f17395a || this.f17396b != dVar.f17396b) {
            return false;
        }
        Uri uri = this.f17397c;
        if (uri == null ? dVar.f17397c != null : !uri.equals(dVar.f17397c)) {
            return false;
        }
        i iVar = this.f17398d;
        if (iVar == null ? dVar.f17398d != null : !iVar.equals(dVar.f17398d)) {
            return false;
        }
        Set<k> set = this.f17399e;
        if (set == null ? dVar.f17399e != null : !set.equals(dVar.f17399e)) {
            return false;
        }
        Map<String, Set<k>> map = this.f;
        Map<String, Set<k>> map2 = dVar.f;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((this.f17395a * 31) + this.f17396b) * 31;
        Uri uri = this.f17397c;
        int i14 = 0;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i13 + i10) * 31;
        i iVar = this.f17398d;
        if (iVar != null) {
            i11 = iVar.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        Set<k> set = this.f17399e;
        if (set != null) {
            i12 = set.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        Map<String, Set<k>> map = this.f;
        if (map != null) {
            i14 = map.hashCode();
        }
        return i17 + i14;
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f17395a + ", height=" + this.f17396b + ", destinationUri=" + this.f17397c + ", nonVideoResource=" + this.f17398d + ", clickTrackers=" + this.f17399e + ", eventTrackers=" + this.f + '}';
    }

    public Uri a() {
        return this.f17397c;
    }
}
