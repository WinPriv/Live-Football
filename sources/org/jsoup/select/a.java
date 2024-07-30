package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Collector;

/* compiled from: StructuralEvaluator.java */
/* loaded from: classes2.dex */
public abstract class a extends Evaluator {

    /* renamed from: a, reason: collision with root package name */
    public Evaluator f34215a;

    /* compiled from: StructuralEvaluator.java */
    /* renamed from: org.jsoup.select.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0456a extends a {

        /* renamed from: b, reason: collision with root package name */
        public final Collector.b f34216b;

        public C0456a(Evaluator evaluator) {
            this.f34215a = evaluator;
            this.f34216b = new Collector.b(evaluator);
        }

        @Override // org.jsoup.select.Evaluator
        public final boolean matches(Element element, Element element2) {
            for (int i10 = 0; i10 < element2.childNodeSize(); i10++) {
                Node childNode = element2.childNode(i10);
                if (childNode instanceof Element) {
                    Collector.b bVar = this.f34216b;
                    bVar.f34181a = element2;
                    bVar.f34182b = null;
                    NodeTraversor.filter(bVar, (Element) childNode);
                    if (bVar.f34182b != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final String toString() {
            return String.format(":has(%s)", this.f34215a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    /* loaded from: classes2.dex */
    public static class b extends a {
        public b(Evaluator evaluator) {
            this.f34215a = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        public final boolean matches(Element element, Element element2) {
            Element parent;
            if (element == element2 || (parent = element2.parent()) == null || !this.f34215a.matches(element, parent)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return String.format("%s > ", this.f34215a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    /* loaded from: classes2.dex */
    public static class c extends a {
        public c(Evaluator evaluator) {
            this.f34215a = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        public final boolean matches(Element element, Element element2) {
            Element previousElementSibling;
            if (element == element2 || (previousElementSibling = element2.previousElementSibling()) == null || !this.f34215a.matches(element, previousElementSibling)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return String.format("%s + ", this.f34215a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    /* loaded from: classes2.dex */
    public static class d extends a {
        public d(Evaluator evaluator) {
            this.f34215a = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        public final boolean matches(Element element, Element element2) {
            return !this.f34215a.matches(element, element2);
        }

        public final String toString() {
            return String.format(":not(%s)", this.f34215a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    /* loaded from: classes2.dex */
    public static class e extends a {
        public e(Evaluator evaluator) {
            this.f34215a = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        public final boolean matches(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            for (Element parent = element2.parent(); parent != null; parent = parent.parent()) {
                if (this.f34215a.matches(element, parent)) {
                    return true;
                }
                if (parent == element) {
                    break;
                }
            }
            return false;
        }

        public final String toString() {
            return String.format("%s ", this.f34215a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    /* loaded from: classes2.dex */
    public static class f extends a {
        public f(Evaluator evaluator) {
            this.f34215a = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        public final boolean matches(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            for (Element previousElementSibling = element2.previousElementSibling(); previousElementSibling != null; previousElementSibling = previousElementSibling.previousElementSibling()) {
                if (this.f34215a.matches(element, previousElementSibling)) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return String.format("%s ~ ", this.f34215a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    /* loaded from: classes2.dex */
    public static class g extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public final boolean matches(Element element, Element element2) {
            if (element == element2) {
                return true;
            }
            return false;
        }
    }
}
