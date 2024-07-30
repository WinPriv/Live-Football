package com.applovin.impl.sdk.utils;

import android.util.Xml;
import com.applovin.impl.sdk.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final y f19545a;

    /* renamed from: b, reason: collision with root package name */
    private Stack<a> f19546b;

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f19547c;

    /* renamed from: d, reason: collision with root package name */
    private long f19548d;

    /* renamed from: e, reason: collision with root package name */
    private a f19549e;

    /* loaded from: classes.dex */
    public static class a extends t {
        public a(String str, Map<String, String> map, t tVar) {
            super(str, map, tVar);
        }

        public void a(t tVar) {
            if (tVar != null) {
                this.f19542c.add(tVar);
                return;
            }
            throw new IllegalArgumentException("None specified.");
        }

        public void d(String str) {
            this.f19541b = str;
        }
    }

    public u(com.applovin.impl.sdk.p pVar) {
        if (pVar != null) {
            this.f19545a = pVar.L();
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public static t a(String str, com.applovin.impl.sdk.p pVar) throws SAXException {
        return new u(pVar).a(str);
    }

    public t a(String str) throws SAXException {
        if (str != null) {
            this.f19547c = new StringBuilder();
            this.f19546b = new Stack<>();
            this.f19549e = null;
            Xml.parse(str, new ContentHandler() { // from class: com.applovin.impl.sdk.utils.u.1
                @Override // org.xml.sax.ContentHandler
                public void characters(char[] cArr, int i10, int i11) {
                    String trim = new String(Arrays.copyOfRange(cArr, i10, i11)).trim();
                    if (StringUtils.isValidString(trim)) {
                        u.this.f19547c.append(trim);
                    }
                }

                @Override // org.xml.sax.ContentHandler
                public void endDocument() {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - u.this.f19548d;
                    y unused = u.this.f19545a;
                    if (y.a()) {
                        u.this.f19545a.b("XmlParser", a3.l.k("Finished parsing in ", seconds, " seconds"));
                    }
                }

                @Override // org.xml.sax.ContentHandler
                public void endElement(String str2, String str3, String str4) {
                    u uVar = u.this;
                    uVar.f19549e = (a) uVar.f19546b.pop();
                    u.this.f19549e.d(u.this.f19547c.toString().trim());
                    u.this.f19547c.setLength(0);
                }

                @Override // org.xml.sax.ContentHandler
                public void startDocument() {
                    y unused = u.this.f19545a;
                    if (y.a()) {
                        u.this.f19545a.b("XmlParser", "Begin parsing...");
                    }
                    u.this.f19548d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                }

                @Override // org.xml.sax.ContentHandler
                public void startElement(String str2, String str3, String str4, Attributes attributes) throws SAXException {
                    a aVar;
                    try {
                        if (!u.this.f19546b.isEmpty()) {
                            aVar = (a) u.this.f19546b.peek();
                        } else {
                            aVar = null;
                        }
                        a aVar2 = new a(str3, u.this.a(attributes), aVar);
                        if (aVar != null) {
                            aVar.a(aVar2);
                        }
                        u.this.f19546b.push(aVar2);
                    } catch (Exception e10) {
                        y unused = u.this.f19545a;
                        if (y.a()) {
                            u.this.f19545a.b("XmlParser", a3.k.l("Unable to process element <", str3, ">"), e10);
                        }
                        throw new SAXException("Failed to start element", e10);
                    }
                }

                @Override // org.xml.sax.ContentHandler
                public void endPrefixMapping(String str2) {
                }

                @Override // org.xml.sax.ContentHandler
                public void setDocumentLocator(Locator locator) {
                }

                @Override // org.xml.sax.ContentHandler
                public void skippedEntity(String str2) {
                }

                @Override // org.xml.sax.ContentHandler
                public void processingInstruction(String str2, String str3) {
                }

                @Override // org.xml.sax.ContentHandler
                public void startPrefixMapping(String str2, String str3) {
                }

                @Override // org.xml.sax.ContentHandler
                public void ignorableWhitespace(char[] cArr, int i10, int i11) {
                }
            });
            a aVar = this.f19549e;
            if (aVar != null) {
                return aVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            Map<String, String> map = CollectionUtils.map(length);
            for (int i10 = 0; i10 < length; i10++) {
                map.put(attributes.getQName(i10), attributes.getValue(i10));
            }
            return map;
        }
        return Collections.emptyMap();
    }
}
