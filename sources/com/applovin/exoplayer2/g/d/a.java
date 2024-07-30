package com.applovin.exoplayer2.g.d;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.g.d;
import com.applovin.exoplayer2.g.g;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f15123a = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f15124b = Charsets.UTF_8.newDecoder();

    /* renamed from: c, reason: collision with root package name */
    private final CharsetDecoder f15125c = Charsets.ISO_8859_1.newDecoder();

    @Override // com.applovin.exoplayer2.g.g
    public com.applovin.exoplayer2.g.a a(d dVar, ByteBuffer byteBuffer) {
        String a10 = a(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (a10 == null) {
            return new com.applovin.exoplayer2.g.a(new c(bArr, null, null));
        }
        Matcher matcher = f15123a.matcher(a10);
        String str2 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String lowerCase = Ascii.toLowerCase(group);
                lowerCase.getClass();
                if (lowerCase.equals("streamurl")) {
                    str2 = group2;
                } else if (lowerCase.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new com.applovin.exoplayer2.g.a(new c(bArr, str, str2));
    }

    private String a(ByteBuffer byteBuffer) {
        try {
            return this.f15124b.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.f15125c.decode(byteBuffer).toString();
                this.f15125c.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.f15125c.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.f15125c.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f15124b.reset();
            byteBuffer.rewind();
        }
    }
}
