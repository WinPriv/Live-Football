package org.jsoup.helper;

import a3.l;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import javax.annotation.Nullable;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.Selector;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes2.dex */
public class W3CDom {
    public static final String SourceProperty = "jsoupSource";
    public static final String XPathFactoryProperty = "javax.xml.xpath.XPathFactory:jsoup";

    /* renamed from: a, reason: collision with root package name */
    public final DocumentBuilderFactory f33932a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33933b = true;

    /* loaded from: classes2.dex */
    public static class W3CBuilder implements NodeVisitor {

        /* renamed from: s, reason: collision with root package name */
        public final Document f33934s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f33935t = true;

        /* renamed from: u, reason: collision with root package name */
        public final Stack<HashMap<String, String>> f33936u;

        /* renamed from: v, reason: collision with root package name */
        public Node f33937v;

        /* renamed from: w, reason: collision with root package name */
        public Document.OutputSettings.Syntax f33938w;

        /* renamed from: x, reason: collision with root package name */
        @Nullable
        public final Element f33939x;

        public W3CBuilder(org.w3c.dom.Document document) {
            Stack<HashMap<String, String>> stack = new Stack<>();
            this.f33936u = stack;
            this.f33938w = Document.OutputSettings.Syntax.xml;
            this.f33934s = document;
            stack.push(new HashMap<>());
            this.f33937v = document;
            this.f33939x = (Element) document.getUserData("jsoupContextSource");
        }

        public final void a(Node node, org.jsoup.nodes.Node node2) {
            node.setUserData(W3CDom.SourceProperty, node2, null);
            this.f33937v.appendChild(node);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[Catch: DOMException -> 0x00ce, TryCatch #0 {DOMException -> 0x00ce, blocks: (B:48:0x0086, B:50:0x008e, B:27:0x0097, B:28:0x009f, B:30:0x00a5, B:33:0x00b7, B:38:0x00bf, B:40:0x00c6, B:41:0x00cb, B:26:0x0093), top: B:47:0x0086 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c6 A[Catch: DOMException -> 0x00ce, TryCatch #0 {DOMException -> 0x00ce, blocks: (B:48:0x0086, B:50:0x008e, B:27:0x0097, B:28:0x009f, B:30:0x00a5, B:33:0x00b7, B:38:0x00bf, B:40:0x00c6, B:41:0x00cb, B:26:0x0093), top: B:47:0x0086 }] */
        @Override // org.jsoup.select.NodeVisitor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void head(org.jsoup.nodes.Node r8, int r9) {
            /*
                Method dump skipped, instructions count: 287
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.W3CDom.W3CBuilder.head(org.jsoup.nodes.Node, int):void");
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(org.jsoup.nodes.Node node, int i10) {
            if ((node instanceof Element) && (this.f33937v.getParentNode() instanceof org.w3c.dom.Element)) {
                this.f33937v = this.f33937v.getParentNode();
            }
            this.f33936u.pop();
        }
    }

    public W3CDom() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        this.f33932a = newInstance;
        newInstance.setNamespaceAware(true);
    }

    public static HashMap<String, String> OutputHtml() {
        return l.t("method", "html");
    }

    public static HashMap<String, String> OutputXml() {
        return l.t("method", "xml");
    }

    public static String asString(org.w3c.dom.Document document, @Nullable Map<String, String> map) {
        try {
            DOMSource dOMSource = new DOMSource(document);
            StringWriter stringWriter = new StringWriter();
            StreamResult streamResult = new StreamResult(stringWriter);
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            if (map != null) {
                Properties properties = new Properties();
                properties.putAll(map);
                newTransformer.setOutputProperties(properties);
            }
            if (document.getDoctype() != null) {
                DocumentType doctype = document.getDoctype();
                if (!StringUtil.isBlank(doctype.getPublicId())) {
                    newTransformer.setOutputProperty("doctype-public", doctype.getPublicId());
                }
                if (!StringUtil.isBlank(doctype.getSystemId())) {
                    newTransformer.setOutputProperty("doctype-system", doctype.getSystemId());
                } else if (doctype.getName().equalsIgnoreCase("html") && StringUtil.isBlank(doctype.getPublicId()) && StringUtil.isBlank(doctype.getSystemId())) {
                    newTransformer.setOutputProperty("doctype-system", "about:legacy-compat");
                }
            }
            newTransformer.transform(dOMSource, streamResult);
            return stringWriter.toString();
        } catch (TransformerException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static org.w3c.dom.Document convert(org.jsoup.nodes.Document document) {
        return new W3CDom().fromJsoup(document);
    }

    public Node contextNode(org.w3c.dom.Document document) {
        return (Node) document.getUserData("jsoupContextNode");
    }

    public org.w3c.dom.Document fromJsoup(org.jsoup.nodes.Document document) {
        return fromJsoup((Element) document);
    }

    public boolean namespaceAware() {
        return this.f33933b;
    }

    public NodeList selectXpath(String str, org.w3c.dom.Document document) {
        return selectXpath(str, (Node) document);
    }

    public <T extends org.jsoup.nodes.Node> List<T> sourceNodes(NodeList nodeList, Class<T> cls) {
        Validate.notNull(nodeList);
        Validate.notNull(cls);
        ArrayList arrayList = new ArrayList(nodeList.getLength());
        for (int i10 = 0; i10 < nodeList.getLength(); i10++) {
            Object userData = nodeList.item(i10).getUserData(SourceProperty);
            if (cls.isInstance(userData)) {
                arrayList.add(cls.cast(userData));
            }
        }
        return arrayList;
    }

    public void convert(org.jsoup.nodes.Document document, org.w3c.dom.Document document2) {
        convert((Element) document, document2);
    }

    public org.w3c.dom.Document fromJsoup(Element element) {
        Validate.notNull(element);
        try {
            DocumentBuilder newDocumentBuilder = this.f33932a.newDocumentBuilder();
            DOMImplementation dOMImplementation = newDocumentBuilder.getDOMImplementation();
            org.w3c.dom.Document newDocument = newDocumentBuilder.newDocument();
            org.jsoup.nodes.Document ownerDocument = element.ownerDocument();
            org.jsoup.nodes.DocumentType documentType = ownerDocument != null ? ownerDocument.documentType() : null;
            if (documentType != null) {
                newDocument.appendChild(dOMImplementation.createDocumentType(documentType.name(), documentType.publicId(), documentType.systemId()));
            }
            newDocument.setXmlStandalone(true);
            newDocument.setUserData("jsoupContextSource", element instanceof org.jsoup.nodes.Document ? element.child(0) : element, null);
            if (ownerDocument != null) {
                element = ownerDocument;
            }
            convert(element, newDocument);
            return newDocument;
        } catch (ParserConfigurationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public W3CDom namespaceAware(boolean z10) {
        this.f33933b = z10;
        this.f33932a.setNamespaceAware(z10);
        return this;
    }

    public NodeList selectXpath(String str, Node node) {
        XPathFactory newInstance;
        Validate.notEmptyParam(str, "xpath");
        Validate.notNullParam(node, "contextNode");
        try {
            if (System.getProperty(XPathFactoryProperty) != null) {
                newInstance = XPathFactory.newInstance("jsoup");
            } else {
                newInstance = XPathFactory.newInstance();
            }
            NodeList nodeList = (NodeList) newInstance.newXPath().compile(str).evaluate(node, XPathConstants.NODESET);
            Validate.notNull(nodeList);
            return nodeList;
        } catch (XPathExpressionException | XPathFactoryConfigurationException e10) {
            throw new Selector.SelectorParseException("Could not evaluate XPath query [%s]: %s", str, e10.getMessage());
        }
    }

    public void convert(Element element, org.w3c.dom.Document document) {
        W3CBuilder w3CBuilder = new W3CBuilder(document);
        w3CBuilder.f33935t = this.f33933b;
        org.jsoup.nodes.Document ownerDocument = element.ownerDocument();
        if (ownerDocument != null) {
            if (!StringUtil.isBlank(ownerDocument.location())) {
                document.setDocumentURI(ownerDocument.location());
            }
            w3CBuilder.f33938w = ownerDocument.outputSettings().syntax();
        }
        if (element instanceof org.jsoup.nodes.Document) {
            element = element.child(0);
        }
        NodeTraversor.traverse(w3CBuilder, element);
    }

    public String asString(org.w3c.dom.Document document) {
        return asString(document, null);
    }
}
