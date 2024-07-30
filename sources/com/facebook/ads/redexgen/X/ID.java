package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.huawei.openalliance.ad.constant.w;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class ID {
    public static ID A01;
    public static byte[] A02;
    public static String[] A03 = {"lby1W0wNbQrJZLPqMH4DTOw3yxUdqdf", "kgmV30Pytio8Y45c0SmevPSfJ", "GuqAlZnTPhAyqf6xpABukX78gW1eK", "0NViSQPmvGXLcgxETt4LuQqf8msO5qX", "Lug9XUXTwCkms8e17b8k", "9KOEFfUvG6glq1MfonBkT6Lvp1EWxJyS", "tUrZTe4M4NOwFWRIXhIm4QJOvCAxV", "2InOXM9Ds0dFubkAVSo31GYyY3vE8A8q"};
    public static final String[] A04;
    public static final String[] A05;
    public final SharedPreferences A00;

    public static String A0Q(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "rwxiKY1yX8M1uCycGOqUPfCL86zZ3gS";
            strArr[0] = "P38LhqS18Cw18aUWRDVsuYtPAT7MPJu";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 46);
            i13++;
        }
    }

    public static void A0b() {
        A02 = new byte[]{108, 73, 107, 100, 105, 111, 102, 82, 126, Ascii.DEL, 101, 120, Ascii.DEL, 100, 116, 3, 47, 46, 52, 41, 46, 53, 37, Ascii.DEL, 106, 92, 70, 19, 68, 90, 95, 95, 19, 81, 86, 19, 71, 82, 88, 86, 93, 19, 71, 92, 19, 82, 93, 92, 71, 91, 86, 65, 19, 87, 86, 64, 71, 90, 93, 82, 71, 90, 92, 93, Ascii.GS, 6, 17, Ascii.EM, 8, 112, 109, 112, 109, 0, 45, 58, 50, 35, 91, 71, 91, 71, 70, 70, 70, 43, 123, 108, 100, 117, 125, Ascii.FF, 10, 121, 123, 123, 113, 124, 125, 118, 108, 121, 116, 71, 123, 116, 113, 123, 115, 107, 71, 123, 119, 118, 126, 113, Ascii.DEL, 34, 32, 32, 42, 39, 38, 45, 55, 34, 47, Ascii.FS, 32, 47, 42, 32, 40, 48, Ascii.FS, 32, 44, 45, 37, 42, 36, 109, 55, 52, 44, Ascii.FS, 48, 55, 38, 51, Ascii.FS, 32, 34, 45, 32, 38, 47, Ascii.FS, 33, 54, 55, 55, 44, 45, Ascii.FS, 55, 38, 59, 55, Ascii.EM, Ascii.ESC, Ascii.ESC, 17, Ascii.FS, Ascii.GS, Ascii.SYN, Ascii.FF, Ascii.EM, Ascii.DC4, 39, Ascii.ESC, Ascii.DC4, 17, Ascii.ESC, 19, Ascii.VT, 39, Ascii.ESC, Ascii.ETB, Ascii.SYN, Ascii.RS, 17, Ascii.US, 86, Ascii.FF, Ascii.SI, Ascii.ETB, 39, Ascii.VT, Ascii.FF, Ascii.GS, 8, 39, Ascii.ESC, Ascii.ETB, Ascii.SYN, Ascii.RS, 17, 10, Ascii.NAK, 39, Ascii.SUB, Ascii.CR, Ascii.FF, Ascii.FF, Ascii.ETB, Ascii.SYN, 39, Ascii.FF, Ascii.GS, 0, Ascii.FF, 3, 1, 1, Ascii.VT, 6, 7, Ascii.FF, Ascii.SYN, 3, Ascii.SO, 61, 1, Ascii.SO, Ascii.VT, 1, 9, 17, 61, 1, Ascii.CR, Ascii.FF, 4, Ascii.VT, 5, 76, Ascii.SYN, Ascii.NAK, Ascii.CR, 61, 17, Ascii.SYN, 7, Ascii.DC2, 61, 1, Ascii.CR, Ascii.FF, 4, Ascii.VT, Ascii.DLE, Ascii.SI, 3, Ascii.SYN, Ascii.VT, Ascii.CR, Ascii.FF, 68, 70, 70, 76, 65, 64, 75, 81, 68, 73, 122, 70, 73, 76, 70, 78, 86, 122, 70, 74, 75, 67, 76, 66, Ascii.VT, 81, 82, 74, 122, 86, 81, 64, 85, 122, 70, 74, 75, 67, 76, 87, 72, 68, 81, 76, 74, 75, 122, 71, 74, 65, 92, Ascii.RS, Ascii.FS, Ascii.FS, Ascii.SYN, Ascii.ESC, Ascii.SUB, 17, Ascii.VT, Ascii.RS, 19, 32, Ascii.FS, 19, Ascii.SYN, Ascii.FS, Ascii.DC4, Ascii.FF, 32, Ascii.FS, Ascii.DLE, 17, Ascii.EM, Ascii.SYN, Ascii.CAN, 81, Ascii.VT, 8, Ascii.DLE, 32, Ascii.FF, Ascii.VT, Ascii.SUB, Ascii.SI, 32, Ascii.FS, Ascii.DLE, 17, Ascii.EM, Ascii.SYN, Ascii.CR, Ascii.DC2, Ascii.RS, Ascii.VT, Ascii.SYN, Ascii.DLE, 17, 32, Ascii.VT, Ascii.SYN, Ascii.VT, 19, Ascii.SUB, 100, 97, 107, 114, 90, 100, 102, 102, 96, 117, 113, 100, 103, 105, 96, 90, 118, 113, 100, 102, 110, 113, 119, 100, 102, 96, 90, 102, 106, 107, 113, 96, 125, 113, 90, 99, 108, 105, 113, 96, 119, 90, 118, 108, Ascii.DEL, 96, Ascii.ETB, Ascii.DC2, Ascii.CAN, 1, 41, Ascii.ETB, Ascii.NAK, Ascii.NAK, 19, 6, 2, Ascii.ETB, Ascii.DC4, Ascii.SUB, 19, 41, 5, 2, Ascii.ETB, Ascii.NAK, Ascii.GS, 2, 4, Ascii.ETB, Ascii.NAK, 19, 41, Ascii.SUB, 19, Ascii.CAN, 17, 2, Ascii.RS, 63, 58, 48, 41, 1, 63, 48, 58, 44, 49, 55, 58, 1, 63, 50, 50, 49, 41, 1, 50, 49, 63, 58, 1, 58, 43, 44, 55, 48, 57, 1, 45, 54, 49, 41, 55, 48, 57, 121, 124, 118, 111, 71, 121, 118, 124, 106, 119, 113, 124, 71, 121, 118, 106, 71, 124, 125, 108, 125, 123, 108, 119, 106, 71, 125, 118, 121, 122, 116, 125, Ascii.US, Ascii.SUB, Ascii.DLE, 9, 33, Ascii.US, Ascii.DLE, Ascii.SUB, Ascii.FF, 17, Ascii.ETB, Ascii.SUB, 33, Ascii.US, Ascii.DLE, Ascii.FF, 33, Ascii.SUB, Ascii.ESC, 10, Ascii.ESC, Ascii.GS, 10, 17, Ascii.FF, 33, 10, Ascii.ETB, 19, Ascii.ESC, 17, Ascii.VT, 10, 33, 19, Ascii.CR, 46, 43, 33, 56, Ascii.DLE, 46, 33, 43, 61, 32, 38, 43, Ascii.DLE, 45, 46, 33, 33, 42, 61, Ascii.DLE, 42, 55, 59, 61, 46, Ascii.DLE, 39, 38, 33, 59, 60, Ascii.DLE, 41, 38, 55, Ascii.DLE, 42, 33, 46, 45, 35, 42, 43, 62, 59, 49, 40, 0, 62, 49, 59, 45, 48, 54, 59, 0, 61, 51, 62, 60, 52, 51, 54, 44, 43, 58, 59, 0, 54, 49, 43, 58, 49, 43, 0, 42, 45, 51, 0, 47, 45, 58, 57, 54, 39, 58, 44, 112, 117, Ascii.DEL, 102, 78, 112, Ascii.DEL, 117, 99, 126, 120, 117, 78, 115, 125, 126, 114, 122, 78, 100, Ascii.DEL, 98, 112, 119, 116, 78, 97, 125, 112, 104, 112, 115, 125, 116, 78, 118, 112, 124, 116, 98, 78, 114, 112, 114, 121, 116, 33, 36, 46, 55, Ascii.US, 33, 46, 36, 50, 47, 41, 36, Ascii.US, 34, 57, 48, 33, 51, 51, Ascii.US, 48, 33, 35, 43, 33, 39, 37, Ascii.US, 36, 37, 52, 37, 35, 52, 41, 47, 46, Ascii.US, 38, 47, 50, Ascii.US, 36, 37, 37, 48, 44, 41, 46, 43, 51, 5, 0, 10, 19, 59, 5, 10, 0, Ascii.SYN, Ascii.VT, Ascii.CR, 0, 59, 7, 5, 7, Ascii.FF, 1, 59, 9, Ascii.VT, 0, 17, 8, 1, 59, 9, 5, Ascii.FS, 59, Ascii.ETB, Ascii.CR, Ascii.RS, 1, 115, 118, 124, 101, 77, 115, 124, 118, 96, 125, 123, 118, 77, 113, 115, 113, 122, 119, 77, Ascii.DEL, 125, 118, 103, 126, 119, 77, 96, 119, 102, 96, 107, 77, 126, 123, Ascii.DEL, 123, 102, Ascii.FS, Ascii.EM, 19, 10, 34, Ascii.FS, 19, Ascii.EM, Ascii.SI, Ascii.DC2, Ascii.DC4, Ascii.EM, 34, Ascii.RS, Ascii.FS, Ascii.SI, Ascii.DC2, 8, Ascii.SO, Ascii.CAN, 17, 34, 10, Ascii.NAK, Ascii.DC4, 9, Ascii.CAN, 34, Ascii.DC4, 19, 9, Ascii.CAN, Ascii.SI, Ascii.SO, 9, Ascii.DC4, 9, Ascii.DC4, Ascii.FS, 17, 69, 64, 74, 83, 123, 69, 74, 64, 86, 75, 77, 64, 123, 71, 75, 73, 84, 86, 65, 87, 87, 123, 77, 73, 69, 67, 65, 87, 123, 64, 81, 86, 77, 74, 67, 123, 64, 75, 83, 74, 72, 75, 69, 64, 97, 100, 110, 119, 95, 97, 110, 100, 114, 111, 105, 100, 95, 100, 101, 102, 97, 117, 108, 116, 95, 97, 115, 115, 101, 116, 95, 112, 114, 101, 108, 111, 97, 100, 95, 115, 105, 122, 101, 95, 98, 121, 116, 101, 115, 71, 66, 72, 81, 121, 71, 72, 66, 84, 73, 79, 66, 121, 66, 79, 85, 71, 68, 74, 67, 121, 86, 74, 71, 95, 71, 68, 74, 67, 121, 86, 84, 67, 69, 71, 69, 78, 67, 126, 123, 113, 104, 64, 126, 113, 123, 109, 112, 118, 123, 64, 123, 112, 64, 113, 112, 107, 64, 106, 108, 
        122, 64, 108, 107, 126, 107, 122, 64, 119, 126, 113, 123, 115, 122, 109, 125, 120, 114, 107, 67, 125, 114, 120, 110, 115, 117, 120, 67, 121, 114, 125, 126, 112, 121, 67, 114, 125, 104, 117, 106, 121, 67, 122, 105, 114, 114, 121, 112, 55, 50, 56, 33, 9, 55, 56, 50, 36, 57, 63, 50, 9, 51, 46, 57, 9, 38, 58, 55, 47, 51, 36, 9, 53, 55, 53, 62, 51, 9, 59, 55, 46, 9, 37, 63, 44, 51, 80, 85, 95, 70, 110, 80, 95, 85, 67, 94, 88, 85, 110, 87, 80, 88, 93, 110, 80, 85, 110, 93, 94, 80, 85, 110, 94, 95, 110, 85, 88, 66, 90, 110, 84, 67, 67, 94, 67, 66, Ascii.FF, 9, 3, Ascii.SUB, 50, Ascii.FF, 3, 9, Ascii.US, 2, 4, 9, 50, Ascii.VT, Ascii.FF, 4, 1, 50, 2, 3, 50, Ascii.SUB, 8, Ascii.SI, Ascii.ESC, 4, 8, Ascii.SUB, 50, 8, Ascii.US, Ascii.US, 2, Ascii.US, Ascii.RS, 120, 125, 119, 110, 70, 120, 119, 125, 107, 118, 112, 125, 70, Ascii.DEL, 118, 107, 122, 124, 70, 113, 120, 107, 125, 110, 120, 107, 124, 70, 120, 122, 122, 124, 117, 124, 107, 120, 109, 112, 118, 119, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 99, 98, 111, 110, 84, 125, 98, 111, 110, 100, 123, 121, 100, 108, 121, 110, 120, 120, 84, 106, 101, 98, 102, 106, Ascii.DEL, 98, 100, 101, 10, Ascii.SI, 5, Ascii.FS, 52, 10, 5, Ascii.SI, Ascii.EM, 4, 2, Ascii.SI, 52, 2, 6, 10, Ascii.FF, Ascii.SO, 52, 8, 10, 8, 3, Ascii.SO, 52, Ascii.CAN, Ascii.US, 4, Ascii.EM, Ascii.SO, 52, 9, Ascii.DC2, Ascii.US, Ascii.SO, 52, 8, 4, Ascii.RS, 5, Ascii.US, Ascii.NAK, Ascii.DLE, Ascii.SUB, 3, 43, Ascii.NAK, Ascii.SUB, Ascii.DLE, 6, Ascii.ESC, Ascii.GS, Ascii.DLE, 43, Ascii.EM, 17, Ascii.EM, Ascii.ESC, 6, Ascii.CR, 43, Ascii.ESC, 4, 0, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 102, 121, 104, 84, 98, 102, 123, 121, 110, 120, 120, 98, 100, 101, 84, 109, 100, 121, 84, 101, 106, Ascii.DEL, 98, 125, 110, 84, 125, 98, 111, 110, 100, 84, 106, 111, 120, 84, 125, 57, 43, 46, 36, 61, Ascii.NAK, 43, 36, 46, 56, 37, 35, 46, Ascii.NAK, 36, 43, 62, 35, 60, 47, Ascii.NAK, 41, 43, 56, 37, 63, 57, 47, 38, Ascii.NAK, 47, 50, 62, 47, 36, 57, 35, 37, 36, Ascii.NAK, 60, 43, 56, 35, 43, 36, 62, 71, 66, 72, 81, 121, 71, 72, 66, 84, 73, 79, 66, 121, 72, 71, 82, 79, 80, 67, 121, 72, 67, 81, 121, 69, 71, 84, 73, 83, 85, 67, 74, 121, 66, 67, 85, 79, 65, 72, 121, 124, 118, 111, 71, 121, 118, 124, 106, 119, 113, 124, 71, 118, 125, 108, 111, 119, 106, 115, 71, 124, 125, 126, 121, 109, 116, 108, 71, 123, 119, 118, 118, 125, 123, 108, 113, 119, 118, 71, 108, 113, 117, 125, 119, 109, 108, 71, 117, 107, 103, 98, 104, 113, 89, 103, 104, 98, 116, 105, 111, 98, 89, 104, 99, 114, 113, 105, 116, 109, 89, 98, 99, 96, 103, 115, 106, 114, 89, 116, 99, 103, 98, 89, 114, 111, 107, 99, 105, 115, 114, 89, 107, 117, 124, 121, 115, 106, 66, 124, 115, 121, 111, 114, 116, 121, 66, 115, 120, 105, 106, 114, 111, 118, 66, 121, 120, 123, 124, 104, 113, 105, 66, 111, 120, 105, 111, 116, 120, 110, 66, 115, 104, 112, 56, 61, 55, 46, 6, 56, 55, 61, 43, 54, 48, 61, 6, 55, 60, 45, 46, 54, 43, 50, 6, 61, 60, 63, 56, 44, 53, 45, 6, 45, 49, 43, 54, 45, 45, 53, 60, 6, 45, 48, 52, 60, 54, 44, 45, 6, 52, 42, 86, 83, 89, 64, 104, 86, 89, 83, 69, 88, 94, 83, 104, 89, 82, 67, 64, 88, 69, 92, 104, 83, 82, 81, 86, 66, 91, 67, 104, 67, 94, 90, 82, 88, 66, 67, 104, 90, 68, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 85, 78, 73, 86, 101, 95, 84, 91, 88, 86, 95, 94, 52, 49, 59, 34, 10, 52, 59, 49, 39, 58, 60, 49, 10, 39, 48, 56, 58, 35, 48, 10, 36, 32, 48, 39, 44, 10, 37, 52, 39, 33, 10, 51, 39, 58, 56, 10, 54, 52, 54, 61, 48, 10, 62, 48, 44, Ascii.SO, Ascii.VT, 1, Ascii.CAN, 48, Ascii.SO, 1, Ascii.VT, Ascii.GS, 0, 6, Ascii.VT, 48, Ascii.GS, 10, Ascii.US, 0, Ascii.GS, Ascii.ESC, 48, Ascii.US, Ascii.GS, 10, Ascii.FS, 10, 1, Ascii.ESC, Ascii.SO, Ascii.ESC, 6, 0, 1, 48, 10, Ascii.GS, Ascii.GS, 0, Ascii.GS, 48, Ascii.CAN, 7, 10, 1, 48, 1, 0, 48, 6, 2, Ascii.US, Ascii.GS, 10, Ascii.FS, Ascii.FS, 6, 0, 1, 109, 104, 98, 123, 83, 109, 98, 104, 126, 99, 101, 104, 83, 126, 105, 124, 99, 126, 120, 83, 124, 126, 105, Ascii.DEL, 105, 98, 120, 109, 120, 101, 99, 98, 83, 105, 126, 126, 99, 126, Ascii.DEL, 83, 101, 98, Ascii.DEL, 120, 105, 109, 104, 83, 99, 106, 83, 101, 98, 120, 105, 126, 98, 109, 96, 58, 63, 53, 44, 4, 58, 53, 63, 41, 52, 50, 63, 4, 40, 51, 52, 46, 55, 63, 4, 57, 55, 52, 56, 48, 4, 40, 34, 53, 56, 4, 52, 53, 4, 57, 58, 56, 48, 60, 41, 52, 46, 53, 63, 35, 38, 44, 53, Ascii.GS, 35, 44, 38, 48, 45, 43, 38, Ascii.GS, 49, 42, 45, 55, 46, 38, Ascii.GS, 42, 43, 38, 39, Ascii.GS, 46, 45, 35, 38, 39, 48, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 73, 82, 85, 79, 86, 94, 101, 83, 84, 83, 78, 101, 79, 84, 73, 81, 83, 74, 74, 91, 88, 86, 95, 101, 73, 95, 89, 85, 84, 94, 73, 101, 89, 85, 87, 74, 86, 95, 78, 95, 45, 40, 34, 59, 19, 45, 34, 40, 62, 35, 37, 40, 19, 63, 36, 35, 57, 32, 40, 19, 32, 45, 57, 
        34, 47, 36, 19, 60, 32, 45, 53, 19, 63, 56, 35, 62, 41, 19, 37, 34, 19, 35, 58, 41, 62, 32, 45, 53, 7, 2, 8, 17, 57, 7, 8, 2, Ascii.DC4, 9, Ascii.SI, 2, 57, Ascii.NAK, Ascii.SO, 9, 19, 10, 2, 57, Ascii.DC4, 3, Ascii.NAK, 3, Ascii.DC2, 57, 0, 9, 5, 19, Ascii.NAK, 57, 9, 8, 57, 8, 7, Ascii.DC2, Ascii.SI, Ascii.DLE, 3, 57, Ascii.DC4, 3, Ascii.SYN, 9, Ascii.DC4, Ascii.DC2, Ascii.SI, 8, 1, 41, 44, 38, 63, Ascii.ETB, 41, 38, 44, 58, 39, 33, 44, Ascii.ETB, 61, 42, 62, 58, 43, 114, 119, 125, 100, 76, 114, 125, 119, 97, 124, 122, 119, 76, 102, 96, 118, 76, 112, 114, 112, 123, 118, 76, 126, 124, 119, 102, Ascii.DEL, 118, 76, 117, 124, 97, 76, 122, 126, 114, 116, 118, 96, 122, Ascii.DEL, 117, 108, 68, 122, 117, Ascii.DEL, 105, 116, 114, Ascii.DEL, 68, 110, 104, 126, 68, 104, 111, 126, 122, 118, 114, 117, 124, 68, 114, 118, 122, 124, 126, 68, Ascii.DEL, 126, 120, 116, Ascii.DEL, 114, 117, 124, Ascii.NAK, Ascii.DLE, Ascii.SUB, 3, 43, Ascii.NAK, Ascii.SUB, Ascii.DLE, 6, Ascii.ESC, Ascii.GS, Ascii.DLE, 43, 3, Ascii.FS, Ascii.GS, 0, 17, Ascii.CAN, Ascii.GS, 7, 0, 17, Ascii.DLE, 43, Ascii.GS, Ascii.SUB, 0, 17, Ascii.SUB, 0, 43, 1, 6, Ascii.CAN, 43, 4, 6, 17, Ascii.DC2, Ascii.GS, Ascii.FF, 17, 7, 91, 94, 84, 77, 101, 91, 73, 73, 95, 78, 101, 92, 95, 78, 89, 82, 83, 84, 93, 101, 79, 84, 83, 92, 83, 95, 94, 51, 54, 60, 37, Ascii.CR, 48, 51, 60, 60, 55, 32, Ascii.CR, 60, 61, 38, 59, 52, 43, Ascii.CR, 51, 54, Ascii.CR, 62, 61, 51, 54, 55, 54, Ascii.CR, 61, 60, Ascii.CR, 51, 33, 33, 55, 38, 33, Ascii.CR, 62, 61, 51, 54, 55, 54, 35, 38, 44, 53, Ascii.GS, 32, 39, 44, 33, 42, 47, 35, 48, 41, Ascii.GS, 48, 39, 50, 45, 48, 54, Ascii.GS, 43, 44, 54, 39, 48, 52, 35, 46, Ascii.GS, 47, 49, Ascii.SUB, Ascii.US, Ascii.NAK, Ascii.FF, 36, Ascii.EM, Ascii.ETB, Ascii.DC4, Ascii.CAN, Ascii.DLE, 36, Ascii.ETB, Ascii.DC4, Ascii.CAN, Ascii.DLE, 8, Ascii.CAN, 9, Ascii.RS, Ascii.RS, Ascii.NAK, 66, 71, 77, 84, 124, 64, 79, 74, 64, 72, 80, 124, 80, 70, 64, 76, 77, 71, 124, 64, 75, 66, 77, 77, 70, 79, 124, 70, 77, 66, 65, 79, 70, 71, 52, 49, 59, 34, 10, 54, 39, 52, 38, 61, 10, 38, 61, 60, 48, 57, 49, 10, 48, 59, 52, 55, 57, 48, 49, 37, 32, 42, 51, Ascii.ESC, 39, 48, 37, Ascii.ESC, 37, 42, 45, 41, 37, 48, 45, 43, 42, Ascii.ESC, 32, 33, 40, 37, 61, Ascii.ESC, 41, 55, 89, 92, 86, 79, 103, 91, 76, 89, 103, 85, 81, 86, 103, 75, 91, 89, 84, 93, 103, 89, 86, 81, 85, 89, 76, 81, 87, 86, 103, 72, 93, 74, 91, 93, 86, 76, 89, 95, 93, 87, 82, 88, 65, 105, 82, 89, 105, 90, 83, 69, 69, 105, 69, 66, 68, 95, 85, 66, 105, 69, 83, 85, 89, 88, 82, 105, 85, 94, 87, 88, 88, 83, 90, 105, 95, 91, 70, 58, 63, 53, 44, 4, 62, 53, 58, 57, 55, 62, 4, 58, 46, 47, 52, 4, 63, 62, 40, 47, 41, 52, 34, 4, 55, 62, 58, 48, 40, 47, 42, 32, 57, 17, 43, 32, 47, 44, 34, 43, 17, 44, 39, 42, 42, 43, 60, 17, 58, 33, 37, 43, 32, 17, 39, 32, 40, 33, 10, Ascii.SI, 5, Ascii.FS, 52, Ascii.SO, 5, 10, 9, 7, Ascii.SO, 52, Ascii.SI, Ascii.SO, 9, Ascii.RS, Ascii.FF, 52, 4, Ascii.GS, Ascii.SO, Ascii.EM, 7, 10, Ascii.DC2, 65, 68, 78, 87, Ascii.DEL, 69, 78, 65, 66, 76, 69, Ascii.DEL, 69, 88, 79, 80, 76, 65, 89, 69, 82, Ascii.DEL, 67, 65, 67, 72, 69, 94, 91, 81, 72, 96, 90, 81, 94, 93, 83, 90, 96, 90, 71, 80, 79, 83, 94, 70, 90, 77, 96, 92, 94, 92, 87, 90, 96, 89, 80, 77, 96, 91, 76, 83, Ascii.CAN, Ascii.GS, Ascii.ETB, Ascii.SO, 38, Ascii.FS, Ascii.ETB, Ascii.CAN, Ascii.ESC, Ascii.NAK, Ascii.FS, 38, Ascii.FS, 1, Ascii.SYN, 9, Ascii.NAK, Ascii.CAN, 0, Ascii.FS, Ascii.VT, 38, Ascii.SI, 75, Ascii.CR, 8, 2, Ascii.ESC, 51, 9, 2, Ascii.CR, Ascii.SO, 0, 9, 51, 10, Ascii.EM, 2, 2, 9, 0, 77, 72, 66, 91, 115, 73, 66, 77, 78, 64, 73, 115, 69, 66, 64, 69, 66, 73, 115, 84, 115, 67, 89, 88, 115, 66, 67, 66, 115, 74, 89, 64, 64, 95, 79, 94, 73, 73, 66, 115, 67, 66, 115, 95, 72, 71, Ascii.ESC, Ascii.RS, Ascii.DC4, Ascii.CR, 37, Ascii.US, Ascii.DC4, Ascii.ESC, Ascii.CAN, Ascii.SYN, Ascii.US, 37, Ascii.DC4, Ascii.US, Ascii.SO, Ascii.CR, Ascii.NAK, 8, 17, 100, 97, 107, 114, 90, 96, 107, 100, 103, 105, 96, 90, 117, 119, 96, 105, 106, 100, 97, 79, 74, 64, 89, 113, 75, 64, 79, 76, 66, 75, 113, 92, 79, 73, 75, 113, 93, 70, 79, 69, 75, 96, 101, 111, 118, 94, 100, 111, 96, 99, 109, 100, 94, 114, 120, 111, 98, Ascii.SI, 10, 0, Ascii.EM, 49, Ascii.VT, Ascii.SYN, Ascii.RS, 1, Ascii.GS, Ascii.VT, 49, Ascii.CAN, 7, 10, Ascii.VT, 1, 49, Ascii.EM, Ascii.SI, Ascii.SUB, Ascii.CR, 6, 49, Ascii.SUB, 7, 3, Ascii.VT, Ascii.DC4, 17, Ascii.ESC, 2, 42, 19, Ascii.FS, Ascii.EM, 1, Ascii.DLE, 7, 42, Ascii.ETB, Ascii.FS, 17, 17, Ascii.FS, Ascii.ESC, Ascii.DC2, 42, 1, Ascii.SUB, Ascii.RS, Ascii.DLE, Ascii.ESC, 117, 112, 122, 99, 75, 114, 123, 102, 119, 113, 75, 112, 113, 98, 125, 119, 113, 75, 103, 119, 102, 113, 113, 122, 75, 117, 120, 99, 117, 109, 103, 75, 123, 122, 121, 124, 118, 111, 71, 113, 121, 122, 71, 123, 109, 107, 108, 119, 117, 71, 107, 123, 112, 125, 117, 121, 107, 71, 126, 113, 96, 71, 125, 118, 121, 122, 116, 125, 124, 123, 126, 116, 109, 69, 115, 119, 106, 105, 69, 105, Ascii.DEL, 121, 117, 116, 126, 69, 121, 114, 123, 116, 116, Ascii.DEL, 118, 69, Ascii.DEL, 116, 123, 120, 118, Ascii.DEL, 126, 43, 46, 36, 61, Ascii.NAK, 35, 36, 62, 47, 56, 57, 62, 35, 62, 35, 43, 38, Ascii.NAK, 36, 47, 61, Ascii.NAK, 35, 39, 43, 45, 47, Ascii.NAK, 46, 
        47, 57, 35, 45, 36, 56, 61, 55, 46, 6, 53, 54, 62, 6, 58, 42, 6, 58, 52, 41, 109, 104, 98, 123, 83, 96, 99, 107, 107, 101, 98, 107, 83, 105, 98, 104, 124, 99, 101, 98, 120, 83, 124, 126, 105, 106, 101, 116, 10, Ascii.SI, 5, Ascii.FS, 52, 5, 10, Ascii.US, 2, Ascii.GS, Ascii.SO, 52, 8, 10, Ascii.EM, 4, Ascii.RS, Ascii.CAN, Ascii.SO, 7, 52, 8, 4, 6, Ascii.ESC, 10, 8, Ascii.US, 52, Ascii.US, 3, Ascii.EM, Ascii.SO, Ascii.CAN, 3, 4, 7, Ascii.SI, 100, 97, 107, 114, 90, 107, 100, 113, 108, 115, 96, 90, 115, 108, 96, 114, 90, 118, 107, 100, 117, 118, 109, 106, 113, 90, 105, 106, 98, 98, 108, 107, 98, 90, 96, 107, 100, 103, 105, 96, 97, 0, 5, Ascii.SI, Ascii.SYN, 62, Ascii.SO, Ascii.SI, 5, 4, Ascii.ETB, 8, 2, 4, 62, 9, 8, Ascii.DC2, Ascii.NAK, Ascii.SO, 19, Ascii.CAN, 62, 5, 0, Ascii.NAK, 0, 62, 4, Ascii.SI, 0, 3, Ascii.CR, 4, 5, Ascii.ETB, Ascii.DC2, Ascii.CAN, 1, 41, Ascii.EM, 6, 19, Ascii.CAN, 41, Ascii.DLE, Ascii.DC4, 41, Ascii.ETB, 6, 6, 41, Ascii.ETB, Ascii.SUB, 1, Ascii.ETB, Ascii.SI, 5, 52, 49, 59, 34, 10, 37, 57, 52, 44, 52, 55, 57, 48, 10, 54, 57, 60, 54, 62, 10, 56, 52, 45, 10, 49, 48, 57, 52, 44, 10, 56, 38, 81, 84, 94, 71, 111, 64, 92, 81, 73, 81, 82, 92, 85, 111, 84, 89, 67, 81, 82, 92, 85, 111, 66, 85, 93, 95, 68, 85, 111, 95, 94, 111, 94, 85, 68, 71, 95, 66, 91, 111, 92, 95, 67, 67, 115, 118, 124, 101, 77, 98, 126, 115, 107, 115, 112, 126, 119, 97, 77, 126, 125, 117, 117, 123, 124, 117, 77, 119, 124, 115, 112, 126, 119, 118, 61, 56, 50, 43, 3, 44, 48, 61, 37, 61, 62, 48, 57, 47, 3, 50, 57, 43, 3, 56, 57, 47, 53, 59, 50, 71, 66, 72, 81, 121, 86, 74, 71, 95, 71, 68, 74, 67, 85, 121, 85, 78, 73, 81, 121, 67, 72, 66, 69, 71, 84, 66, 99, 102, 108, 117, 93, 114, 112, 103, 110, 109, 99, 102, 93, 107, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 93, 102, 123, 108, 99, 111, 107, 97, 93, 117, 103, 96, 116, 107, 103, 117, 58, 63, 53, 44, 4, 43, 41, 62, 55, 52, 58, 63, 4, 53, 58, 47, 50, 45, 62, 4, 63, 34, 53, 58, 54, 50, 56, 4, 44, 62, 57, 45, 50, 62, 44, 121, 124, 118, 111, 71, 104, 106, 125, 116, 119, 121, 124, 71, 106, 110, 71, 124, 97, 118, 121, 117, 113, 123, 71, 111, 125, 122, 110, 113, 125, 111, 34, 39, 45, 52, Ascii.FS, 51, 49, 38, 53, 38, 45, 55, Ascii.FS, 51, 47, 34, 58, 34, 33, 47, 38, Ascii.FS, 34, 54, 55, 44, Ascii.FS, 32, 47, 42, 32, 40, Ascii.EM, Ascii.FS, Ascii.SYN, Ascii.SI, 39, 8, Ascii.CR, 10, Ascii.US, Ascii.GS, 39, Ascii.ETB, Ascii.SYN, 39, 76, 73, 75, 39, 10, Ascii.GS, Ascii.VT, 8, Ascii.ETB, Ascii.SYN, Ascii.VT, Ascii.GS, 94, 91, 81, 72, 96, 77, 90, 92, 80, 82, 79, 74, 75, 90, 96, 93, 75, 96, 94, 89, 75, 90, 77, 96, 90, 71, 75, 77, 94, 76, 96, 92, 87, 94, 81, 88, 90, 44, 41, 35, 58, Ascii.DC2, 63, 59, Ascii.DC2, 47, 56, 43, 43, 40, 63, Ascii.DC2, 46, 37, 40, 46, 38, Ascii.DC2, 40, 35, 44, 47, 33, 40, 41, 32, 37, 47, 54, Ascii.RS, 51, 55, Ascii.RS, 49, 45, 32, 56, 35, 32, 34, 42, Ascii.RS, 34, 51, 32, 50, 41, Ascii.RS, 39, 32, 45, 45, 35, 32, 34, 42, 125, 120, 114, 107, 67, 111, 121, 114, 120, 117, 114, 123, 67, 122, 110, 121, 109, 105, 121, 114, Ascii.DEL, 101, 67, Ascii.DEL, 125, 108, 108, 117, 114, 123, 67, 125, 112, 112, 115, 107, 121, 120, 68, 65, 75, 82, 122, 86, 64, 81, 122, 81, 64, 93, 81, 122, 70, 74, 73, 74, 87, 122, 65, 92, 75, 68, 72, 76, 70, 68, 73, 73, 92, 34, 39, 45, 52, Ascii.FS, 48, 43, 44, 54, 47, 39, Ascii.FS, 34, 39, 39, Ascii.FS, 38, 59, 55, 38, 45, 48, 42, 44, 45, Ascii.FS, 55, 44, Ascii.FS, 51, 47, 34, 58, 34, 33, 47, 38, 48, 10, Ascii.SI, 5, Ascii.FS, 52, Ascii.CAN, 3, 4, Ascii.RS, 7, Ascii.SI, 52, 8, 7, Ascii.SO, 10, Ascii.EM, 52, Ascii.CR, Ascii.SO, 10, Ascii.US, Ascii.RS, Ascii.EM, Ascii.SO, 52, 8, 4, 5, Ascii.CR, 2, Ascii.FF, 52, 4, 5, 52, 8, Ascii.EM, 10, Ascii.CAN, 3, Ascii.SO, Ascii.CAN, 46, 43, 33, 56, Ascii.DLE, 60, 39, 32, 58, 35, 43, Ascii.DLE, 38, 40, 33, 32, 61, 42, Ascii.DLE, 43, 42, 60, 59, 61, 32, 54, Ascii.DLE, 44, 46, 35, 35, 1, 4, Ascii.SO, Ascii.ETB, 63, 19, 8, Ascii.SI, Ascii.NAK, Ascii.FF, 4, 63, 9, Ascii.SO, 3, Ascii.DC2, 5, Ascii.CR, 5, Ascii.SO, Ascii.DC4, 63, Ascii.DC2, 5, Ascii.DC4, Ascii.DC2, Ascii.EM, 63, 3, Ascii.SI, Ascii.NAK, Ascii.SO, Ascii.DC4, 5, Ascii.DC2, 63, Ascii.SI, Ascii.SO, 63, 5, Ascii.CR, Ascii.DLE, Ascii.DC4, Ascii.EM, 63, Ascii.DC2, 5, 19, Ascii.DLE, Ascii.SI, Ascii.SO, 19, 5, 52, 49, 59, 34, 10, 38, 61, 58, 32, 57, 49, 10, 60, 59, 60, 33, 10, 51, 39, 58, 56, 10, 54, 58, 59, 33, 48, 59, 33, 10, 37, 39, 58, 35, 60, 49, 48, 39, 76, 73, 67, 90, 114, 94, 69, 66, 88, 65, 73, 114, 68, 67, 68, 89, 114, 66, 67, 114, 78, 65, 76, 94, 94, 114, 65, 66, 76, 73, 68, 67, 74, Ascii.FF, 9, 3, Ascii.SUB, 50, Ascii.RS, 5, 2, Ascii.CAN, 1, 9, 50, 1, 2, 10, 50, Ascii.FF, Ascii.RS, Ascii.RS, 8, Ascii.EM, 50, Ascii.CAN, Ascii.US, 1, 79, 74, 64, 89, 113, 93, 70, 65, 91, 66, 74, 113, 94, 92, 75, 77, 65, 67, 94, 91, 90, 75, 113, 76, 71, 74, 74, 75, 92, 113, 90, 65, 69, 75, 64, 55, 50, 56, 33, 9, 37, 61, 63, 38, 9, 32, 63, 50, 51, 57, 9, 56, 57, 56, 9, 62, 55, 36, 50, 33, 55, 36, 51, 9, 55, 53, 53, 
        51, 58, 51, 36, 55, 34, 51, 50, 126, 123, 113, 104, 64, 108, 107, 126, 124, 116, 107, 109, 126, 124, 122, 64, 120, 109, 112, 106, 111, 118, 113, 120, 64, 122, 113, 126, 125, 115, 122, 123, 3, 6, Ascii.FF, Ascii.NAK, 61, 17, Ascii.ESC, Ascii.FF, 1, 61, 3, 4, Ascii.SYN, 7, Ascii.DLE, 61, 3, 6, 61, Ascii.SO, Ascii.CR, 3, 6, 121, 124, 118, 111, 71, 107, 97, 118, 123, 71, 125, 118, 124, 104, 119, 113, 118, 108, 71, 104, 106, 125, 126, 113, 96, 33, 36, 46, 55, Ascii.US, 52, 41, 45, 37, Ascii.US, 52, 47, Ascii.US, 55, 33, 41, 52, Ascii.US, 38, 47, 50, Ascii.US, 54, 41, 36, 37, 47, Ascii.US, 48, 44, 33, 57, Ascii.US, 45, 51, 104, 109, 103, 126, 86, 125, 96, 100, 108, 86, 125, 102, 86, 126, 104, 96, 125, 86, 111, 102, 123, 86, Ascii.DEL, 96, 109, 108, 102, 86, 121, 123, 108, 121, 104, 123, 108, 109, 86, 100, 122, 7, 2, 8, 17, 57, Ascii.DC2, Ascii.SI, Ascii.VT, 3, 9, 19, Ascii.DC2, 57, Ascii.DC4, 3, 17, 7, Ascii.DC4, 2, 3, 2, 57, Ascii.DLE, Ascii.SI, 2, 3, 9, 98, 103, 109, 116, 92, 119, 113, 106, 100, 100, 102, 113, 92, 109, 98, 119, 106, 117, 102, 92, 113, 102, 100, 106, 112, 119, 102, 113, 92, 117, 106, 102, 116, 92, 102, 113, 113, 108, 113, 92, 96, 98, 111, 111, 97, 98, 96, 104, 123, 126, 116, 109, 69, 111, 116, 115, 107, 111, Ascii.DEL, 69, 126, 120, 69, 116, 123, 119, Ascii.DEL, 69, 106, Ascii.DEL, 104, 69, 106, 104, 117, 121, Ascii.DEL, 105, 105, 35, 38, 44, 53, Ascii.GS, 55, 50, 38, 35, 54, 39, Ascii.GS, 39, 58, 54, 48, 35, Ascii.GS, 42, 43, 44, 54, 49, Ascii.GS, 36, 45, 48, Ascii.GS, 33, 42, 35, 43, 44, 43, 44, 37, 96, 101, 111, 118, 94, 116, 114, 100, 94, 96, 113, 113, 94, 101, 104, 102, 100, 114, 117, 94, 96, 113, 104, 106, 111, 101, 124, 84, 126, 120, 110, 84, 104, 106, 104, 99, 110, 111, 84, 110, 115, 110, 104, 126, Ascii.DEL, 100, 121, 84, 109, 100, 121, 84, 101, 110, Ascii.DEL, 124, 100, 121, 96, 69, 64, 74, 83, 123, 81, 87, 65, 123, 71, 69, 71, 76, 65, 64, 123, 65, 92, 65, 71, 81, 80, 75, 86, 123, 77, 74, 123, 71, 69, 71, 76, 65, 123, 73, 69, 74, 69, 67, 65, 86, 83, 86, 92, 69, 109, 71, 65, 87, 109, 64, 91, 66, 66, 94, 87, 109, 83, 92, 91, 95, 83, 70, 91, 93, 92, 115, 118, 124, 101, 77, 103, 97, 119, 77, 97, 119, 113, 103, 96, 119, 77, 103, 96, 123, 77, 98, 115, 96, 97, 119, 96, 125, 120, 114, 107, 67, 106, 117, 120, 121, 115, 67, 111, 121, Ascii.DEL, 115, 114, 120, 67, Ascii.DEL, 116, 125, 114, 114, 121, 112, 67, 121, 114, 125, 126, 112, 121, 120, 54, 34, 35, 56, 37, 56, 35, 54, 35, 50, 8, 51, 62, 36, 54, 53, 59, 50, 51, 72, 92, 93, 70, 91, 70, 93, 72, 93, 76, 118, 76, 71, 72, 75, 69, 76, 77, 48, 63, 58, 48, 56, 52, 38, 50, 33, 55, Ascii.FF, 39, 58, 62, 54, Ascii.FF, 62, 32, 55, 59, 57, 122, 50, 53, 55, 49, 54, 59, 59, 63, 122, 53, 48, 39, 122, Ascii.DC2, 17, Ascii.NAK, 0, 1, 6, 17, Ascii.VT, Ascii.ETB, Ascii.ESC, Ascii.SUB, Ascii.DC2, Ascii.GS, 19, 125, 121, 126, 121, 125, 101, 125, 79, 117, 124, 113, 96, 99, 117, 116, 79, 100, 121, 125, 117, 79, 113, 118, 100, 117, 98, 79, 121, 125, 96, 98, 117, 99, 99, 121, Ascii.DEL, 126, 17, 10, 19, 19, 49, 38, 48, 55, 49, 42, 32, 55, 38, 39, Ascii.FS, 39, 34, 55, 34, Ascii.FS, 51, 49, 44, 32, 38, 48, 48, 42, 45, 36, Ascii.FS, 32, 44, 46, 33, 42, 45, 34, 55, 42, 44, 45, 48, Ascii.CR, 10, Ascii.US, Ascii.GS, Ascii.NAK, 33, 10, Ascii.FF, Ascii.US, Ascii.GS, Ascii.ESC, 33, Ascii.CR, Ascii.US, 19, Ascii.SO, Ascii.DC2, Ascii.ESC, 33, Ascii.FF, Ascii.US, 10, Ascii.ESC, Ascii.SO, 17, Ascii.FS, Ascii.GS, Ascii.ETB, 39, Ascii.EM, Ascii.SYN, Ascii.FS, 39, Ascii.GS, Ascii.SYN, Ascii.FS, Ascii.ESC, Ascii.EM, 10, Ascii.FS, 39, Ascii.EM, Ascii.CR, Ascii.FF, Ascii.ETB, 10, Ascii.ETB, Ascii.FF, Ascii.EM, Ascii.FF, Ascii.GS, 93, 93, 93};
    }

    static {
        A0b();
        A04 = new String[0];
        A05 = new String[]{A0Q(86, 5, 14), A0Q(65, 9, 115), A0Q(74, 12, 88)};
    }

    public ID(Context context) {
        this.A00 = context.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A0Q(4543, 31, 122), context), 0);
    }

    public static float A00(Context context) {
        return A0P(context).A01(A0Q(2430, 39, 22), 0.98f);
    }

    private final float A01(String str, float f) {
        String string = this.A00.getString(str, String.valueOf(f));
        if (string != null) {
            try {
                String value = A0Q(4611, 4, 81);
                if (string.equals(value)) {
                    return f;
                }
                f = Float.parseFloat(string);
                return f;
            } catch (NumberFormatException unused) {
                return f;
            }
        }
        return f;
    }

    public static int A02(Context context) {
        return A0P(context).A2B(A0Q(417, 33, 88), 100);
    }

    public static int A03(Context context) {
        return A0P(context).A2B(A0Q(2290, 33, 108), 0);
    }

    public static int A04(Context context) {
        return A0P(context).A2B(A0Q(2403, 27, 106), -1);
    }

    public static int A05(Context context) {
        return A0P(context).A2B(A0Q(774, 37, 60), 3);
    }

    public static int A06(Context context) {
        return A0P(context).A2B(A0Q(4525, 18, 125), 0);
    }

    public static int A07(Context context) {
        return A0P(context).A2B(A0Q(IronSourceError.ERROR_NO_INTERNET_CONNECTION, 36, 80), w.Z);
    }

    public static int A08(Context context) {
        return A0P(context).A2B(A0Q(1442, 50, 54), 30000);
    }

    public static int A09(Context context) {
        return A0P(context).A2B(A0Q(1536, 40, 51), 3);
    }

    public static int A0A(Context context) {
        return A0P(context).A2B(A0Q(1492, 44, 40), 8000);
    }

    public static int A0B(Context context) {
        return A0P(context).A2B(A0Q(1576, 48, 119), 100);
    }

    public static int A0C(Context context) {
        return A0P(context).A2B(A0Q(1624, 39, 25), w.f22171t);
    }

    public static int A0D(Context context) {
        return A0P(context).A2B(A0Q(3048, 38, 69), 225);
    }

    public static int A0E(Context context) {
        return A0P(context).A2B(A0Q(1242, 41, 69), 3145728);
    }

    public static int A0F(Context context) {
        return A0P(context).A2B(A0Q(4574, 37, 62), -1);
    }

    public static int A0G(Context context) {
        return A0P(context).A2B(A0Q(3184, 32, 123), 2000);
    }

    public static int A0H(Context context) {
        return A0P(context).A2B(A0Q(371, 46, 43), -1);
    }

    public static int A0I(Context context) {
        return A0P(context).A2B(A0Q(4654, 23, 80), 0);
    }

    public static int A0J(Context context) {
        return A0P(context).A2B(A0Q(4088, 35, 110), w.Z);
    }

    public static int A0K(Context context) {
        return A0P(context).A2B(A0Q(4123, 39, 39), w.Z);
    }

    public static int A0L(Context context) {
        return A0P(context).A2B(A0Q(1357, 46, 100), 0);
    }

    public static long A0M(Context context) {
        return A0P(context).A2C(A0Q(740, 34, 74), 67108864L);
    }

    public static long A0N(Context context) {
        return A0P(context).A2C(A0Q(895, 45, 46), w.f22146c);
    }

    public static long A0O(Context context) {
        return A0P(context).A2C(A0Q(1048, 38, 120), 33554432L);
    }

    public static synchronized ID A0P(Context context) {
        ID id2;
        synchronized (ID.class) {
            if (A01 == null) {
                A01 = new ID(context);
            }
            id2 = A01;
        }
        return id2;
    }

    public static String A0R(Context context) {
        return A0P(context).A2D(A0Q(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN, 28, 34), A0Q(4705, 3, 4));
    }

    public static String A0S(Context context) {
        return A0P(context).A2D(A0Q(4063, 25, 54), A0Q(4705, 3, 4));
    }

    public static String A0T(Context context) {
        return A0P(context).A2D(A0Q(117, 52, 109), A0Q(1, 6, 36));
    }

    public static String A0U(Context context) {
        return A0P(context).A2D(A0Q(268, 51, 11), A0Q(24, 41, 29));
    }

    public static String A0V(Context context) {
        return A0P(context).A2D(A0Q(169, 53, 86), A0Q(7, 8, 63));
    }

    public static String A0W(Context context) {
        return A0P(context).A2D(A0Q(319, 52, 81), A0Q(15, 9, 110));
    }

    public static Set<String> A0X(Context context) {
        return A0P(context).A0a(A0Q(599, 44, 113), A04);
    }

    public static Set<String> A0Y(Context context) {
        return A0P(context).A0a(A0Q(4615, 39, 109), A05);
    }

    public static Set<String> A0Z(Context context) {
        return A0P(context).A0a(A0Q(2174, 44, 90), A04);
    }

    private Set<String> A0a(String str, String[] strArr) {
        JSONArray jSONArray;
        String jsonArrayString = A2D(str, null);
        try {
            if (jsonArrayString != null) {
                jSONArray = new JSONArray(jsonArrayString);
            } else {
                jSONArray = new JSONArray((Collection) Arrays.asList(strArr));
            }
            int length = jSONArray.length();
            LinkedHashSet linkedHashSet = new LinkedHashSet(length);
            for (int i10 = 0; i10 < length; i10++) {
                linkedHashSet.add(jSONArray.getString(i10));
            }
            return linkedHashSet;
        } catch (JSONException unused) {
            return new LinkedHashSet();
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void A0c(Context context) {
        A0P(context).A00.edit().clear().commit();
    }

    private void A0d(@Nullable String str, @Nullable String str2) throws JSONException {
        if (str == null || str.isEmpty() || str.equals(A0Q(91, 2, 121))) {
            return;
        }
        JSONObject json = new JSONObject(str);
        A0e(json, str2);
    }

    private void A0e(JSONObject jSONObject, @Nullable String str) throws JSONException {
        SharedPreferences.Editor edit = this.A00.edit();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.equals(A0Q(93, 24, 54))) {
                A0d(jSONObject.getString(next), next);
            } else {
                String str2 = next;
                if (str != null) {
                    str2 = str + A0Q(0, 1, 108) + str2;
                }
                edit.putString(str2, jSONObject.getString(next));
            }
        }
        edit.apply();
    }

    public static boolean A0f(Context context) {
        return A0P(context).A2D(A0Q(4677, 28, 86), A0Q(4488, 19, 121)).equals(A0Q(4507, 18, 7));
    }

    public static boolean A0g(Context context) {
        return A0P(context).A2G(A0Q(450, 38, 112), false);
    }

    public static boolean A0h(Context context) {
        return A0P(context).A2G(A0Q(IronSourceConstants.BN_INSTANCE_NOT_FOUND_IN_DESTROY, 37, 17), false);
    }

    public static boolean A0i(Context context) {
        return A0P(context).A2G(A0Q(556, 43, 97), true);
    }

    public static boolean A0j(Context context) {
        return A0P(context).A2G(A0Q(2537, 29, 96), true);
    }

    public static boolean A0k(Context context) {
        return A0P(context).A2G(A0Q(3315, 27, 8), false);
    }

    public static boolean A0l(Context context) {
        return A0P(context).A2G(A0Q(851, 44, 10), true);
    }

    public static boolean A0m(Context context) {
        return A0P(context).A2G(A0Q(2378, 25, 123), true);
    }

    public static boolean A0n(Context context) {
        return A0P(context).A2G(A0Q(3216, 44, 30), true);
    }

    public static boolean A0o(Context context) {
        return A0P(context).A2G(A0Q(978, 37, 49), true);
    }

    public static boolean A0p(Context context) {
        return A0P(context).A2G(A0Q(2507, 30, 117), false);
    }

    public static boolean A0q(Context context) {
        return A0P(context).A2G(A0Q(IronSourceError.ERROR_SESSION_KEY_ENCRYPTION_FAILURE, 33, 50), true);
    }

    public static boolean A0r(Context context) {
        return A0P(context).A2G(A0Q(2817, 28, 64), false);
    }

    public static boolean A0s(Context context) {
        return A0P(context).A2G(A0Q(1086, 40, 31), true);
    }

    public static boolean A0t(Context context) {
        return A0P(context).A2G(A0Q(1126, 35, 67), false);
    }

    public static boolean A0u(Context context) {
        return A0P(context).A2G(A0Q(2677, 18, 66), false);
    }

    public static boolean A0v(Context context) {
        return A0P(context).A2G(A0Q(2904, 35, 54), true);
    }

    public static boolean A0w(Context context) {
        return A0P(context).A2G(A0Q(488, 32, 54), false);
    }

    public static boolean A0x(Context context) {
        return A0P(context).A2G(A0Q(2845, 25, 91), false);
    }

    public static boolean A0y(Context context) {
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        ID A0P = A0P(context);
        String A0Q = A0Q(2566, 25, 69);
        if (A03[5].charAt(10) != 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "eVi9wsoxiKuO8fS3Ni664QsxmOwf4Hz";
        strArr[0] = "nOcXZ0DMfofG3U9htYbEeRQSfAelmGW";
        return A0P.A2G(A0Q, false);
    }

    public static boolean A0z(Context context) {
        return A0P(context).A2G(A0Q(3127, 34, 79), false);
    }

    public static boolean A10(Context context) {
        return A0P(context).A2G(A0Q(1283, 23, 90), false);
    }

    public static boolean A11(Context context) {
        return A0P(context).A2G(A0Q(3086, 41, 43), false);
    }

    public static boolean A12(Context context) {
        return A0P(context).A2G(A0Q(2779, 22, 0), false);
    }

    public static boolean A13(Context context) {
        return A0P(context).A2G(A0Q(3544, 28, 99), true);
    }

    public static boolean A14(Context context) {
        return A0P(context).A2G(A0Q(3572, 31, 111), true);
    }

    public static boolean A15(Context context) {
        return A0P(context).A2G(A0Q(4008, 32, 49), false);
    }

    public static boolean A16(Context context) {
        return A0P(context).A2G(A0Q(222, 46, 76), false);
    }

    public static boolean A17(Context context) {
        return A0P(context).A2G(A0Q(3005, 15, 119), false);
    }

    public static boolean A18(Context context) {
        return A0P(context).A2G(A0Q(2469, 38, 24), false);
    }

    public static boolean A19(Context context) {
        return A0P(context).A2G(A0Q(2741, 19, 84), true);
    }

    public static boolean A1A(Context context) {
        return A0P(context).A2G(A0Q(2245, 45, 124), false);
    }

    public static boolean A1B(Context context) {
        return A0P(context).A2G(A0Q(1663, 25, 20), true);
    }

    public static boolean A1C(Context context) {
        return A0P(context).A2G(A0Q(3342, 41, 44), true);
    }

    public static boolean A1D(Context context) {
        return A0P(context).A2G(A0Q(2760, 19, 43), true);
    }

    public static boolean A1E(Context context) {
        return A0P(context).A2G(A0Q(3383, 35, 117), true);
    }

    public static boolean A1F(Context context) {
        return A0P(context).A2G(A0Q(3418, 31, 54), true);
    }

    public static boolean A1G(Context context) {
        return A0P(context).A2G(A0Q(3449, 32, 109), true);
    }

    public static boolean A1H(Context context) {
        return A0P(context).A2G(A0Q(1688, 45, 123), true);
    }

    public static boolean A1I(Context context) {
        return A0P(context).A2G(A0Q(1733, 57, 65), false);
    }

    public static boolean A1J(Context context) {
        return A0P(context).A2G(A0Q(1790, 59, 34), true);
    }

    public static boolean A1K(Context context) {
        return A0P(context).A2G(A0Q(2939, 32, 52), false);
    }

    public static boolean A1L(Context context) {
        return A0P(context).A2G(A0Q(4455, 33, 50), false);
    }

    public static boolean A1M(Context context) {
        return A0P(context).A2G(A0Q(3603, 38, 50), true);
    }

    public static boolean A1N(Context context) {
        return A0P(context).A2G(A0Q(3672, 38, 109), true);
    }

    public static boolean A1O(Context context) {
        return A0P(context).A2G(A0Q(3161, 23, 88), true);
    }

    public static boolean A1P(Context context) {
        return A0P(context).A2G(A0Q(2323, 21, 85), false);
    }

    public static boolean A1Q(Context context) {
        return A0P(context).A2G(A0Q(1849, 44, 117), true);
    }

    public static boolean A1R(Context context) {
        return Build.VERSION.SDK_INT >= 16 && A0P(context).A2G(A0Q(643, 46, 63), false);
    }

    public static boolean A1S(Context context) {
        return A0P(context).A2G(A0Q(689, 51, 110), true);
    }

    public static boolean A1T(Context context) {
        return A0P(context).A2G(A0Q(3710, 43, 69), true);
    }

    public static boolean A1U(Context context) {
        return A0P(context).A2G(A0Q(940, 38, 8), false);
    }

    public static boolean A1V(Context context) {
        return A0P(context).A2G(A0Q(3260, 30, 60), true);
    }

    public static boolean A1W(Context context) {
        return A0P(context).A2G(A0Q(2218, 27, 20), false);
    }

    public static boolean A1X(Context context) {
        return A0P(context).A2G(A0Q(1306, 51, 37), false);
    }

    public static boolean A1Y(Context context) {
        return A0P(context).A2G(A0Q(1161, 40, 55), true);
    }

    public static boolean A1Z(Context context) {
        return A0P(context).A2G(A0Q(1893, 31, 108), false);
    }

    public static boolean A1a(Context context) {
        return A0P(context).A2G(A0Q(1201, 41, 37), false);
    }

    public static boolean A1b(Context context) {
        return A0P(context).A2G(A0Q(3753, 31, 97), false);
    }

    public static boolean A1c(Context context) {
        return A0P(context).A2G(A0Q(3784, 53, 78), false);
    }

    public static boolean A1d(Context context) {
        return A0P(context).A2G(A0Q(3837, 38, 123), true);
    }

    public static boolean A1e(Context context) {
        return A0P(context).A2G(A0Q(3875, 33, 3), false);
    }

    public static boolean A1f(Context context) {
        return A0P(context).A2G(A0Q(1924, 53, 20), false);
    }

    public static boolean A1g(Context context) {
        return A0P(context).A2G(A0Q(2870, 34, 58), false);
    }

    public static boolean A1h(Context context) {
        return A0P(context).A2G(A0Q(1977, 48, 98), false);
    }

    public static boolean A1i(Context context) {
        return A0P(context).A2G(A0Q(3908, 25, 67), false);
    }

    public static boolean A1j(Context context) {
        return A0P(context).A2G(A0Q(2344, 34, 13), false);
    }

    public static boolean A1k(Context context) {
        return A0P(context).A2G(A0Q(3933, 35, 0), false);
    }

    public static boolean A1l(Context context) {
        return A0P(context).A2G(A0Q(3481, 26, 86), false);
    }

    public static boolean A1m(Context context) {
        return A0P(context).A2G(A0Q(2025, 51, 72), true);
    }

    public static boolean A1n(Context context) {
        return A0P(context).A2G(A0Q(3641, 31, 11), false);
    }

    public static boolean A1o(Context context) {
        return A0P(context).A2G(A0Q(4040, 23, 76), true);
    }

    public static boolean A1p(Context context) {
        return A0P(context).A2G(A0Q(4162, 27, 72), false);
    }

    public static boolean A1q(Context context) {
        return A0P(context).A2G(A0Q(4268, 36, 108), false);
    }

    public static boolean A1r(Context context) {
        return A0P(context).A2G(A0Q(2695, 46, 2), true);
    }

    public static boolean A1s(Context context) {
        return A0P(context).A2G(A0Q(2971, 34, 100), false);
    }

    public static boolean A1t(Context context) {
        return A0P(context).A2G(A0Q(4404, 25, 28), false);
    }

    public static boolean A1u(Context context) {
        return A0P(context).A2G(A0Q(4237, 31, 52), false);
    }

    public static boolean A1v(Context context) {
        return A0P(context).A2G(A0Q(3968, 40, 120), true);
    }

    public static boolean A1w(Context context) {
        return A0P(context).A2G(A0Q(2801, 16, 47), true);
    }

    public static boolean A1x(Context context) {
        return A0P(context).A2G(A0Q(4189, 48, 45), false);
    }

    public static boolean A1y(Context context) {
        return A0P(context).A2G(A0Q(4304, 23, 47), true);
    }

    public static boolean A1z(Context context) {
        return A0P(context).A2G(A0Q(2076, 18, 102), false);
    }

    public static boolean A20(Context context) {
        return A0P(context).A2G(A0Q(2094, 40, 61), false);
    }

    public static boolean A21(Context context) {
        return A0P(context).A2G(A0Q(4327, 36, 37), false);
    }

    public static boolean A22(Context context) {
        return A0P(context).A2G(A0Q(4363, 41, 10), true);
    }

    public static boolean A23(Context context) {
        return A0P(context).A2G(A0Q(811, 40, 83), false);
    }

    public static boolean A24(Context context) {
        return A0P(context).A2G(A0Q(1403, 39, 8), false);
    }

    public static boolean A25(Context context) {
        return A0P(context).A2G(A0Q(3290, 25, 114), false);
    }

    public static boolean A26(Context context) {
        return A0P(context).A2G(A0Q(4429, 26, 60), true);
    }

    public static boolean A27(Context context) {
        return A0P(context).A2G(A0Q(2134, 40, 53), true);
    }

    public static boolean A28(Context context, boolean z10) {
        return A2A(context, z10) && A0P(context).A2G(A0Q(2591, 27, 14), false);
    }

    public static boolean A29(Context context, boolean z10) {
        return Build.VERSION.SDK_INT >= 21 && A28(context, z10) && A0P(context).A2G(A0Q(2618, 35, 17), true);
    }

    public static boolean A2A(Context context, boolean z10) {
        return z10 && Build.VERSION.SDK_INT >= 19 && A0P(context).A2G(A0Q(2653, 24, 87), false);
    }

    public final int A2B(String str, int i10) {
        String string = this.A00.getString(str, String.valueOf(i10));
        if (string != null) {
            try {
                String value = A0Q(4611, 4, 81);
                if (string.equals(value)) {
                    return i10;
                }
                i10 = Integer.parseInt(string);
                return i10;
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        return i10;
    }

    public final long A2C(String str, long j10) {
        String string = this.A00.getString(str, String.valueOf(j10));
        if (string != null) {
            try {
                String value = A0Q(4611, 4, 81);
                if (string.equals(value)) {
                    return j10;
                }
                j10 = Long.parseLong(string);
                return j10;
            } catch (NumberFormatException unused) {
                return j10;
            }
        }
        return j10;
    }

    public final String A2D(String str, String str2) {
        String string = this.A00.getString(str, str2);
        if (string == null) {
            return str2;
        }
        String value = A0Q(4611, 4, 81);
        return string.equals(value) ? str2 : string;
    }

    public final void A2E(@Nullable String str) throws JSONException {
        A0d(str, null);
    }

    public final void A2F(@Nullable JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        A0e(jSONObject, null);
    }

    public final boolean A2G(String str, boolean z10) {
        String string = this.A00.getString(str, String.valueOf(z10));
        if (string != null) {
            String value = A0Q(4611, 4, 81);
            boolean equals = string.equals(value);
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            A03[7] = "2ZyfpebDvRtNljKwQKDVcWpHPVLB6mST";
            return equals ? z10 : Boolean.parseBoolean(string);
        }
        return z10;
    }
}
