package com.onesignal;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: x, reason: collision with root package name */
    public static final Object f26600x = new Object();
    public static final HashMap<ComponentNameWithWakeful, WorkEnqueuer> y = new HashMap<>();

    /* renamed from: s, reason: collision with root package name */
    public JobServiceEngineImpl f26601s;

    /* renamed from: t, reason: collision with root package name */
    public WorkEnqueuer f26602t;

    /* renamed from: u, reason: collision with root package name */
    public CommandProcessor f26603u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f26604v = false;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList<CompatWorkItem> f26605w = new ArrayList<>();

    /* loaded from: classes2.dex */
    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        public CommandProcessor() {
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            GenericWorkItem remove;
            while (true) {
                JobIntentService jobIntentService = JobIntentService.this;
                JobServiceEngineImpl jobServiceEngineImpl = jobIntentService.f26601s;
                if (jobServiceEngineImpl == null || (remove = jobServiceEngineImpl.dequeueWork()) == null) {
                    synchronized (jobIntentService.f26605w) {
                        remove = jobIntentService.f26605w.size() > 0 ? jobIntentService.f26605w.remove(0) : null;
                    }
                }
                if (remove == null) {
                    return null;
                }
                JobIntentService.this.c(remove.getIntent());
                remove.complete();
            }
        }

        @Override // android.os.AsyncTask
        public void onCancelled(Void r12) {
            JobIntentService.this.d();
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r12) {
            JobIntentService.this.d();
        }
    }

    /* loaded from: classes2.dex */
    public interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    /* loaded from: classes2.dex */
    public static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        boolean mServiceProcessing;

        public CompatWorkEnqueuer(Context context, ComponentName componentName) {
            super(componentName);
            this.mContext = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.mLaunchWakeLock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.mRunWakeLock = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void enqueueWork(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.mComponentName);
            if (this.mContext.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.mLaunchingService) {
                        this.mLaunchingService = true;
                        if (!this.mServiceProcessing) {
                            this.mLaunchWakeLock.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void serviceProcessingFinished() {
            synchronized (this) {
                if (this.mServiceProcessing) {
                    if (this.mLaunchingService) {
                        this.mLaunchWakeLock.acquire(60000L);
                    }
                    this.mServiceProcessing = false;
                    this.mRunWakeLock.release();
                }
            }
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void serviceProcessingStarted() {
            synchronized (this) {
                if (!this.mServiceProcessing) {
                    this.mServiceProcessing = true;
                    this.mRunWakeLock.acquire(600000L);
                    this.mLaunchWakeLock.release();
                }
            }
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void serviceStartReceived() {
            synchronized (this) {
                this.mLaunchingService = false;
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class CompatWorkItem implements GenericWorkItem {
        final Intent mIntent;
        final int mStartId;

        public CompatWorkItem(Intent intent, int i10) {
            this.mIntent = intent;
            this.mStartId = i10;
        }

        @Override // com.onesignal.JobIntentService.GenericWorkItem
        public void complete() {
            JobIntentService.this.stopSelf(this.mStartId);
        }

        @Override // com.onesignal.JobIntentService.GenericWorkItem
        public Intent getIntent() {
            return this.mIntent;
        }
    }

    /* loaded from: classes2.dex */
    public static class ComponentNameWithWakeful {
        private ComponentName componentName;
        private boolean useWakefulService;

        public ComponentNameWithWakeful(ComponentName componentName, boolean z10) {
            this.componentName = componentName;
            this.useWakefulService = z10;
        }
    }

    /* loaded from: classes2.dex */
    public interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    /* loaded from: classes2.dex */
    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        static final boolean DEBUG = false;
        static final String TAG = "JobServiceEngineImpl";
        final Object mLock;
        JobParameters mParams;
        final JobIntentService mService;

        /* loaded from: classes2.dex */
        public final class WrapperWorkItem implements GenericWorkItem {
            final JobWorkItem mJobWork;

            public WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.mJobWork = jobWorkItem;
            }

            @Override // com.onesignal.JobIntentService.GenericWorkItem
            public void complete() {
                synchronized (JobServiceEngineImpl.this.mLock) {
                    JobParameters jobParameters = JobServiceEngineImpl.this.mParams;
                    if (jobParameters != null) {
                        try {
                            try {
                                jobParameters.completeWork(this.mJobWork);
                            } catch (IllegalArgumentException e10) {
                                Log.e(JobServiceEngineImpl.TAG, "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!", e10);
                            }
                        } catch (SecurityException e11) {
                            Log.e(JobServiceEngineImpl.TAG, "SecurityException: Failed to run mParams.completeWork(mJobWork)!", e11);
                        }
                    }
                }
            }

            @Override // com.onesignal.JobIntentService.GenericWorkItem
            public Intent getIntent() {
                Intent intent;
                intent = this.mJobWork.getIntent();
                return intent;
            }
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.mLock = new Object();
            this.mService = jobIntentService;
        }

        @Override // com.onesignal.JobIntentService.CompatJobEngine
        public IBinder compatGetBinder() {
            return getBinder();
        }

        @Override // com.onesignal.JobIntentService.CompatJobEngine
        public GenericWorkItem dequeueWork() {
            JobWorkItem dequeueWork;
            Intent intent;
            synchronized (this.mLock) {
                JobParameters jobParameters = this.mParams;
                if (jobParameters != null) {
                    try {
                        dequeueWork = jobParameters.dequeueWork();
                        if (dequeueWork != null) {
                            intent = dequeueWork.getIntent();
                            intent.setExtrasClassLoader(this.mService.getClassLoader());
                            return new WrapperWorkItem(dequeueWork);
                        }
                        return null;
                    } catch (SecurityException e10) {
                        Log.e(TAG, "Failed to run mParams.dequeueWork()!", e10);
                        return null;
                    }
                }
                return null;
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.mParams = jobParameters;
            this.mService.a(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            CommandProcessor commandProcessor = this.mService.f26603u;
            if (commandProcessor != null) {
                commandProcessor.cancel(false);
            }
            synchronized (this.mLock) {
                this.mParams = null;
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        public JobWorkEnqueuer(Context context, ComponentName componentName, int i10) {
            super(componentName);
            ensureJobId(i10);
            this.mJobInfo = new JobInfo.Builder(i10, this.mComponentName).setOverrideDeadline(0L).build();
            this.mJobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void enqueueWork(Intent intent) {
            this.mJobScheduler.enqueue(this.mJobInfo, new JobWorkItem(intent));
        }
    }

    public static WorkEnqueuer b(Context context, ComponentName componentName, boolean z10, int i10, boolean z11) {
        WorkEnqueuer compatWorkEnqueuer;
        ComponentNameWithWakeful componentNameWithWakeful = new ComponentNameWithWakeful(componentName, z11);
        HashMap<ComponentNameWithWakeful, WorkEnqueuer> hashMap = y;
        WorkEnqueuer workEnqueuer = hashMap.get(componentNameWithWakeful);
        if (workEnqueuer == null) {
            if (Build.VERSION.SDK_INT >= 26 && !z11) {
                if (z10) {
                    compatWorkEnqueuer = new JobWorkEnqueuer(context, componentName, i10);
                } else {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
            } else {
                compatWorkEnqueuer = new CompatWorkEnqueuer(context, componentName);
            }
            WorkEnqueuer workEnqueuer2 = compatWorkEnqueuer;
            hashMap.put(componentNameWithWakeful, workEnqueuer2);
            return workEnqueuer2;
        }
        return workEnqueuer;
    }

    public final void a(boolean z10) {
        if (this.f26603u == null) {
            this.f26603u = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.f26602t;
            if (workEnqueuer != null && z10) {
                workEnqueuer.serviceProcessingStarted();
            }
            this.f26603u.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void c(Intent intent);

    public final void d() {
        ArrayList<CompatWorkItem> arrayList = this.f26605w;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f26603u = null;
                ArrayList<CompatWorkItem> arrayList2 = this.f26605w;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    a(false);
                } else if (!this.f26604v) {
                    this.f26602t.serviceProcessingFinished();
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        JobServiceEngineImpl jobServiceEngineImpl = this.f26601s;
        if (jobServiceEngineImpl != null) {
            return jobServiceEngineImpl.compatGetBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f26601s = new JobServiceEngineImpl(this);
            this.f26602t = null;
        }
        this.f26602t = b(this, new ComponentName(this, getClass()), false, 0, true);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        CommandProcessor commandProcessor = this.f26603u;
        if (commandProcessor != null) {
            commandProcessor.cancel(false);
        }
        synchronized (this.f26605w) {
            this.f26604v = true;
            this.f26602t.serviceProcessingFinished();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        this.f26602t.serviceStartReceived();
        synchronized (this.f26605w) {
            ArrayList<CompatWorkItem> arrayList = this.f26605w;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i11));
            a(true);
        }
        return 3;
    }

    /* loaded from: classes2.dex */
    public static abstract class WorkEnqueuer {
        final ComponentName mComponentName;
        boolean mHasJobId;
        int mJobId;

        public WorkEnqueuer(ComponentName componentName) {
            this.mComponentName = componentName;
        }

        public abstract void enqueueWork(Intent intent);

        public void ensureJobId(int i10) {
            if (!this.mHasJobId) {
                this.mHasJobId = true;
                this.mJobId = i10;
            } else {
                if (this.mJobId == i10) {
                    return;
                }
                StringBuilder n10 = a3.k.n("Given job ID ", i10, " is different than previous ");
                n10.append(this.mJobId);
                throw new IllegalArgumentException(n10.toString());
            }
        }

        public void serviceProcessingFinished() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceStartReceived() {
        }
    }
}
