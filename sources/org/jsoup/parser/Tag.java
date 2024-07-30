package org.jsoup.parser;

import com.anythink.basead.d.i;
import com.anythink.expressad.exoplayer.k.o;
import com.anythink.expressad.foundation.d.f;
import com.anythink.expressad.foundation.d.h;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.constant.bd;
import com.vungle.warren.ui.contract.AdContract;
import java.util.HashMap;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

/* loaded from: classes2.dex */
public class Tag implements Cloneable {
    public static final HashMap B = new HashMap();
    public static final String[] C;
    public static final String[] D;
    public static final String[] E;
    public static final String[] F;
    public static final String[] G;
    public static final String[] H;

    /* renamed from: s, reason: collision with root package name */
    public String f34044s;

    /* renamed from: t, reason: collision with root package name */
    public final String f34045t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f34046u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f34047v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34048w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f34049x = false;
    public boolean y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f34050z = false;
    public boolean A = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", f.f9576j, "footer", com.anythink.core.common.g.c.W, "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", o.f9069b, "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        C = new String[]{"object", "base", "font", "tt", i.f3957a, "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", h.cG, "ruby", "rt", "rp", "a", bd.Code, "br", "wbr", "map", com.anythink.expressad.foundation.d.c.bj, "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", av.aq, "track", "summary", AdContract.AdvertisementBus.COMMAND, "device", "area", "basefont", "bgsound", "menuitem", "param", av.aq, "track", "data", "bdi", "s", "strike", "nobr"};
        D = new String[]{"meta", "link", "base", "frame", bd.Code, "br", "wbr", "embed", "hr", "input", "keygen", "col", AdContract.AdvertisementBus.COMMAND, "device", "area", "basefont", "bgsound", "menuitem", "param", av.aq, "track"};
        E = new String[]{"title", "a", com.anythink.core.common.g.c.W, "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
        F = new String[]{"pre", "plaintext", "title", "textarea"};
        G = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        H = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (int i10 = 0; i10 < 69; i10++) {
            Tag tag = new Tag(strArr[i10]);
            B.put(tag.f34044s, tag);
        }
        for (String str : C) {
            Tag tag2 = new Tag(str);
            tag2.f34046u = false;
            tag2.f34047v = false;
            B.put(tag2.f34044s, tag2);
        }
        for (String str2 : D) {
            Tag tag3 = (Tag) B.get(str2);
            Validate.notNull(tag3);
            tag3.f34048w = true;
        }
        for (String str3 : E) {
            Tag tag4 = (Tag) B.get(str3);
            Validate.notNull(tag4);
            tag4.f34047v = false;
        }
        for (String str4 : F) {
            Tag tag5 = (Tag) B.get(str4);
            Validate.notNull(tag5);
            tag5.y = true;
        }
        for (String str5 : G) {
            Tag tag6 = (Tag) B.get(str5);
            Validate.notNull(tag6);
            tag6.f34050z = true;
        }
        for (String str6 : H) {
            Tag tag7 = (Tag) B.get(str6);
            Validate.notNull(tag7);
            tag7.A = true;
        }
    }

    public Tag(String str) {
        this.f34044s = str;
        this.f34045t = Normalizer.lowerCase(str);
    }

    public static Tag valueOf(String str, ParseSettings parseSettings) {
        Validate.notNull(str);
        HashMap hashMap = B;
        Tag tag = (Tag) hashMap.get(str);
        if (tag != null) {
            return tag;
        }
        String normalizeTag = parseSettings.normalizeTag(str);
        Validate.notEmpty(normalizeTag);
        String lowerCase = Normalizer.lowerCase(normalizeTag);
        Tag tag2 = (Tag) hashMap.get(lowerCase);
        if (tag2 == null) {
            Tag tag3 = new Tag(normalizeTag);
            tag3.f34046u = false;
            return tag3;
        }
        if (!parseSettings.preserveTagCase() || normalizeTag.equals(lowerCase)) {
            return tag2;
        }
        try {
            Tag tag4 = (Tag) super.clone();
            tag4.f34044s = normalizeTag;
            return tag4;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        try {
            return (Tag) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        if (this.f34044s.equals(tag.f34044s) && this.f34048w == tag.f34048w && this.f34047v == tag.f34047v && this.f34046u == tag.f34046u && this.y == tag.y && this.f34049x == tag.f34049x && this.f34050z == tag.f34050z && this.A == tag.A) {
            return true;
        }
        return false;
    }

    public boolean formatAsBlock() {
        return this.f34047v;
    }

    public String getName() {
        return this.f34044s;
    }

    public int hashCode() {
        return (((((((((((((this.f34044s.hashCode() * 31) + (this.f34046u ? 1 : 0)) * 31) + (this.f34047v ? 1 : 0)) * 31) + (this.f34048w ? 1 : 0)) * 31) + (this.f34049x ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31) + (this.f34050z ? 1 : 0)) * 31) + (this.A ? 1 : 0);
    }

    public boolean isBlock() {
        return this.f34046u;
    }

    public boolean isEmpty() {
        return this.f34048w;
    }

    public boolean isFormListed() {
        return this.f34050z;
    }

    public boolean isFormSubmittable() {
        return this.A;
    }

    public boolean isInline() {
        return !this.f34046u;
    }

    public boolean isKnownTag() {
        return B.containsKey(this.f34044s);
    }

    public boolean isSelfClosing() {
        if (!this.f34048w && !this.f34049x) {
            return false;
        }
        return true;
    }

    public String normalName() {
        return this.f34045t;
    }

    public boolean preserveWhitespace() {
        return this.y;
    }

    public String toString() {
        return this.f34044s;
    }

    public static boolean isKnownTag(String str) {
        return B.containsKey(str);
    }

    public static Tag valueOf(String str) {
        return valueOf(str, ParseSettings.preserveCase);
    }
}
