package org.jsoup.safety;

import com.anythink.basead.d.i;
import com.huawei.openalliance.ad.constant.bd;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

/* loaded from: classes2.dex */
public class Safelist {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f34172a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f34173b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f34174c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f34175d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f34176e;

    /* loaded from: classes2.dex */
    public static class a extends e {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends e {
        public b(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends e {
        public c(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends e {
        public d(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f34177a;

        public e(String str) {
            Validate.notNull(str);
            this.f34177a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            String str = ((e) obj).f34177a;
            String str2 = this.f34177a;
            if (str2 == null) {
                if (str == null) {
                    return true;
                }
                return false;
            }
            return str2.equals(str);
        }

        public final int hashCode() {
            int hashCode;
            String str = this.f34177a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return 31 + hashCode;
        }

        public final String toString() {
            return this.f34177a;
        }
    }

    public Safelist() {
        this.f34172a = new HashSet();
        this.f34173b = new HashMap();
        this.f34174c = new HashMap();
        this.f34175d = new HashMap();
        this.f34176e = false;
    }

    public static Safelist basic() {
        return new Safelist().addTags("a", "b", "blockquote", "br", "cite", "code", "dd", "dl", "dt", "em", i.f3957a, "li", "ol", com.anythink.core.common.g.c.W, "pre", com.anythink.expressad.foundation.d.c.bj, "small", "span", "strike", "strong", "sub", "sup", "u", "ul").addAttributes("a", "href").addAttributes("blockquote", "cite").addAttributes(com.anythink.expressad.foundation.d.c.bj, "cite").addProtocols("a", "href", "ftp", "http", "https", "mailto").addProtocols("blockquote", "cite", "http", "https").addProtocols("cite", "cite", "http", "https").addEnforcedAttribute("a", "rel", "nofollow");
    }

    public static Safelist basicWithImages() {
        return basic().addTags(bd.Code).addAttributes(bd.Code, "align", "alt", ContentRecord.HEIGHT, "src", "title", ContentRecord.WIDTH).addProtocols(bd.Code, "src", "http", "https");
    }

    public static Safelist none() {
        return new Safelist();
    }

    public static Safelist relaxed() {
        return new Safelist().addTags("a", "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", i.f3957a, bd.Code, "li", "ol", com.anythink.core.common.g.c.W, "pre", com.anythink.expressad.foundation.d.c.bj, "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u", "ul").addAttributes("a", "href", "title").addAttributes("blockquote", "cite").addAttributes("col", "span", ContentRecord.WIDTH).addAttributes("colgroup", "span", ContentRecord.WIDTH).addAttributes(bd.Code, "align", "alt", ContentRecord.HEIGHT, "src", "title", ContentRecord.WIDTH).addAttributes("ol", "start", "type").addAttributes(com.anythink.expressad.foundation.d.c.bj, "cite").addAttributes("table", "summary", ContentRecord.WIDTH).addAttributes("td", "abbr", "axis", "colspan", "rowspan", ContentRecord.WIDTH).addAttributes("th", "abbr", "axis", "colspan", "rowspan", "scope", ContentRecord.WIDTH).addAttributes("ul", "type").addProtocols("a", "href", "ftp", "http", "https", "mailto").addProtocols("blockquote", "cite", "http", "https").addProtocols("cite", "cite", "http", "https").addProtocols(bd.Code, "src", "http", "https").addProtocols(com.anythink.expressad.foundation.d.c.bj, "cite", "http", "https");
    }

    public static Safelist simpleText() {
        return new Safelist().addTags("b", "em", i.f3957a, "strong", "u");
    }

    public final Attributes a(String str) {
        Attributes attributes = new Attributes();
        d dVar = new d(str);
        HashMap hashMap = this.f34174c;
        if (hashMap.containsKey(dVar)) {
            for (Map.Entry entry : ((Map) hashMap.get(dVar)).entrySet()) {
                attributes.put(((a) entry.getKey()).f34177a, ((b) entry.getValue()).f34177a);
            }
        }
        return attributes;
    }

    public Safelist addAttributes(String str, String... strArr) {
        boolean z10;
        Validate.notEmpty(str);
        Validate.notNull(strArr);
        if (strArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Validate.isTrue(z10, "No attribute names supplied.");
        d dVar = new d(str);
        this.f34172a.add(dVar);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            Validate.notEmpty(str2);
            hashSet.add(new a(str2));
        }
        HashMap hashMap = this.f34173b;
        if (hashMap.containsKey(dVar)) {
            ((Set) hashMap.get(dVar)).addAll(hashSet);
        } else {
            hashMap.put(dVar, hashSet);
        }
        return this;
    }

    public Safelist addEnforcedAttribute(String str, String str2, String str3) {
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        Validate.notEmpty(str3);
        d dVar = new d(str);
        this.f34172a.add(dVar);
        a aVar = new a(str2);
        b bVar = new b(str3);
        HashMap hashMap = this.f34174c;
        if (hashMap.containsKey(dVar)) {
            ((Map) hashMap.get(dVar)).put(aVar, bVar);
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(aVar, bVar);
            hashMap.put(dVar, hashMap2);
        }
        return this;
    }

    public Safelist addProtocols(String str, String str2, String... strArr) {
        Map map;
        Set set;
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        Validate.notNull(strArr);
        d dVar = new d(str);
        a aVar = new a(str2);
        HashMap hashMap = this.f34175d;
        if (hashMap.containsKey(dVar)) {
            map = (Map) hashMap.get(dVar);
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap.put(dVar, hashMap2);
            map = hashMap2;
        }
        if (map.containsKey(aVar)) {
            set = (Set) map.get(aVar);
        } else {
            HashSet hashSet = new HashSet();
            map.put(aVar, hashSet);
            set = hashSet;
        }
        for (String str3 : strArr) {
            Validate.notEmpty(str3);
            set.add(new c(str3));
        }
        return this;
    }

    public Safelist addTags(String... strArr) {
        Validate.notNull(strArr);
        for (String str : strArr) {
            Validate.notEmpty(str);
            this.f34172a.add(new d(str));
        }
        return this;
    }

    public final boolean b(String str, Element element, Attribute attribute) {
        boolean z10;
        boolean z11;
        d dVar = new d(str);
        a aVar = new a(attribute.getKey());
        Set set = (Set) this.f34173b.get(dVar);
        if (set != null && set.contains(aVar)) {
            HashMap hashMap = this.f34175d;
            if (!hashMap.containsKey(dVar)) {
                return true;
            }
            Map map = (Map) hashMap.get(dVar);
            if (map.containsKey(aVar)) {
                Set set2 = (Set) map.get(aVar);
                String absUrl = element.absUrl(attribute.getKey());
                if (absUrl.length() == 0) {
                    absUrl = attribute.getValue();
                }
                if (!this.f34176e) {
                    attribute.setValue(absUrl);
                }
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    String str2 = ((c) it.next()).f34177a;
                    if (str2.equals("#")) {
                        if (absUrl.startsWith("#") && !absUrl.matches(".*\\s.*")) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z10 = true;
                            break;
                        }
                    } else {
                        if (Normalizer.lowerCase(absUrl).startsWith(str2.concat(w.bE))) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                    return false;
                }
            }
            return true;
        }
        if (((Map) this.f34174c.get(dVar)) != null) {
            Attributes a10 = a(str);
            String key = attribute.getKey();
            if (a10.hasKeyIgnoreCase(key)) {
                return a10.getIgnoreCase(key).equals(attribute.getValue());
            }
        }
        if (str.equals(":all") || !b(":all", element, attribute)) {
            return false;
        }
        return true;
    }

    public Safelist preserveRelativeLinks(boolean z10) {
        this.f34176e = z10;
        return this;
    }

    public Safelist removeAttributes(String str, String... strArr) {
        boolean z10;
        Validate.notEmpty(str);
        Validate.notNull(strArr);
        if (strArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Validate.isTrue(z10, "No attribute names supplied.");
        d dVar = new d(str);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            Validate.notEmpty(str2);
            hashSet.add(new a(str2));
        }
        boolean contains = this.f34172a.contains(dVar);
        HashMap hashMap = this.f34173b;
        if (contains && hashMap.containsKey(dVar)) {
            Set set = (Set) hashMap.get(dVar);
            set.removeAll(hashSet);
            if (set.isEmpty()) {
                hashMap.remove(dVar);
            }
        }
        if (str.equals(":all")) {
            for (d dVar2 : hashMap.keySet()) {
                Set set2 = (Set) hashMap.get(dVar2);
                set2.removeAll(hashSet);
                if (set2.isEmpty()) {
                    hashMap.remove(dVar2);
                }
            }
        }
        return this;
    }

    public Safelist removeEnforcedAttribute(String str, String str2) {
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        d dVar = new d(str);
        if (this.f34172a.contains(dVar)) {
            HashMap hashMap = this.f34174c;
            if (hashMap.containsKey(dVar)) {
                a aVar = new a(str2);
                Map map = (Map) hashMap.get(dVar);
                map.remove(aVar);
                if (map.isEmpty()) {
                    hashMap.remove(dVar);
                }
            }
        }
        return this;
    }

    public Safelist removeProtocols(String str, String str2, String... strArr) {
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        Validate.notNull(strArr);
        d dVar = new d(str);
        a aVar = new a(str2);
        HashMap hashMap = this.f34175d;
        Validate.isTrue(hashMap.containsKey(dVar), "Cannot remove a protocol that is not set.");
        Map map = (Map) hashMap.get(dVar);
        Validate.isTrue(map.containsKey(aVar), "Cannot remove a protocol that is not set.");
        Set set = (Set) map.get(aVar);
        for (String str3 : strArr) {
            Validate.notEmpty(str3);
            set.remove(new c(str3));
        }
        if (set.isEmpty()) {
            map.remove(aVar);
            if (map.isEmpty()) {
                hashMap.remove(dVar);
            }
        }
        return this;
    }

    public Safelist removeTags(String... strArr) {
        Validate.notNull(strArr);
        for (String str : strArr) {
            Validate.notEmpty(str);
            d dVar = new d(str);
            if (this.f34172a.remove(dVar)) {
                this.f34173b.remove(dVar);
                this.f34174c.remove(dVar);
                this.f34175d.remove(dVar);
            }
        }
        return this;
    }

    public Safelist(Safelist safelist) {
        this();
        this.f34172a.addAll(safelist.f34172a);
        for (Map.Entry entry : safelist.f34173b.entrySet()) {
            this.f34173b.put((d) entry.getKey(), new HashSet((Collection) entry.getValue()));
        }
        for (Map.Entry entry2 : safelist.f34174c.entrySet()) {
            this.f34174c.put((d) entry2.getKey(), new HashMap((Map) entry2.getValue()));
        }
        for (Map.Entry entry3 : safelist.f34175d.entrySet()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry4 : ((Map) entry3.getValue()).entrySet()) {
                hashMap.put((a) entry4.getKey(), new HashSet((Collection) entry4.getValue()));
            }
            this.f34175d.put((d) entry3.getKey(), hashMap);
        }
        this.f34176e = safelist.f34176e;
    }
}
