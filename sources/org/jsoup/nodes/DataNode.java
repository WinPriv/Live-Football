package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.nodes.Document;

/* loaded from: classes2.dex */
public class DataNode extends gd.a {
    public DataNode(String str) {
        this.f28651v = str;
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

    public String getWholeData() {
        return n();
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ boolean hasAttr(String str) {
        return super.hasAttr(str);
    }

    @Override // org.jsoup.nodes.Node
    public final void i(Appendable appendable, int i10, Document.OutputSettings outputSettings) throws IOException {
        appendable.append(getWholeData());
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#data";
    }

    @Override // gd.a, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node removeAttr(String str) {
        return super.removeAttr(str);
    }

    public DataNode setWholeData(String str) {
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
    public DataNode mo10clone() {
        return (DataNode) super.mo10clone();
    }

    @Override // org.jsoup.nodes.Node
    public final void j(Appendable appendable, int i10, Document.OutputSettings outputSettings) {
    }
}
