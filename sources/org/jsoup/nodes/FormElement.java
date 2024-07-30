package org.jsoup.nodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

/* loaded from: classes2.dex */
public class FormElement extends Element {
    public final Elements C;

    public FormElement(Tag tag, String str, Attributes attributes) {
        super(tag, str, attributes);
        this.C = new Elements();
    }

    public FormElement addElement(Element element) {
        this.C.add(element);
        return this;
    }

    public Elements elements() {
        return this.C;
    }

    public List<Connection.KeyVal> formData() {
        Element selectFirst;
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<Element> it = this.C.iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next.tag().isFormSubmittable() && !next.hasAttr("disabled")) {
                String attr = next.attr("name");
                if (attr.length() != 0) {
                    String attr2 = next.attr("type");
                    if (!attr2.equalsIgnoreCase("button")) {
                        if ("select".equals(next.normalName())) {
                            Iterator<Element> it2 = next.select("option[selected]").iterator();
                            boolean z10 = false;
                            while (it2.hasNext()) {
                                arrayList.add(HttpConnection.KeyVal.create(attr, it2.next().val()));
                                z10 = true;
                            }
                            if (!z10 && (selectFirst = next.selectFirst("option")) != null) {
                                arrayList.add(HttpConnection.KeyVal.create(attr, selectFirst.val()));
                            }
                        } else if (!"checkbox".equalsIgnoreCase(attr2) && !"radio".equalsIgnoreCase(attr2)) {
                            arrayList.add(HttpConnection.KeyVal.create(attr, next.val()));
                        } else if (next.hasAttr("checked")) {
                            if (next.val().length() > 0) {
                                str = next.val();
                            } else {
                                str = "on";
                            }
                            arrayList.add(HttpConnection.KeyVal.create(attr, str));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // org.jsoup.nodes.Node
    public final void l(Node node) {
        super.l(node);
        this.C.remove(node);
    }

    public Connection submit() {
        String baseUri;
        Connection.Method method;
        Connection newSession;
        if (hasAttr("action")) {
            baseUri = absUrl("action");
        } else {
            baseUri = baseUri();
        }
        Validate.notEmpty(baseUri, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        if (attr("method").equalsIgnoreCase("POST")) {
            method = Connection.Method.POST;
        } else {
            method = Connection.Method.GET;
        }
        Document ownerDocument = ownerDocument();
        if (ownerDocument != null) {
            newSession = ownerDocument.connection().newRequest();
        } else {
            newSession = Jsoup.newSession();
        }
        return newSession.url(baseUri).data(formData()).method(method);
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    /* renamed from: clone */
    public FormElement mo10clone() {
        return (FormElement) super.mo10clone();
    }
}
