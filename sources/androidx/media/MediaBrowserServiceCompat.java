package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: s, reason: collision with root package name */
    public MediaBrowserServiceImplApi23 f2028s;

    /* renamed from: t, reason: collision with root package name */
    public final b f2029t = new b("android.media.session.MediaController", -1, -1, null);

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList<b> f2030u = new ArrayList<>();

    /* renamed from: v, reason: collision with root package name */
    public final q.b<IBinder, b> f2031v = new q.b<>();

    /* renamed from: w, reason: collision with root package name */
    public final i f2032w = new i(this);

    /* loaded from: classes.dex */
    public class MediaBrowserServiceImplApi21 implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f2033a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public MediaBrowserService f2034b;

        /* renamed from: c, reason: collision with root package name */
        public Messenger f2035c;

        /* loaded from: classes.dex */
        public class MediaBrowserServiceApi21 extends MediaBrowserService {
            public MediaBrowserServiceApi21(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
                attachBaseContext(mediaBrowserServiceCompat);
            }

            @Override // android.service.media.MediaBrowserService
            @SuppressLint({"SyntheticAccessor"})
            public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
                Bundle bundle2;
                Bundle bundle3;
                a aVar;
                MediaSessionCompat.a(bundle);
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                MediaBrowserServiceImplApi21 mediaBrowserServiceImplApi21 = MediaBrowserServiceImplApi21.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                int i11 = -1;
                if (bundle2 != null && bundle2.getInt("extra_client_version", 0) != 0) {
                    bundle2.remove("extra_client_version");
                    mediaBrowserServiceImplApi21.f2035c = new Messenger(mediaBrowserServiceCompat.f2032w);
                    bundle3 = new Bundle();
                    bundle3.putInt("extra_service_version", 2);
                    b0.i.b(bundle3, "extra_messenger", mediaBrowserServiceImplApi21.f2035c.getBinder());
                    mediaBrowserServiceImplApi21.f2033a.add(bundle3);
                    i11 = bundle2.getInt("extra_calling_pid", -1);
                    bundle2.remove("extra_calling_pid");
                } else {
                    bundle3 = null;
                }
                b bVar = new b(str, i11, i10, null);
                mediaBrowserServiceCompat.getClass();
                a a10 = mediaBrowserServiceCompat.a();
                if (a10 == null) {
                    aVar = null;
                } else {
                    if (mediaBrowserServiceImplApi21.f2035c != null) {
                        mediaBrowserServiceCompat.f2030u.add(bVar);
                    }
                    Bundle bundle4 = a10.f2042b;
                    if (bundle3 == null) {
                        bundle3 = bundle4;
                    } else if (bundle4 != null) {
                        bundle3.putAll(bundle4);
                    }
                    aVar = new a(bundle3, a10.f2041a);
                }
                if (aVar == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(aVar.f2041a, aVar.f2042b);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                MediaBrowserServiceImplApi21 mediaBrowserServiceImplApi21 = MediaBrowserServiceImplApi21.this;
                mediaBrowserServiceImplApi21.getClass();
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                b bVar = mediaBrowserServiceCompat.f2029t;
                mediaBrowserServiceCompat.b();
            }
        }

        public MediaBrowserServiceImplApi21() {
        }
    }

    /* loaded from: classes.dex */
    public class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 {

        /* loaded from: classes.dex */
        public class MediaBrowserServiceApi23 extends MediaBrowserServiceImplApi21.MediaBrowserServiceApi21 {
            public MediaBrowserServiceApi23(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
                super(mediaBrowserServiceCompat);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                e eVar = new e(result);
                b bVar = MediaBrowserServiceCompat.this.f2029t;
                eVar.a(null);
            }
        }

        public MediaBrowserServiceImplApi23() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.c
        public void a() {
            MediaBrowserServiceApi23 mediaBrowserServiceApi23 = new MediaBrowserServiceApi23(MediaBrowserServiceCompat.this);
            this.f2034b = mediaBrowserServiceApi23;
            mediaBrowserServiceApi23.onCreate();
        }
    }

    /* loaded from: classes.dex */
    public class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 {

        /* loaded from: classes.dex */
        public class MediaBrowserServiceApi26 extends MediaBrowserServiceImplApi23.MediaBrowserServiceApi23 {
            public MediaBrowserServiceApi26(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
                super(mediaBrowserServiceCompat);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                MediaBrowserServiceImplApi26 mediaBrowserServiceImplApi26 = MediaBrowserServiceImplApi26.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                b bVar = mediaBrowserServiceCompat.f2029t;
                mediaBrowserServiceCompat.b();
                MediaBrowserServiceCompat.this.getClass();
            }
        }

        public MediaBrowserServiceImplApi26() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media.MediaBrowserServiceCompat.c
        public final void a() {
            MediaBrowserServiceApi26 mediaBrowserServiceApi26 = new MediaBrowserServiceApi26(MediaBrowserServiceCompat.this);
            this.f2034b = mediaBrowserServiceApi26;
            mediaBrowserServiceApi26.onCreate();
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f2041a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f2042b;

        public a(Bundle bundle, String str) {
            if (str != null) {
                this.f2041a = str;
                this.f2042b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }
    }

    /* loaded from: classes.dex */
    public class b implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        public final String f2043a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2044b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2045c;

        /* renamed from: d, reason: collision with root package name */
        public final g f2046d;

        /* renamed from: e, reason: collision with root package name */
        public final HashMap<String, List<m0.c<IBinder, Bundle>>> f2047e = new HashMap<>();
        public a f;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                MediaBrowserServiceCompat.this.f2031v.remove(((h) bVar.f2046d).a());
            }
        }

        public b(String str, int i10, int i11, g gVar) {
            this.f2043a = str;
            this.f2044b = i10;
            this.f2045c = i11;
            if (str != null) {
                if (!TextUtils.isEmpty(str)) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        new j(str, i10, i11);
                    }
                    this.f2046d = gVar;
                    return;
                }
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            throw new NullPointerException("package shouldn't be null");
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            MediaBrowserServiceCompat.this.f2032w.post(new a());
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes.dex */
    public class d extends MediaBrowserServiceImplApi26 {
        public d(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            super();
        }
    }

    /* loaded from: classes.dex */
    public static class e<T> {

        /* renamed from: a, reason: collision with root package name */
        public final MediaBrowserService.Result f2050a;

        public e(MediaBrowserService.Result result) {
            this.f2050a = result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(T t10) {
            boolean z10 = t10 instanceof List;
            ArrayList arrayList = null;
            MediaBrowserService.Result result = this.f2050a;
            if (z10) {
                List<Parcel> list = (List) t10;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    for (Parcel parcel : list) {
                        parcel.setDataPosition(0);
                        arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                        parcel.recycle();
                    }
                }
                result.sendResult(arrayList);
                return;
            }
            if (t10 instanceof Parcel) {
                Parcel parcel2 = (Parcel) t10;
                parcel2.setDataPosition(0);
                result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
                return;
            }
            result.sendResult(null);
        }
    }

    /* loaded from: classes.dex */
    public class f {
        public f() {
        }
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public static class h implements g {

        /* renamed from: a, reason: collision with root package name */
        public final Messenger f2052a;

        public h(Messenger messenger) {
            this.f2052a = messenger;
        }

        public final IBinder a() {
            return this.f2052a.getBinder();
        }
    }

    /* loaded from: classes.dex */
    public final class i extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final f f2053a;

        public i(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f2053a = new f();
        }

        public final void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data = message.getData();
            int i10 = message.what;
            f fVar = this.f2053a;
            switch (i10) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    String string = data.getString("data_package_name");
                    int i11 = data.getInt("data_calling_pid");
                    int i12 = data.getInt("data_calling_uid");
                    h hVar = new h(message.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                    boolean z10 = false;
                    if (string == null) {
                        mediaBrowserServiceCompat.getClass();
                    } else {
                        String[] packagesForUid = mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i12);
                        int length = packagesForUid.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 < length) {
                                if (packagesForUid[i13].equals(string)) {
                                    z10 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                    }
                    if (z10) {
                        mediaBrowserServiceCompat.f2032w.a(new androidx.media.a(i11, i12, bundle, fVar, hVar, string));
                        return;
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i12 + " package=" + string);
                case 2:
                    MediaBrowserServiceCompat.this.f2032w.a(new androidx.media.b(fVar, new h(message.replyTo)));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    MediaBrowserServiceCompat.this.f2032w.a(new androidx.media.c(fVar, new h(message.replyTo), data.getString("data_media_item_id"), b0.i.a(data, "data_callback_token"), bundle2));
                    return;
                case 4:
                    MediaBrowserServiceCompat.this.f2032w.a(new androidx.media.d(fVar, new h(message.replyTo), data.getString("data_media_item_id"), b0.i.a(data, "data_callback_token")));
                    return;
                case 5:
                    String string2 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    h hVar2 = new h(message.replyTo);
                    fVar.getClass();
                    if (!TextUtils.isEmpty(string2) && resultReceiver != null) {
                        MediaBrowserServiceCompat.this.f2032w.a(new androidx.media.e(fVar, hVar2, string2, resultReceiver));
                        return;
                    }
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle3);
                    h hVar3 = new h(message.replyTo);
                    String string3 = data.getString("data_package_name");
                    MediaBrowserServiceCompat.this.f2032w.a(new androidx.media.f(data.getInt("data_calling_uid"), data.getInt("data_calling_pid"), bundle3, fVar, hVar3, string3));
                    return;
                case 7:
                    MediaBrowserServiceCompat.this.f2032w.a(new androidx.media.g(fVar, new h(message.replyTo)));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.a(bundle4);
                    String string4 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    h hVar4 = new h(message.replyTo);
                    fVar.getClass();
                    if (!TextUtils.isEmpty(string4) && resultReceiver2 != null) {
                        MediaBrowserServiceCompat.this.f2032w.a(new androidx.media.h(fVar, hVar4, string4, bundle4, resultReceiver2));
                        return;
                    }
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.a(bundle5);
                    String string5 = data.getString("data_custom_action");
                    ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    h hVar5 = new h(message.replyTo);
                    fVar.getClass();
                    if (!TextUtils.isEmpty(string5) && resultReceiver3 != null) {
                        MediaBrowserServiceCompat.this.f2032w.a(new androidx.media.i(fVar, hVar5, string5, bundle5, resultReceiver3));
                        return;
                    }
                    return;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    return;
            }
        }

        @Override // android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j10) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j10);
        }
    }

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    public abstract a a();

    public abstract void b();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f2028s.f2034b.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f2028s = new d(this);
        } else if (i10 >= 26) {
            this.f2028s = new MediaBrowserServiceImplApi26();
        } else {
            this.f2028s = new MediaBrowserServiceImplApi23();
        }
        this.f2028s.a();
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
