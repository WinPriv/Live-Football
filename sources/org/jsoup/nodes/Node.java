package org.jsoup.nodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;
import org.jsoup.SerializationException;
import org.jsoup.helper.Consumer;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import q0.d;

/* loaded from: classes2.dex */
public abstract class Node implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    public static final List<Node> f33995u = Collections.emptyList();

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public Node f33996s;

    /* renamed from: t, reason: collision with root package name */
    public int f33997t;

    /* loaded from: classes2.dex */
    public static class a implements NodeVisitor {

        /* renamed from: s, reason: collision with root package name */
        public final Appendable f33998s;

        /* renamed from: t, reason: collision with root package name */
        public final Document.OutputSettings f33999t;

        public a(Appendable appendable, Document.OutputSettings outputSettings) {
            this.f33998s = appendable;
            this.f33999t = outputSettings;
            outputSettings.a();
        }

        @Override // org.jsoup.select.NodeVisitor
        public final void head(Node node, int i10) {
            try {
                node.i(this.f33998s, i10, this.f33999t);
            } catch (IOException e10) {
                throw new SerializationException(e10);
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public final void tail(Node node, int i10) {
            if (!node.nodeName().equals("#text")) {
                try {
                    node.j(this.f33998s, i10, this.f33999t);
                } catch (IOException e10) {
                    throw new SerializationException(e10);
                }
            }
        }
    }

    public static Element f(Element element) {
        Elements children = element.children();
        if (children.size() > 0) {
            return f(children.get(0));
        }
        return element;
    }

    public static void h(Appendable appendable, int i10, Document.OutputSettings outputSettings) throws IOException {
        appendable.append('\n').append(StringUtil.padding(outputSettings.indentAmount() * i10, outputSettings.maxPaddingWidth()));
    }

    public final void a(int i10, Node... nodeArr) {
        boolean z10;
        boolean z11;
        Validate.notNull(nodeArr);
        if (nodeArr.length == 0) {
            return;
        }
        List<Node> e10 = e();
        Node parent = nodeArr[0].parent();
        if (parent != null && parent.childNodeSize() == nodeArr.length) {
            List<Node> e11 = parent.e();
            int length = nodeArr.length;
            while (true) {
                int i11 = length - 1;
                z10 = true;
                if (length > 0) {
                    if (nodeArr[i11] != e11.get(i11)) {
                        z11 = false;
                        break;
                    }
                    length = i11;
                } else {
                    z11 = true;
                    break;
                }
            }
            if (z11) {
                if (childNodeSize() != 0) {
                    z10 = false;
                }
                parent.empty();
                e10.addAll(i10, Arrays.asList(nodeArr));
                int length2 = nodeArr.length;
                while (true) {
                    int i12 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    nodeArr[i12].f33996s = this;
                    length2 = i12;
                }
                if (!z10 || nodeArr[0].f33997t != 0) {
                    k(i10);
                    return;
                }
                return;
            }
        }
        Validate.noNullElements(nodeArr);
        for (Node node : nodeArr) {
            node.getClass();
            Validate.notNull(this);
            Node node2 = node.f33996s;
            if (node2 != null) {
                node2.l(node);
            }
            node.f33996s = this;
        }
        e10.addAll(i10, Arrays.asList(nodeArr));
        k(i10);
    }

    public String absUrl(String str) {
        Validate.notEmpty(str);
        if (g() && attributes().hasKeyIgnoreCase(str)) {
            return StringUtil.resolve(baseUri(), attributes().getIgnoreCase(str));
        }
        return "";
    }

    public Node after(String str) {
        b(this.f33997t + 1, str);
        return this;
    }

    public String attr(String str) {
        Validate.notNull(str);
        if (!g()) {
            return "";
        }
        String ignoreCase = attributes().getIgnoreCase(str);
        return ignoreCase.length() > 0 ? ignoreCase : str.startsWith("abs:") ? absUrl(str.substring(4)) : "";
    }

    public abstract Attributes attributes();

    public int attributesSize() {
        if (g()) {
            return attributes().size();
        }
        return 0;
    }

    public final void b(int i10, String str) {
        Element element;
        Validate.notNull(str);
        Validate.notNull(this.f33996s);
        if (parent() instanceof Element) {
            element = (Element) parent();
        } else {
            element = null;
        }
        this.f33996s.a(i10, (Node[]) org.jsoup.nodes.a.a(this).parseFragmentInput(str, element, baseUri()).toArray(new Node[0]));
    }

    public abstract String baseUri();

    public Node before(String str) {
        b(this.f33997t, str);
        return this;
    }

    public Node c(@Nullable Node node) {
        int i10;
        Document ownerDocument;
        try {
            Node node2 = (Node) super.clone();
            node2.f33996s = node;
            if (node == null) {
                i10 = 0;
            } else {
                i10 = this.f33997t;
            }
            node2.f33997t = i10;
            if (node == null && !(this instanceof Document) && (ownerDocument = ownerDocument()) != null) {
                Document shallowClone = ownerDocument.shallowClone();
                node2.f33996s = shallowClone;
                shallowClone.e().add(node2);
            }
            return node2;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Node childNode(int i10) {
        return e().get(i10);
    }

    public abstract int childNodeSize();

    public List<Node> childNodes() {
        if (childNodeSize() == 0) {
            return f33995u;
        }
        List<Node> e10 = e();
        ArrayList arrayList = new ArrayList(e10.size());
        arrayList.addAll(e10);
        return Collections.unmodifiableList(arrayList);
    }

    public List<Node> childNodesCopy() {
        List<Node> e10 = e();
        ArrayList arrayList = new ArrayList(e10.size());
        Iterator<Node> it = e10.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo10clone());
        }
        return arrayList;
    }

    public Node clearAttributes() {
        if (g()) {
            Iterator<Attribute> it = attributes().iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
        return this;
    }

    public abstract void d(String str);

    public abstract List<Node> e();

    public abstract Node empty();

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public Node filter(NodeFilter nodeFilter) {
        Validate.notNull(nodeFilter);
        NodeTraversor.filter(nodeFilter, this);
        return this;
    }

    @Nullable
    public Node firstChild() {
        if (childNodeSize() == 0) {
            return null;
        }
        return e().get(0);
    }

    public Node forEachNode(Consumer<? super Node> consumer) {
        Validate.notNull(consumer);
        NodeTraversor.traverse(new d(consumer, 15), this);
        return this;
    }

    public abstract boolean g();

    public boolean hasAttr(String str) {
        Validate.notNull(str);
        if (!g()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (attributes().hasKeyIgnoreCase(substring) && !absUrl(substring).isEmpty()) {
                return true;
            }
        }
        return attributes().hasKeyIgnoreCase(str);
    }

    public boolean hasParent() {
        if (this.f33996s != null) {
            return true;
        }
        return false;
    }

    public boolean hasSameValue(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return outerHtml().equals(((Node) obj).outerHtml());
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public <T extends Appendable> T html(T t10) {
        Document ownerDocument = ownerDocument();
        if (ownerDocument == null) {
            ownerDocument = new Document("");
        }
        NodeTraversor.traverse(new a(t10, ownerDocument.outputSettings()), this);
        return t10;
    }

    public abstract void i(Appendable appendable, int i10, Document.OutputSettings outputSettings) throws IOException;

    public abstract void j(Appendable appendable, int i10, Document.OutputSettings outputSettings) throws IOException;

    public final void k(int i10) {
        int childNodeSize = childNodeSize();
        if (childNodeSize == 0) {
            return;
        }
        List<Node> e10 = e();
        while (i10 < childNodeSize) {
            e10.get(i10).f33997t = i10;
            i10++;
        }
    }

    public void l(Node node) {
        boolean z10;
        if (node.f33996s == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        Validate.isTrue(z10);
        int i10 = node.f33997t;
        e().remove(i10);
        k(i10);
        node.f33996s = null;
    }

    @Nullable
    public Node lastChild() {
        int childNodeSize = childNodeSize();
        if (childNodeSize == 0) {
            return null;
        }
        return e().get(childNodeSize - 1);
    }

    public final void m(Node node, Node node2) {
        boolean z10;
        if (node.f33996s == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        Validate.isTrue(z10);
        Validate.notNull(node2);
        Node node3 = node2.f33996s;
        if (node3 != null) {
            node3.l(node2);
        }
        int i10 = node.f33997t;
        e().set(i10, node2);
        node2.f33996s = this;
        node2.f33997t = i10;
        node.f33996s = null;
    }

    @Nullable
    public Node nextSibling() {
        Node node = this.f33996s;
        if (node == null) {
            return null;
        }
        List<Node> e10 = node.e();
        int i10 = this.f33997t + 1;
        if (e10.size() <= i10) {
            return null;
        }
        return e10.get(i10);
    }

    public abstract String nodeName();

    public String outerHtml() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        Document ownerDocument = ownerDocument();
        if (ownerDocument == null) {
            ownerDocument = new Document("");
        }
        NodeTraversor.traverse(new a(borrowBuilder, ownerDocument.outputSettings()), this);
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    @Nullable
    public Document ownerDocument() {
        Node root = root();
        if (root instanceof Document) {
            return (Document) root;
        }
        return null;
    }

    @Nullable
    public Node parent() {
        return this.f33996s;
    }

    @Nullable
    public final Node parentNode() {
        return this.f33996s;
    }

    @Nullable
    public Node previousSibling() {
        Node node = this.f33996s;
        if (node == null || this.f33997t <= 0) {
            return null;
        }
        return node.e().get(this.f33997t - 1);
    }

    public void remove() {
        Validate.notNull(this.f33996s);
        this.f33996s.l(this);
    }

    public Node removeAttr(String str) {
        Validate.notNull(str);
        if (g()) {
            attributes().removeIgnoreCase(str);
        }
        return this;
    }

    public void replaceWith(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.f33996s);
        this.f33996s.m(this, node);
    }

    public Node root() {
        Node node = this;
        while (true) {
            Node node2 = node.f33996s;
            if (node2 != null) {
                node = node2;
            } else {
                return node;
            }
        }
    }

    public void setBaseUri(String str) {
        Validate.notNull(str);
        d(str);
    }

    public Node shallowClone() {
        return c(null);
    }

    public int siblingIndex() {
        return this.f33997t;
    }

    public List<Node> siblingNodes() {
        Node node = this.f33996s;
        if (node == null) {
            return Collections.emptyList();
        }
        List<Node> e10 = node.e();
        ArrayList arrayList = new ArrayList(e10.size() - 1);
        for (Node node2 : e10) {
            if (node2 != this) {
                arrayList.add(node2);
            }
        }
        return arrayList;
    }

    public Range sourceRange() {
        return Range.a(this, true);
    }

    public String toString() {
        return outerHtml();
    }

    public Node traverse(NodeVisitor nodeVisitor) {
        Validate.notNull(nodeVisitor);
        NodeTraversor.traverse(nodeVisitor, this);
        return this;
    }

    @Nullable
    public Node unwrap() {
        Validate.notNull(this.f33996s);
        Node firstChild = firstChild();
        this.f33996s.a(this.f33997t, (Node[]) e().toArray(new Node[0]));
        remove();
        return firstChild;
    }

    public Node wrap(String str) {
        Element element;
        Validate.notEmpty(str);
        Node node = this.f33996s;
        if (node != null && (node instanceof Element)) {
            element = (Element) node;
        } else if (this instanceof Element) {
            element = (Element) this;
        } else {
            element = null;
        }
        List<Node> parseFragmentInput = org.jsoup.nodes.a.a(this).parseFragmentInput(str, element, baseUri());
        Node node2 = parseFragmentInput.get(0);
        if (!(node2 instanceof Element)) {
            return this;
        }
        Element element2 = (Element) node2;
        Element f = f(element2);
        Node node3 = this.f33996s;
        if (node3 != null) {
            node3.m(this, element2);
        }
        List<Node> e10 = f.e();
        Node node4 = new Node[]{this}[0];
        node4.getClass();
        Validate.notNull(f);
        Node node5 = node4.f33996s;
        if (node5 != null) {
            node5.l(node4);
        }
        node4.f33996s = f;
        e10.add(node4);
        node4.f33997t = e10.size() - 1;
        if (parseFragmentInput.size() > 0) {
            for (int i10 = 0; i10 < parseFragmentInput.size(); i10++) {
                Node node6 = parseFragmentInput.get(i10);
                if (element2 != node6) {
                    Node node7 = node6.f33996s;
                    if (node7 != null) {
                        node7.l(node6);
                    }
                    element2.after(node6);
                }
            }
        }
        return this;
    }

    public Node after(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.f33996s);
        this.f33996s.a(this.f33997t + 1, node);
        return this;
    }

    public Node before(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.f33996s);
        this.f33996s.a(this.f33997t, node);
        return this;
    }

    @Override // 
    /* renamed from: clone */
    public Node mo10clone() {
        Node c10 = c(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(c10);
        while (!linkedList.isEmpty()) {
            Node node = (Node) linkedList.remove();
            int childNodeSize = node.childNodeSize();
            for (int i10 = 0; i10 < childNodeSize; i10++) {
                List<Node> e10 = node.e();
                Node c11 = e10.get(i10).c(node);
                e10.set(i10, c11);
                linkedList.add(c11);
            }
        }
        return c10;
    }

    public Node attr(String str, String str2) {
        attributes().g(org.jsoup.nodes.a.a(this).settings().normalizeAttribute(str), str2);
        return this;
    }
}
