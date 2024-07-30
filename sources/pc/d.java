package pc;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f34497c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f34498d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* renamed from: e, reason: collision with root package name */
    public static String f34499e = "";
    public static String f = "";

    /* renamed from: b, reason: collision with root package name */
    public static HashMap f34496b = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public static HashMap f34495a = new HashMap();

    public static String a(String str) {
        Character valueOf;
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            char[] charArray = str.toCharArray();
            if (charArray != null && charArray.length > 0) {
                char[] cArr = new char[charArray.length];
                for (int i10 = 0; i10 < charArray.length; i10++) {
                    char c10 = charArray[i10];
                    if (f34496b == null) {
                        f34496b = new HashMap();
                        for (int i11 = 0; i11 < f34499e.length(); i11++) {
                            f34496b.put(Character.valueOf(f.charAt(i11)), Character.valueOf(f34499e.charAt(i11)));
                        }
                    }
                    if (f34496b.containsKey(Character.valueOf(c10))) {
                        valueOf = (Character) f34496b.get(Character.valueOf(c10));
                    } else {
                        valueOf = Character.valueOf(c10);
                    }
                    cArr[i10] = valueOf.charValue();
                }
                str2 = new String(cArr);
            }
            return new String(d(str2));
        } catch (Exception e10) {
            e10.printStackTrace();
            return str2;
        }
    }

    public static String b(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            int i11 = i10 + 1;
            int i12 = bArr[i10] & DefaultClassResolver.NAME;
            char[] cArr = f34497c;
            if (i11 == length) {
                stringBuffer.append(cArr[i12 >>> 2]);
                stringBuffer.append(cArr[(i12 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i13 = i11 + 1;
            int i14 = bArr[i11] & DefaultClassResolver.NAME;
            if (i13 == length) {
                stringBuffer.append(cArr[i12 >>> 2]);
                stringBuffer.append(cArr[((i12 & 3) << 4) | ((i14 & 240) >>> 4)]);
                stringBuffer.append(cArr[(i14 & 15) << 2]);
                stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                break;
            }
            int i15 = i13 + 1;
            int i16 = bArr[i13] & DefaultClassResolver.NAME;
            stringBuffer.append(cArr[i12 >>> 2]);
            stringBuffer.append(cArr[((i12 & 3) << 4) | ((i14 & 240) >>> 4)]);
            stringBuffer.append(cArr[((i14 & 15) << 2) | ((i16 & 192) >>> 6)]);
            stringBuffer.append(cArr[i16 & 63]);
            i10 = i15;
        }
        return stringBuffer.toString();
    }

    public static String c(String str) {
        char[] charArray;
        Character valueOf;
        try {
            if (!TextUtils.isEmpty(str) && (charArray = b(str.getBytes()).toCharArray()) != null && charArray.length > 0) {
                char[] cArr = new char[charArray.length];
                for (int i10 = 0; i10 < charArray.length; i10++) {
                    char c10 = charArray[i10];
                    if (f34495a == null) {
                        f34495a = new HashMap();
                        for (int i11 = 0; i11 < f34499e.length(); i11++) {
                            f34495a.put(Character.valueOf(f34499e.charAt(i11)), Character.valueOf(f.charAt(i11)));
                        }
                    }
                    if (f34495a.containsKey(Character.valueOf(c10))) {
                        valueOf = (Character) f34495a.get(Character.valueOf(c10));
                    } else {
                        valueOf = Character.valueOf(c10);
                    }
                    cArr[i10] = valueOf.charValue();
                }
                return new String(cArr);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r6 == (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        r1.write(((r4 & com.applovin.exoplayer2.common.base.Ascii.SI) << 4) | ((r6 & 60) >>> 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r4 = r2 + 1;
        r2 = r9[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r2 != 61) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        r2 = r3[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r4 >= r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r2 == (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (r2 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        r1.write(r2 | ((r6 & 3) << 6));
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0066, code lost:
    
        return r1.toByteArray();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] d(java.lang.String r9) {
        /*
            byte[] r9 = r9.getBytes()
            int r0 = r9.length
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>(r0)
            r2 = 0
        Lb:
            if (r2 >= r0) goto L7c
        Ld:
            byte[] r3 = pc.d.f34498d
            int r4 = r2 + 1
            r2 = r9[r2]
            r2 = r3[r2]
            r5 = -1
            if (r4 >= r0) goto L1d
            if (r2 == r5) goto L1b
            goto L1d
        L1b:
            r2 = r4
            goto Ld
        L1d:
            if (r2 == r5) goto L7c
        L1f:
            int r6 = r4 + 1
            r4 = r9[r4]
            r4 = r3[r4]
            if (r6 >= r0) goto L2c
            if (r4 == r5) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L1f
        L2c:
            if (r4 == r5) goto L7c
            int r2 = r2 << 2
            r7 = r4 & 48
            int r7 = r7 >>> 4
            r2 = r2 | r7
            r1.write(r2)
        L38:
            int r2 = r6 + 1
            r6 = r9[r6]
            r7 = 61
            if (r6 != r7) goto L45
            byte[] r9 = r1.toByteArray()
            return r9
        L45:
            r6 = r3[r6]
            if (r2 >= r0) goto L4e
            if (r6 == r5) goto L4c
            goto L4e
        L4c:
            r6 = r2
            goto L38
        L4e:
            if (r6 == r5) goto L7c
            r4 = r4 & 15
            int r4 = r4 << 4
            r8 = r6 & 60
            int r8 = r8 >>> 2
            r4 = r4 | r8
            r1.write(r4)
        L5c:
            int r4 = r2 + 1
            r2 = r9[r2]
            if (r2 != r7) goto L67
            byte[] r9 = r1.toByteArray()
            return r9
        L67:
            r2 = r3[r2]
            if (r4 >= r0) goto L70
            if (r2 == r5) goto L6e
            goto L70
        L6e:
            r2 = r4
            goto L5c
        L70:
            if (r2 == r5) goto L7c
            r3 = r6 & 3
            int r3 = r3 << 6
            r2 = r2 | r3
            r1.write(r2)
            r2 = r4
            goto Lb
        L7c:
            byte[] r9 = r1.toByteArray()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.d.d(java.lang.String):byte[]");
    }
}
