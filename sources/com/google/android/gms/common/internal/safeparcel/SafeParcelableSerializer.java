package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.common.zzag;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.nodes.Element;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public final class SafeParcelableSerializer {
    private SafeParcelableSerializer() {
    }

    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromBytes(byte[] bArr, Parcelable.Creator<T> creator) {
        Preconditions.checkNotNull(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromIntentExtra(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) deserializeFromBytes(byteArrayExtra, creator);
    }

    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromString(String str, Parcelable.Creator<T> creator) {
        return (T) deserializeFromBytes(Base64Utils.decodeUrlSafe(str), creator);
    }

    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundle(Bundle bundle, String str, Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        Element.b bVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            bVar.add(deserializeFromBytes((byte[]) arrayList.get(i10), creator));
        }
        return bVar;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundleSafe(Bundle bundle, String str, Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(bundle.getByteArray(str), creator);
    }

    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBytes(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, length);
        obtain.setDataPosition(0);
        try {
            ArrayList<T> arrayList = new ArrayList<>();
            obtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            obtain.recycle();
        }
    }

    @KeepForSdk
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtra(Intent intent, String str, Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        Element.b bVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            bVar.add(deserializeFromBytes((byte[]) arrayList.get(i10), creator));
        }
        return bVar;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtraSafe(Intent intent, String str, Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(intent.getByteArrayExtra(str), creator);
    }

    @Deprecated
    public static <T extends SafeParcelable> void serializeIterableToBundle(Iterable<T> iterable, Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        bundle.putSerializable(str, arrayList);
    }

    public static <T extends SafeParcelable> void serializeIterableToBundleSafe(Iterable<T> iterable, Bundle bundle, String str) {
        bundle.putByteArray(str, zza(iterable));
    }

    @KeepForSdk
    @Deprecated
    public static <T extends SafeParcelable> void serializeIterableToIntentExtra(Iterable<T> iterable, Intent intent, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void serializeIterableToIntentExtraSafe(Iterable<T> iterable, Intent intent, String str) {
        intent.putExtra(str, zza(iterable));
    }

    @KeepForSdk
    public static <T extends SafeParcelable> byte[] serializeToBytes(T t10) {
        Parcel obtain = Parcel.obtain();
        t10.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void serializeToIntentExtra(T t10, Intent intent, String str) {
        intent.putExtra(str, serializeToBytes(t10));
    }

    @KeepForSdk
    public static <T extends SafeParcelable> String serializeToString(T t10) {
        return Base64Utils.encodeUrlSafe(serializeToBytes(t10));
    }

    private static byte[] zza(Iterable iterable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeTypedList(zzag.zzj(iterable));
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}
