package okhttp3.internal.ws;

import a3.l;
import okio.b;
import okio.e;

/* loaded from: classes2.dex */
public final class WebSocketProtocol {
    static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    static final int B0_FLAG_FIN = 128;
    static final int B0_FLAG_RSV1 = 64;
    static final int B0_FLAG_RSV2 = 32;
    static final int B0_FLAG_RSV3 = 16;
    static final int B0_MASK_OPCODE = 15;
    static final int B1_FLAG_MASK = 128;
    static final int B1_MASK_LENGTH = 127;
    static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    static final long CLOSE_MESSAGE_MAX = 123;
    static final int CLOSE_NO_STATUS_CODE = 1005;
    static final int OPCODE_BINARY = 2;
    static final int OPCODE_CONTINUATION = 0;
    static final int OPCODE_CONTROL_CLOSE = 8;
    static final int OPCODE_CONTROL_PING = 9;
    static final int OPCODE_CONTROL_PONG = 10;
    static final int OPCODE_FLAG_CONTROL = 8;
    static final int OPCODE_TEXT = 1;
    static final long PAYLOAD_BYTE_MAX = 125;
    static final int PAYLOAD_LONG = 127;
    static final int PAYLOAD_SHORT = 126;
    static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
        throw new AssertionError("No instances.");
    }

    public static String acceptHeader(String str) {
        return e.p(str + ACCEPT_MAGIC).o("SHA-1").k();
    }

    public static String closeCodeExceptionMessage(int i10) {
        if (i10 >= 1000 && i10 < 5000) {
            if ((i10 >= 1004 && i10 <= 1006) || (i10 >= 1012 && i10 <= 2999)) {
                return l.j("Code ", i10, " is reserved and may not be used.");
            }
            return null;
        }
        return l.i("Code must be in range [1000,5000): ", i10);
    }

    public static void toggleMask(b.C0452b c0452b, byte[] bArr) {
        int b10;
        int length = bArr.length;
        int i10 = 0;
        do {
            byte[] bArr2 = c0452b.f33830w;
            int i11 = c0452b.f33831x;
            int i12 = c0452b.y;
            while (i11 < i12) {
                int i13 = i10 % length;
                bArr2[i11] = (byte) (bArr2[i11] ^ bArr[i13]);
                i11++;
                i10 = i13 + 1;
            }
            long j10 = c0452b.f33829v;
            if (j10 != c0452b.f33826s.f33824t) {
                if (j10 == -1) {
                    b10 = c0452b.b(0L);
                } else {
                    b10 = c0452b.b(j10 + (c0452b.y - c0452b.f33831x));
                }
            } else {
                throw new IllegalStateException();
            }
        } while (b10 != -1);
    }

    public static void validateCloseCode(int i10) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i10);
        if (closeCodeExceptionMessage == null) {
        } else {
            throw new IllegalArgumentException(closeCodeExceptionMessage);
        }
    }
}
