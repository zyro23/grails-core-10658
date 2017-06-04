package myapp

import grails.core.GrailsApplication
import org.grails.spring.aop.autoproxy.GroovyAwareAspectJAwareAdvisorAutoProxyCreator

class BootStrap {

    GrailsApplication grailsApplication

    def init = { servletContext ->
        def autoProxyCreator = grailsApplication.mainContext.getBean("org.springframework.aop.config.internalAutoProxyCreator")
        assert autoProxyCreator in GroovyAwareAspectJAwareAdvisorAutoProxyCreator
        assert autoProxyCreator.proxyTargetClass
    }
    def destroy = {
    }
}
