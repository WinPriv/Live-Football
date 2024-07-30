package com.google.android.gms.common.internal.safeparcel;

import a3.k;
import a3.l;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private SafeParcelReader() {
    }

    public static BigDecimal createBigDecimal(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + readSize);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static BigDecimal[] createBigDecimalArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i11] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return bigDecimalArr;
    }

    public static BigInteger createBigInteger(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + readSize);
        return new BigInteger(createByteArray);
    }

    public static BigInteger[] createBigIntegerArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            bigIntegerArr[i11] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return bigIntegerArr;
    }

    public static boolean[] createBooleanArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createBooleanArray;
    }

    public static ArrayList<Boolean> createBooleanList(Parcel parcel, int i10) {
        boolean z10;
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            arrayList.add(Boolean.valueOf(z10));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    public static Bundle createBundle(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + readSize);
        return readBundle;
    }

    public static byte[] createByteArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createByteArray;
    }

    public static byte[][] createByteArrayArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            bArr[i11] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + readSize);
        return bArr;
    }

    public static SparseArray<byte[]> createByteArraySparseArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<byte[]> sparseArray = new SparseArray<>(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static char[] createCharArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        char[] createCharArray = parcel.createCharArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createCharArray;
    }

    public static double[] createDoubleArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createDoubleArray;
    }

    public static ArrayList<Double> createDoubleList(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<Double> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    public static SparseArray<Double> createDoubleSparseArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseArray<Double> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            sparseArray.append(parcel.readInt(), Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static float[] createFloatArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createFloatArray;
    }

    public static ArrayList<Float> createFloatList(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    public static SparseArray<Float> createFloatSparseArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseArray<Float> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            sparseArray.append(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static IBinder[] createIBinderArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        IBinder[] createBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createBinderArray;
    }

    public static ArrayList<IBinder> createIBinderList(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<IBinder> createBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(dataPosition + readSize);
        return createBinderArrayList;
    }

    public static SparseArray<IBinder> createIBinderSparseArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<IBinder> sparseArray = new SparseArray<>(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static int[] createIntArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createIntArray;
    }

    public static ArrayList<Integer> createIntegerList(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    public static long[] createLongArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createLongArray;
    }

    public static ArrayList<Long> createLongList(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    public static Parcel createParcel(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, readSize);
        parcel.setDataPosition(dataPosition + readSize);
        return obtain;
    }

    public static Parcel[] createParcelArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i11] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i11] = null;
            }
        }
        parcel.setDataPosition(dataPosition + readSize);
        return parcelArr;
    }

    public static ArrayList<Parcel> createParcelList(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        ArrayList<Parcel> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < readInt; i11++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                arrayList.add(obtain);
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                arrayList.add(null);
            }
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    public static SparseArray<Parcel> createParcelSparseArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<Parcel> sparseArray = new SparseArray<>();
        for (int i11 = 0; i11 < readInt; i11++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            if (readInt3 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt3);
                sparseArray.append(readInt2, obtain);
                parcel.setDataPosition(dataPosition2 + readInt3);
            } else {
                sparseArray.append(readInt2, null);
            }
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static <T extends Parcelable> T createParcelable(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + readSize);
        return createFromParcel;
    }

    public static SparseBooleanArray createSparseBooleanArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseBooleanArray readSparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(dataPosition + readSize);
        return readSparseBooleanArray;
    }

    public static SparseIntArray createSparseIntArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseIntArray;
    }

    public static SparseLongArray createSparseLongArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseLongArray;
    }

    public static String createString(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + readSize);
        return readString;
    }

    public static String[] createStringArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createStringArray;
    }

    public static ArrayList<String> createStringList(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + readSize);
        return createStringArrayList;
    }

    public static SparseArray<String> createStringSparseArray(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseArray<String> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static <T> T[] createTypedArray(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + readSize);
        return tArr;
    }

    public static <T> ArrayList<T> createTypedList(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + readSize);
        return createTypedArrayList;
    }

    public static <T> SparseArray<T> createTypedSparseArray(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        T t10;
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<T> sparseArray = new SparseArray<>();
        for (int i11 = 0; i11 < readInt; i11++) {
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                t10 = creator.createFromParcel(parcel);
            } else {
                t10 = null;
            }
            sparseArray.append(readInt2, t10);
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static void ensureAtEnd(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
        } else {
            throw new ParseException(l.i("Overread allowed size end=", i10), parcel);
        }
    }

    public static int getFieldId(int i10) {
        return (char) i10;
    }

    public static boolean readBoolean(Parcel parcel, int i10) {
        zzb(parcel, i10, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Boolean readBooleanObject(Parcel parcel, int i10) {
        boolean z10;
        int readSize = readSize(parcel, i10);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i10, readSize, 4);
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static byte readByte(Parcel parcel, int i10) {
        zzb(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static char readChar(Parcel parcel, int i10) {
        zzb(parcel, i10, 4);
        return (char) parcel.readInt();
    }

    public static double readDouble(Parcel parcel, int i10) {
        zzb(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static Double readDoubleObject(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i10, readSize, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float readFloat(Parcel parcel, int i10) {
        zzb(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float readFloatObject(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i10, readSize, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int readHeader(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder readIBinder(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + readSize);
        return readStrongBinder;
    }

    public static int readInt(Parcel parcel, int i10) {
        zzb(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer readIntegerObject(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i10, readSize, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void readList(Parcel parcel, int i10, List list, ClassLoader classLoader) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + readSize);
    }

    public static long readLong(Parcel parcel, int i10) {
        zzb(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long readLongObject(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i10, readSize, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static PendingIntent readPendingIntent(Parcel parcel, int i10) {
        int readSize = readSize(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        PendingIntent readPendingIntentOrNullFromParcel = PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(dataPosition + readSize);
        return readPendingIntentOrNullFromParcel;
    }

    public static short readShort(Parcel parcel, int i10) {
        zzb(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    public static int readSize(Parcel parcel, int i10) {
        if ((i10 & (-65536)) != -65536) {
            return (char) (i10 >> 16);
        }
        return parcel.readInt();
    }

    public static void skipUnknownField(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + readSize(parcel, i10));
    }

    public static int validateObjectHeader(Parcel parcel) {
        int readHeader = readHeader(parcel);
        int readSize = readSize(parcel, readHeader);
        int dataPosition = parcel.dataPosition();
        if (getFieldId(readHeader) == 20293) {
            int i10 = readSize + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new ParseException(k.j("Size read is invalid start=", dataPosition, " end=", i10), parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readHeader))), parcel);
    }

    private static void zza(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        throw new ParseException(l.p(l.r("Expected size ", i12, " got ", i11, " (0x"), Integer.toHexString(i11), ")"), parcel);
    }

    private static void zzb(Parcel parcel, int i10, int i11) {
        int readSize = readSize(parcel, i10);
        if (readSize == i11) {
            return;
        }
        throw new ParseException(l.p(l.r("Expected size ", i11, " got ", readSize, " (0x"), Integer.toHexString(readSize), ")"), parcel);
    }
}
