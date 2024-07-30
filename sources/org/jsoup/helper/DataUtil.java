package org.jsoup.helper;

import com.anythink.expressad.exoplayer.b;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.annotation.WillClose;
import org.jsoup.UncheckedIOException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;

/* loaded from: classes2.dex */
public final class DataUtil {
    public static final Charset UTF_8;

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f33892a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");

    /* renamed from: b, reason: collision with root package name */
    public static final String f33893b;

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f33894c;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f33895a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f33896b;

        public a(String str, boolean z10) {
            this.f33895a = str;
            this.f33896b = z10;
        }
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        UTF_8 = forName;
        f33893b = forName.name();
        f33894c = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }

    @Nullable
    public static a a(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        byte[] bArr = new byte[4];
        if (byteBuffer.remaining() >= 4) {
            byteBuffer.get(bArr);
            byteBuffer.rewind();
        }
        byte b10 = bArr[0];
        if ((b10 == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (b10 == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            return new a("UTF-32", false);
        }
        if ((b10 == -2 && bArr[1] == -1) || (b10 == -1 && bArr[1] == -2)) {
            return new a(b.f7303k, false);
        }
        if (b10 == -17 && bArr[1] == -69 && bArr[2] == -65) {
            return new a("UTF-8", true);
        }
        return null;
    }

    @Nullable
    public static String b(@Nullable String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f33892a.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return e(matcher.group(1).trim().replace("charset=", ""));
    }

    public static String c() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        Random random = new Random();
        for (int i10 = 0; i10 < 32; i10++) {
            char[] cArr = f33894c;
            borrowBuilder.append(cArr[random.nextInt(cArr.length)]);
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public static Document d(@Nullable @WillClose InputStream inputStream, @Nullable String str, String str2, Parser parser) throws IOException {
        boolean z10;
        String str3;
        Document parseInput;
        XmlDeclaration xmlDeclaration;
        Charset forName;
        if (inputStream == null) {
            return new Document(str2);
        }
        boolean z11 = false;
        ConstrainableInputStream wrap = ConstrainableInputStream.wrap(inputStream, 32768, 0);
        try {
            wrap.mark(32768);
            ByteBuffer readToByteBuffer = readToByteBuffer(wrap, 5119);
            if (wrap.read() == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            wrap.reset();
            a a10 = a(readToByteBuffer);
            if (a10 != null) {
                str3 = a10.f33895a;
            } else {
                str3 = str;
            }
            String str4 = f33893b;
            Document document = null;
            if (str3 == null) {
                try {
                    CharBuffer decode = UTF_8.decode(readToByteBuffer);
                    if (decode.hasArray()) {
                        parseInput = parser.parseInput(new CharArrayReader(decode.array(), decode.arrayOffset(), decode.limit()), str2);
                    } else {
                        parseInput = parser.parseInput(decode.toString(), str2);
                    }
                    Iterator<Element> it = parseInput.select("meta[http-equiv=content-type], meta[charset]").iterator();
                    String str5 = null;
                    while (it.hasNext()) {
                        Element next = it.next();
                        if (next.hasAttr("http-equiv")) {
                            str5 = b(next.attr("content"));
                        }
                        if (str5 == null && next.hasAttr("charset")) {
                            str5 = next.attr("charset");
                        }
                        if (str5 != null) {
                            break;
                        }
                    }
                    if (str5 == null && parseInput.childNodeSize() > 0) {
                        Node childNode = parseInput.childNode(0);
                        if (childNode instanceof XmlDeclaration) {
                            xmlDeclaration = (XmlDeclaration) childNode;
                        } else {
                            if (childNode instanceof Comment) {
                                Comment comment = (Comment) childNode;
                                if (comment.isXmlDeclaration()) {
                                    xmlDeclaration = comment.asXmlDeclaration();
                                }
                            }
                            xmlDeclaration = null;
                        }
                        if (xmlDeclaration != null && xmlDeclaration.name().equalsIgnoreCase("xml")) {
                            str5 = xmlDeclaration.attr("encoding");
                        }
                    }
                    String e10 = e(str5);
                    if (e10 != null && !e10.equalsIgnoreCase(str4)) {
                        str3 = e10.trim().replaceAll("[\"']", "");
                    } else if (z10) {
                        document = parseInput;
                    }
                } catch (UncheckedIOException e11) {
                    throw e11.ioException();
                }
            } else {
                Validate.notEmpty(str3, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
            }
            if (document == null) {
                if (str3 == null) {
                    str3 = str4;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(wrap, Charset.forName(str3)), 32768);
                if (a10 != null) {
                    try {
                        if (a10.f33896b) {
                            if (bufferedReader.skip(1L) == 1) {
                                z11 = true;
                            }
                            Validate.isTrue(z11);
                        }
                    } finally {
                        bufferedReader.close();
                    }
                }
                try {
                    document = parser.parseInput(bufferedReader, str2);
                    if (str3.equals(str4)) {
                        forName = UTF_8;
                    } else {
                        forName = Charset.forName(str3);
                    }
                    document.outputSettings().charset(forName);
                    if (!forName.canEncode()) {
                        document.charset(UTF_8);
                    }
                } catch (UncheckedIOException e12) {
                    throw e12.ioException();
                }
            }
            return document;
        } finally {
            wrap.close();
        }
    }

    @Nullable
    public static String e(@Nullable String str) {
        if (str != null && str.length() != 0) {
            String replaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(replaceAll)) {
                    return replaceAll;
                }
                String upperCase = replaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }

    public static Document load(File file, @Nullable String str, String str2) throws IOException {
        return load(file, str, str2, Parser.htmlParser());
    }

    public static ByteBuffer readToByteBuffer(InputStream inputStream, int i10) throws IOException {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Validate.isTrue(z10, "maxSize must be 0 (unlimited) or larger");
        return ConstrainableInputStream.wrap(inputStream, 32768, i10).readToByteBuffer(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.jsoup.nodes.Document load(java.io.File r3, @javax.annotation.Nullable java.lang.String r4, java.lang.String r5, org.jsoup.parser.Parser r6) throws java.io.IOException {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.lang.String r1 = r3.getName()
            java.lang.String r1 = org.jsoup.internal.Normalizer.lowerCase(r1)
            java.lang.String r2 = ".gz"
            boolean r2 = r1.endsWith(r2)
            if (r2 != 0) goto L1d
            java.lang.String r2 = ".z"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L45
        L1d:
            int r1 = r0.read()     // Catch: java.lang.Throwable -> L4a
            r2 = 31
            if (r1 != r2) goto L2f
            int r1 = r0.read()     // Catch: java.lang.Throwable -> L4a
            r2 = 139(0x8b, float:1.95E-43)
            if (r1 != r2) goto L2f
            r1 = 1
            goto L30
        L2f:
            r1 = 0
        L30:
            r0.close()
            if (r1 == 0) goto L40
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r3)
            r0.<init>(r1)
            goto L45
        L40:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
        L45:
            org.jsoup.nodes.Document r3 = d(r0, r4, r5, r6)
            return r3
        L4a:
            r3 = move-exception
            r0.close()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.DataUtil.load(java.io.File, java.lang.String, java.lang.String, org.jsoup.parser.Parser):org.jsoup.nodes.Document");
    }

    public static Document load(@WillClose InputStream inputStream, @Nullable String str, String str2) throws IOException {
        return d(inputStream, str, str2, Parser.htmlParser());
    }

    public static Document load(@WillClose InputStream inputStream, @Nullable String str, String str2, Parser parser) throws IOException {
        return d(inputStream, str, str2, parser);
    }
}
