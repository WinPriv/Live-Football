package org.jsoup.nodes;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.huawei.openalliance.ad.constant.av;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

/* loaded from: classes2.dex */
public class Attribute implements Map.Entry<String, String>, Cloneable {

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f33955v = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", CallMraidJS.f, "defer", "disabled", "formnovalidate", CallMraidJS.f7006h, "inert", "ismap", "itemscope", "multiple", av.aw, "nohref", "noresize", "noshade", "novalidate", "nowrap", av.ai, "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f33956w = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f33957x = Pattern.compile("[^-a-zA-Z0-9_:.]");
    public static final Pattern y = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f33958z = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");

    /* renamed from: s, reason: collision with root package name */
    public String f33959s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public String f33960t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public Attributes f33961u;

    public Attribute(String str, @Nullable String str2) {
        this(str, str2, null);
    }

    public static void a(String str, @Nullable String str2, Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        boolean z10;
        appendable.append(str);
        if (outputSettings.syntax() == Document.OutputSettings.Syntax.html && (str2 == null || ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && isBooleanAttribute(str)))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            appendable.append("=\"");
            if (str2 == null) {
                str2 = "";
            }
            Entities.b(appendable, str2, outputSettings, true, false, false, false);
            appendable.append('\"');
        }
    }

    public static Attribute createFromEncoded(String str, String str2) {
        char[] cArr = Entities.f33987a;
        return new Attribute(str, Parser.unescapeEntities(str2, true), null);
    }

    @Nullable
    public static String getValidKey(String str, Document.OutputSettings.Syntax syntax) {
        if (syntax == Document.OutputSettings.Syntax.xml) {
            Pattern pattern = f33956w;
            if (!pattern.matcher(str).matches()) {
                String replaceAll = f33957x.matcher(str).replaceAll("");
                if (!pattern.matcher(replaceAll).matches()) {
                    return null;
                }
                return replaceAll;
            }
        }
        if (syntax == Document.OutputSettings.Syntax.html) {
            Pattern pattern2 = y;
            if (!pattern2.matcher(str).matches()) {
                String replaceAll2 = f33958z.matcher(str).replaceAll("");
                if (!pattern2.matcher(replaceAll2).matches()) {
                    return null;
                }
                return replaceAll2;
            }
        }
        return str;
    }

    public static boolean isBooleanAttribute(String str) {
        if (Arrays.binarySearch(f33955v, Normalizer.lowerCase(str)) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attribute attribute = (Attribute) obj;
        String str = this.f33959s;
        if (str == null ? attribute.f33959s != null : !str.equals(attribute.f33959s)) {
            return false;
        }
        String str2 = this.f33960t;
        String str3 = attribute.f33960t;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public boolean hasDeclaredValue() {
        if (this.f33960t != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int i10;
        String str = this.f33959s;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f33960t;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public String html() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        try {
            Document.OutputSettings outputSettings = new Document("").outputSettings();
            String str = this.f33959s;
            String str2 = this.f33960t;
            String validKey = getValidKey(str, outputSettings.syntax());
            if (validKey != null) {
                a(validKey, str2, borrowBuilder, outputSettings);
            }
            return StringUtil.releaseBuilder(borrowBuilder);
        } catch (IOException e10) {
            throw new SerializationException(e10);
        }
    }

    public void setKey(String str) {
        int c10;
        Validate.notNull(str);
        String trim = str.trim();
        Validate.notEmpty(trim);
        Attributes attributes = this.f33961u;
        if (attributes != null && (c10 = attributes.c(this.f33959s)) != -1) {
            this.f33961u.f33963t[c10] = trim;
        }
        this.f33959s = trim;
    }

    public String toString() {
        return html();
    }

    public Attribute(String str, @Nullable String str2, @Nullable Attributes attributes) {
        Validate.notNull(str);
        String trim = str.trim();
        Validate.notEmpty(trim);
        this.f33959s = trim;
        this.f33960t = str2;
        this.f33961u = attributes;
    }

    public Attribute clone() {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // java.util.Map.Entry
    public String getKey() {
        return this.f33959s;
    }

    @Override // java.util.Map.Entry
    public String getValue() {
        String str = this.f33960t;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public String setValue(@Nullable String str) {
        int c10;
        String str2 = this.f33960t;
        Attributes attributes = this.f33961u;
        if (attributes != null && (c10 = attributes.c(this.f33959s)) != -1) {
            str2 = this.f33961u.get(this.f33959s);
            this.f33961u.f33964u[c10] = str;
        }
        this.f33960t = str;
        return str2 == null ? "" : str2;
    }
}
