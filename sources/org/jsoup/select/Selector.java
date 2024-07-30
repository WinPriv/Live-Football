package org.jsoup.select;

import java.util.IdentityHashMap;
import java.util.Iterator;
import javax.annotation.Nullable;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;

/* loaded from: classes2.dex */
public class Selector {

    /* loaded from: classes2.dex */
    public static class SelectorParseException extends IllegalStateException {
        public SelectorParseException(String str) {
            super(str);
        }

        public SelectorParseException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    public static Elements select(String str, Element element) {
        Validate.notEmpty(str);
        return select(QueryParser.parse(str), element);
    }

    @Nullable
    public static Element selectFirst(String str, Element element) {
        Validate.notEmpty(str);
        return Collector.findFirst(QueryParser.parse(str), element);
    }

    public static Elements select(Evaluator evaluator, Element element) {
        Validate.notNull(evaluator);
        Validate.notNull(element);
        return Collector.collect(evaluator, element);
    }

    public static Elements select(String str, Iterable<Element> iterable) {
        Validate.notEmpty(str);
        Validate.notNull(iterable);
        Evaluator parse = QueryParser.parse(str);
        Elements elements = new Elements();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator<Element> it = iterable.iterator();
        while (it.hasNext()) {
            Iterator<Element> it2 = select(parse, it.next()).iterator();
            while (it2.hasNext()) {
                Element next = it2.next();
                if (identityHashMap.put(next, Boolean.TRUE) == null) {
                    elements.add(next);
                }
            }
        }
        return elements;
    }
}
