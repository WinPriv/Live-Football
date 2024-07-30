package gd;

import java.util.List;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;

/* compiled from: LeafNode.java */
/* loaded from: classes2.dex */
public abstract class a extends Node {

    /* renamed from: v, reason: collision with root package name */
    public Object f28651v;

    @Override // org.jsoup.nodes.Node
    public String absUrl(String str) {
        o();
        return super.absUrl(str);
    }

    @Override // org.jsoup.nodes.Node
    public String attr(String str) {
        if (this.f28651v instanceof Attributes) {
            return super.attr(str);
        }
        return nodeName().equals(str) ? (String) this.f28651v : "";
    }

    @Override // org.jsoup.nodes.Node
    public final Attributes attributes() {
        o();
        return (Attributes) this.f28651v;
    }

    @Override // org.jsoup.nodes.Node
    public String baseUri() {
        if (hasParent()) {
            return parent().baseUri();
        }
        return "";
    }

    @Override // org.jsoup.nodes.Node
    public final Node c(Node node) {
        a aVar = (a) super.c(node);
        Object obj = this.f28651v;
        if (obj instanceof Attributes) {
            aVar.f28651v = ((Attributes) obj).clone();
        }
        return aVar;
    }

    @Override // org.jsoup.nodes.Node
    public int childNodeSize() {
        return 0;
    }

    @Override // org.jsoup.nodes.Node
    public final List<Node> e() {
        return Node.f33995u;
    }

    @Override // org.jsoup.nodes.Node
    public final boolean g() {
        return this.f28651v instanceof Attributes;
    }

    @Override // org.jsoup.nodes.Node
    public boolean hasAttr(String str) {
        o();
        return super.hasAttr(str);
    }

    public final String n() {
        return attr(nodeName());
    }

    public final void o() {
        Object obj = this.f28651v;
        if (!(obj instanceof Attributes)) {
            Attributes attributes = new Attributes();
            this.f28651v = attributes;
            if (obj != null) {
                attributes.put(nodeName(), (String) obj);
            }
        }
    }

    @Override // org.jsoup.nodes.Node
    public Node removeAttr(String str) {
        o();
        return super.removeAttr(str);
    }

    @Override // org.jsoup.nodes.Node
    public Node attr(String str, String str2) {
        if (!(this.f28651v instanceof Attributes) && str.equals(nodeName())) {
            this.f28651v = str2;
        } else {
            o();
            super.attr(str, str2);
        }
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Node empty() {
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public final void d(String str) {
    }
}
