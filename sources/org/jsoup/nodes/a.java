package org.jsoup.nodes;

import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.helper.W3CDom;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.Parser;

/* compiled from: NodeUtils.java */
/* loaded from: classes2.dex */
public final class a {
    public static Parser a(Node node) {
        Document ownerDocument = node.ownerDocument();
        if (ownerDocument != null && ownerDocument.parser() != null) {
            return ownerDocument.parser();
        }
        return new Parser(new HtmlTreeBuilder());
    }

    public static <T extends Node> List<T> b(String str, Element element, Class<T> cls) {
        Validate.notEmpty(str);
        Validate.notNull(element);
        Validate.notNull(cls);
        W3CDom namespaceAware = new W3CDom().namespaceAware(false);
        return namespaceAware.sourceNodes(namespaceAware.selectXpath(str, namespaceAware.contextNode(namespaceAware.fromJsoup(element))), cls);
    }
}
