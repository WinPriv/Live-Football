package com.google.android.gms.common.data;

import a3.k;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private T zac;

    public SingleRefDataBufferIterator(DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final T next() {
        if (hasNext()) {
            int i10 = this.zab + 1;
            this.zab = i10;
            if (i10 == 0) {
                T t10 = (T) Preconditions.checkNotNull(this.zaa.get(0));
                this.zac = t10;
                if (!(t10 instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(t10.getClass());
                    throw new IllegalStateException(k.m(new StringBuilder(valueOf.length() + 44), "DataBuffer reference of type ", valueOf, " is not movable"));
                }
            } else {
                ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
            }
            return this.zac;
        }
        int i11 = this.zab;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Cannot advance the iterator beyond ");
        sb2.append(i11);
        throw new NoSuchElementException(sb2.toString());
    }
}
