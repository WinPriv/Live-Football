package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* loaded from: classes.dex */
    public static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i10, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.b(bundle);
            }
            if (i10 == 0) {
                if (bundle != null) {
                    if (bundle.containsKey("media_item")) {
                        Parcelable parcelable = bundle.getParcelable("media_item");
                        if (parcelable != null && !(parcelable instanceof MediaItem)) {
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public final int f414s;

        /* renamed from: t, reason: collision with root package name */
        public final MediaDescriptionCompat f415t;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final MediaItem[] newArray(int i10) {
                return new MediaItem[i10];
            }
        }

        public MediaItem(Parcel parcel) {
            this.f414s = parcel.readInt();
            this.f415t = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaItem{mFlags=" + this.f414s + ", mDescription=" + this.f415t + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f414s);
            this.f415t.writeToParcel(parcel, i10);
        }
    }

    /* loaded from: classes.dex */
    public static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i10, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.b(bundle);
            }
            if (i10 == 0) {
                if (bundle != null) {
                    if (bundle.containsKey("search_results")) {
                        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                        parcelableArray.getClass();
                        ArrayList arrayList = new ArrayList(parcelableArray.length);
                        for (Parcelable parcelable : parcelableArray) {
                            arrayList.add((MediaItem) parcelable);
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }

    /* loaded from: classes.dex */
    public static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i10, Bundle bundle) {
        }
    }
}
