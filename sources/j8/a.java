package j8;

/* compiled from: MessagingClientEvent.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f30154a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30155b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30156c;

    /* renamed from: d, reason: collision with root package name */
    public final b f30157d;

    /* renamed from: e, reason: collision with root package name */
    public final c f30158e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30159g;

    /* renamed from: i, reason: collision with root package name */
    public final int f30161i;

    /* renamed from: j, reason: collision with root package name */
    public final String f30162j;

    /* renamed from: l, reason: collision with root package name */
    public final EnumC0411a f30164l;

    /* renamed from: m, reason: collision with root package name */
    public final String f30165m;
    public final String o;

    /* renamed from: h, reason: collision with root package name */
    public final int f30160h = 0;

    /* renamed from: k, reason: collision with root package name */
    public final long f30163k = 0;

    /* renamed from: n, reason: collision with root package name */
    public final long f30166n = 0;

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: j8.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0411a implements y7.c {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        /* JADX INFO: Fake field, exist only in values array */
        MESSAGE_OPEN(2);


        /* renamed from: s, reason: collision with root package name */
        public final int f30169s;

        EnumC0411a(int i10) {
            this.f30169s = i10;
        }

        @Override // y7.c
        public final int k() {
            return this.f30169s;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: classes2.dex */
    public enum b implements y7.c {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(0),
        DATA_MESSAGE(1),
        /* JADX INFO: Fake field, exist only in values array */
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: s, reason: collision with root package name */
        public final int f30173s;

        b(int i10) {
            this.f30173s = i10;
        }

        @Override // y7.c
        public final int k() {
            return this.f30173s;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: classes2.dex */
    public enum c implements y7.c {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_OS(0),
        ANDROID(1),
        /* JADX INFO: Fake field, exist only in values array */
        IOS(2),
        /* JADX INFO: Fake field, exist only in values array */
        WEB(3);


        /* renamed from: s, reason: collision with root package name */
        public final int f30176s;

        c(int i10) {
            this.f30176s = i10;
        }

        @Override // y7.c
        public final int k() {
            return this.f30176s;
        }
    }

    public a(long j10, String str, String str2, b bVar, c cVar, String str3, String str4, int i10, String str5, EnumC0411a enumC0411a, String str6, String str7) {
        this.f30154a = j10;
        this.f30155b = str;
        this.f30156c = str2;
        this.f30157d = bVar;
        this.f30158e = cVar;
        this.f = str3;
        this.f30159g = str4;
        this.f30161i = i10;
        this.f30162j = str5;
        this.f30164l = enumC0411a;
        this.f30165m = str6;
        this.o = str7;
    }
}
