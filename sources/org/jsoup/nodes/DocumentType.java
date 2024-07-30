package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

/* loaded from: classes2.dex */
public class DocumentType extends gd.a {
    public static final String PUBLIC_KEY = "PUBLIC";
    public static final String SYSTEM_KEY = "SYSTEM";

    public DocumentType(String str, String str2, String str3) {
        Validate.notNull(str);
        Validate.notNull(str2);
        Validate.notNull(str3);
        attr("name", str);
        attr("publicId", str2);
        attr("systemId", str3);
        if (p("publicId")) {
            attr("pubSysKey", PUBLIC_KEY);
        } else if (p("systemId")) {
            attr("pubSysKey", SYSTEM_KEY);
        }
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ String absUrl(String str) {
        return super.absUrl(str);
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ String attr(String str) {
        return super.attr(str);
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ String baseUri() {
        return super.baseUri();
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ int childNodeSize() {
        return super.childNodeSize();
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node empty() {
        return super.empty();
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ boolean hasAttr(String str) {
        return super.hasAttr(str);
    }

    @Override // org.jsoup.nodes.Node
    public final void i(Appendable appendable, int i10, Document.OutputSettings outputSettings) throws IOException {
        if (this.f33997t > 0 && outputSettings.prettyPrint()) {
            appendable.append('\n');
        }
        if (outputSettings.syntax() == Document.OutputSettings.Syntax.html && !p("publicId") && !p("systemId")) {
            appendable.append("<!doctype");
        } else {
            appendable.append("<!DOCTYPE");
        }
        if (p("name")) {
            appendable.append(" ").append(attr("name"));
        }
        if (p("pubSysKey")) {
            appendable.append(" ").append(attr("pubSysKey"));
        }
        if (p("publicId")) {
            appendable.append(" \"").append(attr("publicId")).append('\"');
        }
        if (p("systemId")) {
            appendable.append(" \"").append(attr("systemId")).append('\"');
        }
        appendable.append('>');
    }

    public String name() {
        return attr("name");
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#doctype";
    }

    public final boolean p(String str) {
        return !StringUtil.isBlank(attr(str));
    }

    public String publicId() {
        return attr("publicId");
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node removeAttr(String str) {
        return super.removeAttr(str);
    }

    public void setPubSysKey(String str) {
        if (str != null) {
            attr("pubSysKey", str);
        }
    }

    public String systemId() {
        return attr("systemId");
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node attr(String str, String str2) {
        return super.attr(str, str2);
    }

    @Override // org.jsoup.nodes.Node
    public final void j(Appendable appendable, int i10, Document.OutputSettings outputSettings) {
    }
}
