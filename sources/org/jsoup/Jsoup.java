package org.jsoup;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.annotation.Nullable;
import javax.annotation.WillClose;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Safelist;

/* loaded from: classes2.dex */
public class Jsoup {
    public static String clean(String str, String str2, Safelist safelist) {
        return new Cleaner(safelist).clean(parseBodyFragment(str, str2)).body().html();
    }

    public static Connection connect(String str) {
        return HttpConnection.connect(str);
    }

    public static boolean isValid(String str, Safelist safelist) {
        return new Cleaner(safelist).isValidBodyHtml(str);
    }

    public static Connection newSession() {
        return new HttpConnection();
    }

    public static Document parse(String str, String str2) {
        return Parser.parse(str, str2);
    }

    public static Document parseBodyFragment(String str, String str2) {
        return Parser.parseBodyFragment(str, str2);
    }

    public static Document parse(String str, String str2, Parser parser) {
        return parser.parseInput(str, str2);
    }

    public static Document parseBodyFragment(String str) {
        return Parser.parseBodyFragment(str, "");
    }

    public static Document parse(String str, Parser parser) {
        return parser.parseInput(str, "");
    }

    public static Document parse(String str) {
        return Parser.parse(str, "");
    }

    public static String clean(String str, Safelist safelist) {
        return clean(str, "", safelist);
    }

    public static Document parse(File file, @Nullable String str, String str2) throws IOException {
        return DataUtil.load(file, str, str2);
    }

    public static String clean(String str, String str2, Safelist safelist, Document.OutputSettings outputSettings) {
        Document clean = new Cleaner(safelist).clean(parseBodyFragment(str, str2));
        clean.outputSettings(outputSettings);
        return clean.body().html();
    }

    public static Document parse(File file, @Nullable String str) throws IOException {
        return DataUtil.load(file, str, file.getAbsolutePath());
    }

    public static Document parse(File file) throws IOException {
        return DataUtil.load(file, (String) null, file.getAbsolutePath());
    }

    public static Document parse(File file, @Nullable String str, String str2, Parser parser) throws IOException {
        return DataUtil.load(file, str, str2, parser);
    }

    public static Document parse(@WillClose InputStream inputStream, @Nullable String str, String str2) throws IOException {
        return DataUtil.load(inputStream, str, str2);
    }

    public static Document parse(InputStream inputStream, @Nullable String str, String str2, Parser parser) throws IOException {
        return DataUtil.load(inputStream, str, str2, parser);
    }

    public static Document parse(URL url, int i10) throws IOException {
        Connection connect = HttpConnection.connect(url);
        connect.timeout(i10);
        return connect.get();
    }
}
