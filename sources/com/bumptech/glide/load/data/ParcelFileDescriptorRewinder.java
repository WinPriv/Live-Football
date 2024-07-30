package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    public final InternalRewinder f19754a;

    /* loaded from: classes.dex */
    public static final class InternalRewinder {

        /* renamed from: a, reason: collision with root package name */
        public final ParcelFileDescriptor f19755a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f19755a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            ParcelFileDescriptor parcelFileDescriptor = this.f19755a;
            try {
                Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return parcelFileDescriptor;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.e.a
        public final Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final e<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f19754a = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor a() throws IOException {
        return this.f19754a.rewind();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }
}
