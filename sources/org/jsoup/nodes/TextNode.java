package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

/* loaded from: classes2.dex */
public class TextNode extends gd.a {
    public TextNode(String str) {
        this.f28651v = str;
    }

    public static TextNode createFromEncoded(String str) {
        return new TextNode(Entities.unescape(str));
    }

    public static boolean p(StringBuilder sb2) {
        if (sb2.length() != 0 && sb2.charAt(sb2.length() - 1) == ' ') {
            return true;
        }
        return false;
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

    public String getWholeText() {
        return n();
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ boolean hasAttr(String str) {
        return super.hasAttr(str);
    }

    @Override // org.jsoup.nodes.Node
    public void i(Appendable appendable, int i10, Document.OutputSettings outputSettings) throws IOException {
        Element element;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean prettyPrint = outputSettings.prettyPrint();
        Node node = this.f33996s;
        if (node instanceof Element) {
            element = (Element) node;
        } else {
            element = null;
        }
        boolean z15 = true;
        if (prettyPrint && !Element.s(node)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((this.f33997t == 0 && element != null && element.tag().isBlock()) || (this.f33996s instanceof Document)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (nextSibling() == null && element != null && element.tag().isBlock()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Node nextSibling = nextSibling();
            if ((!(nextSibling instanceof Element) || !((Element) nextSibling).t(outputSettings)) && (!(nextSibling instanceof TextNode) || !((TextNode) nextSibling).isBlank())) {
                z15 = false;
            }
            if (z15 && isBlank()) {
                return;
            }
            if ((this.f33997t == 0 && element != null && element.tag().formatAsBlock() && !isBlank()) || (outputSettings.outline() && siblingNodes().size() > 0 && !isBlank())) {
                Node.h(appendable, i10, outputSettings);
            }
            z11 = z13;
            z12 = z14;
        } else {
            z11 = false;
            z12 = false;
        }
        Entities.b(appendable, n(), outputSettings, false, z10, z11, z12);
    }

    public boolean isBlank() {
        return StringUtil.isBlank(n());
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#text";
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node removeAttr(String str) {
        return super.removeAttr(str);
    }

    public TextNode splitText(int i10) {
        boolean z10;
        boolean z11;
        String n10 = n();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Validate.isTrue(z10, "Split offset must be not be negative");
        if (i10 < n10.length()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Validate.isTrue(z11, "Split offset must not be greater than current text length");
        String substring = n10.substring(0, i10);
        String substring2 = n10.substring(i10);
        text(substring);
        TextNode textNode = new TextNode(substring2);
        Node node = this.f33996s;
        if (node != null) {
            node.a(siblingIndex() + 1, textNode);
        }
        return textNode;
    }

    public String text() {
        return StringUtil.normaliseWhitespace(getWholeText());
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return outerHtml();
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node attr(String str, String str2) {
        return super.attr(str, str2);
    }

    public TextNode text(String str) {
        attr(nodeName(), str);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: clone */
    public TextNode mo10clone() {
        return (TextNode) super.mo10clone();
    }

    @Override // org.jsoup.nodes.Node
    public void j(Appendable appendable, int i10, Document.OutputSettings outputSettings) {
    }
}
