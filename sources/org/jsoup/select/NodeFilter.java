package org.jsoup.select;

import org.jsoup.nodes.Node;

/* loaded from: classes2.dex */
public interface NodeFilter {

    /* loaded from: classes2.dex */
    public enum FilterResult {
        CONTINUE,
        SKIP_CHILDREN,
        SKIP_ENTIRELY,
        REMOVE,
        STOP
    }

    FilterResult head(Node node, int i10);

    default FilterResult tail(Node node, int i10) {
        return FilterResult.CONTINUE;
    }
}
