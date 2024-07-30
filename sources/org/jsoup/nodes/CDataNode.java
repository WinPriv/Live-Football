package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.UncheckedIOException;
import org.jsoup.nodes.Document;

/* loaded from: classes2.dex */
public class CDataNode extends TextNode {
    public CDataNode(String str) {
        super(str);
    }

    @Override // org.jsoup.nodes.TextNode, org.jsoup.nodes.Node
    public final void i(Appendable appendable, int i10, Document.OutputSettings outputSettings) throws IOException {
        appendable.append("<![CDATA[").append(getWholeText());
    }

    @Override // org.jsoup.nodes.TextNode, org.jsoup.nodes.Node
    public final void j(Appendable appendable, int i10, Document.OutputSettings outputSettings) {
        try {
            appendable.append("]]>");
        } catch (IOException e10) {
            throw new UncheckedIOException(e10);
        }
    }

    @Override // org.jsoup.nodes.TextNode, org.jsoup.nodes.Node
    public String nodeName() {
        return "#cdata";
    }

    @Override // org.jsoup.nodes.TextNode
    public String text() {
        return getWholeText();
    }

    @Override // org.jsoup.nodes.TextNode, org.jsoup.nodes.Node
    /* renamed from: clone */
    public CDataNode mo10clone() {
        return (CDataNode) super.mo10clone();
    }
}
