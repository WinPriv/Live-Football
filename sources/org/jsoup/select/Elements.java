package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

/* loaded from: classes2.dex */
public class Elements extends ArrayList<Element> {
    public Elements() {
    }

    public final ArrayList a(Class cls) {
        ArrayList arrayList = new ArrayList();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            for (int i10 = 0; i10 < next.childNodeSize(); i10++) {
                Node childNode = next.childNode(i10);
                if (cls.isInstance(childNode)) {
                    arrayList.add((Node) cls.cast(childNode));
                }
            }
        }
        return arrayList;
    }

    public Elements addClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().addClass(str);
        }
        return this;
    }

    public Elements after(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().after(str);
        }
        return this;
    }

    public Elements append(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().append(str);
        }
        return this;
    }

    public String attr(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next.hasAttr(str)) {
                return next.attr(str);
            }
        }
        return "";
    }

    public final Elements b(@Nullable String str, boolean z10, boolean z11) {
        Evaluator evaluator;
        Elements elements = new Elements();
        if (str != null) {
            evaluator = QueryParser.parse(str);
        } else {
            evaluator = null;
        }
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            do {
                if (z10) {
                    next = next.nextElementSibling();
                } else {
                    next = next.previousElementSibling();
                }
                if (next != null) {
                    if (evaluator == null) {
                        elements.add(next);
                    } else if (next.is(evaluator)) {
                        elements.add(next);
                    }
                }
            } while (z11);
        }
        return elements;
    }

    public Elements before(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().before(str);
        }
        return this;
    }

    public List<Comment> comments() {
        return a(Comment.class);
    }

    public List<DataNode> dataNodes() {
        return a(DataNode.class);
    }

    public List<String> eachAttr(String str) {
        ArrayList arrayList = new ArrayList(size());
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next.hasAttr(str)) {
                arrayList.add(next.attr(str));
            }
        }
        return arrayList;
    }

    public List<String> eachText() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next.hasText()) {
                arrayList.add(next.text());
            }
        }
        return arrayList;
    }

    public Elements empty() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().empty();
        }
        return this;
    }

    public Elements eq(int i10) {
        if (size() > i10) {
            return new Elements(get(i10));
        }
        return new Elements();
    }

    public Elements filter(NodeFilter nodeFilter) {
        NodeTraversor.filter(nodeFilter, this);
        return this;
    }

    @Nullable
    public Element first() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public List<FormElement> forms() {
        ArrayList arrayList = new ArrayList();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next instanceof FormElement) {
                arrayList.add((FormElement) next);
            }
        }
        return arrayList;
    }

    public boolean hasAttr(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            if (it.next().hasAttr(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            if (it.next().hasClass(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasText() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            if (it.next().hasText()) {
                return true;
            }
        }
        return false;
    }

    public String html() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (borrowBuilder.length() != 0) {
                borrowBuilder.append("\n");
            }
            borrowBuilder.append(next.html());
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public boolean is(String str) {
        Evaluator parse = QueryParser.parse(str);
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            if (it.next().is(parse)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Element last() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    public Elements next() {
        return b(null, true, false);
    }

    public Elements nextAll() {
        return b(null, true, true);
    }

    public Elements not(String str) {
        boolean z10;
        Elements select = Selector.select(str, this);
        Elements elements = new Elements();
        for (Element element : this) {
            Iterator<Element> it = select.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (element.equals(it.next())) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                elements.add(element);
            }
        }
        return elements;
    }

    public String outerHtml() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (borrowBuilder.length() != 0) {
                borrowBuilder.append("\n");
            }
            borrowBuilder.append(next.outerHtml());
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public Elements parents() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(it.next().parents());
        }
        return new Elements(linkedHashSet);
    }

    public Elements prepend(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().prepend(str);
        }
        return this;
    }

    public Elements prev() {
        return b(null, false, false);
    }

    public Elements prevAll() {
        return b(null, false, true);
    }

    public Elements remove() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
        return this;
    }

    public Elements removeAttr(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().removeAttr(str);
        }
        return this;
    }

    public Elements removeClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().removeClass(str);
        }
        return this;
    }

    public Elements select(String str) {
        return Selector.select(str, this);
    }

    public Elements tagName(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().tagName(str);
        }
        return this;
    }

    public String text() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (borrowBuilder.length() != 0) {
                borrowBuilder.append(" ");
            }
            borrowBuilder.append(next.text());
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public List<TextNode> textNodes() {
        return a(TextNode.class);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return outerHtml();
    }

    public Elements toggleClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().toggleClass(str);
        }
        return this;
    }

    public Elements traverse(NodeVisitor nodeVisitor) {
        NodeTraversor.traverse(nodeVisitor, this);
        return this;
    }

    public Elements unwrap() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().unwrap();
        }
        return this;
    }

    public String val() {
        return size() > 0 ? first().val() : "";
    }

    public Elements wrap(String str) {
        Validate.notEmpty(str);
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().wrap(str);
        }
        return this;
    }

    public Elements(int i10) {
        super(i10);
    }

    @Override // java.util.ArrayList
    public Elements clone() {
        Elements elements = new Elements(size());
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            elements.add(it.next().mo10clone());
        }
        return elements;
    }

    public Elements next(String str) {
        return b(str, true, false);
    }

    public Elements nextAll(String str) {
        return b(str, true, true);
    }

    public Elements prev(String str) {
        return b(str, false, false);
    }

    public Elements prevAll(String str) {
        return b(str, false, true);
    }

    public Elements(Collection<Element> collection) {
        super(collection);
    }

    public Elements val(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().val(str);
        }
        return this;
    }

    public Elements(List<Element> list) {
        super(list);
    }

    public Elements attr(String str, String str2) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().attr(str, str2);
        }
        return this;
    }

    public Elements(Element... elementArr) {
        super(Arrays.asList(elementArr));
    }

    public Elements html(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().html(str);
        }
        return this;
    }
}
