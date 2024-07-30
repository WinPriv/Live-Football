package org.jsoup.nodes;

import a3.k;
import javax.annotation.Nullable;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

/* loaded from: classes2.dex */
public class Comment extends gd.a {
    public Comment(String str) {
        this.f28651v = str;
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ String absUrl(String str) {
        return super.absUrl(str);
    }

    @Nullable
    public XmlDeclaration asXmlDeclaration() {
        String data = getData();
        boolean z10 = true;
        String substring = data.substring(1, data.length() - 1);
        if (substring.length() <= 1 || (!substring.startsWith("!") && !substring.startsWith("?"))) {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        Document parseInput = Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput(k.l("<", substring, ">"), baseUri());
        if (parseInput.body().children().size() <= 0) {
            return null;
        }
        Element child = parseInput.body().child(0);
        XmlDeclaration xmlDeclaration = new XmlDeclaration(a.a(parseInput).settings().normalizeTag(child.tagName()), data.startsWith("!"));
        xmlDeclaration.attributes().addAll(child.attributes());
        return xmlDeclaration;
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

    public String getData() {
        return n();
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ boolean hasAttr(String str) {
        return super.hasAttr(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r5.outline() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (((org.jsoup.nodes.Element) r0).tag().formatAsBlock() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        org.jsoup.nodes.Node.h(r3, r4, r5);
     */
    @Override // org.jsoup.nodes.Node
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Appendable r3, int r4, org.jsoup.nodes.Document.OutputSettings r5) throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = r5.prettyPrint()
            if (r0 == 0) goto L27
            int r0 = r2.siblingIndex()
            if (r0 != 0) goto L1e
            org.jsoup.nodes.Node r0 = r2.f33996s
            boolean r1 = r0 instanceof org.jsoup.nodes.Element
            if (r1 == 0) goto L1e
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            org.jsoup.parser.Tag r0 = r0.tag()
            boolean r0 = r0.formatAsBlock()
            if (r0 != 0) goto L24
        L1e:
            boolean r0 = r5.outline()
            if (r0 == 0) goto L27
        L24:
            org.jsoup.nodes.Node.h(r3, r4, r5)
        L27:
            java.lang.String r4 = "<!--"
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r4 = r2.getData()
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r4 = "-->"
            r3.append(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Comment.i(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings):void");
    }

    public boolean isXmlDeclaration() {
        String data = getData();
        if (data.length() > 1 && (data.startsWith("!") || data.startsWith("?"))) {
            return true;
        }
        return false;
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#comment";
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node removeAttr(String str) {
        return super.removeAttr(str);
    }

    public Comment setData(String str) {
        attr(nodeName(), str);
        return this;
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
    public Comment mo10clone() {
        return (Comment) super.mo10clone();
    }

    @Override // org.jsoup.nodes.Node
    public final void j(Appendable appendable, int i10, Document.OutputSettings outputSettings) {
    }
}
