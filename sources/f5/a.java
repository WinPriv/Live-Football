package f5;

import c5.e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import i7.c;
import i7.g;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: IcyDecoder.java */
/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f28108x = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: v, reason: collision with root package name */
    public final CharsetDecoder f28109v = c.f29202c.newDecoder();

    /* renamed from: w, reason: collision with root package name */
    public final CharsetDecoder f28110w = c.f29201b.newDecoder();

    @Override // c5.e
    public final Metadata g(c5.c cVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f28110w;
        CharsetDecoder charsetDecoder2 = this.f28109v;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f28108x.matcher(str);
        String str3 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String c10 = g.c(group);
                c10.getClass();
                if (!c10.equals("streamurl")) {
                    if (c10.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str2, str3));
    }
}
