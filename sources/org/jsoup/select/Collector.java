package org.jsoup.select;

import javax.annotation.Nullable;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeFilter;

/* loaded from: classes2.dex */
public class Collector {

    /* loaded from: classes2.dex */
    public static class b implements NodeFilter {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public Element f34181a = null;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public Element f34182b = null;

        /* renamed from: c, reason: collision with root package name */
        public final Evaluator f34183c;

        public b(Evaluator evaluator) {
            this.f34183c = evaluator;
        }

        @Override // org.jsoup.select.NodeFilter
        public final NodeFilter.FilterResult head(Node node, int i10) {
            if (node instanceof Element) {
                Element element = (Element) node;
                if (this.f34183c.matches(this.f34181a, element)) {
                    this.f34182b = element;
                    return NodeFilter.FilterResult.STOP;
                }
            }
            return NodeFilter.FilterResult.CONTINUE;
        }

        @Override // org.jsoup.select.NodeFilter
        public final NodeFilter.FilterResult tail(Node node, int i10) {
            return NodeFilter.FilterResult.CONTINUE;
        }
    }

    public static Elements collect(Evaluator evaluator, Element element) {
        Elements elements = new Elements();
        NodeTraversor.traverse(new a(element, elements, evaluator), element);
        return elements;
    }

    @Nullable
    public static Element findFirst(Evaluator evaluator, Element element) {
        b bVar = new b(evaluator);
        bVar.f34181a = element;
        bVar.f34182b = null;
        NodeTraversor.filter(bVar, element);
        return bVar.f34182b;
    }

    /* loaded from: classes2.dex */
    public static class a implements NodeVisitor {

        /* renamed from: s, reason: collision with root package name */
        public final Element f34178s;

        /* renamed from: t, reason: collision with root package name */
        public final Elements f34179t;

        /* renamed from: u, reason: collision with root package name */
        public final Evaluator f34180u;

        public a(Element element, Elements elements, Evaluator evaluator) {
            this.f34178s = element;
            this.f34179t = elements;
            this.f34180u = evaluator;
        }

        @Override // org.jsoup.select.NodeVisitor
        public final void head(Node node, int i10) {
            if (node instanceof Element) {
                Element element = (Element) node;
                if (this.f34180u.matches(this.f34178s, element)) {
                    this.f34179t.add(element);
                }
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public final void tail(Node node, int i10) {
        }
    }
}
