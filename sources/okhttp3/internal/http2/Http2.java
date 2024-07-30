package okhttp3.internal.http2;

import a3.l;
import java.io.IOException;
import okhttp3.internal.Util;
import okio.e;

/* loaded from: classes2.dex */
public final class Http2 {
    static final byte FLAG_ACK = 1;
    static final byte FLAG_COMPRESSED = 32;
    static final byte FLAG_END_HEADERS = 4;
    static final byte FLAG_END_PUSH_PROMISE = 4;
    static final byte FLAG_END_STREAM = 1;
    static final byte FLAG_NONE = 0;
    static final byte FLAG_PADDED = 8;
    static final byte FLAG_PRIORITY = 32;
    static final int INITIAL_MAX_FRAME_SIZE = 16384;
    static final byte TYPE_CONTINUATION = 9;
    static final byte TYPE_DATA = 0;
    static final byte TYPE_GOAWAY = 7;
    static final byte TYPE_HEADERS = 1;
    static final byte TYPE_PING = 6;
    static final byte TYPE_PRIORITY = 2;
    static final byte TYPE_PUSH_PROMISE = 5;
    static final byte TYPE_RST_STREAM = 3;
    static final byte TYPE_SETTINGS = 4;
    static final byte TYPE_WINDOW_UPDATE = 8;
    static final e CONNECTION_PREFACE = e.p("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    static final String[] FLAGS = new String[64];
    static final String[] BINARY = new String[256];

    static {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = BINARY;
            if (i11 >= strArr.length) {
                break;
            }
            strArr[i11] = Util.format("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
            i11++;
        }
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[1 | 8] = l.p(new StringBuilder(), strArr2[1], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = FLAGS;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i14]);
            sb2.append('|');
            strArr3[i15 | 8] = l.p(sb2, strArr3[i13], "|PADDED");
        }
        while (true) {
            String[] strArr4 = FLAGS;
            if (i10 < strArr4.length) {
                if (strArr4[i10] == null) {
                    strArr4[i10] = BINARY[i10];
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private Http2() {
    }

    public static String formatFlags(byte b10, byte b11) {
        String str;
        if (b11 == 0) {
            return "";
        }
        if (b10 != 2 && b10 != 3) {
            if (b10 != 4 && b10 != 6) {
                if (b10 != 7 && b10 != 8) {
                    String[] strArr = FLAGS;
                    if (b11 < strArr.length) {
                        str = strArr[b11];
                    } else {
                        str = BINARY[b11];
                    }
                    if (b10 == 5 && (b11 & 4) != 0) {
                        return str.replace("HEADERS", "PUSH_PROMISE");
                    }
                    if (b10 == 0 && (b11 & 32) != 0) {
                        return str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str;
                }
            } else {
                if (b11 == 1) {
                    return "ACK";
                }
                return BINARY[b11];
            }
        }
        return BINARY[b11];
    }

    public static String frameLog(boolean z10, int i10, int i11, byte b10, byte b11) {
        String format;
        String str;
        String[] strArr = FRAME_NAMES;
        if (b10 < strArr.length) {
            format = strArr[b10];
        } else {
            format = Util.format("0x%02x", Byte.valueOf(b10));
        }
        String formatFlags = formatFlags(b10, b11);
        Object[] objArr = new Object[5];
        if (z10) {
            str = "<<";
        } else {
            str = ">>";
        }
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = Integer.valueOf(i11);
        objArr[3] = format;
        objArr[4] = formatFlags;
        return Util.format("%s 0x%08x %5d %-13s %s", objArr);
    }

    public static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(Util.format(str, objArr));
    }

    public static IOException ioException(String str, Object... objArr) throws IOException {
        throw new IOException(Util.format(str, objArr));
    }
}
