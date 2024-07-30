package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.ai;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k {
    public static void a(boolean z10, String str) throws ai {
        if (!z10) {
            throw ai.b(str, null);
        }
    }

    public static boolean b(i iVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            iVar.b(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static int a(i iVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int c10 = iVar.c(bArr, i10 + i12, i11 - i12);
            if (c10 == -1) {
                break;
            }
            i12 += c10;
        }
        return i12;
    }

    public static boolean a(i iVar, int i10) throws IOException {
        try {
            iVar.b(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean a(i iVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return iVar.b(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }
}
