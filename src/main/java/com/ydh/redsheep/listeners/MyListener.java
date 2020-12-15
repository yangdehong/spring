package com.ydh.redsheep.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component  // 不用@Component的话，就得在启动类中使用springApplication.addListeners(new MyListener());
public class MyListener implements ApplicationListener<MyEvent> {

    /**
     * 内置的
     * 1、ContextRefreshedEvent    ApplicationContext 被初始化（所有的Bean被成功装载，
     * 所有Singleton TestBean 被预实例化，ApplicationContext容器已就绪可用）或刷新时，该事件被触发。
     * 这也可以在 ConfigurableApplicationContext接口中使用 refresh() 方法来发生。
     * 2、ContextStartedEvent	当使用 ConfigurableApplicationContext （ApplicationContext子接口）接口中的
     * start() 方法启动 ApplicationContext 时，该事件被触发。你可以调查你的数据库，或者你可以在接受到这个事件后重启任何停止的应用程序。
     * 3、ContextStoppedEvent	当使用 ConfigurableApplicationContext 接口中的 stop() 停止 ApplicationContext 时，
     * 发布这个事件。你可以在接受到这个事件后做必要的清理的工作。
     * 4、ContextClosedEvent	当使用 ConfigurableApplicationContext 接口中的 close() 方法关闭
     * ApplicationContext 时，该事件被发布。一个已关闭的上下文到达生命周期末端；它不能被刷新或重启。
     * 5、RequestHandledEvent	这是一个 web-specific 事件，告诉所有 bean HTTP 请求已经被服务。
     * 只能应用于使用DispatcherServlet的Web应用。在使用Spring作为前端的MVC控制器时，当Spring处理用户请求结束后，系统会自动触发该事件。
     * 6、ApplicationFailedEvent 启动失败
     * @param event
     */
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("listener="+event.getSource());
    }
}
