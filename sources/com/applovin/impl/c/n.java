package com.applovin.impl.c;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import com.huawei.openalliance.ad.constant.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private List<o> f17447a;

    /* renamed from: b, reason: collision with root package name */
    private List<String> f17448b;

    /* renamed from: c, reason: collision with root package name */
    private int f17449c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f17450d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<k> f17451e;
    private g f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, Set<k>> f17452g;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED,
        LOW,
        MEDIUM,
        HIGH
    }

    private n() {
        this.f17447a = Collections.emptyList();
        this.f17448b = Collections.emptyList();
        this.f17451e = new HashSet();
        this.f17452g = CollectionUtils.map();
    }

    public static n a(t tVar, n nVar, e eVar, p pVar) {
        t b10;
        g a10;
        List<t> a11;
        t b11;
        List<o> a12;
        t b12;
        int a13;
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (pVar != null) {
            if (nVar == null) {
                try {
                    nVar = new n(eVar);
                } catch (Throwable th) {
                    pVar.L();
                    if (!y.a()) {
                        return null;
                    }
                    pVar.L().b("VastVideoCreative", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (nVar.f17449c == 0 && (b12 = tVar.b("Duration")) != null && (a13 = a(b12.c(), pVar)) > 0) {
                nVar.f17449c = a13;
            }
            t b13 = tVar.b("MediaFiles");
            if (b13 != null && (a12 = a(b13, pVar)) != null && a12.size() > 0) {
                List<o> list = nVar.f17447a;
                if (list != null) {
                    a12.addAll(list);
                }
                nVar.f17447a = a12;
            }
            t b14 = tVar.b("VideoClicks");
            if (b14 != null) {
                if (nVar.f17450d == null && (b11 = b14.b("ClickThrough")) != null) {
                    String c10 = b11.c();
                    if (StringUtils.isValidString(c10)) {
                        nVar.f17450d = Uri.parse(c10);
                    }
                }
                m.a(b14.a("ClickTracking"), nVar.f17451e, eVar, pVar);
            }
            t b15 = tVar.b("Icons");
            if (b15 != null && (a10 = g.a((b10 = b15.b("Icon")), pVar)) != null) {
                t b16 = b10.b("IconClicks");
                if (b16 != null && (a11 = b16.a("IconClickTracking")) != null) {
                    m.a(a11, a10.f17422a, eVar, pVar);
                }
                List<t> a14 = b10.a("IconViewTracking");
                if (a14 != null) {
                    m.a(a14, a10.f17423b, eVar, pVar);
                }
                nVar.f = a10;
            }
            m.a(tVar, nVar.f17452g, eVar, pVar);
            return nVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public int b() {
        return this.f17449c;
    }

    public Uri c() {
        return this.f17450d;
    }

    public Set<k> d() {
        return this.f17451e;
    }

    public Map<String, Set<k>> e() {
        return this.f17452g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f17449c != nVar.f17449c) {
            return false;
        }
        List<o> list = this.f17447a;
        if (list == null ? nVar.f17447a != null : !list.equals(nVar.f17447a)) {
            return false;
        }
        Uri uri = this.f17450d;
        if (uri == null ? nVar.f17450d != null : !uri.equals(nVar.f17450d)) {
            return false;
        }
        Set<k> set = this.f17451e;
        if (set == null ? nVar.f17451e != null : !set.equals(nVar.f17451e)) {
            return false;
        }
        Map<String, Set<k>> map = this.f17452g;
        Map<String, Set<k>> map2 = nVar.f17452g;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public g f() {
        return this.f;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        List<o> list = this.f17447a;
        int i13 = 0;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = ((i10 * 31) + this.f17449c) * 31;
        Uri uri = this.f17450d;
        if (uri != null) {
            i11 = uri.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        Set<k> set = this.f17451e;
        if (set != null) {
            i12 = set.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        Map<String, Set<k>> map = this.f17452g;
        if (map != null) {
            i13 = map.hashCode();
        }
        return i16 + i13;
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f17447a + ", durationSeconds=" + this.f17449c + ", destinationUri=" + this.f17450d + ", clickTrackers=" + this.f17451e + ", eventTrackers=" + this.f17452g + ", industryIcon=" + this.f + '}';
    }

    private n(e eVar) {
        this.f17447a = Collections.emptyList();
        this.f17448b = Collections.emptyList();
        this.f17451e = new HashSet();
        this.f17452g = CollectionUtils.map();
        this.f17448b = eVar.g();
    }

    private static int a(String str, p pVar) {
        try {
            if (CollectionUtils.explode(str, w.bE).size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(r1.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(r1.get(1))) + StringUtils.parseInt(r1.get(2)));
            }
        } catch (Throwable unused) {
            pVar.L();
            if (y.a()) {
                pVar.L().e("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List<o> a(t tVar, p pVar) {
        List<t> a10 = tVar.a("MediaFile");
        ArrayList arrayList = new ArrayList(a10.size());
        List<String> explode = CollectionUtils.explode((String) pVar.a(com.applovin.impl.sdk.c.b.eL));
        List<String> explode2 = CollectionUtils.explode((String) pVar.a(com.applovin.impl.sdk.c.b.eK));
        Iterator<t> it = a10.iterator();
        while (it.hasNext()) {
            o a11 = o.a(it.next(), pVar);
            if (a11 != null) {
                try {
                    String c10 = a11.c();
                    if (StringUtils.isValidString(c10) && !explode.contains(c10)) {
                        arrayList.add(a11);
                    } else {
                        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.eM)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a11.b().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(a11);
                            }
                        }
                        pVar.L();
                        if (y.a()) {
                            pVar.L().d("VastVideoCreative", "Video file not supported: " + a11);
                        }
                    }
                } catch (Throwable th) {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().b("VastVideoCreative", "Failed to validate video file: " + a11, th);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o a(a aVar) {
        List<o> list = this.f17447a;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        for (String str : this.f17448b) {
            for (o oVar : this.f17447a) {
                String c10 = oVar.c();
                if (StringUtils.isValidString(c10) && str.equalsIgnoreCase(c10)) {
                    arrayList.add(oVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        List list2 = arrayList;
        if (isEmpty) {
            list2 = this.f17447a;
        }
        if (com.applovin.impl.sdk.utils.h.c()) {
            Collections.sort(list2, new Comparator<o>() { // from class: com.applovin.impl.c.n.1
                @Override // java.util.Comparator
                @TargetApi(19)
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(o oVar2, o oVar3) {
                    return Integer.compare(oVar2.d(), oVar3.d());
                }
            });
        }
        if (aVar == a.LOW) {
            return (o) list2.get(0);
        }
        if (aVar == a.MEDIUM) {
            return (o) list2.get(list2.size() / 2);
        }
        return (o) list2.get(list2.size() - 1);
    }

    public List<o> a() {
        return this.f17447a;
    }
}
