package org.jsoup.nodes;

import com.applovin.exoplayer2.a.x;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.Nullable;
import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.helper.Consumer;
import org.jsoup.helper.Validate;
import org.jsoup.internal.NonnullByDefault;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.QueryParser;
import org.jsoup.select.Selector;
import s.f;

@NonnullByDefault
/* loaded from: classes2.dex */
public class Element extends Node {

    /* renamed from: v, reason: collision with root package name */
    public Tag f33982v;

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    public WeakReference<List<Element>> f33983w;

    /* renamed from: x, reason: collision with root package name */
    public List<Node> f33984x;

    @Nullable
    public Attributes y;

    /* renamed from: z, reason: collision with root package name */
    public static final List<Element> f33981z = Collections.emptyList();
    public static final Pattern A = Pattern.compile("\\s+");
    public static final String B = Attributes.e("baseUri");

    /* loaded from: classes2.dex */
    public class a implements NodeVisitor {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f33985s;

        public a(StringBuilder sb2) {
            this.f33985s = sb2;
        }

        @Override // org.jsoup.select.NodeVisitor
        public final void head(Node node, int i10) {
            boolean z10 = node instanceof TextNode;
            StringBuilder sb2 = this.f33985s;
            if (z10) {
                Element.o(sb2, (TextNode) node);
                return;
            }
            if (node instanceof Element) {
                Element element = (Element) node;
                if (sb2.length() > 0) {
                    if ((element.isBlock() || element.f33982v.normalName().equals("br")) && !TextNode.p(sb2)) {
                        sb2.append(' ');
                    }
                }
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public final void tail(Node node, int i10) {
            if ((node instanceof Element) && ((Element) node).isBlock() && (node.nextSibling() instanceof TextNode)) {
                StringBuilder sb2 = this.f33985s;
                if (!TextNode.p(sb2)) {
                    sb2.append(' ');
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends ChangeNotifyingArrayList<Node> {

        /* renamed from: s, reason: collision with root package name */
        public final Element f33986s;

        public b(Element element, int i10) {
            super(i10);
            this.f33986s = element;
        }

        @Override // org.jsoup.helper.ChangeNotifyingArrayList
        public final void onContentsChanged() {
            this.f33986s.f33983w = null;
        }
    }

    public Element(String str) {
        this(Tag.valueOf(str), "", null);
    }

    public static void n(Element element, Elements elements) {
        Element parent = element.parent();
        if (parent != null && !parent.tagName().equals("#root")) {
            elements.add(parent);
            n(parent, elements);
        }
    }

    public static void o(StringBuilder sb2, TextNode textNode) {
        String wholeText = textNode.getWholeText();
        if (!s(textNode.f33996s) && !(textNode instanceof CDataNode)) {
            StringUtil.appendNormalisedWhitespace(sb2, wholeText, TextNode.p(sb2));
        } else {
            sb2.append(wholeText);
        }
    }

    public static void p(Node node, StringBuilder sb2) {
        if (node instanceof TextNode) {
            sb2.append(((TextNode) node).getWholeText());
        } else if ((node instanceof Element) && ((Element) node).f33982v.normalName().equals("br")) {
            sb2.append("\n");
        }
    }

    public static <E extends Element> int r(Element element, List<E> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10) == element) {
                return i10;
            }
        }
        return 0;
    }

    public static boolean s(@Nullable Node node) {
        if (node instanceof Element) {
            Element element = (Element) node;
            int i10 = 0;
            while (!element.f33982v.preserveWhitespace()) {
                element = element.parent();
                i10++;
                if (i10 < 6 && element != null) {
                }
            }
            return true;
        }
        return false;
    }

    public Element addClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        classNames.add(str);
        classNames(classNames);
        return this;
    }

    public Element append(String str) {
        Validate.notNull(str);
        Node[] nodeArr = (Node[]) org.jsoup.nodes.a.a(this).parseFragmentInput(str, this, baseUri()).toArray(new Node[0]);
        List<Node> e10 = e();
        for (Node node : nodeArr) {
            node.getClass();
            Validate.notNull(this);
            Node node2 = node.f33996s;
            if (node2 != null) {
                node2.l(node);
            }
            node.f33996s = this;
            e10.add(node);
            node.f33997t = e10.size() - 1;
        }
        return this;
    }

    public Element appendChild(Node node) {
        Validate.notNull(node);
        node.getClass();
        Validate.notNull(this);
        Node node2 = node.f33996s;
        if (node2 != null) {
            node2.l(node);
        }
        node.f33996s = this;
        e();
        this.f33984x.add(node);
        node.f33997t = this.f33984x.size() - 1;
        return this;
    }

    public Element appendChildren(Collection<? extends Node> collection) {
        insertChildren(-1, collection);
        return this;
    }

    public Element appendElement(String str) {
        Element element = new Element(Tag.valueOf(str, org.jsoup.nodes.a.a(this).settings()), baseUri());
        appendChild(element);
        return element;
    }

    public Element appendText(String str) {
        Validate.notNull(str);
        appendChild(new TextNode(str));
        return this;
    }

    public Element appendTo(Element element) {
        Validate.notNull(element);
        element.appendChild(this);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Attributes attributes() {
        if (this.y == null) {
            this.y = new Attributes();
        }
        return this.y;
    }

    @Override // org.jsoup.nodes.Node
    public String baseUri() {
        for (Element element = this; element != null; element = element.parent()) {
            Attributes attributes = element.y;
            if (attributes != null) {
                String str = B;
                if (attributes.hasKey(str)) {
                    return element.y.get(str);
                }
            }
        }
        return "";
    }

    @Override // org.jsoup.nodes.Node
    public final Node c(@Nullable Node node) {
        Attributes attributes;
        Element element = (Element) super.c(node);
        Attributes attributes2 = this.y;
        if (attributes2 != null) {
            attributes = attributes2.clone();
        } else {
            attributes = null;
        }
        element.y = attributes;
        b bVar = new b(element, this.f33984x.size());
        element.f33984x = bVar;
        bVar.addAll(this.f33984x);
        return element;
    }

    public Element child(int i10) {
        return q().get(i10);
    }

    @Override // org.jsoup.nodes.Node
    public int childNodeSize() {
        return this.f33984x.size();
    }

    public Elements children() {
        return new Elements(q());
    }

    public int childrenSize() {
        return q().size();
    }

    public String className() {
        return attr("class").trim();
    }

    public Set<String> classNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(A.split(className())));
        linkedHashSet.remove("");
        return linkedHashSet;
    }

    @Nullable
    public Element closest(String str) {
        return closest(QueryParser.parse(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r3.get(0) == r5) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String cssSelector() {
        /*
            r5 = this;
            java.lang.String r0 = r5.id()
            int r0 = r0.length()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "#"
            r0.<init>(r3)
            java.lang.String r3 = r5.id()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            org.jsoup.nodes.Document r3 = r5.ownerDocument()
            if (r3 == 0) goto L34
            org.jsoup.select.Elements r3 = r3.select(r0)
            int r4 = r3.size()
            if (r4 != r2) goto L35
            java.lang.Object r3 = r3.get(r1)
            if (r3 != r5) goto L35
        L34:
            return r0
        L35:
            java.lang.String r0 = r5.tagName()
            r3 = 58
            r4 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = r0.replace(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.util.Set r0 = r5.classNames()
            java.lang.String r4 = "."
            java.lang.String r0 = org.jsoup.internal.StringUtil.join(r0, r4)
            int r4 = r0.length()
            if (r4 <= 0) goto L5e
            r4 = 46
            r3.append(r4)
            r3.append(r0)
        L5e:
            org.jsoup.nodes.Element r0 = r5.parent()
            if (r0 == 0) goto Lb6
            org.jsoup.nodes.Element r0 = r5.parent()
            boolean r0 = r0 instanceof org.jsoup.nodes.Document
            if (r0 == 0) goto L6d
            goto Lb6
        L6d:
            java.lang.String r0 = " > "
            r3.insert(r1, r0)
            org.jsoup.nodes.Element r0 = r5.parent()
            java.lang.String r4 = r3.toString()
            org.jsoup.select.Elements r0 = r0.select(r4)
            int r0 = r0.size()
            if (r0 <= r2) goto L9a
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r4 = r5.elementSiblingIndex()
            int r4 = r4 + r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0[r1] = r2
            java.lang.String r1 = ":nth-child(%d)"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.append(r0)
        L9a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            org.jsoup.nodes.Element r1 = r5.parent()
            java.lang.String r1 = r1.cssSelector()
            r0.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        Lb6:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Element.cssSelector():java.lang.String");
    }

    @Override // org.jsoup.nodes.Node
    public final void d(String str) {
        attributes().put(B, str);
    }

    public String data() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        for (Node node : this.f33984x) {
            if (node instanceof DataNode) {
                borrowBuilder.append(((DataNode) node).getWholeData());
            } else if (node instanceof Comment) {
                borrowBuilder.append(((Comment) node).getData());
            } else if (node instanceof Element) {
                borrowBuilder.append(((Element) node).data());
            } else if (node instanceof CDataNode) {
                borrowBuilder.append(((CDataNode) node).getWholeText());
            }
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public List<DataNode> dataNodes() {
        ArrayList arrayList = new ArrayList();
        for (Node node : this.f33984x) {
            if (node instanceof DataNode) {
                arrayList.add((DataNode) node);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Map<String, String> dataset() {
        return attributes().dataset();
    }

    @Override // org.jsoup.nodes.Node
    public final List<Node> e() {
        if (this.f33984x == Node.f33995u) {
            this.f33984x = new b(this, 4);
        }
        return this.f33984x;
    }

    public int elementSiblingIndex() {
        if (parent() == null) {
            return 0;
        }
        return r(this, parent().q());
    }

    public Range endSourceRange() {
        return Range.a(this, false);
    }

    public Element expectFirst(String str) {
        String str2;
        Element selectFirst = Selector.selectFirst(str, this);
        if (parent() != null) {
            str2 = "No elements matched the query '%s' on element '%s'.";
        } else {
            str2 = "No elements matched the query '%s' in the document.";
        }
        return (Element) Validate.ensureNotNull(selectFirst, str2, str, tagName());
    }

    @Nullable
    public Element firstElementChild() {
        int childNodeSize = childNodeSize();
        if (childNodeSize == 0) {
            return null;
        }
        List<Node> e10 = e();
        for (int i10 = 0; i10 < childNodeSize; i10++) {
            Node node = e10.get(i10);
            if (node instanceof Element) {
                return (Element) node;
            }
        }
        return null;
    }

    public Element firstElementSibling() {
        if (parent() != null) {
            List<Element> q10 = parent().q();
            if (q10.size() > 1) {
                return q10.get(0);
            }
            return this;
        }
        return this;
    }

    public Element forEach(Consumer<? super Element> consumer) {
        Validate.notNull(consumer);
        NodeTraversor.traverse(new x(consumer, 11), this);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node forEachNode(Consumer consumer) {
        return forEachNode((Consumer<? super Node>) consumer);
    }

    @Override // org.jsoup.nodes.Node
    public final boolean g() {
        if (this.y != null) {
            return true;
        }
        return false;
    }

    public Elements getAllElements() {
        return Collector.collect(new Evaluator.AllElements(), this);
    }

    @Nullable
    public Element getElementById(String str) {
        Validate.notEmpty(str);
        Elements collect = Collector.collect(new Evaluator.Id(str), this);
        if (collect.size() > 0) {
            return collect.get(0);
        }
        return null;
    }

    public Elements getElementsByAttribute(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Attribute(str.trim()), this);
    }

    public Elements getElementsByAttributeStarting(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.AttributeStarting(str.trim()), this);
    }

    public Elements getElementsByAttributeValue(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValue(str, str2), this);
    }

    public Elements getElementsByAttributeValueContaining(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueContaining(str, str2), this);
    }

    public Elements getElementsByAttributeValueEnding(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueEnding(str, str2), this);
    }

    public Elements getElementsByAttributeValueMatching(String str, Pattern pattern) {
        return Collector.collect(new Evaluator.AttributeWithValueMatching(str, pattern), this);
    }

    public Elements getElementsByAttributeValueNot(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueNot(str, str2), this);
    }

    public Elements getElementsByAttributeValueStarting(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueStarting(str, str2), this);
    }

    public Elements getElementsByClass(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Class(str), this);
    }

    public Elements getElementsByIndexEquals(int i10) {
        return Collector.collect(new Evaluator.IndexEquals(i10), this);
    }

    public Elements getElementsByIndexGreaterThan(int i10) {
        return Collector.collect(new Evaluator.IndexGreaterThan(i10), this);
    }

    public Elements getElementsByIndexLessThan(int i10) {
        return Collector.collect(new Evaluator.IndexLessThan(i10), this);
    }

    public Elements getElementsByTag(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Tag(Normalizer.normalize(str)), this);
    }

    public Elements getElementsContainingOwnText(String str) {
        return Collector.collect(new Evaluator.ContainsOwnText(str), this);
    }

    public Elements getElementsContainingText(String str) {
        return Collector.collect(new Evaluator.ContainsText(str), this);
    }

    public Elements getElementsMatchingOwnText(Pattern pattern) {
        return Collector.collect(new Evaluator.MatchesOwn(pattern), this);
    }

    public Elements getElementsMatchingText(Pattern pattern) {
        return Collector.collect(new Evaluator.Matches(pattern), this);
    }

    public boolean hasClass(String str) {
        Attributes attributes = this.y;
        if (attributes == null) {
            return false;
        }
        String ignoreCase = attributes.getIgnoreCase("class");
        int length = ignoreCase.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(ignoreCase);
            }
            boolean z10 = false;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (Character.isWhitespace(ignoreCase.charAt(i11))) {
                    if (!z10) {
                        continue;
                    } else {
                        if (i11 - i10 == length2 && ignoreCase.regionMatches(true, i10, str, 0, length2)) {
                            return true;
                        }
                        z10 = false;
                    }
                } else if (!z10) {
                    i10 = i11;
                    z10 = true;
                }
            }
            if (z10 && length - i10 == length2) {
                return ignoreCase.regionMatches(true, i10, str, 0, length2);
            }
        }
        return false;
    }

    public boolean hasText() {
        for (Node node : this.f33984x) {
            if (node instanceof TextNode) {
                if (!((TextNode) node).isBlank()) {
                    return true;
                }
            } else if ((node instanceof Element) && ((Element) node).hasText()) {
                return true;
            }
        }
        return false;
    }

    public String html() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        html((Element) borrowBuilder);
        String releaseBuilder = StringUtil.releaseBuilder(borrowBuilder);
        Document ownerDocument = ownerDocument();
        if (ownerDocument == null) {
            ownerDocument = new Document("");
        }
        return ownerDocument.outputSettings().prettyPrint() ? releaseBuilder.trim() : releaseBuilder;
    }

    @Override // org.jsoup.nodes.Node
    public void i(Appendable appendable, int i10, Document.OutputSettings outputSettings) throws IOException {
        if (t(outputSettings)) {
            if (appendable instanceof StringBuilder) {
                if (((StringBuilder) appendable).length() > 0) {
                    Node.h(appendable, i10, outputSettings);
                }
            } else {
                Node.h(appendable, i10, outputSettings);
            }
        }
        appendable.append('<').append(tagName());
        Attributes attributes = this.y;
        if (attributes != null) {
            attributes.b(appendable, outputSettings);
        }
        if (this.f33984x.isEmpty() && this.f33982v.isSelfClosing()) {
            if (outputSettings.syntax() == Document.OutputSettings.Syntax.html && this.f33982v.isEmpty()) {
                appendable.append('>');
                return;
            } else {
                appendable.append(" />");
                return;
            }
        }
        appendable.append('>');
    }

    public String id() {
        Attributes attributes = this.y;
        return attributes != null ? attributes.getIgnoreCase("id") : "";
    }

    public Element insertChildren(int i10, Collection<? extends Node> collection) {
        Validate.notNull(collection, "Children collection to be inserted must not be null.");
        int childNodeSize = childNodeSize();
        if (i10 < 0) {
            i10 += childNodeSize + 1;
        }
        Validate.isTrue(i10 >= 0 && i10 <= childNodeSize, "Insert position out of bounds.");
        a(i10, (Node[]) new ArrayList(collection).toArray(new Node[0]));
        return this;
    }

    public boolean is(String str) {
        return is(QueryParser.parse(str));
    }

    public boolean isBlock() {
        return this.f33982v.isBlock();
    }

    @Override // org.jsoup.nodes.Node
    public void j(Appendable appendable, int i10, Document.OutputSettings outputSettings) throws IOException {
        if (!this.f33984x.isEmpty() || !this.f33982v.isSelfClosing()) {
            if (outputSettings.prettyPrint() && !this.f33984x.isEmpty() && (this.f33982v.formatAsBlock() || (outputSettings.outline() && (this.f33984x.size() > 1 || (this.f33984x.size() == 1 && (this.f33984x.get(0) instanceof Element)))))) {
                Node.h(appendable, i10, outputSettings);
            }
            appendable.append("</").append(tagName()).append('>');
        }
    }

    @Nullable
    public Element lastElementChild() {
        int childNodeSize = childNodeSize();
        if (childNodeSize == 0) {
            return null;
        }
        List<Node> e10 = e();
        for (int i10 = childNodeSize - 1; i10 >= 0; i10--) {
            Node node = e10.get(i10);
            if (node instanceof Element) {
                return (Element) node;
            }
        }
        return null;
    }

    public Element lastElementSibling() {
        if (parent() != null) {
            List<Element> q10 = parent().q();
            if (q10.size() > 1) {
                return q10.get(q10.size() - 1);
            }
            return this;
        }
        return this;
    }

    @Nullable
    public Element nextElementSibling() {
        if (this.f33996s == null) {
            return null;
        }
        List<Element> q10 = parent().q();
        int r10 = r(this, q10) + 1;
        if (q10.size() <= r10) {
            return null;
        }
        return q10.get(r10);
    }

    public Elements nextElementSiblings() {
        Elements elements = new Elements();
        if (this.f33996s != null) {
            elements.add(this);
            return elements.nextAll();
        }
        return elements;
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return this.f33982v.getName();
    }

    public String normalName() {
        return this.f33982v.normalName();
    }

    public String ownText() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        for (int i10 = 0; i10 < childNodeSize(); i10++) {
            Node node = this.f33984x.get(i10);
            if (node instanceof TextNode) {
                o(borrowBuilder, (TextNode) node);
            } else if ((node instanceof Element) && ((Element) node).f33982v.normalName().equals("br") && !TextNode.p(borrowBuilder)) {
                borrowBuilder.append(" ");
            }
        }
        return StringUtil.releaseBuilder(borrowBuilder).trim();
    }

    public Elements parents() {
        Elements elements = new Elements();
        n(this, elements);
        return elements;
    }

    public Element prepend(String str) {
        Validate.notNull(str);
        a(0, (Node[]) org.jsoup.nodes.a.a(this).parseFragmentInput(str, this, baseUri()).toArray(new Node[0]));
        return this;
    }

    public Element prependChild(Node node) {
        Validate.notNull(node);
        a(0, node);
        return this;
    }

    public Element prependChildren(Collection<? extends Node> collection) {
        insertChildren(0, collection);
        return this;
    }

    public Element prependElement(String str) {
        Element element = new Element(Tag.valueOf(str, org.jsoup.nodes.a.a(this).settings()), baseUri());
        prependChild(element);
        return element;
    }

    public Element prependText(String str) {
        Validate.notNull(str);
        prependChild(new TextNode(str));
        return this;
    }

    @Nullable
    public Element previousElementSibling() {
        List<Element> q10;
        int r10;
        if (this.f33996s == null || (r10 = r(this, (q10 = parent().q()))) <= 0) {
            return null;
        }
        return q10.get(r10 - 1);
    }

    public Elements previousElementSiblings() {
        Elements elements = new Elements();
        if (this.f33996s != null) {
            elements.add(this);
            return elements.prevAll();
        }
        return elements;
    }

    public final List<Element> q() {
        List<Element> list;
        if (childNodeSize() == 0) {
            return f33981z;
        }
        WeakReference<List<Element>> weakReference = this.f33983w;
        if (weakReference == null || (list = weakReference.get()) == null) {
            int size = this.f33984x.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Node node = this.f33984x.get(i10);
                if (node instanceof Element) {
                    arrayList.add((Element) node);
                }
            }
            this.f33983w = new WeakReference<>(arrayList);
            return arrayList;
        }
        return list;
    }

    public Element removeClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        classNames.remove(str);
        classNames(classNames);
        return this;
    }

    public Elements select(String str) {
        return Selector.select(str, this);
    }

    @Nullable
    public Element selectFirst(String str) {
        return Selector.selectFirst(str, this);
    }

    public Elements selectXpath(String str) {
        return new Elements((List<Element>) org.jsoup.nodes.a.b(str, this, Element.class));
    }

    public Elements siblingElements() {
        if (this.f33996s == null) {
            return new Elements(0);
        }
        List<Element> q10 = parent().q();
        Elements elements = new Elements(q10.size() - 1);
        for (Element element : q10) {
            if (element != this) {
                elements.add(element);
            }
        }
        return elements;
    }

    public final boolean t(Document.OutputSettings outputSettings) {
        boolean z10;
        boolean z11;
        if (!outputSettings.prettyPrint()) {
            return false;
        }
        if (!this.f33982v.formatAsBlock() && ((parent() == null || !parent().tag().formatAsBlock()) && !outputSettings.outline())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        if (tag().isInline() && ((parent() == null || parent().isBlock()) && previousSibling() != null && !outputSettings.outline())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return false;
        }
        return true;
    }

    public Tag tag() {
        return this.f33982v;
    }

    public String tagName() {
        return this.f33982v.getName();
    }

    public String text() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        NodeTraversor.traverse(new a(borrowBuilder), this);
        return StringUtil.releaseBuilder(borrowBuilder).trim();
    }

    public List<TextNode> textNodes() {
        ArrayList arrayList = new ArrayList();
        for (Node node : this.f33984x) {
            if (node instanceof TextNode) {
                arrayList.add((TextNode) node);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Element toggleClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        if (classNames.contains(str)) {
            classNames.remove(str);
        } else {
            classNames.add(str);
        }
        classNames(classNames);
        return this;
    }

    public String val() {
        if (normalName().equals("textarea")) {
            return text();
        }
        return attr("value");
    }

    public String wholeOwnText() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        int childNodeSize = childNodeSize();
        for (int i10 = 0; i10 < childNodeSize; i10++) {
            p(this.f33984x.get(i10), borrowBuilder);
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public String wholeText() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        NodeTraversor.traverse(new b0.b(borrowBuilder, 12), this);
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public Element(Tag tag, @Nullable String str, @Nullable Attributes attributes) {
        Validate.notNull(tag);
        this.f33984x = Node.f33995u;
        this.y = attributes;
        this.f33982v = tag;
        if (str != null) {
            setBaseUri(str);
        }
    }

    @Override // org.jsoup.nodes.Node
    public Element attr(String str, String str2) {
        super.attr(str, str2);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element clearAttributes() {
        if (this.y != null) {
            super.clearAttributes();
            this.y = null;
        }
        return this;
    }

    @Nullable
    public Element closest(Evaluator evaluator) {
        Validate.notNull(evaluator);
        Element root = root();
        Element element = this;
        while (!evaluator.matches(root, element)) {
            element = element.parent();
            if (element == null) {
                return null;
            }
        }
        return element;
    }

    @Override // org.jsoup.nodes.Node
    public Element empty() {
        this.f33984x.clear();
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element filter(NodeFilter nodeFilter) {
        return (Element) super.filter(nodeFilter);
    }

    @Override // org.jsoup.nodes.Node
    public Element forEachNode(Consumer<? super Node> consumer) {
        return (Element) super.forEachNode(consumer);
    }

    public Elements getElementsByAttributeValueMatching(String str, String str2) {
        try {
            return getElementsByAttributeValueMatching(str, Pattern.compile(str2));
        } catch (PatternSyntaxException e10) {
            throw new IllegalArgumentException(f.b("Pattern syntax error: ", str2), e10);
        }
    }

    public Elements getElementsMatchingOwnText(String str) {
        try {
            return getElementsMatchingOwnText(Pattern.compile(str));
        } catch (PatternSyntaxException e10) {
            throw new IllegalArgumentException(f.b("Pattern syntax error: ", str), e10);
        }
    }

    public Elements getElementsMatchingText(String str) {
        try {
            return getElementsMatchingText(Pattern.compile(str));
        } catch (PatternSyntaxException e10) {
            throw new IllegalArgumentException(f.b("Pattern syntax error: ", str), e10);
        }
    }

    public Element id(String str) {
        Validate.notNull(str);
        attr("id", str);
        return this;
    }

    public boolean is(Evaluator evaluator) {
        return evaluator.matches(root(), this);
    }

    @Override // org.jsoup.nodes.Node
    @Nullable
    public final Element parent() {
        return (Element) this.f33996s;
    }

    @Override // org.jsoup.nodes.Node
    public Element removeAttr(String str) {
        return (Element) super.removeAttr(str);
    }

    @Override // org.jsoup.nodes.Node
    public Element root() {
        return (Element) super.root();
    }

    public Elements select(Evaluator evaluator) {
        return Selector.select(evaluator, this);
    }

    @Nullable
    public Element selectFirst(Evaluator evaluator) {
        return Collector.findFirst(evaluator, this);
    }

    public <T extends Node> List<T> selectXpath(String str, Class<T> cls) {
        return org.jsoup.nodes.a.b(str, this, cls);
    }

    @Override // org.jsoup.nodes.Node
    public Element shallowClone() {
        Tag tag = this.f33982v;
        String baseUri = baseUri();
        Attributes attributes = this.y;
        return new Element(tag, baseUri, attributes == null ? null : attributes.clone());
    }

    public Element tagName(String str) {
        Validate.notEmptyParam(str, "tagName");
        this.f33982v = Tag.valueOf(str, org.jsoup.nodes.a.a(this).settings());
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element traverse(NodeVisitor nodeVisitor) {
        return (Element) super.traverse(nodeVisitor);
    }

    @Override // org.jsoup.nodes.Node
    public Element wrap(String str) {
        return (Element) super.wrap(str);
    }

    @Override // org.jsoup.nodes.Node
    public Element after(String str) {
        return (Element) super.after(str);
    }

    public Element attr(String str, boolean z10) {
        attributes().put(str, z10);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element before(String str) {
        return (Element) super.before(str);
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: clone */
    public Element mo10clone() {
        return (Element) super.mo10clone();
    }

    @Override // org.jsoup.nodes.Node
    public Element after(Node node) {
        return (Element) super.after(node);
    }

    @Override // org.jsoup.nodes.Node
    public Element before(Node node) {
        return (Element) super.before(node);
    }

    public Element classNames(Set<String> set) {
        Validate.notNull(set);
        if (set.isEmpty()) {
            attributes().remove("class");
        } else {
            attributes().put("class", StringUtil.join(set, " "));
        }
        return this;
    }

    public Element text(String str) {
        Validate.notNull(str);
        empty();
        Document ownerDocument = ownerDocument();
        if (ownerDocument != null && ownerDocument.parser().isContentForTagData(normalName())) {
            appendChild(new DataNode(str));
        } else {
            appendChild(new TextNode(str));
        }
        return this;
    }

    public Element val(String str) {
        if (normalName().equals("textarea")) {
            text(str);
        } else {
            attr("value", str);
        }
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public <T extends Appendable> T html(T t10) {
        int size = this.f33984x.size();
        for (int i10 = 0; i10 < size; i10++) {
            Node node = this.f33984x.get(i10);
            Document ownerDocument = node.ownerDocument();
            if (ownerDocument == null) {
                ownerDocument = new Document("");
            }
            NodeTraversor.traverse(new Node.a(t10, ownerDocument.outputSettings()), node);
        }
        return t10;
    }

    public Element insertChildren(int i10, Node... nodeArr) {
        Validate.notNull(nodeArr, "Children collection to be inserted must not be null.");
        int childNodeSize = childNodeSize();
        if (i10 < 0) {
            i10 += childNodeSize + 1;
        }
        Validate.isTrue(i10 >= 0 && i10 <= childNodeSize, "Insert position out of bounds.");
        a(i10, nodeArr);
        return this;
    }

    public Element(Tag tag, @Nullable String str) {
        this(tag, str, null);
    }

    public Element html(String str) {
        empty();
        append(str);
        return this;
    }
}
