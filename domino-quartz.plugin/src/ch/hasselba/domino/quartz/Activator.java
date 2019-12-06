package ch.hasselba.domino.quartz;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

public class Activator implements BundleActivator {

	public static final String PLUGIN_ID = Activator.class.getPackage().getName();
	private static Scheduler quartzSchedulerInstance;
	
	public static Scheduler getInstance() throws SchedulerException 
    {
        if (quartzSchedulerInstance == null) 
        {
            Scheduler scheduler = new StdSchedulerFactory().getScheduler();
            scheduler.start();
            quartzSchedulerInstance = scheduler;
        }
        return quartzSchedulerInstance;
    }
	
	@Override
	public void start(BundleContext arg0) throws Exception {
		System.out.println( "Started.");
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		System.out.println( "Stopped.");
	}

}
