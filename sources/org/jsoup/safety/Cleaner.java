package org.jsoup.safety;

import java.util.Iterator;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.safety.Safelist;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

/* loaded from: classes2.dex */
public class Cleaner {

    /* renamed from: a, reason: collision with root package name */
    public final Safelist f34167a;

    /* loaded from: classes2.dex */
    public final class a implements NodeVisitor {

        /* renamed from: s, reason: collision with root package name */
        public int f34168s = 0;

        /* renamed from: t, reason: collision with root package name */
        public final Element f34169t;

        /* renamed from: u, reason: collision with root package name */
        public Element f34170u;

        public a(Element element, Element element2) {
            this.f34169t = element;
            this.f34170u = element2;
        }

        @Override // org.jsoup.select.NodeVisitor
        public final void head(Node node, int i10) {
            Safelist safelist;
            boolean z10 = node instanceof Element;
            Cleaner cleaner = Cleaner.this;
            if (z10) {
                Element element = (Element) node;
                if (cleaner.f34167a.f34172a.contains(new Safelist.d(element.normalName()))) {
                    String tagName = element.tagName();
                    Attributes attributes = new Attributes();
                    Element element2 = new Element(Tag.valueOf(tagName), element.baseUri(), attributes);
                    Iterator<Attribute> it = element.attributes().iterator();
                    int i11 = 0;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        safelist = cleaner.f34167a;
                        if (!hasNext) {
                            break;
                        }
                        Attribute next = it.next();
                        if (safelist.b(tagName, element, next)) {
                            attributes.put(next);
                        } else {
                            i11++;
                        }
                    }
                    attributes.addAll(safelist.a(tagName));
                    if (element.sourceRange().isTracked()) {
                        element.sourceRange().track(element2, true);
                    }
                    if (element.endSourceRange().isTracked()) {
                        element.endSourceRange().track(element2, false);
                    }
                    this.f34170u.appendChild(element2);
                    this.f34168s += i11;
                    this.f34170u = element2;
                    return;
                }
                if (node != this.f34169t) {
                    this.f34168s++;
                    return;
                }
                return;
            }
            if (node instanceof TextNode) {
                this.f34170u.appendChild(new TextNode(((TextNode) node).getWholeText()));
                return;
            }
            if (node instanceof DataNode) {
                if (cleaner.f34167a.f34172a.contains(new Safelist.d(node.parent().nodeName()))) {
                    this.f34170u.appendChild(new DataNode(((DataNode) node).getWholeData()));
                    return;
                }
            }
            this.f34168s++;
        }

        @Override // org.jsoup.select.NodeVisitor
        public final void tail(Node node, int i10) {
            if (node instanceof Element) {
                if (Cleaner.this.f34167a.f34172a.contains(new Safelist.d(node.nodeName()))) {
                    this.f34170u = this.f34170u.parent();
                }
            }
        }
    }

    public Cleaner(Safelist safelist) {
        Validate.notNull(safelist);
        this.f34167a = safelist;
    }

    public Document clean(Document document) {
        Validate.notNull(document);
        Document createShell = Document.createShell(document.baseUri());
        Element body = document.body();
        NodeTraversor.traverse(new a(body, createShell.body()), body);
        createShell.outputSettings(document.outputSettings().clone());
        return createShell;
    }

    public boolean isValid(Document document) {
        Validate.notNull(document);
        Document createShell = Document.createShell(document.baseUri());
        Element body = document.body();
        a aVar = new a(body, createShell.body());
        NodeTraversor.traverse(aVar, body);
        if (aVar.f34168s == 0 && document.head().childNodes().isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isValidBodyHtml(String str) {
        Document createShell = Document.createShell("");
        Document createShell2 = Document.createShell("");
        ParseErrorList tracking = ParseErrorList.tracking(1);
        createShell2.body().insertChildren(0, Parser.parseFragment(str, createShell2.body(), "", tracking));
        Element body = createShell2.body();
        a aVar = new a(body, createShell.body());
        NodeTraversor.traverse(aVar, body);
        if (aVar.f34168s == 0 && tracking.isEmpty()) {
            return true;
        }
        return false;
    }
}
