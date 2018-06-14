package io.renren.config;

import io.renren.modules.sys.oauth2.OAuth2Filter;
import io.renren.modules.sys.oauth2.OAuth2Realm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Shiro配置
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-04-20 18:33
 */
@Configuration
public class ShiroConfig {

    @Bean("sessionManager")
    public SessionManager sessionManager(){
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        sessionManager.setSessionValidationSchedulerEnabled(true);
        sessionManager.setSessionIdCookieEnabled(true);
        return sessionManager;
    }

    @Bean("securityManager")
    public SecurityManager securityManager(OAuth2Realm oAuth2Realm, SessionManager sessionManager) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(oAuth2Realm);
        securityManager.setSessionManager(sessionManager);

        return securityManager;
    }

    @Bean("shiroFilter")
    public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
        shiroFilter.setSecurityManager(securityManager);

        //oauth过滤
        Map<String, Filter> filters = new HashMap<>();
        filters.put("oauth2", new OAuth2Filter());
        shiroFilter.setFilters(filters);

        Map<String, String> filterMap = new LinkedHashMap<>();
        filterMap.put("/webjars/**", "anon");
        filterMap.put("/druid/**", "anon");
        filterMap.put("/app/**", "anon");
        filterMap.put("/sys/login", "anon");
        filterMap.put("/swagger/**", "anon");
        filterMap.put("/v2/api-docs", "anon");
        filterMap.put("/swagger-ui.html", "anon");
        filterMap.put("/swagger-resources/**", "anon");
        filterMap.put("/captcha.jpg", "anon");
        filterMap.put("/Administrator/**", "anon");
        filterMap.put("/BadmintonCourts/**", "anon");
        filterMap.put("/BadmintonSites/**", "anon");
        filterMap.put("/Classes/**", "anon");
        filterMap.put("/ClassType/**", "anon");
        filterMap.put("/Coachs/**", "anon");
        filterMap.put("/CoachWorkInterval/**", "anon");
        filterMap.put("/Commodity/**", "anon");
        filterMap.put("/Company/**", "anon");
        filterMap.put("/SelectClass/**", "anon");
        filterMap.put("/SignInForClass/**", "anon");
        filterMap.put("/StudentAccount/**", "anon");
        filterMap.put("/StudentIntegralAccount/**", "anon");
        filterMap.put("/Students/**", "anon");
        filterMap.put("/TeachingTime/**", "anon");
        filterMap.put("/Training/**", "anon");
        filterMap.put("/Week/**", "anon");
        filterMap.put("/StudentUpdate/**", "anon");
        filterMap.put("/AccountCR/**", "anon");
        filterMap.put("/JTClass/**", "anon");
        filterMap.put("/wechat/**", "anon");
        filterMap.put("/CountTime/**", "anon");
        filterMap.put("/StudentCF/**", "anon");
        filterMap.put("/CoachLeave/**", "anon");
        filterMap.put("/choiceClassStatus/**", "anon");
        filterMap.put("/commentFinal/**", "anon");
        filterMap.put("/TodayClass/**", "anon");
        filterMap.put("/QDclass/**", "anon");
        filterMap.put("/studentWeekShiduanInfo/**", "anon");
        filterMap.put("/QDdetail/**", "anon");
        filterMap.put("/Today/**", "anon");
        filterMap.put("/**", "oauth2");
        shiroFilter.setFilterChainDefinitionMap(filterMap);

        return shiroFilter;
    }

    @Bean("lifecycleBeanPostProcessor")
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator proxyCreator = new DefaultAdvisorAutoProxyCreator();
        proxyCreator.setProxyTargetClass(true);
        return proxyCreator;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }

}
