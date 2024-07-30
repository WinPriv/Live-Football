package org.jsoup.nodes;

import java.io.IOException;
import java.util.Iterator;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

/* loaded from: classes2.dex */
public class XmlDeclaration extends gd.a {

    /* renamed from: w, reason: collision with root package name */
    public final boolean f34008w;

    public XmlDeclaration(String str, boolean z10) {
        Validate.notNull(str);
        this.f28651v = str;
        this.f34008w = z10;
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

    public String getWholeDeclaration() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        try {
            p(borrowBuilder, new Document.OutputSettings());
            return StringUtil.releaseBuilder(borrowBuilder).trim();
        } catch (IOException e10) {
            throw new SerializationException(e10);
        }
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ boolean hasAttr(String str) {
        return super.hasAttr(str);
    }

    @Override // org.jsoup.nodes.Node
    public final void i(Appendable appendable, int i10, Document.OutputSettings outputSettings) throws IOException {
        CharSequence charSequence;
        Appendable append = appendable.append("<");
        String str = "!";
        boolean z10 = this.f34008w;
        if (z10) {
            charSequence = "!";
        } else {
            charSequence = "?";
        }
        append.append(charSequence).append(n());
        p(appendable, outputSettings);
        if (!z10) {
            str = "?";
        }
        appendable.append(str).append(">");
    }

    public String name() {
        return n();
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#declaration";
    }

    public final void p(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        Iterator<Attribute> it = attributes().iterator();
        while (it.hasNext()) {
            Attribute next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            if (!key.equals(nodeName())) {
                appendable.append(' ');
                appendable.append(key);
                if (!value.isEmpty()) {
                    appendable.append("=\"");
                    Entities.b(appendable, value, outputSettings, true, false, false, false);
                    appendable.append('\"');
                }
            }
        }
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node removeAttr(String str) {
        return super.removeAttr(str);
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return outerHtml();
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node attr(String str, String str2) {
        return super.attr(str, str2);
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: clone */
    public XmlDeclaration mo10clone() {
        return (XmlDeclaration) super.mo10clone();
    }

    @Override // org.jsoup.nodes.Node
    public final void j(Appendable appendable, int i10, Document.OutputSettings outputSettings) {
    }
}
